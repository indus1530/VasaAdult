package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4001a4014Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4001 extends AppCompatActivity {

    A4001a4014Binding bi;

    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bi.A4005.getText().hashCode() == s.hashCode()) {
                if (bi.A4005.getText().toString().trim().length() > 0 && Integer.parseInt(bi.A4005.getText().toString().trim()) > 7) {
                    bi.A4006.clearCheck();
                    bi.A4006cv.setVisibility(View.GONE);
                } else {
                    bi.A4006cv.setVisibility(View.VISIBLE);
                }
            }

            if (bi.A4011.getText().hashCode() == s.hashCode()) {
                if (bi.A4011.getText().toString().trim().length() > 0 && Integer.parseInt(bi.A4011.getText().toString().trim()) >= 1) {
                    bi.A4012cv.setVisibility(View.GONE);
                } else {
                    bi.A4012cv.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4001);
        bi.setCallback(this);
        //this.setTitle("Quality of Care 06");
        setupViews();

    }


    private void setupViews() {

        bi.A4003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A4003a.getId()) {
                    bi.A4004cv.setVisibility(View.VISIBLE);
                    bi.A4005cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A4004cv);
                    bi.A4004cv.setVisibility(View.GONE);
                    bi.A4005cv.setVisibility(View.GONE);
                }

            }

        });

        bi.A4004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A4004a.getId() || checkedId == bi.A4004b.getId() || checkedId == bi.A4004c.getId()) {
                    bi.A4005cv.setVisibility(View.VISIBLE);
                } else {
                    bi.A4005cv.setVisibility(View.GONE);
                }

            }

        });


        /*bi.A4007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bi.A4007b.getId()) {
                    bi.A40071cv.setVisibility(View.VISIBLE);
                } else {
                    bi.A40071cv.setVisibility(View.GONE);
                }

            }

        });*/


        bi.A4009a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A4009aa.getId()) {
                    bi.A4010cv.setVisibility(View.VISIBLE);
                    bi.A4011cv.setVisibility(View.VISIBLE);
                    bi.A4012cv.setVisibility(View.VISIBLE);
                } else {
                    bi.A4010.clearCheck();
                    bi.A4010cv.setVisibility(View.GONE);
                    bi.A4011cv.setVisibility(View.GONE);
                    bi.A4012cv.setVisibility(View.GONE);
                }

            }

        });

        bi.A4010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A4010b.getId() || checkedId == bi.A4010c.getId() || checkedId == bi.A4010d.getId()) {
                    ClearAllcontrol.ClearAllC(bi.A4011cv);
                    bi.A4011cv.setVisibility(View.GONE);
                    bi.A4012cv.setVisibility(View.VISIBLE);
                } else if (checkedId == bi.A40109.getId() || checkedId == bi.A40108.getId()) {
                    ClearAllcontrol.ClearAllC(bi.A4011cv);
                    ClearAllcontrol.ClearAllC(bi.A4012cv);
                    bi.A4011cv.setVisibility(View.GONE);
                    bi.A4012cv.setVisibility(View.GONE);
                } else {
                    bi.A4011cv.setVisibility(View.VISIBLE);
                    bi.A4012cv.setVisibility(View.VISIBLE);
                }

            }

        });

        bi.A4013u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bi.A4013dcv);
                ClearAllcontrol.ClearAllC(bi.A4013mcv);
                ClearAllcontrol.ClearAllC(bi.A4013ycv);

                bi.A4013dcv.setVisibility(View.GONE);
                bi.A4013mcv.setVisibility(View.GONE);
                bi.A4013ycv.setVisibility(View.GONE);

                if (checkedId == bi.A4013ua.getId()) {
                    bi.A4013dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bi.A4013ub.getId()) {
                    bi.A4013mcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bi.A4013uc.getId()) {
                    bi.A4013ycv.setVisibility(View.VISIBLE);
                }

            }

        });

    }

    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting 7th Section", Toast.LENGTH_SHORT).show();
                //MainApp.endActivity(this, this, A4001.class, true, HomeActivity.fc);

                Intent c2 = new Intent(A4001.this, A4051.class);
                startActivity(c2);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this, EndingActivity.class, false, RSDInfoActivity.fc);

    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4001", bi.A4001.getText().toString().trim().length() > 0 ? bi.A4001.getText().toString() : "0");

        json.put("A4002", bi.A4002a.isChecked() ? "1"
                : bi.A4002b.isChecked() ? "2"
                : bi.A4002c.isChecked() ? "3"
                : bi.A4002d.isChecked() ? "4"
                : bi.A4002e.isChecked() ? "5"
                : bi.A4002f.isChecked() ? "6"
                : bi.A40029.isChecked() ? "99"
                : bi.A40028.isChecked() ? "88"
                : "0");

        json.put("A4003", bi.A4003a.isChecked() ? "1"
                : bi.A4003b.isChecked() ? "2"
                : bi.A40039.isChecked() ? "99"
                : bi.A40038.isChecked() ? "88"
                : "0");

        json.put("A4004", bi.A4004a.isChecked() ? "1"
                : bi.A4004b.isChecked() ? "2"
                : bi.A4004c.isChecked() ? "3"
                : bi.A40049.isChecked() ? "99"
                : bi.A40048.isChecked() ? "88"
                : "0");

        json.put("A4005", bi.A4005.getText().toString().trim().length() > 0 ? bi.A4005.getText().toString() : "0");

        json.put("A4006", bi.A4006a.isChecked() ? "1"
                : bi.A4006b.isChecked() ? "2"
                : bi.A40069.isChecked() ? "99"
                : bi.A40068.isChecked() ? "88"
                : "0");

        json.put("A4007", bi.A4007a.isChecked() ? "1"
                : bi.A4007b.isChecked() ? "2"
                : bi.A4007c.isChecked() ? "3"
                : bi.A4007d.isChecked() ? "4"
                : bi.A4007e.isChecked() ? "5"
                : bi.A4007f.isChecked() ? "6"
                : bi.A40079.isChecked() ? "99"
                : bi.A40078.isChecked() ? "88"
                : "0");

        json.put("A40071", bi.A40071.getText().toString().trim().length() > 0 ? bi.A40071.getText().toString() : "0");

        json.put("A4008", bi.A4008a.isChecked() ? "1"
                : bi.A4008b.isChecked() ? "2"
                : bi.A40089.isChecked() ? "99"
                : bi.A40088.isChecked() ? "88"
                : "0");

        json.put("A4009a", bi.A4009aa.isChecked() ? "1"
                : bi.A4009ab.isChecked() ? "2"
                : bi.A4009a9.isChecked() ? "99"
                : bi.A4009a8.isChecked() ? "88"
                : "0");

        json.put("A4010", bi.A4010a.isChecked() ? "1"
                : bi.A4010b.isChecked() ? "2"
                : bi.A4010c.isChecked() ? "3"
                : bi.A4010d.isChecked() ? "4"
                : bi.A40109.isChecked() ? "99"
                : bi.A40108.isChecked() ? "88"
                : "0");

        json.put("A4011", bi.A4011.getText().toString().trim().length() > 0 ? bi.A4011.getText().toString() : "0");

        json.put("A4012", bi.A4012.getText().toString().trim().length() > 0 ? bi.A4012.getText().toString() : "0");

        json.put("A4013u", bi.A4013ua.isChecked() ? "1"
                : bi.A4013ub.isChecked() ? "2"
                : bi.A4013uc.isChecked() ? "3"
                : bi.A4013u9.isChecked() ? "99"
                : bi.A4013u8.isChecked() ? "88"
                : "0");

        json.put("A4013d", bi.A4013d.getText().toString().trim().length() > 0 ? bi.A4013d.getText().toString() : "0");

        json.put("A4013m", bi.A4013m.getText().toString().trim().length() > 0 ? bi.A4013m.getText().toString() : "0");

        json.put("A4013y", bi.A4013y.getText().toString().trim().length() > 0 ? bi.A4013y.getText().toString() : "0");

        json.put("A4014", bi.A4014a.isChecked() ? "1"
                : bi.A4014b.isChecked() ? "2"
                : bi.A40149.isChecked() ? "99"
                : "0");

        fc.setSqoc6(String.valueOf(json));

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bi.llA4001A4014) == false) {
            return false;
        }

        return Gothrough.IamHiden(bi.llA4001A4014) != false;
    }

}




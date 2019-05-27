package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4001a4014Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4001_A4014 extends AppCompatActivity {

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
        bi = DataBindingUtil.setContentView(this, R.layout.a4001a4014);
        bi.setCallback(this);
        //this.setTitle("Quality of Care 06");


    }


    private void setupViews() {

        bi.A4003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A4003a.getId()) {
                    //ClearAllcontrol.ClearAll(bi.A4004cv);
                    bi.A4004cv.setVisibility(View.VISIBLE);
                    bi.A4005cv.setVisibility(View.VISIBLE);
                } else {
                    bi.A4004.clearCheck();
                    bi.A4004cv.setVisibility(View.GONE);
                    bi.A4005cv.setVisibility(View.GONE);
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
                //MainApp.endActivity(this, this, A4001_A4014.class, true, HomeActivity.fc);

                Intent c2 = new Intent(A4001_A4014.this, com.example.abdulsajid.vasaadult.A4051_A4066.class);
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

    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getId() == R.id.A4003a
                || compoundButton.getId() == R.id.A4003b
                || compoundButton.getId() == R.id.A40039
                || compoundButton.getId() == R.id.A40038) {
            if (bi.A4003b.isChecked() || bi.A40039.isChecked() || bi.A40038.isChecked()) {
                bi.llA4004.setVisibility(View.GONE);
                bi.llA4005.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(bi.llA4004);
                ClearAllcontrol.ClearAll(bi.llA4005);
            } else {
                bi.llA4004.setVisibility(View.VISIBLE);
                bi.llA4005.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4004a
                || compoundButton.getId() == R.id.A4004b
                || compoundButton.getId() == R.id.A4004c
                || compoundButton.getId() == R.id.A40049
                || compoundButton.getId() == R.id.A40048) {
            if (bi.A40049.isChecked() || bi.A40048.isChecked()) {
                bi.llA4005.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(bi.llA4005);
            } else {
                bi.llA4005.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4007a
                || compoundButton.getId() == R.id.A4007b
                || compoundButton.getId() == R.id.A4007c
                || compoundButton.getId() == R.id.A4007d
                || compoundButton.getId() == R.id.A4007e
                || compoundButton.getId() == R.id.A4007f
                || compoundButton.getId() == R.id.A40079
                || compoundButton.getId() == R.id.A40078) {
            if (bi.A4007b.isChecked()) {
                ClearAllcontrol.ClearAll(bi.llA40071);
                bi.llA40071.setVisibility(View.GONE);
            } else {
                bi.llA40071.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4009aa
                || compoundButton.getId() == R.id.A4009ab
                || compoundButton.getId() == R.id.A4009a9
                || compoundButton.getId() == R.id.A4009a8) {
            if (bi.A4009ab.isChecked() || bi.A4009a9.isChecked() || bi.A4009a8.isChecked()) {
                bi.llA4010.setVisibility(View.GONE);
                bi.llA4011.setVisibility(View.GONE);
                bi.llA4012.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(bi.llA4010);
                ClearAllcontrol.ClearAll(bi.llA4011);
                ClearAllcontrol.ClearAll(bi.llA4012);
            } else {
                bi.llA4010.setVisibility(View.VISIBLE);
                bi.llA4011.setVisibility(View.VISIBLE);
                bi.llA4012.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4010a
                || compoundButton.getId() == R.id.A4010b
                || compoundButton.getId() == R.id.A4010c
                || compoundButton.getId() == R.id.A4010d
                || compoundButton.getId() == R.id.A40109
                || compoundButton.getId() == R.id.A40108) {

            if (bi.A4010b.isChecked() || bi.A4010c.isChecked() || bi.A4010d.isChecked()) {
                ClearAllcontrol.ClearAll(bi.llA4011);
                bi.llA4011.setVisibility(View.GONE);

            } else if (bi.A40109.isChecked() || bi.A40108.isChecked()) {
                ClearAllcontrol.ClearAll(bi.llA4011);
                ClearAllcontrol.ClearAll(bi.llA4012);
                bi.llA4011.setVisibility(View.GONE);
                bi.llA4012.setVisibility(View.GONE);
            } else {
                bi.llA4011.setVisibility(View.VISIBLE);
                bi.llA4012.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4013ua
                || compoundButton.getId() == R.id.A4013ub
                || compoundButton.getId() == R.id.A4013uc
                || compoundButton.getId() == R.id.A4013u9
                || compoundButton.getId() == R.id.A4013u8)


            ClearAllcontrol.ClearAll(bi.llA4013d);
        ClearAllcontrol.ClearAll(bi.llA4013m);
        ClearAllcontrol.ClearAll(bi.llA4013y);

        bi.llA4013d.setVisibility(View.GONE);
        bi.llA4013m.setVisibility(View.GONE);
        bi.llA4013y.setVisibility(View.GONE);
        {
            if (bi.A4013ua.isChecked()) {
                bi.llA4013d.setVisibility(View.VISIBLE);
            } else if (bi.A4013ub.isChecked()) {
                bi.llA4013m.setVisibility(View.VISIBLE);
            } else if (bi.A4013uc.isChecked()) {
                bi.llA4013y.setVisibility(View.VISIBLE);
            }
        }
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
        if (Gothrough.IamHiden(ll_A4001) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4002) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4003) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4004) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4005) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4006) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4007) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4007_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4008) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4009a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4010) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4011) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4012) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013y) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4014) != false;
    }

    @Override
    public void onClick(View view) {

    }
}



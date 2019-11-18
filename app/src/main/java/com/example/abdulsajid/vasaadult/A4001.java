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

import com.example.abdulsajid.vasaadult.databinding.A4001Binding;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4001 extends AppCompatActivity {

    A4001Binding bind;

    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bind.A4005.getText().hashCode() == s.hashCode()) {
                if (bind.A4005.getText().toString().trim().length() > 0 && Integer.parseInt(bind.A4005.getText().toString().trim()) > 7) {
                    ClearAllcontrol.ClearAllC(bind.A4006cv);
                    bind.A4006cv.setVisibility(View.GONE);
                } else {
                    bind.A4006cv.setVisibility(View.VISIBLE);
                }
            }

            if (bind.A4011.getText().hashCode() == s.hashCode()) {
                if (bind.A4011.getText().toString().trim().length() > 0 && Integer.parseInt(bind.A4011.getText().toString().trim()) >= 1) {
                    ClearAllcontrol.ClearAllC(bind.A4012cv);
                    bind.A4012cv.setVisibility(View.GONE);
                } else {
                    bind.A4012cv.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4001);
        bind.setCallback(this);
        //this.setTitle("A4001");
        setupSkips();

    }


    private void setupSkips() {

        bind.A4003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4003a.getId()) {
                    bind.A4004cv.setVisibility(View.VISIBLE);
                    bind.A4005cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4004cv);
                    bind.A4004cv.setVisibility(View.GONE);
                    bind.A4005cv.setVisibility(View.GONE);
                }

            }

        });

        bind.A4004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4004a.getId() || checkedId == bind.A4004b.getId() || checkedId == bind.A4004c.getId()) {
                    bind.A4005cv.setVisibility(View.VISIBLE);
                } else {
                    bind.A4005cv.setVisibility(View.GONE);
                }

            }

        });


        /*bind.A4007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4007b.getId()) {
                    bind.A40071cv.setVisibility(View.VISIBLE);
                } else {
                    bind.A40071cv.setVisibility(View.GONE);
                }

            }

        });*/


        bind.A4009a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4009aa.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    bind.A4010cv.setVisibility(View.GONE);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.GONE);
                } else {
                    bind.A4010cv.setVisibility(View.VISIBLE);
                    bind.A4011cv.setVisibility(View.VISIBLE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                }

            }

        });

        bind.A4010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4010b.getId() || checkedId == bind.A4010c.getId() || checkedId == bind.A4010d.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4011cv);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A401098.getId() || checkedId == bind.A401099.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4011cv);
                    ClearAllcontrol.ClearAllC(bind.A4012cv);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.GONE);
                } else {
                    bind.A4011cv.setVisibility(View.VISIBLE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                }

            }

        });

        bind.A4013u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4013dcv);
                ClearAllcontrol.ClearAllC(bind.A4013mcv);
                ClearAllcontrol.ClearAllC(bind.A4013ycv);

                bind.A4013dcv.setVisibility(View.GONE);
                bind.A4013mcv.setVisibility(View.GONE);
                bind.A4013ycv.setVisibility(View.GONE);

                if (checkedId == bind.A4013ua.getId()) {
                    bind.A4013dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4013ub.getId()) {
                    bind.A4013mcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4013uc.getId()) {
                    bind.A4013ycv.setVisibility(View.VISIBLE);
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

            Intent c2 = new Intent(A4001.this, A4051.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4001.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4001", bind.A4001.getText().toString().trim().length() > 0 ? bind.A4001.getText().toString() : "0");

        json.put("A4002", bind.A4002a.isChecked() ? "1"
                : bind.A4002b.isChecked() ? "2"
                : bind.A4002c.isChecked() ? "3"
                : bind.A4002d.isChecked() ? "4"
                : bind.A4002e.isChecked() ? "5"
                : bind.A4002f.isChecked() ? "6"
                : bind.A400298.isChecked() ? "98"
                : bind.A400299.isChecked() ? "99"
                : "0");

        json.put("A4003", bind.A4003a.isChecked() ? "1"
                : bind.A4003b.isChecked() ? "2"
                : bind.A400398.isChecked() ? "98"
                : bind.A400399.isChecked() ? "99"
                : "0");

        json.put("A4004", bind.A4004a.isChecked() ? "1"
                : bind.A4004b.isChecked() ? "2"
                : bind.A4004c.isChecked() ? "3"
                : bind.A400498.isChecked() ? "98"
                : bind.A400499.isChecked() ? "99"
                : "0");

        json.put("A4005", bind.A4005.getText().toString().trim().length() > 0 ? bind.A4005.getText().toString() : "0");

        json.put("A4006", bind.A4006a.isChecked() ? "1"
                : bind.A4006b.isChecked() ? "2"
                : bind.A400698.isChecked() ? "98"
                : bind.A400699.isChecked() ? "99"
                : "0");

        json.put("A4007", bind.A4007a.isChecked() ? "1"
                : bind.A4007b.isChecked() ? "2"
                : bind.A4007c.isChecked() ? "3"
                : bind.A4007d.isChecked() ? "4"
                : bind.A4007e.isChecked() ? "5"
                : bind.A4007f.isChecked() ? "6"
                : bind.A400798.isChecked() ? "98"
                : bind.A400799.isChecked() ? "99"
                : "0");

        json.put("A40071", bind.A40071.getText().toString().trim().length() > 0 ? bind.A40071.getText().toString() : "0");

        json.put("A4008", bind.A4008a.isChecked() ? "1"
                : bind.A4008b.isChecked() ? "2"
                : bind.A400898.isChecked() ? "98"
                : bind.A400899.isChecked() ? "99"
                : "0");

        json.put("A4009a", bind.A4009aa.isChecked() ? "1"
                : bind.A4009ab.isChecked() ? "2"
                : bind.A4009a98.isChecked() ? "98"
                : bind.A4009a99.isChecked() ? "99"
                : "0");

        json.put("A4010", bind.A4010a.isChecked() ? "1"
                : bind.A4010b.isChecked() ? "2"
                : bind.A4010c.isChecked() ? "3"
                : bind.A4010d.isChecked() ? "4"
                : bind.A401098.isChecked() ? "98"
                : bind.A401099.isChecked() ? "99"
                : "0");

        json.put("A4011", bind.A4011.getText().toString().trim().length() > 0 ? bind.A4011.getText().toString() : "0");

        json.put("A4012", bind.A4012.getText().toString().trim().length() > 0 ? bind.A4012.getText().toString() : "0");

        json.put("A4013u", bind.A4013ua.isChecked() ? "1"
                : bind.A4013ub.isChecked() ? "2"
                : bind.A4013uc.isChecked() ? "3"
                : bind.A4013u98.isChecked() ? "98"
                : bind.A4013u99.isChecked() ? "99"
                : "0");

        json.put("A4013d", bind.A4013d.getText().toString().trim().length() > 0 ? bind.A4013d.getText().toString() : "0");

        json.put("A4013m", bind.A4013m.getText().toString().trim().length() > 0 ? bind.A4013m.getText().toString() : "0");

        json.put("A4013y", bind.A4013y.getText().toString().trim().length() > 0 ? bind.A4013y.getText().toString() : "0");

        json.put("A4014", bind.A4014a.isChecked() ? "1"
                : bind.A4014b.isChecked() ? "2"
                : bind.A401498.isChecked() ? "98"
                : "0");

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();


//        MyPreferences.setsA4001(String.valueOf(json));

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4001) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4001) != false;
    }

}




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

import com.example.abdulsajid.vasaadult.databinding.A4251Binding;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;


public class A4251 extends AppCompatActivity {

    A4251Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4251);
        bi.setCallback(this);
        setupSkips();
        events_call();

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

                if (checkedId == bind.A400498.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4005cv);
                    bind.A4005cv.setVisibility(View.GONE);
                } else {
                    bind.A4005cv.setVisibility(View.VISIBLE);
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

            Intent c2 = new Intent(A4251.this, A4301.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        Intent i = new Intent(A4251.this, HomeActivity.class);
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



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4251a
                || compoundButton.getId() == R.id.A4251b
                || compoundButton.getId() == R.id.A425198)

            ClearAllcontrol.ClearAllC(bi.A42521cv);
        ClearAllcontrol.ClearAllC(bi.A4253cv);
        ClearAllcontrol.ClearAllC(bi.A4254cv);
        ClearAllcontrol.ClearAllC(bi.A4255cv);
        ClearAllcontrol.ClearAllC(bi.A4256cv);
        ClearAllcontrol.ClearAllC(bi.A4274cv);
        ClearAllcontrol.ClearAllC(bi.A4275cv);
        ClearAllcontrol.ClearAllC(bi.A4276cv);
        ClearAllcontrol.ClearAllC(bi.A4277cv);
        ClearAllcontrol.ClearAllC(bi.A4278cv);
        ClearAllcontrol.ClearAllC(bi.A4279cv);
        ClearAllcontrol.ClearAllC(bi.A4280cv);
        ClearAllcontrol.ClearAllC(bi.A4281cv);
        ClearAllcontrol.ClearAllC(bi.A4282cv);
        ClearAllcontrol.ClearAllC(bi.A4283cv);

                ll_A4252.setVisibility(View.GONE);
                ll_A4253.setVisibility(View.GONE);
                ll_A4254.setVisibility(View.GONE);
                ll_A4255.setVisibility(View.GONE);
                ll_A4256.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
                ll_A4283.setVisibility(View.GONE);

        {
            if (rb_A4251_1.isChecked()) {

                ll_A4252.setVisibility(View.VISIBLE);
                ll_A4253.setVisibility(View.VISIBLE);
                ll_A4254.setVisibility(View.VISIBLE);
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);

            } else if (rb_A4251_2.isChecked()) {

                ll_A4254.setVisibility(View.VISIBLE);
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);

            }
        }
    }


    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void events_call(){

        btn_next11.setOnClickListener(this);

        rb_A4251_1.setOnCheckedChangeListener(this);
        rb_A4251_2.setOnCheckedChangeListener(this);
        rb_A4251_DK.setOnCheckedChangeListener(this);
        /*rb_A4253_1.setOnCheckedChangeListener(this);
        rb_A4253_2.setOnCheckedChangeListener(this);
        rb_A4253_DK.setOnCheckedChangeListener(this);
        rb_A4254_1.setOnCheckedChangeListener(this);
        rb_A4254_2.setOnCheckedChangeListener(this);
        rb_A4254_DK.setOnCheckedChangeListener(this);
        rb_A4274_1.setOnCheckedChangeListener(this);
        rb_A4274_2.setOnCheckedChangeListener(this);
        rb_A4274_DK.setOnCheckedChangeListener(this);
        rb_A4275_1.setOnCheckedChangeListener(this);
        rb_A4275_2.setOnCheckedChangeListener(this);
        rb_A4275_DK.setOnCheckedChangeListener(this);
        rb_A4277_1.setOnCheckedChangeListener(this);
        rb_A4277_2.setOnCheckedChangeListener(this);
        rb_A4277_DK.setOnCheckedChangeListener(this);
        rb_A4280_1.setOnCheckedChangeListener(this);
        rb_A4280_2.setOnCheckedChangeListener(this);
        rb_A4280_DK.setOnCheckedChangeListener(this);
        rb_A4280_RA.setOnCheckedChangeListener(this);
        rb_A4281_1.setOnCheckedChangeListener(this);
        rb_A4281_2.setOnCheckedChangeListener(this);
        rb_A4281_DK.setOnCheckedChangeListener(this);
        rb_A4281_RA.setOnCheckedChangeListener(this);
        rb_A4282_1.setOnCheckedChangeListener(this);
        rb_A4282_2.setOnCheckedChangeListener(this);
        rb_A4282_DK.setOnCheckedChangeListener(this);
        rb_A4282_RA.setOnCheckedChangeListener(this);
        rb_A4283_1.setOnCheckedChangeListener(this);
        rb_A4283_2.setOnCheckedChangeListener(this);
        rb_A4283_DK.setOnCheckedChangeListener(this);
        rb_A4283_RA.setOnCheckedChangeListener(this);*/

        /*cb_A4255_1.setOnCheckedChangeListener(this);
        cb_A4255_2.setOnCheckedChangeListener(this);
        cb_A4255_3.setOnCheckedChangeListener(this);
        cb_A4255_5.setOnCheckedChangeListener(this);
        cb_A4255_6.setOnCheckedChangeListener(this);
        cb_A4255_7.setOnCheckedChangeListener(this);
        cb_A4255_8.setOnCheckedChangeListener(this);
        cb_A4255_9.setOnCheckedChangeListener(this);
        cb_A4255_10.setOnCheckedChangeListener(this);
        cb_A4255_11.setOnCheckedChangeListener(this);
        cb_A4255_12.setOnCheckedChangeListener(this);
        cb_A4255_DK.setOnCheckedChangeListener(this);
        cb_A4276_1.setOnCheckedChangeListener(this);
        cb_A4276_2.setOnCheckedChangeListener(this);
        cb_A4276_3.setOnCheckedChangeListener(this);
        cb_A4276_4.setOnCheckedChangeListener(this);
        cb_A4276_6.setOnCheckedChangeListener(this);
        cb_A4276_7.setOnCheckedChangeListener(this);
        cb_A4276_8.setOnCheckedChangeListener(this);
        cb_A4276_9.setOnCheckedChangeListener(this);
        cb_A4276_10.setOnCheckedChangeListener(this);
        cb_A4276_11.setOnCheckedChangeListener(this);
        cb_A4276_12.setOnCheckedChangeListener(this);
        cb_A4276_13.setOnCheckedChangeListener(this);
        cb_A4276_14.setOnCheckedChangeListener(this);
        cb_A4276_15.setOnCheckedChangeListener(this);
        cb_A4276_DK.setOnCheckedChangeListener(this);
        cb_A4278_1.setOnCheckedChangeListener(this);
        cb_A4278_2.setOnCheckedChangeListener(this);
        cb_A4278_3.setOnCheckedChangeListener(this);
        cb_A4278_4.setOnCheckedChangeListener(this);
        cb_A4278_5.setOnCheckedChangeListener(this);
        cb_A4278_6.setOnCheckedChangeListener(this);
        cb_A4278_7.setOnCheckedChangeListener(this);
        cb_A4278_DK.setOnCheckedChangeListener(this);
        cb_A4279_1.setOnCheckedChangeListener(this);
        cb_A4279_2.setOnCheckedChangeListener(this);
        cb_A4279_3.setOnCheckedChangeListener(this);
        cb_A4279_4.setOnCheckedChangeListener(this);
        cb_A4279_5.setOnCheckedChangeListener(this);
        cb_A4279_6.setOnCheckedChangeListener(this);
        cb_A4279_7.setOnCheckedChangeListener(this);
        cb_A4279_DK.setOnCheckedChangeListener(this);*/
    }

    void value_assignment() {

        study_id     = "0";
        A4251        = "000";
        A4253        = "000";
        A4253_3      = "000";
        A4254        = "000";
        A4255_1      = "000";
        A4255_2      = "000";
        A4255_3      = "000";
        A4255_4      = "000";
        A4255_4_OT   = "000";
        A4255_5      = "000";
        A4255_6      = "000";
        A4255_7      = "000";
        A4255_8      = "000";
        A4255_9      = "000";
        A4255_10     = "000";
        A4255_11     = "000";
        A4255_12     = "000";
        A4255_13     = "000";
        A4255_13_OT  = "000";
        A4255_DK     = "000";
        A4256_minutes= "000";
        A4256_hours  = "000";
        A4256_days   = "000";
        A4274        = "000";
        A4275        = "000";
        A4276_1      = "000";
        A4276_2      = "000";
        A4276_3      = "000";
        A4276_4      = "000";
        A4276_5      = "000";
        A4276_5_OT   = "000";
        A4276_6      = "000";
        A4276_7      = "000";
        A4276_8      = "000";
        A4276_9      = "000";
        A4276_10     = "000";
        A4276_11     = "000";
        A4276_12     = "000";
        A4276_13     = "000";
        A4276_14     = "000";
        A4276_15     = "000";
        A4276_16     = "000";
        A4276_16_OT  = "000";
        A4276_DK     = "000";
        A4277        = "000";
        A4278_1      = "000";
        A4278_2      = "000";
        A4278_3      = "000";
        A4278_4      = "000";
        A4278_5      = "000";
        A4278_6      = "000";
        A4278_7      = "000";
        A4278_DK     = "000";
        A4279_1      = "000";
        A4279_2      = "000";
        A4279_3      = "000";
        A4279_4      = "000";
        A4279_5      = "000";
        A4279_6      = "000";
        A4279_7      = "000";
        A4279_DK     = "000";
        A4280        = "000";
        A4281        = "000";
        A4282        = "000";
        A4283        = "000";
        A4284        = "000";
        STATUS       = "0";

        //A4251
        if (rb_A4251_1.isChecked()) {
            A4251 = "1";
        }
        if (rb_A4251_2.isChecked()) {
            A4251 = "2";
        }
        if (rb_A4251_DK.isChecked()) {
            A4251 = "9";
        }

        //A4253
        if (rb_A4253_1.isChecked()) {
            A4253 = "1";
        }
        if (rb_A4253_2.isChecked()) {
            A4253 = "2";
        }
        if (rb_A4253_3.isChecked()) {
            A4253 = "3";
        }
        if (rb_A4253_DK.isChecked()) {
            A4253 = "9";
        }
        if (ed_A4253_3.getText().toString().trim().length() > 0) {
            A4253_3 = ed_A4253_3.getText().toString().trim();
        }

        //A4254
        if (rb_A4254_1.isChecked()) {
            A4254 = "1";
        }
        if (rb_A4254_2.isChecked()) {
            A4254 = "2";
        }
        if (rb_A4254_DK.isChecked()) {
            A4254 = "9";
        }

        //A4255
        if (cb_A4255_1.isChecked()) {
            A4255_1 = "1";
        }
        if (cb_A4255_2.isChecked()) {
            A4255_2 = "2";
        }
        if (cb_A4255_3.isChecked()) {
            A4255_3 = "3";
        }
        if (cb_A4255_4.isChecked()) {
            A4255_4 = "4";
        }
        if (ed_A4255_4.getText().toString().trim().length() > 0) {
            A4255_4_OT = ed_A4255_4.getText().toString().trim();
        }
        if (cb_A4255_5.isChecked()) {
            A4255_5 = "5";
        }
        if (cb_A4255_6.isChecked()) {
            A4255_6 = "6";
        }
        if (cb_A4255_7.isChecked()) {
            A4255_7 = "7";
        }
        if (cb_A4255_8.isChecked()) {
            A4255_8 = "8";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_10.isChecked()) {
            A4255_10 = "10";
        }
        if (cb_A4255_11.isChecked()) {
            A4255_11 = "11";
        }
        if (cb_A4255_12.isChecked()) {
            A4255_12 = "12";
        }
        if (cb_A4255_13.isChecked()) {
            A4255_13 = "13";
        }
        if (ed_A4255_13.getText().toString().trim().length() > 0) {
            A4255_13_OT = ed_A4255_13.getText().toString().trim();
        }
        if (cb_A4255_DK.isChecked()) {
            A4255_DK = "99";
        }

        //A4256
        if (ed_A4256_minutes.getText().toString().trim().length() > 0) {
            A4256_minutes = ed_A4256_minutes.getText().toString().trim();
        }
        if (ed_A4256_hours.getText().toString().trim().length() > 0) {
            A4256_hours = ed_A4256_hours.getText().toString().trim();
        }
        if (ed_A4256_days.getText().toString().trim().length() > 0) {
            A4256_days = ed_A4256_days.getText().toString().trim();
        }

        //A4274
        if (rb_A4274_1.isChecked()) {
            A4274 = "1";
        }
        if (rb_A4274_2.isChecked()) {
            A4274 = "2";
        }
        if (rb_A4274_DK.isChecked()) {
            A4274 = "9";
        }

        //A4275
        if (rb_A4275_1.isChecked()) {
            A4275 = "1";
        }
        if (rb_A4275_2.isChecked()) {
            A4275 = "2";
        }
        if (rb_A4275_DK.isChecked()) {
            A4275 = "9";
        }

        //A4276
        if (cb_A4276_1.isChecked()) {
            A4276_1 = "1";
        }
        if (cb_A4276_2.isChecked()) {
            A4276_2 = "2";
        }
        if (cb_A4276_3.isChecked()) {
            A4276_3 = "3";
        }
        if (cb_A4276_4.isChecked()) {
            A4276_4 = "4";
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (ed_A4276_5.getText().toString().trim().length() > 0) {
            A4276_5_OT = ed_A4276_5.getText().toString().trim();
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (cb_A4276_6.isChecked()) {
            A4276_6 = "6";
        }
        if (cb_A4276_7.isChecked()) {
            A4276_7 = "7";
        }
        if (cb_A4276_8.isChecked()) {
            A4276_8 = "8";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_10.isChecked()) {
            A4276_10 = "10";
        }
        if (cb_A4276_11.isChecked()) {
            A4276_11 = "11";
        }
        if (cb_A4276_12.isChecked()) {
            A4276_12 = "12";
        }
        if (cb_A4276_13.isChecked()) {
            A4276_13 = "13";
        }
        if (cb_A4276_14.isChecked()) {
            A4276_14 = "14";
        }
        if (cb_A4276_15.isChecked()) {
            A4276_15 = "15";
        }
        if (cb_A4276_16.isChecked()) {
            A4276_16 = "16";
        }
        if (ed_A4276_16.getText().toString().trim().length() > 0) {
            A4276_16_OT = ed_A4276_16.getText().toString().trim();
        }
        if (cb_A4276_DK.isChecked()) {
            A4276_DK = "99";
        }

        //A4277
        if (rb_A4277_1.isChecked()) {
            A4277 = "1";
        }
        if (rb_A4277_2.isChecked()) {
            A4277 = "2";
        }
        if (rb_A4277_DK.isChecked()) {
            A4277 = "9";
        }

        //A4278
        if (cb_A4278_1.isChecked()) {
            A4278_1 = "1";
        }
        if (cb_A4278_2.isChecked()) {
            A4278_2 = "2";
        }
        if (cb_A4278_3.isChecked()) {
            A4278_3 = "3";
        }
        if (cb_A4278_4.isChecked()) {
            A4278_4 = "4";
        }
        if (cb_A4278_5.isChecked()) {
            A4278_5 = "5";
        }
        if (cb_A4278_6.isChecked()) {
            A4278_6 = "6";
        }
        if (cb_A4278_7.isChecked()) {
            A4278_7 = "7";
        }
        if (cb_A4278_DK.isChecked()) {
            A4278_DK = "9";
        }
        
        //A4279
        if (cb_A4279_1.isChecked()) {
            A4279_1 = "1";
        }
        if (cb_A4279_2.isChecked()) {
            A4279_2 = "2";
        }
        if (cb_A4279_3.isChecked()) {
            A4279_3 = "3";
        }
        if (cb_A4279_4.isChecked()) {
            A4279_4 = "4";
        }
        if (cb_A4279_5.isChecked()) {
            A4279_5 = "5";
        }
        if (cb_A4279_6.isChecked()) {
            A4279_6 = "6";
        }
        if (cb_A4279_7.isChecked()) {
            A4279_7 = "7";
        }
        if (cb_A4279_DK.isChecked()) {
            A4279_DK = "9";
        }

        //A4280
        if (rb_A4280_1.isChecked()) {
            A4280 = "1";
        }
        if (rb_A4280_2.isChecked()) {
            A4280 = "2";
        }
        if (rb_A4280_DK.isChecked()) {
            A4280 = "9";
        }
        if (rb_A4280_RA.isChecked()) {
            A4280 = "8";
        }

        //A4281
        if (rb_A4281_1.isChecked()) {
            A4281 = "1";
        }
        if (rb_A4281_2.isChecked()) {
            A4281 = "2";
        }
        if (rb_A4281_DK.isChecked()) {
            A4281 = "9";
        }
        if (rb_A4281_RA.isChecked()) {
            A4281 = "8";
        }

        //A4282
        if (rb_A4282_1.isChecked()) {
            A4282 = "1";
        }
        if (rb_A4282_2.isChecked()) {
            A4282 = "2";
        }
        if (rb_A4282_DK.isChecked()) {
            A4282 = "9";
        }
        if (rb_A4282_RA.isChecked()) {
            A4282 = "8";
        }

        //A4283
        if (rb_A4283_1.isChecked()) {
            A4283 = "1";
        }
        if (rb_A4283_2.isChecked()) {
            A4283 = "2";
        }
        if (rb_A4283_DK.isChecked()) {
            A4283 = "9";
        }
        if (rb_A4283_RA.isChecked()) {
            A4280 = "8";
        }

        //A4284
        if (ed_A4284_days.getText().toString().trim().length() > 0) {
            A4284 = ed_A4284_days.getText().toString().trim();
        }
    }
    
    void insert_data() {
        
        String query = "insert into A4251_A4284("

                +    Global.A.A4251_A4284.study_id      +   ","
                +    Global.A.A4251_A4284.A4251         +   ","
                +    Global.A.A4251_A4284.A4253         +   ","
                +    Global.A.A4251_A4284.A4253_3       +   ","
                +    Global.A.A4251_A4284.A4254         +   ","
                +    Global.A.A4251_A4284.A4255_1       +   ","
                +    Global.A.A4251_A4284.A4255_2       +   ","
                +    Global.A.A4251_A4284.A4255_3       +   ","
                +    Global.A.A4251_A4284.A4255_4       +   ","
                +    Global.A.A4251_A4284.A4255_4_OT    +   ","
                +    Global.A.A4251_A4284.A4255_5       +   ","
                +    Global.A.A4251_A4284.A4255_6       +   ","
                +    Global.A.A4251_A4284.A4255_7       +   ","
                +    Global.A.A4251_A4284.A4255_8       +   ","
                +    Global.A.A4251_A4284.A4255_9       +   ","
                +    Global.A.A4251_A4284.A4255_10      +   ","
                +    Global.A.A4251_A4284.A4255_11      +   ","
                +    Global.A.A4251_A4284.A4255_12      +   ","
                +    Global.A.A4251_A4284.A4255_13      +   ","
                +    Global.A.A4251_A4284.A4255_13_OT   +   ","
                +    Global.A.A4251_A4284.A4255_DK      +   ","
                +    Global.A.A4251_A4284.A4256_minutes +   ","
                +    Global.A.A4251_A4284.A4256_hours   +   ","
                +    Global.A.A4251_A4284.A4256_days    +   ","
                +    Global.A.A4251_A4284.A4274         +   ","
                +    Global.A.A4251_A4284.A4275         +   ","
                +    Global.A.A4251_A4284.A4276_1       +   ","
                +    Global.A.A4251_A4284.A4276_2       +   ","
                +    Global.A.A4251_A4284.A4276_3       +   ","
                +    Global.A.A4251_A4284.A4276_4       +   ","
                +    Global.A.A4251_A4284.A4276_5       +   ","
                +    Global.A.A4251_A4284.A4276_5_OT    +   ","
                +    Global.A.A4251_A4284.A4276_6       +   ","
                +    Global.A.A4251_A4284.A4276_7       +   ","
                +    Global.A.A4251_A4284.A4276_8       +   ","
                +    Global.A.A4251_A4284.A4276_9       +   ","
                +    Global.A.A4251_A4284.A4276_10      +   ","
                +    Global.A.A4251_A4284.A4276_11      +   ","
                +    Global.A.A4251_A4284.A4276_12      +   ","
                +    Global.A.A4251_A4284.A4276_13      +   ","
                +    Global.A.A4251_A4284.A4276_14      +   ","
                +    Global.A.A4251_A4284.A4276_15      +   ","
                +    Global.A.A4251_A4284.A4276_16      +   ","
                +    Global.A.A4251_A4284.A4276_16_OT   +   ","
                +    Global.A.A4251_A4284.A4276_DK      +   ","
                +    Global.A.A4251_A4284.A4277         +   ","
                +    Global.A.A4251_A4284.A4278_1       +   ","
                +    Global.A.A4251_A4284.A4278_2       +   ","
                +    Global.A.A4251_A4284.A4278_3       +   ","
                +    Global.A.A4251_A4284.A4278_4       +   ","
                +    Global.A.A4251_A4284.A4278_5       +   ","
                +    Global.A.A4251_A4284.A4278_6       +   ","
                +    Global.A.A4251_A4284.A4278_7       +   ","
                +    Global.A.A4251_A4284.A4278_DK      +   ","
                +    Global.A.A4251_A4284.A4279_1       +   ","
                +    Global.A.A4251_A4284.A4279_2       +   ","
                +    Global.A.A4251_A4284.A4279_3       +   ","
                +    Global.A.A4251_A4284.A4279_4       +   ","
                +    Global.A.A4251_A4284.A4279_5       +   ","
                +    Global.A.A4251_A4284.A4279_6       +   ","
                +    Global.A.A4251_A4284.A4279_7       +   ","
                +    Global.A.A4251_A4284.A4279_DK      +   ","
                +    Global.A.A4251_A4284.A4280         +   ","
                +    Global.A.A4251_A4284.A4281         +   ","
                +    Global.A.A4251_A4284.A4282         +   ","
                +    Global.A.A4251_A4284.A4283         +   ","
                +    Global.A.A4251_A4284.A4284         +   ","
                +    Global.A.A4251_A4284.STATUS        +   ")" +


                        " values ('"  +
                                        study_id        +   "','"   +
                                        A4251           +   "','"   +
                                        A4253           +   "','"   +
                                        A4253_3         +   "','"   +
                                        A4254           +   "','"   +
                                        A4255_1         +   "','"   +
                                        A4255_2         +   "','"   +
                                        A4255_3         +   "','"   +
                                        A4255_4         +   "','"   +
                                        A4255_4_OT      +   "','"   +
                                        A4255_5         +   "','"   +
                                        A4255_6         +   "','"   +
                                        A4255_7         +   "','"   +
                                        A4255_8         +   "','"   +
                                        A4255_9         +   "','"   +
                                        A4255_10        +   "','"   +
                                        A4255_11        +   "','"   +
                                        A4255_12        +   "','"   +
                                        A4255_13        +   "','"   +
                                        A4255_13_OT     +   "','"   +
                                        A4255_DK        +   "','"   +
                                        A4256_minutes   +   "','"   +
                                        A4256_hours     +   "','"   +
                                        A4256_days      +   "','"   +
                                        A4274           +   "','"   +
                                        A4275           +   "','"   +
                                        A4276_1         +   "','"   +
                                        A4276_2         +   "','"   +
                                        A4276_3         +   "','"   +
                                        A4276_4         +   "','"   +
                                        A4276_5         +   "','"   +
                                        A4276_5_OT      +   "','"   +
                                        A4276_6         +   "','"   +
                                        A4276_7         +   "','"   +
                                        A4276_8         +   "','"   +
                                        A4276_9         +   "','"   +
                                        A4276_10        +   "','"   +
                                        A4276_11        +   "','"   +
                                        A4276_12        +   "','"   +
                                        A4276_13        +   "','"   +
                                        A4276_14        +   "','"   +
                                        A4276_15        +   "','"   +
                                        A4276_16        +   "','"   +
                                        A4276_16_OT     +   "','"   +
                                        A4276_DK        +   "','"   +
                                        A4277           +   "','"   +
                                        A4278_1         +   "','"   +
                                        A4278_2         +   "','"   +
                                        A4278_3         +   "','"   +
                                        A4278_4         +   "','"   +
                                        A4278_5         +   "','"   +
                                        A4278_6         +   "','"   +
                                        A4278_7         +   "','"   +
                                        A4278_DK        +   "','"   +
                                        A4279_1         +   "','"   +
                                        A4279_2         +   "','"   +
                                        A4279_3         +   "','"   +
                                        A4279_4         +   "','"   +
                                        A4279_5         +   "','"   +
                                        A4279_6         +   "','"   +
                                        A4279_7         +   "','"   +
                                        A4279_DK        +   "','"   +
                                        A4280           +   "','"   +
                                        A4281           +   "','"   +
                                        A4282           +   "','"   +
                                        A4283           +   "','"   +
                                        A4284           +   "','"   +
                                        STATUS          +   "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "11th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }


    boolean validateField() {
       if (Gothrough.IamHiden(ll_A4251) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4252) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4253) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4254) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4255) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4256) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4274) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4275) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4276) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4277) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4278) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4279) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4280) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4281) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4282) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4283) == false) {
            return false;
       }

        return Gothrough.IamHiden(ll_A4284) != false;
    }
}

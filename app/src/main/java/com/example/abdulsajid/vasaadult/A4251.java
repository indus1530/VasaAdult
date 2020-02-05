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

        json.put("A4251", bi.A4251a.isChecked() ? "1"
                : bi.A4251b.isChecked() ? "2"
                : bi.A425198.isChecked() ? "98"
                : "0");

        json.put("A42521", bi.A42521a.isChecked() ? "1"
                : bi.A42521b.isChecked() ? "2"
                : bi.A42521c.isChecked() ? "3"
                : "0");

        json.put("A42522", bi.A42522a.isChecked() ? "1"
                : bi.A42522b.isChecked() ? "2"
                : bi.A42522c.isChecked() ? "3"
                : bi.A42522d.isChecked() ? "4"
                : bi.A42522e.isChecked() ? "5"
                : bi.A42522f.isChecked() ? "6"
                : bi.A42522g.isChecked() ? "7"
                : "0");

        json.put("A42523", bi.A42523.isChecked() ? "1" : "0");

        json.put("A42524", bi.A42524.getText().toString());

        json.put("A4253", bi.A4253a.isChecked() ? "1"
                : bi.A4253b.isChecked() ? "2"
                : bi.A425396.isChecked() ? "96"
                : bi.A425398.isChecked() ? "98"
                : "0");
        json.put("A425396x", bi.A425396x.getText().toString());

        json.put("A4254", bi.A4254a.isChecked() ? "1"
                : bi.A4254b.isChecked() ? "2"
                : bi.A425498.isChecked() ? "98"
                : "0");

        json.put("A4255a", bi.A4255a.isChecked() ? "1" : "0");
        json.put("A4255b", bi.A4255b.isChecked() ? "2" : "0");
        json.put("A4255c", bi.A4255c.isChecked() ? "3" : "0");
        json.put("A4255d", bi.A4255d.isChecked() ? "4" : "0");
        json.put("A4255e", bi.A4255e.isChecked() ? "5" : "0");
        json.put("A4255f", bi.A4255f.isChecked() ? "6" : "0");
        json.put("A4255g", bi.A4255g.isChecked() ? "7" : "0");
        json.put("A4255h", bi.A4255h.isChecked() ? "8" : "0");
        json.put("A4255i", bi.A4255i.isChecked() ? "9" : "0");
        json.put("A4255j", bi.A4255j.isChecked() ? "10" : "0");
        json.put("A4255k", bi.A4255k.isChecked() ? "11" : "0");
        json.put("A4255l", bi.A4255l.isChecked() ? "12" : "0");
        json.put("A425596", bi.A425596.isChecked() ? "96" : "0");
        json.put("A425598", bi.A425598.isChecked() ? "98" : "0");
        json.put("A4255dx", bi.A4255dx.getText().toString());
        json.put("A425596x", bi.A425596x.getText().toString());

        json.put("A4256D", bi.A4256D.getText().toString());
        json.put("A4256H", bi.A4256H.getText().toString());
        json.put("A4256m", bi.A4256m.getText().toString());

        json.put("A4257", bi.A4257a.isChecked() ? "1"
                : bi.A4257b.isChecked() ? "2"
                : bi.A4257c.isChecked() ? "3"
                : bi.A4257d.isChecked() ? "4"
                : bi.A4257e.isChecked() ? "5"
                : bi.A4257f.isChecked() ? "6"
                : bi.A4257g.isChecked() ? "7"
                : bi.A4257h.isChecked() ? "8"
                : bi.A4257i.isChecked() ? "9"
                : bi.A4257j.isChecked() ? "10"
                : bi.A4257k.isChecked() ? "11"
                : bi.A425798.isChecked() ? "98"
                : "0");
        json.put("A4257x", bi.A4257x.getText().toString());

        json.put("A4258", bi.A4258a.isChecked() ? "1"
                : bi.A4258b.isChecked() ? "2"
                : bi.A4258c.isChecked() ? "3"
                : bi.A425898.isChecked() ? "98"
                : "0");

        json.put("A4274", bi.A4274a.isChecked() ? "1"
                : bi.A4274b.isChecked() ? "2"
                : bi.A427498.isChecked() ? "98"
                : "0");

        json.put("A4275", bi.A4275a.isChecked() ? "1"
                : bi.A4275b.isChecked() ? "2"
                : bi.A427598.isChecked() ? "98"
                : "0");

        json.put("A4276a", bi.A4276a.isChecked() ? "1" : "0");
        json.put("A4276b", bi.A4276b.isChecked() ? "2" : "0");
        json.put("A4276c", bi.A4276c.isChecked() ? "3" : "0");
        json.put("A4276d", bi.A4276d.isChecked() ? "4" : "0");
        json.put("A4276e", bi.A4276e.isChecked() ? "5" : "0");
        json.put("A4276f", bi.A4276f.isChecked() ? "6" : "0");
        json.put("A4276g", bi.A4276g.isChecked() ? "7" : "0");
        json.put("A4276h", bi.A4276h.isChecked() ? "8" : "0");
        json.put("A4276i", bi.A4276i.isChecked() ? "9" : "0");
        json.put("A4276j", bi.A4276j.isChecked() ? "10" : "0");
        json.put("A4276k", bi.A4276k.isChecked() ? "11" : "0");
        json.put("A4276l", bi.A4276l.isChecked() ? "12" : "0");
        json.put("A4276m", bi.A4276m.isChecked() ? "13" : "0");
        json.put("A4276n", bi.A4276n.isChecked() ? "14" : "0");
        json.put("A4276o", bi.A4276o.isChecked() ? "15" : "0");
        json.put("A427696", bi.A427696.isChecked() ? "96" : "0");
        json.put("A427698", bi.A427698.isChecked() ? "98" : "0");
        json.put("A4276ex", bi.A4276ex.getText().toString());
        json.put("A427696x", bi.A427696x.getText().toString());

        json.put("A4277", bi.A4277a.isChecked() ? "1"
                : bi.A4277b.isChecked() ? "2"
                : bi.A427798.isChecked() ? "98"
                : "0");

        //LocalDataManager.database.execSQL(String.valueOf(json));


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
                bi.A4251 + "','" +
                bi.A4253 + "','" +
                bi.A42533 + "','" +
                bi.A4254 + "','" +
                bi.A42551 + "','" +
                bi.A42552 + "','" +
                bi.A42553 + "','" +
                bi.A42554 + "','" +
                bi.A4255496 + "','" +
                bi.A42555 + "','" +
                bi.A42556 + "','" +
                bi.A42557 + "','" +
                bi.A42558 + "','" +
                bi.A42559 + "','" +
                bi.A425510 + "','" +
                bi.A425511 + "','" +
                bi.A425512 + "','" +
                bi.A425513 + "','" +
                bi.A425513_OT + "','" +
                bi.A4255DK + "','" +
                bi.A4256_minutes + "','" +
                bi.A4256_hours + "','" +
                bi.A4256_days + "','" +
                bi.A4274 + "','" +
                bi.A4275 + "','" +
                bi.A4276_1 + "','" +
                bi.A4276_2 + "','" +
                bi.A4276_3 + "','" +
                bi.A4276_4 + "','" +
                bi.A4276_5 + "','" +
                bi.A4276_5_OT + "','" +
                bi.A4276_6 + "','" +
                bi.A4276_7 + "','" +
                bi.A4276_8 + "','" +
                bi.A4276_9 + "','" +
                bi.A4276_10 + "','" +
                bi.A4276_11 + "','" +
                bi.A4276_12 + "','" +
                bi.A4276_13 + "','" +
                bi.A4276_14 + "','" +
                bi.A4276_15 + "','" +
                bi.A4276_16 + "','" +
                bi.A4276_16_OT + "','" +
                bi.A4276_DK + "','" +
                bi.A4277 + "','" +
                bi.A4278_1 + "','" +
                bi.A4278_2 + "','" +
                bi.A4278_3 + "','" +
                bi.A4278_4 + "','" +
                bi.A4278_5 + "','" +
                bi.A4278_6 + "','" +
                bi.A4278_7 + "','" +
                bi.A4278_DK + "','" +
                bi.A42791 + "','" +
                bi.A42792 + "','" +
                bi.A42793 + "','" +
                bi.A42794 + "','" +
                bi.A42795 + "','" +
                bi.A42796 + "','" +
                bi.A42797 + "','" +
                bi.A427998 + "','" +
                bi.A4280 + "','" +
                bi.A4281 + "','" +
                bi.A4282 + "','" +
                bi.A4283 + "','" +
                bi.A4284 + "','" +
                bi.STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "11th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }


    boolean validateField() {
        return Gothrough.IamHiden(bi.llA4251);
    }

}

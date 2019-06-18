package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4206Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4206 extends AppCompatActivity {
    A4206Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4206);
        bind.setCallback(this);
        //this.setTitle("A4207");
        setupSkips();

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4206.this, A4251.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        Intent i = new Intent(A4206.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4157", bind.A4157a.isChecked() ? "1"
                : bind.A4157b.isChecked() ? "2"
                : bind.A415798.isChecked() ? "98"
                : bind.A415799.isChecked() ? "99"
                : "0");

        json.put("A4158", bind.A4158a.isChecked() ? "1"
                : bind.A4158b.isChecked() ? "2"
                : bind.A415898.isChecked() ? "98"
                : bind.A415899.isChecked() ? "99"
                : "0");

        json.put("A4159", bind.A4159a.isChecked() ? "1"
                : bind.A4159b.isChecked() ? "2"
                : bind.A415998.isChecked() ? "98"
                : bind.A415999.isChecked() ? "99"
                : "0");

        json.put("A4160", bind.A4160a.isChecked() ? "1"
                : bind.A4160b.isChecked() ? "2"
                : bind.A416098.isChecked() ? "98"
                : bind.A416099.isChecked() ? "99"
                : "0");

        json.put("A4161", bind.A4161a.isChecked() ? "1"
                : bind.A4161b.isChecked() ? "2"
                : bind.A416198.isChecked() ? "98"
                : bind.A416199.isChecked() ? "99"
                : "0");

        json.put("A41611", bind.A41611a.isChecked() ? "1"
                : bind.A41611b.isChecked() ? "2"
                : bind.A4161198.isChecked() ? "98"
                : bind.A4161199.isChecked() ? "99"
                : "0");

        json.put("A4162", bind.A4162a.isChecked() ? "1"
                : bind.A4162b.isChecked() ? "2"
                : bind.A416298.isChecked() ? "98"
                : bind.A416299.isChecked() ? "99"
                : "0");

        json.put("A41631", bind.A41631a.isChecked() ? "1"
                : bind.A41631b.isChecked() ? "2"
                : bind.A4163198.isChecked() ? "98"
                : bind.A4163199.isChecked() ? "99"
                : "0");

        json.put("A4163", bind.A4163a.isChecked() ? "1"
                : bind.A4163b.isChecked() ? "2"
                : bind.A416398.isChecked() ? "98"
                : bind.A416399.isChecked() ? "99"
                : "0");

        json.put("A4164W", bind.A4164W.getText().toString().trim().length() > 0 ? bind.A4164W.getText().toString() : "0");

        json.put("A4166", bind.A4166a.isChecked() ? "1"
                : bind.A4166b.isChecked() ? "2"
                : bind.A416698.isChecked() ? "98"
                : bind.A416699.isChecked() ? "99"
                : "0");

        json.put("A4167", bind.A4167a.isChecked() ? "1"
                : bind.A4167b.isChecked() ? "2"
                : bind.A416798.isChecked() ? "98"
                : bind.A416799.isChecked() ? "99"
                : "0");

        json.put("A41681", bind.A41681a.isChecked() ? "1"
                : bind.A41681b.isChecked() ? "2"
                : bind.A4168198.isChecked() ? "98"
                : bind.A4168199.isChecked() ? "99"
                : "0");

        json.put("A41683", bind.A41683a.isChecked() ? "1"
                : bind.A41683b.isChecked() ? "2"
                : bind.A4168398.isChecked() ? "98"
                : bind.A4168399.isChecked() ? "99"
                : "0");

        json.put("A4168", bind.A4168a.isChecked() ? "1"
                : bind.A4168b.isChecked() ? "2"
                : bind.A416898.isChecked() ? "98"
                : bind.A416899.isChecked() ? "99"
                : "0");

        json.put("A41731", bind.A41731a.isChecked() ? "1"
                : bind.A41731b.isChecked() ? "2"
                : bind.A4173198.isChecked() ? "98"
                : bind.A4173199.isChecked() ? "99"
                : "0");

        json.put("A4173", bind.A4173a.isChecked() ? "1"
                : bind.A4173b.isChecked() ? "2"
                : bind.A417398.isChecked() ? "98"
                : bind.A417399.isChecked() ? "99"
                : "0");

        json.put("A41732", bind.A41732a.isChecked() ? "1"
                : bind.A41732b.isChecked() ? "2"
                : bind.A4173298.isChecked() ? "98"
                : bind.A4173299.isChecked() ? "99"
                : "0");

        json.put("A41781M", bind.A41781M.getText().toString().trim().length() > 0 ? bind.A41781M.getText().toString() : "0");

        json.put("A41782", bind.A41782a.isChecked() ? "1"
                : bind.A41782b.isChecked() ? "2"
                : bind.A4178298.isChecked() ? "98"
                : bind.A4178299.isChecked() ? "99"
                : "0");

        json.put("A4178", bind.A4178a.isChecked() ? "1"
                : bind.A4178b.isChecked() ? "2"
                : bind.A417898.isChecked() ? "98"
                : bind.A417899.isChecked() ? "99"
                : "0");

        json.put("A4179", bind.A4179a.isChecked() ? "1"
                : bind.A4179b.isChecked() ? "2"
                : bind.A417998.isChecked() ? "98"
                : bind.A417999.isChecked() ? "99"
                : "0");

        json.put("A4180", bind.A4180.getText().toString().trim().length() > 0 ? bind.A4180.getText().toString() : "0");

        json.put("A4181", bind.A4181a.isChecked() ? "1"
                : bind.A4181b.isChecked() ? "2"
                : bind.A418198.isChecked() ? "98"
                : bind.A418199.isChecked() ? "99"
                : "0");

        json.put("A4182", bind.A4182a.isChecked() ? "1"
                : bind.A4182b.isChecked() ? "2"
                : bind.A418298.isChecked() ? "98"
                : bind.A418299.isChecked() ? "99"
                : "0");

        json.put("A4183", bind.A4183a.isChecked() ? "1"
                : bind.A4183b.isChecked() ? "2"
                : bind.A418398.isChecked() ? "98"
                : bind.A418399.isChecked() ? "99"
                : "0");

        json.put("A4184", bind.A4184a.isChecked() ? "1"
                : bind.A4184b.isChecked() ? "2"
                : bind.A418498.isChecked() ? "98"
                : bind.A418499.isChecked() ? "99"
                : "0");

        json.put("A4185", bind.A4185a.isChecked() ? "1"
                : bind.A4185b.isChecked() ? "2"
                : bind.A418598.isChecked() ? "98"
                : bind.A418599.isChecked() ? "99"
                : "0");

        json.put("A4186", bind.A4186a.isChecked() ? "1"
                : bind.A4186b.isChecked() ? "2"
                : bind.A418698.isChecked() ? "98"
                : bind.A418699.isChecked() ? "99"
                : "0");

        json.put("A41861", bind.A41861a.isChecked() ? "1"
                : bind.A41861b.isChecked() ? "2"
                : bind.A4186198.isChecked() ? "98"
                : bind.A4186199.isChecked() ? "99"
                : "0");

        json.put("A4187", bind.A4187a.isChecked() ? "1"
                : bind.A4187b.isChecked() ? "2"
                : bind.A418798.isChecked() ? "98"
                : bind.A418799.isChecked() ? "99"
                : "0");

        json.put("A4188", bind.A4188a.isChecked() ? "1"
                : bind.A4188b.isChecked() ? "2"
                : bind.A418898.isChecked() ? "98"
                : bind.A418899.isChecked() ? "99"
                : "0");

        json.put("A4189", bind.A4189a.isChecked() ? "1"
                : bind.A4189b.isChecked() ? "2"
                : bind.A418998.isChecked() ? "98"
                : bind.A418999.isChecked() ? "99"
                : "0");

        json.put("A4190", bind.A4190a.isChecked() ? "1"
                : bind.A4190b.isChecked() ? "2"
                : bind.A419098.isChecked() ? "98"
                : bind.A419099.isChecked() ? "99"
                : "0");

        json.put("A4191", bind.A4191a.isChecked() ? "1"
                : bind.A4191b.isChecked() ? "2"
                : bind.A419198.isChecked() ? "98"
                : bind.A419199.isChecked() ? "99"
                : "0");

        json.put("A4192", bind.A4192.getText().toString().trim().length() > 0 ? bind.A4192.getText().toString() : "0");

        json.put("A4193", bind.A4193a.isChecked() ? "1"
                : bind.A4193b.isChecked() ? "2"
                : bind.A419398.isChecked() ? "98"
                : bind.A419399.isChecked() ? "99"
                : "0");

        json.put("A41931", bind.A41931a.isChecked() ? "1"
                : bind.A41931b.isChecked() ? "2"
                : bind.A41931c.isChecked() ? "3"
                : bind.A41931d.isChecked() ? "4"
                : bind.A4193198.isChecked() ? "98"
                : bind.A4193199.isChecked() ? "99"
                : "0");

        json.put("A4194", bind.A4194a.isChecked() ? "1"
                : bind.A4194b.isChecked() ? "2"
                : bind.A419498.isChecked() ? "98"
                : bind.A419499.isChecked() ? "99"
                : "0");

        json.put("A4195", bind.A4195a.isChecked() ? "1"
                : bind.A4195b.isChecked() ? "2"
                : bind.A419598.isChecked() ? "98"
                : bind.A419599.isChecked() ? "99"
                : "0");

        json.put("A4196", bind.A4196a.isChecked() ? "1"
                : bind.A4196b.isChecked() ? "2"
                : bind.A419698.isChecked() ? "98"
                : bind.A419699.isChecked() ? "99"
                : "0");

        json.put("A4197", bind.A4197a.isChecked() ? "1"
                : bind.A4197b.isChecked() ? "2"
                : bind.A419798.isChecked() ? "98"
                : bind.A419799.isChecked() ? "99"
                : "0");

        json.put("A41981", bind.A41981a.isChecked() ? "1"
                : bind.A41981b.isChecked() ? "2"
                : bind.A4198198.isChecked() ? "98"
                : bind.A4198199.isChecked() ? "99"
                : "0");

        json.put("A4198", bind.A4198a.isChecked() ? "1"
                : bind.A4198b.isChecked() ? "2"
                : bind.A4198c.isChecked() ? "3"
                : bind.A4198d.isChecked() ? "4"
                : bind.A419896.isChecked() ? "96"
                : bind.A419898.isChecked() ? "98"
                : bind.A419899.isChecked() ? "99"
                : "0");

        json.put("A4200", bind.A4200a.isChecked() ? "1"
                : bind.A4200b.isChecked() ? "2"
                : bind.A4200c.isChecked() ? "3"
                : bind.A4200d.isChecked() ? "4"
                : bind.A4200e.isChecked() ? "5"
                : bind.A4200f.isChecked() ? "6"
                : bind.A420096.isChecked() ? "96"
                : bind.A420098.isChecked() ? "98"
                : bind.A420099.isChecked() ? "99"
                : "0");

        json.put("A4202", bind.A4202a.isChecked() ? "1"
                : bind.A4202b.isChecked() ? "2"
                : bind.A420298.isChecked() ? "98"
                : bind.A420299.isChecked() ? "99"
                : "0");

        json.put("A4203", bind.A4203a.isChecked() ? "1"
                : bind.A4203b.isChecked() ? "2"
                : bind.A420398.isChecked() ? "98"
                : bind.A420399.isChecked() ? "99"
                : "0");

        json.put("A4204", bind.A4204a.isChecked() ? "1"
                : bind.A4204b.isChecked() ? "2"
                : bind.A420498.isChecked() ? "98"
                : bind.A420499.isChecked() ? "99"
                : "0");

        json.put("A4205", bind.A4205a.isChecked() ? "1"
                : bind.A4205b.isChecked() ? "2"
                : bind.A420598.isChecked() ? "98"
                : bind.A420599.isChecked() ? "99"
                : "0");

        json.put("A42051", bind.A42051a.isChecked() ? "1"
                : bind.A42051b.isChecked() ? "2"
                : bind.A4205198.isChecked() ? "98"
                : bind.A4205199.isChecked() ? "99"
                : "0");

//        MyPreferences.setsA4157(String.valueOf(json));

    }


    private void setupSkips() {

        bind.A4159.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4159a.getId()) {
                    bind.A4160cv.setVisibility(View.VISIBLE);
                    bind.A4161cv.setVisibility(View.VISIBLE);
                    bind.A41611cv.setVisibility(View.VISIBLE);
                    bind.A4162cv.setVisibility(View.VISIBLE);
                    bind.A41631cv.setVisibility(View.VISIBLE);
                    bind.A4163cv.setVisibility(View.VISIBLE);
                    bind.A4164Wcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4160cv);
                    ClearAllcontrol.ClearAllC(bind.A4161cv);
                    ClearAllcontrol.ClearAllC(bind.A41611cv);
                    ClearAllcontrol.ClearAllC(bind.A4162cv);
                    ClearAllcontrol.ClearAllC(bind.A41631cv);
                    ClearAllcontrol.ClearAllC(bind.A4163cv);
                    ClearAllcontrol.ClearAllC(bind.A4164Wcv);
                    bind.A4160cv.setVisibility(View.GONE);
                    bind.A4161cv.setVisibility(View.GONE);
                    bind.A41611cv.setVisibility(View.GONE);
                    bind.A4162cv.setVisibility(View.GONE);
                    bind.A41631cv.setVisibility(View.GONE);
                    bind.A4163cv.setVisibility(View.GONE);
                    bind.A4164Wcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4160.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4160a.getId()) {
                    bind.A4161cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4161cv);
                    bind.A4161cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4162a.getId()) {
                    bind.A41631cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A41631cv);
                    bind.A41631cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4163.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4163a.getId()) {
                    bind.A4164Wcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4164Wcv);
                    bind.A4164Wcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4167.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4167a.getId()) {
                    bind.A41681cv.setVisibility(View.VISIBLE);
                    bind.A41683cv.setVisibility(View.VISIBLE);
                    bind.A4168cv.setVisibility(View.VISIBLE);
                    bind.A41731cv.setVisibility(View.VISIBLE);
                    bind.A4173cv.setVisibility(View.VISIBLE);
                    bind.A41732cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A41681cv);
                    ClearAllcontrol.ClearAllC(bind.A41683cv);
                    ClearAllcontrol.ClearAllC(bind.A4168cv);
                    ClearAllcontrol.ClearAllC(bind.A41731cv);
                    ClearAllcontrol.ClearAllC(bind.A4173cv);
                    ClearAllcontrol.ClearAllC(bind.A41732cv);
                    bind.A41681cv.setVisibility(View.GONE);
                    bind.A41683cv.setVisibility(View.GONE);
                    bind.A4168cv.setVisibility(View.GONE);
                    bind.A41731cv.setVisibility(View.GONE);
                    bind.A4173cv.setVisibility(View.GONE);
                    bind.A41732cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A41683.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A41683a.getId()) {
                    bind.A4168cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4168cv);
                    bind.A4168cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A41681.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A41681a.getId()) {
                    bind.A4168cv.setVisibility(View.VISIBLE);
                    bind.A41683cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4168cv);
                    ClearAllcontrol.ClearAllC(bind.A41683cv);
                    bind.A4168cv.setVisibility(View.GONE);
                    bind.A41683cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4168.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4168a.getId()) {
                    bind.A41731cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A41731cv);
                    bind.A41731cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4173.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4173a.getId()) {
                    bind.A41732cv.setVisibility(View.VISIBLE);
                    bind.A41781Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A41732cv);
                    ClearAllcontrol.ClearAllC(bind.A41781Mcv);
                    bind.A41732cv.setVisibility(View.GONE);
                    bind.A41781Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4194.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4194a.getId()) {
                    bind.A4195cv.setVisibility(View.VISIBLE);
                    bind.A4196cv.setVisibility(View.VISIBLE);
                    bind.A4197cv.setVisibility(View.VISIBLE);
                    bind.A41981cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4195cv);
                    ClearAllcontrol.ClearAllC(bind.A4196cv);
                    ClearAllcontrol.ClearAllC(bind.A4197cv);
                    ClearAllcontrol.ClearAllC(bind.A41981cv);
                    bind.A4195cv.setVisibility(View.GONE);
                    bind.A4196cv.setVisibility(View.GONE);
                    bind.A4197cv.setVisibility(View.GONE);
                    bind.A41981cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4195.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4195a.getId()) {
                    bind.A4196cv.setVisibility(View.VISIBLE);
                    bind.A4197cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4196cv);
                    ClearAllcontrol.ClearAllC(bind.A4197cv);
                    bind.A4196cv.setVisibility(View.GONE);
                    bind.A4197cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4196.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4196a.getId()) {
                    bind.A4197cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4197cv);
                    bind.A4197cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4202.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4202a.getId()) {
                    bind.A4203cv.setVisibility(View.VISIBLE);
                    bind.A4203cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4203cv);
                    ClearAllcontrol.ClearAllC(bind.A4204cv);
                    bind.A4203cv.setVisibility(View.GONE);
                    bind.A4204cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4203.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4203a.getId()) {
                    bind.A4204cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4204cv);
                    bind.A4204cv.setVisibility(View.GONE);
                }

            }

        });


        if (compoundButton.getId() == R.id.rb_A4206_1
                || compoundButton.getId() == R.id.rb_A4206_2
                || compoundButton.getId() == R.id.rb_A4206_DK
                || compoundButton.getId() == R.id.rb_A4206_RA)

        {
            if (rb_A4206_2.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_1);
                ClearAllcontrol.ClearAll(ll_A4206_2);
                ClearAllcontrol.ClearAll(ll_A4206_3);
                ClearAllcontrol.ClearAll(ll_A4206_4);
                ClearAllcontrol.ClearAll(ll_A4206_5);
                ClearAllcontrol.ClearAll(ll_A4206_6);
                ClearAllcontrol.ClearAll(ll_A4206_7);
                ClearAllcontrol.ClearAll(ll_A4206_8);
                ClearAllcontrol.ClearAll(ll_A4206_9);
                ClearAllcontrol.ClearAll(ll_A4206_10);
                ClearAllcontrol.ClearAll(ll_A4206_11);
                ClearAllcontrol.ClearAll(ll_A4206_12);
                ClearAllcontrol.ClearAll(ll_A4206_13);
                ClearAllcontrol.ClearAll(ll_A4206_14);
                ClearAllcontrol.ClearAll(ll_A4206_15);
                ClearAllcontrol.ClearAll(ll_A4206_16);
                ClearAllcontrol.ClearAll(ll_A4206_17);
                ClearAllcontrol.ClearAll(ll_A4206_18);
                ClearAllcontrol.ClearAll(ll_A4206_19);
                ClearAllcontrol.ClearAll(ll_A4206_20);
                ClearAllcontrol.ClearAll(ll_A4206_21);
                ClearAllcontrol.ClearAll(ll_A4206_22);
                ClearAllcontrol.ClearAll(ll_A4207);

                ll_A4206_1.setVisibility(View.GONE);
                ll_A4206_2.setVisibility(View.GONE);
                ll_A4206_3.setVisibility(View.GONE);
                ll_A4206_4.setVisibility(View.GONE);
                ll_A4206_5.setVisibility(View.GONE);
                ll_A4206_6.setVisibility(View.GONE);
                ll_A4206_7.setVisibility(View.GONE);
                ll_A4206_8.setVisibility(View.GONE);
                ll_A4206_9.setVisibility(View.GONE);
                ll_A4206_10.setVisibility(View.GONE);
                ll_A4206_11.setVisibility(View.GONE);
                ll_A4206_12.setVisibility(View.GONE);
                ll_A4206_13.setVisibility(View.GONE);
                ll_A4206_14.setVisibility(View.GONE);
                ll_A4206_15.setVisibility(View.GONE);
                ll_A4206_16.setVisibility(View.GONE);
                ll_A4206_17.setVisibility(View.GONE);
                ll_A4206_18.setVisibility(View.GONE);
                ll_A4206_19.setVisibility(View.GONE);
                ll_A4206_20.setVisibility(View.GONE);
                ll_A4206_21.setVisibility(View.GONE);
                ll_A4206_22.setVisibility(View.GONE);
                ll_A4207.setVisibility(View.GONE);

            } else {
                ll_A4206_1.setVisibility(View.VISIBLE);
                ll_A4206_2.setVisibility(View.VISIBLE);
                ll_A4206_3.setVisibility(View.VISIBLE);
                ll_A4206_4.setVisibility(View.VISIBLE);
                ll_A4206_5.setVisibility(View.VISIBLE);
                ll_A4206_6.setVisibility(View.VISIBLE);
                ll_A4206_7.setVisibility(View.VISIBLE);
                ll_A4206_8.setVisibility(View.VISIBLE);
                ll_A4206_9.setVisibility(View.VISIBLE);
                ll_A4206_10.setVisibility(View.VISIBLE);
                ll_A4206_11.setVisibility(View.VISIBLE);
                ll_A4206_12.setVisibility(View.VISIBLE);
                ll_A4206_13.setVisibility(View.VISIBLE);
                ll_A4206_14.setVisibility(View.VISIBLE);
                ll_A4206_15.setVisibility(View.VISIBLE);
                ll_A4206_16.setVisibility(View.VISIBLE);
                ll_A4206_17.setVisibility(View.VISIBLE);
                ll_A4206_18.setVisibility(View.VISIBLE);
                ll_A4206_19.setVisibility(View.VISIBLE);
                ll_A4206_20.setVisibility(View.VISIBLE);
                ll_A4206_21.setVisibility(View.VISIBLE);
                ll_A4206_22.setVisibility(View.VISIBLE);
                ll_A4207.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4206_1_1
                || compoundButton.getId() == R.id.rb_A4206_1_2
                || compoundButton.getId() == R.id.rb_A4206_1_DK
                || compoundButton.getId() == R.id.rb_A4206_1_RA)

        {
            if (rb_A4206_1_2.isChecked() || rb_A4206_1_DK.isChecked() || rb_A4206_1_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_2);
                ClearAllcontrol.ClearAll(ll_A4206_3);

                ll_A4206_2.setVisibility(View.GONE);
                ll_A4206_3.setVisibility(View.GONE);

            } else {
                ll_A4206_2.setVisibility(View.VISIBLE);
                ll_A4206_3.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4206_8_1
                || compoundButton.getId() == R.id.rb_A4206_8_2
                || compoundButton.getId() == R.id.rb_A4206_8_DK
                || compoundButton.getId() == R.id.rb_A4206_8_RA)

        {
            if (rb_A4206_8_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_9);

                ll_A4206_9.setVisibility(View.GONE);

            } else {
                ll_A4206_9.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4206_9_1
                || compoundButton.getId() == R.id.rb_A4206_9_2
                || compoundButton.getId() == R.id.rb_A4206_9_DK
                || compoundButton.getId() == R.id.rb_A4206_9_RA)

        {
            if (rb_A4206_9_2.isChecked() || rb_A4206_9_DK.isChecked() || rb_A4206_9_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_10);

                ll_A4206_10.setVisibility(View.GONE);

            } else {
                ll_A4206_10.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4206_21_1
                || compoundButton.getId() == R.id.rb_A4206_21_2
                || compoundButton.getId() == R.id.rb_A4206_21_DK
                || compoundButton.getId() == R.id.rb_A4206_21_RA)

        {
            if (rb_A4206_21_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_22);

                ll_A4206_22.setVisibility(View.GONE);

            } else {
                ll_A4206_22.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4206_21_1
                || compoundButton.getId() == R.id.rb_A4206_21_2
                || compoundButton.getId() == R.id.rb_A4206_21_DK
                || compoundButton.getId() == R.id.rb_A4206_21_RA)

        {
            if (rb_A4206_21_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_22);

                ll_A4206_22.setVisibility(View.GONE);

            } else {
                ll_A4206_22.setVisibility(View.VISIBLE);
            }
        }


    }


    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4206) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4206) != false;
    }

}

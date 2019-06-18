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

        json.put("A4206", bind.A4206a.isChecked() ? "1"
                : bind.A4206b.isChecked() ? "2"
                : bind.A420698.isChecked() ? "98"
                : bind.A420699.isChecked() ? "99"
                : "0");

        json.put("A42061", bind.A42061a.isChecked() ? "1"
                : bind.A42061b.isChecked() ? "2"
                : bind.A4206198.isChecked() ? "98"
                : bind.A4206199.isChecked() ? "99"
                : "0");

        json.put("A42062", bind.A42062a.isChecked() ? "1"
                : bind.A42062b.isChecked() ? "2"
                : bind.A42062c.isChecked() ? "3"
                : bind.A42062d.isChecked() ? "4"
                : bind.A42062e.isChecked() ? "5"
                : bind.A4206296.isChecked() ? "96"
                : bind.A4206298.isChecked() ? "98"
                : bind.A4206299.isChecked() ? "99"
                : "0");

        json.put("A42063", bind.A42063a.isChecked() ? "1"
                : bind.A42063b.isChecked() ? "2"
                : bind.A42063c.isChecked() ? "3"
                : bind.A42063d.isChecked() ? "4"
                : bind.A42063e.isChecked() ? "5"
                : bind.A42063f.isChecked() ? "6"
                : bind.A4206396.isChecked() ? "96"
                : bind.A4206398.isChecked() ? "98"
                : bind.A4206399.isChecked() ? "99"
                : "0");

        json.put("A42064", bind.A42064a.isChecked() ? "1"
                : bind.A42064b.isChecked() ? "2"
                : bind.A4206498.isChecked() ? "98"
                : bind.A4206499.isChecked() ? "99"
                : "0");

        json.put("A42065", bind.A42065a.isChecked() ? "1"
                : bind.A42065b.isChecked() ? "2"
                : bind.A4206598.isChecked() ? "98"
                : bind.A4206599.isChecked() ? "99"
                : "0");

        json.put("A42066", bind.A42066a.isChecked() ? "1"
                : bind.A42066b.isChecked() ? "2"
                : bind.A4206698.isChecked() ? "98"
                : bind.A4206699.isChecked() ? "99"
                : "0");

        json.put("A42067", bind.A42067a.isChecked() ? "1"
                : bind.A42067b.isChecked() ? "2"
                : bind.A4206798.isChecked() ? "98"
                : bind.A4206799.isChecked() ? "99"
                : "0");

        json.put("A42068", bind.A42068a.isChecked() ? "1"
                : bind.A42068b.isChecked() ? "2"
                : bind.A4206898.isChecked() ? "98"
                : bind.A4206899.isChecked() ? "99"
                : "0");

        json.put("A42069", bind.A42069a.isChecked() ? "1"
                : bind.A42069b.isChecked() ? "2"
                : bind.A4206998.isChecked() ? "98"
                : bind.A4206999.isChecked() ? "99"
                : "0");

        json.put("A420610", bind.A420610a.isChecked() ? "1"
                : bind.A420610b.isChecked() ? "2"
                : bind.A420610c.isChecked() ? "3"
                : bind.A42061096.isChecked() ? "96"
                : bind.A42061098.isChecked() ? "98"
                : bind.A42061099.isChecked() ? "99"
                : "0");

        json.put("A420611", bind.A420611a.isChecked() ? "1"
                : bind.A420611b.isChecked() ? "2"
                : bind.A42061198.isChecked() ? "98"
                : bind.A42061199.isChecked() ? "99"
                : "0");

        json.put("A420612", bind.A420612a.isChecked() ? "1"
                : bind.A420612b.isChecked() ? "2"
                : bind.A42061298.isChecked() ? "98"
                : bind.A42061299.isChecked() ? "99"
                : "0");

        json.put("A420613", bind.A420613a.isChecked() ? "1"
                : bind.A420613b.isChecked() ? "2"
                : bind.A42061398.isChecked() ? "98"
                : bind.A42061399.isChecked() ? "99"
                : "0");

        json.put("A420614", bind.A420614a.isChecked() ? "1"
                : bind.A420614b.isChecked() ? "2"
                : bind.A42061498.isChecked() ? "98"
                : bind.A42061499.isChecked() ? "99"
                : "0");

        json.put("A420615", bind.A420615a.isChecked() ? "1"
                : bind.A420615b.isChecked() ? "2"
                : bind.A42061598.isChecked() ? "98"
                : bind.A42061599.isChecked() ? "99"
                : "0");

        json.put("A420616", bind.A420616a.isChecked() ? "1"
                : bind.A420616b.isChecked() ? "2"
                : bind.A42061698.isChecked() ? "98"
                : bind.A42061699.isChecked() ? "99"
                : "0");

        json.put("A420617", bind.A420617a.isChecked() ? "1"
                : bind.A420617b.isChecked() ? "2"
                : bind.A42061798.isChecked() ? "98"
                : bind.A42061799.isChecked() ? "99"
                : "0");

        json.put("A420618", bind.A420618a.isChecked() ? "1"
                : bind.A420618b.isChecked() ? "2"
                : bind.A42061898.isChecked() ? "98"
                : bind.A42061899.isChecked() ? "99"
                : "0");

        json.put("A420619", bind.A420619a.isChecked() ? "1"
                : bind.A420619b.isChecked() ? "2"
                : bind.A42061998.isChecked() ? "98"
                : bind.A42061999.isChecked() ? "99"
                : "0");

        json.put("A420620", bind.A420620a.isChecked() ? "1"
                : bind.A420620b.isChecked() ? "2"
                : bind.A42062098.isChecked() ? "98"
                : bind.A42062099.isChecked() ? "99"
                : "0");

        json.put("A420621", bind.A420621a.isChecked() ? "1"
                : bind.A420621b.isChecked() ? "2"
                : bind.A42062198.isChecked() ? "98"
                : bind.A42062199.isChecked() ? "99"
                : "0");

        json.put("A420622", bind.A420622a.isChecked() ? "1"
                : bind.A420622b.isChecked() ? "2"
                : bind.A42062298.isChecked() ? "98"
                : bind.A42062299.isChecked() ? "99"
                : "0");

        json.put("A4207", bind.A4207H.getText().toString().trim().length() > 0 ? bind.A4207H.getText().toString()
                : bind.A4207D.getText().toString().trim().length() > 0 ? bind.A4207D.getText().toString()
                : bind.A420798.isChecked() ? "98"
                : "0");

        json.put("A4207H", bind.A4207H.getText().toString().trim().length() > 0 ? bind.A4207H.getText().toString() : "0");
        json.put("A4207D", bind.A4207D.getText().toString().trim().length() > 0 ? bind.A4207D.getText().toString() : "0");

        json.put("A420798", bind.A420798.isChecked() ? "98" : "0");

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

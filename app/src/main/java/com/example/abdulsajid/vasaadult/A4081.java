package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4081Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4081 extends AppCompatActivity {

    A4081Binding bind;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4081);
        bind.setCallback(this);
        //this.setTitle("A4081");
        setupSkips();
        
    }


    private void setupSkips() {

        bind.A4081.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4081a.getId()) {
                    bind.A4082ucv.setVisibility(View.VISIBLE);
                    bind.A4082Dcv.setVisibility(View.VISIBLE);
                    bind.A4082Mcv.setVisibility(View.VISIBLE);
                    bind.A4082Ycv.setVisibility(View.VISIBLE);
                    bind.A4083cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4082ucv);
                    ClearAllcontrol.ClearAllC(bind.A4082Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4082Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4082Ycv);
                    ClearAllcontrol.ClearAllC(bind.A4083cv);
                    bind.A4082ucv.setVisibility(View.GONE);
                    bind.A4082Dcv.setVisibility(View.GONE);
                    bind.A4082Mcv.setVisibility(View.GONE);
                    bind.A4082Ycv.setVisibility(View.GONE);
                    bind.A4083cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4082u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4082Dcv);
                ClearAllcontrol.ClearAllC(bind.A4082Mcv);
                ClearAllcontrol.ClearAllC(bind.A4082Ycv);

                bind.A4082Dcv.setVisibility(View.GONE);
                bind.A4082Mcv.setVisibility(View.GONE);
                bind.A4082Ycv.setVisibility(View.GONE);

                if (checkedId == bind.A4082ua.getId()) {
                    bind.A4082Dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4082ub.getId()) {
                    bind.A4082Mcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4082uc.getId()) {
                    bind.A4082Ycv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4084.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4084a.getId()) {
                    bind.A4085ucv.setVisibility(View.VISIBLE);
                    bind.A4085Dcv.setVisibility(View.VISIBLE);
                    bind.A4085Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4085ucv);
                    ClearAllcontrol.ClearAllC(bind.A4085Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4085Mcv);
                    bind.A4085ucv.setVisibility(View.GONE);
                    bind.A4085Dcv.setVisibility(View.GONE);
                    bind.A4085Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4085u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4085Dcv);
                ClearAllcontrol.ClearAllC(bind.A4085Mcv);
                bind.A4085Dcv.setVisibility(View.GONE);
                bind.A4085Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4085ua.getId()) {
                    bind.A4085Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4085ub.getId()) {
                    bind.A4085Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4086.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4086a.getId()) {
                    bind.A4087ucv.setVisibility(View.VISIBLE);
                    bind.A4087Dcv.setVisibility(View.VISIBLE);
                    bind.A4087Mcv.setVisibility(View.VISIBLE);
                    bind.A4088cv.setVisibility(View.VISIBLE);
                    bind.A4089cv.setVisibility(View.VISIBLE);
                    
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4087ucv);
                    ClearAllcontrol.ClearAllC(bind.A4087Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4087Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4088cv);
                    ClearAllcontrol.ClearAllC(bind.A4089cv);

                    bind.A4087ucv.setVisibility(View.GONE);
                    bind.A4087Dcv.setVisibility(View.GONE);
                    bind.A4087Mcv.setVisibility(View.GONE);
                    bind.A4088cv.setVisibility(View.GONE);
                    bind.A4089cv.setVisibility(View.GONE);
                }

            }

        });

        bind.A4087u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4087Dcv);
                ClearAllcontrol.ClearAllC(bind.A4087Mcv);
                bind.A4087Dcv.setVisibility(View.GONE);
                bind.A4087Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4087ua.getId()) {
                    bind.A4087Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4087ub.getId()) {
                    bind.A4087Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4091.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4091a.getId()) {
                    bind.A4092cv.setVisibility(View.VISIBLE);
                    bind.A4093cv.setVisibility(View.VISIBLE);
                    bind.A4094ucv.setVisibility(View.VISIBLE);
                    bind.A4094mcv.setVisibility(View.VISIBLE);
                    bind.A4094Hcv.setVisibility(View.VISIBLE);
                    bind.A4094Dcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4092cv);
                    ClearAllcontrol.ClearAllC(bind.A4093cv);
                    ClearAllcontrol.ClearAllC(bind.A4094ucv);
                    ClearAllcontrol.ClearAllC(bind.A4094mcv);
                    ClearAllcontrol.ClearAllC(bind.A4094Hcv);
                    ClearAllcontrol.ClearAllC(bind.A4094Dcv);

                    bind.A4092cv.setVisibility(View.GONE);
                    bind.A4093cv.setVisibility(View.GONE);
                    bind.A4094ucv.setVisibility(View.GONE);
                    bind.A4094mcv.setVisibility(View.GONE);
                    bind.A4094Hcv.setVisibility(View.GONE);
                    bind.A4094Dcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4094u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4094mcv);
                ClearAllcontrol.ClearAllC(bind.A4094Hcv);
                ClearAllcontrol.ClearAllC(bind.A4094Dcv);
                bind.A4094mcv.setVisibility(View.GONE);
                bind.A4094Hcv.setVisibility(View.GONE);
                bind.A4094Dcv.setVisibility(View.GONE);

                if (checkedId == bind.A4094ua.getId()) {
                    bind.A4094mcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4094ub.getId()) {
                    bind.A4094Hcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4094uc.getId()) {
                    bind.A4094Dcv.setVisibility(View.VISIBLE);
                }

            }

        });

    }


    public void BtnContinue() {
        /*if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4067.this, A4081.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }*/


        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Intent c2 = new Intent(com.example.abdulsajid.vasaadult.A4081.this, A4095.class);
        startActivity(c2);

    }


    public void BtnEnd() {
        Intent i = new Intent(A4081.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        Global.A.A4081_A4094.A4081 = bind.A4081a.isChecked() ? "1"
                : bind.A4081b.isChecked() ? "2"
                : bind.A408198.isChecked() ? "98"
                : bind.A408199.isChecked() ? "99"
                : "0";

        Global.A.A4081_A4094.A4082u = bind.A4082ua.isChecked() ? "1"
                : bind.A4082ub.isChecked() ? "2"
                : bind.A4082uc.isChecked() ? "3"
                : bind.A4082u98.isChecked() ? "98"
                : bind.A4082u99.isChecked() ? "99"
                : "0";

        json.put("A4082D", bind.A4082D.getText().toString().trim().length() > 0 ? bind.A4082D.getText().toString() : "0");
        json.put("A4082M", bind.A4082M.getText().toString().trim().length() > 0 ? bind.A4082M.getText().toString() : "0");
        json.put("A4082Y", bind.A4082Y.getText().toString().trim().length() > 0 ? bind.A4082Y.getText().toString() : "0");

        json.put("A4083", bind.A4083a.isChecked() ? "1"
                : bind.A4083b.isChecked() ? "2"
                : bind.A408398.isChecked() ? "98"
                : bind.A408399.isChecked() ? "99"
                : "0");

        json.put("A4084", bind.A4084a.isChecked() ? "1"
                : bind.A4084b.isChecked() ? "2"
                : bind.A408498.isChecked() ? "98"
                : bind.A408499.isChecked() ? "99"
                : "0");

        json.put("A4085u", bind.A4085ua.isChecked() ? "1"
                : bind.A4085ub.isChecked() ? "2"
                : bind.A4085u98.isChecked() ? "98"
                : bind.A4085u99.isChecked() ? "99"
                : "0");

        json.put("A4085D", bind.A4085D.getText().toString().trim().length() > 0 ? bind.A4085D.getText().toString() : "0");
        json.put("A4085M", bind.A4085M.getText().toString().trim().length() > 0 ? bind.A4085M.getText().toString() : "0");

        json.put("A4086", bind.A4086a.isChecked() ? "1"
                : bind.A4086b.isChecked() ? "2"
                : bind.A408698.isChecked() ? "98"
                : bind.A408699.isChecked() ? "99"
                : "0");

        json.put("A4087u", bind.A4087ua.isChecked() ? "Days"
                : bind.A4087ub.isChecked() ? "Months"
                : bind.A4087u98.isChecked() ? "98"
                : bind.A4087u99.isChecked() ? "99"
                : "0");

        json.put("A4087D", bind.A4087D.getText().toString().trim().length() > 0 ? bind.A4087D.getText().toString() : "0");
        json.put("A4087M", bind.A4087M.getText().toString().trim().length() > 0 ? bind.A4087M.getText().toString() : "0");

        json.put("A4088", bind.A4088a.isChecked() ? "1"
                : bind.A4088b.isChecked() ? "2"
                : bind.A408898.isChecked() ? "98"
                : bind.A408899.isChecked() ? "99"
                : "0");

        json.put("A4089", bind.A4089a.isChecked() ? "1"
                : bind.A4089b.isChecked() ? "2"
                : bind.A408998.isChecked() ? "98"
                : bind.A408999.isChecked() ? "99"
                : "0");

        json.put("A4090", bind.A4090a.isChecked() ? "1"
                : bind.A4090b.isChecked() ? "2"
                : bind.A409098.isChecked() ? "98"
                : bind.A409099.isChecked() ? "99"
                : "0");

        json.put("A4091", bind.A4091a.isChecked() ? "1"
                : bind.A4091b.isChecked() ? "2"
                : bind.A409198.isChecked() ? "98"
                : bind.A409199.isChecked() ? "99"
                : "0");

        json.put("A4092", bind.A4092a.isChecked() ? "1"
                : bind.A4092b.isChecked() ? "2"
                : bind.A409298.isChecked() ? "98"
                : bind.A409299.isChecked() ? "99"
                : "0");

        json.put("A4093", bind.A4093.getText().toString().trim().length() > 0 ? bind.A4093.getText().toString() : "0");

        json.put("A4094u", bind.A4094ua.isChecked() ? "Minutes"
                : bind.A4094ub.isChecked() ? "Hours"
                : bind.A4094uc.isChecked() ? "Days"
                : bind.A4094u98.isChecked() ? "98"
                : bind.A4094u99.isChecked() ? "99"
                : "0");

        json.put("A4094m", bind.A4094m.getText().toString().trim().length() > 0 ? bind.A4094m.getText().toString() : "0");
        json.put("A4094H", bind.A4094H.getText().toString().trim().length() > 0 ? bind.A4094H.getText().toString() : "0");
        json.put("A4094D", bind.A4094D.getText().toString().trim().length() > 0 ? bind.A4094D.getText().toString() : "0");

//        MyPreferences.setsA4081(String.valueOf(json));

    }


    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4081) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4081) != false;
    }
}

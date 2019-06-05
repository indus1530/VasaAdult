package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4081Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4081 extends AppCompatActivity {

    A4081Binding bind;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4081);
        bind.setCallback(this);
        //this.setTitle("Quality of Care 06");
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

        json.put("A4081", bind.A4081a.isChecked() ? "1"
                : bind.A4081b.isChecked() ? "2"
                : bind.A408198.isChecked() ? "98"
                : bind.A408199.isChecked() ? "99"
                : "0");

        json.put("A4082u", bind.A4082ua.isChecked() ? "1"
                : bind.A4082ub.isChecked() ? "2"
                : bind.A4082uc.isChecked() ? "3"
                : bind.A4082u98.isChecked() ? "98"
                : bind.A4082u99.isChecked() ? "99"
                : "0");

        json.put("A4069u", bind.A4069ua.isChecked() ? "Hours"
                : bind.A4069ub.isChecked() ? "Days"
                : bind.A4069uc.isChecked() ? "Months"
                : bind.A4069u98.isChecked() ? "98"
                : bind.A4069u99.isChecked() ? "99"
                : "0");

        json.put("A4069H", bind.A4069H.getText().toString().trim().length() > 0 ? bind.A4069H.getText().toString() : "0");
        json.put("A4069D", bind.A4069D.getText().toString().trim().length() > 0 ? bind.A4069D.getText().toString() : "0");
        json.put("A4069M", bind.A4069M.getText().toString().trim().length() > 0 ? bind.A4069M.getText().toString() : "0");

        json.put("A4070", bind.A4070a.isChecked() ? "1"
                : bind.A4070b.isChecked() ? "2"
                : bind.A4070c.isChecked() ? "3"
                : bind.A407098.isChecked() ? "98"
                : bind.A407099.isChecked() ? "99"
                : "0");

        json.put("A4071", bind.A4071a.isChecked() ? "1"
                : bind.A4071b.isChecked() ? "2"
                : bind.A407198.isChecked() ? "98"
                : bind.A407199.isChecked() ? "99"
                : "0");

        json.put("A4072u", bind.A4072ua.isChecked() ? "Days"
                : bind.A4072ub.isChecked() ? "Months"
                : bind.A4072u98.isChecked() ? "98"
                : bind.A4072u99.isChecked() ? "99"
                : "0");

        json.put("A4072D", bind.A4072D.getText().toString().trim().length() > 0 ? bind.A4072D.getText().toString() : "0");
        json.put("A4072M", bind.A4072M.getText().toString().trim().length() > 0 ? bind.A4072M.getText().toString() : "0");

        json.put("A4073", bind.A4073a.isChecked() ? "1"
                : bind.A4073b.isChecked() ? "2"
                : bind.A407398.isChecked() ? "98"
                : bind.A407399.isChecked() ? "99"
                : "0");

        json.put("A4074", bind.A4074a.isChecked() ? "1"
                : bind.A4074b.isChecked() ? "2"
                : bind.A407498.isChecked() ? "98"
                : bind.A407499.isChecked() ? "99"
                : "0");

        json.put("A4075u", bind.A4075ua.isChecked() ? "Days"
                : bind.A4075ub.isChecked() ? "Months"
                : bind.A4075u98.isChecked() ? "98"
                : bind.A4075u99.isChecked() ? "99"
                : "0");

        json.put("A4075D", bind.A4075D.getText().toString().trim().length() > 0 ? bind.A4075D.getText().toString() : "0");
        json.put("A4075M", bind.A4075M.getText().toString().trim().length() > 0 ? bind.A4075M.getText().toString() : "0");

        json.put("A4076", bind.A4076a.isChecked() ? "1"
                : bind.A4076b.isChecked() ? "2"
                : bind.A407698.isChecked() ? "98"
                : bind.A407699.isChecked() ? "99"
                : "0");

        json.put("A4077u", bind.A4077ua.isChecked() ? "Days"
                : bind.A4077ub.isChecked() ? "Months"
                : bind.A4077u98.isChecked() ? "98"
                : bind.A4077u99.isChecked() ? "99"
                : "0");

        json.put("A4077D", bind.A4077D.getText().toString().trim().length() > 0 ? bind.A4077D.getText().toString() : "0");
        json.put("A4077M", bind.A4077M.getText().toString().trim().length() > 0 ? bind.A4077M.getText().toString() : "0");

        json.put("A4078", bind.A4078a.isChecked() ? "1"
                : bind.A4078b.isChecked() ? "2"
                : bind.A407898.isChecked() ? "98"
                : bind.A407899.isChecked() ? "99"
                : "0");

        json.put("A4079", bind.A4079a.isChecked() ? "1"
                : bind.A4079b.isChecked() ? "2"
                : bind.A407998.isChecked() ? "98"
                : bind.A407999.isChecked() ? "99"
                : "0");

        json.put("A4080", bind.A4080a.isChecked() ? "1"
                : bind.A4080b.isChecked() ? "2"
                : bind.A408098.isChecked() ? "98"
                : bind.A408099.isChecked() ? "99"
                : "0");

        MyPreferences.setsA4067(String.valueOf(json));

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


    }


    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4081) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4081) != false;
    }
}

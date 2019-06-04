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
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4087ucv);
                    ClearAllcontrol.ClearAllC(bind.A4087Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4087Mcv);

                    bind.A4087ucv.setVisibility(View.GONE);
                    bind.A4087Dcv.setVisibility(View.GONE);
                    bind.A4087Mcv.setVisibility(View.GONE);
                }

            }

        });

        bind.A4075u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4075Dcv);
                ClearAllcontrol.ClearAllC(bind.A4075Mcv);
                bind.A4075Dcv.setVisibility(View.GONE);
                bind.A4075Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4075ua.getId()) {
                    bind.A4075Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4075ub.getId()) {
                    bind.A4075Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4076.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4076a.getId()) {
                    bind.A4077ucv.setVisibility(View.VISIBLE);
                    bind.A4077Dcv.setVisibility(View.VISIBLE);
                    bind.A4077Mcv.setVisibility(View.VISIBLE);
                    bind.A4078cv.setVisibility(View.VISIBLE);
                    bind.A4079cv.setVisibility(View.VISIBLE);
                    bind.A4080cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4077ucv);
                    ClearAllcontrol.ClearAllC(bind.A4077Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4077Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4078cv);
                    ClearAllcontrol.ClearAllC(bind.A4079cv);
                    ClearAllcontrol.ClearAllC(bind.A4080cv);

                    bind.A4077ucv.setVisibility(View.GONE);
                    bind.A4077Dcv.setVisibility(View.GONE);
                    bind.A4077Mcv.setVisibility(View.GONE);
                    bind.A4078cv.setVisibility(View.GONE);
                    bind.A4079cv.setVisibility(View.GONE);
                    bind.A4080cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4077u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4077Dcv);
                ClearAllcontrol.ClearAllC(bind.A4077Mcv);
                bind.A4077Dcv.setVisibility(View.GONE);
                bind.A4077Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4077ua.getId()) {
                    bind.A4077Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4077ub.getId()) {
                    bind.A4077Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        if (compoundButton.getId() == R.id.rb_A4086_1
                || compoundButton.getId() == R.id.rb_A4086_2
                || compoundButton.getId() == R.id.rb_A4086_DK
                || compoundButton.getId() == R.id.rb_A4086_RA) {
            if (rb_A4086_2.isChecked() || rb_A4086_DK.isChecked() || rb_A4086_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4087_u);
                ClearAllcontrol.ClearAll(ll_A4087_a);
                ClearAllcontrol.ClearAll(ll_A4087_b);
                ClearAllcontrol.ClearAll(ll_A4088);
                ClearAllcontrol.ClearAll(ll_A4089);

                ll_A4087_u.setVisibility(View.GONE);
                ll_A4087_a.setVisibility(View.GONE);
                ll_A4087_b.setVisibility(View.GONE);
                ll_A4088.setVisibility(View.GONE);
                ll_A4089.setVisibility(View.GONE);

            } else {
                ll_A4087_u.setVisibility(View.VISIBLE);
                ll_A4087_a.setVisibility(View.VISIBLE);
                ll_A4087_b.setVisibility(View.VISIBLE);
                ll_A4088.setVisibility(View.VISIBLE);
                ll_A4089.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4087_u_1
                || compoundButton.getId() == R.id.rb_A4087_u_2
                || compoundButton.getId() == R.id.rb_A4087_u_DK
                || compoundButton.getId() == R.id.rb_A4087_u_RA)

            ClearAllcontrol.ClearAll(ll_A4087_a);
        ClearAllcontrol.ClearAll(ll_A4087_b);

        ll_A4087_a.setVisibility(View.GONE);
        ll_A4087_b.setVisibility(View.GONE);

        {
            if (rb_A4087_u_1.isChecked()) {
                ll_A4087_a.setVisibility(View.VISIBLE);
            } else if (rb_A4087_u_2.isChecked()) {
                ll_A4087_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4091_1
                || compoundButton.getId() == R.id.rb_A4091_2
                || compoundButton.getId() == R.id.rb_A4091_DK
                || compoundButton.getId() == R.id.rb_A4091_RA) {
            if (rb_A4091_2.isChecked() || rb_A4091_DK.isChecked() || rb_A4091_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4092);
                ClearAllcontrol.ClearAll(ll_A4093);
                ClearAllcontrol.ClearAll(ll_A4094_u);
                ClearAllcontrol.ClearAll(ll_A4094_a);
                ClearAllcontrol.ClearAll(ll_A4094_b);
                ClearAllcontrol.ClearAll(ll_A4094_c);

                ll_A4092.setVisibility(View.GONE);
                ll_A4093.setVisibility(View.GONE);
                ll_A4094_u.setVisibility(View.GONE);
                ll_A4094_a.setVisibility(View.GONE);
                ll_A4094_b.setVisibility(View.GONE);
                ll_A4094_c.setVisibility(View.GONE);

            } else {
                ll_A4092.setVisibility(View.VISIBLE);
                ll_A4093.setVisibility(View.VISIBLE);
                ll_A4094_u.setVisibility(View.VISIBLE);
                ll_A4094_a.setVisibility(View.VISIBLE);
                ll_A4094_b.setVisibility(View.VISIBLE);
                ll_A4094_c.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4094_u_1
                || compoundButton.getId() == R.id.rb_A4094_u_2
                || compoundButton.getId() == R.id.rb_A4094_u_3
                || compoundButton.getId() == R.id.rb_A4094_u_DK
                || compoundButton.getId() == R.id.rb_A4094_u_RA)

            ClearAllcontrol.ClearAll(ll_A4094_a);
        ClearAllcontrol.ClearAll(ll_A4094_b);
        ClearAllcontrol.ClearAll(ll_A4094_c);

        ll_A4094_a.setVisibility(View.GONE);
        ll_A4094_b.setVisibility(View.GONE);
        ll_A4094_c.setVisibility(View.GONE);

        {
            if (rb_A4094_u_1.isChecked()) {
                ll_A4094_a.setVisibility(View.VISIBLE);
            } else if (rb_A4094_u_2.isChecked()) {
                ll_A4094_b.setVisibility(View.VISIBLE);
            } else if (rb_A4094_u_3.isChecked()) {
                ll_A4094_c.setVisibility(View.VISIBLE);
            }
        }

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

        json.put("A4067", bind.A4067a.isChecked() ? "1"
                : bind.A4067b.isChecked() ? "2"
                : bind.A406798.isChecked() ? "98"
                : bind.A406799.isChecked() ? "99"
                : "0");

        json.put("A4068", bind.A4068a.isChecked() ? "1"
                : bind.A4068b.isChecked() ? "2"
                : bind.A406898.isChecked() ? "98"
                : bind.A406899.isChecked() ? "99"
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

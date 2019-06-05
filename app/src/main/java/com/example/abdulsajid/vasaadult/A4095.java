package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4095Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4095 extends AppCompatActivity {
    A4095Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4095);
        bind.setCallback(this);
        //this.setTitle("Quality of Care 06");
        setupSkips();

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4095.this, A4109.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4095.this, HomeActivity.class);
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

    private void setupSkips() {

        bind.A4067.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4067a.getId()) {
                    bind.A4068cv.setVisibility(View.VISIBLE);
                    bind.A4069ucv.setVisibility(View.VISIBLE);
                    bind.A4069Hcv.setVisibility(View.VISIBLE);
                    bind.A4069Dcv.setVisibility(View.VISIBLE);
                    bind.A4069Mcv.setVisibility(View.VISIBLE);
                    bind.A4070cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4068cv);
                    ClearAllcontrol.ClearAllC(bind.A4069ucv);
                    ClearAllcontrol.ClearAllC(bind.A4069Hcv);
                    ClearAllcontrol.ClearAllC(bind.A4069Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4069Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4070cv);
                    bind.A4068cv.setVisibility(View.GONE);
                    bind.A4069ucv.setVisibility(View.GONE);
                    bind.A4069Hcv.setVisibility(View.GONE);
                    bind.A4069Dcv.setVisibility(View.GONE);
                    bind.A4069Mcv.setVisibility(View.GONE);
                    bind.A4070cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4069u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4069Hcv);
                ClearAllcontrol.ClearAllC(bind.A4069Dcv);
                ClearAllcontrol.ClearAllC(bind.A4069Mcv);

                bind.A4069Hcv.setVisibility(View.GONE);
                bind.A4069Dcv.setVisibility(View.GONE);
                bind.A4069Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4069ua.getId()) {
                    bind.A4069Hcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4069ub.getId()) {
                    bind.A4069Dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4069uc.getId()) {
                    bind.A4069Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4071.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4071a.getId()) {
                    bind.A4072ucv.setVisibility(View.VISIBLE);
                    bind.A4072Dcv.setVisibility(View.VISIBLE);
                    bind.A4072Mcv.setVisibility(View.VISIBLE);
                    bind.A4073cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4072ucv);
                    ClearAllcontrol.ClearAllC(bind.A4072Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4072Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4073cv);
                    bind.A4072ucv.setVisibility(View.GONE);
                    bind.A4072Dcv.setVisibility(View.GONE);
                    bind.A4072Mcv.setVisibility(View.GONE);
                    bind.A4073cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4072u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4072Dcv);
                ClearAllcontrol.ClearAllC(bind.A4072Mcv);
                bind.A4072Dcv.setVisibility(View.GONE);
                bind.A4072Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4072ua.getId()) {
                    bind.A4072Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4072ub.getId()) {
                    bind.A4072Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4074.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4074a.getId()) {
                    bind.A4075ucv.setVisibility(View.VISIBLE);
                    bind.A4075Dcv.setVisibility(View.VISIBLE);
                    bind.A4075Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4075ucv);
                    ClearAllcontrol.ClearAllC(bind.A4075Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4075Mcv);

                    bind.A4075ucv.setVisibility(View.GONE);
                    bind.A4075Dcv.setVisibility(View.GONE);
                    bind.A4075Mcv.setVisibility(View.GONE);
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


        if (compoundButton.getId() == R.id.rb_A4096_1
                || compoundButton.getId() == R.id.rb_A4096_2
                || compoundButton.getId() == R.id.rb_A4096_DK
                || compoundButton.getId() == R.id.rb_A4096_RA) {
            if (rb_A4096_2.isChecked() || rb_A4096_DK.isChecked() || rb_A4096_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4097_u);
                ClearAllcontrol.ClearAll(ll_A4097_a);
                ClearAllcontrol.ClearAll(ll_A4097_b);

                ll_A4097_u.setVisibility(View.GONE);
                ll_A4097_a.setVisibility(View.GONE);
                ll_A4097_b.setVisibility(View.GONE);

            } else {
                ll_A4097_u.setVisibility(View.VISIBLE);
                ll_A4097_a.setVisibility(View.VISIBLE);
                ll_A4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4097_u_1
                || compoundButton.getId() == R.id.rb_A4097_u_2
                || compoundButton.getId() == R.id.rb_A4097_u_DK
                || compoundButton.getId() == R.id.rb_A4097_u_RA)

            ClearAllcontrol.ClearAll(ll_A4097_a);
        ClearAllcontrol.ClearAll(ll_A4097_b);

        ll_A4097_a.setVisibility(View.GONE);
        ll_A4097_b.setVisibility(View.GONE);

        {
            if (rb_A4097_u_1.isChecked()) {
                ll_A4097_a.setVisibility(View.VISIBLE);
            } else if (rb_A4097_u_2.isChecked()) {
                ll_A4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4098_1
                || compoundButton.getId() == R.id.rb_A4098_2
                || compoundButton.getId() == R.id.rb_A4098_DK
                || compoundButton.getId() == R.id.rb_A4098_RA) {
            if (rb_A4098_2.isChecked() || rb_A4098_DK.isChecked() || rb_A4098_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4099_u);
                ClearAllcontrol.ClearAll(ll_A4099_a);
                ClearAllcontrol.ClearAll(ll_A4099_b);

                ll_A4099_u.setVisibility(View.GONE);
                ll_A4099_a.setVisibility(View.GONE);
                ll_A4099_b.setVisibility(View.GONE);

            } else {
                ll_A4099_u.setVisibility(View.VISIBLE);
                ll_A4099_a.setVisibility(View.VISIBLE);
                ll_A4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4099_u_1
                || compoundButton.getId() == R.id.rb_A4099_u_2
                || compoundButton.getId() == R.id.rb_A4099_u_DK
                || compoundButton.getId() == R.id.rb_A4099_u_RA)

            ClearAllcontrol.ClearAll(ll_A4099_a);
        ClearAllcontrol.ClearAll(ll_A4099_b);

        ll_A4099_a.setVisibility(View.GONE);
        ll_A4099_b.setVisibility(View.GONE);

        {
            if (rb_A4099_u_1.isChecked()) {
                ll_A4099_a.setVisibility(View.VISIBLE);
            } else if (rb_A4099_u_2.isChecked()) {
                ll_A4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4100_1
                || compoundButton.getId() == R.id.rb_A4100_2
                || compoundButton.getId() == R.id.rb_A4100_DK
                || compoundButton.getId() == R.id.rb_A4100_RA) {
            if (rb_A4100_2.isChecked() || rb_A4100_DK.isChecked() || rb_A4100_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4101_u);
                ClearAllcontrol.ClearAll(ll_A4101_a);
                ClearAllcontrol.ClearAll(ll_A4101_b);

                ll_A4101_u.setVisibility(View.GONE);
                ll_A4101_a.setVisibility(View.GONE);
                ll_A4101_b.setVisibility(View.GONE);

            } else {
                ll_A4101_u.setVisibility(View.VISIBLE);
                ll_A4101_a.setVisibility(View.VISIBLE);
                ll_A4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4101_u_1
                || compoundButton.getId() == R.id.rb_A4101_u_2
                || compoundButton.getId() == R.id.rb_A4101_u_DK
                || compoundButton.getId() == R.id.rb_A4101_u_RA)

            ClearAllcontrol.ClearAll(ll_A4101_a);
        ClearAllcontrol.ClearAll(ll_A4101_b);

        ll_A4101_a.setVisibility(View.GONE);
        ll_A4101_b.setVisibility(View.GONE);

        {
            if (rb_A4101_u_1.isChecked()) {
                ll_A4101_a.setVisibility(View.VISIBLE);
            } else if (rb_A4101_u_2.isChecked()) {
                ll_A4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4102_1
                || compoundButton.getId() == R.id.rb_A4102_2
                || compoundButton.getId() == R.id.rb_A4102_DK
                || compoundButton.getId() == R.id.rb_A4102_RA) {
            if (rb_A4102_2.isChecked() || rb_A4102_DK.isChecked() || rb_A4102_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4103);
                ClearAllcontrol.ClearAll(ll_A4104);
                ClearAllcontrol.ClearAll(ll_A4105);

                ll_A4103.setVisibility(View.GONE);
                ll_A4104.setVisibility(View.GONE);
                ll_A4105.setVisibility(View.GONE);

            } else {
                ll_A4103.setVisibility(View.VISIBLE);
                ll_A4104.setVisibility(View.VISIBLE);
                ll_A4105.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4106_1
                || compoundButton.getId() == R.id.rb_A4106_2
                || compoundButton.getId() == R.id.rb_A4106_DK
                || compoundButton.getId() == R.id.rb_A4106_RA) {
            if (rb_A4106_2.isChecked() || rb_A4106_DK.isChecked() || rb_A4106_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4107);
                ClearAllcontrol.ClearAll(ll_A4108);

                ll_A4107.setVisibility(View.GONE);
                ll_A4108.setVisibility(View.GONE);

            } else {
                ll_A4107.setVisibility(View.VISIBLE);
                ll_A4108.setVisibility(View.VISIBLE);
            }
        }

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4095) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4095) != false;
    }


}

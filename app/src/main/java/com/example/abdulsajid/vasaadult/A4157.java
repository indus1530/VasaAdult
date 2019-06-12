package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4157Binding;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4157 extends AppCompatActivity {
    A4157Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4157);
        bind.setCallback(this);
        //this.setTitle("A4157");
        setupSkips();

    }

    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4157.this, A4206.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4157.this, HomeActivity.class);
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

        json.put("A4148", bind.A4148a.isChecked() ? "1"
                : bind.A4148b.isChecked() ? "2"
                : bind.A4148c.isChecked() ? "3"
                : bind.A4148d.isChecked() ? "4"
                : bind.A4148e.isChecked() ? "5"
                : bind.A4148f.isChecked() ? "6"
                : bind.A4148g.isChecked() ? "7"
                : bind.A414896.isChecked() ? "96"
                : bind.A414898.isChecked() ? "98"
                : bind.A414899.isChecked() ? "99"
                : "0");

        json.put("A4149", bind.A4149a.isChecked() ? "1"
                : bind.A4149b.isChecked() ? "2"
                : bind.A414998.isChecked() ? "98"
                : bind.A414999.isChecked() ? "99"
                : "0");

        json.put("A4150u", bind.A4150ua.isChecked() ? "Days"
                : bind.A4150ub.isChecked() ? "Months"
                : bind.A4150u98.isChecked() ? "98"
                : bind.A4150u99.isChecked() ? "99"
                : "0");


        json.put("A4150M", bind.A4150M.getText().toString().trim().length() > 0 ? bind.A4150M.getText().toString() : "0");

        json.put("A4151", bind.A4151a.isChecked() ? "1"
                : bind.A4151b.isChecked() ? "2"
                : bind.A4151c.isChecked() ? "3"
                : "0");

        json.put("A4152", bind.A4152a.isChecked() ? "1"
                : bind.A4152b.isChecked() ? "2"
                : bind.A415298.isChecked() ? "98"
                : bind.A415299.isChecked() ? "99"
                : "0");

        json.put("A4153", bind.A4153a.isChecked() ? "1"
                : bind.A4153b.isChecked() ? "2"
                : bind.A415398.isChecked() ? "98"
                : bind.A415399.isChecked() ? "99"
                : "0");

        json.put("A4154", bind.A4154a.isChecked() ? "1"
                : bind.A4154b.isChecked() ? "2"
                : bind.A415498.isChecked() ? "98"
                : bind.A415499.isChecked() ? "99"
                : "0");

        json.put("A4155", bind.A4155a.isChecked() ? "1"
                : bind.A4155b.isChecked() ? "2"
                : bind.A415598.isChecked() ? "98"
                : bind.A415599.isChecked() ? "99"
                : "0");

        json.put("A4156", bind.A4156a.isChecked() ? "Days"
                : bind.A4156b.isChecked() ? "Months"
                : bind.A415698.isChecked() ? "98"
                : bind.A415699.isChecked() ? "99"
                : "0");

        MyPreferences.setsA4144(String.valueOf(json));

    }

    private void setupSkips() {

        bind.A4146.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4146a.getId()) {
                    bind.A4147cv.setVisibility(View.VISIBLE);
                    bind.A4148cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4147cv);
                    ClearAllcontrol.ClearAllC(bind.A4148cv);
                    bind.A4147cv.setVisibility(View.GONE);
                    bind.A4148cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4149.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4149a.getId()) {
                    bind.A4150ucv.setVisibility(View.VISIBLE);
                    bind.A4150Dcv.setVisibility(View.VISIBLE);
                    bind.A4150Mcv.setVisibility(View.VISIBLE);
                    bind.A4151cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4150ucv);
                    ClearAllcontrol.ClearAllC(bind.A4150Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4150Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4151cv);
                    bind.A4150ucv.setVisibility(View.GONE);
                    bind.A4150Dcv.setVisibility(View.GONE);
                    bind.A4150Mcv.setVisibility(View.GONE);
                    bind.A4151cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4150u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4150Dcv);
                ClearAllcontrol.ClearAllC(bind.A4150Mcv);
                bind.A4150Dcv.setVisibility(View.GONE);
                bind.A4150Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4150ua.getId()) {
                    bind.A4150Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4150ub.getId()) {
                    bind.A4150Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4154.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4154a.getId()) {
                    bind.A4155cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4155cv);;
                    bind.A4155cv.setVisibility(View.GONE);
                }

            }

        });

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4157) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4157) != false;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4159_1
                || compoundButton.getId() == R.id.rb_A4159_2
                || compoundButton.getId() == R.id.rb_A4159_DK
                || compoundButton.getId() == R.id.rb_A4159_RA)

        {
            if (rb_A4159_2.isChecked() || rb_A4159_DK.isChecked() || rb_A4159_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4160);
                ClearAllcontrol.ClearAll(ll_A4161);
                ClearAllcontrol.ClearAll(ll_A4161_1);
                ClearAllcontrol.ClearAll(ll_A4162);
                ClearAllcontrol.ClearAll(ll_A4163_1);
                ClearAllcontrol.ClearAll(ll_A4163);
                ClearAllcontrol.ClearAll(ll_A4164);

                ll_A4160.setVisibility(View.GONE);
                ll_A4161.setVisibility(View.GONE);
                ll_A4161_1.setVisibility(View.GONE);
                ll_A4162.setVisibility(View.GONE);
                ll_A4163_1.setVisibility(View.GONE);
                ll_A4163.setVisibility(View.GONE);
                ll_A4164.setVisibility(View.GONE);

            } else {
                ll_A4160.setVisibility(View.VISIBLE);
                ll_A4161.setVisibility(View.VISIBLE);
                ll_A4161_1.setVisibility(View.VISIBLE);
                ll_A4162.setVisibility(View.VISIBLE);
                ll_A4163_1.setVisibility(View.VISIBLE);
                ll_A4163.setVisibility(View.VISIBLE);
                ll_A4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4160_1
                || compoundButton.getId() == R.id.rb_A4160_2
                || compoundButton.getId() == R.id.rb_A4160_DK
                || compoundButton.getId() == R.id.rb_A4160_RA)

        {
            if (rb_A4160_2.isChecked() || rb_A4160_DK.isChecked() || rb_A4160_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4161);

                ll_A4161.setVisibility(View.GONE);

            } else {
                ll_A4161.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4162_1
                || compoundButton.getId() == R.id.rb_A4162_2
                || compoundButton.getId() == R.id.rb_A4162_DK
                || compoundButton.getId() == R.id.rb_A4162_RA)

        {
            if (rb_A4162_2.isChecked() || rb_A4162_DK.isChecked() || rb_A4162_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4163_1);

                ll_A4163_1.setVisibility(View.GONE);

            } else {
                ll_A4163_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4163_1
                || compoundButton.getId() == R.id.rb_A4163_2
                || compoundButton.getId() == R.id.rb_A4163_DK
                || compoundButton.getId() == R.id.rb_A4163_RA)

        {
            if (rb_A4163_2.isChecked() || rb_A4163_DK.isChecked() || rb_A4163_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4164);

                ll_A4164.setVisibility(View.GONE);

            } else {
                ll_A4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4167_1
                || compoundButton.getId() == R.id.rb_A4167_2
                || compoundButton.getId() == R.id.rb_A4167_DK
                || compoundButton.getId() == R.id.rb_A4167_RA)

        {
            if (rb_A4167_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168_1);
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);
                ClearAllcontrol.ClearAll(ll_A4173_1);
                ClearAllcontrol.ClearAll(ll_A4173);
                ClearAllcontrol.ClearAll(ll_A4173_2);

                ll_A4168_1.setVisibility(View.GONE);
                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);
                ll_A4173_1.setVisibility(View.GONE);
                ll_A4173.setVisibility(View.GONE);
                ll_A4173_2.setVisibility(View.GONE);

            } else {
                ll_A4168_1.setVisibility(View.VISIBLE);
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
                ll_A4173_1.setVisibility(View.VISIBLE);
                ll_A4173.setVisibility(View.VISIBLE);
                ll_A4173_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_1_1
                || compoundButton.getId() == R.id.rb_A4168_1_2
                || compoundButton.getId() == R.id.rb_A4168_1_DK
                || compoundButton.getId() == R.id.rb_A4168_1_RA)

        {
            if (rb_A4168_1_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);

                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);

            } else {
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_3_1
                || compoundButton.getId() == R.id.rb_A4168_3_2
                || compoundButton.getId() == R.id.rb_A4168_3_DK
                || compoundButton.getId() == R.id.rb_A4168_3_RA)

        {
            if (rb_A4168_3_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168);

                ll_A4168.setVisibility(View.GONE);

            } else {
                ll_A4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_1
                || compoundButton.getId() == R.id.rb_A4168_2
                || compoundButton.getId() == R.id.rb_A4168_DK
                || compoundButton.getId() == R.id.rb_A4168_RA)

        {
            if (rb_A4168_2.isChecked() || rb_A4168_DK.isChecked() || rb_A4168_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4173_1);

                ll_A4173_1.setVisibility(View.GONE);

            } else {
                ll_A4173_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4173_1
                || compoundButton.getId() == R.id.rb_A4173_2
                || compoundButton.getId() == R.id.rb_A4173_DK
                || compoundButton.getId() == R.id.rb_A4173_RA)

        {
            if (rb_A4173_2.isChecked() || rb_A4173_DK.isChecked() || rb_A4173_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4173_2);
                ClearAllcontrol.ClearAll(ll_A4178_1);

                ll_A4173_2.setVisibility(View.GONE);
                ll_A4178_1.setVisibility(View.GONE);

            } else {
                ll_A4173_2.setVisibility(View.VISIBLE);
                ll_A4178_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4194_1
                || compoundButton.getId() == R.id.rb_A4194_2
                || compoundButton.getId() == R.id.rb_A4194_DK
                || compoundButton.getId() == R.id.rb_A4194_RA)

        {
            if (rb_A4194_2.isChecked() || rb_A4194_DK.isChecked() || rb_A4194_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4195);
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);
                ClearAllcontrol.ClearAll(ll_A4198_1);

                ll_A4195.setVisibility(View.GONE);
                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
                ll_A4198_1.setVisibility(View.GONE);

            } else {
                ll_A4195.setVisibility(View.VISIBLE);
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
                ll_A4198_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4195_1
                || compoundButton.getId() == R.id.rb_A4195_2
                || compoundButton.getId() == R.id.rb_A4195_DK
                || compoundButton.getId() == R.id.rb_A4195_RA)

        {
            if (rb_A4195_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);

                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);

            } else {
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4196_1
                || compoundButton.getId() == R.id.rb_A4196_2
                || compoundButton.getId() == R.id.rb_A4196_DK
                || compoundButton.getId() == R.id.rb_A4196_RA)

        {
            if (rb_A4196_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4197);

                ll_A4197.setVisibility(View.GONE);

            } else {
                ll_A4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4202_1
                || compoundButton.getId() == R.id.rb_A4202_2
                || compoundButton.getId() == R.id.rb_A4202_DK
                || compoundButton.getId() == R.id.rb_A4202_RA)

        {
            if (rb_A4202_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);

            } else {
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4203_1
                || compoundButton.getId() == R.id.rb_A4203_2
                || compoundButton.getId() == R.id.rb_A4203_DK
                || compoundButton.getId() == R.id.rb_A4203_RA)

        {
            if (rb_A4203_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4204.setVisibility(View.GONE);

            } else {
                ll_A4204.setVisibility(View.VISIBLE);
            }
        }

    }

    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bind.A41781M.getText().hashCode() == s.hashCode()) {
                if (bind.A41781M.getText().toString().trim().length() > 0 && Integer.parseInt(bind.A41781M.getText().toString().trim()) > 0) {
                    ClearAllcontrol.ClearAllC(bind.A41782cv);
                    bind.A41782cv.setVisibility(View.GONE);
                } else {
                    bind.A41782cv.setVisibility(View.VISIBLE);
                }
            }
        }

    };

}

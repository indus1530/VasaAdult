package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4144Binding;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4144 extends AppCompatActivity {
    A4144Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4144);
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

            Intent c2 = new Intent(A4144.this, A4157.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4144.this, HomeActivity.class);
        startActivity(i);

    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4144", bind.A4144a.isChecked() ? "1"
                : bind.A4144b.isChecked() ? "2"
                : bind.A414498.isChecked() ? "98"
                : bind.A414499.isChecked() ? "99"
                : "0");

        json.put("A4145", bind.A4145a.isChecked() ? "1"
                : bind.A4145b.isChecked() ? "2"
                : bind.A414598.isChecked() ? "98"
                : bind.A414599.isChecked() ? "99"
                : "0");

        json.put("A4146", bind.A4146a.isChecked() ? "1"
                : bind.A4146b.isChecked() ? "2"
                : bind.A414698.isChecked() ? "98"
                : bind.A414699.isChecked() ? "99"
                : "0");

        json.put("A4147", bind.A4147a.isChecked() ? "1"
                : bind.A4147b.isChecked() ? "2"
                : bind.A414798.isChecked() ? "98"
                : bind.A414799.isChecked() ? "99"
                : "0");

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

        json.put("A4150D", bind.A4150D.getText().toString().trim().length() > 0 ? bind.A4150D.getText().toString() : "0");
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

        bind.A4126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4126a.getId()) {
                    bind.A4127ucv.setVisibility(View.VISIBLE);
                    bind.A4127Dcv.setVisibility(View.VISIBLE);
                    bind.A4127Mcv.setVisibility(View.VISIBLE);
                    bind.A4128cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4127ucv);
                    ClearAllcontrol.ClearAllC(bind.A4127Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4127Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4128cv);
                    bind.A4127ucv.setVisibility(View.GONE);
                    bind.A4127Dcv.setVisibility(View.GONE);
                    bind.A4127Mcv.setVisibility(View.GONE);
                    bind.A4128cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4127u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4127Dcv);
                ClearAllcontrol.ClearAllC(bind.A4127Mcv);
                bind.A4127Dcv.setVisibility(View.GONE);
                bind.A4127Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4127ua.getId()) {
                    bind.A4127Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4127ub.getId()) {
                    bind.A4127Mcv.setVisibility(View.VISIBLE);
                }

            }

        });

        bind.A4129.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4129a.getId()) {
                    bind.A4130ucv.setVisibility(View.VISIBLE);
                    bind.A4130Dcv.setVisibility(View.VISIBLE);
                    bind.A4130Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4130ucv);
                    ClearAllcontrol.ClearAllC(bind.A4130Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4130Mcv);
                    bind.A4130ucv.setVisibility(View.GONE);
                    bind.A4130Dcv.setVisibility(View.GONE);
                    bind.A4130Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4130u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4130Dcv);
                ClearAllcontrol.ClearAllC(bind.A4130Mcv);
                bind.A4130Dcv.setVisibility(View.GONE);
                bind.A4130Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4130ua.getId()) {
                    bind.A4130Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4130ub.getId()) {
                    bind.A4130Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4134u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4134Dcv);
                ClearAllcontrol.ClearAllC(bind.A4134Mcv);
                bind.A4134Dcv.setVisibility(View.GONE);
                bind.A4134Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4134ua.getId()) {
                    bind.A4134Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4134ub.getId()) {
                    bind.A4134Mcv.setVisibility(View.VISIBLE);
                }

            }

        });



        if (compoundButton.getId() == R.id.rb_A4146_1
                || compoundButton.getId() == R.id.rb_A4146_2
                || compoundButton.getId() == R.id.rb_A4146_DK
                || compoundButton.getId() == R.id.rb_A4146_RA)

        {
            if (rb_A4146_2.isChecked() || rb_A4146_DK.isChecked() || rb_A4146_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4147);
                ClearAllcontrol.ClearAll(ll_A4148);

                ll_A4147.setVisibility(View.GONE);
                ll_A4148.setVisibility(View.GONE);

            } else {
                ll_A4147.setVisibility(View.VISIBLE);
                ll_A4148.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4149_1
                || compoundButton.getId() == R.id.rb_A4149_2
                || compoundButton.getId() == R.id.rb_A4149_DK
                || compoundButton.getId() == R.id.rb_A4149_RA)

        {
            if (rb_A4149_2.isChecked() || rb_A4149_DK.isChecked() || rb_A4149_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4150_u);
                ClearAllcontrol.ClearAll(ll_A4150_a);
                ClearAllcontrol.ClearAll(ll_A4150_b);
                ClearAllcontrol.ClearAll(ll_A4151);

                ll_A4150_u.setVisibility(View.GONE);
                ll_A4150_a.setVisibility(View.GONE);
                ll_A4150_b.setVisibility(View.GONE);
                ll_A4151.setVisibility(View.GONE);

            } else {
                ll_A4150_u.setVisibility(View.VISIBLE);
                ll_A4150_a.setVisibility(View.VISIBLE);
                ll_A4150_b.setVisibility(View.VISIBLE);
                ll_A4151.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4150_u_1
                || compoundButton.getId() == R.id.rb_A4150_u_2
                || compoundButton.getId() == R.id.rb_A4150_u_DK
                || compoundButton.getId() == R.id.rb_A4150_u_RA)

            ClearAllcontrol.ClearAll(ll_A4150_a);
        ClearAllcontrol.ClearAll(ll_A4150_b);

        ll_A4150_a.setVisibility(View.GONE);
        ll_A4150_b.setVisibility(View.GONE);

        {
            if (rb_A4150_u_1.isChecked()) {
                ll_A4150_a.setVisibility(View.VISIBLE);
            } else if (rb_A4150_u_2.isChecked()) {
                ll_A4150_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4154_1
                || compoundButton.getId() == R.id.rb_A4154_2
                || compoundButton.getId() == R.id.rb_A4154_DK
                || compoundButton.getId() == R.id.rb_A4154_RA)

        {
            if (rb_A4154_2.isChecked() || rb_A4154_DK.isChecked() || rb_A4154_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4155);

                ll_A4155.setVisibility(View.GONE);

            } else {
                ll_A4155.setVisibility(View.VISIBLE);
            }
        }
    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4144) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4144) != false;
    }


}

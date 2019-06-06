package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4126Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4126 extends AppCompatActivity {
    A4126Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4126);
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

            Intent c2 = new Intent(A4126.this, A4144.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4126.this, HomeActivity.class);
        startActivity(i);

    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4126", bind.A4126a.isChecked() ? "1"
                : bind.A4126b.isChecked() ? "2"
                : bind.A412698.isChecked() ? "98"
                : bind.A412699.isChecked() ? "99"
                : "0");

        json.put("A4127u", bind.A4127ua.isChecked() ? "Days"
                : bind.A4127ub.isChecked() ? "Months"
                : bind.A4127u98.isChecked() ? "98"
                : bind.A4127u99.isChecked() ? "99"
                : "0");

        json.put("A4127D", bind.A4127D.getText().toString().trim().length() > 0 ? bind.A4127D.getText().toString() : "0");
        json.put("A4127M", bind.A4127M.getText().toString().trim().length() > 0 ? bind.A4127M.getText().toString() : "0");

        json.put("A4128", bind.A4128a.isChecked() ? "1"
                : bind.A4128b.isChecked() ? "2"
                : bind.A412898.isChecked() ? "98"
                : bind.A412899.isChecked() ? "99"
                : "0");

        json.put("A4129", bind.A4129a.isChecked() ? "1"
                : bind.A4129b.isChecked() ? "2"
                : bind.A412998.isChecked() ? "98"
                : bind.A412999.isChecked() ? "99"
                : "0");

        json.put("A4130u", bind.A4130ua.isChecked() ? "Days"
                : bind.A4130ub.isChecked() ? "Months"
                : bind.A4130u98.isChecked() ? "98"
                : bind.A4130u99.isChecked() ? "99"
                : "0");

        json.put("A4130D", bind.A4130D.getText().toString().trim().length() > 0 ? bind.A4130D.getText().toString() : "0");
        json.put("A4130M", bind.A4130M.getText().toString().trim().length() > 0 ? bind.A4130M.getText().toString() : "0");

        json.put("A4131", bind.A4131a.isChecked() ? "1"
                : bind.A4131b.isChecked() ? "2"
                : bind.A413198.isChecked() ? "98"
                : bind.A413199.isChecked() ? "99"
                : "0");

        json.put("A4132", bind.A4132a.isChecked() ? "1"
                : bind.A4132b.isChecked() ? "2"
                : bind.A413298.isChecked() ? "98"
                : bind.A413299.isChecked() ? "99"
                : "0");

        json.put("A4133", bind.A4133a.isChecked() ? "1"
                : bind.A4133b.isChecked() ? "2"
                : bind.A413398.isChecked() ? "98"
                : bind.A413399.isChecked() ? "99"
                : "0");

        json.put("A4134u", bind.A4134ua.isChecked() ? "Days"
                : bind.A4134ub.isChecked() ? "Months"
                : bind.A4134u98.isChecked() ? "98"
                : bind.A4134u99.isChecked() ? "99"
                : "0");

        json.put("A4134D", bind.A4134D.getText().toString().trim().length() > 0 ? bind.A4134D.getText().toString() : "0");
        json.put("A4134M", bind.A4134M.getText().toString().trim().length() > 0 ? bind.A4134M.getText().toString() : "0");

        json.put("A4135", bind.A4135a.isChecked() ? "1"
                : bind.A4135b.isChecked() ? "2"
                : bind.A413598.isChecked() ? "98"
                : bind.A413599.isChecked() ? "99"
                : "0");

        json.put("A4136", bind.A4136a.isChecked() ? "1"
                : bind.A4136b.isChecked() ? "2"
                : bind.A413698.isChecked() ? "98"
                : bind.A413699.isChecked() ? "99"
                : "0");

        json.put("A4137", bind.A4137a.isChecked() ? "1"
                : bind.A4137b.isChecked() ? "2"
                : bind.A413798.isChecked() ? "98"
                : bind.A413799.isChecked() ? "99"
                : "0");

        json.put("A4138", bind.A4138a.isChecked() ? "1"
                : bind.A4138b.isChecked() ? "2"
                : bind.A413898.isChecked() ? "98"
                : bind.A413899.isChecked() ? "99"
                : "0");

        json.put("A4139", bind.A4139a.isChecked() ? "1"
                : bind.A4139b.isChecked() ? "2"
                : bind.A413998.isChecked() ? "98"
                : bind.A413999.isChecked() ? "99"
                : "0");

        json.put("A4140", bind.A4140a.isChecked() ? "1"
                : bind.A4140b.isChecked() ? "2"
                : bind.A414098.isChecked() ? "98"
                : bind.A414099.isChecked() ? "99"
                : "0");

        MyPreferences.setsA4126(String.valueOf(json));

    }

    private void setupSkips() {

        bind.A4109.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4109a.getId()) {
                    bind.A4110cv.setVisibility(View.VISIBLE);
                    bind.A4111cv.setVisibility(View.VISIBLE);
                    bind.A4112cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4110cv);
                    ClearAllcontrol.ClearAllC(bind.A4111cv);
                    ClearAllcontrol.ClearAllC(bind.A4112cv);
                    bind.A4110cv.setVisibility(View.GONE);
                    bind.A4111cv.setVisibility(View.GONE);
                    bind.A4112cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4113.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4113a.getId()) {
                    bind.A4114cv.setVisibility(View.VISIBLE);

                } else {
                    ClearAllcontrol.ClearAllC(bind.A4114cv);
                    bind.A4114cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4115a.getId()) {
                    bind.A4116cv.setVisibility(View.VISIBLE);
                    bind.A4117ucv.setVisibility(View.VISIBLE);
                    bind.A4117Dcv.setVisibility(View.VISIBLE);
                    bind.A4117Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4116cv);
                    ClearAllcontrol.ClearAllC(bind.A4117ucv);
                    ClearAllcontrol.ClearAllC(bind.A4117Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4117Mcv);
                    bind.A4116cv.setVisibility(View.GONE);
                    bind.A4117ucv.setVisibility(View.GONE);
                    bind.A4117Dcv.setVisibility(View.GONE);
                    bind.A4117Mcv.setVisibility(View.GONE);
                }

            }

        });

        bind.A4116.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4116a.getId()) {
                    bind.A4117ucv.setVisibility(View.VISIBLE);
                    bind.A4117Dcv.setVisibility(View.VISIBLE);
                    bind.A4117Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4117ucv);
                    ClearAllcontrol.ClearAllC(bind.A4117Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4117Mcv);
                    bind.A4117ucv.setVisibility(View.GONE);
                    bind.A4117Dcv.setVisibility(View.GONE);
                    bind.A4117Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4117u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4117Dcv);
                ClearAllcontrol.ClearAllC(bind.A4117Mcv);
                bind.A4117Dcv.setVisibility(View.GONE);
                bind.A4117Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4117ua.getId()) {
                    bind.A4117Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4117ub.getId()) {
                    bind.A4117Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4118a.getId()) {
                    bind.A4119cv.setVisibility(View.VISIBLE);
                    bind.A4120cv.setVisibility(View.VISIBLE);
                    bind.A4121cv.setVisibility(View.VISIBLE);
                    bind.A4122cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4119cv);
                    ClearAllcontrol.ClearAllC(bind.A4120cv);
                    ClearAllcontrol.ClearAllC(bind.A4121cv);
                    ClearAllcontrol.ClearAllC(bind.A4122cv);

                    bind.A4119cv.setVisibility(View.GONE);
                    bind.A4120cv.setVisibility(View.GONE);
                    bind.A4121cv.setVisibility(View.GONE);
                    bind.A4122cv.setVisibility(View.GONE);
                }

            }

        });



        if (compoundButton.getId() == R.id.rb_A4126_1
                || compoundButton.getId() == R.id.rb_A4126_2
                || compoundButton.getId() == R.id.rb_A4126_DK
                || compoundButton.getId() == R.id.rb_A4126_RA)

        {
            if (rb_A4126_2.isChecked() || rb_A4126_DK.isChecked() || rb_A4126_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4127_u);
                ClearAllcontrol.ClearAll(ll_A4127_a);
                ClearAllcontrol.ClearAll(ll_A4127_b);
                ClearAllcontrol.ClearAll(ll_A4128);

                ll_A4127_u.setVisibility(View.GONE);
                ll_A4127_a.setVisibility(View.GONE);
                ll_A4127_b.setVisibility(View.GONE);
                ll_A4128.setVisibility(View.GONE);

            } else {
                ll_A4127_u.setVisibility(View.VISIBLE);
                ll_A4127_a.setVisibility(View.VISIBLE);
                ll_A4127_b.setVisibility(View.VISIBLE);
                ll_A4128.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4127_u_1
                || compoundButton.getId() == R.id.rb_A4127_u_2
                || compoundButton.getId() == R.id.rb_A4127_u_DK
                || compoundButton.getId() == R.id.rb_A4127_u_RA)

            ClearAllcontrol.ClearAll(ll_A4127_a);
        ClearAllcontrol.ClearAll(ll_A4127_b);

        ll_A4127_a.setVisibility(View.GONE);
        ll_A4127_b.setVisibility(View.GONE);

        {
            if (rb_A4127_u_1.isChecked()) {
                ll_A4127_a.setVisibility(View.VISIBLE);
            } else if (rb_A4127_u_2.isChecked()) {
                ll_A4127_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4129_1
                || compoundButton.getId() == R.id.rb_A4129_2
                || compoundButton.getId() == R.id.rb_A4129_DK
                || compoundButton.getId() == R.id.rb_A4129_RA)

        {
            if (rb_A4129_2.isChecked() || rb_A4129_DK.isChecked() || rb_A4129_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4130_u);
                ClearAllcontrol.ClearAll(ll_A4130_a);
                ClearAllcontrol.ClearAll(ll_A4130_b);

                ll_A4130_u.setVisibility(View.GONE);
                ll_A4130_a.setVisibility(View.GONE);
                ll_A4130_b.setVisibility(View.GONE);

            } else {
                ll_A4130_u.setVisibility(View.VISIBLE);
                ll_A4130_a.setVisibility(View.VISIBLE);
                ll_A4130_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4130_u_1
                || compoundButton.getId() == R.id.rb_A4130_u_2
                || compoundButton.getId() == R.id.rb_A4130_u_DK
                || compoundButton.getId() == R.id.rb_A4130_u_RA)

            ClearAllcontrol.ClearAll(ll_A4130_a);
        ClearAllcontrol.ClearAll(ll_A4130_b);

        ll_A4130_a.setVisibility(View.GONE);
        ll_A4130_b.setVisibility(View.GONE);

        {
            if (rb_A4130_u_1.isChecked()) {
                ll_A4130_a.setVisibility(View.VISIBLE);
            } else if (rb_A4130_u_2.isChecked()) {
                ll_A4130_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4134_u_1
                || compoundButton.getId() == R.id.rb_A4134_u_2
                || compoundButton.getId() == R.id.rb_A4134_u_DK
                || compoundButton.getId() == R.id.rb_A4134_u_RA)

            ClearAllcontrol.ClearAll(ll_A4134_a);
        ClearAllcontrol.ClearAll(ll_A4134_b);

        ll_A4134_a.setVisibility(View.GONE);
        ll_A4134_b.setVisibility(View.GONE);

        {
            if (rb_A4134_u_1.isChecked()) {
                ll_A4134_a.setVisibility(View.VISIBLE);
            } else if (rb_A4134_u_2.isChecked()) {
                ll_A4134_b.setVisibility(View.VISIBLE);
            }
        }

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4126) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4126) != false;
    }


}

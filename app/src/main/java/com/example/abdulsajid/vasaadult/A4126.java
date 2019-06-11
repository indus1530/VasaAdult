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
    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4126) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4126) != false;
    }


}

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

        json.put("A4095", bind.A4095a.isChecked() ? "1"
                : bind.A4095b.isChecked() ? "2"
                : bind.A409598.isChecked() ? "98"
                : bind.A409599.isChecked() ? "99"
                : "0");

        json.put("A4096", bind.A4096a.isChecked() ? "1"
                : bind.A4096b.isChecked() ? "2"
                : bind.A409698.isChecked() ? "98"
                : bind.A409699.isChecked() ? "99"
                : "0");

        json.put("A4097u", bind.A4097ua.isChecked() ? "Days"
                : bind.A4097ub.isChecked() ? "Months"
                : bind.A4097u98.isChecked() ? "98"
                : bind.A4097u99.isChecked() ? "99"
                : "0");

        json.put("A4097D", bind.A4097D.getText().toString().trim().length() > 0 ? bind.A4097D.getText().toString() : "0");
        json.put("A4097M", bind.A4097M.getText().toString().trim().length() > 0 ? bind.A4097M.getText().toString() : "0");

        json.put("A4098", bind.A4098a.isChecked() ? "1"
                : bind.A4098b.isChecked() ? "2"
                : bind.A409898.isChecked() ? "98"
                : bind.A409899.isChecked() ? "99"
                : "0");

        json.put("A4099u", bind.A4099ua.isChecked() ? "Days"
                : bind.A4099ub.isChecked() ? "Months"
                : bind.A4099u98.isChecked() ? "98"
                : bind.A4099u99.isChecked() ? "99"
                : "0");

        json.put("A4099D", bind.A4099D.getText().toString().trim().length() > 0 ? bind.A4099D.getText().toString() : "0");
        json.put("A4099M", bind.A4099M.getText().toString().trim().length() > 0 ? bind.A4099M.getText().toString() : "0");

        json.put("A4100", bind.A4100a.isChecked() ? "1"
                : bind.A4100b.isChecked() ? "2"
                : bind.A410098.isChecked() ? "98"
                : bind.A410099.isChecked() ? "99"
                : "0");

        json.put("A4101u", bind.A4101ua.isChecked() ? "Days"
                : bind.A4101ub.isChecked() ? "Months"
                : bind.A4101u98.isChecked() ? "98"
                : bind.A4101u99.isChecked() ? "99"
                : "0");

        json.put("A4101D", bind.A4101D.getText().toString().trim().length() > 0 ? bind.A4101D.getText().toString() : "0");
        json.put("A4101M", bind.A4101M.getText().toString().trim().length() > 0 ? bind.A4101M.getText().toString() : "0");

        json.put("A4102", bind.A4102a.isChecked() ? "1"
                : bind.A4102b.isChecked() ? "2"
                : bind.A410298.isChecked() ? "98"
                : bind.A410299.isChecked() ? "99"
                : "0");

        json.put("A4103", bind.A4103a.isChecked() ? "1"
                : bind.A4103b.isChecked() ? "2"
                : bind.A410398.isChecked() ? "98"
                : bind.A410399.isChecked() ? "99"
                : "0");

        json.put("A4104", bind.A4104a.isChecked() ? "1"
                : bind.A4104b.isChecked() ? "2"
                : bind.A410498.isChecked() ? "98"
                : bind.A410499.isChecked() ? "99"
                : "0");

        json.put("A4105", bind.A4105a.isChecked() ? "1"
                : bind.A4105b.isChecked() ? "2"
                : bind.A410598.isChecked() ? "98"
                : bind.A410599.isChecked() ? "99"
                : "0");

        json.put("A4106", bind.A4106a.isChecked() ? "1"
                : bind.A4106b.isChecked() ? "2"
                : bind.A410698.isChecked() ? "98"
                : bind.A410699.isChecked() ? "99"
                : "0");

        json.put("A4107", bind.A4107.getText().toString().trim().length() > 0 ? bind.A4107.getText().toString() : "0");

        json.put("A4108", bind.A4108a.isChecked() ? "1"
                : bind.A4108b.isChecked() ? "2"
                : bind.A410898.isChecked() ? "98"
                : bind.A410899.isChecked() ? "99"
                : "0");

        MyPreferences.setsA4095(String.valueOf(json));

    }

    private void setupSkips() {

        bind.A4096.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4096a.getId()) {
                    bind.A4097ucv.setVisibility(View.VISIBLE);
                    bind.A4097Dcv.setVisibility(View.VISIBLE);
                    bind.A4097Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4097ucv);
                    ClearAllcontrol.ClearAllC(bind.A4097Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4097Mcv);
                    bind.A4097ucv.setVisibility(View.GONE);
                    bind.A4097Dcv.setVisibility(View.GONE);
                    bind.A4097Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4097u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4097Dcv);
                ClearAllcontrol.ClearAllC(bind.A4097Mcv);

                bind.A4097Dcv.setVisibility(View.GONE);
                bind.A4097Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4097ua.getId()) {
                    bind.A4097Dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4097ub.getId()) {
                    bind.A4097Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4098.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4098a.getId()) {
                    bind.A4099ucv.setVisibility(View.VISIBLE);
                    bind.A4099Dcv.setVisibility(View.VISIBLE);
                    bind.A4099Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4099ucv);
                    ClearAllcontrol.ClearAllC(bind.A4099Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4099Mcv);
                    bind.A4099ucv.setVisibility(View.GONE);
                    bind.A4099Dcv.setVisibility(View.GONE);
                    bind.A4099Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4099u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4099Dcv);
                ClearAllcontrol.ClearAllC(bind.A4099Mcv);
                bind.A4099Dcv.setVisibility(View.GONE);
                bind.A4099Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4099ua.getId()) {
                    bind.A4099Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4099ub.getId()) {
                    bind.A4099Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4100.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4100a.getId()) {
                    bind.A4101ucv.setVisibility(View.VISIBLE);
                    bind.A4101Dcv.setVisibility(View.VISIBLE);
                    bind.A4101Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4101ucv);
                    ClearAllcontrol.ClearAllC(bind.A4101Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4101Mcv);

                    bind.A4101ucv.setVisibility(View.GONE);
                    bind.A4101Dcv.setVisibility(View.GONE);
                    bind.A4101Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4101u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4101Dcv);
                ClearAllcontrol.ClearAllC(bind.A4101Mcv);
                bind.A4101Dcv.setVisibility(View.GONE);
                bind.A4101Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4101ua.getId()) {
                    bind.A4101Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4101ub.getId()) {
                    bind.A4101Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4102a.getId()) {
                    bind.A4103cv.setVisibility(View.VISIBLE);
                    bind.A4104cv.setVisibility(View.VISIBLE);
                    bind.A4105cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4103cv);
                    ClearAllcontrol.ClearAllC(bind.A4104cv);
                    ClearAllcontrol.ClearAllC(bind.A4105cv);

                    bind.A4103cv.setVisibility(View.GONE);
                    bind.A4104cv.setVisibility(View.GONE);
                    bind.A4105cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4106.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4106a.getId()) {
                    bind.A4107cv.setVisibility(View.VISIBLE);
                    bind.A4108cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4107cv);
                    ClearAllcontrol.ClearAllC(bind.A4108cv);

                    bind.A4107cv.setVisibility(View.GONE);
                    bind.A4108cv.setVisibility(View.GONE);
                }

            }

        });

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4095) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4095) != false;
    }


}

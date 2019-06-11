package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4051Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4051 extends AppCompatActivity {

    A4051Binding bind;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4051);
        bind.setCallback(this);
        //this.setTitle("A4051");
        setupSkips();
    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4051.this, A4067.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4051.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4051", bind.A4051a.isChecked() ? "1"
                : bind.A4051b.isChecked() ? "2"
                : bind.A405198.isChecked() ? "98"
                : bind.A405199.isChecked() ? "99"
                : "0");

        json.put("A4052u", bind.A4052ua.isChecked() ? "1"
                : bind.A4052ub.isChecked() ? "2"
                : bind.A4052u98.isChecked() ? "98"
                : bind.A4052u99.isChecked() ? "99"
                : "0");

        json.put("A4052D", bind.A4052D.getText().toString().trim().length() > 0 ? bind.A4052D.getText().toString() : "0");

        json.put("A4052M", bind.A4052M.getText().toString().trim().length() > 0 ? bind.A4052M.getText().toString() : "0");

        json.put("A4053", bind.A4053a.isChecked() ? "1"
                : bind.A4053b.isChecked() ? "2"
                : bind.A405398.isChecked() ? "98"
                : bind.A405399.isChecked() ? "99"
                : "0");

        json.put("A4054", bind.A4054a.isChecked() ? "1"
                : bind.A4054b.isChecked() ? "2"
                : bind.A4054c.isChecked() ? "3"
                : bind.A405498.isChecked() ? "98"
                : bind.A405499.isChecked() ? "99"
                : "0");


        json.put("A4055", bind.A4055a.isChecked() ? "1"
                : bind.A4055b.isChecked() ? "2"
                : bind.A4055c.isChecked() ? "3"
                : bind.A405598.isChecked() ? "98"
                : bind.A405599.isChecked() ? "99"
                : "0");


        json.put("A4056", bind.A4056a.isChecked() ? "1"
                : bind.A4056b.isChecked() ? "2"
                : bind.A405698.isChecked() ? "98"
                : bind.A405699.isChecked() ? "99"
                : "0");


        json.put("A4057", bind.A4057a.isChecked() ? "1"
                : bind.A4057b.isChecked() ? "2"
                : bind.A405798.isChecked() ? "98"
                : bind.A405799.isChecked() ? "99"
                : "0");


        json.put("A4058", bind.A4058a.isChecked() ? "1"
                : bind.A4058b.isChecked() ? "2"
                : bind.A405898.isChecked() ? "98"
                : bind.A405899.isChecked() ? "99"
                : "0");


        json.put("A4059u", bind.A4059ua.isChecked() ? "1"
                : bind.A4059ub.isChecked() ? "2"
                : bind.A4059u98.isChecked() ? "98"
                : bind.A4059u99.isChecked() ? "99"
                : "0");

        json.put("A4059D", bind.A4059D.getText().toString().trim().length() > 0 ? bind.A4059D.getText().toString() : "0");

        json.put("A4059M", bind.A4059M.getText().toString().trim().length() > 0 ? bind.A4059M.getText().toString() : "0");


        json.put("A4060", bind.A4060a.isChecked() ? "1"
                : bind.A4060b.isChecked() ? "2"
                : bind.A406098.isChecked() ? "98"
                : bind.A406099.isChecked() ? "99"
                : "0");


        json.put("A4061", bind.A4061a.isChecked() ? "1"
                : bind.A4061b.isChecked() ? "2"
                : bind.A406198.isChecked() ? "98"
                : bind.A406199.isChecked() ? "99"
                : "0");


        json.put("A4062", bind.A4062a.isChecked() ? "1"
                : bind.A4062b.isChecked() ? "2"
                : bind.A406298.isChecked() ? "98"
                : bind.A406299.isChecked() ? "99"
                : "0");


        json.put("A4063", bind.A4063a.isChecked() ? "1"
                : bind.A4063b.isChecked() ? "2"
                : bind.A406398.isChecked() ? "98"
                : bind.A406399.isChecked() ? "99"
                : "0");


        json.put("A4064u", bind.A4064ua.isChecked() ? "1"
                : bind.A4064ub.isChecked() ? "2"
                : bind.A4064u98.isChecked() ? "98"
                : bind.A4064u99.isChecked() ? "99"
                : "0");

        json.put("A4064D", bind.A4064D.getText().toString().trim().length() > 0 ? bind.A4064D.getText().toString() : "0");

        json.put("A4064M", bind.A4064M.getText().toString().trim().length() > 0 ? bind.A4064M.getText().toString() : "0");


        json.put("A40641", bind.A40641a.isChecked() ? "1"
                : bind.A40641b.isChecked() ? "2"
                : bind.A4064198.isChecked() ? "98"
                : bind.A4064199.isChecked() ? "99"
                : "0");


        json.put("A4065", bind.A4065a.isChecked() ? "1"
                : bind.A4065b.isChecked() ? "2"
                : bind.A406598.isChecked() ? "98"
                : bind.A406599.isChecked() ? "99"
                : "0");


        json.put("A4066", bind.A4066a.isChecked() ? "1"
                : bind.A4066b.isChecked() ? "2"
                : bind.A406698.isChecked() ? "98"
                : bind.A406699.isChecked() ? "99"
                : "0");


        MyPreferences.setsA4051(String.valueOf(json));

    }

    private void setupSkips() {

        bind.A4051.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4051a.getId()) {
                    bind.A4052ucv.setVisibility(View.VISIBLE);
                    bind.A4052Dcv.setVisibility(View.VISIBLE);
                    bind.A4052Mcv.setVisibility(View.VISIBLE);
                    bind.A4053cv.setVisibility(View.VISIBLE);
                    bind.A4054cv.setVisibility(View.VISIBLE);
                    bind.A4055cv.setVisibility(View.VISIBLE);
                    bind.A4056cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4052ucv);
                    ClearAllcontrol.ClearAllC(bind.A4052Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4052Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4053cv);
                    ClearAllcontrol.ClearAllC(bind.A4054cv);
                    ClearAllcontrol.ClearAllC(bind.A4055cv);
                    ClearAllcontrol.ClearAllC(bind.A4056cv);
                    bind.A4052ucv.setVisibility(View.GONE);
                    bind.A4052Dcv.setVisibility(View.GONE);
                    bind.A4052Mcv.setVisibility(View.GONE);
                    bind.A4053cv.setVisibility(View.GONE);
                    bind.A4054cv.setVisibility(View.GONE);
                    bind.A4055cv.setVisibility(View.GONE);
                    bind.A4056cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4052u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4052Dcv);
                ClearAllcontrol.ClearAllC(bind.A4052Mcv);

                bind.A4052Dcv.setVisibility(View.GONE);
                bind.A4052Mcv.setVisibility(View.GONE);

                {
                    if (checkedId == bind.A4052ua.getId()) {
                        bind.A4052Dcv.setVisibility(View.VISIBLE);
                    } else if (checkedId == bind.A4052ub.getId()) {
                        bind.A4052Mcv.setVisibility(View.VISIBLE);
                    }
                }

            }

        });


        bind.A4058.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4058a.getId()) {
                    bind.A4059ucv.setVisibility(View.VISIBLE);
                    bind.A4059Dcv.setVisibility(View.VISIBLE);
                    bind.A4059Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4059ucv);
                    ClearAllcontrol.ClearAllC(bind.A4059Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4059Mcv);
                    bind.A4059ucv.setVisibility(View.GONE);
                    bind.A4059Dcv.setVisibility(View.GONE);
                    bind.A4059Mcv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4059u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4059Dcv);
                ClearAllcontrol.ClearAllC(bind.A4059Mcv);

                bind.A4059Dcv.setVisibility(View.GONE);
                bind.A4059Mcv.setVisibility(View.GONE);

                {
                    if (checkedId == bind.A4059ua.getId()) {
                        bind.A4059Dcv.setVisibility(View.VISIBLE);
                    } else if (checkedId == bind.A4059ub.getId()) {
                        bind.A4059Mcv.setVisibility(View.VISIBLE);
                    }
                }

            }

        });


        bind.A4060.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4060a.getId()) {
                    bind.A4061cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4061cv);
                    bind.A4061cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4062.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4062a.getId()) {
                    bind.A4063cv.setVisibility(View.VISIBLE);
                    bind.A4064ucv.setVisibility(View.VISIBLE);
                    bind.A4064Dcv.setVisibility(View.VISIBLE);
                    bind.A4064Mcv.setVisibility(View.VISIBLE);
                    bind.A40641cv.setVisibility(View.VISIBLE);
                    bind.A4065cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4063cv);
                    ClearAllcontrol.ClearAllC(bind.A4064ucv);
                    ClearAllcontrol.ClearAllC(bind.A4064Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4064Mcv);
                    ClearAllcontrol.ClearAllC(bind.A40641cv);
                    ClearAllcontrol.ClearAllC(bind.A4065cv);
                    bind.A4063cv.setVisibility(View.GONE);
                    bind.A4064ucv.setVisibility(View.GONE);
                    bind.A4064Dcv.setVisibility(View.GONE);
                    bind.A4064Mcv.setVisibility(View.GONE);
                    bind.A40641cv.setVisibility(View.GONE);
                    bind.A4065cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4064u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4064Dcv);
                ClearAllcontrol.ClearAllC(bind.A4064Mcv);

                bind.A4064Dcv.setVisibility(View.GONE);
                bind.A4064Mcv.setVisibility(View.GONE);

                {
                    if (checkedId == bind.A4064ua.getId()) {
                        bind.A4064Dcv.setVisibility(View.VISIBLE);
                    } else if (checkedId == bind.A4064ub.getId()) {
                        bind.A4064Mcv.setVisibility(View.VISIBLE);
                    }
                }

            }

        });

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4051) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4051) != false;
    }
}

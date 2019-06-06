package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4109Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;
import utils.MyPreferences;

public class A4109 extends AppCompatActivity {
    A4109Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4109);
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

            Intent c2 = new Intent(A4109.this, A4126.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void BtnEnd() {
        Intent i = new Intent(A4109.this, HomeActivity.class);
        startActivity(i);

    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4109", bind.A4109a.isChecked() ? "1"
                : bind.A4109b.isChecked() ? "2"
                : bind.A410998.isChecked() ? "98"
                : bind.A410999.isChecked() ? "99"
                : "0");

        json.put("A4110", bind.A4110a.isChecked() ? "1"
                : bind.A4110b.isChecked() ? "2"
                : bind.A411098.isChecked() ? "98"
                : bind.A411099.isChecked() ? "99"
                : "0");

        json.put("A4111", bind.A4111a.isChecked() ? "1"
                : bind.A4111b.isChecked() ? "2"
                : bind.A411198.isChecked() ? "98"
                : bind.A411199.isChecked() ? "99"
                : "0");

        json.put("A4112", bind.A4112a.isChecked() ? "1"
                : bind.A4112b.isChecked() ? "2"
                : bind.A411298.isChecked() ? "98"
                : bind.A411299.isChecked() ? "99"
                : "0");

        json.put("A4113", bind.A4113a.isChecked() ? "1"
                : bind.A4113b.isChecked() ? "2"
                : bind.A411398.isChecked() ? "98"
                : bind.A411399.isChecked() ? "99"
                : "0");

        json.put("A4114", bind.A4114a.isChecked() ? "1"
                : bind.A4114b.isChecked() ? "2"
                : bind.A411498.isChecked() ? "98"
                : bind.A411499.isChecked() ? "99"
                : "0");

        json.put("A4115", bind.A4115a.isChecked() ? "1"
                : bind.A4115b.isChecked() ? "2"
                : bind.A411598.isChecked() ? "98"
                : bind.A411599.isChecked() ? "99"
                : "0");

        json.put("A4116", bind.A4116a.isChecked() ? "1"
                : bind.A4116b.isChecked() ? "2"
                : bind.A411698.isChecked() ? "98"
                : bind.A411699.isChecked() ? "99"
                : "0");

        json.put("A4117u", bind.A4117ua.isChecked() ? "Days"
                : bind.A4117ub.isChecked() ? "Months"
                : bind.A4117u98.isChecked() ? "98"
                : bind.A4117u99.isChecked() ? "99"
                : "0");

        json.put("A4117D", bind.A4117D.getText().toString().trim().length() > 0 ? bind.A4117D.getText().toString() : "0");
        json.put("A4117M", bind.A4117M.getText().toString().trim().length() > 0 ? bind.A4117M.getText().toString() : "0");

        json.put("A4118", bind.A4118a.isChecked() ? "1"
                : bind.A4118b.isChecked() ? "2"
                : bind.A411898.isChecked() ? "98"
                : bind.A411899.isChecked() ? "99"
                : "0");

        json.put("A4119", bind.A4119a.isChecked() ? "1"
                : bind.A4119b.isChecked() ? "2"
                : bind.A4119c.isChecked() ? "3"
                : bind.A4119d.isChecked() ? "4"
                : bind.A411998.isChecked() ? "98"
                : bind.A411999.isChecked() ? "99"
                : "0");

        json.put("A4120", bind.A4120a.isChecked() ? "1"
                : bind.A4120b.isChecked() ? "2"
                : bind.A4120c.isChecked() ? "3"
                : bind.A4120d.isChecked() ? "4"
                : bind.A412098.isChecked() ? "98"
                : bind.A412099.isChecked() ? "99"
                : "0");

        json.put("A4121", bind.A4121.getText().toString().trim().length() > 0 ? bind.A4121.getText().toString() : "0");

        json.put("A4122", bind.A4122a.isChecked() ? "1"
                : bind.A4122b.isChecked() ? "2"
                : bind.A412298.isChecked() ? "98"
                : bind.A412299.isChecked() ? "99"
                : "0");

        json.put("A4123", bind.A4123a.isChecked() ? "1"
                : bind.A4123b.isChecked() ? "2"
                : bind.A412398.isChecked() ? "98"
                : bind.A412399.isChecked() ? "99"
                : "0");

        json.put("A4124", bind.A4124a.isChecked() ? "1"
                : bind.A4124b.isChecked() ? "2"
                : bind.A412498.isChecked() ? "98"
                : bind.A412499.isChecked() ? "99"
                : "0");

        json.put("A4125", bind.A4125a.isChecked() ? "1"
                : bind.A4125b.isChecked() ? "2"
                : bind.A412598.isChecked() ? "98"
                : bind.A412599.isChecked() ? "99"
                : "0");

        MyPreferences.setsA4109(String.valueOf(json));

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

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4109) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4109) != false;
    }


}

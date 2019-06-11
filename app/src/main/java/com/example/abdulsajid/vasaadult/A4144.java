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
        //this.setTitle("A4144");
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
        if (Gothrough.IamHiden(bind.llA4144) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4144) != false;
    }


}

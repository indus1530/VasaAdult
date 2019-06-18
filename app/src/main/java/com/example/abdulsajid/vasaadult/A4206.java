package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4206Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4206 extends AppCompatActivity {
    A4206Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4206);
        bind.setCallback(this);
        //this.setTitle("A4207");
        setupSkips();

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4206.this, A4251.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        Intent i = new Intent(A4206.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4206", bind.A4206a.isChecked() ? "1"
                : bind.A4206b.isChecked() ? "2"
                : bind.A420698.isChecked() ? "98"
                : bind.A420699.isChecked() ? "99"
                : "0");

        json.put("A42061", bind.A42061a.isChecked() ? "1"
                : bind.A42061b.isChecked() ? "2"
                : bind.A4206198.isChecked() ? "98"
                : bind.A4206199.isChecked() ? "99"
                : "0");

        json.put("A42062", bind.A42062a.isChecked() ? "1"
                : bind.A42062b.isChecked() ? "2"
                : bind.A42062c.isChecked() ? "3"
                : bind.A42062d.isChecked() ? "4"
                : bind.A42062e.isChecked() ? "5"
                : bind.A4206296.isChecked() ? "96"
                : bind.A4206298.isChecked() ? "98"
                : bind.A4206299.isChecked() ? "99"
                : "0");

        json.put("A42063", bind.A42063a.isChecked() ? "1"
                : bind.A42063b.isChecked() ? "2"
                : bind.A42063c.isChecked() ? "3"
                : bind.A42063d.isChecked() ? "4"
                : bind.A42063e.isChecked() ? "5"
                : bind.A42063f.isChecked() ? "6"
                : bind.A4206396.isChecked() ? "96"
                : bind.A4206398.isChecked() ? "98"
                : bind.A4206399.isChecked() ? "99"
                : "0");

        json.put("A42064", bind.A42064a.isChecked() ? "1"
                : bind.A42064b.isChecked() ? "2"
                : bind.A4206498.isChecked() ? "98"
                : bind.A4206499.isChecked() ? "99"
                : "0");

        json.put("A42065", bind.A42065a.isChecked() ? "1"
                : bind.A42065b.isChecked() ? "2"
                : bind.A4206598.isChecked() ? "98"
                : bind.A4206599.isChecked() ? "99"
                : "0");

        json.put("A42066", bind.A42066a.isChecked() ? "1"
                : bind.A42066b.isChecked() ? "2"
                : bind.A4206698.isChecked() ? "98"
                : bind.A4206699.isChecked() ? "99"
                : "0");

        json.put("A42067", bind.A42067a.isChecked() ? "1"
                : bind.A42067b.isChecked() ? "2"
                : bind.A4206798.isChecked() ? "98"
                : bind.A4206799.isChecked() ? "99"
                : "0");

        json.put("A42068", bind.A42068a.isChecked() ? "1"
                : bind.A42068b.isChecked() ? "2"
                : bind.A4206898.isChecked() ? "98"
                : bind.A4206899.isChecked() ? "99"
                : "0");

        json.put("A42069", bind.A42069a.isChecked() ? "1"
                : bind.A42069b.isChecked() ? "2"
                : bind.A4206998.isChecked() ? "98"
                : bind.A4206999.isChecked() ? "99"
                : "0");

        json.put("A420610", bind.A420610a.isChecked() ? "1"
                : bind.A420610b.isChecked() ? "2"
                : bind.A420610c.isChecked() ? "3"
                : bind.A42061096.isChecked() ? "96"
                : bind.A42061098.isChecked() ? "98"
                : bind.A42061099.isChecked() ? "99"
                : "0");

        json.put("A420611", bind.A420611a.isChecked() ? "1"
                : bind.A420611b.isChecked() ? "2"
                : bind.A42061198.isChecked() ? "98"
                : bind.A42061199.isChecked() ? "99"
                : "0");

        json.put("A420612", bind.A420612a.isChecked() ? "1"
                : bind.A420612b.isChecked() ? "2"
                : bind.A42061298.isChecked() ? "98"
                : bind.A42061299.isChecked() ? "99"
                : "0");

        json.put("A420613", bind.A420613a.isChecked() ? "1"
                : bind.A420613b.isChecked() ? "2"
                : bind.A42061398.isChecked() ? "98"
                : bind.A42061399.isChecked() ? "99"
                : "0");

        json.put("A420614", bind.A420614a.isChecked() ? "1"
                : bind.A420614b.isChecked() ? "2"
                : bind.A42061498.isChecked() ? "98"
                : bind.A42061499.isChecked() ? "99"
                : "0");

        json.put("A420615", bind.A420615a.isChecked() ? "1"
                : bind.A420615b.isChecked() ? "2"
                : bind.A42061598.isChecked() ? "98"
                : bind.A42061599.isChecked() ? "99"
                : "0");

        json.put("A420616", bind.A420616a.isChecked() ? "1"
                : bind.A420616b.isChecked() ? "2"
                : bind.A42061698.isChecked() ? "98"
                : bind.A42061699.isChecked() ? "99"
                : "0");

        json.put("A420617", bind.A420617a.isChecked() ? "1"
                : bind.A420617b.isChecked() ? "2"
                : bind.A42061798.isChecked() ? "98"
                : bind.A42061799.isChecked() ? "99"
                : "0");

        json.put("A420618", bind.A420618a.isChecked() ? "1"
                : bind.A420618b.isChecked() ? "2"
                : bind.A42061898.isChecked() ? "98"
                : bind.A42061899.isChecked() ? "99"
                : "0");

        json.put("A420619", bind.A420619a.isChecked() ? "1"
                : bind.A420619b.isChecked() ? "2"
                : bind.A42061998.isChecked() ? "98"
                : bind.A42061999.isChecked() ? "99"
                : "0");

        json.put("A420620", bind.A420620a.isChecked() ? "1"
                : bind.A420620b.isChecked() ? "2"
                : bind.A42062098.isChecked() ? "98"
                : bind.A42062099.isChecked() ? "99"
                : "0");

        json.put("A420621", bind.A420621a.isChecked() ? "1"
                : bind.A420621b.isChecked() ? "2"
                : bind.A42062198.isChecked() ? "98"
                : bind.A42062199.isChecked() ? "99"
                : "0");

        json.put("A420622", bind.A420622a.isChecked() ? "1"
                : bind.A420622b.isChecked() ? "2"
                : bind.A42062298.isChecked() ? "98"
                : bind.A42062299.isChecked() ? "99"
                : "0");

        json.put("A4207", bind.A4207H.getText().toString().trim().length() > 0 ? bind.A4207H.getText().toString()
                : bind.A4207D.getText().toString().trim().length() > 0 ? bind.A4207D.getText().toString()
                : bind.A420798.isChecked() ? "98"
                : "0");

        json.put("A4207H", bind.A4207H.getText().toString().trim().length() > 0 ? bind.A4207H.getText().toString() : "0");
        json.put("A4207D", bind.A4207D.getText().toString().trim().length() > 0 ? bind.A4207D.getText().toString() : "0");

        json.put("A420798", bind.A420798.isChecked() ? "98" : "0");

//        MyPreferences.setsA4206(String.valueOf(json));

    }


    private void setupSkips() {

        bind.A4206.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4206b.getId()) {
                    bind.A42061cv.setVisibility(View.VISIBLE);
                    bind.A42062cv.setVisibility(View.VISIBLE);
                    bind.A42063cv.setVisibility(View.VISIBLE);
                    bind.A42064cv.setVisibility(View.VISIBLE);
                    bind.A42065cv.setVisibility(View.VISIBLE);
                    bind.A42066cv.setVisibility(View.VISIBLE);
                    bind.A42067cv.setVisibility(View.VISIBLE);
                    bind.A42068cv.setVisibility(View.VISIBLE);
                    bind.A42069cv.setVisibility(View.VISIBLE);
                    bind.A420610cv.setVisibility(View.VISIBLE);
                    bind.A420611cv.setVisibility(View.VISIBLE);
                    bind.A420612cv.setVisibility(View.VISIBLE);
                    bind.A420613cv.setVisibility(View.VISIBLE);
                    bind.A420614cv.setVisibility(View.VISIBLE);
                    bind.A420615cv.setVisibility(View.VISIBLE);
                    bind.A420616cv.setVisibility(View.VISIBLE);
                    bind.A420617cv.setVisibility(View.VISIBLE);
                    bind.A420618cv.setVisibility(View.VISIBLE);
                    bind.A420619cv.setVisibility(View.VISIBLE);
                    bind.A420620cv.setVisibility(View.VISIBLE);
                    bind.A420621cv.setVisibility(View.VISIBLE);
                    bind.A420622cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A42061cv);
                    ClearAllcontrol.ClearAllC(bind.A42062cv);
                    ClearAllcontrol.ClearAllC(bind.A42063cv);
                    ClearAllcontrol.ClearAllC(bind.A42064cv);
                    ClearAllcontrol.ClearAllC(bind.A42065cv);
                    ClearAllcontrol.ClearAllC(bind.A42066cv);
                    ClearAllcontrol.ClearAllC(bind.A42067cv);
                    ClearAllcontrol.ClearAllC(bind.A42068cv);
                    ClearAllcontrol.ClearAllC(bind.A42069cv);
                    ClearAllcontrol.ClearAllC(bind.A420610cv);
                    ClearAllcontrol.ClearAllC(bind.A420611cv);
                    ClearAllcontrol.ClearAllC(bind.A420612cv);
                    ClearAllcontrol.ClearAllC(bind.A420613cv);
                    ClearAllcontrol.ClearAllC(bind.A420614cv);
                    ClearAllcontrol.ClearAllC(bind.A420615cv);
                    ClearAllcontrol.ClearAllC(bind.A420616cv);
                    ClearAllcontrol.ClearAllC(bind.A420617cv);
                    ClearAllcontrol.ClearAllC(bind.A420618cv);
                    ClearAllcontrol.ClearAllC(bind.A420619cv);
                    ClearAllcontrol.ClearAllC(bind.A420620cv);
                    ClearAllcontrol.ClearAllC(bind.A420621cv);
                    ClearAllcontrol.ClearAllC(bind.A420622cv);
                    bind.A42061cv.setVisibility(View.GONE);
                    bind.A42062cv.setVisibility(View.GONE);
                    bind.A42063cv.setVisibility(View.GONE);
                    bind.A42064cv.setVisibility(View.GONE);
                    bind.A42065cv.setVisibility(View.GONE);
                    bind.A42066cv.setVisibility(View.GONE);
                    bind.A42067cv.setVisibility(View.GONE);
                    bind.A42068cv.setVisibility(View.GONE);
                    bind.A42069cv.setVisibility(View.GONE);
                    bind.A420610cv.setVisibility(View.GONE);
                    bind.A420611cv.setVisibility(View.GONE);
                    bind.A420612cv.setVisibility(View.GONE);
                    bind.A420613cv.setVisibility(View.GONE);
                    bind.A420614cv.setVisibility(View.GONE);
                    bind.A420615cv.setVisibility(View.GONE);
                    bind.A420616cv.setVisibility(View.GONE);
                    bind.A420617cv.setVisibility(View.GONE);
                    bind.A420618cv.setVisibility(View.GONE);
                    bind.A420619cv.setVisibility(View.GONE);
                    bind.A420620cv.setVisibility(View.GONE);
                    bind.A420621cv.setVisibility(View.GONE);
                    bind.A420622cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A42061.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A42061a.getId()) {
                    bind.A42062cv.setVisibility(View.VISIBLE);
                    bind.A42063cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A42062cv);
                    ClearAllcontrol.ClearAllC(bind.A42063cv);
                    bind.A42062cv.setVisibility(View.GONE);
                    bind.A42063cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A42068.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A42068a.getId()) {
                    bind.A42069cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A42069cv);
                    bind.A42069cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A42069.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A42069a.getId()) {
                    bind.A420610cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A420610cv);
                    bind.A420610cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A420621.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A420621a.getId()) {
                    bind.A420622cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A420622cv);
                    bind.A420622cv.setVisibility(View.GONE);
                }

            }

        });

    }


    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4206) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4206) != false;
    }

}

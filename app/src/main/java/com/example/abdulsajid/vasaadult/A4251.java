package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4251 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration Region
        Button
            btn_next11;

        LinearLayout
                ll_A4251,
                ll_A4252,
                ll_A4253,
                ll_A4254,
                ll_A4255,
                ll_A4256,
                ll_A4274,
                ll_A4275,
                ll_A4276,
                ll_A4277,
                ll_A4278,
                ll_A4279,
                ll_A4280,
                ll_A4281,
                ll_A4282,
                ll_A4283,
                ll_A4284;

        RadioButton
                rb_A4251_1,
                rb_A4251_2,
                rb_A4251_DK,
                rb_A4253_1,
                rb_A4253_2,
                rb_A4253_3,
                rb_A4253_DK,
                rb_A4254_1,
                rb_A4254_2,
                rb_A4254_DK,
                rb_A4274_1,
                rb_A4274_2,
                rb_A4274_DK,
                rb_A4275_1,
                rb_A4275_2,
                rb_A4275_DK,
                rb_A4277_1,
                rb_A4277_2,
                rb_A4277_DK,
                rb_A4280_1,
                rb_A4280_2,
                rb_A4280_DK,
                rb_A4280_RA,
                rb_A4281_1,
                rb_A4281_2,
                rb_A4281_DK,
                rb_A4281_RA,
                rb_A4282_1,
                rb_A4282_2,
                rb_A4282_DK,
                rb_A4282_RA,
                rb_A4283_1,
                rb_A4283_2,
                rb_A4283_DK,
                rb_A4283_RA;

        EditText
                ed_A4253_3,
                ed_A4255_4,
                ed_A4255_13,
                ed_A4256_minutes,
                ed_A4256_hours,
                ed_A4256_days,
                ed_A4276_5,
                ed_A4276_16,
                ed_A4284_days;

        CheckBox
                cb_A4255_1,
                cb_A4255_2,
                cb_A4255_3,
                cb_A4255_4,
                cb_A4255_5,
                cb_A4255_6,
                cb_A4255_7,
                cb_A4255_8,
                cb_A4255_9,
                cb_A4255_10,
                cb_A4255_11,
                cb_A4255_12,
                cb_A4255_13,
                cb_A4255_DK,
                cb_A4276_1,
                cb_A4276_2,
                cb_A4276_3,
                cb_A4276_4,
                cb_A4276_5,
                cb_A4276_6,
                cb_A4276_7,
                cb_A4276_8,
                cb_A4276_9,
                cb_A4276_10,
                cb_A4276_11,
                cb_A4276_12,
                cb_A4276_13,
                cb_A4276_14,
                cb_A4276_15,
                cb_A4276_16,
                cb_A4276_DK,
                cb_A4278_1,
                cb_A4278_2,
                cb_A4278_3,
                cb_A4278_4,
                cb_A4278_5,
                cb_A4278_6,
                cb_A4278_7,
                cb_A4278_DK,
                cb_A4279_1,
                cb_A4279_2,
                cb_A4279_3,
                cb_A4279_4,
                cb_A4279_5,
                cb_A4279_6,
                cb_A4279_7,
                cb_A4279_DK;

        String
                study_id,
                A4251,
                A4253,
                A4253_3,
                A4254,
                A4255_1,
                A4255_2,
                A4255_3,
                A4255_4,
                A4255_4_OT,
                A4255_5,
                A4255_6,
                A4255_7,
                A4255_8,
                A4255_9,
                A4255_10,
                A4255_11,
                A4255_12,
                A4255_13,
                A4255_13_OT,
                A4255_DK,
                A4256_minutes,
                A4256_hours,
                A4256_days,
                A4274,
                A4275,
                A4276_1,
                A4276_2,
                A4276_3,
                A4276_4,
                A4276_5,
                A4276_5_OT,
                A4276_6,
                A4276_7,
                A4276_8,
                A4276_9,
                A4276_10,
                A4276_11,
                A4276_12,
                A4276_13,
                A4276_14,
                A4276_15,
                A4276_16,
                A4276_16_OT,
                A4276_DK,
                A4277,
                A4278_1,
                A4278_2,
                A4278_3,
                A4278_4,
                A4278_5,
                A4278_6,
                A4278_7,
                A4278_DK,
                A4279_1,
                A4279_2,
                A4279_3,
                A4279_4,
                A4279_5,
                A4279_6,
                A4279_7,
                A4279_DK,
                A4280,
                A4281,
                A4282,
                A4283,
                A4284,
                STATUS;

    //EndRegion Declaration

    void Initialization(){

        btn_next11 = findViewById(R.id.btn_next11);

        ll_A4251 = findViewById(R.id.ll_A4251);
        ll_A4252 = findViewById(R.id.ll_A4252);
        ll_A4253 = findViewById(R.id.ll_A4253);
        ll_A4254 = findViewById(R.id.ll_A4254);
        ll_A4255 = findViewById(R.id.ll_A4255);
        ll_A4256 = findViewById(R.id.ll_A4256);
        ll_A4274 = findViewById(R.id.ll_A4274);
        ll_A4275 = findViewById(R.id.ll_A4275);
        ll_A4276 = findViewById(R.id.ll_A4276);
        ll_A4277 = findViewById(R.id.ll_A4277);
        ll_A4278 = findViewById(R.id.ll_A4278);
        ll_A4279 = findViewById(R.id.ll_A4279);
        ll_A4280 = findViewById(R.id.ll_A4280);
        ll_A4281 = findViewById(R.id.ll_A4281);
        ll_A4282 = findViewById(R.id.ll_A4282);
        ll_A4283 = findViewById(R.id.ll_A4283);
        ll_A4284 = findViewById(R.id.ll_A4284);

        rb_A4251_1 = findViewById(R.id.rb_A4251_1);
        rb_A4251_2 = findViewById(R.id.rb_A4251_2);
        rb_A4251_DK = findViewById(R.id.rb_A4251_DK);
        rb_A4253_1 = findViewById(R.id.rb_A4253_1);
        rb_A4253_2 = findViewById(R.id.rb_A4253_2);
        rb_A4253_3 = findViewById(R.id.rb_A4253_3);
        rb_A4253_DK = findViewById(R.id.rb_A4253_DK);
        rb_A4254_1 = findViewById(R.id.rb_A4254_1);
        rb_A4254_2 = findViewById(R.id.rb_A4254_2);
        rb_A4254_DK = findViewById(R.id.rb_A4254_DK);
        rb_A4274_1 = findViewById(R.id.rb_A4274_1);
        rb_A4274_2 = findViewById(R.id.rb_A4274_2);
        rb_A4274_DK = findViewById(R.id.rb_A4274_DK);
        rb_A4275_1 = findViewById(R.id.rb_A4275_1);
        rb_A4275_2 = findViewById(R.id.rb_A4275_2);
        rb_A4275_DK = findViewById(R.id.rb_A4275_DK);
        rb_A4277_1 = findViewById(R.id.rb_A4277_1);
        rb_A4277_2 = findViewById(R.id.rb_A4277_2);
        rb_A4277_DK = findViewById(R.id.rb_A4277_DK);
        rb_A4280_1 = findViewById(R.id.rb_A4280_1);
        rb_A4280_2 = findViewById(R.id.rb_A4280_2);
        rb_A4280_DK = findViewById(R.id.rb_A4280_DK);
        rb_A4280_RA = findViewById(R.id.rb_A4280_RA);
        rb_A4281_1 = findViewById(R.id.rb_A4281_1);
        rb_A4281_2 = findViewById(R.id.rb_A4281_2);
        rb_A4281_DK = findViewById(R.id.rb_A4281_DK);
        rb_A4281_RA = findViewById(R.id.rb_A4281_RA);
        rb_A4282_1 = findViewById(R.id.rb_A4282_1);
        rb_A4282_2 = findViewById(R.id.rb_A4282_2);
        rb_A4282_DK = findViewById(R.id.rb_A4282_DK);
        rb_A4282_RA = findViewById(R.id.rb_A4282_RA);
        rb_A4283_1 = findViewById(R.id.rb_A4283_1);
        rb_A4283_2 = findViewById(R.id.rb_A4283_2);
        rb_A4283_DK = findViewById(R.id.rb_A4283_DK);
        rb_A4283_RA = findViewById(R.id.rb_A4283_RA);

        ed_A4253_3 = findViewById(R.id.ed_A4253_3);
        ed_A4255_4 = findViewById(R.id.ed_A4255_4);
        ed_A4255_13 = findViewById(R.id.ed_A4255_13);
        ed_A4256_minutes = findViewById(R.id.ed_A4256_minutes);
        ed_A4256_hours = findViewById(R.id.ed_A4256_hours);
        ed_A4256_days = findViewById(R.id.ed_A4256_days);
        ed_A4276_5 = findViewById(R.id.ed_A4276_5);
        ed_A4276_16 = findViewById(R.id.ed_A4276_16);
        ed_A4284_days = findViewById(R.id.ed_A4284_days);

        cb_A4255_1 = findViewById(R.id.cb_A4255_1);
        cb_A4255_2 = findViewById(R.id.cb_A4255_2);
        cb_A4255_3 = findViewById(R.id.cb_A4255_3);
        cb_A4255_4 = findViewById(R.id.cb_A4255_4);
        cb_A4255_5 = findViewById(R.id.cb_A4255_5);
        cb_A4255_6 = findViewById(R.id.cb_A4255_6);
        cb_A4255_7 = findViewById(R.id.cb_A4255_7);
        cb_A4255_8 = findViewById(R.id.cb_A4255_8);
        cb_A4255_9 = findViewById(R.id.cb_A4255_9);
        cb_A4255_10 = findViewById(R.id.cb_A4255_10);
        cb_A4255_11 = findViewById(R.id.cb_A4255_11);
        cb_A4255_12 = findViewById(R.id.cb_A4255_12);
        cb_A4255_13 = findViewById(R.id.cb_A4255_13);
        cb_A4255_DK = findViewById(R.id.cb_A4255_DK);
        cb_A4276_1 = findViewById(R.id.cb_A4276_1);
        cb_A4276_2 = findViewById(R.id.cb_A4276_2);
        cb_A4276_3 = findViewById(R.id.cb_A4276_3);
        cb_A4276_4 = findViewById(R.id.cb_A4276_4);
        cb_A4276_5 = findViewById(R.id.cb_A4276_5);
        cb_A4276_6 = findViewById(R.id.cb_A4276_6);
        cb_A4276_7 = findViewById(R.id.cb_A4276_7);
        cb_A4276_8 = findViewById(R.id.cb_A4276_8);
        cb_A4276_9 = findViewById(R.id.cb_A4276_9);
        cb_A4276_10 = findViewById(R.id.cb_A4276_10);
        cb_A4276_11 = findViewById(R.id.cb_A4276_11);
        cb_A4276_12 = findViewById(R.id.cb_A4276_12);
        cb_A4276_13 = findViewById(R.id.cb_A4276_13);
        cb_A4276_14 = findViewById(R.id.cb_A4276_14);
        cb_A4276_15 = findViewById(R.id.cb_A4276_15);
        cb_A4276_16 = findViewById(R.id.cb_A4276_16);
        cb_A4276_DK = findViewById(R.id.cb_A4276_DK);
        cb_A4278_1 = findViewById(R.id.cb_A4278_1);
        cb_A4278_2 = findViewById(R.id.cb_A4278_2);
        cb_A4278_3 = findViewById(R.id.cb_A4278_3);
        cb_A4278_4 = findViewById(R.id.cb_A4278_4);
        cb_A4278_5 = findViewById(R.id.cb_A4278_5);
        cb_A4278_6 = findViewById(R.id.cb_A4278_6);
        cb_A4278_7 = findViewById(R.id.cb_A4278_7);
        cb_A4278_DK = findViewById(R.id.cb_A4278_DK);
        cb_A4279_1 = findViewById(R.id.cb_A4279_1);
        cb_A4279_2 = findViewById(R.id.cb_A4279_2);
        cb_A4279_3 = findViewById(R.id.cb_A4279_3);
        cb_A4279_4 = findViewById(R.id.cb_A4279_4);
        cb_A4279_5 = findViewById(R.id.cb_A4279_5);
        cb_A4279_6 = findViewById(R.id.cb_A4279_6);
        cb_A4279_7 = findViewById(R.id.cb_A4279_7);
        cb_A4279_DK = findViewById(R.id.cb_A4279_DK);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4251__a4284);

        Initialization();
        events_call();
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false)
        {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c2 = new Intent(com.example.abdulsajid.vasaadult.A4251.this, A4301.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4251_1
                || compoundButton.getId() == R.id.rb_A4251_2
                || compoundButton.getId() == R.id.rb_A4251_DK)

                ClearAllcontrol.ClearAll(ll_A4252);
                ClearAllcontrol.ClearAll(ll_A4253);
                ClearAllcontrol.ClearAll(ll_A4254);
                ClearAllcontrol.ClearAll(ll_A4255);
                ClearAllcontrol.ClearAll(ll_A4256);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);
                ClearAllcontrol.ClearAll(ll_A4283);

                ll_A4252.setVisibility(View.GONE);
                ll_A4253.setVisibility(View.GONE);
                ll_A4254.setVisibility(View.GONE);
                ll_A4255.setVisibility(View.GONE);
                ll_A4256.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
                ll_A4283.setVisibility(View.GONE);

        {
            if (rb_A4251_1.isChecked()) {

                ll_A4252.setVisibility(View.VISIBLE);
                ll_A4253.setVisibility(View.VISIBLE);
                ll_A4254.setVisibility(View.VISIBLE);
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);

            } else if (rb_A4251_2.isChecked()) {

                ll_A4254.setVisibility(View.VISIBLE);
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);

            }
        }
    }


    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void events_call(){

        btn_next11.setOnClickListener(this);

        rb_A4251_1.setOnCheckedChangeListener(this);
        rb_A4251_2.setOnCheckedChangeListener(this);
        rb_A4251_DK.setOnCheckedChangeListener(this);
        /*rb_A4253_1.setOnCheckedChangeListener(this);
        rb_A4253_2.setOnCheckedChangeListener(this);
        rb_A4253_DK.setOnCheckedChangeListener(this);
        rb_A4254_1.setOnCheckedChangeListener(this);
        rb_A4254_2.setOnCheckedChangeListener(this);
        rb_A4254_DK.setOnCheckedChangeListener(this);
        rb_A4274_1.setOnCheckedChangeListener(this);
        rb_A4274_2.setOnCheckedChangeListener(this);
        rb_A4274_DK.setOnCheckedChangeListener(this);
        rb_A4275_1.setOnCheckedChangeListener(this);
        rb_A4275_2.setOnCheckedChangeListener(this);
        rb_A4275_DK.setOnCheckedChangeListener(this);
        rb_A4277_1.setOnCheckedChangeListener(this);
        rb_A4277_2.setOnCheckedChangeListener(this);
        rb_A4277_DK.setOnCheckedChangeListener(this);
        rb_A4280_1.setOnCheckedChangeListener(this);
        rb_A4280_2.setOnCheckedChangeListener(this);
        rb_A4280_DK.setOnCheckedChangeListener(this);
        rb_A4280_RA.setOnCheckedChangeListener(this);
        rb_A4281_1.setOnCheckedChangeListener(this);
        rb_A4281_2.setOnCheckedChangeListener(this);
        rb_A4281_DK.setOnCheckedChangeListener(this);
        rb_A4281_RA.setOnCheckedChangeListener(this);
        rb_A4282_1.setOnCheckedChangeListener(this);
        rb_A4282_2.setOnCheckedChangeListener(this);
        rb_A4282_DK.setOnCheckedChangeListener(this);
        rb_A4282_RA.setOnCheckedChangeListener(this);
        rb_A4283_1.setOnCheckedChangeListener(this);
        rb_A4283_2.setOnCheckedChangeListener(this);
        rb_A4283_DK.setOnCheckedChangeListener(this);
        rb_A4283_RA.setOnCheckedChangeListener(this);*/

        /*cb_A4255_1.setOnCheckedChangeListener(this);
        cb_A4255_2.setOnCheckedChangeListener(this);
        cb_A4255_3.setOnCheckedChangeListener(this);
        cb_A4255_5.setOnCheckedChangeListener(this);
        cb_A4255_6.setOnCheckedChangeListener(this);
        cb_A4255_7.setOnCheckedChangeListener(this);
        cb_A4255_8.setOnCheckedChangeListener(this);
        cb_A4255_9.setOnCheckedChangeListener(this);
        cb_A4255_10.setOnCheckedChangeListener(this);
        cb_A4255_11.setOnCheckedChangeListener(this);
        cb_A4255_12.setOnCheckedChangeListener(this);
        cb_A4255_DK.setOnCheckedChangeListener(this);
        cb_A4276_1.setOnCheckedChangeListener(this);
        cb_A4276_2.setOnCheckedChangeListener(this);
        cb_A4276_3.setOnCheckedChangeListener(this);
        cb_A4276_4.setOnCheckedChangeListener(this);
        cb_A4276_6.setOnCheckedChangeListener(this);
        cb_A4276_7.setOnCheckedChangeListener(this);
        cb_A4276_8.setOnCheckedChangeListener(this);
        cb_A4276_9.setOnCheckedChangeListener(this);
        cb_A4276_10.setOnCheckedChangeListener(this);
        cb_A4276_11.setOnCheckedChangeListener(this);
        cb_A4276_12.setOnCheckedChangeListener(this);
        cb_A4276_13.setOnCheckedChangeListener(this);
        cb_A4276_14.setOnCheckedChangeListener(this);
        cb_A4276_15.setOnCheckedChangeListener(this);
        cb_A4276_DK.setOnCheckedChangeListener(this);
        cb_A4278_1.setOnCheckedChangeListener(this);
        cb_A4278_2.setOnCheckedChangeListener(this);
        cb_A4278_3.setOnCheckedChangeListener(this);
        cb_A4278_4.setOnCheckedChangeListener(this);
        cb_A4278_5.setOnCheckedChangeListener(this);
        cb_A4278_6.setOnCheckedChangeListener(this);
        cb_A4278_7.setOnCheckedChangeListener(this);
        cb_A4278_DK.setOnCheckedChangeListener(this);
        cb_A4279_1.setOnCheckedChangeListener(this);
        cb_A4279_2.setOnCheckedChangeListener(this);
        cb_A4279_3.setOnCheckedChangeListener(this);
        cb_A4279_4.setOnCheckedChangeListener(this);
        cb_A4279_5.setOnCheckedChangeListener(this);
        cb_A4279_6.setOnCheckedChangeListener(this);
        cb_A4279_7.setOnCheckedChangeListener(this);
        cb_A4279_DK.setOnCheckedChangeListener(this);*/
    }

    void value_assignment() {

        study_id     = "0";
        A4251        = "000";
        A4253        = "000";
        A4253_3      = "000";
        A4254        = "000";
        A4255_1      = "000";
        A4255_2      = "000";
        A4255_3      = "000";
        A4255_4      = "000";
        A4255_4_OT   = "000";
        A4255_5      = "000";
        A4255_6      = "000";
        A4255_7      = "000";
        A4255_8      = "000";
        A4255_9      = "000";
        A4255_10     = "000";
        A4255_11     = "000";
        A4255_12     = "000";
        A4255_13     = "000";
        A4255_13_OT  = "000";
        A4255_DK     = "000";
        A4256_minutes= "000";
        A4256_hours  = "000";
        A4256_days   = "000";
        A4274        = "000";
        A4275        = "000";
        A4276_1      = "000";
        A4276_2      = "000";
        A4276_3      = "000";
        A4276_4      = "000";
        A4276_5      = "000";
        A4276_5_OT   = "000";
        A4276_6      = "000";
        A4276_7      = "000";
        A4276_8      = "000";
        A4276_9      = "000";
        A4276_10     = "000";
        A4276_11     = "000";
        A4276_12     = "000";
        A4276_13     = "000";
        A4276_14     = "000";
        A4276_15     = "000";
        A4276_16     = "000";
        A4276_16_OT  = "000";
        A4276_DK     = "000";
        A4277        = "000";
        A4278_1      = "000";
        A4278_2      = "000";
        A4278_3      = "000";
        A4278_4      = "000";
        A4278_5      = "000";
        A4278_6      = "000";
        A4278_7      = "000";
        A4278_DK     = "000";
        A4279_1      = "000";
        A4279_2      = "000";
        A4279_3      = "000";
        A4279_4      = "000";
        A4279_5      = "000";
        A4279_6      = "000";
        A4279_7      = "000";
        A4279_DK     = "000";
        A4280        = "000";
        A4281        = "000";
        A4282        = "000";
        A4283        = "000";
        A4284        = "000";
        STATUS       = "0";

        //A4251
        if (rb_A4251_1.isChecked()) {
            A4251 = "1";
        }
        if (rb_A4251_2.isChecked()) {
            A4251 = "2";
        }
        if (rb_A4251_DK.isChecked()) {
            A4251 = "9";
        }

        //A4253
        if (rb_A4253_1.isChecked()) {
            A4253 = "1";
        }
        if (rb_A4253_2.isChecked()) {
            A4253 = "2";
        }
        if (rb_A4253_3.isChecked()) {
            A4253 = "3";
        }
        if (rb_A4253_DK.isChecked()) {
            A4253 = "9";
        }
        if (ed_A4253_3.getText().toString().trim().length() > 0) {
            A4253_3 = ed_A4253_3.getText().toString().trim();
        }

        //A4254
        if (rb_A4254_1.isChecked()) {
            A4254 = "1";
        }
        if (rb_A4254_2.isChecked()) {
            A4254 = "2";
        }
        if (rb_A4254_DK.isChecked()) {
            A4254 = "9";
        }

        //A4255
        if (cb_A4255_1.isChecked()) {
            A4255_1 = "1";
        }
        if (cb_A4255_2.isChecked()) {
            A4255_2 = "2";
        }
        if (cb_A4255_3.isChecked()) {
            A4255_3 = "3";
        }
        if (cb_A4255_4.isChecked()) {
            A4255_4 = "4";
        }
        if (ed_A4255_4.getText().toString().trim().length() > 0) {
            A4255_4_OT = ed_A4255_4.getText().toString().trim();
        }
        if (cb_A4255_5.isChecked()) {
            A4255_5 = "5";
        }
        if (cb_A4255_6.isChecked()) {
            A4255_6 = "6";
        }
        if (cb_A4255_7.isChecked()) {
            A4255_7 = "7";
        }
        if (cb_A4255_8.isChecked()) {
            A4255_8 = "8";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_10.isChecked()) {
            A4255_10 = "10";
        }
        if (cb_A4255_11.isChecked()) {
            A4255_11 = "11";
        }
        if (cb_A4255_12.isChecked()) {
            A4255_12 = "12";
        }
        if (cb_A4255_13.isChecked()) {
            A4255_13 = "13";
        }
        if (ed_A4255_13.getText().toString().trim().length() > 0) {
            A4255_13_OT = ed_A4255_13.getText().toString().trim();
        }
        if (cb_A4255_DK.isChecked()) {
            A4255_DK = "99";
        }

        //A4256
        if (ed_A4256_minutes.getText().toString().trim().length() > 0) {
            A4256_minutes = ed_A4256_minutes.getText().toString().trim();
        }
        if (ed_A4256_hours.getText().toString().trim().length() > 0) {
            A4256_hours = ed_A4256_hours.getText().toString().trim();
        }
        if (ed_A4256_days.getText().toString().trim().length() > 0) {
            A4256_days = ed_A4256_days.getText().toString().trim();
        }

        //A4274
        if (rb_A4274_1.isChecked()) {
            A4274 = "1";
        }
        if (rb_A4274_2.isChecked()) {
            A4274 = "2";
        }
        if (rb_A4274_DK.isChecked()) {
            A4274 = "9";
        }

        //A4275
        if (rb_A4275_1.isChecked()) {
            A4275 = "1";
        }
        if (rb_A4275_2.isChecked()) {
            A4275 = "2";
        }
        if (rb_A4275_DK.isChecked()) {
            A4275 = "9";
        }

        //A4276
        if (cb_A4276_1.isChecked()) {
            A4276_1 = "1";
        }
        if (cb_A4276_2.isChecked()) {
            A4276_2 = "2";
        }
        if (cb_A4276_3.isChecked()) {
            A4276_3 = "3";
        }
        if (cb_A4276_4.isChecked()) {
            A4276_4 = "4";
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (ed_A4276_5.getText().toString().trim().length() > 0) {
            A4276_5_OT = ed_A4276_5.getText().toString().trim();
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (cb_A4276_6.isChecked()) {
            A4276_6 = "6";
        }
        if (cb_A4276_7.isChecked()) {
            A4276_7 = "7";
        }
        if (cb_A4276_8.isChecked()) {
            A4276_8 = "8";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_10.isChecked()) {
            A4276_10 = "10";
        }
        if (cb_A4276_11.isChecked()) {
            A4276_11 = "11";
        }
        if (cb_A4276_12.isChecked()) {
            A4276_12 = "12";
        }
        if (cb_A4276_13.isChecked()) {
            A4276_13 = "13";
        }
        if (cb_A4276_14.isChecked()) {
            A4276_14 = "14";
        }
        if (cb_A4276_15.isChecked()) {
            A4276_15 = "15";
        }
        if (cb_A4276_16.isChecked()) {
            A4276_16 = "16";
        }
        if (ed_A4276_16.getText().toString().trim().length() > 0) {
            A4276_16_OT = ed_A4276_16.getText().toString().trim();
        }
        if (cb_A4276_DK.isChecked()) {
            A4276_DK = "99";
        }

        //A4277
        if (rb_A4277_1.isChecked()) {
            A4277 = "1";
        }
        if (rb_A4277_2.isChecked()) {
            A4277 = "2";
        }
        if (rb_A4277_DK.isChecked()) {
            A4277 = "9";
        }

        //A4278
        if (cb_A4278_1.isChecked()) {
            A4278_1 = "1";
        }
        if (cb_A4278_2.isChecked()) {
            A4278_2 = "2";
        }
        if (cb_A4278_3.isChecked()) {
            A4278_3 = "3";
        }
        if (cb_A4278_4.isChecked()) {
            A4278_4 = "4";
        }
        if (cb_A4278_5.isChecked()) {
            A4278_5 = "5";
        }
        if (cb_A4278_6.isChecked()) {
            A4278_6 = "6";
        }
        if (cb_A4278_7.isChecked()) {
            A4278_7 = "7";
        }
        if (cb_A4278_DK.isChecked()) {
            A4278_DK = "9";
        }
        
        //A4279
        if (cb_A4279_1.isChecked()) {
            A4279_1 = "1";
        }
        if (cb_A4279_2.isChecked()) {
            A4279_2 = "2";
        }
        if (cb_A4279_3.isChecked()) {
            A4279_3 = "3";
        }
        if (cb_A4279_4.isChecked()) {
            A4279_4 = "4";
        }
        if (cb_A4279_5.isChecked()) {
            A4279_5 = "5";
        }
        if (cb_A4279_6.isChecked()) {
            A4279_6 = "6";
        }
        if (cb_A4279_7.isChecked()) {
            A4279_7 = "7";
        }
        if (cb_A4279_DK.isChecked()) {
            A4279_DK = "9";
        }

        //A4280
        if (rb_A4280_1.isChecked()) {
            A4280 = "1";
        }
        if (rb_A4280_2.isChecked()) {
            A4280 = "2";
        }
        if (rb_A4280_DK.isChecked()) {
            A4280 = "9";
        }
        if (rb_A4280_RA.isChecked()) {
            A4280 = "8";
        }

        //A4281
        if (rb_A4281_1.isChecked()) {
            A4281 = "1";
        }
        if (rb_A4281_2.isChecked()) {
            A4281 = "2";
        }
        if (rb_A4281_DK.isChecked()) {
            A4281 = "9";
        }
        if (rb_A4281_RA.isChecked()) {
            A4281 = "8";
        }

        //A4282
        if (rb_A4282_1.isChecked()) {
            A4282 = "1";
        }
        if (rb_A4282_2.isChecked()) {
            A4282 = "2";
        }
        if (rb_A4282_DK.isChecked()) {
            A4282 = "9";
        }
        if (rb_A4282_RA.isChecked()) {
            A4282 = "8";
        }

        //A4283
        if (rb_A4283_1.isChecked()) {
            A4283 = "1";
        }
        if (rb_A4283_2.isChecked()) {
            A4283 = "2";
        }
        if (rb_A4283_DK.isChecked()) {
            A4283 = "9";
        }
        if (rb_A4283_RA.isChecked()) {
            A4280 = "8";
        }

        //A4284
        if (ed_A4284_days.getText().toString().trim().length() > 0) {
            A4284 = ed_A4284_days.getText().toString().trim();
        }
    }
    
    void insert_data() {
        
        String query = "insert into A4251_A4284("

                +    Global.A.A4251_A4284.study_id      +   ","
                +    Global.A.A4251_A4284.A4251         +   ","
                +    Global.A.A4251_A4284.A4253         +   ","
                +    Global.A.A4251_A4284.A4253_3       +   ","
                +    Global.A.A4251_A4284.A4254         +   ","
                +    Global.A.A4251_A4284.A4255_1       +   ","
                +    Global.A.A4251_A4284.A4255_2       +   ","
                +    Global.A.A4251_A4284.A4255_3       +   ","
                +    Global.A.A4251_A4284.A4255_4       +   ","
                +    Global.A.A4251_A4284.A4255_4_OT    +   ","
                +    Global.A.A4251_A4284.A4255_5       +   ","
                +    Global.A.A4251_A4284.A4255_6       +   ","
                +    Global.A.A4251_A4284.A4255_7       +   ","
                +    Global.A.A4251_A4284.A4255_8       +   ","
                +    Global.A.A4251_A4284.A4255_9       +   ","
                +    Global.A.A4251_A4284.A4255_10      +   ","
                +    Global.A.A4251_A4284.A4255_11      +   ","
                +    Global.A.A4251_A4284.A4255_12      +   ","
                +    Global.A.A4251_A4284.A4255_13      +   ","
                +    Global.A.A4251_A4284.A4255_13_OT   +   ","
                +    Global.A.A4251_A4284.A4255_DK      +   ","
                +    Global.A.A4251_A4284.A4256_minutes +   ","
                +    Global.A.A4251_A4284.A4256_hours   +   ","
                +    Global.A.A4251_A4284.A4256_days    +   ","
                +    Global.A.A4251_A4284.A4274         +   ","
                +    Global.A.A4251_A4284.A4275         +   ","
                +    Global.A.A4251_A4284.A4276_1       +   ","
                +    Global.A.A4251_A4284.A4276_2       +   ","
                +    Global.A.A4251_A4284.A4276_3       +   ","
                +    Global.A.A4251_A4284.A4276_4       +   ","
                +    Global.A.A4251_A4284.A4276_5       +   ","
                +    Global.A.A4251_A4284.A4276_5_OT    +   ","
                +    Global.A.A4251_A4284.A4276_6       +   ","
                +    Global.A.A4251_A4284.A4276_7       +   ","
                +    Global.A.A4251_A4284.A4276_8       +   ","
                +    Global.A.A4251_A4284.A4276_9       +   ","
                +    Global.A.A4251_A4284.A4276_10      +   ","
                +    Global.A.A4251_A4284.A4276_11      +   ","
                +    Global.A.A4251_A4284.A4276_12      +   ","
                +    Global.A.A4251_A4284.A4276_13      +   ","
                +    Global.A.A4251_A4284.A4276_14      +   ","
                +    Global.A.A4251_A4284.A4276_15      +   ","
                +    Global.A.A4251_A4284.A4276_16      +   ","
                +    Global.A.A4251_A4284.A4276_16_OT   +   ","
                +    Global.A.A4251_A4284.A4276_DK      +   ","
                +    Global.A.A4251_A4284.A4277         +   ","
                +    Global.A.A4251_A4284.A4278_1       +   ","
                +    Global.A.A4251_A4284.A4278_2       +   ","
                +    Global.A.A4251_A4284.A4278_3       +   ","
                +    Global.A.A4251_A4284.A4278_4       +   ","
                +    Global.A.A4251_A4284.A4278_5       +   ","
                +    Global.A.A4251_A4284.A4278_6       +   ","
                +    Global.A.A4251_A4284.A4278_7       +   ","
                +    Global.A.A4251_A4284.A4278_DK      +   ","
                +    Global.A.A4251_A4284.A4279_1       +   ","
                +    Global.A.A4251_A4284.A4279_2       +   ","
                +    Global.A.A4251_A4284.A4279_3       +   ","
                +    Global.A.A4251_A4284.A4279_4       +   ","
                +    Global.A.A4251_A4284.A4279_5       +   ","
                +    Global.A.A4251_A4284.A4279_6       +   ","
                +    Global.A.A4251_A4284.A4279_7       +   ","
                +    Global.A.A4251_A4284.A4279_DK      +   ","
                +    Global.A.A4251_A4284.A4280         +   ","
                +    Global.A.A4251_A4284.A4281         +   ","
                +    Global.A.A4251_A4284.A4282         +   ","
                +    Global.A.A4251_A4284.A4283         +   ","
                +    Global.A.A4251_A4284.A4284         +   ","
                +    Global.A.A4251_A4284.STATUS        +   ")" +


                        " values ('"  +
                                        study_id        +   "','"   +
                                        A4251           +   "','"   +
                                        A4253           +   "','"   +
                                        A4253_3         +   "','"   +
                                        A4254           +   "','"   +
                                        A4255_1         +   "','"   +
                                        A4255_2         +   "','"   +
                                        A4255_3         +   "','"   +
                                        A4255_4         +   "','"   +
                                        A4255_4_OT      +   "','"   +
                                        A4255_5         +   "','"   +
                                        A4255_6         +   "','"   +
                                        A4255_7         +   "','"   +
                                        A4255_8         +   "','"   +
                                        A4255_9         +   "','"   +
                                        A4255_10        +   "','"   +
                                        A4255_11        +   "','"   +
                                        A4255_12        +   "','"   +
                                        A4255_13        +   "','"   +
                                        A4255_13_OT     +   "','"   +
                                        A4255_DK        +   "','"   +
                                        A4256_minutes   +   "','"   +
                                        A4256_hours     +   "','"   +
                                        A4256_days      +   "','"   +
                                        A4274           +   "','"   +
                                        A4275           +   "','"   +
                                        A4276_1         +   "','"   +
                                        A4276_2         +   "','"   +
                                        A4276_3         +   "','"   +
                                        A4276_4         +   "','"   +
                                        A4276_5         +   "','"   +
                                        A4276_5_OT      +   "','"   +
                                        A4276_6         +   "','"   +
                                        A4276_7         +   "','"   +
                                        A4276_8         +   "','"   +
                                        A4276_9         +   "','"   +
                                        A4276_10        +   "','"   +
                                        A4276_11        +   "','"   +
                                        A4276_12        +   "','"   +
                                        A4276_13        +   "','"   +
                                        A4276_14        +   "','"   +
                                        A4276_15        +   "','"   +
                                        A4276_16        +   "','"   +
                                        A4276_16_OT     +   "','"   +
                                        A4276_DK        +   "','"   +
                                        A4277           +   "','"   +
                                        A4278_1         +   "','"   +
                                        A4278_2         +   "','"   +
                                        A4278_3         +   "','"   +
                                        A4278_4         +   "','"   +
                                        A4278_5         +   "','"   +
                                        A4278_6         +   "','"   +
                                        A4278_7         +   "','"   +
                                        A4278_DK        +   "','"   +
                                        A4279_1         +   "','"   +
                                        A4279_2         +   "','"   +
                                        A4279_3         +   "','"   +
                                        A4279_4         +   "','"   +
                                        A4279_5         +   "','"   +
                                        A4279_6         +   "','"   +
                                        A4279_7         +   "','"   +
                                        A4279_DK        +   "','"   +
                                        A4280           +   "','"   +
                                        A4281           +   "','"   +
                                        A4282           +   "','"   +
                                        A4283           +   "','"   +
                                        A4284           +   "','"   +
                                        STATUS          +   "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "11th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }


    boolean validateField() {
       if (Gothrough.IamHiden(ll_A4251) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4252) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4253) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4254) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4255) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4256) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4274) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4275) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4276) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4277) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4278) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4279) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4280) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4281) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4282) == false) {
            return false;
       }

       if (Gothrough.IamHiden(ll_A4283) == false) {
            return false;
       }

        return Gothrough.IamHiden(ll_A4284) != false;
    }
}

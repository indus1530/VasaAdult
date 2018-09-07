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

public class A4051_A4066 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next2;

    LinearLayout
            ll_A4051,
            ll_A4052_u,
            ll_A4052_b,
            ll_A4052_c,
            ll_A4053,
            ll_A4054,
            ll_A4055,
            ll_A4056,
            ll_A4057,
            ll_A4058,
            ll_A4059_u,
            ll_A4059_a,
            ll_A4059_b,
            ll_A4060,
            ll_A4061,
            ll_A4062,
            ll_A4063,
            ll_A4064_u,
            ll_A4064_a,
            ll_A4064_b,
            ll_A4064_1,
            ll_A4065,
            ll_A4066;

    RadioButton
            rb_A4051_1,
            rb_A4051_2,
            rb_A4051_DK,
            rb_A4051_RA,
            rb_A4052_u_1,
            rb_A4052_u_2,
            rb_A4052_u_DK,
            rb_A4052_u_RA,
            rb_A4053_1,
            rb_A4053_2,
            rb_A4053_DK,
            rb_A4053_RA,
            rb_A4054_1,
            rb_A4054_2,
            rb_A4054_3,
            rb_A4054_DK,
            rb_A4054_RA,
            rb_A4055_1,
            rb_A4055_2,
            rb_A4055_3,
            rb_A4055_DK,
            rb_A4055_RA,
            rb_A4056_1,
            rb_A4056_2,
            rb_A4056_DK,
            rb_A4056_RA,
            rb_A4057_1,
            rb_A4057_2,
            rb_A4057_DK,
            rb_A4057_RA,
            rb_A4058_1,
            rb_A4058_2,
            rb_A4058_DK,
            rb_A4058_RA,
            rb_A4059_u_1,
            rb_A4059_u_2,
            rb_A4059_u_DK,
            rb_A4059_u_RA,
            rb_A4060_1,
            rb_A4060_2,
            rb_A4060_DK,
            rb_A4060_RA,
            rb_A4061_1,
            rb_A4061_2,
            rb_A4061_DK,
            rb_A4061_RA,
            rb_A4062_1,
            rb_A4062_2,
            rb_A4062_DK,
            rb_A4062_RA,
            rb_A4063_1,
            rb_A4063_2,
            rb_A4063_DK,
            rb_A4063_RA,
            rb_A4064_u_1,
            rb_A4064_u_2,
            rb_A4064_u_DK,
            rb_A4064_u_RA,
            rb_A4064_1_1,
            rb_A4064_1_2,
            rb_A4064_1_DK,
            rb_A4064_1_RA,
            rb_A4065_1,
            rb_A4065_2,
            rb_A4065_DK,
            rb_A4065_RA,
            rb_A4066_1,
            rb_A4066_2,
            rb_A4066_DK,
            rb_A4066_RA;

    EditText
            ed_A4052_b,
            ed_A4052_c,
            ed_A4059_a,
            ed_A4059_b,
            ed_A4064_a,
            ed_A4064_b;

    String
            study_id,
            A4051,
            A4052_u,
            A4052_b,
            A4052_c,
            A4053,
            A4054,
            A4055,
            A4056,
            A4057,
            A4058,
            A4059_u,
            A4059_a,
            A4059_b,
            A4060,
            A4061,
            A4062,
            A4063,
            A4064_u,
            A4064_a,
            A4064_b,
            A4064_1,
            A4065,
            A4066,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next2 = (Button) findViewById(R.id.btn_next2);

        //Linear Layout
        ll_A4051 = (LinearLayout) findViewById(R.id.ll_A4051);
        ll_A4052_u = (LinearLayout) findViewById(R.id.ll_A4052_u);
        ll_A4052_b = (LinearLayout) findViewById(R.id.ll_A4052_b);
        ll_A4052_c = (LinearLayout) findViewById(R.id.ll_A4052_c);
        ll_A4053 = (LinearLayout) findViewById(R.id.ll_A4053);
        ll_A4054 = (LinearLayout) findViewById(R.id.ll_A4054);
        ll_A4055 = (LinearLayout) findViewById(R.id.ll_A4055);
        ll_A4056 = (LinearLayout) findViewById(R.id.ll_A4056);
        ll_A4057 = (LinearLayout) findViewById(R.id.ll_A4057);
        ll_A4058 = (LinearLayout) findViewById(R.id.ll_A4058);
        ll_A4059_u = (LinearLayout) findViewById(R.id.ll_A4059_u);
        ll_A4059_a = (LinearLayout) findViewById(R.id.ll_A4059_a);
        ll_A4059_b = (LinearLayout) findViewById(R.id.ll_A4059_b);
        ll_A4060 = (LinearLayout) findViewById(R.id.ll_A4060);
        ll_A4061 = (LinearLayout) findViewById(R.id.ll_A4061);
        ll_A4062 = (LinearLayout) findViewById(R.id.ll_A4062);
        ll_A4063 = (LinearLayout) findViewById(R.id.ll_A4063);
        ll_A4064_u = (LinearLayout) findViewById(R.id.ll_A4064_u);
        ll_A4064_a = (LinearLayout) findViewById(R.id.ll_A4064_a);
        ll_A4064_b = (LinearLayout) findViewById(R.id.ll_A4064_b);
        ll_A4064_1 = (LinearLayout) findViewById(R.id.ll_A4064_1);
        ll_A4065 = (LinearLayout) findViewById(R.id.ll_A4065);
        ll_A4066 = (LinearLayout) findViewById(R.id.ll_A4066);

        //Radio Button
        rb_A4051_1 = findViewById(R.id.rb_A4051_1);
        rb_A4051_2 = findViewById(R.id.rb_A4051_2);
        rb_A4051_DK = findViewById(R.id.rb_A4051_DK);
        rb_A4051_RA = findViewById(R.id.rb_A4051_RA);
        rb_A4052_u_1 = findViewById(R.id.rb_A4052_u_1);
        rb_A4052_u_2 = findViewById(R.id.rb_A4052_u_2);
        rb_A4052_u_DK = findViewById(R.id.rb_A4052_u_DK);
        rb_A4052_u_RA = findViewById(R.id.rb_A4052_u_RA);
        rb_A4053_1 = findViewById(R.id.rb_A4053_1);
        rb_A4053_2 = findViewById(R.id.rb_A4053_2);
        rb_A4053_DK = findViewById(R.id.rb_A4053_DK);
        rb_A4053_RA = findViewById(R.id.rb_A4053_RA);
        rb_A4054_1 = findViewById(R.id.rb_A4054_1);
        rb_A4054_2 = findViewById(R.id.rb_A4054_2);
        rb_A4054_3 = findViewById(R.id.rb_A4054_3);
        rb_A4054_DK = findViewById(R.id.rb_A4054_DK);
        rb_A4054_RA = findViewById(R.id.rb_A4054_RA);
        rb_A4055_1 = findViewById(R.id.rb_A4055_1);
        rb_A4055_2 = findViewById(R.id.rb_A4055_2);
        rb_A4055_3 = findViewById(R.id.rb_A4055_3);
        rb_A4055_DK = findViewById(R.id.rb_A4055_DK);
        rb_A4055_RA = findViewById(R.id.rb_A4055_RA);
        rb_A4056_1 = findViewById(R.id.rb_A4056_1);
        rb_A4056_2 = findViewById(R.id.rb_A4056_2);
        rb_A4056_DK = findViewById(R.id.rb_A4056_DK);
        rb_A4056_RA = findViewById(R.id.rb_A4056_RA);
        rb_A4057_1 = findViewById(R.id.rb_A4057_1);
        rb_A4057_2 = findViewById(R.id.rb_A4057_2);
        rb_A4057_DK = findViewById(R.id.rb_A4057_DK);
        rb_A4057_RA = findViewById(R.id.rb_A4057_RA);
        rb_A4058_1 = findViewById(R.id.rb_A4058_1);
        rb_A4058_2 = findViewById(R.id.rb_A4058_2);
        rb_A4058_DK = findViewById(R.id.rb_A4058_DK);
        rb_A4058_RA = findViewById(R.id.rb_A4058_RA);
        rb_A4059_u_1 = findViewById(R.id.rb_A4059_u_1);
        rb_A4059_u_2 = findViewById(R.id.rb_A4059_u_2);
        rb_A4059_u_DK = findViewById(R.id.rb_A4059_u_DK);
        rb_A4059_u_RA = findViewById(R.id.rb_A4059_u_RA);
        rb_A4060_1 = findViewById(R.id.rb_A4060_1);
        rb_A4060_2 = findViewById(R.id.rb_A4060_2);
        rb_A4060_DK = findViewById(R.id.rb_A4060_DK);
        rb_A4060_RA = findViewById(R.id.rb_A4060_RA);
        rb_A4061_1 = findViewById(R.id.rb_A4061_1);
        rb_A4061_2 = findViewById(R.id.rb_A4061_2);
        rb_A4061_DK = findViewById(R.id.rb_A4061_DK);
        rb_A4061_RA = findViewById(R.id.rb_A4061_RA);
        rb_A4062_1 = findViewById(R.id.rb_A4062_1);
        rb_A4062_2 = findViewById(R.id.rb_A4062_2);
        rb_A4062_DK = findViewById(R.id.rb_A4062_DK);
        rb_A4062_RA = findViewById(R.id.rb_A4062_RA);
        rb_A4063_1 = findViewById(R.id.rb_A4063_1);
        rb_A4063_2 = findViewById(R.id.rb_A4063_2);
        rb_A4063_DK = findViewById(R.id.rb_A4063_DK);
        rb_A4063_RA = findViewById(R.id.rb_A4063_RA);
        rb_A4064_u_1 = findViewById(R.id.rb_A4064_u_1);
        rb_A4064_u_2 = findViewById(R.id.rb_A4064_u_2);
        rb_A4064_u_DK = findViewById(R.id.rb_A4064_u_DK);
        rb_A4064_u_RA = findViewById(R.id.rb_A4064_u_RA);
        rb_A4064_1_1 = findViewById(R.id.rb_A4064_1_1);
        rb_A4064_1_2 = findViewById(R.id.rb_A4064_1_2);
        rb_A4064_1_DK = findViewById(R.id.rb_A4064_1_DK);
        rb_A4064_1_RA = findViewById(R.id.rb_A4064_1_RA);
        rb_A4065_1 = findViewById(R.id.rb_A4065_1);
        rb_A4065_2 = findViewById(R.id.rb_A4065_2);
        rb_A4065_DK = findViewById(R.id.rb_A4065_DK);
        rb_A4065_RA = findViewById(R.id.rb_A4065_RA);
        rb_A4066_1 = findViewById(R.id.rb_A4066_1);
        rb_A4066_2 = findViewById(R.id.rb_A4066_2);
        rb_A4066_DK = findViewById(R.id.rb_A4066_DK);
        rb_A4066_RA = findViewById(R.id.rb_A4066_RA);

        // Edit Text
        ed_A4052_b = (EditText) findViewById(R.id.ed_A4052_b);
        ed_A4052_c = (EditText) findViewById(R.id.ed_A4052_c);
        ed_A4059_a = (EditText) findViewById(R.id.ed_A4059_a);
        ed_A4059_b = (EditText) findViewById(R.id.ed_A4059_b);
        ed_A4064_a = (EditText) findViewById(R.id.ed_A4064_a);
        ed_A4064_b = (EditText) findViewById(R.id.ed_A4064_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4051__a4066);

        Initialization();
        events_calls();
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c2 = new Intent(A4051_A4066.this, A4067_A4080.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4051_1
                || compoundButton.getId() == R.id.rb_A4051_2
                || compoundButton.getId() == R.id.rb_A4051_DK
                || compoundButton.getId() == R.id.rb_A4051_RA)

        {
            if (rb_A4051_2.isChecked() || rb_A4051_DK.isChecked() || rb_A4051_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4052_u);
                ClearAllcontrol.ClearAll(ll_A4052_b);
                ClearAllcontrol.ClearAll(ll_A4052_c);
                ClearAllcontrol.ClearAll(ll_A4053);
                ClearAllcontrol.ClearAll(ll_A4054);
                ClearAllcontrol.ClearAll(ll_A4055);
                ClearAllcontrol.ClearAll(ll_A4056);

                ll_A4052_u.setVisibility(View.GONE);
                ll_A4052_b.setVisibility(View.GONE);
                ll_A4052_c.setVisibility(View.GONE);
                ll_A4053.setVisibility(View.GONE);
                ll_A4054.setVisibility(View.GONE);
                ll_A4055.setVisibility(View.GONE);
                ll_A4056.setVisibility(View.GONE);
            } else {
                ll_A4052_u.setVisibility(View.VISIBLE);
                ll_A4052_b.setVisibility(View.VISIBLE);
                ll_A4052_c.setVisibility(View.VISIBLE);
                ll_A4053.setVisibility(View.VISIBLE);
                ll_A4054.setVisibility(View.VISIBLE);
                ll_A4055.setVisibility(View.VISIBLE);
                ll_A4056.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4052_u_1
                || compoundButton.getId() == R.id.rb_A4052_u_2
                || compoundButton.getId() == R.id.rb_A4052_u_DK
                || compoundButton.getId() == R.id.rb_A4052_u_RA)

                ClearAllcontrol.ClearAll(ll_A4052_b);
                ClearAllcontrol.ClearAll(ll_A4052_c);

        ll_A4052_b.setVisibility(View.GONE);
        ll_A4052_c.setVisibility(View.GONE);

        {
            if (rb_A4052_u_1.isChecked()) {
                ll_A4052_b.setVisibility(View.VISIBLE);
            } else if (rb_A4052_u_2.isChecked()) {
                ll_A4052_c.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4058_1
                || compoundButton.getId() == R.id.rb_A4058_2
                || compoundButton.getId() == R.id.rb_A4058_DK
                || compoundButton.getId() == R.id.rb_A4058_RA)

        {
            if (rb_A4058_2.isChecked() || rb_A4058_DK.isChecked() || rb_A4058_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4059_u);
                ClearAllcontrol.ClearAll(ll_A4059_a);
                ClearAllcontrol.ClearAll(ll_A4059_b);

                ll_A4059_u.setVisibility(View.GONE);
                ll_A4059_a.setVisibility(View.GONE);
                ll_A4059_b.setVisibility(View.GONE);
            } else {
                ll_A4059_u.setVisibility(View.VISIBLE);
                ll_A4059_a.setVisibility(View.VISIBLE);
                ll_A4059_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4059_u_1
                || compoundButton.getId() == R.id.rb_A4059_u_2
                || compoundButton.getId() == R.id.rb_A4059_u_DK
                || compoundButton.getId() == R.id.rb_A4059_u_RA)

            ClearAllcontrol.ClearAll(ll_A4059_a);
        ClearAllcontrol.ClearAll(ll_A4059_b);

        ll_A4059_a.setVisibility(View.GONE);
        ll_A4059_b.setVisibility(View.GONE);

        {
            if (rb_A4059_u_1.isChecked()) {
                ll_A4059_a.setVisibility(View.VISIBLE);
            } else if (rb_A4052_u_2.isChecked()) {
                ll_A4059_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4060_1
                || compoundButton.getId() == R.id.rb_A4060_2
                || compoundButton.getId() == R.id.rb_A4060_DK
                || compoundButton.getId() == R.id.rb_A4060_RA)

        {
            if (rb_A4060_2.isChecked() || rb_A4060_DK.isChecked() || rb_A4060_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4061);
                ll_A4061.setVisibility(View.GONE);

            } else {
                ll_A4061.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4062_1
                || compoundButton.getId() == R.id.rb_A4062_2
                || compoundButton.getId() == R.id.rb_A4062_DK
                || compoundButton.getId() == R.id.rb_A4062_RA)

        {
            if (rb_A4062_2.isChecked() || rb_A4062_DK.isChecked() || rb_A4062_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4063);
                ClearAllcontrol.ClearAll(ll_A4064_u);
                ClearAllcontrol.ClearAll(ll_A4064_a);
                ClearAllcontrol.ClearAll(ll_A4064_b);
                ClearAllcontrol.ClearAll(ll_A4064_1);
                ClearAllcontrol.ClearAll(ll_A4065);

                ll_A4063.setVisibility(View.GONE);
                ll_A4064_u.setVisibility(View.GONE);
                ll_A4064_a.setVisibility(View.GONE);
                ll_A4064_b.setVisibility(View.GONE);
                ll_A4064_1.setVisibility(View.GONE);
                ll_A4065.setVisibility(View.GONE);

            } else {
                ll_A4063.setVisibility(View.VISIBLE);
                ll_A4064_u.setVisibility(View.VISIBLE);
                ll_A4064_a.setVisibility(View.VISIBLE);
                ll_A4064_b.setVisibility(View.VISIBLE);
                ll_A4064_1.setVisibility(View.VISIBLE);
                ll_A4065.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4064_u_1
                || compoundButton.getId() == R.id.rb_A4064_u_2
                || compoundButton.getId() == R.id.rb_A4064_u_DK
                || compoundButton.getId() == R.id.rb_A4064_u_RA)

            ClearAllcontrol.ClearAll(ll_A4064_a);
        ClearAllcontrol.ClearAll(ll_A4064_b);

        ll_A4064_a.setVisibility(View.GONE);
        ll_A4064_b.setVisibility(View.GONE);

        {
            if (rb_A4064_u_1.isChecked()) {
                ll_A4064_a.setVisibility(View.VISIBLE);
            } else if (rb_A4064_u_2.isChecked()) {
                ll_A4064_b.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next2.setOnClickListener(this);

        rb_A4051_1.setOnCheckedChangeListener(this);
        rb_A4051_2.setOnCheckedChangeListener(this);
        rb_A4051_DK.setOnCheckedChangeListener(this);
        rb_A4051_RA.setOnCheckedChangeListener(this);
        rb_A4052_u_1.setOnCheckedChangeListener(this);
        rb_A4052_u_2.setOnCheckedChangeListener(this);
        rb_A4052_u_DK.setOnCheckedChangeListener(this);
        rb_A4052_u_RA.setOnCheckedChangeListener(this);
        rb_A4058_1.setOnCheckedChangeListener(this);
        rb_A4058_2.setOnCheckedChangeListener(this);
        rb_A4058_DK.setOnCheckedChangeListener(this);
        rb_A4058_RA.setOnCheckedChangeListener(this);
        rb_A4059_u_1.setOnCheckedChangeListener(this);
        rb_A4059_u_2.setOnCheckedChangeListener(this);
        rb_A4059_u_DK.setOnCheckedChangeListener(this);
        rb_A4059_u_RA.setOnCheckedChangeListener(this);
        rb_A4060_1.setOnCheckedChangeListener(this);
        rb_A4060_2.setOnCheckedChangeListener(this);
        rb_A4060_DK.setOnCheckedChangeListener(this);
        rb_A4060_RA.setOnCheckedChangeListener(this);
        rb_A4062_1.setOnCheckedChangeListener(this);
        rb_A4062_2.setOnCheckedChangeListener(this);
        rb_A4062_DK.setOnCheckedChangeListener(this);
        rb_A4062_RA.setOnCheckedChangeListener(this);
        rb_A4064_u_1.setOnCheckedChangeListener(this);
        rb_A4064_u_2.setOnCheckedChangeListener(this);
        rb_A4064_u_DK.setOnCheckedChangeListener(this);
        rb_A4064_u_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4051 = "000";
        A4052_u = "000";
        A4052_b = "000";
        A4052_c = "000";
        A4053 = "000";
        A4054 = "000";
        A4055 = "000";
        A4056 = "000";
        A4057 = "000";
        A4058 = "000";
        A4059_u = "000";
        A4059_a = "000";
        A4059_b = "000";
        A4060 = "000";
        A4061 = "000";
        A4062 = "000";
        A4063 = "000";
        A4064_u = "000";
        A4064_a = "000";
        A4064_b = "000";
        A4064_1 = "000";
        A4065 = "000";
        A4066 = "000";
        STATUS = "0";


        //A4051
        if (rb_A4051_1.isChecked()) {
            A4051 = "1";
        }
        if (rb_A4051_2.isChecked()) {
            A4051 = "2";
        }
        if (rb_A4051_DK.isChecked()) {
            A4051 = "9";
        }
        if (rb_A4051_RA.isChecked()) {
            A4051 = "8";
        }

        //A4052_u
        if (rb_A4052_u_1.isChecked()) {
            A4052_u = "1";
        }
        if (rb_A4052_u_2.isChecked()) {
            A4052_u = "2";
        }
        if (rb_A4052_u_DK.isChecked()) {
            A4052_u = "9";
        }
        if (rb_A4052_u_RA.isChecked()) {
            A4052_u = "8";
        }

        //A4052_b
        if (ed_A4052_b.getText().toString().trim().length() > 0) {
            A4052_b = ed_A4052_b.getText().toString().trim();
        }

        //A4052_c
        if (ed_A4052_c.getText().toString().trim().length() > 0) {
            A4052_c = ed_A4052_c.getText().toString().trim();
        }

        //A4053
        if (rb_A4053_1.isChecked()) {
            A4053 = "1";
        }
        if (rb_A4053_2.isChecked()) {
            A4053 = "2";
        }
        if (rb_A4053_DK.isChecked()) {
            A4053 = "9";
        }
        if (rb_A4053_RA.isChecked()) {
            A4053 = "8";
        }

        //A4054
        if (rb_A4054_1.isChecked()) {
            A4054 = "1";
        }
        if (rb_A4054_2.isChecked()) {
            A4054 = "2";
        }
        if (rb_A4054_3.isChecked()) {
            A4054 = "3";
        }
        if (rb_A4054_DK.isChecked()) {
            A4054 = "9";
        }
        if (rb_A4054_RA.isChecked()) {
            A4054 = "8";
        }

        //A4055
        if (rb_A4055_1.isChecked()) {
            A4055 = "1";
        }
        if (rb_A4055_2.isChecked()) {
            A4055 = "2";
        }
        if (rb_A4055_3.isChecked()) {
            A4055 = "3";
        }
        if (rb_A4055_DK.isChecked()) {
            A4055 = "9";
        }
        if (rb_A4055_RA.isChecked()) {
            A4055 = "8";
        }

        //A4056
        if (rb_A4056_1.isChecked()) {
            A4056 = "1";
        }
        if (rb_A4056_2.isChecked()) {
            A4056 = "2";
        }
        if (rb_A4056_DK.isChecked()) {
            A4056 = "9";
        }
        if (rb_A4056_RA.isChecked()) {
            A4056 = "8";
        }

        //A4057
        if (rb_A4057_1.isChecked()) {
            A4057 = "1";
        }
        if (rb_A4057_2.isChecked()) {
            A4057 = "2";
        }
        if (rb_A4057_DK.isChecked()) {
            A4057 = "9";
        }
        if (rb_A4057_RA.isChecked()) {
            A4057 = "8";
        }

        //A4058
        if (rb_A4058_1.isChecked()) {
            A4058 = "1";
        }
        if (rb_A4058_2.isChecked()) {
            A4058 = "2";
        }
        if (rb_A4058_DK.isChecked()) {
            A4058 = "9";
        }
        if (rb_A4058_RA.isChecked()) {
            A4058 = "8";
        }

        //A4059_u
        if (rb_A4059_u_1.isChecked()) {
            A4059_u = "1";
        }
        if (rb_A4059_u_2.isChecked()) {
            A4059_u = "2";
        }
        if (rb_A4059_u_DK.isChecked()) {
            A4059_u = "9";
        }
        if (rb_A4059_u_RA.isChecked()) {
            A4059_u = "8";
        }

        //A4059_a
        if (ed_A4059_a.getText().toString().trim().length() > 0) {
            A4059_a = ed_A4059_a.getText().toString().trim();
        }

        //A4059_b
        if (ed_A4059_b.getText().toString().trim().length() > 0) {
            A4059_b = ed_A4059_b.getText().toString().trim();
        }

        //A4060
        if (rb_A4060_1.isChecked()) {
            A4060 = "1";
        }
        if (rb_A4060_2.isChecked()) {
            A4060 = "2";
        }
        if (rb_A4060_DK.isChecked()) {
            A4060 = "9";
        }
        if (rb_A4060_RA.isChecked()) {
            A4060 = "8";
        }

        //A4061
        if (rb_A4061_1.isChecked()) {
            A4061 = "1";
        }
        if (rb_A4061_2.isChecked()) {
            A4061 = "2";
        }
        if (rb_A4061_DK.isChecked()) {
            A4061 = "9";
        }
        if (rb_A4061_RA.isChecked()) {
            A4061 = "8";
        }

        //A4062
        if (rb_A4062_1.isChecked()) {
            A4062 = "1";
        }
        if (rb_A4062_2.isChecked()) {
            A4062 = "2";
        }
        if (rb_A4062_DK.isChecked()) {
            A4062 = "9";
        }
        if (rb_A4062_RA.isChecked()) {
            A4062 = "8";
        }

        //A4063
        if (rb_A4063_1.isChecked()) {
            A4063 = "1";
        }
        if (rb_A4063_2.isChecked()) {
            A4063 = "2";
        }
        if (rb_A4063_DK.isChecked()) {
            A4063 = "9";
        }
        if (rb_A4063_RA.isChecked()) {
            A4063 = "8";
        }

        //A4064_u
        if (rb_A4064_u_1.isChecked()) {
            A4064_u = "1";
        }
        if (rb_A4064_u_2.isChecked()) {
            A4064_u = "2";
        }
        if (rb_A4064_u_DK.isChecked()) {
            A4064_u = "9";
        }
        if (rb_A4064_u_RA.isChecked()) {
            A4064_u = "8";
        }

        //A4064_a
        if (ed_A4064_a.getText().toString().trim().length() > 0) {
            A4064_a = ed_A4064_a.getText().toString().trim();
        }

        //A4064_b
        if (ed_A4064_b.getText().toString().trim().length() > 0) {
            A4064_b = ed_A4064_b.getText().toString().trim();
        }

        //A4064_1
        if (rb_A4064_1_1.isChecked()) {
            A4064_1 = "1";
        }
        if (rb_A4064_1_2.isChecked()) {
            A4064_1 = "2";
        }
        if (rb_A4064_1_DK.isChecked()) {
            A4064_1 = "9";
        }
        if (rb_A4064_1_RA.isChecked()) {
            A4064_1 = "8";
        }

        //A4065
        if (rb_A4065_1.isChecked()) {
            A4065 = "1";
        }
        if (rb_A4065_2.isChecked()) {
            A4065 = "2";
        }
        if (rb_A4065_DK.isChecked()) {
            A4065 = "9";
        }
        if (rb_A4065_RA.isChecked()) {
            A4065 = "8";
        }

        //A4066
        if (rb_A4066_1.isChecked()) {
            A4066 = "1";
        }
        if (rb_A4066_2.isChecked()) {
            A4066 = "2";
        }
        if (rb_A4066_DK.isChecked()) {
            A4066 = "9";
        }
        if (rb_A4066_RA.isChecked()) {
            A4066 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4051_A4066("

                + Global.A.A4051_A4066.study_id + ","
                + Global.A.A4051_A4066.A4051 + ","
                + Global.A.A4051_A4066.A4052_u + ","
                + Global.A.A4051_A4066.A4052_b + ","
                + Global.A.A4051_A4066.A4052_c + ","
                + Global.A.A4051_A4066.A4053 + ","
                + Global.A.A4051_A4066.A4054 + ","
                + Global.A.A4051_A4066.A4055 + ","
                + Global.A.A4051_A4066.A4056 + ","
                + Global.A.A4051_A4066.A4057 + ","
                + Global.A.A4051_A4066.A4058 + ","
                + Global.A.A4051_A4066.A4059_u + ","
                + Global.A.A4051_A4066.A4059_a + ","
                + Global.A.A4051_A4066.A4059_b + ","
                + Global.A.A4051_A4066.A4060 + ","
                + Global.A.A4051_A4066.A4061 + ","
                + Global.A.A4051_A4066.A4062 + ","
                + Global.A.A4051_A4066.A4063 + ","
                + Global.A.A4051_A4066.A4064_u + ","
                + Global.A.A4051_A4066.A4064_a + ","
                + Global.A.A4051_A4066.A4064_b + ","
                + Global.A.A4051_A4066.A4064_1 + ","
                + Global.A.A4051_A4066.A4065 + ","
                + Global.A.A4051_A4066.A4066 + ","
                + Global.A.A4051_A4066.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4051        + "','" +
                A4052_u      + "','" +
                A4052_b      + "','" +
                A4052_c      + "','" +
                A4053        + "','" +
                A4054        + "','" +
                A4055        + "','" +
                A4056        + "','" +
                A4057        + "','" +
                A4058        + "','" +
                A4059_u      + "','" +
                A4059_a      + "','" +
                A4059_b      + "','" +
                A4060        + "','" +
                A4061        + "','" +
                A4062        + "','" +
                A4063        + "','" +
                A4064_u      + "','" +
                A4064_a      + "','" +
                A4064_b      + "','" +
                A4064_1      + "','" +
                A4065        + "','" +
                A4066        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        Lm.database.execSQL(query);

        Toast.makeText(this, "2nd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4051) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4052_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4052_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4052_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4053) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4054) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4055) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4056) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4057) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4058) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4059_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4059_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4059_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4060) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4061) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4062) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4063) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4064_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4064_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4064_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4064_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4065) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4066) == false) {
            return false;
        }

        return true;
    }
}

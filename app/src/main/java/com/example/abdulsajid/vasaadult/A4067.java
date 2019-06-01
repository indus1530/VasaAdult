package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4067 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next3;

    LinearLayout
            ll_A4067,
            ll_A4068,
            ll_A4069_u,
            ll_A4069_a,
            ll_A4069_b,
            ll_A4069_c,
            ll_A4070,
            ll_A4071,
            ll_A4072_u,
            ll_A4072_a,
            ll_A4072_b,
            ll_A4073,
            ll_A4074,
            ll_A4075_u,
            ll_A4075_a,
            ll_A4075_b,
            ll_A4076,
            ll_A4077_u,
            ll_A4077_a,
            ll_A4077_b,
            ll_A4078,
            ll_A4079,
            ll_A4080;

    RadioButton
            rb_A4067_1,
            rb_A4067_2,
            rb_A4067_DK,
            rb_A4067_RA,
            rb_A4068_1,
            rb_A4068_2,
            rb_A4068_DK,
            rb_A4068_RA,
            rb_A4069_u_1,
            rb_A4069_u_2,
            rb_A4069_u_3,
            rb_A4069_u_DK,
            rb_A4069_u_RA,
            rb_A4070_1,
            rb_A4070_2,
            rb_A4070_3,
            rb_A4070_DK,
            rb_A4070_RA,
            rb_A4071_1,
            rb_A4071_2,
            rb_A4071_DK,
            rb_A4071_RA,
            rb_A4072_u_1,
            rb_A4072_u_2,
            rb_A4072_u_DK,
            rb_A4072_u_RA,
            rb_A4073_1,
            rb_A4073_2,
            rb_A4073_DK,
            rb_A4073_RA,
            rb_A4074_1,
            rb_A4074_2,
            rb_A4074_DK,
            rb_A4074_RA,
            rb_A4075_u_1,
            rb_A4075_u_2,
            rb_A4075_u_DK,
            rb_A4075_u_RA,
            rb_A4076_1,
            rb_A4076_2,
            rb_A4076_DK,
            rb_A4076_RA,
            rb_A4077_u_1,
            rb_A4077_u_2,
            rb_A4077_u_DK,
            rb_A4077_u_RA,
            rb_A4078_1,
            rb_A4078_2,
            rb_A4078_DK,
            rb_A4078_RA,
            rb_A4079_1,
            rb_A4079_2,
            rb_A4079_DK,
            rb_A4079_RA,
            rb_A4080_1,
            rb_A4080_2,
            rb_A4080_DK,
            rb_A4080_RA;

    EditText
            ed_A4069_a,
            ed_A4069_b,
            ed_A4069_c,
            ed_A4072_a,
            ed_A4072_b,
            ed_A4075_a,
            ed_A4075_b,
            ed_A4077_a,
            ed_A4077_b;

    String
            study_id,
            A4067,
            A4068,
            A4069_u,
            A4069_a,
            A4069_b,
            A4069_c,
            A4070,
            A4071,
            A4072_u,
            A4072_a,
            A4072_b,
            A4073,
            A4074,
            A4075_u,
            A4075_a,
            A4075_b,
            A4076,
            A4077_u,
            A4077_a,
            A4077_b,
            A4078,
            A4079,
            A4080,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next3 = findViewById(R.id.btn_next3);

        //Linear Layout
        ll_A4067 = findViewById(R.id.ll_A4067);
        ll_A4068 = findViewById(R.id.ll_A4068);
        ll_A4069_u = findViewById(R.id.ll_A4069_u);
        ll_A4069_a = findViewById(R.id.ll_A4069_a);
        ll_A4069_b = findViewById(R.id.ll_A4069_b);
        ll_A4069_c = findViewById(R.id.ll_A4069_c);
        ll_A4070 = findViewById(R.id.ll_A4070);
        ll_A4071 = findViewById(R.id.ll_A4071);
        ll_A4072_u = findViewById(R.id.ll_A4072_u);
        ll_A4072_a = findViewById(R.id.ll_A4072_a);
        ll_A4072_b = findViewById(R.id.ll_A4072_b);
        ll_A4073 = findViewById(R.id.ll_A4073);
        ll_A4074 = findViewById(R.id.ll_A4074);
        ll_A4075_u = findViewById(R.id.ll_A4075_u);
        ll_A4075_a = findViewById(R.id.ll_A4075_a);
        ll_A4075_b = findViewById(R.id.ll_A4075_b);
        ll_A4076 = findViewById(R.id.ll_A4076);
        ll_A4077_u = findViewById(R.id.ll_A4077_u);
        ll_A4077_a = findViewById(R.id.ll_A4077_a);
        ll_A4077_b = findViewById(R.id.ll_A4077_b);
        ll_A4078 = findViewById(R.id.ll_A4078);
        ll_A4079 = findViewById(R.id.ll_A4079);
        ll_A4080 = findViewById(R.id.ll_A4080);

        //Radio Button
        rb_A4067_1 = findViewById(R.id.rb_A4067_1);
        rb_A4067_2 = findViewById(R.id.rb_A4067_2);
        rb_A4067_DK = findViewById(R.id.rb_A4067_DK);
        rb_A4067_RA = findViewById(R.id.rb_A4067_RA);
        rb_A4068_1 = findViewById(R.id.rb_A4068_1);
        rb_A4068_2 = findViewById(R.id.rb_A4068_2);
        rb_A4068_DK = findViewById(R.id.rb_A4068_DK);
        rb_A4068_RA = findViewById(R.id.rb_A4068_RA);
        rb_A4069_u_1 = findViewById(R.id.rb_A4069_u_1);
        rb_A4069_u_2 = findViewById(R.id.rb_A4069_u_2);
        rb_A4069_u_3 = findViewById(R.id.rb_A4069_u_3);
        rb_A4069_u_DK = findViewById(R.id.rb_A4069_u_DK);
        rb_A4069_u_RA = findViewById(R.id.rb_A4069_u_RA);
        rb_A4070_1 = findViewById(R.id.rb_A4070_1);
        rb_A4070_2 = findViewById(R.id.rb_A4070_2);
        rb_A4070_3 = findViewById(R.id.rb_A4070_3);
        rb_A4070_DK = findViewById(R.id.rb_A4070_DK);
        rb_A4070_RA = findViewById(R.id.rb_A4070_RA);
        rb_A4071_1 = findViewById(R.id.rb_A4071_1);
        rb_A4071_2 = findViewById(R.id.rb_A4071_2);
        rb_A4071_DK = findViewById(R.id.rb_A4071_DK);
        rb_A4071_RA = findViewById(R.id.rb_A4071_RA);
        rb_A4072_u_1 = findViewById(R.id.rb_A4072_u_1);
        rb_A4072_u_2 = findViewById(R.id.rb_A4072_u_2);
        rb_A4072_u_DK = findViewById(R.id.rb_A4072_u_DK);
        rb_A4072_u_RA = findViewById(R.id.rb_A4072_u_RA);
        rb_A4073_1 = findViewById(R.id.rb_A4073_1);
        rb_A4073_2 = findViewById(R.id.rb_A4073_2);
        rb_A4073_DK = findViewById(R.id.rb_A4073_DK);
        rb_A4073_RA = findViewById(R.id.rb_A4073_RA);
        rb_A4074_1 = findViewById(R.id.rb_A4074_1);
        rb_A4074_2 = findViewById(R.id.rb_A4074_2);
        rb_A4074_DK = findViewById(R.id.rb_A4074_DK);
        rb_A4074_RA = findViewById(R.id.rb_A4074_RA);
        rb_A4075_u_1 = findViewById(R.id.rb_A4075_u_1);
        rb_A4075_u_2 = findViewById(R.id.rb_A4075_u_2);
        rb_A4075_u_DK = findViewById(R.id.rb_A4075_u_DK);
        rb_A4075_u_RA = findViewById(R.id.rb_A4075_u_RA);
        rb_A4076_1 = findViewById(R.id.rb_A4076_1);
        rb_A4076_2 = findViewById(R.id.rb_A4076_2);
        rb_A4076_DK = findViewById(R.id.rb_A4076_DK);
        rb_A4076_RA = findViewById(R.id.rb_A4076_RA);
        rb_A4077_u_1 = findViewById(R.id.rb_A4077_u_1);
        rb_A4077_u_2 = findViewById(R.id.rb_A4077_u_2);
        rb_A4077_u_DK = findViewById(R.id.rb_A4077_u_DK);
        rb_A4077_u_RA = findViewById(R.id.rb_A4077_u_RA);
        rb_A4078_1 = findViewById(R.id.rb_A4078_1);
        rb_A4078_2 = findViewById(R.id.rb_A4078_2);
        rb_A4078_DK = findViewById(R.id.rb_A4078_DK);
        rb_A4078_RA = findViewById(R.id.rb_A4078_RA);
        rb_A4079_1 = findViewById(R.id.rb_A4079_1);
        rb_A4079_2 = findViewById(R.id.rb_A4079_2);
        rb_A4079_DK = findViewById(R.id.rb_A4079_DK);
        rb_A4079_RA = findViewById(R.id.rb_A4079_RA);
        rb_A4080_1 = findViewById(R.id.rb_A4080_1);
        rb_A4080_2 = findViewById(R.id.rb_A4080_2);
        rb_A4080_DK = findViewById(R.id.rb_A4080_DK);
        rb_A4080_RA = findViewById(R.id.rb_A4080_RA);

        // Edit Text
        ed_A4069_a = findViewById(R.id.ed_A4069_a);
        ed_A4069_b = findViewById(R.id.ed_A4069_b);
        ed_A4069_c = findViewById(R.id.ed_A4069_c);
        ed_A4072_a = findViewById(R.id.ed_A4072_a);
        ed_A4072_b = findViewById(R.id.ed_A4072_b);
        ed_A4075_a = findViewById(R.id.ed_A4075_a);
        ed_A4075_b = findViewById(R.id.ed_A4075_b);
        ed_A4077_a = findViewById(R.id.ed_A4077_a);
        ed_A4077_b = findViewById(R.id.ed_A4077_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4067__a4080);

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

        Intent c2 = new Intent(com.example.abdulsajid.vasaadult.A4067.this, A4081.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4067_1
                || compoundButton.getId() == R.id.rb_A4067_2
                || compoundButton.getId() == R.id.rb_A4067_DK
                || compoundButton.getId() == R.id.rb_A4067_RA)

        {
            if (rb_A4067_2.isChecked() || rb_A4067_DK.isChecked() || rb_A4067_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4068);
                ClearAllcontrol.ClearAll(ll_A4069_u);
                ClearAllcontrol.ClearAll(ll_A4069_a);
                ClearAllcontrol.ClearAll(ll_A4069_b);
                ClearAllcontrol.ClearAll(ll_A4069_c);
                ClearAllcontrol.ClearAll(ll_A4070);

                ll_A4068.setVisibility(View.GONE);
                ll_A4069_u.setVisibility(View.GONE);
                ll_A4069_a.setVisibility(View.GONE);
                ll_A4069_b.setVisibility(View.GONE);
                ll_A4069_c.setVisibility(View.GONE);
                ll_A4070.setVisibility(View.GONE);

            } else {
                ll_A4068.setVisibility(View.VISIBLE);
                ll_A4069_u.setVisibility(View.VISIBLE);
                ll_A4069_a.setVisibility(View.VISIBLE);
                ll_A4069_b.setVisibility(View.VISIBLE);
                ll_A4069_c.setVisibility(View.VISIBLE);
                ll_A4070.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4069_u_1
                || compoundButton.getId() == R.id.rb_A4069_u_2
                || compoundButton.getId() == R.id.rb_A4069_u_3
                || compoundButton.getId() == R.id.rb_A4069_u_DK
                || compoundButton.getId() == R.id.rb_A4069_u_RA)

                ClearAllcontrol.ClearAll(ll_A4069_a);
                ClearAllcontrol.ClearAll(ll_A4069_b);
                ClearAllcontrol.ClearAll(ll_A4069_c);

                ll_A4069_a.setVisibility(View.GONE);
                ll_A4069_b.setVisibility(View.GONE);
                ll_A4069_c.setVisibility(View.GONE);

        {
            if (rb_A4069_u_1.isChecked()) {
                ll_A4069_a.setVisibility(View.VISIBLE);
            } else if (rb_A4069_u_2.isChecked()) {
                ll_A4069_b.setVisibility(View.VISIBLE);
            } else if (rb_A4069_u_3.isChecked()) {
                ll_A4069_c.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4071_1
                || compoundButton.getId() == R.id.rb_A4071_2
                || compoundButton.getId() == R.id.rb_A4071_DK
                || compoundButton.getId() == R.id.rb_A4071_RA)

        {
            if (rb_A4071_2.isChecked() || rb_A4071_DK.isChecked() || rb_A4071_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4072_u);
                ClearAllcontrol.ClearAll(ll_A4072_a);
                ClearAllcontrol.ClearAll(ll_A4072_b);
                ClearAllcontrol.ClearAll(ll_A4073);

                ll_A4072_u.setVisibility(View.GONE);
                ll_A4072_a.setVisibility(View.GONE);
                ll_A4072_b.setVisibility(View.GONE);
                ll_A4073.setVisibility(View.GONE);

            } else {
                ll_A4072_u.setVisibility(View.VISIBLE);
                ll_A4072_a.setVisibility(View.VISIBLE);
                ll_A4072_b.setVisibility(View.VISIBLE);
                ll_A4073.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4072_u_1
                || compoundButton.getId() == R.id.rb_A4072_u_2
                || compoundButton.getId() == R.id.rb_A4072_u_DK
                || compoundButton.getId() == R.id.rb_A4072_u_RA)

                ClearAllcontrol.ClearAll(ll_A4072_a);
                ClearAllcontrol.ClearAll(ll_A4072_b);

                ll_A4072_a.setVisibility(View.GONE);
                ll_A4072_b.setVisibility(View.GONE);

        {
            if (rb_A4072_u_1.isChecked()) {
                ll_A4072_a.setVisibility(View.VISIBLE);
            } else if (rb_A4072_u_2.isChecked()) {
                ll_A4072_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4074_1
                || compoundButton.getId() == R.id.rb_A4074_2
                || compoundButton.getId() == R.id.rb_A4074_DK
                || compoundButton.getId() == R.id.rb_A4074_RA)

        {
            if (rb_A4074_2.isChecked() || rb_A4074_DK.isChecked() || rb_A4074_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4075_u);
                ClearAllcontrol.ClearAll(ll_A4075_a);
                ClearAllcontrol.ClearAll(ll_A4075_b);

                ll_A4075_u.setVisibility(View.GONE);
                ll_A4075_a.setVisibility(View.GONE);
                ll_A4075_b.setVisibility(View.GONE);

            } else {
                ll_A4075_u.setVisibility(View.VISIBLE);
                ll_A4075_a.setVisibility(View.VISIBLE);
                ll_A4075_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4075_u_1
                || compoundButton.getId() == R.id.rb_A4075_u_2
                || compoundButton.getId() == R.id.rb_A4075_u_DK
                || compoundButton.getId() == R.id.rb_A4075_u_RA)

                ClearAllcontrol.ClearAll(ll_A4075_a);
                ClearAllcontrol.ClearAll(ll_A4075_b);

                ll_A4075_a.setVisibility(View.GONE);
                ll_A4075_b.setVisibility(View.GONE);

        {
            if (rb_A4075_u_1.isChecked()) {
                ll_A4075_a.setVisibility(View.VISIBLE);
            } else if (rb_A4075_u_2.isChecked()) {
                ll_A4075_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4076_1
                || compoundButton.getId() == R.id.rb_A4076_2
                || compoundButton.getId() == R.id.rb_A4076_DK
                || compoundButton.getId() == R.id.rb_A4076_RA)

        {
            if (rb_A4076_2.isChecked() || rb_A4076_DK.isChecked() || rb_A4076_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4077_u);
                ClearAllcontrol.ClearAll(ll_A4077_a);
                ClearAllcontrol.ClearAll(ll_A4077_b);
                ClearAllcontrol.ClearAll(ll_A4078);
                ClearAllcontrol.ClearAll(ll_A4079);
                ClearAllcontrol.ClearAll(ll_A4080);

                ll_A4077_u.setVisibility(View.GONE);
                ll_A4077_a.setVisibility(View.GONE);
                ll_A4077_b.setVisibility(View.GONE);
                ll_A4078.setVisibility(View.GONE);
                ll_A4079.setVisibility(View.GONE);
                ll_A4080.setVisibility(View.GONE);

            } else {
                ll_A4077_u.setVisibility(View.VISIBLE);
                ll_A4077_a.setVisibility(View.VISIBLE);
                ll_A4077_b.setVisibility(View.VISIBLE);
                ll_A4078.setVisibility(View.VISIBLE);
                ll_A4079.setVisibility(View.VISIBLE);
                ll_A4080.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4077_u_1
                || compoundButton.getId() == R.id.rb_A4077_u_2
                || compoundButton.getId() == R.id.rb_A4077_u_DK
                || compoundButton.getId() == R.id.rb_A4077_u_RA)

                ClearAllcontrol.ClearAll(ll_A4077_a);
                ClearAllcontrol.ClearAll(ll_A4077_b);

                ll_A4077_a.setVisibility(View.GONE);
                ll_A4077_b.setVisibility(View.GONE);

        {
            if (rb_A4077_u_1.isChecked()) {
                ll_A4077_a.setVisibility(View.VISIBLE);
            } else if (rb_A4077_u_2.isChecked()) {
                ll_A4077_b.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next3.setOnClickListener(this);

        rb_A4067_1.setOnCheckedChangeListener(this);
        rb_A4067_2.setOnCheckedChangeListener(this);
        rb_A4067_DK.setOnCheckedChangeListener(this);
        rb_A4067_RA.setOnCheckedChangeListener(this);
        rb_A4069_u_1.setOnCheckedChangeListener(this);
        rb_A4069_u_2.setOnCheckedChangeListener(this);
        rb_A4069_u_3.setOnCheckedChangeListener(this);
        rb_A4069_u_DK.setOnCheckedChangeListener(this);
        rb_A4069_u_RA.setOnCheckedChangeListener(this);
        rb_A4071_1.setOnCheckedChangeListener(this);
        rb_A4071_2.setOnCheckedChangeListener(this);
        rb_A4071_DK.setOnCheckedChangeListener(this);
        rb_A4071_RA.setOnCheckedChangeListener(this);
        rb_A4072_u_1.setOnCheckedChangeListener(this);
        rb_A4072_u_2.setOnCheckedChangeListener(this);
        rb_A4072_u_DK.setOnCheckedChangeListener(this);
        rb_A4072_u_RA.setOnCheckedChangeListener(this);
        rb_A4074_1.setOnCheckedChangeListener(this);
        rb_A4074_2.setOnCheckedChangeListener(this);
        rb_A4074_DK.setOnCheckedChangeListener(this);
        rb_A4074_RA.setOnCheckedChangeListener(this);
        rb_A4075_u_1.setOnCheckedChangeListener(this);
        rb_A4075_u_2.setOnCheckedChangeListener(this);
        rb_A4075_u_DK.setOnCheckedChangeListener(this);
        rb_A4075_u_RA.setOnCheckedChangeListener(this);
        rb_A4076_1.setOnCheckedChangeListener(this);
        rb_A4076_2.setOnCheckedChangeListener(this);
        rb_A4076_DK.setOnCheckedChangeListener(this);
        rb_A4076_RA.setOnCheckedChangeListener(this);
        rb_A4077_u_1.setOnCheckedChangeListener(this);
        rb_A4077_u_2.setOnCheckedChangeListener(this);
        rb_A4077_u_DK.setOnCheckedChangeListener(this);
        rb_A4077_u_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id  = "0";
        A4067     = "000";
        A4068     = "000";
        A4069_u   = "000";
        A4069_a   = "000";
        A4069_b   = "000";
        A4069_c   = "000";
        A4070     = "000";
        A4071     = "000";
        A4072_u   = "000";
        A4072_a   = "000";
        A4072_b   = "000";
        A4073     = "000";
        A4074     = "000";
        A4075_u   = "000";
        A4075_a   = "000";
        A4075_b   = "000";
        A4076     = "000";
        A4077_u   = "000";
        A4077_a   = "000";
        A4077_b   = "000";
        A4078     = "000";
        A4079     = "000";
        A4080     = "000";
        STATUS    = "0";


        //A4067
        if (rb_A4067_1.isChecked()) {
            A4067 = "1";
        }
        if (rb_A4067_2.isChecked()) {
            A4067 = "2";
        }
        if (rb_A4067_DK.isChecked()) {
            A4067 = "9";
        }
        if (rb_A4067_RA.isChecked()) {
            A4067 = "8";
        }

        //A4068
        if (rb_A4068_1.isChecked()) {
            A4068 = "1";
        }
        if (rb_A4068_2.isChecked()) {
            A4068 = "2";
        }
        if (rb_A4068_DK.isChecked()) {
            A4068 = "9";
        }
        if (rb_A4068_RA.isChecked()) {
            A4068 = "8";
        }

        //A4069_u
        if (rb_A4069_u_1.isChecked()) {
            A4069_u = "1";
        }
        if (rb_A4069_u_2.isChecked()) {
            A4069_u = "2";
        }
        if (rb_A4069_u_3.isChecked()) {
            A4069_u = "3";
        }
        if (rb_A4069_u_DK.isChecked()) {
            A4069_u = "9";
        }
        if (rb_A4069_u_RA.isChecked()) {
            A4069_u = "8";
        }

        //A4069_a
        if (ed_A4069_a.getText().toString().trim().length() > 0) {
            A4069_a = ed_A4069_a.getText().toString().trim();
        }
        
        //A4069_b
        if (ed_A4069_b.getText().toString().trim().length() > 0) {
            A4069_b = ed_A4069_b.getText().toString().trim();
        }

        //A4069_c
        if (ed_A4069_c.getText().toString().trim().length() > 0) {
            A4069_c = ed_A4069_c.getText().toString().trim();
        }

        //A4070
        if (rb_A4070_1.isChecked()) {
            A4070 = "1";
        }
        if (rb_A4070_2.isChecked()) {
            A4070 = "2";
        }
        if (rb_A4070_3.isChecked()) {
            A4070 = "3";
        }
        if (rb_A4070_DK.isChecked()) {
            A4070 = "9";
        }
        if (rb_A4070_RA.isChecked()) {
            A4070 = "8";
        }

        //A4071
        if (rb_A4071_1.isChecked()) {
            A4071 = "1";
        }
        if (rb_A4071_2.isChecked()) {
            A4071 = "2";
        }
        if (rb_A4071_DK.isChecked()) {
            A4071 = "9";
        }
        if (rb_A4071_RA.isChecked()) {
            A4071 = "8";
        }

        //A4072_u
        if (rb_A4072_u_1.isChecked()) {
            A4072_u = "1";
        }
        if (rb_A4072_u_2.isChecked()) {
            A4072_u = "2";
        }
        if (rb_A4072_u_DK.isChecked()) {
            A4072_u = "9";
        }
        if (rb_A4072_u_RA.isChecked()) {
            A4072_u = "8";
        }

        //A4072_a
        if (ed_A4072_a.getText().toString().trim().length() > 0) {
            A4072_a = ed_A4072_a.getText().toString().trim();
        }

        //A4072_b
        if (ed_A4072_b.getText().toString().trim().length() > 0) {
            A4072_b = ed_A4072_b.getText().toString().trim();
        }

        //A4073
        if (rb_A4073_1.isChecked()) {
            A4073 = "1";
        }
        if (rb_A4073_2.isChecked()) {
            A4073 = "2";
        }
        if (rb_A4073_DK.isChecked()) {
            A4073 = "9";
        }
        if (rb_A4073_RA.isChecked()) {
            A4073 = "8";
        }

        //A4074
        if (rb_A4074_1.isChecked()) {
            A4074 = "1";
        }
        if (rb_A4074_2.isChecked()) {
            A4074 = "2";
        }
        if (rb_A4074_DK.isChecked()) {
            A4074 = "9";
        }
        if (rb_A4074_RA.isChecked()) {
            A4074 = "8";
        }

        //A4075_u
        if (rb_A4075_u_1.isChecked()) {
            A4075_u = "1";
        }
        if (rb_A4075_u_2.isChecked()) {
            A4075_u = "2";
        }
        if (rb_A4075_u_DK.isChecked()) {
            A4075_u = "9";
        }
        if (rb_A4075_u_RA.isChecked()) {
            A4075_u = "8";
        }

        //A4075_a
        if (ed_A4075_a.getText().toString().trim().length() > 0) {
            A4075_a = ed_A4075_a.getText().toString().trim();
        }

        //A4075_b
        if (ed_A4075_b.getText().toString().trim().length() > 0) {
            A4075_b = ed_A4075_b.getText().toString().trim();
        }

        //A4076
        if (rb_A4076_1.isChecked()) {
            A4076 = "1";
        }
        if (rb_A4076_2.isChecked()) {
            A4076 = "2";
        }
        if (rb_A4076_DK.isChecked()) {
            A4076 = "9";
        }
        if (rb_A4076_RA.isChecked()) {
            A4076 = "8";
        }

        //A4077_u
        if (rb_A4077_u_1.isChecked()) {
            A4077_u = "1";
        }
        if (rb_A4077_u_2.isChecked()) {
            A4077_u = "2";
        }
        if (rb_A4077_u_DK.isChecked()) {
            A4077_u = "9";
        }
        if (rb_A4077_u_RA.isChecked()) {
            A4077_u = "8";
        }

        //A4077_a
        if (ed_A4077_a.getText().toString().trim().length() > 0) {
            A4077_a = ed_A4077_a.getText().toString().trim();
        }

        //A4077_b
        if (ed_A4077_b.getText().toString().trim().length() > 0) {
            A4077_b = ed_A4077_b.getText().toString().trim();
        }

        //A4078
        if (rb_A4078_1.isChecked()) {
            A4078 = "1";
        }
        if (rb_A4078_2.isChecked()) {
            A4078 = "2";
        }
        if (rb_A4078_DK.isChecked()) {
            A4078 = "9";
        }
        if (rb_A4078_RA.isChecked()) {
            A4078 = "8";
        }

        //A4079
        if (rb_A4079_1.isChecked()) {
            A4079 = "1";
        }
        if (rb_A4079_2.isChecked()) {
            A4079 = "2";
        }
        if (rb_A4079_DK.isChecked()) {
            A4079 = "9";
        }
        if (rb_A4079_RA.isChecked()) {
            A4079 = "8";
        }

        //A4080
        if (rb_A4080_1.isChecked()) {
            A4080 = "1";
        }
        if (rb_A4080_2.isChecked()) {
            A4080 = "2";
        }
        if (rb_A4080_DK.isChecked()) {
            A4080 = "9";
        }
        if (rb_A4080_RA.isChecked()) {
            A4080 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4067_A4080("

                + Global.A.A4067_A4080.study_id + ","
                + Global.A.A4067_A4080.A4067 + ","
                + Global.A.A4067_A4080.A4068 + ","
                + Global.A.A4067_A4080.A4069_u + ","
                + Global.A.A4067_A4080.A4069_a + ","
                + Global.A.A4067_A4080.A4069_b + ","
                + Global.A.A4067_A4080.A4069_c + ","
                + Global.A.A4067_A4080.A4070 + ","
                + Global.A.A4067_A4080.A4071 + ","
                + Global.A.A4067_A4080.A4072_u + ","
                + Global.A.A4067_A4080.A4072_a + ","
                + Global.A.A4067_A4080.A4072_b + ","
                + Global.A.A4067_A4080.A4073 + ","
                + Global.A.A4067_A4080.A4074 + ","
                + Global.A.A4067_A4080.A4075_u + ","
                + Global.A.A4067_A4080.A4075_a + ","
                + Global.A.A4067_A4080.A4075_b + ","
                + Global.A.A4067_A4080.A4076 + ","
                + Global.A.A4067_A4080.A4077_u + ","
                + Global.A.A4067_A4080.A4077_a + ","
                + Global.A.A4067_A4080.A4077_b + ","
                + Global.A.A4067_A4080.A4078 + ","
                + Global.A.A4067_A4080.A4079 + ","
                + Global.A.A4067_A4080.A4080 + ","
                + Global.A.A4067_A4080.STATUS   + ")" +


                " values ('" +

                study_id     + "','" +
                A4067        + "','" +
                A4068        + "','" +
                A4069_u      + "','" +
                A4069_a      + "','" +
                A4069_b      + "','" +
                A4069_c      + "','" +
                A4070        + "','" +
                A4071        + "','" +
                A4072_u      + "','" +
                A4072_a      + "','" +
                A4072_b      + "','" +
                A4073        + "','" +
                A4074        + "','" +
                A4075_u      + "','" +
                A4075_a      + "','" +
                A4075_b      + "','" +
                A4076        + "','" +
                A4077_u      + "','" +
                A4077_a      + "','" +
                A4077_b      + "','" +
                A4078        + "','" +
                A4079        + "','" +
                A4080        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "3rd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4067) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4068) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4069_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4069_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4069_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4069_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4070) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4071) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4073) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4074) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4076) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4078) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4079) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4080) != false;
    }
}
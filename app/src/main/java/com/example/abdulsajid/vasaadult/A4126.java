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

public class A4126 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next7;

    LinearLayout
            ll_A4126,
            ll_A4127_u,
            ll_A4127_a,
            ll_A4127_b,
            ll_A4128,
            ll_A4129,
            ll_A4130_u,
            ll_A4130_a,
            ll_A4130_b,
            ll_A4131,
            ll_A4132,
            ll_A4133,
            ll_A4134_u,
            ll_A4134_a,
            ll_A4134_b,
            ll_A4135,
            ll_A4136,
            ll_A4138,
            ll_A4139,
            ll_A4140;

    RadioButton
            rb_A4126_1,
            rb_A4126_2,
            rb_A4126_DK,
            rb_A4126_RA,
            rb_A4127_u_1,
            rb_A4127_u_2,
            rb_A4127_u_DK,
            rb_A4127_u_RA,
            rb_A4128_1,
            rb_A4128_2,
            rb_A4128_DK,
            rb_A4128_RA,
            rb_A4129_1,
            rb_A4129_2,
            rb_A4129_DK,
            rb_A4129_RA,
            rb_A4130_u_1,
            rb_A4130_u_2,
            rb_A4130_u_DK,
            rb_A4130_u_RA,
            rb_A4131_1,
            rb_A4131_2,
            rb_A4131_DK,
            rb_A4131_RA,
            rb_A4132_1,
            rb_A4132_2,
            rb_A4132_DK,
            rb_A4132_RA,
            rb_A4133_1,
            rb_A4133_2,
            rb_A4133_DK,
            rb_A4133_RA,
            rb_A4134_u_1,
            rb_A4134_u_2,
            rb_A4134_u_DK,
            rb_A4134_u_RA,
            rb_A4135_1,
            rb_A4135_2,
            rb_A4135_DK,
            rb_A4135_RA,
            rb_A4136_1,
            rb_A4136_2,
            rb_A4136_DK,
            rb_A4136_RA,
            rb_A4138_1,
            rb_A4138_2,
            rb_A4138_DK,
            rb_A4138_RA,
            rb_A4139_1,
            rb_A4139_2,
            rb_A4139_DK,
            rb_A4139_RA,
            rb_A4140_1,
            rb_A4140_2,
            rb_A4140_DK,
            rb_A4140_RA;

    EditText
            ed_A4127_a,
            ed_A4127_b,
            ed_A4130_a,
            ed_A4130_b,
            ed_A4134_a,
            ed_A4134_b;

    String
            study_id,
            A4126,
            A4127_u,
            A4127_a,
            A4127_b,
            A4128,
            A4129,
            A4130_u,
            A4130_a,
            A4130_b,
            A4131,
            A4132,
            A4133,
            A4134_u,
            A4134_a,
            A4134_b,
            A4135,
            A4136,
            A4138,
            A4139,
            A4140,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next7 = findViewById(R.id.btn_next7);

        //Linear Layout
        ll_A4126 = findViewById(R.id.ll_A4126);
        ll_A4127_u = findViewById(R.id.ll_A4127_u);
        ll_A4127_a = findViewById(R.id.ll_A4127_a);
        ll_A4127_b = findViewById(R.id.ll_A4127_b);
        ll_A4128 = findViewById(R.id.ll_A4128);
        ll_A4129 = findViewById(R.id.ll_A4129);
        ll_A4130_u = findViewById(R.id.ll_A4130_u);
        ll_A4130_a = findViewById(R.id.ll_A4130_a);
        ll_A4130_b = findViewById(R.id.ll_A4130_b);
        ll_A4131 = findViewById(R.id.ll_A4131);
        ll_A4132 = findViewById(R.id.ll_A4132);
        ll_A4133 = findViewById(R.id.ll_A4133);
        ll_A4134_u = findViewById(R.id.ll_A4134_u);
        ll_A4134_a = findViewById(R.id.ll_A4134_a);
        ll_A4134_b = findViewById(R.id.ll_A4134_b);
        ll_A4135 = findViewById(R.id.ll_A4135);
        ll_A4136 = findViewById(R.id.ll_A4136);
        ll_A4138 = findViewById(R.id.ll_A4138);
        ll_A4139 = findViewById(R.id.ll_A4139);
        ll_A4140 = findViewById(R.id.ll_A4140);

        //Radio Button
        rb_A4126_1 = findViewById(R.id.rb_A4126_1);
        rb_A4126_2 = findViewById(R.id.rb_A4126_2);
        rb_A4126_DK = findViewById(R.id.rb_A4126_DK);
        rb_A4126_RA = findViewById(R.id.rb_A4126_RA);
        rb_A4127_u_1 = findViewById(R.id.rb_A4127_u_1);
        rb_A4127_u_2 = findViewById(R.id.rb_A4127_u_2);
        rb_A4127_u_DK = findViewById(R.id.rb_A4127_u_DK);
        rb_A4127_u_RA = findViewById(R.id.rb_A4127_u_RA);
        rb_A4128_1 = findViewById(R.id.rb_A4128_1);
        rb_A4128_2 = findViewById(R.id.rb_A4128_2);
        rb_A4128_DK = findViewById(R.id.rb_A4128_DK);
        rb_A4128_RA = findViewById(R.id.rb_A4128_RA);
        rb_A4129_1 = findViewById(R.id.rb_A4129_1);
        rb_A4129_2 = findViewById(R.id.rb_A4129_2);
        rb_A4129_DK = findViewById(R.id.rb_A4129_DK);
        rb_A4129_RA = findViewById(R.id.rb_A4129_RA);
        rb_A4130_u_1 = findViewById(R.id.rb_A4130_u_1);
        rb_A4130_u_2 = findViewById(R.id.rb_A4130_u_2);
        rb_A4130_u_DK = findViewById(R.id.rb_A4130_u_DK);
        rb_A4130_u_RA = findViewById(R.id.rb_A4130_u_RA);
        rb_A4131_1 = findViewById(R.id.rb_A4131_1);
        rb_A4131_2 = findViewById(R.id.rb_A4131_2);
        rb_A4131_DK = findViewById(R.id.rb_A4131_DK);
        rb_A4131_RA = findViewById(R.id.rb_A4131_RA);
        rb_A4132_1 = findViewById(R.id.rb_A4132_1);
        rb_A4132_2 = findViewById(R.id.rb_A4132_2);
        rb_A4132_DK = findViewById(R.id.rb_A4132_DK);
        rb_A4132_RA = findViewById(R.id.rb_A4132_RA);
        rb_A4133_1 = findViewById(R.id.rb_A4133_1);
        rb_A4133_2 = findViewById(R.id.rb_A4133_2);
        rb_A4133_DK = findViewById(R.id.rb_A4133_DK);
        rb_A4133_RA = findViewById(R.id.rb_A4133_RA);
        rb_A4134_u_1 = findViewById(R.id.rb_A4134_u_1);
        rb_A4134_u_2 = findViewById(R.id.rb_A4134_u_2);
        rb_A4134_u_DK = findViewById(R.id.rb_A4134_u_DK);
        rb_A4134_u_RA = findViewById(R.id.rb_A4134_u_RA);
        rb_A4135_1 = findViewById(R.id.rb_A4135_1);
        rb_A4135_2 = findViewById(R.id.rb_A4135_2);
        rb_A4135_DK = findViewById(R.id.rb_A4135_DK);
        rb_A4135_RA = findViewById(R.id.rb_A4135_RA);
        rb_A4136_1 = findViewById(R.id.rb_A4136_1);
        rb_A4136_2 = findViewById(R.id.rb_A4136_2);
        rb_A4136_DK = findViewById(R.id.rb_A4136_DK);
        rb_A4136_RA = findViewById(R.id.rb_A4136_RA);
        rb_A4138_1 = findViewById(R.id.rb_A4138_1);
        rb_A4138_2 = findViewById(R.id.rb_A4138_2);
        rb_A4138_DK = findViewById(R.id.rb_A4138_DK);
        rb_A4138_RA = findViewById(R.id.rb_A4138_RA);
        rb_A4139_1 = findViewById(R.id.rb_A4139_1);
        rb_A4139_2 = findViewById(R.id.rb_A4139_2);
        rb_A4139_DK = findViewById(R.id.rb_A4139_DK);
        rb_A4139_RA = findViewById(R.id.rb_A4139_RA);
        rb_A4140_1 = findViewById(R.id.rb_A4140_1);
        rb_A4140_2 = findViewById(R.id.rb_A4140_2);
        rb_A4140_DK = findViewById(R.id.rb_A4140_DK);
        rb_A4140_RA = findViewById(R.id.rb_A4140_RA);

        // Edit Text
        ed_A4127_a = findViewById(R.id.ed_A4127_a);
        ed_A4127_b = findViewById(R.id.ed_A4127_b);
        ed_A4130_a = findViewById(R.id.ed_A4130_a);
        ed_A4130_b = findViewById(R.id.ed_A4130_b);
        ed_A4134_a = findViewById(R.id.ed_A4134_a);
        ed_A4134_b = findViewById(R.id.ed_A4134_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4126__a4140);

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

        Intent c2 = new Intent(com.example.abdulsajid.vasaadult.A4126.this, A4144.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

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

    private void events_calls() {

        btn_next7.setOnClickListener(this);

        rb_A4126_1.setOnCheckedChangeListener(this);
        rb_A4126_2.setOnCheckedChangeListener(this);
        rb_A4126_DK.setOnCheckedChangeListener(this);
        rb_A4126_RA.setOnCheckedChangeListener(this);
        rb_A4127_u_1.setOnCheckedChangeListener(this);
        rb_A4127_u_2.setOnCheckedChangeListener(this);
        rb_A4127_u_DK.setOnCheckedChangeListener(this);
        rb_A4127_u_RA.setOnCheckedChangeListener(this);
        rb_A4129_1.setOnCheckedChangeListener(this);
        rb_A4129_2.setOnCheckedChangeListener(this);
        rb_A4129_DK.setOnCheckedChangeListener(this);
        rb_A4129_RA.setOnCheckedChangeListener(this);
        rb_A4130_u_1.setOnCheckedChangeListener(this);
        rb_A4130_u_2.setOnCheckedChangeListener(this);
        rb_A4130_u_DK.setOnCheckedChangeListener(this);
        rb_A4130_u_RA.setOnCheckedChangeListener(this);
        rb_A4133_1.setOnCheckedChangeListener(this);
        rb_A4133_2.setOnCheckedChangeListener(this);
        rb_A4133_DK.setOnCheckedChangeListener(this);
        rb_A4133_RA.setOnCheckedChangeListener(this);
        rb_A4134_u_1.setOnCheckedChangeListener(this);
        rb_A4134_u_2.setOnCheckedChangeListener(this);
        rb_A4134_u_DK.setOnCheckedChangeListener(this);
        rb_A4134_u_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4126 = "000";
        A4127_u = "000";
        A4127_a = "000";
        A4127_b = "000";
        A4128 = "000";
        A4129 = "000";
        A4130_u = "000";
        A4130_a = "000";
        A4130_b = "000";
        A4131 = "000";
        A4132 = "000";
        A4133 = "000";
        A4134_u = "000";
        A4134_a = "000";
        A4134_b = "000";
        A4135 = "000";
        A4136 = "000";
        A4138 = "000";
        A4139 = "000";
        A4140 = "000";
        STATUS = "0";

        //A4126
        if (rb_A4126_1.isChecked()) {
            A4126 = "1";
        }
        if (rb_A4126_2.isChecked()) {
            A4126 = "2";
        }
        if (rb_A4126_DK.isChecked()) {
            A4126 = "9";
        }
        if (rb_A4126_RA.isChecked()) {
            A4126 = "8";
        }

        //A4127_u
        if (rb_A4127_u_1.isChecked()) {
            A4127_u = "1";
        }
        if (rb_A4127_u_2.isChecked()) {
            A4127_u = "2";
        }
        if (rb_A4127_u_DK.isChecked()) {
            A4127_u = "9";
        }
        if (rb_A4127_u_RA.isChecked()) {
            A4127_u = "8";
        }

        //A4127_a
        if (ed_A4127_a.getText().toString().trim().length() > 0) {
            A4127_a = ed_A4127_a.getText().toString().trim();
        }

        //A4127_b
        if (ed_A4127_b.getText().toString().trim().length() > 0) {
            A4127_b = ed_A4127_b.getText().toString().trim();
        }

        //A4128
        if (rb_A4128_1.isChecked()) {
            A4128 = "1";
        }
        if (rb_A4128_2.isChecked()) {
            A4128 = "2";
        }
        if (rb_A4128_DK.isChecked()) {
            A4128 = "9";
        }
        if (rb_A4128_RA.isChecked()) {
            A4128 = "8";
        }

        //A4129
        if (rb_A4129_1.isChecked()) {
            A4129 = "1";
        }
        if (rb_A4129_2.isChecked()) {
            A4129 = "2";
        }
        if (rb_A4129_DK.isChecked()) {
            A4129 = "9";
        }
        if (rb_A4129_RA.isChecked()) {
            A4129 = "8";
        }

        //A4130_u
        if (rb_A4130_u_1.isChecked()) {
            A4130_u = "1";
        }
        if (rb_A4130_u_2.isChecked()) {
            A4130_u = "2";
        }
        if (rb_A4130_u_DK.isChecked()) {
            A4130_u = "9";
        }
        if (rb_A4130_u_RA.isChecked()) {
            A4130_u = "8";
        }

        //A4130_a
        if (ed_A4130_a.getText().toString().trim().length() > 0) {
            A4130_a = ed_A4130_a.getText().toString().trim();
        }

        //A4130_b
        if (ed_A4130_b.getText().toString().trim().length() > 0) {
            A4130_b = ed_A4130_b.getText().toString().trim();
        }

        //A4131
        if (rb_A4131_1.isChecked()) {
            A4131 = "1";
        }
        if (rb_A4131_2.isChecked()) {
            A4131 = "2";
        }
        if (rb_A4131_DK.isChecked()) {
            A4131 = "9";
        }
        if (rb_A4131_RA.isChecked()) {
            A4131 = "8";
        }
        
        //A4132
        if (rb_A4132_1.isChecked()) {
            A4132 = "1";
        }
        if (rb_A4132_2.isChecked()) {
            A4132 = "2";
        }
        if (rb_A4132_DK.isChecked()) {
            A4132 = "9";
        }
        if (rb_A4132_RA.isChecked()) {
            A4132 = "8";
        }

        //A4133
        if (rb_A4133_1.isChecked()) {
            A4133 = "1";
        }
        if (rb_A4133_2.isChecked()) {
            A4133 = "2";
        }
        if (rb_A4133_DK.isChecked()) {
            A4133 = "9";
        }
        if (rb_A4133_RA.isChecked()) {
            A4133 = "8";
        }

        //A4134_u
        if (rb_A4134_u_1.isChecked()) {
            A4134_u = "1";
        }
        if (rb_A4134_u_2.isChecked()) {
            A4134_u = "2";
        }
        if (rb_A4134_u_DK.isChecked()) {
            A4134_u = "9";
        }
        if (rb_A4134_u_RA.isChecked()) {
            A4134_u = "8";
        }

        //A4134_a
        if (ed_A4134_a.getText().toString().trim().length() > 0) {
            A4134_a = ed_A4134_a.getText().toString().trim();
        }

        //A4134_b
        if (ed_A4134_b.getText().toString().trim().length() > 0) {
            A4134_b = ed_A4134_b.getText().toString().trim();
        }

        //A4135
        if (rb_A4135_1.isChecked()) {
            A4135 = "1";
        }
        if (rb_A4135_2.isChecked()) {
            A4135 = "2";
        }
        if (rb_A4135_DK.isChecked()) {
            A4135 = "9";
        }
        if (rb_A4135_RA.isChecked()) {
            A4135 = "8";
        }

        //A4136
        if (rb_A4136_1.isChecked()) {
            A4136 = "1";
        }
        if (rb_A4136_2.isChecked()) {
            A4136 = "2";
        }
        if (rb_A4136_DK.isChecked()) {
            A4136 = "9";
        }
        if (rb_A4136_RA.isChecked()) {
            A4136 = "8";
        }

        //A4138
        if (rb_A4138_1.isChecked()) {
            A4138 = "1";
        }
        if (rb_A4138_2.isChecked()) {
            A4138 = "2";
        }
        if (rb_A4138_DK.isChecked()) {
            A4138 = "9";
        }
        if (rb_A4138_RA.isChecked()) {
            A4138 = "8";
        }

        //A4139
        if (rb_A4139_1.isChecked()) {
            A4139 = "1";
        }
        if (rb_A4139_2.isChecked()) {
            A4139 = "2";
        }
        if (rb_A4139_DK.isChecked()) {
            A4139 = "9";
        }
        if (rb_A4139_RA.isChecked()) {
            A4139 = "8";
        }

        //A4140
        if (rb_A4140_1.isChecked()) {
            A4140 = "1";
        }
        if (rb_A4140_2.isChecked()) {
            A4140 = "2";
        }
        if (rb_A4140_DK.isChecked()) {
            A4140 = "9";
        }
        if (rb_A4140_RA.isChecked()) {
            A4140 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4126_A4140("

                + Global.A.A4126_A4140.study_id + ","
                + Global.A.A4126_A4140.A4126 + ","
                + Global.A.A4126_A4140.A4127_u + ","
                + Global.A.A4126_A4140.A4127_a + ","
                + Global.A.A4126_A4140.A4127_b + ","
                + Global.A.A4126_A4140.A4128 + ","
                + Global.A.A4126_A4140.A4129 + ","
                + Global.A.A4126_A4140.A4130_u + ","
                + Global.A.A4126_A4140.A4130_a + ","
                + Global.A.A4126_A4140.A4130_b + ","
                + Global.A.A4126_A4140.A4131 + ","
                + Global.A.A4126_A4140.A4132 + ","
                + Global.A.A4126_A4140.A4133 + ","
                + Global.A.A4126_A4140.A4134_u + ","
                + Global.A.A4126_A4140.A4134_a + ","
                + Global.A.A4126_A4140.A4134_b + ","
                + Global.A.A4126_A4140.A4135 + ","
                + Global.A.A4126_A4140.A4136 + ","
                + Global.A.A4126_A4140.A4138 + ","
                + Global.A.A4126_A4140.A4139 + ","
                + Global.A.A4126_A4140.A4140 + ","
                + Global.A.A4126_A4140.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4126        + "','" +
                A4127_u      + "','" +
                A4127_a      + "','" +
                A4127_b      + "','" +
                A4128        + "','" +
                A4129        + "','" +
                A4130_u      + "','" +
                A4130_a      + "','" +
                A4130_b      + "','" +
                A4131        + "','" +
                A4132        + "','" +
                A4133        + "','" +
                A4134_u      + "','" +
                A4134_a      + "','" +
                A4134_b      + "','" +
                A4135        + "','" +
                A4136        + "','" +
                A4138        + "','" +
                A4139        + "','" +
                A4140        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "7th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4126) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4127_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4127_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4127_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4128) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4129) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4130_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4130_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4130_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4131) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4132) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4133) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4134_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4134_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4134_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4135) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4136) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4138) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4139) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4140) != false;
    }
}

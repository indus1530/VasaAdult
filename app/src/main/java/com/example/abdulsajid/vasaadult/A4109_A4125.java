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

public class A4109_A4125 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next6;

    LinearLayout
            ll_A4109,
            ll_A4110,
            ll_A4111,
            ll_A4112,
            ll_A4113,
            ll_A4114,
            ll_A4115,
            ll_A4116,
            ll_A4117_u,
            ll_A4117_a,
            ll_A4117_b,
            ll_A4118,
            ll_A4119,
            ll_A4120,
            ll_A4121,
            ll_A4122,
            ll_A4123,
            ll_A4124,
            ll_A4125;

    RadioButton
            rb_A4109_1,
            rb_A4109_2,
            rb_A4109_DK,
            rb_A4109_RA,
            rb_A4110_1,
            rb_A4110_2,
            rb_A4110_DK,
            rb_A4110_RA,
            rb_A4111_1,
            rb_A4111_2,
            rb_A4111_DK,
            rb_A4111_RA,
            rb_A4112_1,
            rb_A4112_2,
            rb_A4112_DK,
            rb_A4112_RA,
            rb_A4113_1,
            rb_A4113_2,
            rb_A4113_DK,
            rb_A4113_RA,
            rb_A4114_1,
            rb_A4114_2,
            rb_A4114_DK,
            rb_A4114_RA,
            rb_A4115_1,
            rb_A4115_2,
            rb_A4115_DK,
            rb_A4115_RA,
            rb_A4116_1,
            rb_A4116_2,
            rb_A4116_DK,
            rb_A4116_RA,
            rb_A4117_u_1,
            rb_A4117_u_2,
            rb_A4117_u_DK,
            rb_A4117_u_RA,
            rb_A4118_1,
            rb_A4118_2,
            rb_A4118_DK,
            rb_A4118_RA,
            rb_A4119_1,
            rb_A4119_2,
            rb_A4119_3,
            rb_A4119_4,
            rb_A4119_DK,
            rb_A4119_RA,
            rb_A4120_1,
            rb_A4120_2,
            rb_A4120_3,
            rb_A4120_4,
            rb_A4120_DK,
            rb_A4120_RA,
            rb_A4122_1,
            rb_A4122_2,
            rb_A4122_DK,
            rb_A4122_RA,
            rb_A4123_1,
            rb_A4123_2,
            rb_A4123_DK,
            rb_A4123_RA,
            rb_A4124_1,
            rb_A4124_2,
            rb_A4124_DK,
            rb_A4124_RA,
            rb_A4125_1,
            rb_A4125_2,
            rb_A4125_DK,
            rb_A4125_RA;

    EditText
            ed_A4107,
            ed_A4117_a,
            ed_A4117_b,
            ed_A4121;

    String
            study_id,
            A4109,
            A4110,
            A4111,
            A4112,
            A4113,
            A4114,
            A4115,
            A4116,
            A4117_u,
            A4117_a,
            A4117_b,
            A4118,
            A4119,
            A4120,
            A4121,
            A4122,
            A4123,
            A4124,
            A4125,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next6 = (Button) findViewById(R.id.btn_next6);

        //Linear Layout
        ll_A4109 = (LinearLayout) findViewById(R.id.ll_A4109);
        ll_A4110 = (LinearLayout) findViewById(R.id.ll_A4110);
        ll_A4111 = (LinearLayout) findViewById(R.id.ll_A4111);
        ll_A4112 = (LinearLayout) findViewById(R.id.ll_A4112);
        ll_A4113 = (LinearLayout) findViewById(R.id.ll_A4113);
        ll_A4114 = (LinearLayout) findViewById(R.id.ll_A4114);
        ll_A4115 = (LinearLayout) findViewById(R.id.ll_A4115);
        ll_A4116 = (LinearLayout) findViewById(R.id.ll_A4116);
        ll_A4117_u = (LinearLayout) findViewById(R.id.ll_A4117_u);
        ll_A4117_a = (LinearLayout) findViewById(R.id.ll_A4117_a);
        ll_A4117_b = (LinearLayout) findViewById(R.id.ll_A4117_b);
        ll_A4118 = (LinearLayout) findViewById(R.id.ll_A4118);
        ll_A4119 = (LinearLayout) findViewById(R.id.ll_A4119);
        ll_A4120 = (LinearLayout) findViewById(R.id.ll_A4120);
        ll_A4121 = (LinearLayout) findViewById(R.id.ll_A4121);
        ll_A4122 = (LinearLayout) findViewById(R.id.ll_A4122);
        ll_A4123 = (LinearLayout) findViewById(R.id.ll_A4123);
        ll_A4124 = (LinearLayout) findViewById(R.id.ll_A4124);
        ll_A4125 = (LinearLayout) findViewById(R.id.ll_A4125);

        //Radio Button
        rb_A4109_1 = findViewById(R.id.rb_A4109_1);
        rb_A4109_2 = findViewById(R.id.rb_A4109_2);
        rb_A4109_DK = findViewById(R.id.rb_A4109_DK);
        rb_A4109_RA = findViewById(R.id.rb_A4109_RA);
        rb_A4110_1 = findViewById(R.id.rb_A4110_1);
        rb_A4110_2 = findViewById(R.id.rb_A4110_2);
        rb_A4110_DK = findViewById(R.id.rb_A4110_DK);
        rb_A4110_RA = findViewById(R.id.rb_A4110_RA);
        rb_A4111_1 = findViewById(R.id.rb_A4111_1);
        rb_A4111_2 = findViewById(R.id.rb_A4111_2);
        rb_A4111_DK = findViewById(R.id.rb_A4111_DK);
        rb_A4111_RA = findViewById(R.id.rb_A4111_RA);
        rb_A4112_1 = findViewById(R.id.rb_A4112_1);
        rb_A4112_2 = findViewById(R.id.rb_A4112_2);
        rb_A4112_DK = findViewById(R.id.rb_A4112_DK);
        rb_A4112_RA = findViewById(R.id.rb_A4112_RA);
        rb_A4113_1 = findViewById(R.id.rb_A4113_1);
        rb_A4113_2 = findViewById(R.id.rb_A4113_2);
        rb_A4113_DK = findViewById(R.id.rb_A4113_DK);
        rb_A4113_RA = findViewById(R.id.rb_A4113_RA);
        rb_A4114_1 = findViewById(R.id.rb_A4114_1);
        rb_A4114_2 = findViewById(R.id.rb_A4114_2);
        rb_A4114_DK = findViewById(R.id.rb_A4114_DK);
        rb_A4114_RA = findViewById(R.id.rb_A4114_RA);
        rb_A4115_1 = findViewById(R.id.rb_A4115_1);
        rb_A4115_2 = findViewById(R.id.rb_A4115_2);
        rb_A4115_DK = findViewById(R.id.rb_A4115_DK);
        rb_A4115_RA = findViewById(R.id.rb_A4115_RA);
        rb_A4116_1 = findViewById(R.id.rb_A4116_1);
        rb_A4116_2 = findViewById(R.id.rb_A4116_2);
        rb_A4116_DK = findViewById(R.id.rb_A4116_DK);
        rb_A4116_RA = findViewById(R.id.rb_A4116_RA);
        rb_A4117_u_1 = findViewById(R.id.rb_A4117_u_1);
        rb_A4117_u_2 = findViewById(R.id.rb_A4117_u_2);
        rb_A4117_u_DK = findViewById(R.id.rb_A4117_u_DK);
        rb_A4117_u_RA = findViewById(R.id.rb_A4117_u_RA);
        rb_A4118_1 = findViewById(R.id.rb_A4118_1);
        rb_A4118_2 = findViewById(R.id.rb_A4118_2);
        rb_A4118_DK = findViewById(R.id.rb_A4118_DK);
        rb_A4118_RA = findViewById(R.id.rb_A4118_RA);
        rb_A4119_1 = findViewById(R.id.rb_A4119_1);
        rb_A4119_2 = findViewById(R.id.rb_A4119_2);
        rb_A4119_3 = findViewById(R.id.rb_A4119_3);
        rb_A4119_4 = findViewById(R.id.rb_A4119_4);
        rb_A4119_DK = findViewById(R.id.rb_A4119_DK);
        rb_A4119_RA = findViewById(R.id.rb_A4119_RA);
        rb_A4120_1 = findViewById(R.id.rb_A4120_1);
        rb_A4120_2 = findViewById(R.id.rb_A4120_2);
        rb_A4120_3 = findViewById(R.id.rb_A4120_3);
        rb_A4120_4 = findViewById(R.id.rb_A4120_4);
        rb_A4120_DK = findViewById(R.id.rb_A4120_DK);
        rb_A4120_RA = findViewById(R.id.rb_A4120_RA);
        rb_A4122_1 = findViewById(R.id.rb_A4122_1);
        rb_A4122_2 = findViewById(R.id.rb_A4122_2);
        rb_A4122_DK = findViewById(R.id.rb_A4122_DK);
        rb_A4122_RA = findViewById(R.id.rb_A4122_RA);
        rb_A4123_1 = findViewById(R.id.rb_A4123_1);
        rb_A4123_2 = findViewById(R.id.rb_A4123_2);
        rb_A4123_DK = findViewById(R.id.rb_A4123_DK);
        rb_A4123_RA = findViewById(R.id.rb_A4123_RA);
        rb_A4124_1 = findViewById(R.id.rb_A4124_1);
        rb_A4124_2 = findViewById(R.id.rb_A4124_2);
        rb_A4124_DK = findViewById(R.id.rb_A4124_DK);
        rb_A4124_RA = findViewById(R.id.rb_A4124_RA);
        rb_A4125_1 = findViewById(R.id.rb_A4125_1);
        rb_A4125_2 = findViewById(R.id.rb_A4125_2);
        rb_A4125_DK = findViewById(R.id.rb_A4125_DK);
        rb_A4125_RA = findViewById(R.id.rb_A4125_RA);

        // Edit Text
        ed_A4107 = (EditText) findViewById(R.id.ed_A4107);
        ed_A4117_a = (EditText) findViewById(R.id.ed_A4117_a);
        ed_A4117_b = (EditText) findViewById(R.id.ed_A4117_b);
        ed_A4121 = (EditText) findViewById(R.id.ed_A4121);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4109__a4125);

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

        Intent c2 = new Intent(A4109_A4125.this, A4126_A4140.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4109_1
                || compoundButton.getId() == R.id.rb_A4109_2
                || compoundButton.getId() == R.id.rb_A4109_DK
                || compoundButton.getId() == R.id.rb_A4109_RA)

        {
            if (rb_A4109_2.isChecked() || rb_A4109_DK.isChecked() || rb_A4109_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4110);
                ClearAllcontrol.ClearAll(ll_A4111);
                ClearAllcontrol.ClearAll(ll_A4112);

                ll_A4110.setVisibility(View.GONE);
                ll_A4111.setVisibility(View.GONE);
                ll_A4112.setVisibility(View.GONE);

            } else {
                ll_A4110.setVisibility(View.VISIBLE);
                ll_A4111.setVisibility(View.VISIBLE);
                ll_A4112.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4113_1
                || compoundButton.getId() == R.id.rb_A4113_2
                || compoundButton.getId() == R.id.rb_A4113_DK
                || compoundButton.getId() == R.id.rb_A4113_RA)

        {
            if (rb_A4113_2.isChecked() || rb_A4113_DK.isChecked() || rb_A4113_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4114);

                ll_A4114.setVisibility(View.GONE);

            } else {
                ll_A4114.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4115_1
                || compoundButton.getId() == R.id.rb_A4115_2
                || compoundButton.getId() == R.id.rb_A4115_DK
                || compoundButton.getId() == R.id.rb_A4115_RA)

        {
            if (rb_A4115_2.isChecked() || rb_A4115_DK.isChecked() || rb_A4115_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4116);
                ClearAllcontrol.ClearAll(ll_A4117_u);
                ClearAllcontrol.ClearAll(ll_A4117_a);
                ClearAllcontrol.ClearAll(ll_A4117_b);

                ll_A4116.setVisibility(View.GONE);
                ll_A4117_u.setVisibility(View.GONE);
                ll_A4117_a.setVisibility(View.GONE);
                ll_A4117_b.setVisibility(View.GONE);

            } else {
                ll_A4116.setVisibility(View.VISIBLE);
                ll_A4117_u.setVisibility(View.VISIBLE);
                ll_A4117_a.setVisibility(View.VISIBLE);
                ll_A4117_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4116_1
                || compoundButton.getId() == R.id.rb_A4116_2
                || compoundButton.getId() == R.id.rb_A4116_DK
                || compoundButton.getId() == R.id.rb_A4116_RA)

        {
            if (rb_A4116_2.isChecked() || rb_A4116_DK.isChecked() || rb_A4116_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4117_u);
                ClearAllcontrol.ClearAll(ll_A4117_a);
                ClearAllcontrol.ClearAll(ll_A4117_b);

                ll_A4117_u.setVisibility(View.GONE);
                ll_A4117_a.setVisibility(View.GONE);
                ll_A4117_b.setVisibility(View.GONE);

            } else {
                ll_A4117_u.setVisibility(View.VISIBLE);
                ll_A4117_a.setVisibility(View.VISIBLE);
                ll_A4117_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4117_u_1
                || compoundButton.getId() == R.id.rb_A4117_u_2
                || compoundButton.getId() == R.id.rb_A4117_u_DK
                || compoundButton.getId() == R.id.rb_A4117_u_RA)

            ClearAllcontrol.ClearAll(ll_A4117_a);
        ClearAllcontrol.ClearAll(ll_A4117_b);

        ll_A4117_a.setVisibility(View.GONE);
        ll_A4117_b.setVisibility(View.GONE);

        {
            if (rb_A4117_u_1.isChecked()) {
                ll_A4117_a.setVisibility(View.VISIBLE);
            } else if (rb_A4117_u_2.isChecked()) {
                ll_A4117_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4118_1
                || compoundButton.getId() == R.id.rb_A4118_2
                || compoundButton.getId() == R.id.rb_A4118_DK
                || compoundButton.getId() == R.id.rb_A4118_RA)

        {
            if (rb_A4118_2.isChecked() || rb_A4118_DK.isChecked() || rb_A4118_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4119);
                ClearAllcontrol.ClearAll(ll_A4120);
                ClearAllcontrol.ClearAll(ll_A4121);
                ClearAllcontrol.ClearAll(ll_A4122);

                ll_A4119.setVisibility(View.GONE);
                ll_A4120.setVisibility(View.GONE);
                ll_A4121.setVisibility(View.GONE);
                ll_A4122.setVisibility(View.GONE);

            } else {
                ll_A4119.setVisibility(View.VISIBLE);
                ll_A4120.setVisibility(View.VISIBLE);
                ll_A4121.setVisibility(View.VISIBLE);
                ll_A4122.setVisibility(View.VISIBLE);
            }
        }

    }


    private void events_calls() {

        btn_next6.setOnClickListener(this);

        rb_A4109_1.setOnCheckedChangeListener(this);
        rb_A4109_2.setOnCheckedChangeListener(this);
        rb_A4109_DK.setOnCheckedChangeListener(this);
        rb_A4109_RA.setOnCheckedChangeListener(this);
        rb_A4113_1.setOnCheckedChangeListener(this);
        rb_A4113_2.setOnCheckedChangeListener(this);
        rb_A4113_DK.setOnCheckedChangeListener(this);
        rb_A4113_RA.setOnCheckedChangeListener(this);
        rb_A4115_1.setOnCheckedChangeListener(this);
        rb_A4115_2.setOnCheckedChangeListener(this);
        rb_A4115_DK.setOnCheckedChangeListener(this);
        rb_A4115_RA.setOnCheckedChangeListener(this);
        rb_A4116_1.setOnCheckedChangeListener(this);
        rb_A4116_2.setOnCheckedChangeListener(this);
        rb_A4116_DK.setOnCheckedChangeListener(this);
        rb_A4116_RA.setOnCheckedChangeListener(this);
        rb_A4117_u_1.setOnCheckedChangeListener(this);
        rb_A4117_u_2.setOnCheckedChangeListener(this);
        rb_A4117_u_DK.setOnCheckedChangeListener(this);
        rb_A4117_u_RA.setOnCheckedChangeListener(this);
        rb_A4118_1.setOnCheckedChangeListener(this);
        rb_A4118_2.setOnCheckedChangeListener(this);
        rb_A4118_DK.setOnCheckedChangeListener(this);
        rb_A4118_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4109 = "000";
        A4110 = "000";
        A4111 = "000";
        A4112 = "000";
        A4113 = "000";
        A4114 = "000";
        A4115 = "000";
        A4116 = "000";
        A4117_u = "000";
        A4117_a = "000";
        A4117_b = "000";
        A4118 = "000";
        A4119 = "000";
        A4120 = "000";
        A4121 = "000";
        A4122 = "000";
        A4123 = "000";
        A4124 = "000";
        A4125 = "000";
        STATUS = "0";

        //A4109
        if (rb_A4109_1.isChecked()) {
            A4109 = "1";
        }
        if (rb_A4109_2.isChecked()) {
            A4109 = "2";
        }
        if (rb_A4109_DK.isChecked()) {
            A4109 = "9";
        }
        if (rb_A4109_RA.isChecked()) {
            A4109 = "8";
        }

        //A4110
        if (rb_A4110_1.isChecked()) {
            A4110 = "1";
        }
        if (rb_A4110_2.isChecked()) {
            A4110 = "2";
        }
        if (rb_A4110_DK.isChecked()) {
            A4110 = "9";
        }
        if (rb_A4110_RA.isChecked()) {
            A4110 = "8";
        }

        //A4111
        if (rb_A4111_1.isChecked()) {
            A4111 = "1";
        }
        if (rb_A4111_2.isChecked()) {
            A4111 = "2";
        }
        if (rb_A4111_DK.isChecked()) {
            A4111 = "9";
        }
        if (rb_A4111_RA.isChecked()) {
            A4111 = "8";
        }

        //A4112
        if (rb_A4112_1.isChecked()) {
            A4112 = "1";
        }
        if (rb_A4112_2.isChecked()) {
            A4112 = "2";
        }
        if (rb_A4112_DK.isChecked()) {
            A4112 = "9";
        }
        if (rb_A4112_RA.isChecked()) {
            A4112 = "8";
        }

        //A4113
        if (rb_A4113_1.isChecked()) {
            A4113 = "1";
        }
        if (rb_A4113_2.isChecked()) {
            A4113 = "2";
        }
        if (rb_A4113_DK.isChecked()) {
            A4113 = "9";
        }
        if (rb_A4113_RA.isChecked()) {
            A4113 = "8";
        }

        //A4114
        if (rb_A4114_1.isChecked()) {
            A4114 = "1";
        }
        if (rb_A4114_2.isChecked()) {
            A4114 = "2";
        }
        if (rb_A4114_DK.isChecked()) {
            A4114 = "9";
        }
        if (rb_A4114_RA.isChecked()) {
            A4114 = "8";
        }

        //A4115
        if (rb_A4115_1.isChecked()) {
            A4115 = "1";
        }
        if (rb_A4115_2.isChecked()) {
            A4115 = "2";
        }
        if (rb_A4115_DK.isChecked()) {
            A4115 = "9";
        }
        if (rb_A4115_RA.isChecked()) {
            A4115 = "8";
        }

        //A4116
        if (rb_A4116_1.isChecked()) {
            A4116 = "1";
        }
        if (rb_A4116_2.isChecked()) {
            A4116 = "2";
        }
        if (rb_A4116_DK.isChecked()) {
            A4116 = "9";
        }
        if (rb_A4116_RA.isChecked()) {
            A4116 = "8";
        }

        //A4117_u
        if (rb_A4117_u_1.isChecked()) {
            A4117_u = "1";
        }
        if (rb_A4117_u_2.isChecked()) {
            A4117_u = "2";
        }
        if (rb_A4117_u_DK.isChecked()) {
            A4117_u = "9";
        }
        if (rb_A4117_u_RA.isChecked()) {
            A4117_u = "8";
        }

        //A4117_a
        if (ed_A4117_a.getText().toString().trim().length() > 0) {
            A4117_a = ed_A4117_a.getText().toString().trim();
        }

        //A4117_b
        if (ed_A4117_b.getText().toString().trim().length() > 0) {
            A4117_b = ed_A4117_b.getText().toString().trim();
        }

        //A4118
        if (rb_A4118_1.isChecked()) {
            A4118 = "1";
        }
        if (rb_A4118_2.isChecked()) {
            A4118 = "2";
        }
        if (rb_A4118_DK.isChecked()) {
            A4118 = "9";
        }
        if (rb_A4118_RA.isChecked()) {
            A4118 = "8";
        }

        //A4119
        if (rb_A4119_1.isChecked()) {
            A4119 = "1";
        }
        if (rb_A4119_2.isChecked()) {
            A4119 = "2";
        }
        if (rb_A4119_3.isChecked()) {
            A4119 = "3";
        }
        if (rb_A4119_4.isChecked()) {
            A4119 = "4";
        }
        if (rb_A4119_DK.isChecked()) {
            A4119 = "9";
        }
        if (rb_A4119_RA.isChecked()) {
            A4119 = "8";
        }

        //A4120
        if (rb_A4120_1.isChecked()) {
            A4120 = "1";
        }
        if (rb_A4120_2.isChecked()) {
            A4120 = "2";
        }
        if (rb_A4120_3.isChecked()) {
            A4120 = "3";
        }
        if (rb_A4120_4.isChecked()) {
            A4120 = "4";
        }
        if (rb_A4120_DK.isChecked()) {
            A4120 = "9";
        }
        if (rb_A4120_RA.isChecked()) {
            A4120 = "8";
        }

        //A4121
        if (ed_A4121.getText().toString().trim().length() > 0) {
            A4121 = ed_A4121.getText().toString().trim();
        }

        //A4122
        if (rb_A4122_1.isChecked()) {
            A4122 = "1";
        }
        if (rb_A4122_2.isChecked()) {
            A4122 = "2";
        }
        if (rb_A4122_DK.isChecked()) {
            A4122 = "9";
        }
        if (rb_A4122_RA.isChecked()) {
            A4122 = "8";
        }

        //A4123
        if (rb_A4123_1.isChecked()) {
            A4123 = "1";
        }
        if (rb_A4123_2.isChecked()) {
            A4123 = "2";
        }
        if (rb_A4123_DK.isChecked()) {
            A4123 = "9";
        }
        if (rb_A4123_RA.isChecked()) {
            A4123 = "8";
        }

        //A4124
        if (rb_A4124_1.isChecked()) {
            A4124 = "1";
        }
        if (rb_A4124_2.isChecked()) {
            A4124 = "2";
        }
        if (rb_A4124_DK.isChecked()) {
            A4124 = "9";
        }
        if (rb_A4124_RA.isChecked()) {
            A4124 = "8";
        }

        //A4125
        if (rb_A4125_1.isChecked()) {
            A4125 = "1";
        }
        if (rb_A4125_2.isChecked()) {
            A4125 = "2";
        }
        if (rb_A4125_DK.isChecked()) {
            A4125 = "9";
        }
        if (rb_A4125_RA.isChecked()) {
            A4125 = "8";
        }


    }

    void insert_data() {

        String query = "insert into A4109_A4125("

                + Global.A.A4109_A4125.study_id + ","
                + Global.A.A4109_A4125.A4109 + ","
                + Global.A.A4109_A4125.A4110 + ","
                + Global.A.A4109_A4125.A4111 + ","
                + Global.A.A4109_A4125.A4112 + ","
                + Global.A.A4109_A4125.A4113 + ","
                + Global.A.A4109_A4125.A4114 + ","
                + Global.A.A4109_A4125.A4115 + ","
                + Global.A.A4109_A4125.A4116 + ","
                + Global.A.A4109_A4125.A4117_u + ","
                + Global.A.A4109_A4125.A4117_a + ","
                + Global.A.A4109_A4125.A4117_b + ","
                + Global.A.A4109_A4125.A4118 + ","
                + Global.A.A4109_A4125.A4119 + ","
                + Global.A.A4109_A4125.A4120 + ","
                + Global.A.A4109_A4125.A4121 + ","
                + Global.A.A4109_A4125.A4122 + ","
                + Global.A.A4109_A4125.A4123 + ","
                + Global.A.A4109_A4125.A4124 + ","
                + Global.A.A4109_A4125.A4125 + ","
                + Global.A.A4109_A4125.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4109        + "','" +
                A4110        + "','" +
                A4111        + "','" +
                A4112        + "','" +
                A4113        + "','" +
                A4114        + "','" +
                A4115        + "','" +
                A4116        + "','" +
                A4117_u      + "','" +
                A4117_a      + "','" +
                A4117_b      + "','" +
                A4118        + "','" +
                A4119        + "','" +
                A4120        + "','" +
                A4121        + "','" +
                A4122        + "','" +
                A4123        + "','" +
                A4124        + "','" +
                A4125        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        Lm.database.execSQL(query);

        Toast.makeText(this, "6th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4109) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4110) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4111) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4112) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4113) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4114) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4115) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4116) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4117_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4117_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4117_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4118) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4119) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4120) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4121) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4122) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4123) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4124) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4125) == false) {
            return false;
        }

        return true;
    }
}

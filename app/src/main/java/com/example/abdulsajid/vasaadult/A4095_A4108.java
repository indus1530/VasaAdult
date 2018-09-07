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

public class A4095_A4108 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next5;

    LinearLayout
            ll_A4095,
            ll_A4096,
            ll_A4097_u,
            ll_A4097_a,
            ll_A4097_b,
            ll_A4098,
            ll_A4099_u,
            ll_A4099_a,
            ll_A4099_b,
            ll_A4100,
            ll_A4101_u,
            ll_A4101_a,
            ll_A4101_b,
            ll_A4102,
            ll_A4103,
            ll_A4104,
            ll_A4105,
            ll_A4106,
            ll_A4107,
            ll_A4108;

    RadioButton
            rb_A4095_1,
            rb_A4095_2,
            rb_A4095_DK,
            rb_A4095_RA,
            rb_A4096_1,
            rb_A4096_2,
            rb_A4096_DK,
            rb_A4096_RA,
            rb_A4097_u_1,
            rb_A4097_u_2,
            rb_A4097_u_DK,
            rb_A4097_u_RA,
            rb_A4098_1,
            rb_A4098_2,
            rb_A4098_DK,
            rb_A4098_RA,
            rb_A4099_u_1,
            rb_A4099_u_2,
            rb_A4099_u_DK,
            rb_A4099_u_RA,
            rb_A4100_1,
            rb_A4100_2,
            rb_A4100_DK,
            rb_A4100_RA,
            rb_A4101_u_1,
            rb_A4101_u_2,
            rb_A4101_u_DK,
            rb_A4101_u_RA,
            rb_A4102_1,
            rb_A4102_2,
            rb_A4102_DK,
            rb_A4102_RA,
            rb_A4103_1,
            rb_A4103_2,
            rb_A4103_DK,
            rb_A4103_RA,
            rb_A4104_1,
            rb_A4104_2,
            rb_A4104_DK,
            rb_A4104_RA,
            rb_A4105_1,
            rb_A4105_2,
            rb_A4105_DK,
            rb_A4105_RA,
            rb_A4106_1,
            rb_A4106_2,
            rb_A4106_DK,
            rb_A4106_RA,
            rb_A4108_1,
            rb_A4108_2,
            rb_A4108_DK,
            rb_A4108_RA;

    EditText
            ed_A4097_a,
            ed_A4097_b,
            ed_A4099_a,
            ed_A4099_b,
            ed_A4101_a,
            ed_A4101_b,
            ed_A4107;

    String
            study_id,
            A4095,
            A4096,
            A4097_u,
            A4097_a,
            A4097_b,
            A4098,
            A4099_u,
            A4099_a,
            A4099_b,
            A4100,
            A4101_u,
            A4101_a,
            A4101_b,
            A4102,
            A4103,
            A4104,
            A4105,
            A4106,
            A4107,
            A4108,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next5 = (Button) findViewById(R.id.btn_next5);

        //Linear Layout
        ll_A4095 = (LinearLayout) findViewById(R.id.ll_A4095);
        ll_A4096 = (LinearLayout) findViewById(R.id.ll_A4096);
        ll_A4097_u = (LinearLayout) findViewById(R.id.ll_A4097_u);
        ll_A4097_a = (LinearLayout) findViewById(R.id.ll_A4097_a);
        ll_A4097_b = (LinearLayout) findViewById(R.id.ll_A4097_b);
        ll_A4098 = (LinearLayout) findViewById(R.id.ll_A4098);
        ll_A4099_u = (LinearLayout) findViewById(R.id.ll_A4099_u);
        ll_A4099_a = (LinearLayout) findViewById(R.id.ll_A4099_a);
        ll_A4099_b = (LinearLayout) findViewById(R.id.ll_A4099_b);
        ll_A4100 = (LinearLayout) findViewById(R.id.ll_A4100);
        ll_A4101_u = (LinearLayout) findViewById(R.id.ll_A4101_u);
        ll_A4101_a = (LinearLayout) findViewById(R.id.ll_A4101_a);
        ll_A4101_b = (LinearLayout) findViewById(R.id.ll_A4101_b);
        ll_A4102 = (LinearLayout) findViewById(R.id.ll_A4102);
        ll_A4103 = (LinearLayout) findViewById(R.id.ll_A4103);
        ll_A4104 = (LinearLayout) findViewById(R.id.ll_A4104);
        ll_A4105 = (LinearLayout) findViewById(R.id.ll_A4105);
        ll_A4106 = (LinearLayout) findViewById(R.id.ll_A4106);
        ll_A4107 = (LinearLayout) findViewById(R.id.ll_A4107);
        ll_A4108 = (LinearLayout) findViewById(R.id.ll_A4108);

        //Radio Button
        rb_A4095_1 = findViewById(R.id.rb_A4095_1);
        rb_A4095_2 = findViewById(R.id.rb_A4095_2);
        rb_A4095_DK = findViewById(R.id.rb_A4095_DK);
        rb_A4095_RA = findViewById(R.id.rb_A4095_RA);
        rb_A4096_1 = findViewById(R.id.rb_A4096_1);
        rb_A4096_2 = findViewById(R.id.rb_A4096_2);
        rb_A4096_DK = findViewById(R.id.rb_A4096_DK);
        rb_A4096_RA = findViewById(R.id.rb_A4096_RA);
        rb_A4097_u_1 = findViewById(R.id.rb_A4097_u_1);
        rb_A4097_u_2 = findViewById(R.id.rb_A4097_u_2);
        rb_A4097_u_DK = findViewById(R.id.rb_A4097_u_DK);
        rb_A4097_u_RA = findViewById(R.id.rb_A4097_u_RA);
        rb_A4098_1 = findViewById(R.id.rb_A4098_1);
        rb_A4098_2 = findViewById(R.id.rb_A4098_2);
        rb_A4098_DK = findViewById(R.id.rb_A4098_DK);
        rb_A4098_RA = findViewById(R.id.rb_A4098_RA);
        rb_A4099_u_1 = findViewById(R.id.rb_A4099_u_1);
        rb_A4099_u_2 = findViewById(R.id.rb_A4099_u_2);
        rb_A4099_u_DK = findViewById(R.id.rb_A4099_u_DK);
        rb_A4099_u_RA = findViewById(R.id.rb_A4099_u_RA);
        rb_A4100_1 = findViewById(R.id.rb_A4100_1);
        rb_A4100_2 = findViewById(R.id.rb_A4100_2);
        rb_A4100_DK = findViewById(R.id.rb_A4100_DK);
        rb_A4100_RA = findViewById(R.id.rb_A4100_RA);
        rb_A4101_u_1 = findViewById(R.id.rb_A4101_u_1);
        rb_A4101_u_2 = findViewById(R.id.rb_A4101_u_2);
        rb_A4101_u_DK = findViewById(R.id.rb_A4101_u_DK);
        rb_A4101_u_RA = findViewById(R.id.rb_A4101_u_RA);
        rb_A4102_1 = findViewById(R.id.rb_A4102_1);
        rb_A4102_2 = findViewById(R.id.rb_A4102_2);
        rb_A4102_DK = findViewById(R.id.rb_A4102_DK);
        rb_A4102_RA = findViewById(R.id.rb_A4102_RA);
        rb_A4103_1 = findViewById(R.id.rb_A4103_1);
        rb_A4103_2 = findViewById(R.id.rb_A4103_2);
        rb_A4103_DK = findViewById(R.id.rb_A4103_DK);
        rb_A4103_RA = findViewById(R.id.rb_A4103_RA);
        rb_A4104_1 = findViewById(R.id.rb_A4104_1);
        rb_A4104_2 = findViewById(R.id.rb_A4104_2);
        rb_A4104_DK = findViewById(R.id.rb_A4104_DK);
        rb_A4104_RA = findViewById(R.id.rb_A4104_RA);
        rb_A4105_1 = findViewById(R.id.rb_A4105_1);
        rb_A4105_2 = findViewById(R.id.rb_A4105_2);
        rb_A4105_DK = findViewById(R.id.rb_A4105_DK);
        rb_A4105_RA = findViewById(R.id.rb_A4105_RA);
        rb_A4106_1 = findViewById(R.id.rb_A4106_1);
        rb_A4106_2 = findViewById(R.id.rb_A4106_2);
        rb_A4106_DK = findViewById(R.id.rb_A4106_DK);
        rb_A4106_RA = findViewById(R.id.rb_A4106_RA);
        rb_A4108_1 = findViewById(R.id.rb_A4108_1);
        rb_A4108_2 = findViewById(R.id.rb_A4108_2);
        rb_A4108_DK = findViewById(R.id.rb_A4108_DK);
        rb_A4108_RA = findViewById(R.id.rb_A4108_RA);

        // Edit Text
        ed_A4097_a = (EditText) findViewById(R.id.ed_A4097_a);
        ed_A4097_b = (EditText) findViewById(R.id.ed_A4097_b);
        ed_A4099_a = (EditText) findViewById(R.id.ed_A4099_a);
        ed_A4099_b = (EditText) findViewById(R.id.ed_A4099_b);
        ed_A4101_a = (EditText) findViewById(R.id.ed_A4101_a);
        ed_A4101_b = (EditText) findViewById(R.id.ed_A4101_b);
        ed_A4107 = (EditText) findViewById(R.id.ed_A4107);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4095__a4108);

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

        Intent c2 = new Intent(A4095_A4108.this, A4109_A4125.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4096_1
                || compoundButton.getId() == R.id.rb_A4096_2
                || compoundButton.getId() == R.id.rb_A4096_DK
                || compoundButton.getId() == R.id.rb_A4096_RA)

        {
            if (rb_A4096_2.isChecked() || rb_A4096_DK.isChecked() || rb_A4096_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4097_u);
                ClearAllcontrol.ClearAll(ll_A4097_a);
                ClearAllcontrol.ClearAll(ll_A4097_b);

                ll_A4097_u.setVisibility(View.GONE);
                ll_A4097_a.setVisibility(View.GONE);
                ll_A4097_b.setVisibility(View.GONE);

            } else {
                ll_A4097_u.setVisibility(View.VISIBLE);
                ll_A4097_a.setVisibility(View.VISIBLE);
                ll_A4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4097_u_1
                || compoundButton.getId() == R.id.rb_A4097_u_2
                || compoundButton.getId() == R.id.rb_A4097_u_DK
                || compoundButton.getId() == R.id.rb_A4097_u_RA)

                ClearAllcontrol.ClearAll(ll_A4097_a);
                ClearAllcontrol.ClearAll(ll_A4097_b);

                ll_A4097_a.setVisibility(View.GONE);
                ll_A4097_b.setVisibility(View.GONE);

        {
            if (rb_A4097_u_1.isChecked()) {
                ll_A4097_a.setVisibility(View.VISIBLE);
            } else if (rb_A4097_u_2.isChecked()) {
                ll_A4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4098_1
                || compoundButton.getId() == R.id.rb_A4098_2
                || compoundButton.getId() == R.id.rb_A4098_DK
                || compoundButton.getId() == R.id.rb_A4098_RA)

        {
            if (rb_A4098_2.isChecked() || rb_A4098_DK.isChecked() || rb_A4098_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4099_u);
                ClearAllcontrol.ClearAll(ll_A4099_a);
                ClearAllcontrol.ClearAll(ll_A4099_b);

                ll_A4099_u.setVisibility(View.GONE);
                ll_A4099_a.setVisibility(View.GONE);
                ll_A4099_b.setVisibility(View.GONE);

            } else {
                ll_A4099_u.setVisibility(View.VISIBLE);
                ll_A4099_a.setVisibility(View.VISIBLE);
                ll_A4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4099_u_1
                || compoundButton.getId() == R.id.rb_A4099_u_2
                || compoundButton.getId() == R.id.rb_A4099_u_DK
                || compoundButton.getId() == R.id.rb_A4099_u_RA)

            ClearAllcontrol.ClearAll(ll_A4099_a);
        ClearAllcontrol.ClearAll(ll_A4099_b);

        ll_A4099_a.setVisibility(View.GONE);
        ll_A4099_b.setVisibility(View.GONE);

        {
            if (rb_A4099_u_1.isChecked()) {
                ll_A4099_a.setVisibility(View.VISIBLE);
            } else if (rb_A4099_u_2.isChecked()) {
                ll_A4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4100_1
                || compoundButton.getId() == R.id.rb_A4100_2
                || compoundButton.getId() == R.id.rb_A4100_DK
                || compoundButton.getId() == R.id.rb_A4100_RA)

        {
            if (rb_A4100_2.isChecked() || rb_A4100_DK.isChecked() || rb_A4100_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4101_u);
                ClearAllcontrol.ClearAll(ll_A4101_a);
                ClearAllcontrol.ClearAll(ll_A4101_b);

                ll_A4101_u.setVisibility(View.GONE);
                ll_A4101_a.setVisibility(View.GONE);
                ll_A4101_b.setVisibility(View.GONE);

            } else {
                ll_A4101_u.setVisibility(View.VISIBLE);
                ll_A4101_a.setVisibility(View.VISIBLE);
                ll_A4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4101_u_1
                || compoundButton.getId() == R.id.rb_A4101_u_2
                || compoundButton.getId() == R.id.rb_A4101_u_DK
                || compoundButton.getId() == R.id.rb_A4101_u_RA)

            ClearAllcontrol.ClearAll(ll_A4101_a);
        ClearAllcontrol.ClearAll(ll_A4101_b);

        ll_A4101_a.setVisibility(View.GONE);
        ll_A4101_b.setVisibility(View.GONE);

        {
            if (rb_A4101_u_1.isChecked()) {
                ll_A4101_a.setVisibility(View.VISIBLE);
            } else if (rb_A4101_u_2.isChecked()) {
                ll_A4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4102_1
                || compoundButton.getId() == R.id.rb_A4102_2
                || compoundButton.getId() == R.id.rb_A4102_DK
                || compoundButton.getId() == R.id.rb_A4102_RA)

        {
            if (rb_A4102_2.isChecked() || rb_A4102_DK.isChecked() || rb_A4102_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4103);
                ClearAllcontrol.ClearAll(ll_A4104);
                ClearAllcontrol.ClearAll(ll_A4105);

                ll_A4103.setVisibility(View.GONE);
                ll_A4104.setVisibility(View.GONE);
                ll_A4105.setVisibility(View.GONE);

            } else {
                ll_A4103.setVisibility(View.VISIBLE);
                ll_A4104.setVisibility(View.VISIBLE);
                ll_A4105.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4106_1
                || compoundButton.getId() == R.id.rb_A4106_2
                || compoundButton.getId() == R.id.rb_A4106_DK
                || compoundButton.getId() == R.id.rb_A4106_RA)

        {
            if (rb_A4106_2.isChecked() || rb_A4106_DK.isChecked() || rb_A4106_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4107);
                ClearAllcontrol.ClearAll(ll_A4108);

                ll_A4107.setVisibility(View.GONE);
                ll_A4108.setVisibility(View.GONE);

            } else {
                ll_A4107.setVisibility(View.VISIBLE);
                ll_A4108.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next5.setOnClickListener(this);

        rb_A4096_1.setOnCheckedChangeListener(this);
        rb_A4096_2.setOnCheckedChangeListener(this);
        rb_A4096_DK.setOnCheckedChangeListener(this);
        rb_A4096_RA.setOnCheckedChangeListener(this);
        rb_A4097_u_1.setOnCheckedChangeListener(this);
        rb_A4097_u_2.setOnCheckedChangeListener(this);
        rb_A4097_u_DK.setOnCheckedChangeListener(this);
        rb_A4097_u_RA.setOnCheckedChangeListener(this);
        rb_A4098_1.setOnCheckedChangeListener(this);
        rb_A4098_2.setOnCheckedChangeListener(this);
        rb_A4098_DK.setOnCheckedChangeListener(this);
        rb_A4098_RA.setOnCheckedChangeListener(this);
        rb_A4099_u_1.setOnCheckedChangeListener(this);
        rb_A4099_u_2.setOnCheckedChangeListener(this);
        rb_A4099_u_DK.setOnCheckedChangeListener(this);
        rb_A4099_u_RA.setOnCheckedChangeListener(this);
        rb_A4100_1.setOnCheckedChangeListener(this);
        rb_A4100_2.setOnCheckedChangeListener(this);
        rb_A4100_DK.setOnCheckedChangeListener(this);
        rb_A4100_RA.setOnCheckedChangeListener(this);
        rb_A4101_u_1.setOnCheckedChangeListener(this);
        rb_A4101_u_2.setOnCheckedChangeListener(this);
        rb_A4101_u_DK.setOnCheckedChangeListener(this);
        rb_A4101_u_RA.setOnCheckedChangeListener(this);
        rb_A4102_1.setOnCheckedChangeListener(this);
        rb_A4102_2.setOnCheckedChangeListener(this);
        rb_A4102_DK.setOnCheckedChangeListener(this);
        rb_A4102_RA.setOnCheckedChangeListener(this);
        rb_A4106_1.setOnCheckedChangeListener(this);
        rb_A4106_2.setOnCheckedChangeListener(this);
        rb_A4106_DK.setOnCheckedChangeListener(this);
        rb_A4106_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id =  "0";
        A4095 =     "000";
        A4096 =     "000";
        A4097_u =   "000";
        A4097_a =   "000";
        A4097_b =   "000";
        A4098 =     "000";
        A4099_u =   "000";
        A4099_a =   "000";
        A4099_b =   "000";
        A4100 =     "000";
        A4101_u =   "000";
        A4101_a =   "000";
        A4101_b =   "000";
        A4102 =     "000";
        A4103 =     "000";
        A4104 =     "000";
        A4105 =     "000";
        A4106 =     "000";
        A4107 =     "000";
        A4108 =     "000";
        STATUS =    "0";

        //A4095
        if (rb_A4095_1.isChecked()) {
            A4095 = "1";
        }
        if (rb_A4095_2.isChecked()) {
            A4095 = "2";
        }
        if (rb_A4095_DK.isChecked()) {
            A4095 = "9";
        }
        if (rb_A4095_RA.isChecked()) {
            A4095 = "8";
        }

        //A4096
        if (rb_A4096_1.isChecked()) {
            A4096 = "1";
        }
        if (rb_A4096_2.isChecked()) {
            A4096 = "2";
        }
        if (rb_A4096_DK.isChecked()) {
            A4096 = "9";
        }
        if (rb_A4096_RA.isChecked()) {
            A4096 = "8";
        }

        //A4097_u
        if (rb_A4097_u_1.isChecked()) {
            A4097_u = "1";
        }
        if (rb_A4097_u_2.isChecked()) {
            A4097_u = "2";
        }
        if (rb_A4097_u_DK.isChecked()) {
            A4097_u = "9";
        }
        if (rb_A4097_u_RA.isChecked()) {
            A4097_u = "8";
        }

        //A4097_a
        if (ed_A4097_a.getText().toString().trim().length() > 0) {
            A4097_a = ed_A4097_a.getText().toString().trim();
        }

        //A4097_b
        if (ed_A4097_b.getText().toString().trim().length() > 0) {
            A4097_b = ed_A4097_b.getText().toString().trim();
        }

        //A4098
        if (rb_A4098_1.isChecked()) {
            A4098 = "1";
        }
        if (rb_A4098_2.isChecked()) {
            A4098 = "2";
        }
        if (rb_A4098_DK.isChecked()) {
            A4098 = "9";
        }
        if (rb_A4098_RA.isChecked()) {
            A4098 = "8";
        }

        //A4099_u
        if (rb_A4099_u_1.isChecked()) {
            A4099_u = "1";
        }
        if (rb_A4099_u_2.isChecked()) {
            A4099_u = "2";
        }
        if (rb_A4099_u_DK.isChecked()) {
            A4099_u = "9";
        }
        if (rb_A4099_u_RA.isChecked()) {
            A4099_u = "8";
        }

        //A4099_a
        if (ed_A4099_a.getText().toString().trim().length() > 0) {
            A4099_a = ed_A4099_a.getText().toString().trim();
        }

        //A4099_b
        if (ed_A4099_b.getText().toString().trim().length() > 0) {
            A4099_b = ed_A4099_b.getText().toString().trim();
        }

        //A4100
        if (rb_A4100_1.isChecked()) {
            A4100 = "1";
        }
        if (rb_A4100_2.isChecked()) {
            A4100 = "2";
        }
        if (rb_A4100_DK.isChecked()) {
            A4100 = "9";
        }
        if (rb_A4100_RA.isChecked()) {
            A4100 = "8";
        }

        //A4101_u
        if (rb_A4101_u_1.isChecked()) {
            A4101_u = "1";
        }
        if (rb_A4101_u_2.isChecked()) {
            A4101_u = "2";
        }
        if (rb_A4101_u_DK.isChecked()) {
            A4101_u = "9";
        }
        if (rb_A4101_u_RA.isChecked()) {
            A4101_u = "8";
        }

        //A4101_a
        if (ed_A4101_a.getText().toString().trim().length() > 0) {
            A4101_a = ed_A4101_a.getText().toString().trim();
        }

        //A4101_b
        if (ed_A4101_b.getText().toString().trim().length() > 0) {
            A4101_b = ed_A4101_b.getText().toString().trim();
        }

        //A4102
        if (rb_A4102_1.isChecked()) {
            A4102 = "1";
        }
        if (rb_A4102_2.isChecked()) {
            A4102 = "2";
        }
        if (rb_A4102_DK.isChecked()) {
            A4102 = "9";
        }
        if (rb_A4102_RA.isChecked()) {
            A4102 = "8";
        }

        //A4103
        if (rb_A4103_1.isChecked()) {
            A4103 = "1";
        }
        if (rb_A4103_2.isChecked()) {
            A4103 = "2";
        }
        if (rb_A4103_DK.isChecked()) {
            A4103 = "9";
        }
        if (rb_A4103_RA.isChecked()) {
            A4103 = "8";
        }

        //A4104
        if (rb_A4104_1.isChecked()) {
            A4104 = "1";
        }
        if (rb_A4104_2.isChecked()) {
            A4104 = "2";
        }
        if (rb_A4104_DK.isChecked()) {
            A4104 = "9";
        }
        if (rb_A4104_RA.isChecked()) {
            A4104 = "8";
        }

        //A4105
        if (rb_A4105_1.isChecked()) {
            A4105 = "1";
        }
        if (rb_A4105_2.isChecked()) {
            A4105 = "2";
        }
        if (rb_A4105_DK.isChecked()) {
            A4105 = "9";
        }
        if (rb_A4105_RA.isChecked()) {
            A4105 = "8";
        }

        //A4106
        if (rb_A4106_1.isChecked()) {
            A4106 = "1";
        }
        if (rb_A4106_2.isChecked()) {
            A4106 = "2";
        }
        if (rb_A4106_DK.isChecked()) {
            A4106 = "9";
        }
        if (rb_A4106_RA.isChecked()) {
            A4106 = "8";
        }

        //A4107
        if (ed_A4107.getText().toString().trim().length() > 0) {
            A4107 = ed_A4107.getText().toString().trim();
        }

        //A4108
        if (rb_A4108_1.isChecked()) {
            A4108 = "1";
        }
        if (rb_A4108_2.isChecked()) {
            A4108 = "2";
        }
        if (rb_A4108_DK.isChecked()) {
            A4108 = "9";
        }
        if (rb_A4108_RA.isChecked()) {
            A4108 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4095_A4108("

                + Global.A.A4095_A4108.study_id + ","
                + Global.A.A4095_A4108.A4095 + ","
                + Global.A.A4095_A4108.A4096 + ","
                + Global.A.A4095_A4108.A4097_u + ","
                + Global.A.A4095_A4108.A4097_a + ","
                + Global.A.A4095_A4108.A4097_b + ","
                + Global.A.A4095_A4108.A4098 + ","
                + Global.A.A4095_A4108.A4099_u + ","
                + Global.A.A4095_A4108.A4099_a + ","
                + Global.A.A4095_A4108.A4099_b + ","
                + Global.A.A4095_A4108.A4100 + ","
                + Global.A.A4095_A4108.A4101_u + ","
                + Global.A.A4095_A4108.A4101_a + ","
                + Global.A.A4095_A4108.A4101_b + ","
                + Global.A.A4095_A4108.A4102 + ","
                + Global.A.A4095_A4108.A4103 + ","
                + Global.A.A4095_A4108.A4104 + ","
                + Global.A.A4095_A4108.A4105 + ","
                + Global.A.A4095_A4108.A4106 + ","
                + Global.A.A4095_A4108.A4107 + ","
                + Global.A.A4095_A4108.A4108 + ","
                + Global.A.A4095_A4108.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4095        + "','" +
                A4096        + "','" +
                A4097_u      + "','" +
                A4097_a      + "','" +
                A4097_b      + "','" +
                A4098        + "','" +
                A4099_u      + "','" +
                A4099_a      + "','" +
                A4099_b      + "','" +
                A4100        + "','" +
                A4101_u      + "','" +
                A4101_a      + "','" +
                A4101_b      + "','" +
                A4102        + "','" +
                A4103        + "','" +
                A4104        + "','" +
                A4105        + "','" +
                A4106        + "','" +
                A4107        + "','" +
                A4108        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        Lm.database.execSQL(query);

        Toast.makeText(this, "5th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4095) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4096) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4097_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4097_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4097_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4098) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4099_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4099_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4099_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4100) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4101_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4101_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4101_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4102) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4103) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4104) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4105) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4106) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4107) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4108) == false) {
            return false;
        }

        return true;
    }
}

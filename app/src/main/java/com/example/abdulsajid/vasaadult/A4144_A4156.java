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

public class A4144_A4156 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next8;

    LinearLayout
            ll_A4144,
            ll_A4145,
            ll_A4146,
            ll_A4147,
            ll_A4148,
            ll_A4149,
            ll_A4150_u,
            ll_A4150_a,
            ll_A4150_b,
            ll_A4151,
            ll_A4152,
            ll_A4153,
            ll_A4154,
            ll_A4155,
            ll_A4156;

    RadioButton
            rb_A4144_1,
            rb_A4144_2,
            rb_A4144_DK,
            rb_A4144_RA,
            rb_A4145_1,
            rb_A4145_2,
            rb_A4145_DK,
            rb_A4145_RA,
            rb_A4146_1,
            rb_A4146_2,
            rb_A4146_DK,
            rb_A4146_RA,
            rb_A4147_1,
            rb_A4147_2,
            rb_A4147_DK,
            rb_A4147_RA,
            rb_A4148_1,
            rb_A4148_2,
            rb_A4148_3,
            rb_A4148_4,
            rb_A4148_5,
            rb_A4148_6,
            rb_A4148_7,
            rb_A4148_10,
            rb_A4148_DK,
            rb_A4148_RA,
            rb_A4149_1,
            rb_A4149_2,
            rb_A4149_DK,
            rb_A4149_RA,
            rb_A4150_u_1,
            rb_A4150_u_2,
            rb_A4150_u_DK,
            rb_A4150_u_RA,
            rb_A4151_1,
            rb_A4151_2,
            rb_A4151_3,
            rb_A4152_1,
            rb_A4152_2,
            rb_A4152_DK,
            rb_A4152_RA,
            rb_A4153_1,
            rb_A4153_2,
            rb_A4153_DK,
            rb_A4153_RA,
            rb_A4154_1,
            rb_A4154_2,
            rb_A4154_DK,
            rb_A4154_RA,
            rb_A4155_1,
            rb_A4155_2,
            rb_A4155_DK,
            rb_A4155_RA,
            rb_A4156_1,
            rb_A4156_2,
            rb_A4156_DK,
            rb_A4156_RA;

    EditText
            ed_A4150_a,
            ed_A4150_b;

    String
            study_id,
            A4144,
            A4145,
            A4146,
            A4147,
            A4148,
            A4149,
            A4150_u,
            A4150_a,
            A4150_b,
            A4151,
            A4152,
            A4153,
            A4154,
            A4155,
            A4156,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next8 = (Button) findViewById(R.id.btn_next8);

        //Linear Layout
        ll_A4144 = (LinearLayout) findViewById(R.id.ll_A4144);
        ll_A4145 = (LinearLayout) findViewById(R.id.ll_A4145);
        ll_A4146 = (LinearLayout) findViewById(R.id.ll_A4146);
        ll_A4147 = (LinearLayout) findViewById(R.id.ll_A4147);
        ll_A4148 = (LinearLayout) findViewById(R.id.ll_A4148);
        ll_A4149 = (LinearLayout) findViewById(R.id.ll_A4149);
        ll_A4150_u = (LinearLayout) findViewById(R.id.ll_A4150_u);
        ll_A4150_a = (LinearLayout) findViewById(R.id.ll_A4150_a);
        ll_A4150_b = (LinearLayout) findViewById(R.id.ll_A4150_b);
        ll_A4151 = (LinearLayout) findViewById(R.id.ll_A4151);
        ll_A4152 = (LinearLayout) findViewById(R.id.ll_A4152);
        ll_A4153 = (LinearLayout) findViewById(R.id.ll_A4153);
        ll_A4154 = (LinearLayout) findViewById(R.id.ll_A4154);
        ll_A4155 = (LinearLayout) findViewById(R.id.ll_A4155);
        ll_A4156 = (LinearLayout) findViewById(R.id.ll_A4156);

        //Radio Button
        rb_A4144_1 = findViewById(R.id.rb_A4144_1);
        rb_A4144_2 = findViewById(R.id.rb_A4144_2);
        rb_A4144_DK = findViewById(R.id.rb_A4144_DK);
        rb_A4144_RA = findViewById(R.id.rb_A4144_RA);
        rb_A4145_1 = findViewById(R.id.rb_A4145_1);
        rb_A4145_2 = findViewById(R.id.rb_A4145_2);
        rb_A4145_DK = findViewById(R.id.rb_A4145_DK);
        rb_A4145_RA = findViewById(R.id.rb_A4145_RA);
        rb_A4146_1 = findViewById(R.id.rb_A4146_1);
        rb_A4146_2 = findViewById(R.id.rb_A4146_2);
        rb_A4146_DK = findViewById(R.id.rb_A4146_DK);
        rb_A4146_RA = findViewById(R.id.rb_A4146_RA);
        rb_A4147_1 = findViewById(R.id.rb_A4147_1);
        rb_A4147_2 = findViewById(R.id.rb_A4147_2);
        rb_A4147_DK = findViewById(R.id.rb_A4147_DK);
        rb_A4147_RA = findViewById(R.id.rb_A4147_RA);
        rb_A4148_1 = findViewById(R.id.rb_A4148_1);
        rb_A4148_2 = findViewById(R.id.rb_A4148_2);
        rb_A4148_3 = findViewById(R.id.rb_A4148_3);
        rb_A4148_4 = findViewById(R.id.rb_A4148_4);
        rb_A4148_5 = findViewById(R.id.rb_A4148_5);
        rb_A4148_6 = findViewById(R.id.rb_A4148_6);
        rb_A4148_7 = findViewById(R.id.rb_A4148_7);
        rb_A4148_10 = findViewById(R.id.rb_A4148_10);
        rb_A4148_DK = findViewById(R.id.rb_A4148_DK);
        rb_A4148_RA = findViewById(R.id.rb_A4148_RA);
        rb_A4149_1 = findViewById(R.id.rb_A4149_1);
        rb_A4149_2 = findViewById(R.id.rb_A4149_2);
        rb_A4149_DK = findViewById(R.id.rb_A4149_DK);
        rb_A4149_RA = findViewById(R.id.rb_A4149_RA);
        rb_A4150_u_1 = findViewById(R.id.rb_A4150_u_1);
        rb_A4150_u_2 = findViewById(R.id.rb_A4150_u_2);
        rb_A4150_u_DK = findViewById(R.id.rb_A4150_u_DK);
        rb_A4150_u_RA = findViewById(R.id.rb_A4150_u_RA);
        rb_A4151_1 = findViewById(R.id.rb_A4151_1);
        rb_A4151_2 = findViewById(R.id.rb_A4151_2);
        rb_A4151_3 = findViewById(R.id.rb_A4151_3);
        rb_A4152_1 = findViewById(R.id.rb_A4152_1);
        rb_A4152_2 = findViewById(R.id.rb_A4152_2);
        rb_A4152_DK = findViewById(R.id.rb_A4152_DK);
        rb_A4152_RA = findViewById(R.id.rb_A4152_RA);
        rb_A4153_1 = findViewById(R.id.rb_A4153_1);
        rb_A4153_2 = findViewById(R.id.rb_A4153_2);
        rb_A4153_DK = findViewById(R.id.rb_A4153_DK);
        rb_A4153_RA = findViewById(R.id.rb_A4153_RA);
        rb_A4154_1 = findViewById(R.id.rb_A4154_1);
        rb_A4154_2 = findViewById(R.id.rb_A4154_2);
        rb_A4154_DK = findViewById(R.id.rb_A4154_DK);
        rb_A4154_RA = findViewById(R.id.rb_A4154_RA);
        rb_A4155_1 = findViewById(R.id.rb_A4155_1);
        rb_A4155_2 = findViewById(R.id.rb_A4155_2);
        rb_A4155_DK = findViewById(R.id.rb_A4155_DK);
        rb_A4155_RA = findViewById(R.id.rb_A4155_RA);
        rb_A4156_1 = findViewById(R.id.rb_A4156_1);
        rb_A4156_2 = findViewById(R.id.rb_A4156_2);
        rb_A4156_DK = findViewById(R.id.rb_A4156_DK);
        rb_A4156_RA = findViewById(R.id.rb_A4156_RA);

        // Edit Text
        ed_A4150_a = (EditText) findViewById(R.id.ed_A4150_a);
        ed_A4150_b = (EditText) findViewById(R.id.ed_A4150_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4144__a4156);

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

        Intent c2 = new Intent(A4144_A4156.this, A4157_A4205.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4146_1
                || compoundButton.getId() == R.id.rb_A4146_2
                || compoundButton.getId() == R.id.rb_A4146_DK
                || compoundButton.getId() == R.id.rb_A4146_RA)

        {
            if (rb_A4146_2.isChecked() || rb_A4146_DK.isChecked() || rb_A4146_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4147);
                ClearAllcontrol.ClearAll(ll_A4148);

                ll_A4147.setVisibility(View.GONE);
                ll_A4148.setVisibility(View.GONE);

            } else {
                ll_A4147.setVisibility(View.VISIBLE);
                ll_A4148.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4149_1
                || compoundButton.getId() == R.id.rb_A4149_2
                || compoundButton.getId() == R.id.rb_A4149_DK
                || compoundButton.getId() == R.id.rb_A4149_RA)

        {
            if (rb_A4149_2.isChecked() || rb_A4149_DK.isChecked() || rb_A4149_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4150_u);
                ClearAllcontrol.ClearAll(ll_A4150_a);
                ClearAllcontrol.ClearAll(ll_A4150_b);
                ClearAllcontrol.ClearAll(ll_A4151);

                ll_A4150_u.setVisibility(View.GONE);
                ll_A4150_a.setVisibility(View.GONE);
                ll_A4150_b.setVisibility(View.GONE);
                ll_A4151.setVisibility(View.GONE);

            } else {
                ll_A4150_u.setVisibility(View.VISIBLE);
                ll_A4150_a.setVisibility(View.VISIBLE);
                ll_A4150_b.setVisibility(View.VISIBLE);
                ll_A4151.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4150_u_1
                || compoundButton.getId() == R.id.rb_A4150_u_2
                || compoundButton.getId() == R.id.rb_A4150_u_DK
                || compoundButton.getId() == R.id.rb_A4150_u_RA)

            ClearAllcontrol.ClearAll(ll_A4150_a);
        ClearAllcontrol.ClearAll(ll_A4150_b);

        ll_A4150_a.setVisibility(View.GONE);
        ll_A4150_b.setVisibility(View.GONE);

        {
            if (rb_A4150_u_1.isChecked()) {
                ll_A4150_a.setVisibility(View.VISIBLE);
            } else if (rb_A4150_u_2.isChecked()) {
                ll_A4150_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4154_1
                || compoundButton.getId() == R.id.rb_A4154_2
                || compoundButton.getId() == R.id.rb_A4154_DK
                || compoundButton.getId() == R.id.rb_A4154_RA)

        {
            if (rb_A4154_2.isChecked() || rb_A4154_DK.isChecked() || rb_A4154_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4155);

                ll_A4155.setVisibility(View.GONE);

            } else {
                ll_A4155.setVisibility(View.VISIBLE);
            }
        }

    }
    

    private void events_calls() {

        btn_next8.setOnClickListener(this);
        
        rb_A4146_1.setOnCheckedChangeListener(this);
        rb_A4146_2.setOnCheckedChangeListener(this);
        rb_A4146_DK.setOnCheckedChangeListener(this);
        rb_A4146_RA.setOnCheckedChangeListener(this);
        rb_A4149_1.setOnCheckedChangeListener(this);
        rb_A4149_2.setOnCheckedChangeListener(this);
        rb_A4149_DK.setOnCheckedChangeListener(this);
        rb_A4149_RA.setOnCheckedChangeListener(this);
        rb_A4150_u_1.setOnCheckedChangeListener(this);
        rb_A4150_u_2.setOnCheckedChangeListener(this);
        rb_A4150_u_DK.setOnCheckedChangeListener(this);
        rb_A4150_u_RA.setOnCheckedChangeListener(this);
        rb_A4154_1.setOnCheckedChangeListener(this);
        rb_A4154_2.setOnCheckedChangeListener(this);
        rb_A4154_DK.setOnCheckedChangeListener(this);
        rb_A4154_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4144 = "000";
        A4145 = "000";
        A4146 = "000";
        A4147 = "000";
        A4148 = "000";
        A4149 = "000";
        A4150_u = "000";
        A4150_a = "000";
        A4150_b = "000";
        A4151 = "000";
        A4152 = "000";
        A4153 = "000";
        A4154 = "000";
        A4155 = "000";
        A4156 = "000";
        STATUS = "0";

        //A4144
        if (rb_A4144_1.isChecked()) {
            A4144 = "1";
        }
        if (rb_A4144_2.isChecked()) {
            A4144 = "2";
        }
        if (rb_A4144_DK.isChecked()) {
            A4144 = "9";
        }
        if (rb_A4144_RA.isChecked()) {
            A4144 = "8";
        }

        //A4145
        if (rb_A4145_1.isChecked()) {
            A4145 = "1";
        }
        if (rb_A4145_2.isChecked()) {
            A4145 = "2";
        }
        if (rb_A4145_DK.isChecked()) {
            A4145 = "9";
        }
        if (rb_A4145_RA.isChecked()) {
            A4145 = "8";
        }

        //A4146
        if (rb_A4146_1.isChecked()) {
            A4146 = "1";
        }
        if (rb_A4146_2.isChecked()) {
            A4146 = "2";
        }
        if (rb_A4146_DK.isChecked()) {
            A4146 = "9";
        }
        if (rb_A4146_RA.isChecked()) {
            A4146 = "8";
        }

        //A4147
        if (rb_A4147_1.isChecked()) {
            A4147 = "1";
        }
        if (rb_A4147_2.isChecked()) {
            A4147 = "2";
        }
        if (rb_A4147_DK.isChecked()) {
            A4147 = "9";
        }
        if (rb_A4147_RA.isChecked()) {
            A4147 = "8";
        }

        //A4148
        if (rb_A4148_1.isChecked()) {
            A4148 = "1";
        }
        if (rb_A4148_2.isChecked()) {
            A4148 = "2";
        }
        if (rb_A4148_3.isChecked()) {
            A4148 = "3";
        }
        if (rb_A4148_4.isChecked()) {
            A4148 = "4";
        }
        if (rb_A4148_5.isChecked()) {
            A4148 = "5";
        }
        if (rb_A4148_6.isChecked()) {
            A4148 = "6";
        }
        if (rb_A4148_7.isChecked()) {
            A4148 = "7";
        }
        if (rb_A4148_10.isChecked()) {
            A4148 = "10";
        }
        if (rb_A4148_DK.isChecked()) {
            A4148 = "9";
        }
        if (rb_A4148_RA.isChecked()) {
            A4148 = "8";
        }

        //A4149
        if (rb_A4149_1.isChecked()) {
            A4149 = "1";
        }
        if (rb_A4149_2.isChecked()) {
            A4149 = "2";
        }
        if (rb_A4149_DK.isChecked()) {
            A4149 = "9";
        }
        if (rb_A4149_RA.isChecked()) {
            A4149 = "8";
        }

        //A4150_u
        if (rb_A4150_u_1.isChecked()) {
            A4150_u = "1";
        }
        if (rb_A4150_u_2.isChecked()) {
            A4150_u = "2";
        }
        if (rb_A4150_u_DK.isChecked()) {
            A4150_u = "9";
        }
        if (rb_A4150_u_RA.isChecked()) {
            A4150_u = "8";
        }

        //A4150_a
        if (ed_A4150_a.getText().toString().trim().length() > 0) {
            A4150_a = ed_A4150_a.getText().toString().trim();
        }

        //A4150_b
        if (ed_A4150_b.getText().toString().trim().length() > 0) {
            A4150_b = ed_A4150_b.getText().toString().trim();
        }

        //A4151
        if (rb_A4151_1.isChecked()) {
            A4151 = "1";
        }
        if (rb_A4151_2.isChecked()) {
            A4151 = "2";
        }
        if (rb_A4151_3.isChecked()) {
            A4151 = "3";
        }

        //A4152
        if (rb_A4152_1.isChecked()) {
            A4152 = "1";
        }
        if (rb_A4152_2.isChecked()) {
            A4152 = "2";
        }
        if (rb_A4152_DK.isChecked()) {
            A4152 = "9";
        }
        if (rb_A4152_RA.isChecked()) {
            A4152 = "8";
        }

        //A4153
        if (rb_A4153_1.isChecked()) {
            A4153 = "1";
        }
        if (rb_A4153_2.isChecked()) {
            A4153 = "2";
        }
        if (rb_A4153_DK.isChecked()) {
            A4153 = "9";
        }
        if (rb_A4153_RA.isChecked()) {
            A4153 = "8";
        }

        //A4154
        if (rb_A4154_1.isChecked()) {
            A4154 = "1";
        }
        if (rb_A4154_2.isChecked()) {
            A4154 = "2";
        }
        if (rb_A4154_DK.isChecked()) {
            A4154 = "9";
        }
        if (rb_A4154_RA.isChecked()) {
            A4154 = "8";
        }

        //A4155
        if (rb_A4155_1.isChecked()) {
            A4155 = "1";
        }
        if (rb_A4155_2.isChecked()) {
            A4155 = "2";
        }
        if (rb_A4155_DK.isChecked()) {
            A4155 = "9";
        }
        if (rb_A4155_RA.isChecked()) {
            A4155 = "8";
        }

        //A4156
        if (rb_A4156_1.isChecked()) {
            A4156 = "1";
        }
        if (rb_A4156_2.isChecked()) {
            A4156 = "2";
        }
        if (rb_A4156_DK.isChecked()) {
            A4156 = "9";
        }
        if (rb_A4156_RA.isChecked()) {
            A4156 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4144_A4156("

                + Global.A.A4144_A4156.study_id + ","
                + Global.A.A4144_A4156.A4144 + ","
                + Global.A.A4144_A4156.A4145 + ","
                + Global.A.A4144_A4156.A4146 + ","
                + Global.A.A4144_A4156.A4147 + ","
                + Global.A.A4144_A4156.A4148 + ","
                + Global.A.A4144_A4156.A4149 + ","
                + Global.A.A4144_A4156.A4150_u + ","
                + Global.A.A4144_A4156.A4150_a + ","
                + Global.A.A4144_A4156.A4150_b + ","
                + Global.A.A4144_A4156.A4151 + ","
                + Global.A.A4144_A4156.A4152 + ","
                + Global.A.A4144_A4156.A4153 + ","
                + Global.A.A4144_A4156.A4154 + ","
                + Global.A.A4144_A4156.A4155 + ","
                + Global.A.A4144_A4156.A4156 + ","
                + Global.A.A4144_A4156.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4144        + "','" +
                A4145        + "','" +
                A4146        + "','" +
                A4147        + "','" +
                A4148        + "','" +
                A4149        + "','" +
                A4150_u      + "','" +
                A4150_a      + "','" +
                A4150_b      + "','" +
                A4151        + "','" +
                A4152        + "','" +
                A4153        + "','" +
                A4154        + "','" +
                A4155        + "','" +
                A4156        + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        Lm.database.execSQL(query);

        Toast.makeText(this, "8th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4144) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4145) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4146) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4147) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4148) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4149) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4150_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4150_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4150_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4151) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4152) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4153) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4154) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4155) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4156) == false) {
            return false;
        }

        return true;
    }
}

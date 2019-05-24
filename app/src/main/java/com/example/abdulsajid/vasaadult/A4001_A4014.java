package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4001A4014Binding;

import org.json.JSONException;

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4001_A4014 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //  Region_Declaration
    Button
            btn_next1;

    LinearLayout
            ll_A4001,
            ll_A4002,
            ll_A4003,
            ll_A4004,
            ll_A4005,
            ll_A4006,
            ll_A4007,
            ll_A4007_1,
            ll_A4008,
            ll_A4009a,
            ll_A4010,
            ll_A4011,
            ll_A4012,
            ll_A4013u,
            ll_A4013d,
            ll_A4013m,
            ll_A4013y,
            ll_A4014;

    RadioButton
            rb_A4002_1,
            rb_A4002_2,
            rb_A4002_3,
            rb_A4002_4,
            rb_A4002_5,
            rb_A4002_6,
            rb_A4002_DK,
            rb_A4002_RA,
            rb_A4003_1,
            rb_A4003_2,
            rb_A4003_DK,
            rb_A4003_RA,
            rb_A4004_1,
            rb_A4004_2,
            rb_A4004_3,
            rb_A4004_DK,
            rb_A4004_RA,
            rb_A4006_1,
            rb_A4006_2,
            rb_A4006_DK,
            rb_A4006_RA,
            rb_A4007_1,
            rb_A4007_2,
            rb_A4007_3,
            rb_A4007_4,
            rb_A4007_5,
            rb_A4007_6,
            rb_A4007_DK,
            rb_A4007_RA,
            rb_A4008_1,
            rb_A4008_2,
            rb_A4008_DK,
            rb_A4008_RA,
            rb_A4009a_1,
            rb_A4009a_2,
            rb_A4009a_DK,
            rb_A4009a_RA,
            rb_A4010_1,
            rb_A4010_2,
            rb_A4010_3,
            rb_A4010_4,
            rb_A4010_DK,
            rb_A4010_RA,
            rb_A4013u_1,
            rb_A4013u_2,
            rb_A4013u_3,
            rb_A4013u_DK,
            rb_A4013u_RA,
            rb_A4014_1,
            rb_A4014_2,
            rb_A4014_DK;

    EditText
            ed_A4001,
            ed_A4005,
            ed_A4007_1,
            ed_A4011,
            ed_A4012,
            ed_A4013d,
            ed_A4013m,
            ed_A4013y;

    String
            study_id,
            A4001,
            A4002,
            A4003,
            A4004,
            A4005,
            A4006,
            A4007,
            A4007_1,
            A4008,
            A4009a,
            A4010,
            A4011,
            A4012,
            A4013u,
            A4013d,
            A4013m,
            A4013y,
            A4014,
            STATUS;

    // End Region_Declaration
    A4001A4014Binding bind;
    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (ed_A4005.getText().hashCode() == s.hashCode()) {
                if (ed_A4005.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4005.getText().toString().trim()) > 7) {
                    ll_A4006.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_A4006);
                } else {
                    ll_A4006.setVisibility(View.VISIBLE);
                }
            }

            if (ed_A4011.getText().hashCode() == s.hashCode()) {
                if (ed_A4011.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4011.getText().toString().trim()) >= 1) {
                    ll_A4012.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_A4012);
                } else {
                    ll_A4012.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    void Initialization() {

        btn_next1 = findViewById(R.id.btnNext);

        ll_A4001 = findViewById(R.id.ll_A4001);
        ll_A4002 = findViewById(R.id.ll_A4002);
        ll_A4003 = findViewById(R.id.ll_A4003);
        ll_A4004 = findViewById(R.id.ll_A4004);
        ll_A4005 = findViewById(R.id.ll_A4005);
        ll_A4006 = findViewById(R.id.ll_A4006);
        ll_A4007 = findViewById(R.id.ll_A4007);
        ll_A4007_1 = findViewById(R.id.ll_A4007_1);
        ll_A4008 = findViewById(R.id.ll_A4008);
        ll_A4009a = findViewById(R.id.ll_A4009a);
        ll_A4010 = findViewById(R.id.ll_A4010);
        ll_A4011 = findViewById(R.id.ll_A4011);
        ll_A4012 = findViewById(R.id.ll_A4012);
        ll_A4013u = findViewById(R.id.ll_A4013u);
        ll_A4013d = findViewById(R.id.ll_A4013d);
        ll_A4013m = findViewById(R.id.ll_A4013m);
        ll_A4013y = findViewById(R.id.ll_A4013y);
        ll_A4014 = findViewById(R.id.ll_A4014);

        rb_A4002_1 = findViewById(R.id.rb_A4002_1);
        rb_A4002_2 = findViewById(R.id.rb_A4002_2);
        rb_A4002_3 = findViewById(R.id.rb_A4002_3);
        rb_A4002_4 = findViewById(R.id.rb_A4002_4);
        rb_A4002_5 = findViewById(R.id.rb_A4002_5);
        rb_A4002_6 = findViewById(R.id.rb_A4002_6);
        rb_A4002_DK = findViewById(R.id.rb_A4002_DK);
        rb_A4002_RA = findViewById(R.id.rb_A4002_RA);
        rb_A4003_1 = findViewById(R.id.rb_A4003_1);
        rb_A4003_2 = findViewById(R.id.rb_A4003_2);
        rb_A4003_DK = findViewById(R.id.rb_A4003_DK);
        rb_A4003_RA = findViewById(R.id.rb_A4003_RA);
        rb_A4004_1 = findViewById(R.id.rb_A4004_1);
        rb_A4004_2 = findViewById(R.id.rb_A4004_2);
        rb_A4004_3 = findViewById(R.id.rb_A4004_3);
        rb_A4004_DK = findViewById(R.id.rb_A4004_DK);
        rb_A4004_RA = findViewById(R.id.rb_A4004_RA);
        rb_A4006_1 = findViewById(R.id.rb_A4006_1);
        rb_A4006_2 = findViewById(R.id.rb_A4006_2);
        rb_A4006_DK = findViewById(R.id.rb_A4006_DK);
        rb_A4006_RA = findViewById(R.id.rb_A4006_RA);
        rb_A4007_1 = findViewById(R.id.rb_A4007_1);
        rb_A4007_2 = findViewById(R.id.rb_A4007_2);
        rb_A4007_3 = findViewById(R.id.rb_A4007_3);
        rb_A4007_4 = findViewById(R.id.rb_A4007_4);
        rb_A4007_5 = findViewById(R.id.rb_A4007_5);
        rb_A4007_6 = findViewById(R.id.rb_A4007_6);
        rb_A4007_DK = findViewById(R.id.rb_A4007_DK);
        rb_A4007_RA = findViewById(R.id.rb_A4007_RA);
        rb_A4008_1 = findViewById(R.id.rb_A4008_1);
        rb_A4008_2 = findViewById(R.id.rb_A4008_2);
        rb_A4008_DK = findViewById(R.id.rb_A4008_DK);
        rb_A4008_RA = findViewById(R.id.rb_A4008_RA);
        rb_A4009a_1 = findViewById(R.id.rb_A4009a_1);
        rb_A4009a_2 = findViewById(R.id.rb_A4009a_2);
        rb_A4009a_DK = findViewById(R.id.rb_A4009a_DK);
        rb_A4009a_RA = findViewById(R.id.rb_A4009a_RA);
        rb_A4010_1 = findViewById(R.id.rb_A4010_1);
        rb_A4010_2 = findViewById(R.id.rb_A4010_2);
        rb_A4010_3 = findViewById(R.id.rb_A4010_3);
        rb_A4010_4 = findViewById(R.id.rb_A4010_4);
        rb_A4010_DK = findViewById(R.id.rb_A4010_DK);
        rb_A4010_RA = findViewById(R.id.rb_A4010_RA);
        rb_A4013u_1 = findViewById(R.id.rb_A4013u_1);
        rb_A4013u_2 = findViewById(R.id.rb_A4013u_2);
        rb_A4013u_3 = findViewById(R.id.rb_A4013u_3);
        rb_A4013u_DK = findViewById(R.id.rb_A4013u_DK);
        rb_A4013u_RA = findViewById(R.id.rb_A4013u_RA);
        rb_A4014_1 = findViewById(R.id.rb_A4014_1);
        rb_A4014_2 = findViewById(R.id.rb_A4014_2);
        rb_A4014_DK = findViewById(R.id.rb_A4014_DK);

        ed_A4001 = findViewById(R.id.ed_A4001);
        ed_A4005 = findViewById(R.id.ed_A4005);
        ed_A4007_1 = findViewById(R.id.ed_A4007_1);
        ed_A4011 = findViewById(R.id.ed_A4011);
        ed_A4012 = findViewById(R.id.ed_A4012);
        ed_A4013d = findViewById(R.id.ed_A4013d);
        ed_A4013m = findViewById(R.id.ed_A4013m);
        ed_A4013y = findViewById(R.id.ed_A4013y);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4001__a4014);
        bind.setCallback(this);
        //this.setTitle("Quality of Care 06");
        events_call();
        Initialization();

    }

    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting 7th Section", Toast.LENGTH_SHORT).show();
                //MainApp.endActivity(this, this, A4001_A4014.class, true, HomeActivity.fc);

                Intent c2 = new Intent(A4001_A4014.this, com.example.abdulsajid.vasaadult.A4051_A4066.class);
                startActivity(c2);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this, EndingActivity.class, false, RSDInfoActivity.fc);

    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getId() == R.id.rb_A4003_1
                || compoundButton.getId() == R.id.rb_A4003_2
                || compoundButton.getId() == R.id.rb_A4003_DK
                || compoundButton.getId() == R.id.rb_A4003_RA) {
            if (rb_A4003_2.isChecked() || rb_A4003_DK.isChecked() || rb_A4003_RA.isChecked()) {
                ll_A4004.setVisibility(View.GONE);
                ll_A4005.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(ll_A4004);
                ClearAllcontrol.ClearAll(ll_A4005);
            } else {
                ll_A4004.setVisibility(View.VISIBLE);
                ll_A4005.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4004_1
                || compoundButton.getId() == R.id.rb_A4004_2
                || compoundButton.getId() == R.id.rb_A4004_3
                || compoundButton.getId() == R.id.rb_A4004_DK
                || compoundButton.getId() == R.id.rb_A4004_RA) {
            if (rb_A4004_DK.isChecked() || rb_A4004_RA.isChecked()) {
                ll_A4005.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(ll_A4005);
            } else {
                ll_A4005.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4007_1
                || compoundButton.getId() == R.id.rb_A4007_2
                || compoundButton.getId() == R.id.rb_A4007_3
                || compoundButton.getId() == R.id.rb_A4007_4
                || compoundButton.getId() == R.id.rb_A4007_5
                || compoundButton.getId() == R.id.rb_A4007_6
                || compoundButton.getId() == R.id.rb_A4007_DK
                || compoundButton.getId() == R.id.rb_A4007_RA) {
            if (rb_A4007_2.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4007_1);
                ll_A4007_1.setVisibility(View.GONE);
            } else {
                ll_A4007_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4009a_1
                || compoundButton.getId() == R.id.rb_A4009a_2
                || compoundButton.getId() == R.id.rb_A4009a_DK
                || compoundButton.getId() == R.id.rb_A4009a_RA) {
            if (rb_A4009a_2.isChecked() || rb_A4009a_DK.isChecked() || rb_A4009a_RA.isChecked()) {
                ll_A4010.setVisibility(View.GONE);
                ll_A4011.setVisibility(View.GONE);
                ll_A4012.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(ll_A4010);
                ClearAllcontrol.ClearAll(ll_A4011);
                ClearAllcontrol.ClearAll(ll_A4012);
            } else {
                ll_A4010.setVisibility(View.VISIBLE);
                ll_A4011.setVisibility(View.VISIBLE);
                ll_A4012.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4010_1
                || compoundButton.getId() == R.id.rb_A4010_2
                || compoundButton.getId() == R.id.rb_A4010_3
                || compoundButton.getId() == R.id.rb_A4010_4
                || compoundButton.getId() == R.id.rb_A4010_DK
                || compoundButton.getId() == R.id.rb_A4010_RA) {
            if (rb_A4010_2.isChecked() || rb_A4010_3.isChecked() || rb_A4010_4.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4011);

                ll_A4011.setVisibility(View.GONE);
            } else if (rb_A4010_DK.isChecked() || rb_A4010_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4011);
                ClearAllcontrol.ClearAll(ll_A4012);

                ll_A4011.setVisibility(View.GONE);
                ll_A4012.setVisibility(View.GONE);
            } else {
                ll_A4011.setVisibility(View.VISIBLE);
                ll_A4012.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4013u_1
                || compoundButton.getId() == R.id.rb_A4013u_2
                || compoundButton.getId() == R.id.rb_A4013u_3
                || compoundButton.getId() == R.id.rb_A4013u_DK
                || compoundButton.getId() == R.id.rb_A4013u_RA)


            ClearAllcontrol.ClearAll(ll_A4013d);
        ClearAllcontrol.ClearAll(ll_A4013m);
        ClearAllcontrol.ClearAll(ll_A4013y);

        ll_A4013d.setVisibility(View.GONE);
        ll_A4013m.setVisibility(View.GONE);
        ll_A4013y.setVisibility(View.GONE);
        {
            if (rb_A4013u_1.isChecked()) {
                ll_A4013d.setVisibility(View.VISIBLE);
            } else if (rb_A4013u_2.isChecked()) {
                ll_A4013m.setVisibility(View.VISIBLE);
            } else if (rb_A4013u_3.isChecked()) {
                ll_A4013y.setVisibility(View.VISIBLE);
            }
        }
    }

    void events_call() {

        btn_next1.setOnClickListener(this);

        rb_A4003_1.setOnCheckedChangeListener(this);
        rb_A4003_2.setOnCheckedChangeListener(this);
        rb_A4003_DK.setOnCheckedChangeListener(this);
        rb_A4003_RA.setOnCheckedChangeListener(this);

        rb_A4004_1.setOnCheckedChangeListener(this);
        rb_A4004_2.setOnCheckedChangeListener(this);
        rb_A4004_3.setOnCheckedChangeListener(this);
        rb_A4004_DK.setOnCheckedChangeListener(this);
        rb_A4004_RA.setOnCheckedChangeListener(this);

        rb_A4007_1.setOnCheckedChangeListener(this);
        rb_A4007_2.setOnCheckedChangeListener(this);
        rb_A4007_3.setOnCheckedChangeListener(this);
        rb_A4007_4.setOnCheckedChangeListener(this);
        rb_A4007_5.setOnCheckedChangeListener(this);
        rb_A4007_6.setOnCheckedChangeListener(this);
        rb_A4007_DK.setOnCheckedChangeListener(this);
        rb_A4007_RA.setOnCheckedChangeListener(this);

        rb_A4009a_1.setOnCheckedChangeListener(this);
        rb_A4009a_2.setOnCheckedChangeListener(this);
        rb_A4009a_DK.setOnCheckedChangeListener(this);
        rb_A4009a_RA.setOnCheckedChangeListener(this);

        rb_A4010_1.setOnCheckedChangeListener(this);
        rb_A4010_2.setOnCheckedChangeListener(this);
        rb_A4010_3.setOnCheckedChangeListener(this);
        rb_A4010_4.setOnCheckedChangeListener(this);
        rb_A4010_DK.setOnCheckedChangeListener(this);
        rb_A4010_RA.setOnCheckedChangeListener(this);

        rb_A4013u_1.setOnCheckedChangeListener(this);
        rb_A4013u_2.setOnCheckedChangeListener(this);
        rb_A4013u_3.setOnCheckedChangeListener(this);
        rb_A4013u_DK.setOnCheckedChangeListener(this);
        rb_A4013u_RA.setOnCheckedChangeListener(this);

        ed_A4005.addTextChangedListener(generalTextWatcher);
        ed_A4011.addTextChangedListener(generalTextWatcher);

    }

    void value_assignment() {

        study_id = "0";
        A4001 = "000";
        A4002 = "000";
        A4003 = "000";
        A4004 = "000";
        A4005 = "000";
        A4006 = "000";
        A4007 = "000";
        A4007_1 = "000";
        A4008 = "000";
        A4009a = "000";
        A4010 = "000";
        A4011 = "000";
        A4012 = "000";
        A4013u = "000";
        A4013d = "000";
        A4013m = "000";
        A4013y = "000";
        A4014 = "000";
        STATUS = "0";


        //A4001
        if (ed_A4001.getText().toString().trim().length() > 0) {
            A4001 = ed_A4001.getText().toString().trim();
        }

        //A4002
        if (rb_A4002_1.isChecked()) {
            A4002 = "1";
        }
        if (rb_A4002_2.isChecked()) {
            A4002 = "2";
        }
        if (rb_A4002_3.isChecked()) {
            A4002 = "3";
        }
        if (rb_A4002_4.isChecked()) {
            A4002 = "4";
        }
        if (rb_A4002_5.isChecked()) {
            A4002 = "5";
        }
        if (rb_A4002_6.isChecked()) {
            A4002 = "6";
        }
        if (rb_A4002_DK.isChecked()) {
            A4002 = "9";
        }
        if (rb_A4002_RA.isChecked()) {
            A4002 = "8";
        }

        //A4003
        if (rb_A4003_1.isChecked()) {
            A4003 = "1";
        }
        if (rb_A4003_2.isChecked()) {
            A4003 = "2";
        }
        if (rb_A4003_DK.isChecked()) {
            A4003 = "9";
        }
        if (rb_A4003_RA.isChecked()) {
            A4003 = "8";
        }

        //A4004
        if (rb_A4004_1.isChecked()) {
            A4004 = "1";
        }
        if (rb_A4004_2.isChecked()) {
            A4004 = "2";
        }
        if (rb_A4004_3.isChecked()) {
            A4004 = "3";
        }
        if (rb_A4004_DK.isChecked()) {
            A4004 = "9";
        }
        if (rb_A4004_RA.isChecked()) {
            A4004 = "8";
        }

        //A4005
        if (ed_A4005.getText().toString().trim().length() > 0) {
            A4005 = ed_A4005.getText().toString().trim();
        }

        //A4006
        if (rb_A4006_1.isChecked()) {
            A4006 = "1";
        }
        if (rb_A4006_2.isChecked()) {
            A4006 = "2";
        }
        if (rb_A4006_DK.isChecked()) {
            A4006 = "9";
        }
        if (rb_A4006_RA.isChecked()) {
            A4006 = "8";
        }

        //A4007
        if (rb_A4007_1.isChecked()) {
            A4007 = "1";
        }
        if (rb_A4007_2.isChecked()) {
            A4007 = "2";
        }
        if (rb_A4007_3.isChecked()) {
            A4007 = "3";
        }
        if (rb_A4007_4.isChecked()) {
            A4007 = "4";
        }
        if (rb_A4007_5.isChecked()) {
            A4007 = "5";
        }
        if (rb_A4007_6.isChecked()) {
            A4007 = "6";
        }
        if (rb_A4007_DK.isChecked()) {
            A4007 = "9";
        }
        if (rb_A4007_RA.isChecked()) {
            A4007 = "8";
        }

        //A4007_1
        if (ed_A4007_1.getText().toString().trim().length() > 0) {
            A4007_1 = ed_A4007_1.getText().toString().trim();
        }

        //A4008
        if (rb_A4008_1.isChecked()) {
            A4008 = "1";
        }
        if (rb_A4008_2.isChecked()) {
            A4008 = "2";
        }
        if (rb_A4008_DK.isChecked()) {
            A4008 = "9";
        }
        if (rb_A4008_RA.isChecked()) {
            A4008 = "8";
        }

        //A4009a
        if (rb_A4009a_1.isChecked()) {
            A4009a = "1";
        }
        if (rb_A4009a_2.isChecked()) {
            A4009a = "2";
        }
        if (rb_A4009a_DK.isChecked()) {
            A4009a = "9";
        }
        if (rb_A4009a_RA.isChecked()) {
            A4009a = "8";
        }

        //A4010
        if (rb_A4010_1.isChecked()) {
            A4010 = "1";
        }
        if (rb_A4010_2.isChecked()) {
            A4010 = "2";
        }
        if (rb_A4010_3.isChecked()) {
            A4010 = "3";
        }
        if (rb_A4010_4.isChecked()) {
            A4010 = "4";
        }
        if (rb_A4010_DK.isChecked()) {
            A4010 = "9";
        }
        if (rb_A4010_RA.isChecked()) {
            A4010 = "8";
        }

        //A4011
        if (ed_A4011.getText().toString().trim().length() > 0) {
            A4011 = ed_A4011.getText().toString().trim();
        }

        //A4012
        if (ed_A4012.getText().toString().trim().length() > 0) {
            A4012 = ed_A4012.getText().toString().trim();
        }

        //A4013u
        if (rb_A4013u_1.isChecked()) {
            A4013u = "1";
        }
        if (rb_A4013u_2.isChecked()) {
            A4013u = "2";
        }
        if (rb_A4013u_3.isChecked()) {
            A4013u = "3";
        }
        if (rb_A4013u_DK.isChecked()) {
            A4013u = "9";
        }
        if (rb_A4013u_RA.isChecked()) {
            A4013u = "8";
        }

        //A4013d
        if (ed_A4013d.getText().toString().trim().length() > 0) {
            A4013d = ed_A4013d.getText().toString().trim();
        }

        //A4013m
        if (ed_A4013m.getText().toString().trim().length() > 0) {
            A4013m = ed_A4013m.getText().toString().trim();
        }

        //A4013y
        if (ed_A4013y.getText().toString().trim().length() > 0) {
            A4013y = ed_A4013y.getText().toString().trim();
        }

        //A4014
        if (rb_A4014_1.isChecked()) {
            A4014 = "1";
        }
        if (rb_A4014_2.isChecked()) {
            A4014 = "2";
        }
        if (rb_A4014_DK.isChecked()) {
            A4014 = "9";
        }
    }

    void insert_data() {

        String query = "insert into A4001_A4014("

                + Global.A.A4001_A4014.study_id + ","
                + Global.A.A4001_A4014.A4001 + ","
                + Global.A.A4001_A4014.A4002 + ","
                + Global.A.A4001_A4014.A4003 + ","
                + Global.A.A4001_A4014.A4004 + ","
                + Global.A.A4001_A4014.A4005 + ","
                + Global.A.A4001_A4014.A4006 + ","
                + Global.A.A4001_A4014.A4007 + ","
                + Global.A.A4001_A4014.A4007_1 + ","
                + Global.A.A4001_A4014.A4008 + ","
                + Global.A.A4001_A4014.A4009a + ","
                + Global.A.A4001_A4014.A4010 + ","
                + Global.A.A4001_A4014.A4011 + ","
                + Global.A.A4001_A4014.A4012 + ","
                + Global.A.A4001_A4014.A4013u + ","
                + Global.A.A4001_A4014.A4013d + ","
                + Global.A.A4001_A4014.A4013m + ","
                + Global.A.A4001_A4014.A4013y + ","
                + Global.A.A4001_A4014.A4014 + ","
                + Global.A.A4001_A4014.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4001 + "','" +
                A4002 + "','" +
                A4003 + "','" +
                A4004 + "','" +
                A4005 + "','" +
                A4006 + "','" +
                A4007 + "','" +
                A4007_1 + "','" +
                A4008 + "','" +
                A4009a + "','" +
                A4010 + "','" +
                A4011 + "','" +
                A4012 + "','" +
                A4013u + "','" +
                A4013d + "','" +
                A4013m + "','" +
                A4013y + "','" +
                A4014 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "1st TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_A4001) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4002) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4003) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4004) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4005) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4006) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4007) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4007_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4008) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4009a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4010) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4011) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4012) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4013y) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4014) != false;
    }

}



package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4051Binding;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4051 extends AppCompatActivity {

    A4051Binding bind;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4051);
        bind.setCallback(this);
        //this.setTitle("Quality of Care 06");
        setupViews();
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
                //MainApp.endActivity(this, this, A4001.class, true, HomeActivity.fc);

                Intent c2 = new Intent(A4051.this, A4067.class);
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

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4051", bind.A4051a.isChecked() ? "1"
                : bind.A4051b.isChecked() ? "2"
                : bind.A405198.isChecked() ? "98"
                : bind.A405199.isChecked() ? "99"
                : "0");

        json.put("A4052u", bind.A4052ua.isChecked() ? "1"
                : bind.A4052ub.isChecked() ? "2"
                : bind.A4052u98.isChecked() ? "98"
                : bind.A4052u99.isChecked() ? "99"
                : "0");

        json.put("A4052D", bind.A4052D.getText().toString().trim().length() > 0 ? bind.A4052D.getText().toString() : "0");

        json.put("A4052M", bind.A4052M.getText().toString().trim().length() > 0 ? bind.A4052M.getText().toString() : "0");

        json.put("A4053", bind.A4053a.isChecked() ? "1"
                : bind.A4053b.isChecked() ? "2"
                : bind.A405398.isChecked() ? "98"
                : bind.A405399.isChecked() ? "99"
                : "0");

        json.put("A4054", bind.A4054a.isChecked() ? "1"
                : bind.A4054b.isChecked() ? "2"
                : bind.A4054c.isChecked() ? "3"
                : bind.A405498.isChecked() ? "98"
                : bind.A405499.isChecked() ? "99"
                : "0");


        json.put("A4006", bind.A4006a.isChecked() ? "1"
                : bind.A4006b.isChecked() ? "2"
                : bind.A400698.isChecked() ? "98"
                : bind.A400699.isChecked() ? "99"
                : "0");

        json.put("A4007", bind.A4007a.isChecked() ? "1"
                : bind.A4007b.isChecked() ? "2"
                : bind.A4007c.isChecked() ? "3"
                : bind.A4007d.isChecked() ? "4"
                : bind.A4007e.isChecked() ? "5"
                : bind.A4007f.isChecked() ? "6"
                : bind.A400798.isChecked() ? "98"
                : bind.A400799.isChecked() ? "99"
                : "0");

        json.put("A40071", bind.A40071.getText().toString().trim().length() > 0 ? bind.A40071.getText().toString() : "0");

        json.put("A4008", bind.A4008a.isChecked() ? "1"
                : bind.A4008b.isChecked() ? "2"
                : bind.A400898.isChecked() ? "98"
                : bind.A400899.isChecked() ? "99"
                : "0");

        json.put("A4009a", bind.A4009aa.isChecked() ? "1"
                : bind.A4009ab.isChecked() ? "2"
                : bind.A4009a98.isChecked() ? "98"
                : bind.A4009a99.isChecked() ? "99"
                : "0");

        json.put("A4010", bind.A4010a.isChecked() ? "1"
                : bind.A4010b.isChecked() ? "2"
                : bind.A4010c.isChecked() ? "3"
                : bind.A4010d.isChecked() ? "4"
                : bind.A401098.isChecked() ? "98"
                : bind.A401099.isChecked() ? "99"
                : "0");

        json.put("A4011", bind.A4011.getText().toString().trim().length() > 0 ? bind.A4011.getText().toString() : "0");

        json.put("A4012", bind.A4012.getText().toString().trim().length() > 0 ? bind.A4012.getText().toString() : "0");

        json.put("A4013u", bind.A4013ua.isChecked() ? "1"
                : bind.A4013ub.isChecked() ? "2"
                : bind.A4013uc.isChecked() ? "3"
                : bind.A4013u98.isChecked() ? "98"
                : bind.A4013u99.isChecked() ? "99"
                : "0");

        json.put("A4013d", bind.A4013d.getText().toString().trim().length() > 0 ? bind.A4013d.getText().toString() : "0");

        json.put("A4013m", bind.A4013m.getText().toString().trim().length() > 0 ? bind.A4013m.getText().toString() : "0");

        json.put("A4013y", bind.A4013y.getText().toString().trim().length() > 0 ? bind.A4013y.getText().toString() : "0");

        json.put("A4014", bind.A4014a.isChecked() ? "1"
                : bind.A4014b.isChecked() ? "2"
                : bind.A401498.isChecked() ? "98"
                : "0");

        fc.setSqoc6(String.valueOf(json));

    }

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4001A4014) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4001A4014) != false;
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

        LocalDataManager.database.execSQL(query);

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

        return Gothrough.IamHiden(ll_A4066) != false;
    }
}

package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4001a4014Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4001_A4014 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    A4001a4014Binding bi;

    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bi.A4005.getText().hashCode() == s.hashCode()) {
                if (bi.A4005.getText().toString().trim().length() > 0 && Integer.parseInt(bi.A4005.getText().toString().trim()) > 7) {
                    ll_A4006.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_A4006);
                } else {
                    ll_A4006.setVisibility(View.VISIBLE);
                }
            }

            if (bi.A4011.getText().hashCode() == s.hashCode()) {
                if (bi.A4011.getText().toString().trim().length() > 0 && Integer.parseInt(bi.A4011.getText().toString().trim()) >= 1) {
                    ll_A4012.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_A4012);
                } else {
                    ll_A4012.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4001a4014);
        bi.setCallback(this);
        //this.setTitle("Quality of Care 06");


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

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4001", bi.A4001.getText().toString().trim().length() > 0 ? bi.A4001.getText().toString() : "0");

        json.put("A4002", bi.A4002a.isChecked() ? "1"
                : bi.A4002b.isChecked() ? "2"
                : bi.A4002c.isChecked() ? "3"
                : bi.A4002d.isChecked() ? "4"
                : bi.A4002e.isChecked() ? "5"
                : bi.A4002f.isChecked() ? "6"
                : bi.A40029.isChecked() ? "99"
                : bi.A40028.isChecked() ? "88"
                : "0");

        json.put("A4003", bi.A4003a.isChecked() ? "1"
                : bi.A4003b.isChecked() ? "2"
                : bi.A40039.isChecked() ? "99"
                : bi.A40038.isChecked() ? "88"
                : "0");

        json.put("A4004", bi.A4004a.isChecked() ? "1"
                : bi.A4004b.isChecked() ? "2"
                : bi.A4004c.isChecked() ? "3"
                : bi.A40049.isChecked() ? "99"
                : bi.A40048.isChecked() ? "88"
                : "0");

        json.put("A4005", bi.A4005.getText().toString().trim().length() > 0 ? bi.A4005.getText().toString() : "0");

        json.put("A4006", bi.A4006a.isChecked() ? "1"
                : bi.A4006b.isChecked() ? "2"
                : bi.A40069.isChecked() ? "99"
                : bi.A40068.isChecked() ? "88"
                : "0");

        json.put("A4007", bi.A4007a.isChecked() ? "1"
                : bi.A4007b.isChecked() ? "2"
                : bi.A4007c.isChecked() ? "3"
                : bi.A4007d.isChecked() ? "4"
                : bi.A4007e.isChecked() ? "5"
                : bi.A4007f.isChecked() ? "6"
                : bi.A40079.isChecked() ? "99"
                : bi.A40078.isChecked() ? "88"
                : "0");

        json.put("A40071", bi.A40071.getText().toString().trim().length() > 0 ? bi.A40071.getText().toString() : "0");

        json.put("A4008", bi.A4008a.isChecked() ? "1"
                : bi.A4008b.isChecked() ? "2"
                : bi.A40089.isChecked() ? "99"
                : bi.A40088.isChecked() ? "88"
                : "0");

        json.put("A4009a", bi.A4009aa.isChecked() ? "1"
                : bi.A4009ab.isChecked() ? "2"
                : bi.A4009a9.isChecked() ? "99"
                : bi.A4009a8.isChecked() ? "88"
                : "0");

        json.put("A4010", bi.A4010a.isChecked() ? "1"
                : bi.A4010b.isChecked() ? "2"
                : bi.A4010c.isChecked() ? "3"
                : bi.A4010d.isChecked() ? "4"
                : bi.A40109.isChecked() ? "99"
                : bi.A40108.isChecked() ? "88"
                : "0");

        json.put("A4011", bi.A4011.getText().toString().trim().length() > 0 ? bi.A4011.getText().toString() : "0");

        json.put("A4012", bi.A4012.getText().toString().trim().length() > 0 ? bi.A4012.getText().toString() : "0");

        json.put("A4013u", bi.A4013ua.isChecked() ? "1"
                : bi.A4013ub.isChecked() ? "2"
                : bi.A4013uc.isChecked() ? "3"
                : bi.A4013u9.isChecked() ? "99"
                : bi.A4013u8.isChecked() ? "88"
                : "0");

        json.put("A4013d", bi.A4013d.getText().toString().trim().length() > 0 ? bi.A4013d.getText().toString() : "0");

        json.put("A4013m", bi.A4013m.getText().toString().trim().length() > 0 ? bi.A4013m.getText().toString() : "0");

        json.put("A4013y", bi.A4013y.getText().toString().trim().length() > 0 ? bi.A4013y.getText().toString() : "0");

        json.put("A4014", bi.A4014a.isChecked() ? "1"
                : bi.A4014b.isChecked() ? "2"
                : bi.A40149.isChecked() ? "99"
                : "0");

        fc.setSqoc6(String.valueOf(json));

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

    @Override
    public void onClick(View view) {

    }
}



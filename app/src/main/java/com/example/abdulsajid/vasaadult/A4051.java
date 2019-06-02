package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4051Binding;

import org.json.JSONException;
import org.json.JSONObject;

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


        json.put("A4055", bind.A4055a.isChecked() ? "1"
                : bind.A4055b.isChecked() ? "2"
                : bind.A4055c.isChecked() ? "3"
                : bind.A405598.isChecked() ? "98"
                : bind.A405599.isChecked() ? "99"
                : "0");


        json.put("A4056", bind.A4056a.isChecked() ? "1"
                : bind.A4056b.isChecked() ? "2"
                : bind.A405698.isChecked() ? "98"
                : bind.A405699.isChecked() ? "99"
                : "0");


        json.put("A4057", bind.A4057a.isChecked() ? "1"
                : bind.A4057b.isChecked() ? "2"
                : bind.A405798.isChecked() ? "98"
                : bind.A405799.isChecked() ? "99"
                : "0");


        json.put("A4058", bind.A4058a.isChecked() ? "1"
                : bind.A4058b.isChecked() ? "2"
                : bind.A405898.isChecked() ? "98"
                : bind.A405899.isChecked() ? "99"
                : "0");


        json.put("A4059u", bind.A4059ua.isChecked() ? "1"
                : bind.A4059ub.isChecked() ? "2"
                : bind.A4059u98.isChecked() ? "98"
                : bind.A4059u99.isChecked() ? "99"
                : "0");

        json.put("A4059D", bind.A4059D.getText().toString().trim().length() > 0 ? bind.A4059D.getText().toString() : "0");

        json.put("A4059M", bind.A4059M.getText().toString().trim().length() > 0 ? bind.A4059M.getText().toString() : "0");


        json.put("A4060", bind.A4060a.isChecked() ? "1"
                : bind.A4060b.isChecked() ? "2"
                : bind.A406098.isChecked() ? "98"
                : bind.A406099.isChecked() ? "99"
                : "0");


        json.put("A4061", bind.A4061a.isChecked() ? "1"
                : bind.A4061b.isChecked() ? "2"
                : bind.A406198.isChecked() ? "98"
                : bind.A406199.isChecked() ? "99"
                : "0");


        json.put("A4062", bind.A4062a.isChecked() ? "1"
                : bind.A4062b.isChecked() ? "2"
                : bind.A406298.isChecked() ? "98"
                : bind.A406299.isChecked() ? "99"
                : "0");


        json.put("A4063", bind.A4063a.isChecked() ? "1"
                : bind.A4063b.isChecked() ? "2"
                : bind.A406398.isChecked() ? "98"
                : bind.A406399.isChecked() ? "99"
                : "0");


        json.put("A4064u", bind.A4064ua.isChecked() ? "1"
                : bind.A4064ub.isChecked() ? "2"
                : bind.A4064u98.isChecked() ? "98"
                : bind.A4064u99.isChecked() ? "99"
                : "0");

        json.put("A4064D", bind.A4064D.getText().toString().trim().length() > 0 ? bind.A4064D.getText().toString() : "0");

        json.put("A4064M", bind.A4064M.getText().toString().trim().length() > 0 ? bind.A4064M.getText().toString() : "0");


        json.put("A40641", bind.A40641a.isChecked() ? "1"
                : bind.A40641b.isChecked() ? "2"
                : bind.A4064198.isChecked() ? "98"
                : bind.A4064199.isChecked() ? "99"
                : "0");


        json.put("A4065", bind.A4065a.isChecked() ? "1"
                : bind.A4065b.isChecked() ? "2"
                : bind.A406598.isChecked() ? "98"
                : bind.A406599.isChecked() ? "99"
                : "0");


        json.put("A4066", bind.A4066a.isChecked() ? "1"
                : bind.A4066b.isChecked() ? "2"
                : bind.A406698.isChecked() ? "98"
                : bind.A406699.isChecked() ? "99"
                : "0");
        

        fc.setSqoc6(String.valueOf(json));

    }

    private void setupViews() {

        bind.A4051.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4051a.getId()) {
                    bind.A4052ucv.setVisibility(View.VISIBLE);
                    bind.A4052Dcv.setVisibility(View.VISIBLE);
                    bind.A4052Mcv.setVisibility(View.VISIBLE);
                    bind.A4053cv.setVisibility(View.VISIBLE);
                    bind.A4054cv.setVisibility(View.VISIBLE);
                    bind.A4055cv.setVisibility(View.VISIBLE);
                    bind.A4056cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4052ucv);
                    ClearAllcontrol.ClearAllC(bind.A4052Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4052Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4053cv);
                    ClearAllcontrol.ClearAllC(bind.A4054cv);
                    ClearAllcontrol.ClearAllC(bind.A4055cv);
                    ClearAllcontrol.ClearAllC(bind.A4056cv);
                    bind.A4052ucv.setVisibility(View.GONE);
                    bind.A4052Dcv.setVisibility(View.GONE);
                    bind.A4052Mcv.setVisibility(View.GONE);
                    bind.A4053cv.setVisibility(View.GONE);
                    bind.A4054cv.setVisibility(View.GONE);
                    bind.A4055cv.setVisibility(View.GONE);
                    bind.A4056cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4052u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4052Dcv);
                ClearAllcontrol.ClearAllC(bind.A4052Mcv);

                bind.A4052Dcv.setVisibility(View.GONE);
                bind.A4052Mcv.setVisibility(View.GONE);

                {
                    if (checkedId == bind.A4052ua.getId()) {
                        bind.A4052Dcv.setVisibility(View.VISIBLE);
                    } else if (checkedId == bind.A4052ub.getId()) {
                        bind.A4052Mcv.setVisibility(View.VISIBLE);
                    }
                }

            }

        });


        /*bind.A4007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4007b.getId()) {
                    bind.A40071cv.setVisibility(View.VISIBLE);
                } else {
                    bind.A40071cv.setVisibility(View.GONE);
                }

            }

        });*/


        bind.A4009a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A4009aa.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    ClearAllcontrol.ClearAllC(bind.A4010cv);
                    bind.A4010cv.setVisibility(View.GONE);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.GONE);
                } else {
                    bind.A4010cv.setVisibility(View.VISIBLE);
                    bind.A4011cv.setVisibility(View.VISIBLE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                }

            }

        });

        bind.A4010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4010b.getId() || checkedId == bind.A4010c.getId() || checkedId == bind.A4010d.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4011cv);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A401098.getId() || checkedId == bind.A401099.getId()) {
                    ClearAllcontrol.ClearAllC(bind.A4011cv);
                    ClearAllcontrol.ClearAllC(bind.A4012cv);
                    bind.A4011cv.setVisibility(View.GONE);
                    bind.A4012cv.setVisibility(View.GONE);
                } else {
                    bind.A4011cv.setVisibility(View.VISIBLE);
                    bind.A4012cv.setVisibility(View.VISIBLE);
                }

            }

        });

        bind.A4013u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4013dcv);
                ClearAllcontrol.ClearAllC(bind.A4013mcv);
                ClearAllcontrol.ClearAllC(bind.A4013ycv);

                bind.A4013dcv.setVisibility(View.GONE);
                bind.A4013mcv.setVisibility(View.GONE);
                bind.A4013ycv.setVisibility(View.GONE);

                if (checkedId == bind.A4013ua.getId()) {
                    bind.A4013dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4013ub.getId()) {
                    bind.A4013mcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4013uc.getId()) {
                    bind.A4013ycv.setVisibility(View.VISIBLE);
                }

            }

        });

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
                || compoundButton.getId() == R.id.rb_A4058_RA) {
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
                || compoundButton.getId() == R.id.rb_A4060_RA) {
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
                || compoundButton.getId() == R.id.rb_A4062_RA) {
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

    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4051) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4051) != false;
    }
}

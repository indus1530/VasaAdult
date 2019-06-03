package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4067Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4067 extends AppCompatActivity {
    A4067Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4067);
        bind = DataBindingUtil.setContentView(this, R.layout.a4001);
        bind.setCallback(this);
        //this.setTitle("Quality of Care 06");
        setupSkips();

    }


    private void setupSkips() {

        bind.A4067.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4067a.getId()) {
                    bind.A4068cv.setVisibility(View.VISIBLE);
                    bind.A4069ucv.setVisibility(View.VISIBLE);
                    bind.A4069Hcv.setVisibility(View.VISIBLE);
                    bind.A4069Dcv.setVisibility(View.VISIBLE);
                    bind.A4069Mcv.setVisibility(View.VISIBLE);
                    bind.A4070cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4068cv);
                    ClearAllcontrol.ClearAllC(bind.A4069ucv);
                    ClearAllcontrol.ClearAllC(bind.A4069Hcv);
                    ClearAllcontrol.ClearAllC(bind.A4069Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4069Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4070cv);
                    bind.A4068cv.setVisibility(View.GONE);
                    bind.A4069ucv.setVisibility(View.GONE);
                    bind.A4069Hcv.setVisibility(View.GONE);
                    bind.A4069Dcv.setVisibility(View.GONE);
                    bind.A4069Mcv.setVisibility(View.GONE);
                    bind.A4070cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4069u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4069Hcv);
                ClearAllcontrol.ClearAllC(bind.A4069Dcv);
                ClearAllcontrol.ClearAllC(bind.A4069Mcv);

                bind.A4069Hcv.setVisibility(View.GONE);
                bind.A4069Dcv.setVisibility(View.GONE);
                bind.A4069Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4069ua.getId()) {
                    bind.A4069Hcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4069ub.getId()) {
                    bind.A4069Dcv.setVisibility(View.VISIBLE);

                } else if (checkedId == bind.A4069uc.getId()) {
                    bind.A4069Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4071.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4071a.getId()) {
                    bind.A4072ucv.setVisibility(View.VISIBLE);
                    bind.A4072Dcv.setVisibility(View.VISIBLE);
                    bind.A4072Mcv.setVisibility(View.VISIBLE);
                    bind.A4073cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4072ucv);
                    ClearAllcontrol.ClearAllC(bind.A4072Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4072Mcv);
                    ClearAllcontrol.ClearAllC(bind.A4073cv);
                    bind.A4072ucv.setVisibility(View.GONE);
                    bind.A4072Dcv.setVisibility(View.GONE);
                    bind.A4072Mcv.setVisibility(View.GONE);
                    bind.A4073cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4072u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4072Dcv);
                ClearAllcontrol.ClearAllC(bind.A4072Mcv);
                bind.A4072Dcv.setVisibility(View.GONE);
                bind.A4072Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4072ua.getId()) {
                    bind.A4072Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4072ub.getId()) {
                    bind.A4072Mcv.setVisibility(View.VISIBLE);
                }

            }

        });


        bind.A4074.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4074a.getId()) {
                    bind.A4075ucv.setVisibility(View.VISIBLE);
                    bind.A4075Dcv.setVisibility(View.VISIBLE);
                    bind.A4075Mcv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4075ucv);
                    ClearAllcontrol.ClearAllC(bind.A4075Dcv);
                    ClearAllcontrol.ClearAllC(bind.A4075Mcv);

                    bind.A4075ucv.setVisibility(View.GONE);
                    bind.A4075Dcv.setVisibility(View.GONE);
                    bind.A4075Mcv.setVisibility(View.GONE);
                }

            }

        });

        bind.A4075u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bind.A4075Dcv);
                ClearAllcontrol.ClearAllC(bind.A4075Mcv);
                bind.A4075Dcv.setVisibility(View.GONE);
                bind.A4075Mcv.setVisibility(View.GONE);

                if (checkedId == bind.A4075ua.getId()) {
                    bind.A4075Dcv.setVisibility(View.VISIBLE);
                } else if (checkedId == bind.A4075ub.getId()) {
                    bind.A4075Mcv.setVisibility(View.VISIBLE);
                }

            }

        });

        if (compoundButton.getId() == R.id.rb_A4076_1
                || compoundButton.getId() == R.id.rb_A4076_2
                || compoundButton.getId() == R.id.rb_A4076_DK
                || compoundButton.getId() == R.id.rb_A4076_RA) {
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

                Intent c2 = new Intent(A4001.this, A4051.class);
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

        json.put("A4001", bind.A4001.getText().toString().trim().length() > 0 ? bind.A4001.getText().toString() : "0");

        json.put("A4002", bind.A4002a.isChecked() ? "1"
                : bind.A4002b.isChecked() ? "2"
                : bind.A4002c.isChecked() ? "3"
                : bind.A4002d.isChecked() ? "4"
                : bind.A4002e.isChecked() ? "5"
                : bind.A4002f.isChecked() ? "6"
                : bind.A400298.isChecked() ? "98"
                : bind.A400299.isChecked() ? "99"
                : "0");

        json.put("A4003", bind.A4003a.isChecked() ? "1"
                : bind.A4003b.isChecked() ? "2"
                : bind.A400398.isChecked() ? "98"
                : bind.A400399.isChecked() ? "99"
                : "0");

        json.put("A4004", bind.A4004a.isChecked() ? "1"
                : bind.A4004b.isChecked() ? "2"
                : bind.A4004c.isChecked() ? "3"
                : bind.A400498.isChecked() ? "98"
                : bind.A400499.isChecked() ? "99"
                : "0");

        json.put("A4005", bind.A4005.getText().toString().trim().length() > 0 ? bind.A4005.getText().toString() : "0");

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
        if (Gothrough.IamHiden(bind.llA4067) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4067) != false;
    }

}
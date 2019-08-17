package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4301Binding;

import org.json.JSONException;
import org.json.JSONObject;

import utils.ClearAllcontrol;

public class A4301 extends AppCompatActivity {
    A4301Binding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.a4301);
        bind.setCallback(this);
        //this.setTitle("A4301");
        setupSkips();

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4301.this, A4351.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        Intent i = new Intent(A4301.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("A4301", bind.A4301a.isChecked() ? "1"
                : bind.A4301b.isChecked() ? "2"
                : bind.A430198.isChecked() ? "98"
                : bind.A430199.isChecked() ? "99"
                : "0");

        json.put("A43021", bind.A43021a.isChecked() ? "1"
                : bind.A43021b.isChecked() ? "2"
                : bind.A4302198.isChecked() ? "98"
                : bind.A4302199.isChecked() ? "99"
                : "0");

        json.put("A43022", bind.A43022a.isChecked() ? "1"
                : bind.A43022b.isChecked() ? "2"
                : bind.A4302298.isChecked() ? "98"
                : bind.A4302299.isChecked() ? "99"
                : "0");

        json.put("A43023", bind.A43023a.isChecked() ? "1"
                : bind.A43023b.isChecked() ? "2"
                : bind.A4302398.isChecked() ? "98"
                : bind.A4302399.isChecked() ? "99"
                : "0");

        json.put("A43024", bind.A43024a.isChecked() ? "1"
                : bind.A43024b.isChecked() ? "2"
                : bind.A4302498.isChecked() ? "98"
                : bind.A4302499.isChecked() ? "99"
                : "0");

        json.put("A43025", bind.A43025a.isChecked() ? "1"
                : bind.A43025b.isChecked() ? "2"
                : bind.A4302598.isChecked() ? "98"
                : bind.A4302599.isChecked() ? "99"
                : "0");

        json.put("A43026", bind.A43026a.isChecked() ? "1"
                : bind.A43026b.isChecked() ? "2"
                : bind.A4302698.isChecked() ? "98"
                : bind.A4302699.isChecked() ? "99"
                : "0");

        json.put("A43027", bind.A43027a.isChecked() ? "1"
                : bind.A43027b.isChecked() ? "2"
                : bind.A4302798.isChecked() ? "98"
                : bind.A4302799.isChecked() ? "99"
                : "0");

        json.put("A4303", bind.A4303a.isChecked() ? "1"
                : bind.A4303b.isChecked() ? "2"
                : bind.A430398.isChecked() ? "98"
                : bind.A430399.isChecked() ? "99"
                : "0");

        json.put("A4304", bind.A4304a.isChecked() ? "1"
                : bind.A4304b.isChecked() ? "2"
                : bind.A430498.isChecked() ? "98"
                : bind.A430499.isChecked() ? "99"
                : "0");

        json.put("A4305", bind.A4305a.isChecked() ? "1"
                : bind.A4305b.isChecked() ? "2"
                : "0");

        json.put("A43061check", bind.A43061checka.isChecked() ? "1"
                : bind.A43061checkb.isChecked() ? "2"
                : "0");

        json.put("A43061", bind.A43061.getText().toString().trim().length() > 0 ? bind.A43061.getText().toString() : "0");


        json.put("A43062check", bind.A43062checka.isChecked() ? "1"
                : bind.A43062checkb.isChecked() ? "2"
                : "0");

        json.put("A43062", bind.A43062.getText().toString().trim().length() > 0 ? bind.A43062.getText().toString() : "0");

        json.put("A4307", bind.A4307.getText().toString().trim().length() > 0 ? bind.A4307.getText().toString() : "0");

        json.put("A4308", bind.A4308.getText().toString().trim().length() > 0 ? bind.A4308.getText().toString() : "0");

        json.put("A4309", bind.A4309.getText().toString().trim().length() > 0 ? bind.A4309.getText().toString() : "0");


        json.put("A43101", bind.A43101a.isChecked() ? "1"
                : bind.A43101b.isChecked() ? "2"
                : bind.A4310198.isChecked() ? "98"
                : bind.A4310199.isChecked() ? "99"
                : "0");

        json.put("A43102", bind.A43102a.isChecked() ? "1"
                : bind.A43102b.isChecked() ? "2"
                : bind.A4310298.isChecked() ? "98"
                : bind.A4310299.isChecked() ? "99"
                : "0");

        json.put("A43103", bind.A43103a.isChecked() ? "1"
                : bind.A43103b.isChecked() ? "2"
                : bind.A4310398.isChecked() ? "98"
                : bind.A4310399.isChecked() ? "99"
                : "0");

        json.put("A43104", bind.A43104a.isChecked() ? "1"
                : bind.A43104b.isChecked() ? "2"
                : bind.A4310498.isChecked() ? "98"
                : bind.A4310499.isChecked() ? "99"
                : "0");

        json.put("A43105", bind.A43105a.isChecked() ? "1"
                : bind.A43105b.isChecked() ? "2"
                : bind.A4310598.isChecked() ? "98"
                : bind.A4310599.isChecked() ? "99"
                : "0");

        json.put("A43106", bind.A43106a.isChecked() ? "1"
                : bind.A43106b.isChecked() ? "2"
                : bind.A4310698.isChecked() ? "98"
                : bind.A4310699.isChecked() ? "99"
                : "0");

        json.put("A43107", bind.A43107a.isChecked() ? "1"
                : bind.A43107b.isChecked() ? "2"
                : bind.A4310798.isChecked() ? "98"
                : bind.A4310799.isChecked() ? "99"
                : "0");

        json.put("A43108", bind.A43108a.isChecked() ? "1"
                : bind.A43108b.isChecked() ? "2"
                : bind.A4310898.isChecked() ? "98"
                : bind.A4310899.isChecked() ? "99"
                : "0");

        json.put("A43109", bind.A43109a.isChecked() ? "1"
                : bind.A43109b.isChecked() ? "2"
                : bind.A4310998.isChecked() ? "98"
                : bind.A4310999.isChecked() ? "99"
                : "0");

        json.put("A431010", bind.A431010a.isChecked() ? "1"
                : bind.A431010b.isChecked() ? "2"
                : bind.A43101098.isChecked() ? "98"
                : bind.A43101099.isChecked() ? "99"
                : "0");

        json.put("A431011", bind.A431011a.isChecked() ? "1"
                : bind.A431011b.isChecked() ? "2"
                : bind.A43101198.isChecked() ? "98"
                : bind.A43101199.isChecked() ? "99"
                : "0");

        json.put("A43111", bind.A43111a.isChecked() ? "1"
                : bind.A43111b.isChecked() ? "2"
                : bind.A4311198.isChecked() ? "98"
                : bind.A4311199.isChecked() ? "99"
                : "0");

        json.put("A43112", bind.A43112a.isChecked() ? "1"
                : bind.A43112b.isChecked() ? "2"
                : bind.A4311298.isChecked() ? "98"
                : bind.A4311299.isChecked() ? "99"
                : "0");

        json.put("A43113", bind.A43113a.isChecked() ? "1"
                : bind.A43113b.isChecked() ? "2"
                : bind.A4311398.isChecked() ? "98"
                : bind.A4311399.isChecked() ? "99"
                : "0");

        json.put("A43114", bind.A43114a.isChecked() ? "1"
                : bind.A43114b.isChecked() ? "2"
                : bind.A4311498.isChecked() ? "98"
                : bind.A4311499.isChecked() ? "99"
                : "0");

        json.put("A43115", bind.A43115a.isChecked() ? "1"
                : bind.A43115b.isChecked() ? "2"
                : bind.A4311598.isChecked() ? "98"
                : bind.A4311599.isChecked() ? "99"
                : "0");

        json.put("A4312", bind.A4312a.isChecked() ? "1"
                : bind.A4312b.isChecked() ? "2"
                : bind.A431298.isChecked() ? "98"
                : bind.A431299.isChecked() ? "99"
                : "0");

        json.put("A4313", bind.A4313a.isChecked() ? "1"
                : bind.A4313b.isChecked() ? "2"
                : bind.A431398.isChecked() ? "98"
                : bind.A431399.isChecked() ? "99"
                : "0");

        json.put("A4314", bind.A4314a.isChecked() ? "1"
                : bind.A4314b.isChecked() ? "2"
                : bind.A431498.isChecked() ? "98"
                : bind.A431499.isChecked() ? "99"
                : "0");

        json.put("A4315", bind.A4315.getText().toString().trim().length() > 0 ? bind.A4315.getText().toString() : "0");

//        MyPreferences.setsA4206(String.valueOf(json));

    }


    private void setupSkips() {

        bind.A4301.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4301a.getId()) {
                    bind.A43021cv.setVisibility(View.VISIBLE);
                    bind.A43022cv.setVisibility(View.VISIBLE);
                    bind.A43023cv.setVisibility(View.VISIBLE);
                    bind.A43024cv.setVisibility(View.VISIBLE);
                    bind.A43025cv.setVisibility(View.VISIBLE);
                    bind.A43026cv.setVisibility(View.VISIBLE);
                    bind.A43027cv.setVisibility(View.VISIBLE);
                    bind.A4303cv.setVisibility(View.VISIBLE);
                } else {

                    ClearAllcontrol.ClearAllC(bind.A43021cv);
                    ClearAllcontrol.ClearAllC(bind.A43022cv);
                    ClearAllcontrol.ClearAllC(bind.A43023cv);
                    ClearAllcontrol.ClearAllC(bind.A43024cv);
                    ClearAllcontrol.ClearAllC(bind.A43025cv);
                    ClearAllcontrol.ClearAllC(bind.A43026cv);
                    ClearAllcontrol.ClearAllC(bind.A43027cv);
                    ClearAllcontrol.ClearAllC(bind.A4303cv);

                    bind.A43021cv.setVisibility(View.GONE);
                    bind.A43022cv.setVisibility(View.GONE);
                    bind.A43023cv.setVisibility(View.GONE);
                    bind.A43024cv.setVisibility(View.GONE);
                    bind.A43025cv.setVisibility(View.GONE);
                    bind.A43026cv.setVisibility(View.GONE);
                    bind.A43027cv.setVisibility(View.GONE);
                    bind.A4303cv.setVisibility(View.GONE);
                }
            }
        });


        bind.A43027.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A43027a.getId()) {
                    bind.A4303cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4303cv);
                    bind.A4303cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A4304.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A4304a.getId()) {
                    bind.A4305cv.setVisibility(View.VISIBLE);
                    bind.A43061checkcv.setVisibility(View.VISIBLE);
                    bind.A43061cv.setVisibility(View.VISIBLE);
                    bind.A43062checkcv.setVisibility(View.VISIBLE);
                    bind.A43062cv.setVisibility(View.VISIBLE);
                    bind.A4307cv.setVisibility(View.VISIBLE);
                    bind.A4308cv.setVisibility(View.VISIBLE);
                    bind.A4309cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A4305cv);
                    ClearAllcontrol.ClearAllC(bind.A43061checkcv);
                    ClearAllcontrol.ClearAllC(bind.A43061cv);
                    ClearAllcontrol.ClearAllC(bind.A43062checkcv);
                    ClearAllcontrol.ClearAllC(bind.A43062cv);
                    ClearAllcontrol.ClearAllC(bind.A4307cv);
                    ClearAllcontrol.ClearAllC(bind.A4308cv);
                    ClearAllcontrol.ClearAllC(bind.A4309cv);

                    bind.A4305cv.setVisibility(View.GONE);
                    bind.A43061checkcv.setVisibility(View.GONE);
                    bind.A43061cv.setVisibility(View.GONE);
                    bind.A43062checkcv.setVisibility(View.GONE);
                    bind.A43062cv.setVisibility(View.GONE);
                    bind.A4307cv.setVisibility(View.GONE);
                    bind.A4308cv.setVisibility(View.GONE);
                    bind.A4309cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A42069.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bind.A42069a.getId()) {
                    bind.A420610cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllCC(bind.A420610cv);
                    bind.A420610cv.setVisibility(View.GONE);
                }

            }

        });


        bind.A420621.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bind.A420621a.getId()) {
                    bind.A420622cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bind.A420622cv);
                    bind.A420622cv.setVisibility(View.GONE);
                }

            }

        });

        if (compoundButton.getId() == R.id.rb_A4305_1
                || compoundButton.getId() == R.id.rb_A4305_2)

        {
            if (rb_A4305_2.isChecked()) {

                ClearAllcontrol.ClearAllC(ll_A4306_1check);
                ClearAllcontrol.ClearAllC(ll_A4306_1);
                ClearAllcontrol.ClearAllC(ll_A4306_2check);
                ClearAllcontrol.ClearAllC(ll_A4306_2);
                ClearAllcontrol.ClearAllC(ll_A4307);
                ClearAllcontrol.ClearAllC(ll_A4308);
                ClearAllcontrol.ClearAllC(ll_A4309);

                ll_A4306_1check.setVisibility(View.GONE);
                ll_A4306_1.setVisibility(View.GONE);
                ll_A4306_2check.setVisibility(View.GONE);
                ll_A4306_2.setVisibility(View.GONE);
                ll_A4307.setVisibility(View.GONE);
                ll_A4308.setVisibility(View.GONE);
                ll_A4309.setVisibility(View.GONE);

            } else {
                ll_A4306_1check.setVisibility(View.VISIBLE);
                ll_A4306_1.setVisibility(View.VISIBLE);
                ll_A4306_2check.setVisibility(View.VISIBLE);
                ll_A4306_2.setVisibility(View.VISIBLE);
                ll_A4307.setVisibility(View.VISIBLE);
                ll_A4308.setVisibility(View.VISIBLE);
                ll_A4309.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4306_1check_1
                || compoundButton.getId() == R.id.rb_A4306_1check_2)

        {
            if (rb_A4306_1check_2.isChecked()) {

                ClearAllcontrol.ClearAllC(ll_A4306_1);
                ll_A4306_1.setVisibility(View.GONE);

            } else {
                ll_A4306_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4306_2check_1
                || compoundButton.getId() == R.id.rb_A4306_2check_2)

        {
            if (rb_A4306_2check_2.isChecked()) {

                ClearAllcontrol.ClearAllC(ll_A4306_2);
                ll_A4306_2.setVisibility(View.GONE);

            } else {
                ll_A4306_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4314_1
                || compoundButton.getId() == R.id.rb_A4314_2
                || compoundButton.getId() == R.id.rb_A4314_DK
                || compoundButton.getId() == R.id.rb_A4314_RA)

        {
            if (rb_A4306_2check_2.isChecked() || rb_A4314_DK.isChecked() || rb_A4314_RA.isChecked()) {

                ClearAllcontrol.ClearAllC(ll_A4315);
                ll_A4315.setVisibility(View.GONE);

            } else {
                ll_A4315.setVisibility(View.VISIBLE);
            }
        }

    }


    boolean validateField() {
        if (Gothrough.IamHiden(bind.llA4301) == false) {
            return false;
        }

        return Gothrough.IamHiden(bind.llA4301) != false;
    

}

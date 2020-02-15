package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.abdulsajid.vasaadult.databinding.A4251Binding;

import org.json.JSONException;
import org.json.JSONObject;

import Global.A.A4251_A4284;
import data.LocalDataManager;
import utils.ClearAllcontrol;


public class A4251 extends AppCompatActivity {

    A4251Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4251);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {

        bi.A4251.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(bi.A42521cv);
                ClearAllcontrol.ClearAllC(bi.A4253cv);
                ClearAllcontrol.ClearAllC(bi.A4254cv);
                ClearAllcontrol.ClearAllC(bi.A4255cv);
                ClearAllcontrol.ClearAllC(bi.A4256cv);
                ClearAllcontrol.ClearAllC(bi.A4274cv);
                ClearAllcontrol.ClearAllC(bi.A4275cv);
                ClearAllcontrol.ClearAllC(bi.A4276cv);
                ClearAllcontrol.ClearAllC(bi.A4277cv);
                ClearAllcontrol.ClearAllC(bi.A4278cv);
                ClearAllcontrol.ClearAllC(bi.A4279cv);
                ClearAllcontrol.ClearAllC(bi.A4280cv);
                ClearAllcontrol.ClearAllC(bi.A4281cv);
                ClearAllcontrol.ClearAllC(bi.A4282cv);
                ClearAllcontrol.ClearAllC(bi.A4283cv);

                bi.A42521cv.setVisibility(View.GONE);
                bi.A4253cv.setVisibility(View.GONE);
                bi.A4254cv.setVisibility(View.GONE);
                bi.A4255cv.setVisibility(View.GONE);
                bi.A4256cv.setVisibility(View.GONE);
                bi.A4274cv.setVisibility(View.GONE);
                bi.A4275cv.setVisibility(View.GONE);
                bi.A4276cv.setVisibility(View.GONE);
                bi.A4277cv.setVisibility(View.GONE);
                bi.A4278cv.setVisibility(View.GONE);
                bi.A4279cv.setVisibility(View.GONE);
                bi.A4280cv.setVisibility(View.GONE);
                bi.A4281cv.setVisibility(View.GONE);
                bi.A4282cv.setVisibility(View.GONE);
                bi.A4283cv.setVisibility(View.GONE);

                if (checkedId == bi.A4251a.getId()) {
                    bi.A42521cv.setVisibility(View.VISIBLE);
                    bi.A4253cv.setVisibility(View.VISIBLE);
                    bi.A4254cv.setVisibility(View.VISIBLE);
                    bi.A4255cv.setVisibility(View.VISIBLE);
                    bi.A4256cv.setVisibility(View.VISIBLE);
                    bi.A4274cv.setVisibility(View.VISIBLE);
                    bi.A4275cv.setVisibility(View.VISIBLE);
                    bi.A4276cv.setVisibility(View.VISIBLE);
                    bi.A4277cv.setVisibility(View.VISIBLE);
                    bi.A4278cv.setVisibility(View.VISIBLE);
                    bi.A4279cv.setVisibility(View.VISIBLE);
                    bi.A4280cv.setVisibility(View.VISIBLE);
                    bi.A4281cv.setVisibility(View.VISIBLE);
                    bi.A4282cv.setVisibility(View.VISIBLE);
                    bi.A4283cv.setVisibility(View.VISIBLE);
                } else if (checkedId == bi.A4251b.getId()) {
                    bi.A4254cv.setVisibility(View.VISIBLE);
                    bi.A4255cv.setVisibility(View.VISIBLE);
                    bi.A4256cv.setVisibility(View.VISIBLE);
                    bi.A4274cv.setVisibility(View.VISIBLE);
                    bi.A4275cv.setVisibility(View.VISIBLE);
                    bi.A4276cv.setVisibility(View.VISIBLE);
                    bi.A4277cv.setVisibility(View.VISIBLE);
                    bi.A4278cv.setVisibility(View.VISIBLE);
                    bi.A4279cv.setVisibility(View.VISIBLE);
                    bi.A4280cv.setVisibility(View.VISIBLE);
                    bi.A4281cv.setVisibility(View.VISIBLE);
                    bi.A4282cv.setVisibility(View.VISIBLE);
                    bi.A4283cv.setVisibility(View.VISIBLE);
                }

            }

        });

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(A4251.this, A4301.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        Intent i = new Intent(A4251.this, HomeActivity.class);
        startActivity(i);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        A4251_A4284.A4251 = bi.A4251a.isChecked() ? "1"
                : bi.A4251b.isChecked() ? "2"
                : bi.A425198.isChecked() ? "98"
                : "0";

        json.put("A42521", bi.A42521a.isChecked() ? "1"
                : bi.A42521b.isChecked() ? "2"
                : bi.A42521c.isChecked() ? "3"
                : "0");

        json.put("A42522", bi.A42522a.isChecked() ? "1"
                : bi.A42522b.isChecked() ? "2"
                : bi.A42522c.isChecked() ? "3"
                : bi.A42522d.isChecked() ? "4"
                : bi.A42522e.isChecked() ? "5"
                : bi.A42522f.isChecked() ? "6"
                : bi.A42522g.isChecked() ? "7"
                : "0");

        json.put("A42523", bi.A42523.isChecked() ? "1" : "0");

        json.put("A42524", bi.A42524.getText().toString());

        json.put("A4253", bi.A4253a.isChecked() ? "1"
                : bi.A4253b.isChecked() ? "2"
                : bi.A425396.isChecked() ? "96"
                : bi.A425398.isChecked() ? "98"
                : "0");
        json.put("A425396x", bi.A425396x.getText().toString());

        json.put("A4254", bi.A4254a.isChecked() ? "1"
                : bi.A4254b.isChecked() ? "2"
                : bi.A425498.isChecked() ? "98"
                : "0");

        json.put("A4255a", bi.A4255a.isChecked() ? "1" : "0");
        json.put("A4255b", bi.A4255b.isChecked() ? "2" : "0");
        json.put("A4255c", bi.A4255c.isChecked() ? "3" : "0");
        json.put("A4255d", bi.A4255d.isChecked() ? "4" : "0");
        json.put("A4255e", bi.A4255e.isChecked() ? "5" : "0");
        json.put("A4255f", bi.A4255f.isChecked() ? "6" : "0");
        json.put("A4255g", bi.A4255g.isChecked() ? "7" : "0");
        json.put("A4255h", bi.A4255h.isChecked() ? "8" : "0");
        json.put("A4255i", bi.A4255i.isChecked() ? "9" : "0");
        json.put("A4255j", bi.A4255j.isChecked() ? "10" : "0");
        json.put("A4255k", bi.A4255k.isChecked() ? "11" : "0");
        json.put("A4255l", bi.A4255l.isChecked() ? "12" : "0");
        json.put("A425596", bi.A425596.isChecked() ? "96" : "0");
        json.put("A425598", bi.A425598.isChecked() ? "98" : "0");
        json.put("A4255dx", bi.A4255dx.getText().toString());
        json.put("A425596x", bi.A425596x.getText().toString());

        json.put("A4256D", bi.A4256D.getText().toString());
        json.put("A4256H", bi.A4256H.getText().toString());
        json.put("A4256m", bi.A4256m.getText().toString());

        json.put("A4257", bi.A4257a.isChecked() ? "1"
                : bi.A4257b.isChecked() ? "2"
                : bi.A4257c.isChecked() ? "3"
                : bi.A4257d.isChecked() ? "4"
                : bi.A4257e.isChecked() ? "5"
                : bi.A4257f.isChecked() ? "6"
                : bi.A4257g.isChecked() ? "7"
                : bi.A4257h.isChecked() ? "8"
                : bi.A4257i.isChecked() ? "9"
                : bi.A4257j.isChecked() ? "10"
                : bi.A4257k.isChecked() ? "11"
                : bi.A425798.isChecked() ? "98"
                : "0");
        json.put("A4257x", bi.A4257x.getText().toString());

        json.put("A4258", bi.A4258a.isChecked() ? "1"
                : bi.A4258b.isChecked() ? "2"
                : bi.A4258c.isChecked() ? "3"
                : bi.A425898.isChecked() ? "98"
                : "0");

        json.put("A4274", bi.A4274a.isChecked() ? "1"
                : bi.A4274b.isChecked() ? "2"
                : bi.A427498.isChecked() ? "98"
                : "0");

        json.put("A4275", bi.A4275a.isChecked() ? "1"
                : bi.A4275b.isChecked() ? "2"
                : bi.A427598.isChecked() ? "98"
                : "0");

        json.put("A4276a", bi.A4276a.isChecked() ? "1" : "0");
        json.put("A4276b", bi.A4276b.isChecked() ? "2" : "0");
        json.put("A4276c", bi.A4276c.isChecked() ? "3" : "0");
        json.put("A4276d", bi.A4276d.isChecked() ? "4" : "0");
        json.put("A4276e", bi.A4276e.isChecked() ? "5" : "0");
        json.put("A4276f", bi.A4276f.isChecked() ? "6" : "0");
        json.put("A4276g", bi.A4276g.isChecked() ? "7" : "0");
        json.put("A4276h", bi.A4276h.isChecked() ? "8" : "0");
        json.put("A4276i", bi.A4276i.isChecked() ? "9" : "0");
        json.put("A4276j", bi.A4276j.isChecked() ? "10" : "0");
        json.put("A4276k", bi.A4276k.isChecked() ? "11" : "0");
        json.put("A4276l", bi.A4276l.isChecked() ? "12" : "0");
        json.put("A4276m", bi.A4276m.isChecked() ? "13" : "0");
        json.put("A4276n", bi.A4276n.isChecked() ? "14" : "0");
        json.put("A4276o", bi.A4276o.isChecked() ? "15" : "0");
        json.put("A427696", bi.A427696.isChecked() ? "96" : "0");
        json.put("A427698", bi.A427698.isChecked() ? "98" : "0");
        json.put("A4276ex", bi.A4276ex.getText().toString());
        json.put("A427696x", bi.A427696x.getText().toString());

        json.put("A4277", bi.A4277a.isChecked() ? "1"
                : bi.A4277b.isChecked() ? "2"
                : bi.A427798.isChecked() ? "98"
                : "0");

        json.put("A4278a", bi.A4278a.isChecked() ? "1" : "0");
        json.put("A4278b", bi.A4278b.isChecked() ? "2" : "0");
        json.put("A4278c", bi.A4278c.isChecked() ? "3" : "0");
        json.put("A4278d", bi.A4278d.isChecked() ? "4" : "0");
        json.put("A4278e", bi.A4278e.isChecked() ? "5" : "0");
        json.put("A4278f", bi.A4278f.isChecked() ? "6" : "0");
        json.put("A427896", bi.A427896.isChecked() ? "96" : "0");
        json.put("A427898", bi.A427898.isChecked() ? "98" : "0");

        json.put("A4279a", bi.A4279a.isChecked() ? "1" : "0");
        json.put("A4279b", bi.A4279b.isChecked() ? "2" : "0");
        json.put("A4279c", bi.A4279c.isChecked() ? "3" : "0");
        json.put("A4279d", bi.A4279d.isChecked() ? "4" : "0");
        json.put("A4279e", bi.A4279e.isChecked() ? "5" : "0");
        json.put("A4279f", bi.A4279f.isChecked() ? "6" : "0");
        json.put("A427996", bi.A427996.isChecked() ? "96" : "0");
        json.put("A427998", bi.A427998.isChecked() ? "98" : "0");

        json.put("A4280", bi.A4280a.isChecked() ? "1"
                : bi.A4280b.isChecked() ? "2"
                : bi.A428098.isChecked() ? "98"
                : bi.A428099.isChecked() ? "99"
                : "0");

        json.put("A4281", bi.A4281a.isChecked() ? "1"
                : bi.A4281b.isChecked() ? "2"
                : bi.A428198.isChecked() ? "98"
                : bi.A428199.isChecked() ? "99"
                : "0");

        json.put("A4282", bi.A4282a.isChecked() ? "1"
                : bi.A4282b.isChecked() ? "2"
                : bi.A428298.isChecked() ? "98"
                : bi.A428299.isChecked() ? "99"
                : "0");

        json.put("A4283", bi.A4283a.isChecked() ? "1"
                : bi.A4283b.isChecked() ? "2"
                : bi.A428398.isChecked() ? "98"
                : bi.A428399.isChecked() ? "99"
                : "0");

        json.put("A4284", bi.A428498.isChecked() ? "98" : bi.A4284.getText().toString());

        LocalDataManager lm = new LocalDataManager(this);
        LocalDataManager.database.execSQL(String.valueOf(json));

    }


    boolean validateField() {
        return Gothrough.IamHiden(bi.llA4251);
    }


}

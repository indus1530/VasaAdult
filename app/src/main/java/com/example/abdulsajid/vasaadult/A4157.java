package com.example.abdulsajid.vasaadult;

import android.content.Intent;
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

import data.LocalDataManager;
import utils.ClearAllcontrol;

public class A4157 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next9;

    LinearLayout
            ll_A4157,
            ll_A4158,
            ll_A4159,
            ll_A4160,
            ll_A4161,
            ll_A4161_1,
            ll_A4162,
            ll_A4163_1,
            ll_A4163,
            ll_A4164,
            ll_A4166,
            ll_A4167,
            ll_A4168_1,
            ll_A4168_3,
            ll_A4168,
            ll_A4173_1,
            ll_A4173,
            ll_A4173_2,
            ll_A4178_1,
            ll_A4178_2,
            ll_A4178,
            ll_A4179,
            ll_A4180,
            ll_A4181,
            ll_A4182,
            ll_A4183,
            ll_A4184,
            ll_A4185,
            ll_A4186,
            ll_A4186_1,
            ll_A4187,
            ll_A4188,
            ll_A4189,
            ll_A4190,
            ll_A4191,
            ll_A4192,
            ll_A4193,
            ll_A4193_1,
            ll_A4194,
            ll_A4195,
            ll_A4196,
            ll_A4197,
            ll_A4198_1,
            ll_A4198,
            ll_A4200,
            ll_A4202,
            ll_A4203,
            ll_A4204,
            ll_A4205,
            ll_A4205_1;

    RadioButton
            rb_A4157_1,
            rb_A4157_2,
            rb_A4157_DK,
            rb_A4157_RA,
            rb_A4158_1,
            rb_A4158_2,
            rb_A4158_DK,
            rb_A4158_RA,
            rb_A4159_1,
            rb_A4159_2,
            rb_A4159_DK,
            rb_A4159_RA,
            rb_A4160_1,
            rb_A4160_2,
            rb_A4160_DK,
            rb_A4160_RA,
            rb_A4161_1,
            rb_A4161_2,
            rb_A4161_DK,
            rb_A4161_RA,
            rb_A4161_1_1,
            rb_A4161_1_2,
            rb_A4161_1_DK,
            rb_A4161_1_RA,
            rb_A4162_1,
            rb_A4162_2,
            rb_A4162_DK,
            rb_A4162_RA,
            rb_A4163_1_1,
            rb_A4163_1_2,
            rb_A4163_1_DK,
            rb_A4163_1_RA,
            rb_A4163_1,
            rb_A4163_2,
            rb_A4163_DK,
            rb_A4163_RA,
            rb_A4166_1,
            rb_A4166_2,
            rb_A4166_DK,
            rb_A4166_RA,
            rb_A4167_1,
            rb_A4167_2,
            rb_A4167_DK,
            rb_A4167_RA,
            rb_A4168_1_1,
            rb_A4168_1_2,
            rb_A4168_1_DK,
            rb_A4168_1_RA,
            rb_A4168_3_1,
            rb_A4168_3_2,
            rb_A4168_3_DK,
            rb_A4168_3_RA,
            rb_A4168_1,
            rb_A4168_2,
            rb_A4168_DK,
            rb_A4168_RA,
            rb_A4173_1_1,
            rb_A4173_1_2,
            rb_A4173_1_DK,
            rb_A4173_1_RA,
            rb_A4173_1,
            rb_A4173_2,
            rb_A4173_DK,
            rb_A4173_RA,
            rb_A4173_2_1,
            rb_A4173_2_2,
            rb_A4173_2_DK,
            rb_A4173_2_RA,
            rb_A4178_2_1,
            rb_A4178_2_2,
            rb_A4178_2_DK,
            rb_A4178_2_RA,
            rb_A4178_1,
            rb_A4178_2,
            rb_A4178_DK,
            rb_A4178_RA,
            rb_A4179_1,
            rb_A4179_2,
            rb_A4179_DK,
            rb_A4179_RA,
            rb_A4181_1,
            rb_A4181_2,
            rb_A4181_DK,
            rb_A4181_RA,
            rb_A4182_1,
            rb_A4182_2,
            rb_A4182_DK,
            rb_A4182_RA,
            rb_A4183_1,
            rb_A4183_2,
            rb_A4183_DK,
            rb_A4183_RA,
            rb_A4184_1,
            rb_A4184_2,
            rb_A4184_DK,
            rb_A4184_RA,
            rb_A4185_1,
            rb_A4185_2,
            rb_A4185_DK,
            rb_A4185_RA,
            rb_A4186_1,
            rb_A4186_2,
            rb_A4186_DK,
            rb_A4186_RA,
            rb_A4186_1_1,
            rb_A4186_1_2,
            rb_A4186_1_DK,
            rb_A4186_1_RA,
            rb_A4187_1,
            rb_A4187_2,
            rb_A4187_DK,
            rb_A4187_RA,
            rb_A4188_1,
            rb_A4188_2,
            rb_A4188_DK,
            rb_A4188_RA,
            rb_A4189_1,
            rb_A4189_2,
            rb_A4189_DK,
            rb_A4189_RA,
            rb_A4190_1,
            rb_A4190_2,
            rb_A4190_DK,
            rb_A4190_RA,
            rb_A4191_1,
            rb_A4191_2,
            rb_A4191_DK,
            rb_A4191_RA,
            rb_A4193_1,
            rb_A4193_2,
            rb_A4193_DK,
            rb_A4193_RA,
            rb_A4193_1_1,
            rb_A4193_1_2,
            rb_A4193_1_3,
            rb_A4193_1_4,
            rb_A4193_1_DK,
            rb_A4193_1_RA,
            rb_A4194_1,
            rb_A4194_2,
            rb_A4194_DK,
            rb_A4194_RA,
            rb_A4195_1,
            rb_A4195_2,
            rb_A4195_DK,
            rb_A4195_RA,
            rb_A4196_1,
            rb_A4196_2,
            rb_A4196_DK,
            rb_A4196_RA,
            rb_A4197_1,
            rb_A4197_2,
            rb_A4197_DK,
            rb_A4197_RA,
            rb_A4198_1_1,
            rb_A4198_1_2,
            rb_A4198_1_DK,
            rb_A4198_1_RA,
            rb_A4198_1,
            rb_A4198_2,
            rb_A4198_3,
            rb_A4198_4,
            rb_A4198_5,
            rb_A4198_DK,
            rb_A4198_RA,
            rb_A4200_1,
            rb_A4200_2,
            rb_A4200_3,
            rb_A4200_4,
            rb_A4200_5,
            rb_A4200_6,
            rb_A4200_7,
            rb_A4200_DK,
            rb_A4200_RA,
            rb_A4202_1,
            rb_A4202_2,
            rb_A4202_DK,
            rb_A4202_RA,
            rb_A4203_1,
            rb_A4203_2,
            rb_A4203_DK,
            rb_A4203_RA,
            rb_A4204_1,
            rb_A4204_2,
            rb_A4204_DK,
            rb_A4204_RA,
            rb_A4205_1,
            rb_A4205_2,
            rb_A4205_DK,
            rb_A4205_RA,
            rb_A4205_1_1,
            rb_A4205_1_2,
            rb_A4205_1_DK,
            rb_A4205_1_RA;

    EditText
            ed_A4164,
            ed_A4178_1,
            ed_A4180,
            ed_A4192;

    String
            study_id,
            A4157,
            A4158,
            A4159,
            A4160,
            A4161,
            A4161_1,
            A4162,
            A4163_1,
            A4163,
            A4164,
            A4166,
            A4167,
            A4168_1,
            A4168_3,
            A4168,
            A4173_1,
            A4173,
            A4173_2,
            A4178_1,
            A4178_2,
            A4178,
            A4179,
            A4180,
            A4181,
            A4182,
            A4183,
            A4184,
            A4185,
            A4186,
            A4186_1,
            A4187,
            A4188,
            A4189,
            A4190,
            A4191,
            A4192,
            A4193,
            A4193_1,
            A4194,
            A4195,
            A4196,
            A4197,
            A4198_1,
            A4198,
            A4200,
            A4202,
            A4203,
            A4204,
            A4205,
            A4205_1,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next9 = findViewById(R.id.btn_next9);

        //Linear Layout
        ll_A4157 = findViewById(R.id.ll_A4157);
        ll_A4158 = findViewById(R.id.ll_A4158);
        ll_A4159 = findViewById(R.id.ll_A4159);
        ll_A4160 = findViewById(R.id.ll_A4160);
        ll_A4161 = findViewById(R.id.ll_A4161);
        ll_A4161_1 = findViewById(R.id.ll_A4161_1);
        ll_A4162 = findViewById(R.id.ll_A4162);
        ll_A4163_1 = findViewById(R.id.ll_A4163_1);
        ll_A4163 = findViewById(R.id.ll_A4163);
        ll_A4164 = findViewById(R.id.ll_A4164);
        ll_A4166 = findViewById(R.id.ll_A4166);
        ll_A4167 = findViewById(R.id.ll_A4167);
        ll_A4168_1 = findViewById(R.id.ll_A4168_1);
        ll_A4168_3 = findViewById(R.id.ll_A4168_3);
        ll_A4168 = findViewById(R.id.ll_A4168);
        ll_A4173_1 = findViewById(R.id.ll_A4173_1);
        ll_A4173 = findViewById(R.id.ll_A4173);
        ll_A4173_2 = findViewById(R.id.ll_A4173_2);
        ll_A4178_1 = findViewById(R.id.ll_A4178_1);
        ll_A4178_2 = findViewById(R.id.ll_A4178_2);
        ll_A4178 = findViewById(R.id.ll_A4178);
        ll_A4179 = findViewById(R.id.ll_A4179);
        ll_A4180 = findViewById(R.id.ll_A4180);
        ll_A4181 = findViewById(R.id.ll_A4181);
        ll_A4182 = findViewById(R.id.ll_A4182);
        ll_A4183 = findViewById(R.id.ll_A4183);
        ll_A4184 = findViewById(R.id.ll_A4184);
        ll_A4185 = findViewById(R.id.ll_A4185);
        ll_A4186 = findViewById(R.id.ll_A4186);
        ll_A4186_1 = findViewById(R.id.ll_A4186_1);
        ll_A4187 = findViewById(R.id.ll_A4187);
        ll_A4188 = findViewById(R.id.ll_A4188);
        ll_A4189 = findViewById(R.id.ll_A4189);
        ll_A4190 = findViewById(R.id.ll_A4190);
        ll_A4191 = findViewById(R.id.ll_A4191);
        ll_A4192 = findViewById(R.id.ll_A4192);
        ll_A4193 = findViewById(R.id.ll_A4193);
        ll_A4193_1 = findViewById(R.id.ll_A4193_1);
        ll_A4194 = findViewById(R.id.ll_A4194);
        ll_A4195 = findViewById(R.id.ll_A4195);
        ll_A4196 = findViewById(R.id.ll_A4196);
        ll_A4197 = findViewById(R.id.ll_A4197);
        ll_A4198_1 = findViewById(R.id.ll_A4198_1);
        ll_A4198 = findViewById(R.id.ll_A4198);
        ll_A4200 = findViewById(R.id.ll_A4200);
        ll_A4202 = findViewById(R.id.ll_A4202);
        ll_A4203 = findViewById(R.id.ll_A4203);
        ll_A4204 = findViewById(R.id.ll_A4204);
        ll_A4205 = findViewById(R.id.ll_A4205);
        ll_A4205_1 = findViewById(R.id.ll_A4205_1);

        //Radio Button
        rb_A4157_1 = findViewById(R.id.rb_A4157_1);
        rb_A4157_2 = findViewById(R.id.rb_A4157_2);
        rb_A4157_DK = findViewById(R.id.rb_A4157_DK);
        rb_A4157_RA = findViewById(R.id.rb_A4157_RA);
        rb_A4158_1 = findViewById(R.id.rb_A4158_1);
        rb_A4158_2 = findViewById(R.id.rb_A4158_2);
        rb_A4158_DK = findViewById(R.id.rb_A4158_DK);
        rb_A4158_RA = findViewById(R.id.rb_A4158_RA);
        rb_A4159_1 = findViewById(R.id.rb_A4159_1);
        rb_A4159_2 = findViewById(R.id.rb_A4159_2);
        rb_A4159_DK = findViewById(R.id.rb_A4159_DK);
        rb_A4159_RA = findViewById(R.id.rb_A4159_RA);
        rb_A4160_1 = findViewById(R.id.rb_A4160_1);
        rb_A4160_2 = findViewById(R.id.rb_A4160_2);
        rb_A4160_DK = findViewById(R.id.rb_A4160_DK);
        rb_A4160_RA = findViewById(R.id.rb_A4160_RA);
        rb_A4161_1 = findViewById(R.id.rb_A4161_1);
        rb_A4161_2 = findViewById(R.id.rb_A4161_2);
        rb_A4161_DK = findViewById(R.id.rb_A4161_DK);
        rb_A4161_RA = findViewById(R.id.rb_A4161_RA);
        rb_A4161_1_1 = findViewById(R.id.rb_A4161_1_1);
        rb_A4161_1_2 = findViewById(R.id.rb_A4161_1_2);
        rb_A4161_1_DK = findViewById(R.id.rb_A4161_1_DK);
        rb_A4161_1_RA = findViewById(R.id.rb_A4161_1_RA);
        rb_A4162_1 = findViewById(R.id.rb_A4162_1);
        rb_A4162_2 = findViewById(R.id.rb_A4162_2);
        rb_A4162_DK = findViewById(R.id.rb_A4162_DK);
        rb_A4162_RA = findViewById(R.id.rb_A4162_RA);
        rb_A4163_1_1 = findViewById(R.id.rb_A4163_1_1);
        rb_A4163_1_2 = findViewById(R.id.rb_A4163_1_2);
        rb_A4163_1_DK = findViewById(R.id.rb_A4163_1_DK);
        rb_A4163_1_RA = findViewById(R.id.rb_A4163_1_RA);
        rb_A4163_1 = findViewById(R.id.rb_A4163_1);
        rb_A4163_2 = findViewById(R.id.rb_A4163_2);
        rb_A4163_DK = findViewById(R.id.rb_A4163_DK);
        rb_A4163_RA = findViewById(R.id.rb_A4163_RA);
        rb_A4166_1 = findViewById(R.id.rb_A4166_1);
        rb_A4166_2 = findViewById(R.id.rb_A4166_2);
        rb_A4166_DK = findViewById(R.id.rb_A4166_DK);
        rb_A4166_RA = findViewById(R.id.rb_A4166_RA);
        rb_A4167_1 = findViewById(R.id.rb_A4167_1);
        rb_A4167_2 = findViewById(R.id.rb_A4167_2);
        rb_A4167_DK = findViewById(R.id.rb_A4167_DK);
        rb_A4167_RA = findViewById(R.id.rb_A4167_RA);
        rb_A4168_1_1 = findViewById(R.id.rb_A4168_1_1);
        rb_A4168_1_2 = findViewById(R.id.rb_A4168_1_2);
        rb_A4168_1_DK = findViewById(R.id.rb_A4168_1_DK);
        rb_A4168_1_RA = findViewById(R.id.rb_A4168_1_RA);
        rb_A4168_3_1 = findViewById(R.id.rb_A4168_3_1);
        rb_A4168_3_2 = findViewById(R.id.rb_A4168_3_2);
        rb_A4168_3_DK = findViewById(R.id.rb_A4168_3_DK);
        rb_A4168_3_RA = findViewById(R.id.rb_A4168_3_RA);
        rb_A4168_1 = findViewById(R.id.rb_A4168_1);
        rb_A4168_2 = findViewById(R.id.rb_A4168_2);
        rb_A4168_DK = findViewById(R.id.rb_A4168_DK);
        rb_A4168_RA = findViewById(R.id.rb_A4168_RA);
        rb_A4173_1_1 = findViewById(R.id.rb_A4173_1_1);
        rb_A4173_1_2 = findViewById(R.id.rb_A4173_1_2);
        rb_A4173_1_DK = findViewById(R.id.rb_A4173_1_DK);
        rb_A4173_1_RA = findViewById(R.id.rb_A4173_1_RA);
        rb_A4173_1 = findViewById(R.id.rb_A4173_1);
        rb_A4173_2 = findViewById(R.id.rb_A4173_2);
        rb_A4173_DK = findViewById(R.id.rb_A4173_DK);
        rb_A4173_RA = findViewById(R.id.rb_A4173_RA);
        rb_A4173_2_1 = findViewById(R.id.rb_A4173_2_1);
        rb_A4173_2_2 = findViewById(R.id.rb_A4173_2_2);
        rb_A4173_2_DK = findViewById(R.id.rb_A4173_2_DK);
        rb_A4173_2_RA = findViewById(R.id.rb_A4173_2_RA);
        rb_A4178_2_1 = findViewById(R.id.rb_A4178_2_1);
        rb_A4178_2_2 = findViewById(R.id.rb_A4178_2_2);
        rb_A4178_2_DK = findViewById(R.id.rb_A4178_2_DK);
        rb_A4178_2_RA = findViewById(R.id.rb_A4178_2_RA);
        rb_A4178_1 = findViewById(R.id.rb_A4178_1);
        rb_A4178_2 = findViewById(R.id.rb_A4178_2);
        rb_A4178_DK = findViewById(R.id.rb_A4178_DK);
        rb_A4178_RA = findViewById(R.id.rb_A4178_RA);
        rb_A4179_1 = findViewById(R.id.rb_A4179_1);
        rb_A4179_2 = findViewById(R.id.rb_A4179_2);
        rb_A4179_DK = findViewById(R.id.rb_A4179_DK);
        rb_A4179_RA = findViewById(R.id.rb_A4179_RA);
        rb_A4181_1 = findViewById(R.id.rb_A4181_1);
        rb_A4181_2 = findViewById(R.id.rb_A4181_2);
        rb_A4181_DK = findViewById(R.id.rb_A4181_DK);
        rb_A4181_RA = findViewById(R.id.rb_A4181_RA);
        rb_A4182_1 = findViewById(R.id.rb_A4182_1);
        rb_A4182_2 = findViewById(R.id.rb_A4182_2);
        rb_A4182_DK = findViewById(R.id.rb_A4182_DK);
        rb_A4182_RA = findViewById(R.id.rb_A4182_RA);
        rb_A4183_1 = findViewById(R.id.rb_A4183_1);
        rb_A4183_2 = findViewById(R.id.rb_A4183_2);
        rb_A4183_DK = findViewById(R.id.rb_A4183_DK);
        rb_A4183_RA = findViewById(R.id.rb_A4183_RA);
        rb_A4184_1 = findViewById(R.id.rb_A4184_1);
        rb_A4184_2 = findViewById(R.id.rb_A4184_2);
        rb_A4184_DK = findViewById(R.id.rb_A4184_DK);
        rb_A4184_RA = findViewById(R.id.rb_A4184_RA);
        rb_A4185_1 = findViewById(R.id.rb_A4185_1);
        rb_A4185_2 = findViewById(R.id.rb_A4185_2);
        rb_A4185_DK = findViewById(R.id.rb_A4185_DK);
        rb_A4185_RA = findViewById(R.id.rb_A4185_RA);
        rb_A4186_1 = findViewById(R.id.rb_A4186_1);
        rb_A4186_2 = findViewById(R.id.rb_A4186_2);
        rb_A4186_DK = findViewById(R.id.rb_A4186_DK);
        rb_A4186_RA = findViewById(R.id.rb_A4186_RA);
        rb_A4186_1_1 = findViewById(R.id.rb_A4186_1_1);
        rb_A4186_1_2 = findViewById(R.id.rb_A4186_1_2);
        rb_A4186_1_DK = findViewById(R.id.rb_A4186_1_DK);
        rb_A4186_1_RA = findViewById(R.id.rb_A4186_1_RA);
        rb_A4187_1 = findViewById(R.id.rb_A4187_1);
        rb_A4187_2 = findViewById(R.id.rb_A4187_2);
        rb_A4187_DK = findViewById(R.id.rb_A4187_DK);
        rb_A4187_RA = findViewById(R.id.rb_A4187_RA);
        rb_A4188_1 = findViewById(R.id.rb_A4188_1);
        rb_A4188_2 = findViewById(R.id.rb_A4188_2);
        rb_A4188_DK = findViewById(R.id.rb_A4188_DK);
        rb_A4188_RA = findViewById(R.id.rb_A4188_RA);
        rb_A4189_1 = findViewById(R.id.rb_A4189_1);
        rb_A4189_2 = findViewById(R.id.rb_A4189_2);
        rb_A4189_DK = findViewById(R.id.rb_A4189_DK);
        rb_A4189_RA = findViewById(R.id.rb_A4189_RA);
        rb_A4190_1 = findViewById(R.id.rb_A4190_1);
        rb_A4190_2 = findViewById(R.id.rb_A4190_2);
        rb_A4190_DK = findViewById(R.id.rb_A4190_DK);
        rb_A4190_RA = findViewById(R.id.rb_A4190_RA);
        rb_A4191_1 = findViewById(R.id.rb_A4191_1);
        rb_A4191_2 = findViewById(R.id.rb_A4191_2);
        rb_A4191_DK = findViewById(R.id.rb_A4191_DK);
        rb_A4191_RA = findViewById(R.id.rb_A4191_RA);
        rb_A4193_1 = findViewById(R.id.rb_A4193_1);
        rb_A4193_2 = findViewById(R.id.rb_A4193_2);
        rb_A4193_DK = findViewById(R.id.rb_A4193_DK);
        rb_A4193_RA = findViewById(R.id.rb_A4193_RA);
        rb_A4193_1_1 = findViewById(R.id.rb_A4193_1_1);
        rb_A4193_1_2 = findViewById(R.id.rb_A4193_1_2);
        rb_A4193_1_3 = findViewById(R.id.rb_A4193_1_3);
        rb_A4193_1_4 = findViewById(R.id.rb_A4193_1_4);
        rb_A4193_1_DK = findViewById(R.id.rb_A4193_1_DK);
        rb_A4193_1_RA = findViewById(R.id.rb_A4193_1_RA);
        rb_A4194_1 = findViewById(R.id.rb_A4194_1);
        rb_A4194_2 = findViewById(R.id.rb_A4194_2);
        rb_A4194_DK = findViewById(R.id.rb_A4194_DK);
        rb_A4194_RA = findViewById(R.id.rb_A4194_RA);
        rb_A4195_1 = findViewById(R.id.rb_A4195_1);
        rb_A4195_2 = findViewById(R.id.rb_A4195_2);
        rb_A4195_DK = findViewById(R.id.rb_A4195_DK);
        rb_A4195_RA = findViewById(R.id.rb_A4195_RA);
        rb_A4196_1 = findViewById(R.id.rb_A4196_1);
        rb_A4196_2 = findViewById(R.id.rb_A4196_2);
        rb_A4196_DK = findViewById(R.id.rb_A4196_DK);
        rb_A4196_RA = findViewById(R.id.rb_A4196_RA);
        rb_A4197_1 = findViewById(R.id.rb_A4197_1);
        rb_A4197_2 = findViewById(R.id.rb_A4197_2);
        rb_A4197_DK = findViewById(R.id.rb_A4197_DK);
        rb_A4197_RA = findViewById(R.id.rb_A4197_RA);
        rb_A4198_1_1 = findViewById(R.id.rb_A4198_1_1);
        rb_A4198_1_2 = findViewById(R.id.rb_A4198_1_2);
        rb_A4198_1_DK = findViewById(R.id.rb_A4198_1_DK);
        rb_A4198_1_RA = findViewById(R.id.rb_A4198_1_RA);
        rb_A4198_1 = findViewById(R.id.rb_A4198_1);
        rb_A4198_2 = findViewById(R.id.rb_A4198_2);
        rb_A4198_3 = findViewById(R.id.rb_A4198_3);
        rb_A4198_4 = findViewById(R.id.rb_A4198_4);
        rb_A4198_5 = findViewById(R.id.rb_A4198_5);
        rb_A4198_DK = findViewById(R.id.rb_A4198_DK);
        rb_A4198_RA = findViewById(R.id.rb_A4198_RA);
        rb_A4200_1 = findViewById(R.id.rb_A4200_1);
        rb_A4200_2 = findViewById(R.id.rb_A4200_2);
        rb_A4200_3 = findViewById(R.id.rb_A4200_3);
        rb_A4200_4 = findViewById(R.id.rb_A4200_4);
        rb_A4200_5 = findViewById(R.id.rb_A4200_5);
        rb_A4200_6 = findViewById(R.id.rb_A4200_6);
        rb_A4200_7 = findViewById(R.id.rb_A4200_7);
        rb_A4200_DK = findViewById(R.id.rb_A4200_DK);
        rb_A4200_RA = findViewById(R.id.rb_A4200_RA);
        rb_A4202_1 = findViewById(R.id.rb_A4202_1);
        rb_A4202_2 = findViewById(R.id.rb_A4202_2);
        rb_A4202_DK = findViewById(R.id.rb_A4202_DK);
        rb_A4202_RA = findViewById(R.id.rb_A4202_RA);
        rb_A4203_1 = findViewById(R.id.rb_A4203_1);
        rb_A4203_2 = findViewById(R.id.rb_A4203_2);
        rb_A4203_DK = findViewById(R.id.rb_A4203_DK);
        rb_A4203_RA = findViewById(R.id.rb_A4203_RA);
        rb_A4204_1 = findViewById(R.id.rb_A4204_1);
        rb_A4204_2 = findViewById(R.id.rb_A4204_2);
        rb_A4204_DK = findViewById(R.id.rb_A4204_DK);
        rb_A4204_RA = findViewById(R.id.rb_A4204_RA);
        rb_A4205_1 = findViewById(R.id.rb_A4205_1);
        rb_A4205_2 = findViewById(R.id.rb_A4205_2);
        rb_A4205_DK = findViewById(R.id.rb_A4205_DK);
        rb_A4205_RA = findViewById(R.id.rb_A4205_RA);
        rb_A4205_1_1 = findViewById(R.id.rb_A4205_1_1);
        rb_A4205_1_2 = findViewById(R.id.rb_A4205_1_2);
        rb_A4205_1_DK = findViewById(R.id.rb_A4205_1_DK);
        rb_A4205_1_RA = findViewById(R.id.rb_A4205_1_RA);

        // Edit Text
        ed_A4164 = findViewById(R.id.ed_A4164);
        ed_A4178_1 = findViewById(R.id.ed_A4178_1);
        ed_A4180 = findViewById(R.id.ed_A4180);
        ed_A4192 = findViewById(R.id.ed_A4192);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4157);

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

        Intent c2 = new Intent(com.example.abdulsajid.vasaadult.A4157.this, A4206.class);
        startActivity(c2);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4159_1
                || compoundButton.getId() == R.id.rb_A4159_2
                || compoundButton.getId() == R.id.rb_A4159_DK
                || compoundButton.getId() == R.id.rb_A4159_RA)

        {
            if (rb_A4159_2.isChecked() || rb_A4159_DK.isChecked() || rb_A4159_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4160);
                ClearAllcontrol.ClearAll(ll_A4161);
                ClearAllcontrol.ClearAll(ll_A4161_1);
                ClearAllcontrol.ClearAll(ll_A4162);
                ClearAllcontrol.ClearAll(ll_A4163_1);
                ClearAllcontrol.ClearAll(ll_A4163);
                ClearAllcontrol.ClearAll(ll_A4164);

                ll_A4160.setVisibility(View.GONE);
                ll_A4161.setVisibility(View.GONE);
                ll_A4161_1.setVisibility(View.GONE);
                ll_A4162.setVisibility(View.GONE);
                ll_A4163_1.setVisibility(View.GONE);
                ll_A4163.setVisibility(View.GONE);
                ll_A4164.setVisibility(View.GONE);

            } else {
                ll_A4160.setVisibility(View.VISIBLE);
                ll_A4161.setVisibility(View.VISIBLE);
                ll_A4161_1.setVisibility(View.VISIBLE);
                ll_A4162.setVisibility(View.VISIBLE);
                ll_A4163_1.setVisibility(View.VISIBLE);
                ll_A4163.setVisibility(View.VISIBLE);
                ll_A4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4160_1
                || compoundButton.getId() == R.id.rb_A4160_2
                || compoundButton.getId() == R.id.rb_A4160_DK
                || compoundButton.getId() == R.id.rb_A4160_RA)

        {
            if (rb_A4160_2.isChecked() || rb_A4160_DK.isChecked() || rb_A4160_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4161);

                ll_A4161.setVisibility(View.GONE);

            } else {
                ll_A4161.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4162_1
                || compoundButton.getId() == R.id.rb_A4162_2
                || compoundButton.getId() == R.id.rb_A4162_DK
                || compoundButton.getId() == R.id.rb_A4162_RA)

        {
            if (rb_A4162_2.isChecked() || rb_A4162_DK.isChecked() || rb_A4162_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4163_1);

                ll_A4163_1.setVisibility(View.GONE);

            } else {
                ll_A4163_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4163_1
                || compoundButton.getId() == R.id.rb_A4163_2
                || compoundButton.getId() == R.id.rb_A4163_DK
                || compoundButton.getId() == R.id.rb_A4163_RA)

        {
            if (rb_A4163_2.isChecked() || rb_A4163_DK.isChecked() || rb_A4163_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4164);

                ll_A4164.setVisibility(View.GONE);

            } else {
                ll_A4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4167_1
                || compoundButton.getId() == R.id.rb_A4167_2
                || compoundButton.getId() == R.id.rb_A4167_DK
                || compoundButton.getId() == R.id.rb_A4167_RA)

        {
            if (rb_A4167_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168_1);
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);
                ClearAllcontrol.ClearAll(ll_A4173_1);
                ClearAllcontrol.ClearAll(ll_A4173);
                ClearAllcontrol.ClearAll(ll_A4173_2);

                ll_A4168_1.setVisibility(View.GONE);
                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);
                ll_A4173_1.setVisibility(View.GONE);
                ll_A4173.setVisibility(View.GONE);
                ll_A4173_2.setVisibility(View.GONE);

            } else {
                ll_A4168_1.setVisibility(View.VISIBLE);
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
                ll_A4173_1.setVisibility(View.VISIBLE);
                ll_A4173.setVisibility(View.VISIBLE);
                ll_A4173_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_1_1
                || compoundButton.getId() == R.id.rb_A4168_1_2
                || compoundButton.getId() == R.id.rb_A4168_1_DK
                || compoundButton.getId() == R.id.rb_A4168_1_RA)

        {
            if (rb_A4168_1_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);

                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);

            } else {
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_3_1
                || compoundButton.getId() == R.id.rb_A4168_3_2
                || compoundButton.getId() == R.id.rb_A4168_3_DK
                || compoundButton.getId() == R.id.rb_A4168_3_RA)

        {
            if (rb_A4168_3_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4168);

                ll_A4168.setVisibility(View.GONE);

            } else {
                ll_A4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4168_1
                || compoundButton.getId() == R.id.rb_A4168_2
                || compoundButton.getId() == R.id.rb_A4168_DK
                || compoundButton.getId() == R.id.rb_A4168_RA)

        {
            if (rb_A4168_2.isChecked() || rb_A4168_DK.isChecked() || rb_A4168_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4173_1);

                ll_A4173_1.setVisibility(View.GONE);

            } else {
                ll_A4173_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4173_1
                || compoundButton.getId() == R.id.rb_A4173_2
                || compoundButton.getId() == R.id.rb_A4173_DK
                || compoundButton.getId() == R.id.rb_A4173_RA)

        {
            if (rb_A4173_2.isChecked() || rb_A4173_DK.isChecked() || rb_A4173_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4173_2);
                ClearAllcontrol.ClearAll(ll_A4178_1);

                ll_A4173_2.setVisibility(View.GONE);
                ll_A4178_1.setVisibility(View.GONE);

            } else {
                ll_A4173_2.setVisibility(View.VISIBLE);
                ll_A4178_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4194_1
                || compoundButton.getId() == R.id.rb_A4194_2
                || compoundButton.getId() == R.id.rb_A4194_DK
                || compoundButton.getId() == R.id.rb_A4194_RA)

        {
            if (rb_A4194_2.isChecked() || rb_A4194_DK.isChecked() || rb_A4194_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4195);
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);
                ClearAllcontrol.ClearAll(ll_A4198_1);

                ll_A4195.setVisibility(View.GONE);
                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
                ll_A4198_1.setVisibility(View.GONE);

            } else {
                ll_A4195.setVisibility(View.VISIBLE);
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
                ll_A4198_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4195_1
                || compoundButton.getId() == R.id.rb_A4195_2
                || compoundButton.getId() == R.id.rb_A4195_DK
                || compoundButton.getId() == R.id.rb_A4195_RA)

        {
            if (rb_A4195_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);

                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);

            } else {
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4196_1
                || compoundButton.getId() == R.id.rb_A4196_2
                || compoundButton.getId() == R.id.rb_A4196_DK
                || compoundButton.getId() == R.id.rb_A4196_RA)

        {
            if (rb_A4196_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4197);

                ll_A4197.setVisibility(View.GONE);

            } else {
                ll_A4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4202_1
                || compoundButton.getId() == R.id.rb_A4202_2
                || compoundButton.getId() == R.id.rb_A4202_DK
                || compoundButton.getId() == R.id.rb_A4202_RA)

        {
            if (rb_A4202_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);

            } else {
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4203_1
                || compoundButton.getId() == R.id.rb_A4203_2
                || compoundButton.getId() == R.id.rb_A4203_DK
                || compoundButton.getId() == R.id.rb_A4203_RA)

        {
            if (rb_A4203_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4204.setVisibility(View.GONE);

            } else {
                ll_A4204.setVisibility(View.VISIBLE);
            }
        }

    }

    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (ed_A4178_1.getText().hashCode() == s.hashCode()) {
                if (ed_A4178_1.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4178_1.getText().toString().trim()) > 0) {
                    ClearAllcontrol.ClearAll(ll_A4178_2);
                    ll_A4178_2.setVisibility(View.GONE);
                } else {
                    ll_A4178_2.setVisibility(View.VISIBLE);
                }
            }
        }

    };

    private void events_calls() {

        btn_next9.setOnClickListener(this);
        
        rb_A4159_1.setOnCheckedChangeListener(this);
        rb_A4159_2.setOnCheckedChangeListener(this);
        rb_A4159_DK.setOnCheckedChangeListener(this);
        rb_A4159_RA.setOnCheckedChangeListener(this);
        rb_A4160_1.setOnCheckedChangeListener(this);
        rb_A4160_2.setOnCheckedChangeListener(this);
        rb_A4160_DK.setOnCheckedChangeListener(this);
        rb_A4160_RA.setOnCheckedChangeListener(this);
        rb_A4162_1.setOnCheckedChangeListener(this);
        rb_A4162_2.setOnCheckedChangeListener(this);
        rb_A4162_DK.setOnCheckedChangeListener(this);
        rb_A4162_RA.setOnCheckedChangeListener(this);
        rb_A4163_1_1.setOnCheckedChangeListener(this);
        rb_A4163_1_2.setOnCheckedChangeListener(this);
        rb_A4163_1_DK.setOnCheckedChangeListener(this);
        rb_A4163_1_RA.setOnCheckedChangeListener(this);
        rb_A4163_1.setOnCheckedChangeListener(this);
        rb_A4163_2.setOnCheckedChangeListener(this);
        rb_A4163_DK.setOnCheckedChangeListener(this);
        rb_A4163_RA.setOnCheckedChangeListener(this);
        rb_A4167_1.setOnCheckedChangeListener(this);
        rb_A4167_2.setOnCheckedChangeListener(this);
        rb_A4167_DK.setOnCheckedChangeListener(this);
        rb_A4167_RA.setOnCheckedChangeListener(this);
        rb_A4168_1_1.setOnCheckedChangeListener(this);
        rb_A4168_1_2.setOnCheckedChangeListener(this);
        rb_A4168_1_DK.setOnCheckedChangeListener(this);
        rb_A4168_1_RA.setOnCheckedChangeListener(this);
        rb_A4168_3_1.setOnCheckedChangeListener(this);
        rb_A4168_3_2.setOnCheckedChangeListener(this);
        rb_A4168_3_DK.setOnCheckedChangeListener(this);
        rb_A4168_3_RA.setOnCheckedChangeListener(this);
        rb_A4168_1.setOnCheckedChangeListener(this);
        rb_A4168_2.setOnCheckedChangeListener(this);
        rb_A4168_DK.setOnCheckedChangeListener(this);
        rb_A4168_RA.setOnCheckedChangeListener(this);
        rb_A4173_1_1.setOnCheckedChangeListener(this);
        rb_A4173_1_2.setOnCheckedChangeListener(this);
        rb_A4173_1_DK.setOnCheckedChangeListener(this);
        rb_A4173_1_RA.setOnCheckedChangeListener(this);
        rb_A4173_1.setOnCheckedChangeListener(this);
        rb_A4173_2.setOnCheckedChangeListener(this);
        rb_A4173_DK.setOnCheckedChangeListener(this);
        rb_A4173_RA.setOnCheckedChangeListener(this);
        rb_A4173_2_1.setOnCheckedChangeListener(this);
        rb_A4173_2_2.setOnCheckedChangeListener(this);
        rb_A4173_2_DK.setOnCheckedChangeListener(this);
        rb_A4173_2_RA.setOnCheckedChangeListener(this);
        rb_A4178_2_1.setOnCheckedChangeListener(this);
        rb_A4178_2_2.setOnCheckedChangeListener(this);
        rb_A4178_2_DK.setOnCheckedChangeListener(this);
        rb_A4178_2_RA.setOnCheckedChangeListener(this);
        rb_A4178_1.setOnCheckedChangeListener(this);
        rb_A4178_2.setOnCheckedChangeListener(this);
        rb_A4178_DK.setOnCheckedChangeListener(this);
        rb_A4178_RA.setOnCheckedChangeListener(this);
        rb_A4186_1.setOnCheckedChangeListener(this);
        rb_A4186_2.setOnCheckedChangeListener(this);
        rb_A4186_DK.setOnCheckedChangeListener(this);
        rb_A4186_RA.setOnCheckedChangeListener(this);
        rb_A4193_1.setOnCheckedChangeListener(this);
        rb_A4193_2.setOnCheckedChangeListener(this);
        rb_A4193_DK.setOnCheckedChangeListener(this);
        rb_A4193_RA.setOnCheckedChangeListener(this);
        rb_A4194_1.setOnCheckedChangeListener(this);
        rb_A4194_2.setOnCheckedChangeListener(this);
        rb_A4194_DK.setOnCheckedChangeListener(this);
        rb_A4194_RA.setOnCheckedChangeListener(this);
        rb_A4195_1.setOnCheckedChangeListener(this);
        rb_A4195_2.setOnCheckedChangeListener(this);
        rb_A4195_DK.setOnCheckedChangeListener(this);
        rb_A4195_RA.setOnCheckedChangeListener(this);
        rb_A4196_1.setOnCheckedChangeListener(this);
        rb_A4196_2.setOnCheckedChangeListener(this);
        rb_A4196_DK.setOnCheckedChangeListener(this);
        rb_A4196_RA.setOnCheckedChangeListener(this);
        rb_A4200_1.setOnCheckedChangeListener(this);
        rb_A4200_2.setOnCheckedChangeListener(this);
        rb_A4200_3.setOnCheckedChangeListener(this);
        rb_A4200_4.setOnCheckedChangeListener(this);
        rb_A4200_5.setOnCheckedChangeListener(this);
        rb_A4200_6.setOnCheckedChangeListener(this);
        rb_A4200_7.setOnCheckedChangeListener(this);
        rb_A4200_DK.setOnCheckedChangeListener(this);
        rb_A4200_RA.setOnCheckedChangeListener(this);
        rb_A4202_1.setOnCheckedChangeListener(this);
        rb_A4202_2.setOnCheckedChangeListener(this);
        rb_A4202_DK.setOnCheckedChangeListener(this);
        rb_A4202_RA.setOnCheckedChangeListener(this);
        rb_A4203_1.setOnCheckedChangeListener(this);
        rb_A4203_2.setOnCheckedChangeListener(this);
        rb_A4203_DK.setOnCheckedChangeListener(this);
        rb_A4203_RA.setOnCheckedChangeListener(this);

        ed_A4178_1.addTextChangedListener(generalTextWatcher);

    }

    void value_assignment() {

        study_id = "0";
        A4157 = "000";
        A4158 = "000";
        A4159 = "000";
        A4160 = "000";
        A4161 = "000";
        A4161_1 = "000";
        A4162 = "000";
        A4163_1 = "000";
        A4163 = "000";
        A4164 = "000";
        A4166 = "000";
        A4167 = "000";
        A4168_1 = "000";
        A4168_3 = "000";
        A4168 = "000";
        A4173_1 = "000";
        A4173 = "000";
        A4173_2 = "000";
        A4178_1 = "000";
        A4178_2 = "000";
        A4178 = "000";
        A4179 = "000";
        A4180 = "000";
        A4181 = "000";
        A4182 = "000";
        A4183 = "000";
        A4184 = "000";
        A4185 = "000";
        A4186 = "000";
        A4186_1 = "000";
        A4187 = "000";
        A4188 = "000";
        A4189 = "000";
        A4190 = "000";
        A4191 = "000";
        A4192 = "000";
        A4193 = "000";
        A4193_1 = "000";
        A4194 = "000";
        A4195 = "000";
        A4196 = "000";
        A4197 = "000";
        A4198_1 = "000";
        A4198 = "000";
        A4200 = "000";
        A4202 = "000";
        A4203 = "000";
        A4204 = "000";
        A4205 = "000";
        A4205_1 = "000";
        STATUS = "0";

        //A4157
        if (rb_A4157_1.isChecked()) {
            A4157 = "1";
        }
        if (rb_A4157_2.isChecked()) {
            A4157 = "2";
        }
        if (rb_A4157_DK.isChecked()) {
            A4157 = "9";
        }
        if (rb_A4157_RA.isChecked()) {
            A4157 = "8";
        }

        //A4158
        if (rb_A4158_1.isChecked()) {
            A4158 = "1";
        }
        if (rb_A4158_2.isChecked()) {
            A4158 = "2";
        }
        if (rb_A4158_DK.isChecked()) {
            A4158 = "9";
        }
        if (rb_A4158_RA.isChecked()) {
            A4158 = "8";
        }

        //A4159
        if (rb_A4159_1.isChecked()) {
            A4159 = "1";
        }
        if (rb_A4159_2.isChecked()) {
            A4159 = "2";
        }
        if (rb_A4159_DK.isChecked()) {
            A4159 = "9";
        }
        if (rb_A4159_RA.isChecked()) {
            A4159 = "8";
        }

        //A4160
        if (rb_A4160_1.isChecked()) {
            A4160 = "1";
        }
        if (rb_A4160_2.isChecked()) {
            A4160 = "2";
        }
        if (rb_A4160_DK.isChecked()) {
            A4160 = "9";
        }
        if (rb_A4160_RA.isChecked()) {
            A4160 = "8";
        }

        //A4161
        if (rb_A4161_1.isChecked()) {
            A4161 = "1";
        }
        if (rb_A4161_2.isChecked()) {
            A4161 = "2";
        }
        if (rb_A4161_DK.isChecked()) {
            A4161 = "9";
        }
        if (rb_A4161_RA.isChecked()) {
            A4161 = "8";
        }

        //A4161_1
        if (rb_A4161_1_1.isChecked()) {
            A4161_1 = "1";
        }
        if (rb_A4161_1_2.isChecked()) {
            A4161_1 = "2";
        }
        if (rb_A4161_1_DK.isChecked()) {
            A4161_1 = "9";
        }
        if (rb_A4161_1_RA.isChecked()) {
            A4161_1 = "8";
        }

        //A4162
        if (rb_A4162_1.isChecked()) {
            A4162 = "1";
        }
        if (rb_A4162_2.isChecked()) {
            A4162 = "2";
        }
        if (rb_A4162_DK.isChecked()) {
            A4162 = "9";
        }
        if (rb_A4162_RA.isChecked()) {
            A4162 = "8";
        }

        //A4163_1
        if (rb_A4163_1_1.isChecked()) {
            A4163_1 = "1";
        }
        if (rb_A4163_1_2.isChecked()) {
            A4163_1 = "2";
        }
        if (rb_A4163_1_DK.isChecked()) {
            A4163_1 = "9";
        }
        if (rb_A4163_1_RA.isChecked()) {
            A4163_1 = "8";
        }

        //A4163
        if (rb_A4163_1.isChecked()) {
            A4163 = "1";
        }
        if (rb_A4163_2.isChecked()) {
            A4163 = "2";
        }
        if (rb_A4163_DK.isChecked()) {
            A4163 = "9";
        }
        if (rb_A4163_RA.isChecked()) {
            A4163 = "8";
        }

        //A4164
        if (ed_A4164.getText().toString().trim().length() > 0) {
            A4164 = ed_A4164.getText().toString().trim();
        }

        //A4166
        if (rb_A4166_1.isChecked()) {
            A4166 = "1";
        }
        if (rb_A4166_2.isChecked()) {
            A4166 = "2";
        }
        if (rb_A4166_DK.isChecked()) {
            A4166 = "9";
        }
        if (rb_A4166_RA.isChecked()) {
            A4166 = "8";
        }

        //A4167
        if (rb_A4167_1.isChecked()) {
            A4167 = "1";
        }
        if (rb_A4167_2.isChecked()) {
            A4167 = "2";
        }
        if (rb_A4167_DK.isChecked()) {
            A4167 = "9";
        }
        if (rb_A4167_RA.isChecked()) {
            A4167 = "8";
        }

        //A4168_1
        if (rb_A4168_1_1.isChecked()) {
            A4168_1 = "1";
        }
        if (rb_A4168_1_2.isChecked()) {
            A4168_1 = "2";
        }
        if (rb_A4168_1_DK.isChecked()) {
            A4168_1 = "9";
        }
        if (rb_A4168_1_RA.isChecked()) {
            A4168_1 = "8";
        }

        //A4168_3
        if (rb_A4168_3_1.isChecked()) {
            A4168_3 = "1";
        }
        if (rb_A4168_3_2.isChecked()) {
            A4168_3 = "2";
        }
        if (rb_A4168_3_DK.isChecked()) {
            A4168_3 = "9";
        }
        if (rb_A4168_3_RA.isChecked()) {
            A4168_3 = "8";
        }

        //A4168
        if (rb_A4168_1.isChecked()) {
            A4168 = "1";
        }
        if (rb_A4168_2.isChecked()) {
            A4168 = "2";
        }
        if (rb_A4168_DK.isChecked()) {
            A4168 = "9";
        }
        if (rb_A4168_RA.isChecked()) {
            A4168 = "8";
        }

        //A4173_1
        if (rb_A4173_1_1.isChecked()) {
            A4173_1 = "1";
        }
        if (rb_A4173_1_2.isChecked()) {
            A4173_1 = "2";
        }
        if (rb_A4173_1_DK.isChecked()) {
            A4173_1 = "9";
        }
        if (rb_A4173_1_RA.isChecked()) {
            A4173_1 = "8";
        }

        //A4173
        if (rb_A4173_1.isChecked()) {
            A4173 = "1";
        }
        if (rb_A4173_2.isChecked()) {
            A4173 = "2";
        }
        if (rb_A4173_DK.isChecked()) {
            A4173 = "9";
        }
        if (rb_A4173_RA.isChecked()) {
            A4173 = "8";
        }

        //A4173_2
        if (rb_A4173_2_1.isChecked()) {
            A4173_2 = "1";
        }
        if (rb_A4173_2_2.isChecked()) {
            A4173_2 = "2";
        }
        if (rb_A4173_2_DK.isChecked()) {
            A4173_2 = "9";
        }
        if (rb_A4173_2_RA.isChecked()) {
            A4173_2 = "8";
        }

        //A4178_1
        if (ed_A4178_1.getText().toString().trim().length() > 0) {
            A4178_1 = ed_A4178_1.getText().toString().trim();
        }

        //A4178_2
        if (rb_A4178_2_1.isChecked()) {
            A4178_2 = "1";
        }
        if (rb_A4178_2_2.isChecked()) {
            A4178_2 = "2";
        }
        if (rb_A4178_2_DK.isChecked()) {
            A4178_2 = "9";
        }
        if (rb_A4178_2_RA.isChecked()) {
            A4178_2 = "8";
        }

        //A4178
        if (rb_A4178_1.isChecked()) {
            A4178 = "1";
        }
        if (rb_A4178_2.isChecked()) {
            A4178 = "2";
        }
        if (rb_A4178_DK.isChecked()) {
            A4178 = "9";
        }
        if (rb_A4178_RA.isChecked()) {
            A4178 = "8";
        }

        //A4179
        if (rb_A4179_1.isChecked()) {
            A4179 = "1";
        }
        if (rb_A4179_2.isChecked()) {
            A4179 = "2";
        }
        if (rb_A4179_DK.isChecked()) {
            A4179 = "9";
        }
        if (rb_A4179_RA.isChecked()) {
            A4179 = "8";
        }

        //A4180
        if (ed_A4180.getText().toString().trim().length() > 0) {
            A4180 = ed_A4180.getText().toString().trim();
        }

        //A4181
        if (rb_A4181_1.isChecked()) {
            A4181 = "1";
        }
        if (rb_A4181_2.isChecked()) {
            A4181 = "2";
        }
        if (rb_A4181_DK.isChecked()) {
            A4181 = "9";
        }
        if (rb_A4181_RA.isChecked()) {
            A4181 = "8";
        }

        //A4182
        if (rb_A4182_1.isChecked()) {
            A4182 = "1";
        }
        if (rb_A4182_2.isChecked()) {
            A4182 = "2";
        }
        if (rb_A4182_DK.isChecked()) {
            A4182 = "9";
        }
        if (rb_A4182_RA.isChecked()) {
            A4182 = "8";
        }

        //A4183
        if (rb_A4183_1.isChecked()) {
            A4183 = "1";
        }
        if (rb_A4183_2.isChecked()) {
            A4183 = "2";
        }
        if (rb_A4183_DK.isChecked()) {
            A4183 = "9";
        }
        if (rb_A4183_RA.isChecked()) {
            A4183 = "8";
        }

        //A4184
        if (rb_A4184_1.isChecked()) {
            A4184 = "1";
        }
        if (rb_A4184_2.isChecked()) {
            A4184 = "2";
        }
        if (rb_A4184_DK.isChecked()) {
            A4184 = "9";
        }
        if (rb_A4184_RA.isChecked()) {
            A4184 = "8";
        }

        //A4185
        if (rb_A4185_1.isChecked()) {
            A4185 = "1";
        }
        if (rb_A4185_2.isChecked()) {
            A4185 = "2";
        }
        if (rb_A4185_DK.isChecked()) {
            A4185 = "9";
        }
        if (rb_A4185_RA.isChecked()) {
            A4185 = "8";
        }

        //A4186
        if (rb_A4186_1.isChecked()) {
            A4186 = "1";
        }
        if (rb_A4186_2.isChecked()) {
            A4186 = "2";
        }
        if (rb_A4186_DK.isChecked()) {
            A4186 = "9";
        }
        if (rb_A4186_RA.isChecked()) {
            A4186 = "8";
        }

        //A4186_1
        if (rb_A4186_1_1.isChecked()) {
            A4186_1 = "1";
        }
        if (rb_A4186_1_2.isChecked()) {
            A4186_1 = "2";
        }
        if (rb_A4186_1_DK.isChecked()) {
            A4186_1 = "9";
        }
        if (rb_A4186_1_RA.isChecked()) {
            A4186_1 = "8";
        }

        //A4187
        if (rb_A4187_1.isChecked()) {
            A4187 = "1";
        }
        if (rb_A4187_2.isChecked()) {
            A4187 = "2";
        }
        if (rb_A4187_DK.isChecked()) {
            A4187 = "9";
        }
        if (rb_A4187_RA.isChecked()) {
            A4187 = "8";
        }

        //A4188
        if (rb_A4188_1.isChecked()) {
            A4188 = "1";
        }
        if (rb_A4188_2.isChecked()) {
            A4188 = "2";
        }
        if (rb_A4188_DK.isChecked()) {
            A4188 = "9";
        }
        if (rb_A4188_RA.isChecked()) {
            A4188 = "8";
        }

        //A4189
        if (rb_A4189_1.isChecked()) {
            A4189 = "1";
        }
        if (rb_A4189_2.isChecked()) {
            A4189 = "2";
        }
        if (rb_A4189_DK.isChecked()) {
            A4189 = "9";
        }
        if (rb_A4189_RA.isChecked()) {
            A4189 = "8";
        }

        //A4190
        if (rb_A4190_1.isChecked()) {
            A4190 = "1";
        }
        if (rb_A4190_2.isChecked()) {
            A4190 = "2";
        }
        if (rb_A4190_DK.isChecked()) {
            A4190 = "9";
        }
        if (rb_A4190_RA.isChecked()) {
            A4190 = "8";
        }

        //A4191
        if (rb_A4191_1.isChecked()) {
            A4191 = "1";
        }
        if (rb_A4191_2.isChecked()) {
            A4191 = "2";
        }
        if (rb_A4191_DK.isChecked()) {
            A4191 = "9";
        }
        if (rb_A4191_RA.isChecked()) {
            A4191 = "8";
        }

        //A4192
        if (ed_A4192.getText().toString().trim().length() > 0) {
            A4192 = ed_A4192.getText().toString().trim();
        }

        //A4193
        if (rb_A4193_1.isChecked()) {
            A4193 = "1";
        }
        if (rb_A4193_2.isChecked()) {
            A4193 = "2";
        }
        if (rb_A4193_DK.isChecked()) {
            A4193 = "9";
        }
        if (rb_A4193_RA.isChecked()) {
            A4193 = "8";
        }

        //A4193_1
        if (rb_A4193_1_1.isChecked()) {
            A4193_1 = "1";
        }
        if (rb_A4193_1_2.isChecked()) {
            A4193_1 = "2";
        }
        if (rb_A4193_1_3.isChecked()) {
            A4193_1 = "3";
        }
        if (rb_A4193_1_4.isChecked()) {
            A4193_1 = "4";
        }
        if (rb_A4193_1_DK.isChecked()) {
            A4193_1 = "9";
        }
        if (rb_A4193_1_RA.isChecked()) {
            A4193_1 = "8";
        }

        //A4194
        if (rb_A4194_1.isChecked()) {
            A4194 = "1";
        }
        if (rb_A4194_2.isChecked()) {
            A4194 = "2";
        }
        if (rb_A4194_DK.isChecked()) {
            A4194 = "9";
        }
        if (rb_A4194_RA.isChecked()) {
            A4194 = "8";
        }

        //A4195
        if (rb_A4195_1.isChecked()) {
            A4195 = "1";
        }
        if (rb_A4195_2.isChecked()) {
            A4195 = "2";
        }
        if (rb_A4195_DK.isChecked()) {
            A4195 = "9";
        }
        if (rb_A4195_RA.isChecked()) {
            A4195 = "8";
        }

        //A4196
        if (rb_A4196_1.isChecked()) {
            A4196 = "1";
        }
        if (rb_A4196_2.isChecked()) {
            A4196 = "2";
        }
        if (rb_A4196_DK.isChecked()) {
            A4196 = "9";
        }
        if (rb_A4196_RA.isChecked()) {
            A4196 = "8";
        }

        //A4197
        if (rb_A4197_1.isChecked()) {
            A4197 = "1";
        }
        if (rb_A4197_2.isChecked()) {
            A4197 = "2";
        }
        if (rb_A4197_DK.isChecked()) {
            A4197 = "9";
        }
        if (rb_A4197_RA.isChecked()) {
            A4197 = "8";
        }

        //A4198_1
        if (rb_A4198_1_1.isChecked()) {
            A4198_1 = "1";
        }
        if (rb_A4198_1_2.isChecked()) {
            A4198_1 = "2";
        }
        if (rb_A4198_1_DK.isChecked()) {
            A4198_1 = "9";
        }
        if (rb_A4198_1_RA.isChecked()) {
            A4198_1 = "8";
        }

        //A4198
        if (rb_A4198_1.isChecked()) {
            A4198 = "1";
        }
        if (rb_A4198_2.isChecked()) {
            A4198 = "2";
        }
        if (rb_A4198_3.isChecked()) {
            A4198 = "3";
        }
        if (rb_A4198_4.isChecked()) {
            A4198 = "4";
        }
        if (rb_A4198_5.isChecked()) {
            A4198 = "5";
        }
        if (rb_A4198_DK.isChecked()) {
            A4198 = "9";
        }
        if (rb_A4198_RA.isChecked()) {
            A4198 = "8";
        }

        //A4200
        if (rb_A4200_1.isChecked()) {
            A4200 = "1";
        }
        if (rb_A4200_2.isChecked()) {
            A4200 = "2";
        }
        if (rb_A4200_3.isChecked()) {
            A4200 = "3";
        }
        if (rb_A4200_4.isChecked()) {
            A4200 = "4";
        }
        if (rb_A4200_5.isChecked()) {
            A4200 = "5";
        }
        if (rb_A4200_6.isChecked()) {
            A4200 = "6";
        }
        if (rb_A4200_7.isChecked()) {
            A4200 = "7";
        }
        if (rb_A4200_DK.isChecked()) {
            A4200 = "9";
        }
        if (rb_A4200_RA.isChecked()) {
            A4200 = "8";
        }

        //A4202
        if (rb_A4202_1.isChecked()) {
            A4202 = "1";
        }
        if (rb_A4202_2.isChecked()) {
            A4202 = "2";
        }
        if (rb_A4202_DK.isChecked()) {
            A4202 = "9";
        }
        if (rb_A4202_RA.isChecked()) {
            A4202 = "8";
        }

        //A4203
        if (rb_A4203_1.isChecked()) {
            A4203 = "1";
        }
        if (rb_A4203_2.isChecked()) {
            A4203 = "2";
        }
        if (rb_A4203_DK.isChecked()) {
            A4203 = "9";
        }
        if (rb_A4203_RA.isChecked()) {
            A4203 = "8";
        }

        //A4204
        if (rb_A4204_1.isChecked()) {
            A4204 = "1";
        }
        if (rb_A4204_2.isChecked()) {
            A4204 = "2";
        }
        if (rb_A4204_DK.isChecked()) {
            A4204 = "9";
        }
        if (rb_A4204_RA.isChecked()) {
            A4204 = "8";
        }

        //A4205
        if (rb_A4205_1.isChecked()) {
            A4205 = "1";
        }
        if (rb_A4205_2.isChecked()) {
            A4205 = "2";
        }
        if (rb_A4205_DK.isChecked()) {
            A4205 = "9";
        }
        if (rb_A4205_RA.isChecked()) {
            A4205 = "8";
        }

        //A4205_1
        if (rb_A4205_1_1.isChecked()) {
            A4205_1 = "1";
        }
        if (rb_A4205_1_2.isChecked()) {
            A4205_1 = "2";
        }
        if (rb_A4205_1_DK.isChecked()) {
            A4205_1 = "9";
        }
        if (rb_A4205_1_RA.isChecked()) {
            A4205_1 = "8";
        }
        
        
    }

    void insert_data() {

        String query = "insert into A4157_A4205("

                + Global.A.A4157_A4205.study_id + ","
                + Global.A.A4157_A4205.A4157 + ","
                + Global.A.A4157_A4205.A4158 + ","
                + Global.A.A4157_A4205.A4159 + ","
                + Global.A.A4157_A4205.A4160 + ","
                + Global.A.A4157_A4205.A4161 + ","
                + Global.A.A4157_A4205.A4161_1 + ","
                + Global.A.A4157_A4205.A4162 + ","
                + Global.A.A4157_A4205.A4163_1 + ","
                + Global.A.A4157_A4205.A4163 + ","
                + Global.A.A4157_A4205.A4164 + ","
                + Global.A.A4157_A4205.A4166 + ","
                + Global.A.A4157_A4205.A4167 + ","
                + Global.A.A4157_A4205.A4168_1 + ","
                + Global.A.A4157_A4205.A4168_3 + ","
                + Global.A.A4157_A4205.A4168 + ","
                + Global.A.A4157_A4205.A4173_1 + ","
                + Global.A.A4157_A4205.A4173 + ","
                + Global.A.A4157_A4205.A4173_2 + ","
                + Global.A.A4157_A4205.A4178_1 + ","
                + Global.A.A4157_A4205.A4178_2 + ","
                + Global.A.A4157_A4205.A4178 + ","
                + Global.A.A4157_A4205.A4179 + ","
                + Global.A.A4157_A4205.A4180 + ","
                + Global.A.A4157_A4205.A4181 + ","
                + Global.A.A4157_A4205.A4182 + ","
                + Global.A.A4157_A4205.A4183 + ","
                + Global.A.A4157_A4205.A4184 + ","
                + Global.A.A4157_A4205.A4185 + ","
                + Global.A.A4157_A4205.A4186 + ","
                + Global.A.A4157_A4205.A4186_1 + ","
                + Global.A.A4157_A4205.A4187 + ","
                + Global.A.A4157_A4205.A4188 + ","
                + Global.A.A4157_A4205.A4189 + ","
                + Global.A.A4157_A4205.A4190 + ","
                + Global.A.A4157_A4205.A4191 + ","
                + Global.A.A4157_A4205.A4192 + ","
                + Global.A.A4157_A4205.A4193 + ","
                + Global.A.A4157_A4205.A4193_1 + ","
                + Global.A.A4157_A4205.A4194 + ","
                + Global.A.A4157_A4205.A4195 + ","
                + Global.A.A4157_A4205.A4196 + ","
                + Global.A.A4157_A4205.A4197 + ","
                + Global.A.A4157_A4205.A4198_1 + ","
                + Global.A.A4157_A4205.A4198 + ","
                + Global.A.A4157_A4205.A4200 + ","
                + Global.A.A4157_A4205.A4202 + ","
                + Global.A.A4157_A4205.A4203 + ","
                + Global.A.A4157_A4205.A4204 + ","
                + Global.A.A4157_A4205.A4205 + ","
                + Global.A.A4157_A4205.A4205_1 + ","
                + Global.A.A4157_A4205.STATUS   + ")" +

                " values ('" +

                study_id     + "','" +
                A4157        + "','" +
                A4158        + "','" +
                A4159        + "','" +
                A4160        + "','" +
                A4161        + "','" +
                A4161_1      + "','" +
                A4162        + "','" +
                A4163_1      + "','" +
                A4163        + "','" +
                A4164        + "','" +
                A4166        + "','" +
                A4167        + "','" +
                A4168_1      + "','" +
                A4168_3      + "','" +
                A4168        + "','" +
                A4173_1      + "','" +
                A4173        + "','" +
                A4173_2      + "','" +
                A4178_1      + "','" +
                A4178_2      + "','" +
                A4178        + "','" +
                A4179        + "','" +
                A4180        + "','" +
                A4181        + "','" +
                A4182        + "','" +
                A4183        + "','" +
                A4184        + "','" +
                A4185        + "','" +
                A4186        + "','" +
                A4186_1      + "','" +
                A4187        + "','" +
                A4188        + "','" +
                A4189        + "','" +
                A4190        + "','" +
                A4191        + "','" +
                A4192        + "','" +
                A4193        + "','" +
                A4193_1      + "','" +
                A4194        + "','" +
                A4195        + "','" +
                A4196        + "','" +
                A4197        + "','" +
                A4198_1      + "','" +
                A4198        + "','" +
                A4200        + "','" +
                A4202        + "','" +
                A4203        + "','" +
                A4204        + "','" +
                A4205        + "','" +
                A4205_1      + "','" +
                STATUS       + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "9th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

         if (Gothrough.IamHiden(ll_A4157) == false) {
            return false;
         }
        if (Gothrough.IamHiden(ll_A4158) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4159) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4160) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4161) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4161_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4162) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4163_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4163) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4164) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4166) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4167) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4168_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4168_3) == false) {
            return false;
        }
         if (Gothrough.IamHiden(ll_A4168) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4173_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4173) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4173_2) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4178_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4178_2) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4178) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4179) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4180) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4181) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4182) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4183) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4184) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4185) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4186) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4186_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4187) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4188) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4189) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4190) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4191) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4192) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4193) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4193_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4194) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4195) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4196) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4197) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4198_1) == false) {
            return false;
        }
        
         if (Gothrough.IamHiden(ll_A4198) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4200) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4202) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4203) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4204) == false) {
            return false;
         }
         
        if (Gothrough.IamHiden(ll_A4205) == false) {
            return false;
         }

        return Gothrough.IamHiden(ll_A4205_1) != false;
    }

}

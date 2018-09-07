package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VasaAdult extends AppCompatActivity implements View.OnClickListener {

    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vasa_adult);

        fun_initalization();

        btn_next.setOnClickListener(this);
    }

    void fun_initalization() {
        btn_next = (Button) findViewById(R.id.btn_next);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btn_next) {

            Intent itt = new Intent(VasaAdult.this, VasaChild.class);
            startActivity(itt);

        }
    }
}
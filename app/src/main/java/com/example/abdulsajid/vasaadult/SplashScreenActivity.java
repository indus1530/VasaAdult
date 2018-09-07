/*
package com.example.abdulsajid.vasaadult;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import utils.MyPreferences;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);



     setContentView(R.layout.activity_splash_screen);



        final MyPreferences preferences = new MyPreferences(this);
    //    if (preferences.getReq1() == null) {
         //  preferences.setReq1("http://43.245.131.159/umeed/Monitoring");


        preferences.setReq1("http://10.198.96.203/sm/welcome/collect_upload_data");


     //   preferences.setReqLogin("http://10.198.96.124:61259/Testing/check_user_id");

        //    preferences.setReq1("http://43.245.131.159/umeed/Testing/Monitoring");
        //preferences.setReqLogin("http://10.198.97.189:61259///Testing/check_user_id");

     //   }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                */
/* Create an Intent that will start the Menu-Activity. *//*


// show login or main page
                Intent mainIntent;
                if (preferences.getUserId() == -1) {
                    //mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                } else {
                  //  mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                }
                    //mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);

                    SplashScreenActivity.this.startActivity(mainIntent);
                    SplashScreenActivity.this.finish();
            }
        }, 7000);
    }



}
*/

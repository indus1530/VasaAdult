package data;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import Global.A.A4001_A4014;
import Global.A.A4051_A4066;
import Global.A.A4067_A4080;
import Global.A.A4081_A4094;
import Global.A.A4095_A4108;
import Global.A.A4109_A4125;
import Global.A.A4126_A4140;
import Global.A.A4144_A4156;
import Global.A.A4157_A4205;
import Global.A.A4206_A4207;
import Global.A.A4251;
import Global.A.A4301_A4315;
import Global.A.A4351_A4364;
import Global.A.A4401_A4473;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;


public class UploadHouseInfoAsync extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    // wait for Toast then kill app
    Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(800); // As I am using LENGTH_LONG in Toast
                // Your_Activity.this.finish();


                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                // getActivity().finish();


                System.exit(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public UploadHouseInfoAsync(Context context) {

        //stop interview
        // if(InterviewUploadingStatus.status<2)
        //   this.cancel(false);

        mContext = context;
        dialog = new ProgressDialog(context);
        param = new HashMap<>();

    }

    @Override
    protected void onPreExecute() {
        dialog.setMessage("Uploading interview Please wait ....");
        dialog.setCancelable(false);
        dialog.show();

        HashMap<String, List<String>> map = QuestionModel.quest.get("a");

        //region Query

        String query1 = "select * from A4001_A4014 where id = '%s' order by id  desc LIMIT 1";
        String query2 = "select * from A4051_A4066 where id = '%s' order by id  desc LIMIT 1";
        String query3 = "select * from A4067_A4080 where id = '%s' order by id  desc LIMIT 1";
        String query4 = "select * from A4081_A4094 where id = '%s' order by id  desc LIMIT 1";
        String query5 = "select * from A4095_A4108 where id = '%s' order by id  desc LIMIT 1";
        String query6 = "select * from A4109_A4125 where id = '%s' order by id  desc LIMIT 1";
        String query7 = "select * from A4126_A4140 where id = '%s' order by id  desc LIMIT 1";
        String query8 = "select * from A4144_A4156 where id = '%s' order by id  desc LIMIT 1";
        String query9 = "select * from A4157_A4205 where id = '%s' order by id  desc LIMIT 1";
        String query10 = "select * from A4206_A4207 where id = '%s' order by id  desc LIMIT 1";
        String query11 = "select * from A4251_A4284 where id = '%s' order by id  desc LIMIT 1";
        String query12 = "select * from A4301_A4315 where id = '%s' order by id  desc LIMIT 1";
        String query13 = "select * from A4351_A4364 where id = '%s' order by id  desc LIMIT 1";
        String query14 = "select * from A4401_A4473 where id = '%s' order by id  desc LIMIT 1";

        query1 = String.format(query1, 1);
        query2 = String.format(query2, 1);
        query3 = String.format(query3, 1);
        query4 = String.format(query4, 1);
        query5 = String.format(query5, 1);
        query6 = String.format(query6, 1);
        query7 = String.format(query7, 1);
        query8 = String.format(query8, 1);
        query9 = String.format(query9, 1);
        query10 = String.format(query10, 1);
        query11 = String.format(query11, 1);
        query12 = String.format(query12, 1);
        query13 = String.format(query13, 1);
        query14 = String.format(query14, 1);

        LocalDataManager Lm = new LocalDataManager(mContext);

        Cursor c1 = LocalDataManager.database.rawQuery(query1, null);
        Cursor c2 = LocalDataManager.database.rawQuery(query2, null);
        Cursor c3 = LocalDataManager.database.rawQuery(query3, null);
        Cursor c4 = LocalDataManager.database.rawQuery(query4, null);
        Cursor c5 = LocalDataManager.database.rawQuery(query5, null);
        Cursor c6 = LocalDataManager.database.rawQuery(query6, null);
        Cursor c7 = LocalDataManager.database.rawQuery(query7, null);
        Cursor c8 = LocalDataManager.database.rawQuery(query8, null);
        Cursor c9 = LocalDataManager.database.rawQuery(query9, null);
        Cursor c10 = LocalDataManager.database.rawQuery(query10, null);
        Cursor c11 = LocalDataManager.database.rawQuery(query11, null);
        Cursor c12 = LocalDataManager.database.rawQuery(query12, null);
        Cursor c13 = LocalDataManager.database.rawQuery(query13, null);
        Cursor c14 = LocalDataManager.database.rawQuery(query14, null);

        if (c1 != null) {
            if (c1.moveToFirst()) {
                param.put("id", c1.getString(0));
                param.put(A4001_A4014.study_id, "1");
                param.put(A4001_A4014.A4001, "2");
                param.put(A4001_A4014.A4002, "3");
                param.put(A4001_A4014.A4003, "4");
                param.put(A4001_A4014.A4004, "5");
                param.put(A4001_A4014.A4005, "6");
                param.put(A4001_A4014.A4006, "7");
                param.put(A4001_A4014.A4007, "8");
                param.put(A4001_A4014.A40071, "9");
                param.put(A4001_A4014.A4008, "10");
                param.put(A4001_A4014.A4009a, "11");
                param.put(A4001_A4014.A4010, "12");
                param.put(A4001_A4014.A4011, "13");
                param.put(A4001_A4014.A4012, "14");
                param.put(A4001_A4014.A4013u, "15");
                param.put(A4001_A4014.A4013d, "16");
                param.put(A4001_A4014.A4013m, "17");
                param.put(A4001_A4014.A4013y, "18");
                param.put(A4001_A4014.STATUS, "19");
            }
        }


        if (c2 != null) {
            if (c2.moveToFirst()) {
                param.put("id", c2.getString(0));
                param.put(A4051_A4066.studyId, "1");
                param.put(A4051_A4066.A4051, "2");
                param.put(A4051_A4066.A4052u, "3");
                param.put(A4051_A4066.A4052D, "4");
                param.put(A4051_A4066.A4052M, "5");
                param.put(A4051_A4066.A4053, "6");
                param.put(A4051_A4066.A4054, "7");
                param.put(A4051_A4066.A4055, "8");
                param.put(A4051_A4066.A4056, "9");
                param.put(A4051_A4066.A4057, "10");
                param.put(A4051_A4066.A4058, "11");
                param.put(A4051_A4066.A4059u, "12");
                param.put(A4051_A4066.A4059D, "13");
                param.put(A4051_A4066.A4059M, "14");
                param.put(A4051_A4066.A4060, "15");
                param.put(A4051_A4066.A4061, "16");
                param.put(A4051_A4066.A4062, "17");
                param.put(A4051_A4066.A4063, "18");
                param.put(A4051_A4066.A4064u, "19");
                param.put(A4051_A4066.A4064D, "20");
                param.put(A4051_A4066.A4064M, "21");
                param.put(A4051_A4066.A40641, "22");
                param.put(A4051_A4066.A4065, "23");
                param.put(A4051_A4066.A4066, "24");
                param.put(A4051_A4066.STATUS, "25");
            }
        }

        if (c3 != null) {
            if (c3.moveToFirst()) {
                param.put("id", c3.getString(0));
                param.put(A4067_A4080.studyId, "1");
                param.put(A4067_A4080.A4067, "2");
                param.put(A4067_A4080.A4068, "3");
                param.put(A4067_A4080.A4069u, "4");
                param.put(A4067_A4080.A4069H, "5");
                param.put(A4067_A4080.A4069D, "6");
                param.put(A4067_A4080.A4069M, "7");
                param.put(A4067_A4080.A4070, "8");
                param.put(A4067_A4080.A4071, "9");
                param.put(A4067_A4080.A4072u, "10");
                param.put(A4067_A4080.A4072D, "11");
                param.put(A4067_A4080.A4072M, "12");
                param.put(A4067_A4080.A4073, "13");
                param.put(A4067_A4080.A4074, "14");
                param.put(A4067_A4080.A4075u, "15");
                param.put(A4067_A4080.A4075D, "16");
                param.put(A4067_A4080.A4075M, "17");
                param.put(A4067_A4080.A4076, "18");
                param.put(A4067_A4080.A4077u, "19");
                param.put(A4067_A4080.A4077D, "20");
                param.put(A4067_A4080.A4077M, "21");
                param.put(A4067_A4080.A4078, "22");
                param.put(A4067_A4080.A4079, "23");
                param.put(A4067_A4080.A4080, "24");
                param.put(A4067_A4080.STATUS, "25");
            }

        }

        if (c4 != null) {
            if (c4.moveToFirst()) {
                param.put("id", c4.getString(0));
                param.put(A4081_A4094.study_id, "1");
                param.put(A4081_A4094.A4081, "2");
                param.put(A4081_A4094.A4082u, "3");
                param.put(A4081_A4094.A4082D, "4");
                param.put(A4081_A4094.A4082M, "5");
                param.put(A4081_A4094.A4082Y, "6");
                param.put(A4081_A4094.A4083, "7");
                param.put(A4081_A4094.A4084, "8");
                param.put(A4081_A4094.A4085u, "9");
                param.put(A4081_A4094.A4085D, "10");
                param.put(A4081_A4094.A4085M, "11");
                param.put(A4081_A4094.A4086, "12");
                param.put(A4081_A4094.A4087u, "13");
                param.put(A4081_A4094.A4087D, "14");
                param.put(A4081_A4094.A4087M, "15");
                param.put(A4081_A4094.A4088, "16");
                param.put(A4081_A4094.A4089, "17");
                param.put(A4081_A4094.A4090, "18");
                param.put(A4081_A4094.A4091, "19");
                param.put(A4081_A4094.A4092, "20");
                param.put(A4081_A4094.A4093, "21");
                param.put(A4081_A4094.A4094u, "22");
                param.put(A4081_A4094.A4094m, "23");
                param.put(A4081_A4094.A4094H, "24");
                param.put(A4081_A4094.A4094D, "25");
                param.put(A4081_A4094.STATUS, "26");
            }

        }

        if (c5 != null) {
            if (c5.moveToFirst()) {
                param.put("id", c5.getString(0));
                param.put(A4095_A4108.study_id, "1");
                param.put(A4095_A4108.A4095, "2");
                param.put(A4095_A4108.A4096, "3");
                param.put(A4095_A4108.A4097u, "4");
                param.put(A4095_A4108.A4097D, "5");
                param.put(A4095_A4108.A4097M, "6");
                param.put(A4095_A4108.A4098, "7");
                param.put(A4095_A4108.A4099u, "8");
                param.put(A4095_A4108.A4099D, "9");
                param.put(A4095_A4108.A4099M, "10");
                param.put(A4095_A4108.A4100, "11");
                param.put(A4095_A4108.A4101u, "12");
                param.put(A4095_A4108.A4101D, "13");
                param.put(A4095_A4108.A4101M, "14");
                param.put(A4095_A4108.A4102, "15");
                param.put(A4095_A4108.A4103, "16");
                param.put(A4095_A4108.A4104, "17");
                param.put(A4095_A4108.A4105, "18");
                param.put(A4095_A4108.A4106, "19");
                param.put(A4095_A4108.A4107, "20");
                param.put(A4095_A4108.A4108, "21");
                param.put(A4095_A4108.STATUS, "22");
            }

        }

        if (c6 != null) {
            if (c6.moveToFirst()) {
                param.put("id", c6.getString(0));
                param.put(A4109_A4125.study_id, "1");
                param.put(A4109_A4125.A4109, "2");
                param.put(A4109_A4125.A4110, "3");
                param.put(A4109_A4125.A4111, "4");
                param.put(A4109_A4125.A4112, "5");
                param.put(A4109_A4125.A4113, "6");
                param.put(A4109_A4125.A4114, "7");
                param.put(A4109_A4125.A4115, "8");
                param.put(A4109_A4125.A4116, "9");
                param.put(A4109_A4125.A4117u, "10");
                param.put(A4109_A4125.A4117D, "11");
                param.put(A4109_A4125.A4117M, "12");
                param.put(A4109_A4125.A4118, "13");
                param.put(A4109_A4125.A4119, "14");
                param.put(A4109_A4125.A4120, "15");
                param.put(A4109_A4125.A4121, "16");
                param.put(A4109_A4125.A4122, "17");
                param.put(A4109_A4125.A4123, "18");
                param.put(A4109_A4125.A4124, "19");
                param.put(A4109_A4125.A4125, "20");
                param.put(A4109_A4125.STATUS, "21");
            }

        }


        if (c7 != null) {
            if (c7.moveToFirst()) {
                param.put("id", c7.getString(0));
                param.put(A4126_A4140.study_id, "1");
                param.put(A4126_A4140.A4126, "2");
                param.put(A4126_A4140.A4127u, "3");
                param.put(A4126_A4140.A4127D, "4");
                param.put(A4126_A4140.A4127M, "5");
                param.put(A4126_A4140.A4128, "6");
                param.put(A4126_A4140.A4129, "7");
                param.put(A4126_A4140.A4130u, "8");
                param.put(A4126_A4140.A4130D, "9");
                param.put(A4126_A4140.A4130M, "10");
                param.put(A4126_A4140.A4131, "11");
                param.put(A4126_A4140.A4132, "12");
                param.put(A4126_A4140.A4133, "13");
                param.put(A4126_A4140.A4134u, "14");
                param.put(A4126_A4140.A4134D, "15");
                param.put(A4126_A4140.A4134M, "16");
                param.put(A4126_A4140.A4135, "17");
                param.put(A4126_A4140.A4136, "18");
                param.put(A4126_A4140.A4137, "19");
                param.put(A4126_A4140.A4138, "20");
                param.put(A4126_A4140.A4139, "21");
                param.put(A4126_A4140.A4140, "22");
                param.put(A4126_A4140.STATUS, "23");
            }

        }


        if (c8 != null) {
            if (c8.moveToFirst()) {
                param.put("id", c8.getString(0));
                param.put(A4144_A4156.study_id, "1");
                param.put(A4144_A4156.A4144, "2");
                param.put(A4144_A4156.A4145, "3");
                param.put(A4144_A4156.A4146, "4");
                param.put(A4144_A4156.A4147, "5");
                param.put(A4144_A4156.A4148, "6");
                param.put(A4144_A4156.A4149, "7");
                param.put(A4144_A4156.A4150_u, "8");
                param.put(A4144_A4156.A4150_a, "9");
                param.put(A4144_A4156.A4150_b, "10");
                param.put(A4144_A4156.A4151, "11");
                param.put(A4144_A4156.A4152, "12");
                param.put(A4144_A4156.A4153, "13");
                param.put(A4144_A4156.A4154, "14");
                param.put(A4144_A4156.A4155, "15");
                param.put(A4144_A4156.A4156, "16");
                param.put(A4144_A4156.STATUS, "17");
            }

        }


        if (c9 != null) {
            if (c9.moveToFirst()) {
                param.put("id", c9.getString(0));
                param.put(A4157_A4205.study_id, "1");
                param.put(A4157_A4205.A4157, "2");
                param.put(A4157_A4205.A4158, "3");
                param.put(A4157_A4205.A4159, "4");
                param.put(A4157_A4205.A4160, "5");
                param.put(A4157_A4205.A4161, "6");
                param.put(A4157_A4205.A4161_1, "7");
                param.put(A4157_A4205.A4162, "8");
                param.put(A4157_A4205.A4163_1, "9");
                param.put(A4157_A4205.A4163, "10");
                param.put(A4157_A4205.A4164, "11");
                param.put(A4157_A4205.A4166, "12");
                param.put(A4157_A4205.A4167, "13");
                param.put(A4157_A4205.A4168_1, "14");
                param.put(A4157_A4205.A4168_3, "15");
                param.put(A4157_A4205.A4168, "16");
                param.put(A4157_A4205.A4173_1, "17");
                param.put(A4157_A4205.A4173, "18");
                param.put(A4157_A4205.A4173_2, "19");
                param.put(A4157_A4205.A4178_1, "20");
                param.put(A4157_A4205.A4178_2, "21");
                param.put(A4157_A4205.A4178, "22");
                param.put(A4157_A4205.A4179, "23");
                param.put(A4157_A4205.A4180, "24");
                param.put(A4157_A4205.A4181, "25");
                param.put(A4157_A4205.A4182, "26");
                param.put(A4157_A4205.A4183, "27");
                param.put(A4157_A4205.A4184, "28");
                param.put(A4157_A4205.A4185, "29");
                param.put(A4157_A4205.A4186, "30");
                param.put(A4157_A4205.A4186_1, "31");
                param.put(A4157_A4205.A4187, "32");
                param.put(A4157_A4205.A4188, "33");
                param.put(A4157_A4205.A4189, "34");
                param.put(A4157_A4205.A4190, "35");
                param.put(A4157_A4205.A4191, "36");
                param.put(A4157_A4205.A4192, "37");
                param.put(A4157_A4205.A4193, "38");
                param.put(A4157_A4205.A4193_1, "39");
                param.put(A4157_A4205.A4194, "40");
                param.put(A4157_A4205.A4195, "41");
                param.put(A4157_A4205.A4196, "42");
                param.put(A4157_A4205.A4197, "43");
                param.put(A4157_A4205.A4198_1, "44");
                param.put(A4157_A4205.A4198, "45");
                param.put(A4157_A4205.A4200, "46");
                param.put(A4157_A4205.A4202, "47");
                param.put(A4157_A4205.A4203, "48");
                param.put(A4157_A4205.A4204, "49");
                param.put(A4157_A4205.A4205, "50");
                param.put(A4157_A4205.A4205_1, "51");
                param.put(A4157_A4205.STATUS, "52");
            }

        }


        if (c10 != null) {
            if (c10.moveToFirst()) {
                param.put("id", c10.getString(0));
                param.put(A4206_A4207.study_id, "1");
                param.put(A4206_A4207.A4206, "2");
                param.put(A4206_A4207.A4206_1, "3");
                param.put(A4206_A4207.A4206_2, "4");
                param.put(A4206_A4207.A4206_3, "5");
                param.put(A4206_A4207.A4206_4, "6");
                param.put(A4206_A4207.A4206_5, "7");
                param.put(A4206_A4207.A4206_6, "8");
                param.put(A4206_A4207.A4206_7, "9");
                param.put(A4206_A4207.A4206_8, "10");
                param.put(A4206_A4207.A4206_9, "11");
                param.put(A4206_A4207.A4206_10, "12");
                param.put(A4206_A4207.A4206_11, "13");
                param.put(A4206_A4207.A4206_12, "14");
                param.put(A4206_A4207.A4206_13, "15");
                param.put(A4206_A4207.A4206_14, "16");
                param.put(A4206_A4207.A4206_15, "17");
                param.put(A4206_A4207.A4206_16, "18");
                param.put(A4206_A4207.A4206_17, "19");
                param.put(A4206_A4207.A4206_18, "20");
                param.put(A4206_A4207.A4206_19, "21");
                param.put(A4206_A4207.A4206_20, "22");
                param.put(A4206_A4207.A4206_21, "23");
                param.put(A4206_A4207.A4206_22, "24");
                param.put(A4206_A4207.A4207, "25");
                param.put(A4206_A4207.STATUS, "26");
            }

        }

        if (c11 != null) {
            if (c11.moveToFirst()) {
                param.put("id", c11.getString(0));
                param.put(A4251.study_id, "1");
                param.put(A4251.A4251, "2");
                param.put(A4251.A4253, "3");
                param.put(A4251.A4253_3, "4");
                param.put(A4251.A4254, "5");
                param.put(A4251.A4255_1, "6");
                param.put(A4251.A4255_2, "7");
                param.put(A4251.A4255_3, "8");
                param.put(A4251.A4255_4, "9");
                param.put(A4251.A4255_4_OT, "10");
                param.put(A4251.A4255_5, "11");
                param.put(A4251.A4255_6, "12");
                param.put(A4251.A4255_7, "13");
                param.put(A4251.A4255_8, "14");
                param.put(A4251.A4255_9, "15");
                param.put(A4251.A4255_10, "16");
                param.put(A4251.A4255_11, "17");
                param.put(A4251.A4255_12, "18");
                param.put(A4251.A4255_13, "19");
                param.put(A4251.A4255_13_OT, "20");
                param.put(A4251.A4255_DK, "21");
                param.put(A4251.A4256_minutes, "22");
                param.put(A4251.A4256_hours, "23");
                param.put(A4251.A4256_days, "24");
                param.put(A4251.A4274, "25");
                param.put(A4251.A4275, "26");
                param.put(A4251.A4276_1, "27");
                param.put(A4251.A4276_2, "28");
                param.put(A4251.A4276_3, "29");
                param.put(A4251.A4276_4, "30");
                param.put(A4251.A4276_5, "31");
                param.put(A4251.A4276_5_OT, "32");
                param.put(A4251.A4276_6, "33");
                param.put(A4251.A4276_7, "34");
                param.put(A4251.A4276_8, "35");
                param.put(A4251.A4276_9, "36");
                param.put(A4251.A4276_10, "37");
                param.put(A4251.A4276_11, "38");
                param.put(A4251.A4276_12, "39");
                param.put(A4251.A4276_13, "40");
                param.put(A4251.A4276_14, "41");
                param.put(A4251.A4276_15, "42");
                param.put(A4251.A4276_16, "43");
                param.put(A4251.A4276_16_OT, "44");
                param.put(A4251.A4276_DK, "45");
                param.put(A4251.A4277, "46");
                param.put(A4251.A4278_1, "47");
                param.put(A4251.A4278_2, "48");
                param.put(A4251.A4278_3, "49");
                param.put(A4251.A4278_4, "50");
                param.put(A4251.A4278_5, "51");
                param.put(A4251.A4278_6, "52");
                param.put(A4251.A4278_7, "53");
                param.put(A4251.A4278_DK, "54");
                param.put(A4251.A4279_1, "55");
                param.put(A4251.A4279_2, "56");
                param.put(A4251.A4279_3, "57");
                param.put(A4251.A4279_4, "58");
                param.put(A4251.A4279_5, "59");
                param.put(A4251.A4279_6, "60");
                param.put(A4251.A4279_7, "61");
                param.put(A4251.A4279_DK, "62");
                param.put(A4251.A4280, "63");
                param.put(A4251.A4281, "64");
                param.put(A4251.A4282, "65");
                param.put(A4251.A4283, "66");
                param.put(A4251.A4284, "67");
                param.put(A4251.STATUS, "68");

            }

        }

        if (c12 != null) {
            if (c12.moveToFirst()) {
                param.put("id", c12.getString(0));
                param.put(A4301_A4315.study_id, "1");
                param.put(A4301_A4315.A4301, "2");
                param.put(A4301_A4315.A4302_1, "3");
                param.put(A4301_A4315.A4302_2, "4");
                param.put(A4301_A4315.A4302_3, "5");
                param.put(A4301_A4315.A4302_4, "6");
                param.put(A4301_A4315.A4302_5, "7");
                param.put(A4301_A4315.A4302_6, "8");
                param.put(A4301_A4315.A4302_7, "9");
                param.put(A4301_A4315.A4303, "10");
                param.put(A4301_A4315.A4304, "11");
                param.put(A4301_A4315.A4305, "12");
                param.put(A4301_A4315.A4306_1check, "13");
                param.put(A4301_A4315.A4306_1, "14");
                param.put(A4301_A4315.A4306_2check, "15");
                param.put(A4301_A4315.A4306_2, "16");
                param.put(A4301_A4315.A4307, "17");
                param.put(A4301_A4315.A4308, "18");
                param.put(A4301_A4315.A4309, "19");
                param.put(A4301_A4315.A4310_1, "20");
                param.put(A4301_A4315.A4310_2, "21");
                param.put(A4301_A4315.A4310_3, "22");
                param.put(A4301_A4315.A4310_4, "23");
                param.put(A4301_A4315.A4310_5, "24");
                param.put(A4301_A4315.A4310_6, "25");
                param.put(A4301_A4315.A4310_7, "26");
                param.put(A4301_A4315.A4310_8, "27");
                param.put(A4301_A4315.A4310_9, "28");
                param.put(A4301_A4315.A4310_10, "29");
                param.put(A4301_A4315.A4310_11, "30");
                param.put(A4301_A4315.A4311_1, "31");
                param.put(A4301_A4315.A4311_2, "32");
                param.put(A4301_A4315.A4311_3, "33");
                param.put(A4301_A4315.A4311_4, "34");
                param.put(A4301_A4315.A4311_5, "35");
                param.put(A4301_A4315.A4312, "36");
                param.put(A4301_A4315.A4313, "37");
                param.put(A4301_A4315.A4314, "38");
                param.put(A4301_A4315.A4315, "39");
                param.put(A4301_A4315.STATUS, "40");

            }

        }

        if (c13 != null) {
            if (c13.moveToFirst()) {
                param.put("id", c13.getString(0));
                param.put(A4351_A4364.study_id, "1");
                param.put(A4351_A4364.A4351, "2");
                param.put(A4351_A4364.A4352, "3");
                param.put(A4351_A4364.A4353, "4");
                param.put(A4351_A4364.A4354, "5");
                param.put(A4351_A4364.A4355, "6");
                param.put(A4351_A4364.A4356, "7");
                param.put(A4351_A4364.A4357, "8");
                param.put(A4351_A4364.A4358, "9");
                param.put(A4351_A4364.A4363, "10");
                param.put(A4351_A4364.A4364, "11");
                param.put(A4351_A4364.STATUS, "12");

            }

        }

        if (c14 != null) {
            if (c14.moveToFirst()) {
                param.put("id", c14.getString(0));
                param.put(A4401_A4473.study_id, "1");
                param.put(A4401_A4473.A4401, "2");
                param.put(A4401_A4473.A4402, "3");
                param.put(A4401_A4473.A4402_5_OT, "4");
                param.put(A4401_A4473.A4403_province, "5");
                param.put(A4401_A4473.A4403_district, "6");
                param.put(A4401_A4473.A4404_years, "7");
                param.put(A4401_A4473.A4405_hours, "8");
                param.put(A4401_A4473.A4405_minutes, "9");
                param.put(A4401_A4473.A4451_1, "10");
                param.put(A4401_A4473.A4451_2, "11");
                param.put(A4401_A4473.A4451_3, "12");
                param.put(A4401_A4473.A4451_4, "13");
                param.put(A4401_A4473.A4451_5, "14");
                param.put(A4401_A4473.A4451_6, "15");
                param.put(A4401_A4473.A4451_7, "16");
                param.put(A4401_A4473.A4451_8, "17");
                param.put(A4401_A4473.A4451_9, "18");
                param.put(A4401_A4473.A4451_10, "19");
                param.put(A4401_A4473.A4451_11, "20");
                param.put(A4401_A4473.A4451_12, "21");
                param.put(A4401_A4473.A4451_13, "22");
                param.put(A4401_A4473.A4451_13_OT, "23");
                param.put(A4401_A4473.A4451_code, "24");
                param.put(A4401_A4473.A4452_1, "25");
                param.put(A4401_A4473.A4452_2, "26");
                param.put(A4401_A4473.A4452_3, "27");
                param.put(A4401_A4473.A4452_4, "28");
                param.put(A4401_A4473.A4452_5, "29");
                param.put(A4401_A4473.A4452_6, "30");
                param.put(A4401_A4473.A4452_7, "31");
                param.put(A4401_A4473.A4452_8, "32");
                param.put(A4401_A4473.A4452_9, "33");
                param.put(A4401_A4473.A4452_9_OT, "34");
                param.put(A4401_A4473.A4452_code, "35");
                param.put(A4401_A4473.A4453_1, "36");
                param.put(A4401_A4473.A4453_2, "37");
                param.put(A4401_A4473.A4453_3, "38");
                param.put(A4401_A4473.A4453_4, "39");
                param.put(A4401_A4473.A4453_5, "40");
                param.put(A4401_A4473.A4453_6, "41");
                param.put(A4401_A4473.A4453_7, "42");
                param.put(A4401_A4473.A4453_8, "43");
                param.put(A4401_A4473.A4453_9, "44");
                param.put(A4401_A4473.A4453_10, "45");
                param.put(A4401_A4473.A4453_11, "46");
                param.put(A4401_A4473.A4453_12, "47");
                param.put(A4401_A4473.A4453_12_OT, "48");
                param.put(A4401_A4473.A4453_code, "49");
                param.put(A4401_A4473.A4454, "50");
                param.put(A4401_A4473.A4455, "51");
                param.put(A4401_A4473.A4456, "52");
                param.put(A4401_A4473.A4457, "53");
                param.put(A4401_A4473.A4471, "54");
                param.put(A4401_A4473.A4472_1, "55");
                param.put(A4401_A4473.A4472_2, "56");
                param.put(A4401_A4473.A4472_3, "57");
                param.put(A4401_A4473.A4472_4, "58");
                param.put(A4401_A4473.A4472_5, "59");
                param.put(A4401_A4473.A4472_6, "60");
                param.put(A4401_A4473.A4472_7, "61");
                param.put(A4401_A4473.A4472_8, "62");
                param.put(A4401_A4473.A4472_9, "63");
                param.put(A4401_A4473.A4472_10, "64");
                param.put(A4401_A4473.A4472_11, "65");
                param.put(A4401_A4473.A4472_12, "66");
                param.put(A4401_A4473.A4472_DK, "67");
                param.put(A4401_A4473.A4473, "68");
                param.put(A4401_A4473.STATUS, "69");

            }

        }
        //endregion


        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        String urlString = new MyPreferences(mContext).getReq1();

        URL url;
        HttpURLConnection connection;

        try {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            // connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);

            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                bw = new BufferedWriter(new OutputStreamWriter(os, StandardCharsets.UTF_8));
            }

            bw.write(PostRequestData.getData(param));
            bw.flush();


            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String st = "", line;
                while ((line = br.readLine()) != null) {
                    st = st + line;
                }
                return st;
            } else {
                mUserMsg = "Server Couldn't process the request";
            }
        } catch (MalformedURLException e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {
            mUserMsg = "Please make sure that Internet connection is available," +
                    " and server IP is inserted in settings";
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            //int houseId = Integer.parseInt(((String) o).replace("\"",""));

            String result = (((String) o).replace("\"", ""));

            Toast.makeText(mContext, "Interview Has been Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            //  LogtableUpdates.UpdateLogStatusUpload(mContext,Validation.hfauploadid);

            thread.start();

        } catch (IOException e) {
            //if connection was available via connecting but
            //we can't get data from server..
            if (mUserMsg == null)
                mUserMsg = "Please check connection";
            dialog.dismiss();
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            mUserMsg = e.getMessage();
            dialog.dismiss();
        } catch (Exception e) {
            Toast.makeText(mContext, "Uploading failed at request 1", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}

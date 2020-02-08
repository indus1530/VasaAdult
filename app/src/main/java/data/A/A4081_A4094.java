package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4081_A4094 {
    public static String TABLE_NAME = "A4081";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4081_A4094.A4081      +  " TEXT,"  +
                Global.A.A4081_A4094.A4082u + " TEXT," +
                Global.A.A4081_A4094.A4082D + " TEXT," +
                Global.A.A4081_A4094.A4082M + " TEXT," +
                Global.A.A4081_A4094.A4082Y + " TEXT," +
                Global.A.A4081_A4094.A4083      +  " TEXT,"  +
                Global.A.A4081_A4094.A4084      +  " TEXT,"  +
                Global.A.A4081_A4094.A4085u + " TEXT," +
                Global.A.A4081_A4094.A4085D + " TEXT," +
                Global.A.A4081_A4094.A4085M + " TEXT," +
                Global.A.A4081_A4094.A4086      +  " TEXT,"  +
                Global.A.A4081_A4094.A4087u + " TEXT," +
                Global.A.A4081_A4094.A4087D + " TEXT," +
                Global.A.A4081_A4094.A4087M + " TEXT," +
                Global.A.A4081_A4094.A4088      +  " TEXT,"  +
                Global.A.A4081_A4094.A4089      +  " TEXT,"  +
                Global.A.A4081_A4094.A4090      +  " TEXT,"  +
                Global.A.A4081_A4094.A4091      +  " TEXT,"  +
                Global.A.A4081_A4094.A4092      +  " TEXT,"  +
                Global.A.A4081_A4094.A4093      +  " TEXT,"  +
                Global.A.A4081_A4094.A4094u + " TEXT," +
                Global.A.A4081_A4094.A4094m + " TEXT," +
                Global.A.A4081_A4094.A4094H + " TEXT," +
                Global.A.A4081_A4094.A4094D + " TEXT," +
                Global.A.A4081_A4094.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
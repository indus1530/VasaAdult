package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4109_A4125 {
    public static String TABLE_NAME = "A4109";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4109_A4125.A4109      +  " TEXT,"  +
                Global.A.A4109_A4125.A4110      +  " TEXT,"  +
                Global.A.A4109_A4125.A4111      +  " TEXT,"  +
                Global.A.A4109_A4125.A4112      +  " TEXT,"  +
                Global.A.A4109_A4125.A4113      +  " TEXT,"  +
                Global.A.A4109_A4125.A4114      +  " TEXT,"  +
                Global.A.A4109_A4125.A4115      +  " TEXT,"  +
                Global.A.A4109_A4125.A4116      +  " TEXT,"  +
                Global.A.A4109_A4125.A4117_u    +  " TEXT,"  +
                Global.A.A4109_A4125.A4117_a    +  " TEXT,"  +
                Global.A.A4109_A4125.A4117_b    +  " TEXT,"  +
                Global.A.A4109_A4125.A4118      +  " TEXT,"  +
                Global.A.A4109_A4125.A4119      +  " TEXT,"  +
                Global.A.A4109_A4125.A4120      +  " TEXT,"  +
                Global.A.A4109_A4125.A4121      +  " TEXT,"  +
                Global.A.A4109_A4125.A4122      +  " TEXT,"  +
                Global.A.A4109_A4125.A4123      +  " TEXT,"  +
                Global.A.A4109_A4125.A4124      +  " TEXT,"  +
                Global.A.A4109_A4125.A4125      +  " TEXT,"  +
                Global.A.A4109_A4125.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
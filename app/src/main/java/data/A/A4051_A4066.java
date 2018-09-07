package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4051_A4066 {
    public static String TABLE_NAME = "A4051_A4066";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4051_A4066.A4051      +  " TEXT,"  +
                Global.A.A4051_A4066.A4052_u    +  " TEXT,"  +
                Global.A.A4051_A4066.A4052_b    +  " TEXT,"  +
                Global.A.A4051_A4066.A4052_c    +  " TEXT,"  +
                Global.A.A4051_A4066.A4053      +  " TEXT,"  +
                Global.A.A4051_A4066.A4054      +  " TEXT,"  +
                Global.A.A4051_A4066.A4055      +  " TEXT,"  +
                Global.A.A4051_A4066.A4056      +  " TEXT,"  +
                Global.A.A4051_A4066.A4057      +  " TEXT,"  +
                Global.A.A4051_A4066.A4058      +  " TEXT,"  +
                Global.A.A4051_A4066.A4059_u    +  " TEXT,"  +
                Global.A.A4051_A4066.A4059_a    +  " TEXT,"  +
                Global.A.A4051_A4066.A4059_b    +  " TEXT,"  +
                Global.A.A4051_A4066.A4060      +  " TEXT,"  +
                Global.A.A4051_A4066.A4061      +  " TEXT,"  +
                Global.A.A4051_A4066.A4062      +  " TEXT,"  +
                Global.A.A4051_A4066.A4063      +  " TEXT,"  +
                Global.A.A4051_A4066.A4064_u    +  " TEXT,"  +
                Global.A.A4051_A4066.A4064_a    +  " TEXT,"  +
                Global.A.A4051_A4066.A4064_b    +  " TEXT,"  +
                Global.A.A4051_A4066.A4064_1    +  " TEXT,"  +
                Global.A.A4051_A4066.A4065      +  " TEXT,"  +
                Global.A.A4051_A4066.A4066      +  " TEXT,"  +
                Global.A.A4051_A4066.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
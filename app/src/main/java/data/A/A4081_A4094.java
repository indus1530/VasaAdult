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
                Global.A.A4081_A4094.A4082_u    +  " TEXT,"  +
                Global.A.A4081_A4094.A4082_a    +  " TEXT,"  +
                Global.A.A4081_A4094.A4082_b    +  " TEXT,"  +
                Global.A.A4081_A4094.A4082_c    +  " TEXT,"  +
                Global.A.A4081_A4094.A4083      +  " TEXT,"  +
                Global.A.A4081_A4094.A4084      +  " TEXT,"  +
                Global.A.A4081_A4094.A4085_u    +  " TEXT,"  +
                Global.A.A4081_A4094.A4085_a    +  " TEXT,"  +
                Global.A.A4081_A4094.A4085_b    +  " TEXT,"  +
                Global.A.A4081_A4094.A4086      +  " TEXT,"  +
                Global.A.A4081_A4094.A4087_u    +  " TEXT,"  +
                Global.A.A4081_A4094.A4087_a    +  " TEXT,"  +
                Global.A.A4081_A4094.A4087_b    +  " TEXT,"  +
                Global.A.A4081_A4094.A4088      +  " TEXT,"  +
                Global.A.A4081_A4094.A4089      +  " TEXT,"  +
                Global.A.A4081_A4094.A4090      +  " TEXT,"  +
                Global.A.A4081_A4094.A4091      +  " TEXT,"  +
                Global.A.A4081_A4094.A4092      +  " TEXT,"  +
                Global.A.A4081_A4094.A4093      +  " TEXT,"  +
                Global.A.A4081_A4094.A4094_u    +  " TEXT,"  +
                Global.A.A4081_A4094.A4094_a    +  " TEXT,"  +
                Global.A.A4081_A4094.A4094_b    +  " TEXT,"  +
                Global.A.A4081_A4094.A4094_c    +  " TEXT,"  +
                Global.A.A4081_A4094.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
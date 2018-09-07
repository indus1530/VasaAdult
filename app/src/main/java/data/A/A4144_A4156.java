package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4144_A4156 {
    public static String TABLE_NAME = "A4144_A4156";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4144_A4156.A4144      +  " TEXT,"  +
                Global.A.A4144_A4156.A4145      +  " TEXT,"  +
                Global.A.A4144_A4156.A4146      +  " TEXT,"  +
                Global.A.A4144_A4156.A4147      +  " TEXT,"  +
                Global.A.A4144_A4156.A4148      +  " TEXT,"  +
                Global.A.A4144_A4156.A4149      +  " TEXT,"  +
                Global.A.A4144_A4156.A4150_u    +  " TEXT,"  +
                Global.A.A4144_A4156.A4150_a    +  " TEXT,"  +
                Global.A.A4144_A4156.A4150_b    +  " TEXT,"  +
                Global.A.A4144_A4156.A4151      +  " TEXT,"  +
                Global.A.A4144_A4156.A4152      +  " TEXT,"  +
                Global.A.A4144_A4156.A4153      +  " TEXT,"  +
                Global.A.A4144_A4156.A4154      +  " TEXT,"  +
                Global.A.A4144_A4156.A4155      +  " TEXT,"  +
                Global.A.A4144_A4156.A4156      +  " TEXT,"  +
                Global.A.A4144_A4156.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
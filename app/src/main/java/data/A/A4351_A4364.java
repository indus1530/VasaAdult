package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4351_A4364 {
    public static String TABLE_NAME = "A4351";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4351_A4364.A4351         +  " TEXT,"  +
                Global.A.A4351_A4364.A4352         +  " TEXT,"  +
                Global.A.A4351_A4364.A4353         +  " TEXT,"  +
                Global.A.A4351_A4364.A4354         +  " TEXT,"  +
                Global.A.A4351_A4364.A4355         +  " TEXT,"  +
                Global.A.A4351_A4364.A4356         +  " TEXT,"  +
                Global.A.A4351_A4364.A4357         +  " TEXT,"  +
                Global.A.A4351_A4364.A4358         +  " TEXT,"  +
                Global.A.A4351_A4364.A4363         +  " TEXT,"  +
                Global.A.A4351_A4364.A4364         +  " TEXT,"  +
                Global.A.A4351_A4364.STATUS        +  " TEXT"  +

        ')';

        return query;
    }
}
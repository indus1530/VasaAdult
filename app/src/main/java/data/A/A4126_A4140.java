package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4126_A4140 {
    public static String TABLE_NAME = "A4126_A4140";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4126_A4140.A4126      +  " TEXT,"  +
                Global.A.A4126_A4140.A4127_u    +  " TEXT,"  +
                Global.A.A4126_A4140.A4127_a    +  " TEXT,"  +
                Global.A.A4126_A4140.A4127_b    +  " TEXT,"  +
                Global.A.A4126_A4140.A4128      +  " TEXT,"  +
                Global.A.A4126_A4140.A4129      +  " TEXT,"  +
                Global.A.A4126_A4140.A4130_u    +  " TEXT,"  +
                Global.A.A4126_A4140.A4130_a    +  " TEXT,"  +
                Global.A.A4126_A4140.A4130_b    +  " TEXT,"  +
                Global.A.A4126_A4140.A4131      +  " TEXT,"  +
                Global.A.A4126_A4140.A4132      +  " TEXT,"  +
                Global.A.A4126_A4140.A4133      +  " TEXT,"  +
                Global.A.A4126_A4140.A4134_u    +  " TEXT,"  +
                Global.A.A4126_A4140.A4134_a    +  " TEXT,"  +
                Global.A.A4126_A4140.A4134_b    +  " TEXT,"  +
                Global.A.A4126_A4140.A4135      +  " TEXT,"  +
                Global.A.A4126_A4140.A4136      +  " TEXT,"  +
                Global.A.A4126_A4140.A4138      +  " TEXT,"  +
                Global.A.A4126_A4140.A4139      +  " TEXT,"  +
                Global.A.A4126_A4140.A4140      +  " TEXT,"  +
                Global.A.A4126_A4140.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
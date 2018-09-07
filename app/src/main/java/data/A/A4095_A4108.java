package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4095_A4108 {
    public static String TABLE_NAME = "A4095_A4108";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4095_A4108.A4095      +  " TEXT,"  +
                Global.A.A4095_A4108.A4096      +  " TEXT,"  +
                Global.A.A4095_A4108.A4097_u    +  " TEXT,"  +
                Global.A.A4095_A4108.A4097_a    +  " TEXT,"  +
                Global.A.A4095_A4108.A4097_b    +  " TEXT,"  +
                Global.A.A4095_A4108.A4098      +  " TEXT,"  +
                Global.A.A4095_A4108.A4099_u    +  " TEXT,"  +
                Global.A.A4095_A4108.A4099_a    +  " TEXT,"  +
                Global.A.A4095_A4108.A4099_b    +  " TEXT,"  +
                Global.A.A4095_A4108.A4100      +  " TEXT,"  +
                Global.A.A4095_A4108.A4101_u    +  " TEXT,"  +
                Global.A.A4095_A4108.A4101_a    +  " TEXT,"  +
                Global.A.A4095_A4108.A4101_b    +  " TEXT,"  +
                Global.A.A4095_A4108.A4102      +  " TEXT,"  +
                Global.A.A4095_A4108.A4103      +  " TEXT,"  +
                Global.A.A4095_A4108.A4104      +  " TEXT,"  +
                Global.A.A4095_A4108.A4105      +  " TEXT,"  +
                Global.A.A4095_A4108.A4106      +  " TEXT,"  +
                Global.A.A4095_A4108.A4107      +  " TEXT,"  +
                Global.A.A4095_A4108.A4108      +  " TEXT,"  +
                Global.A.A4095_A4108.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
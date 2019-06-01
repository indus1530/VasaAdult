package data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4067_A4080 {
    public static String TABLE_NAME = "A4067";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4067_A4080.A4067      +  " TEXT,"  +
                Global.A.A4067_A4080.A4068      +  " TEXT,"  +
                Global.A.A4067_A4080.A4069_u    +  " TEXT,"  +
                Global.A.A4067_A4080.A4069_a    +  " TEXT,"  +
                Global.A.A4067_A4080.A4069_b    +  " TEXT,"  +
                Global.A.A4067_A4080.A4069_c    +  " TEXT,"  +
                Global.A.A4067_A4080.A4070      +  " TEXT,"  +
                Global.A.A4067_A4080.A4071      +  " TEXT,"  +
                Global.A.A4067_A4080.A4072_u    +  " TEXT,"  +
                Global.A.A4067_A4080.A4072_a    +  " TEXT,"  +
                Global.A.A4067_A4080.A4072_b    +  " TEXT,"  +
                Global.A.A4067_A4080.A4073      +  " TEXT,"  +
                Global.A.A4067_A4080.A4074      +  " TEXT,"  +
                Global.A.A4067_A4080.A4075_u    +  " TEXT,"  +
                Global.A.A4067_A4080.A4075_a    +  " TEXT,"  +
                Global.A.A4067_A4080.A4075_b    +  " TEXT,"  +
                Global.A.A4067_A4080.A4076      +  " TEXT,"  +
                Global.A.A4067_A4080.A4077_u    +  " TEXT,"  +
                Global.A.A4067_A4080.A4077_a    +  " TEXT,"  +
                Global.A.A4067_A4080.A4077_b    +  " TEXT,"  +
                Global.A.A4067_A4080.A4078      +  " TEXT,"  +
                Global.A.A4067_A4080.A4079      +  " TEXT,"  +
                Global.A.A4067_A4080.A4080      +  " TEXT,"  +
                Global.A.A4067_A4080.STATUS     +  " TEXT" +

        ')';

        return query;
    }
}
package data.A;


public class A4001_A4014 {
    public static String TABLE_NAME = "A4001";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.A.A4001_A4014.A4001      + " TEXT," +
                Global.A.A4001_A4014.A4002      + " TEXT," +
                Global.A.A4001_A4014.A4003      + " TEXT," +
                Global.A.A4001_A4014.A4004      + " TEXT," +
                Global.A.A4001_A4014.A4005      + " TEXT," +
                Global.A.A4001_A4014.A4006      + " TEXT," +
                Global.A.A4001_A4014.A4007      + " TEXT," +
                Global.A.A4001_A4014.A4007_1    + " TEXT," +
                Global.A.A4001_A4014.A4008      + " TEXT," +
                Global.A.A4001_A4014.A4009a     + " TEXT," +
                Global.A.A4001_A4014.A4010      + " TEXT," +
                Global.A.A4001_A4014.A4011      + " TEXT," +
                Global.A.A4001_A4014.A4012      + " TEXT," +
                Global.A.A4001_A4014.A4013u     + " TEXT," +
                Global.A.A4001_A4014.A4013d     + " TEXT," +
                Global.A.A4001_A4014.A4013m     + " TEXT," +
                Global.A.A4001_A4014.A4013y     + " TEXT," +
                Global.A.A4001_A4014.A4014      + " TEXT," +
                Global.A.A4001_A4014.STATUS     + " TEXT" +

                ')';


        return query;
    }
}
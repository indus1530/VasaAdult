package data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import data.A.A4001_A4014;
import data.A.A4051_A4066;
import data.A.A4067_A4080;
import data.A.A4081_A4094;
import data.A.A4095_A4108;
import data.A.A4109_A4125;
import data.A.A4126_A4140;
import data.A.A4144_A4156;
import data.A.A4157_A4205;
import data.A.A4206_A4207;
import data.A.A4251_A4284;
import data.A.A4301_A4315;
import data.A.A4351_A4364;
import data.A.A4401_A4473;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "tran_DB.db";
    private static final int VERSION = 1;

    Context mContext;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.beginTransaction();

        db.execSQL(A4001_A4014.getCreateQuery()); // A4001_A4014 created here
        db.execSQL(A4051_A4066.getCreateQuery()); // A4051_A4066 created here
        db.execSQL(A4067_A4080.getCreateQuery()); // A4067_A4080 created here
        db.execSQL(A4081_A4094.getCreateQuery()); // A4081_A4094 created here
        db.execSQL(A4095_A4108.getCreateQuery()); // A4095_A4108 created here
        db.execSQL(A4109_A4125.getCreateQuery()); // A4109_A4125 created here
        db.execSQL(A4126_A4140.getCreateQuery()); // A4126_A4140 created here
        db.execSQL(A4144_A4156.getCreateQuery()); // A4144_A4156 created here
        db.execSQL(A4157_A4205.getCreateQuery()); // A4157_A4205 created here
        db.execSQL(A4206_A4207.getCreateQuery()); // A4206_A4207 created here
        db.execSQL(A4251_A4284.getCreateQuery()); // A4251_A4284 created here
        db.execSQL(A4301_A4315.getCreateQuery()); // A4301_A4315 created here
        db.execSQL(A4351_A4364.getCreateQuery()); // A4351_A4364 created here
        db.execSQL(A4401_A4473.getCreateQuery()); // A4401_A4405 created here

        db.setTransactionSuccessful();
        db.endTransaction();
    }


    @Override
   public void onUpgrade(SQLiteDatabase db, int i, int i1) {

       String query;
        //db.beginTransaction();
        //query = "DROP TABLE IF EXISTS " + oTable.TABLE_NAME;
        //db.execSQL(query);

        //db.setTransactionSuccessful();
       // db.endTransaction();
    }

    public Cursor execRAW(String query) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(query, null);
        } catch (SQLiteException e) {
            e.printStackTrace();
            Log.d(DBHelper.class.getName(), " Exception while executing Query");
        }
        return cursor;
    }

    public Cursor getData() {

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from A4401_A4405 order by id DESC LIMIT 1", null);
        return res;
    }
}

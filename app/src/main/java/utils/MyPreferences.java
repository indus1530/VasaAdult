package utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Umeed-e-Nau
 */
public class MyPreferences {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    final public static String FILE_NAME = "com.irfansyed.VAS";
    final public static String USER_ID  = "userId";
    final public static String USER_NAME  = "username";
    final public static String NAME  = "name";
    final public static String Pass_word  = "password";
    final public static String REQ1  = "req1";
    final public static String REQ2  = "req2";
    final public static String REQ3  = "req3";
    final public static String REQ4  = "req4";
    final public static String REQ_LOGIN  = "reqLogin";

    final public static String parmlang = "en";
    final public static String parmctry = "US";

    final public static String District  = "Badin";

    public static String sA4001 = "";
    public static String sA4051 = "";
    public static String sA4067 = "";


    public MyPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public String getsA4001() {
        return sA4001;
    }

    public void setsA4001(String sA4001) {
        MyPreferences.sA4001 = sA4001;
    }

    public String getsA4051() {
        return sA4051;
    }

    public void setsA4051(String sA4051) {
        MyPreferences.sA4051 = sA4051;
    }

    public String getsA4067() {
        return sA4067;
    }

    public void setsA4067(String sA4067) {
        MyPreferences.sA4067 = sA4067;
    }


    public void setReq1(String url) {
        editor.putString(REQ1, url);
        editor.apply();
    }

    public String getReq1() {
        String url = sharedPreferences.getString(REQ1, null);
        return url;
    }

    public void setReq2(String url) {
        editor.putString(REQ2, url);
        editor.apply();
    }

    public String getReq2() {
        String url = sharedPreferences.getString(REQ2, null);
        return url;
    }

    public void setReq3(String url) {
        editor.putString(REQ3, url);
        editor.apply();
    }

    public String getReq3() {
        String url = sharedPreferences.getString(REQ3, null);
        return url;
    }

    public void setReq4(String url) {
        editor.putString(REQ4, url);
        editor.apply();
    }

    public String getReq4() {
        String url = sharedPreferences.getString(REQ4, null);
        return url;
    }


    public void setReqLogin(String url) {
        editor.putString(REQ_LOGIN, url);
        editor.apply();
    }

    public String getReqLogin() {
        String url = sharedPreferences.getString(REQ_LOGIN, null);
        return url;
    }







    public void setUsername(String username) {
        editor.putString(USER_NAME, username);
        editor.apply();
    }

    public void setDistrict(String username) {
        editor.putString(District, username);
        editor.apply();
    }


    public void setName(String name) {
        editor.putString(NAME, name);
        editor.apply();
    }

    public void setPassword(String password) {
        editor.putString(Pass_word, password);
        editor.apply();
    }

    public String getUsername() {
        String username = sharedPreferences.getString(USER_NAME, null);
        return username;
    }

    public String getDistict() {
        String username = sharedPreferences.getString(District, null);
        return username;
    }


    public String getName() {
        String name = sharedPreferences.getString(NAME, null);
        return name;
    }
    public String getPassword() {
        String passwrod = sharedPreferences.getString(USER_NAME, null);
        return passwrod;
    }

    public void removeUsername() {
        editor.remove(USER_NAME);
        editor.apply();
    }
    public void removePasswrod() {
        editor.remove(Pass_word);
        editor.apply();
    }
    public void removeName() {
        editor.remove(NAME);
        editor.apply();
    }

    public void setUserId(int id) {
        editor.putInt(USER_ID, id);
        editor.apply();
    }

    public int getUserId() {
        int id = sharedPreferences.getInt(USER_ID, -1);
        return id;
    }

    public void removeUserId() {
        editor.remove(USER_ID);
        editor.apply();
    }


    public void setlang(String lang, String ctry) {
        editor.putString(parmlang, lang);
        editor.putString(parmctry, ctry);
        editor.apply();
    }

    public String getlang() {
        String url = sharedPreferences.getString(parmlang, null);
        return url;
    }

    public String getctry() {
        String url = sharedPreferences.getString(parmctry, null);
        return url;
    }

}

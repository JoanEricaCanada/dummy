package com.example.joanericacanada.daybook.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

import com.example.joanericacanada.daybook.R;

/**
 * Created by joanericacanada on 10/30/15.
 */
public class PasswordManager {
    //VARIABLES
    private static SharedPreferences passwordPrefs;
    private static PasswordManager passwordManager;
    private Context context;

    //TAGS
    private static final String KEY_WORD = "password";

    private PasswordManager(Context context){
        this.context = context;
        passwordPrefs = context.getSharedPreferences("PasswordFile", 0);
    }

    public String getPassword(){
        return passwordPrefs.getString(KEY_WORD, null);
    }

    public void setPassword(String password){
        passwordPrefs.edit().putString(KEY_WORD, password).commit();
    }

    public static PasswordManager get(Context c){
        if(passwordManager == null) {
            passwordManager = new PasswordManager(c.getApplicationContext());
            Log.e("passwordManager", "null");
        }
        return passwordManager;
    }

    public boolean validatePassword(String inputPassword){
        if(inputPassword.equals(getPassword()))
            return true;
        else
            Toast.makeText(context, R.string.current_password_incorrect, Toast.LENGTH_SHORT).show();
        return false;
    }

    public boolean validatePassword(String newPassword, String confirmPassword){
        if(newPassword.equals(confirmPassword))
            return true;
        else
            Toast.makeText(context, R.string.new_password_mismatched, Toast.LENGTH_SHORT).show();
        return false;
    }
}

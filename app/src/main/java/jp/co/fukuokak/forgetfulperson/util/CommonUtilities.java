package jp.co.fukuokak.forgetfulperson.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CommonUtilities extends Activity {

    private Context context = null;
    private Boolean debugFlag = true;

    public CommonUtilities() {
    }

    public CommonUtilities(Context context) {
        this.context = context;
    }

    public CommonUtilities(Context context, Boolean debugFlag) {
        this.context = context;
        this.debugFlag = debugFlag;
    }

    public void debugToast(String tags, String Message) {
        if (debugFlag == true) {
            Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
            Log.d(tags, Message);
        } else {
            //No funtion is OK
            Log.v(tags, Message);
        }
    }

    public String printString(String print){
        return print ;
    }

    public void saveWeeklyRecord(String filename) {
        OutputStream out = null;
        try {
            out = openFileOutput(filename, MODE_PRIVATE);
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            debugToast(getClass().getMethods().toString(), e.getMessage().toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            debugToast(getClass().getMethods().toString(), e.getMessage().toString());
        }
    }

}
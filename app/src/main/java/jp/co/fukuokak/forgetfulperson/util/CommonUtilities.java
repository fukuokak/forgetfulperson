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
import java.util.Arrays;

public class CommonUtilities extends Activity {
    private boolean debugTrue = Boolean.TRUE ;
    private boolean debugFalse = Boolean.FALSE ;
    private Context context = null;
    private Boolean debugFlag = debugTrue;

    public CommonUtilities() {
    }

    public CommonUtilities(Context context, Boolean debugFlag) {
        this.context = context;
        this.debugFlag = debugFlag;
    }

    public void debugToast(String tags, String Message) {
        if (debugFlag == debugTrue) {
            Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
            Log.d(tags, Message);
        } else {
            Log.v(tags, Message);
        }
    }

    public String printString(String print){
        return print ;
    }

    public void saveWeeklyRecord(String filename) {
        OutputStream out;
        try {
            out = openFileOutput(filename, MODE_PRIVATE);
            //noinspection UnusedAssignment
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            debugToast(Arrays.toString(getClass().getMethods()), e.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            debugToast(Arrays.toString(getClass().getMethods()), e.getMessage());
        }
    }

}
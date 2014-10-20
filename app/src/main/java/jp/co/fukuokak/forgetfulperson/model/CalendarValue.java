package jp.co.fukuokak.forgetfulperson.model;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.view.Display;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import jp.co.fukuokak.forgetfulperson.R;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class CalendarValue {

    private Integer month;
    private Integer day;
    private int dayName;
    private String listText;
    private String dayNameFlag;
    private String[] week_name = {"", "Sun", "Mon", "Tue", "Wed",
            "Thu", "Fri", "Sat"};


    public CalendarValue(Calendar calendar) {
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DATE);
        this.dayName = calendar.get(Calendar.DAY_OF_WEEK);
        this.dayNameFlag = week_name[dayName];
        this.listText = month.toString() + "/"
                + day.toString() + "(" + week_name[dayName] + ")";
        this.dayNameFlag = dayNameFlag;

    }


    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public int getDayName() {
        return dayName;
    }

    public String getListText() {
        return listText;
    }

    public String getDayNameFlag() {
        return dayNameFlag;
    }

    public String[] getWeek_name() {
        return week_name;
    }


}

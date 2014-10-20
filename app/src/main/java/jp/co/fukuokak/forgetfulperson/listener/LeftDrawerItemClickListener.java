package jp.co.fukuokak.forgetfulperson.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jp.co.fukuokak.forgetfulperson.NavigationDrawerFragment;
import jp.co.fukuokak.forgetfulperson.R;
import jp.co.fukuokak.forgetfulperson.ToDoListFragment;
import jp.co.fukuokak.forgetfulperson.TopFrameActivity;
import jp.co.fukuokak.forgetfulperson.model.CalendarValue;
import jp.co.fukuokak.forgetfulperson.util.CommonUtilities;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class LeftDrawerItemClickListener implements ListView.OnItemClickListener {
    private ArrayList<CalendarValue> cvArray;
    private Activity activity ;
    private CommonUtilities comUtil = new CommonUtilities(activity );


    public LeftDrawerItemClickListener(Activity activity ,ArrayList<CalendarValue> cvArray){
        this.cvArray = cvArray ;
        this.activity = activity;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);

    }

    private void selectItem(int position) {
        Log.v(cvArray.get(position).getListText(), Integer.toString(position));

        activity.setContentView(R.layout.fragment_to_do);
        TextView tv2 = (TextView) activity.findViewById(R.id.textView2);
        tv2.setText(cvArray.get(position).getListText());
        Intent intent = new Intent();
        intent.setClass(activity, TopFrameActivity.class);
        activity.startActivity(intent);
    }
}

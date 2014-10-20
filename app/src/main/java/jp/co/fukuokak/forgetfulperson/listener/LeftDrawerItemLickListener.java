package jp.co.fukuokak.forgetfulperson.listener;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import jp.co.fukuokak.forgetfulperson.NavigationDrawerFragment;
import jp.co.fukuokak.forgetfulperson.R;
import jp.co.fukuokak.forgetfulperson.ToDoListFragment;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class LeftDrawerItemLickListener implements ListView.OnItemClickListener {


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);

    }

    private void selectItem(int position){
        Fragment fragment = new ToDoListFragment();
        Bundle args = new Bundle();

    }
}

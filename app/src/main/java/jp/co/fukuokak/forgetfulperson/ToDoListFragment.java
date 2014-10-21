package jp.co.fukuokak.forgetfulperson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class ToDoListFragment extends BaseFragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public ToDoListFragment(){

    }

    public ToDoListFragment newInstance(int sectionNumber){
        ToDoListFragment fragment = new ToDoListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_to_do ,container, false);
//        TextView text2 = (TextView)rootView.findViewById(R.id.textView2);
//        text2.setText("aaa");
        return rootView;
    }



}

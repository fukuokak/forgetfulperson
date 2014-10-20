package jp.co.fukuokak.forgetfulperson;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class ToDoListFragment extends Fragment {
    public ToDoListFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_to_do ,container, false);
        TextView text2 = (TextView)rootView.findViewById(R.id.textView2);
        text2.setText(container.toString());
        return rootView;
    }

}

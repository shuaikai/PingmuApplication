package myapplication.lsk.com.pingmuapplication.fragment.fragment;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import myapplication.lsk.com.pingmuapplication.R;
import myapplication.lsk.com.pingmuapplication.fragment.Myapp;


public class ContentFragment extends Fragment {
    private TextView textView_content;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_content, container, false);
        textView_content= (TextView) view.findViewById(R.id.textView_content);


        assignValue();
        return view;
    }

    public void assignValue() {
        Myapp myApp= (Myapp) getActivity().getApplication();
        String content=myApp.getName();
        if(!TextUtils.isEmpty(content)){
            textView_content.setText(content);
        }
    }
}

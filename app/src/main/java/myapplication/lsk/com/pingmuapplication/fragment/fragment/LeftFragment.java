package myapplication.lsk.com.pingmuapplication.fragment.fragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import myapplication.lsk.com.pingmuapplication.R;
import myapplication.lsk.com.pingmuapplication.fragment.Myapp;
import myapplication.lsk.com.pingmuapplication.fragment.activity.DetailActivity;


/**
 * Created by ASUS on 2016/9/29.
 */
public class LeftFragment extends ListFragment {
    private ArrayAdapter<String> adapter;
    private List<String> data;
    @Override

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
          adapter=getAdapter();
           this.setListAdapter(adapter);
    }


    public ArrayAdapter<String> getAdapter() {
        data=getdata();
       adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        return adapter;
    }

    public List<String> getdata() {
       data=new ArrayList<>();
        for(int i=0;i<30;i++){
            data.add("我就是帅"+i);
        }
        return data;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String name=data.get(position);
       Myapp myapp= (Myapp) getActivity().getApplication();
        myapp.setName(name);
       int orientation= getResources().getConfiguration().orientation;
        if(orientation==Configuration.ORIENTATION_PORTRAIT){
            Intent intent=new Intent(getActivity(), DetailActivity.class);
            startActivity(intent);

        }else if(orientation==Configuration.ORIENTATION_LANDSCAPE){
           ContentFragment contentFragment= (ContentFragment) getFragmentManager().findFragmentById(R.id.fragment4);
            contentFragment.assignValue();

        }

    }
}

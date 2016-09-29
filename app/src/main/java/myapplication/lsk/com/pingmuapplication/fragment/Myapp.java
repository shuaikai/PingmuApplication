package myapplication.lsk.com.pingmuapplication.fragment;

import android.app.Application;

/**
 * Created by ASUS on 2016/9/29.
 */
public class Myapp extends Application{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.jidou.daggerdemo.persenter;

import android.util.Log;
import android.widget.Toast;

import com.jidou.daggerdemo.view.IViewMain;

import javax.inject.Inject;

public class MainPresenter {
    private static final String TAG = "MainPresenter";
    @Inject
    IViewMain mViewMain;

    @Inject
    public MainPresenter() {
    }

    public void showToast() {
        Toast.makeText(mViewMain.getContext(), "测试", Toast.LENGTH_LONG).show();
//        Log.d(TAG, "showToast: " + "测试");
    }
}

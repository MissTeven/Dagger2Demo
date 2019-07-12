package com.jidou.daggerdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.jidou.daggerdemo.di.CommonModule;
import com.jidou.daggerdemo.di.DaggerCommonComponent;
import com.jidou.daggerdemo.persenter.MainPresenter;
import com.jidou.daggerdemo.view.IViewMain;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IViewMain {
    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerCommonComponent.builder().commonModule(new CommonModule(this)).build().inject(this);
//        DaggerCommonComponent.builder().build().inject(this);
        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.showToast();
            }
        });
    }

    @Override
    public Context getContext() {
        return this;
    }
}

package com.jidou.daggerdemo.di;


import com.jidou.daggerdemo.view.IViewMain;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    IViewMain mViewMain;
    public CommonModule(IViewMain viewMain) {
        mViewMain = viewMain;
    }
    @Provides
    IViewMain provideViewMain() {
        return mViewMain;
    }
}

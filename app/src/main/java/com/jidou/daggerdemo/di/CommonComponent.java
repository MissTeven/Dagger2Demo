package com.jidou.daggerdemo.di;

import com.jidou.daggerdemo.MainActivity;
import com.jidou.daggerdemo.view.IViewMain;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(MainActivity mainActivity);
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder iViewMain(IViewMain viewMain);
//        CommonComponent build();
//    }
}

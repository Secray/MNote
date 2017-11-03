package com.secray.mnote.di.Component;

import android.app.Activity;
import android.content.Context;

import com.secray.mnote.di.ActivityScope;
import com.secray.mnote.di.ContextScope;
import com.secray.mnote.di.Module.ActivityModule;

import dagger.Component;

/**
 * Created by secray on 2017/11/3 0003.
 */

@ActivityScope
@Component(modules = ActivityModule.class, dependencies = ApplicationComponent.class)
public interface ActivityComponent {
    Activity activity();

    @ContextScope("Activity")
    Context getActivityContext();
}

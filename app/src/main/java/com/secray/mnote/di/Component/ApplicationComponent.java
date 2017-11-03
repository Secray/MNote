package com.secray.mnote.di.Component;

import android.content.Context;

import com.secray.mnote.App;
import com.secray.mnote.di.ContextScope;
import com.secray.mnote.di.Module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by secray on 2017/11/3 0003.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    App app();

    @ContextScope
    Context getAppContext();
}

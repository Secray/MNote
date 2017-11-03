package com.secray.mnote.di.Module;

import android.content.Context;

import com.secray.mnote.App;
import com.secray.mnote.di.ContextScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by secray on 2017/11/3 0003.
 */

@Module
public class ApplicationModule {
    private App mApp;

    public ApplicationModule(App app) {
        this.mApp = app;
    }

    @Singleton
    @Provides
    App provideApp() {
        return mApp;
    }

    @Singleton
    @ContextScope
    @Provides
    Context provideAppContext() {
        return mApp;
    }
}

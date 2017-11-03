package com.secray.mnote.di.Module;

import android.app.Activity;
import android.content.Context;

import com.secray.mnote.di.ActivityScope;
import com.secray.mnote.di.ContextScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by secray on 2017/11/3 0003.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    @ActivityScope
    @ContextScope("Activity")
    Context provideActivityContext() {
        return mActivity;
    }
}

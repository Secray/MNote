package com.secray.mnote;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by secray on 2017/11/3 0003.
 */

public class App extends Application {
    private static final String TITLE_PATH = "font/DancingScript-Bold.ttf";
    public static Typeface sTitleTypeface;

    @Override
    public void onCreate() {
        super.onCreate();
        initTypeface();
    }

    private void initTypeface() {
        sTitleTypeface = Typeface.createFromAsset(getAssets(), TITLE_PATH);
    }
}

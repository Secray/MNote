package com.secray.mnote.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.secray.mnote.App;

/**
 * Created by user on 2017/11/8 0008.
 */

public class TitleTextView extends TextView {
    public TitleTextView(Context context) {
        this(context, null);
    }

    public TitleTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public TitleTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(App.sTitleTypeface);
    }
}

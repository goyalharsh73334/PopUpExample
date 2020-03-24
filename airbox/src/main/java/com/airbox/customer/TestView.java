package com.airbox.customer;

import android.content.Context;
import android.widget.LinearLayout;

public class TestView extends LinearLayout {

    public TestView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.layout_text_view, this);
    }
}

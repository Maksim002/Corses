package com.example.corses;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

public class squarImegView extends AppCompatImageView {

    public squarImegView(Context context) {
        super(context);
    }

    public squarImegView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public squarImegView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}

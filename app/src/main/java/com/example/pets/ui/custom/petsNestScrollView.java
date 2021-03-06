package com.example.pets.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

public class petsNestScrollView extends NestedScrollView {
    public petsNestScrollView(@NonNull Context context) {
        super(context);
    }

    public petsNestScrollView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public petsNestScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public void onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed,
                               int dxUnconsumed, int dyUnconsumed, int type, @NonNull int[] consumed) {
        super.onNestedScroll(target, dxConsumed, dyConsumed,dxUnconsumed,dyUnconsumed,type,consumed);
    }
}

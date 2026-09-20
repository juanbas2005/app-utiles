package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import cu.lestebang.utiletecsa.R;
import java.util.Calendar;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class MaterialCalendarGridView extends GridView {
    public final boolean w;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a08.c((Calendar) null);
        if (pg4.T(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.w = pg4.T(getContext(), R.attr.nestedScrollable);
        e58.m(this, new gg4(2));
    }

    public final am4 a() {
        return (am4) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (am4) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((am4) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        am4 am4 = (am4) super.getAdapter();
        am4.getClass();
        int max = Math.max(am4.a(), getFirstVisiblePosition());
        int min = Math.min(am4.c(), getLastVisiblePosition());
        am4.getItem(max);
        am4.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((am4) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((am4) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((am4) super.getAdapter()).a() && selectedItemPosition <= ((am4) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((am4) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.w) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof am4) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), am4.class.getCanonicalName()}));
    }

    public final void setSelection(int i) {
        if (i < ((am4) super.getAdapter()).a()) {
            super.setSelection(((am4) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m16getAdapter() {
        return (am4) super.getAdapter();
    }
}

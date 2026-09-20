package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: zc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zc3 implements View.OnTouchListener {
    public final Dialog w;
    public final int x;
    public final int y;
    public final int z;

    public zc3(Dialog dialog, Rect rect) {
        this.w = dialog;
        this.x = rect.left;
        this.y = rect.top;
        this.z = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.x;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.y;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (float) ((-this.z) - 1);
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.w.onTouchEvent(obtain);
    }
}

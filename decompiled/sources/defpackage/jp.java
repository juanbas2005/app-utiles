package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import cu.lestebang.utiletecsa.R;

/* renamed from: jp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jp extends SeekBar {
    public final kp w;

    public jp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        eh7.a(this, getContext());
        kp kpVar = new kp(this);
        this.w = kpVar;
        kpVar.E(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.w;
        jp jpVar = kpVar.G;
        Drawable drawable = kpVar.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(jpVar.getDrawableState())) {
            jpVar.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.w.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.w.P(canvas);
    }
}

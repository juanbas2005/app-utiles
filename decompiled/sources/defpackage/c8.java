package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import cu.lestebang.utiletecsa.R;

/* renamed from: c8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c8 extends dp implements e8 {
    public final /* synthetic */ d8 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c8(d8 d8Var, Context context) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.z = d8Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        t35.C(this, getContentDescription());
        setOnTouchListener(new y7(this, this));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.z.l();
        return true;
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}

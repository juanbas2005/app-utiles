package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import cu.lestebang.utiletecsa.R;

/* renamed from: kp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp extends qc3 {
    public final jp G;
    public Drawable H;
    public ColorStateList I = null;
    public PorterDuff.Mode J = null;
    public boolean K = false;
    public boolean L = false;

    public kp(jp jpVar) {
        super(1, (Object) jpVar);
        this.G = jpVar;
    }

    public final void E(AttributeSet attributeSet, int i) {
        super.E(attributeSet, R.attr.seekBarStyle);
        jp jpVar = this.G;
        Context context = jpVar.getContext();
        int[] iArr = qv5.g;
        cf4 w = cf4.w(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) w.y;
        e58.l(jpVar, jpVar.getContext(), iArr, attributeSet, (TypedArray) w.y, R.attr.seekBarStyle);
        Drawable j = w.j(0);
        if (j != null) {
            jpVar.setThumb(j);
        }
        Drawable i2 = w.i(1);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.H = i2;
        if (i2 != null) {
            i2.setCallback(jpVar);
            i2.setLayoutDirection(jpVar.getLayoutDirection());
            if (i2.isStateful()) {
                i2.setState(jpVar.getDrawableState());
            }
            O();
        }
        jpVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.J = sz1.b(typedArray.getInt(3, -1), this.J);
            this.L = true;
        }
        if (typedArray.hasValue(2)) {
            this.I = w.g(2);
            this.K = true;
        }
        w.A();
        O();
    }

    public final void O() {
        Drawable drawable = this.H;
        if (drawable == null) {
            return;
        }
        if (this.K || this.L) {
            Drawable mutate = drawable.mutate();
            this.H = mutate;
            if (this.K) {
                mutate.setTintList(this.I);
            }
            if (this.L) {
                this.H.setTintMode(this.J);
            }
            if (this.H.isStateful()) {
                this.H.setState(this.G.getDrawableState());
            }
        }
    }

    public final void P(Canvas canvas) {
        int i;
        if (this.H != null) {
            jp jpVar = this.G;
            int max = jpVar.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.H.getIntrinsicWidth();
                int intrinsicHeight = this.H.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.H.setBounds(-i, -i2, i, i2);
                float width = ((float) ((jpVar.getWidth() - jpVar.getPaddingLeft()) - jpVar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) jpVar.getPaddingLeft(), (float) (jpVar.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.H.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}

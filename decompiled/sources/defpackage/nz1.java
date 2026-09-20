package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: nz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz1 extends vb5 implements v36 {
    public final Drawable A;
    public final ed5 B = u55.p(0);
    public final ed5 C;
    public final z97 D;

    public nz1(Drawable drawable) {
        long j;
        drawable.getClass();
        this.A = drawable;
        nz3 nz3 = oz1.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            j = 9205357640488583168L;
        } else {
            j = fb5.a((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        this.C = u55.p(new wu6(j));
        this.D = new z97(new kh(4, this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public final void a() {
        b();
    }

    public final void b() {
        Drawable drawable = this.A;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback((Drawable.Callback) null);
    }

    public final void c() {
        Drawable drawable = this.A;
        drawable.setCallback((Drawable.Callback) this.D.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final void d(float f) {
        this.A.setAlpha(z65.p(dh4.C(f * 255.0f), 0, 255));
    }

    public final void e(lt0 lt0) {
        ColorFilter colorFilter;
        if (lt0 != null) {
            colorFilter = lt0.a;
        } else {
            colorFilter = null;
        }
        this.A.setColorFilter(colorFilter);
    }

    public final void f(ey3 ey3) {
        int i;
        ey3.getClass();
        int ordinal = ey3.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                h.c();
                return;
            }
        } else {
            i = 0;
        }
        this.A.setLayoutDirection(i);
    }

    public final long i() {
        return ((wu6) this.C.getValue()).a;
    }

    public final void j(wy3 wy3) {
        tk0 tk0 = wy3.w;
        qk0 D2 = tk0.x.D();
        ((Number) this.B.getValue()).intValue();
        int C2 = dh4.C(wu6.d(tk0.e()));
        int C3 = dh4.C(wu6.b(tk0.e()));
        Drawable drawable = this.A;
        drawable.setBounds(0, 0, C2, C3);
        try {
            D2.h();
            Canvas canvas = pd.a;
            drawable.draw(((od) D2).a);
        } finally {
            D2.p();
        }
    }
}

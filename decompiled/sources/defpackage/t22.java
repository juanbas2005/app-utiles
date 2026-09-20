package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: t22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t22 {
    public int a;
    public final Object b;
    public final Object c;

    public t22(xy5 xy5) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = xy5;
    }

    public static t22 b(xy5 xy5, int i) {
        if (i == 0) {
            return new a85(xy5, 0);
        }
        if (i == 1) {
            return new a85(xy5, 1);
        }
        h.q("invalid orientation");
        return null;
    }

    public abstract void a(ua6 ua6);

    public abstract void c(ua6 ua6);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(ua6 ua6);

    public abstract void s(ua6 ua6);

    public abstract void t(ua6 ua6);

    public abstract void u(ua6 ua6);

    public abstract ca v(ua6 ua6);

    public t22(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public t22(v22 v22) {
        this.a = 0;
        this.c = new tl1();
        this.b = v22;
    }
}

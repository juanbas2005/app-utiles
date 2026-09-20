package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: db8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class db8 {
    public static final db8 b;
    public final za8 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = xa8.w;
        } else if (i >= 30) {
            b = va8.v;
        } else {
            b = za8.b;
        }
    }

    public db8(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new ya8(this, windowInsets);
        } else if (i >= 34) {
            this.a = new xa8(this, windowInsets);
        } else if (i >= 31) {
            this.a = new wa8(this, windowInsets);
        } else if (i >= 30) {
            this.a = new va8(this, windowInsets);
        } else if (i >= 29) {
            this.a = new ua8(this, windowInsets);
        } else if (i >= 28) {
            this.a = new ta8(this, windowInsets);
        } else {
            this.a = new sa8(this, windowInsets);
        }
    }

    public static ad3 e(ad3 ad3, int i, int i2, int i3, int i4) {
        int max = Math.max(0, ad3.a - i);
        int max2 = Math.max(0, ad3.b - i2);
        int max3 = Math.max(0, ad3.c - i3);
        int max4 = Math.max(0, ad3.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return ad3;
        }
        return ad3.b(max, max2, max3, max4);
    }

    public static db8 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        db8 db8 = new db8(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = e58.a;
            db8 a2 = x48.a(view);
            za8 za8 = db8.a;
            za8.w(a2);
            View rootView = view.getRootView();
            za8.d(rootView);
            za8.o(rootView);
            za8.p();
            za8.y(view.getWindowSystemUiVisibility());
        }
        return db8;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db8)) {
            return false;
        }
        return Objects.equals(this.a, ((db8) obj).a);
    }

    public final WindowInsets f() {
        za8 za8 = this.a;
        if (za8 instanceof ra8) {
            return ((ra8) za8).c;
        }
        return null;
    }

    public final int hashCode() {
        za8 za8 = this.a;
        if (za8 == null) {
            return 0;
        }
        return za8.hashCode();
    }

    public db8() {
        this.a = new za8(this);
    }
}

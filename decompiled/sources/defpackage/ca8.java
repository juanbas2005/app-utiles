package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: ca8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ca8 implements View.OnApplyWindowInsetsListener {
    public final us0 a;
    public db8 b;

    public ca8(View view, us0 us0) {
        db8 db8;
        qa8 qa8;
        this.a = us0;
        WeakHashMap weakHashMap = e58.a;
        db8 a2 = x48.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                qa8 = new pa8(a2);
            } else if (i >= 35) {
                qa8 = new oa8(a2);
            } else if (i >= 34) {
                qa8 = new na8(a2);
            } else if (i >= 31) {
                qa8 = new ma8(a2);
            } else if (i >= 30) {
                qa8 = new la8(a2);
            } else if (i >= 29) {
                qa8 = new ka8(a2);
            } else {
                qa8 = new ia8(a2);
            }
            db8 = qa8.b();
        } else {
            db8 = null;
        }
        this.b = db8;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        View view2 = view;
        if (!view2.isLaidOut()) {
            this.b = db8.g(view, windowInsets);
            return da8.i(view, windowInsets);
        }
        db8 g = db8.g(view, windowInsets);
        za8 za8 = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = e58.a;
            this.b = x48.a(view2);
        }
        if (this.b == null) {
            this.b = g;
            return da8.i(view, windowInsets);
        }
        us0 j2 = da8.j(view2);
        if (j2 != null && Objects.equals((db8) j2.x, g)) {
            return da8.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        db8 db8 = this.b;
        int i = 1;
        while (i <= 512) {
            ad3 h = za8.h(i);
            ad3 h2 = db8.a.h(i);
            int i2 = h.a;
            int i3 = h.d;
            int i4 = h.c;
            int i5 = h.b;
            int i6 = h2.a;
            int i7 = h2.d;
            int i8 = h2.c;
            int i9 = h2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g;
            return da8.i(view, windowInsets);
        }
        db8 db82 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = da8.e;
        } else if ((i11 & 8) != 0) {
            interpolator = da8.f;
        } else if ((i10 & 519) != 0) {
            interpolator = da8.g;
        } else if ((i11 & 519) != 0) {
            interpolator = da8.h;
        } else {
            interpolator = null;
        }
        if ((i12 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        ha8 ha8 = new ha8(i12, interpolator, j);
        ha8.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(ha8.a.a());
        ad3 h3 = za8.h(i12);
        ad3 h4 = db82.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = i12;
        int i18 = h3.d;
        db8 db83 = db82;
        int i19 = h4.d;
        k68 k68 = new k68(2, ad3.b(min, min2, min3, Math.min(i18, i19)), ad3.b(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i18, i19)));
        da8.f(view2, ha8, g, false);
        View view3 = view2;
        ha8 ha82 = ha8;
        ba8 ba8 = new ba8(ha82, g, db83, i17, view3);
        db8 db84 = g;
        ha8 ha83 = ha82;
        View view4 = view3;
        duration.addUpdateListener(ba8);
        duration.addListener(new yl7(ha83, view4));
        q55.a(view4, new yl0(view4, ha83, k68, duration, 1, false));
        this.b = db84;
        return da8.i(view, windowInsets);
    }
}

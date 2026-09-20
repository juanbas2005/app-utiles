package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: lr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lr8 {
    public static final t37 a = new hu5(x10.L);
    public static final t37 b = new hu5(x10.M);

    public static final void a(boolean z, boolean z2, fw0 fw0, yt2 yt2, int i) {
        boolean z3;
        boolean z4;
        qt0 f;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i2 = i;
        yt22.g0(333377128);
        int i3 = i2 | 50;
        boolean z5 = true;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i3 & 1, z3)) {
            yt22.a0();
            if ((i2 & 1) != 0 && !yt22.C()) {
                yt22.Y();
                z4 = z;
                z5 = z2;
            } else if ((((Configuration) yt22.k(ye.a)).uiMode & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            yt22.s();
            Context context = (Context) yt22.k(ye.b);
            if (z4) {
                f = st0.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);
            } else {
                f = st0.f(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);
            }
            qt0 qt0 = f;
            long j = jt0.g;
            if (!jt0.c(b(context, "colorPrimary", j), j)) {
                qt0 = qt0.a(qt0, b(context, "colorPrimary", j), b(context, "colorOnPrimary", qt0.b), 0, 0, b(context, "colorBackground", qt0.n), b(context, "colorOnBackground", qt0.o), b(context, "colorSurface", qt0.p), b(context, "colorOnSurface", qt0.q), 0, b(context, "colorOnSurfaceVariant", qt0.s), 0, b(context, "colorError", qt0.w), 0, b(context, "colorOutlineVariant", qt0.B), 0, 0, 0, 0, 0, -138797060, 65535);
            } else if (z5 && Build.VERSION.SDK_INT >= 31) {
                qt0 = z4 ? ed1.m(context) : ed1.n(context);
            }
            yt22.e0(-1747056622);
            br7 br7 = ((zg4) yt22.k(ch4.b)).b;
            yt22.r(false);
            t49.d(new ju5[]{a.a(qt0), b.a(br7)}, su0.J(1848582952, new jr8(qt0, br7, fw02), yt22), yt22, 56);
        } else {
            yt22.Y();
            z4 = z;
            z5 = z2;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new wq8(z4, z5, fw02, i2);
        }
    }

    public static final long b(Context context, String str, long j) {
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(str, "attr", "android");
        }
        if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
                return uq3.c(typedValue.data);
            }
        }
        return j;
    }
}

package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: mx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mx5 {
    public final s83 a;
    public final List b;
    public final int c;
    public final s83 d;
    public final uu6 e;
    public final g72 f;
    public final boolean g;

    public mx5(s83 s83, List list, int i, s83 s832, uu6 uu6, g72 g72, boolean z) {
        this.a = s83;
        this.b = list;
        this.c = i;
        this.d = s832;
        this.e = uu6;
        this.f = g72;
        this.g = z;
    }

    public final void a(s83 s83, x42 x42) {
        Context context = s83.a;
        s83 s832 = this.a;
        if (context != s832.a) {
            h.p(x42, "' cannot modify the request's context.", "Interceptor '");
        } else if (s83.b == me6.H) {
            h.p(x42, "' cannot set the request's data to null.", "Interceptor '");
        } else if (s83.c != s832.c) {
            h.p(x42, "' cannot modify the request's target.", "Interceptor '");
        } else if (s83.v != s832.v) {
            h.p(x42, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else if (s83.w != s832.w) {
            h.p(x42, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(s83 s83, h61 h61) {
        kx5 kx5;
        int i;
        x42 x42;
        Object obj;
        if (h61 instanceof kx5) {
            kx5 = (kx5) h61;
            int i2 = kx5.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kx5.D = i2 - Integer.MIN_VALUE;
                Object obj2 = kx5.B;
                i = kx5.D;
                if (i != 0) {
                    o85.q(obj2);
                    List list = this.b;
                    int i3 = this.c;
                    if (i3 > 0) {
                        a(s83, (x42) list.get(i3 - 1));
                    }
                    x42 = (x42) list.get(i3);
                    g72 g72 = this.f;
                    boolean z = this.g;
                    mx5 mx5 = new mx5(this.a, this.b, i3 + 1, s83, this.e, g72, z);
                    kx5.z = this;
                    kx5.A = x42;
                    kx5.D = 1;
                    obj = x42.d(mx5, kx5);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    x42 x422 = kx5.A;
                    mx5 mx52 = kx5.z;
                    o85.q(obj2);
                    Object obj3 = obj2;
                    x42 = x422;
                    this = mx52;
                    obj = obj3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t83 t83 = (t83) obj;
                this.a(t83.b(), x42);
                return t83;
            }
        }
        kx5 = new kx5(this, h61);
        Object obj22 = kx5.B;
        i = kx5.D;
        if (i != 0) {
        }
        t83 t832 = (t83) obj;
        this.a(t832.b(), x42);
        return t832;
    }
}

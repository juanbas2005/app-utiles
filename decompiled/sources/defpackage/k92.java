package defpackage;

/* renamed from: k92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k92 {
    public static final k92 a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [k92, java.lang.Object] */
    static {
        x91.d(16.0f, 0.0f);
    }

    public final void a(boolean z, ml4 ml4, yt2 yt2, int i) {
        int i2;
        boolean z2;
        yt2 yt22;
        jl4 jl4;
        float f;
        yt2.g0(-1732824199);
        if (yt2.h(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            x83 q = su0.q();
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            jl4 jl42 = jl4.w;
            yt22 = yt2;
            d83.a(q, (String) null, ub5.r(jl42, f), 0, yt22, 48, 8);
            jl4 = jl42;
        } else {
            yt22 = yt2;
            yt22.Y();
            jl4 = ml4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new j92(i, 0, this, jl4, z);
        }
    }
}

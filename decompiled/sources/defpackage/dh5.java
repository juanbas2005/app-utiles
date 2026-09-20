package defpackage;

/* renamed from: dh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dh5 implements tp1 {
    public boolean w;

    public static final void a(dh5 dh5, eh5 eh5) {
        dh5.getClass();
        if (eh5 instanceof rm4) {
            ((rm4) eh5).I(dh5.w);
        }
    }

    public static void j(dh5 dh5, eh5 eh5, long j) {
        dh5.getClass();
        a(dh5, eh5);
        eh5.h0(oe3.c(j, eh5.A), 0.0f, (vr2) null);
    }

    public static void k(dh5 dh5, eh5 eh5, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (dh5.d() == ey3.w || dh5.f() == 0) {
            a(dh5, eh5);
            eh5.h0(oe3.c(j, eh5.A), 0.0f, (vr2) null);
            return;
        }
        a(dh5, eh5);
        eh5.h0(oe3.c((((long) ((dh5.f() - eh5.w) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), eh5.A), 0.0f, (vr2) null);
    }

    public static void l(dh5 dh5, eh5 eh5, int i, int i2, vr2 vr2, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = fh5.b;
            vr2 = xc4.K;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (dh5.d() == ey3.w || dh5.f() == 0) {
            a(dh5, eh5);
            eh5.h0(oe3.c(j, eh5.A), 0.0f, vr2);
            return;
        }
        a(dh5, eh5);
        eh5.h0(oe3.c((((long) ((dh5.f() - eh5.w) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), eh5.A), 0.0f, vr2);
    }

    public static void m(dh5 dh5, eh5 eh5, long j) {
        int i = fh5.b;
        xc4 xc4 = xc4.K;
        if (dh5.d() == ey3.w || dh5.f() == 0) {
            a(dh5, eh5);
            eh5.h0(oe3.c(j, eh5.A), 0.0f, xc4);
            return;
        }
        a(dh5, eh5);
        eh5.h0(oe3.c((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((dh5.f() - eh5.w) - ((int) (j >> 32)))) << 32), eh5.A), 0.0f, xc4);
    }

    public static void n(dh5 dh5, eh5 eh5, int i, int i2, vr2 vr2, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = fh5.b;
            vr2 = xc4.K;
        }
        dh5.getClass();
        a(dh5, eh5);
        eh5.h0(oe3.c((((long) i2) & 4294967295L) | (((long) i) << 32), eh5.A), 0.0f, vr2);
    }

    public static void r(dh5 dh5, eh5 eh5, long j) {
        int i = fh5.b;
        xc4 xc4 = xc4.K;
        dh5.getClass();
        a(dh5, eh5);
        eh5.h0(oe3.c(j, eh5.A), 0.0f, xc4);
    }

    public abstract ey3 d();

    public abstract int f();

    public final void g(eh5 eh5, int i, int i2, float f) {
        a(this, eh5);
        eh5.h0(oe3.c((((long) i2) & 4294967295L) | (((long) i) << 32), eh5.A), f, (vr2) null);
    }

    public float c(k23 k23, float f) {
        return f;
    }
}

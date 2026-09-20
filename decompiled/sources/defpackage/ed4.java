package defpackage;

/* renamed from: ed4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed4 extends dh5 {
    public final /* synthetic */ int x;
    public final Object y;

    public /* synthetic */ ed4(int i, Object obj) {
        this.x = i;
        this.y = obj;
    }

    public final float Y() {
        int i = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                return ((dd4) obj).Y();
            default:
                return ((je) obj).getDensity().Y();
        }
    }

    public final float b() {
        int i = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                return ((dd4) obj).b();
            default:
                return ((je) obj).getDensity().b();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, h06] */
    public float c(k23 k23, float f) {
        float f2;
        vr2 vr2;
        int c1;
        r95 snapshotObserver;
        int c12;
        switch (this.x) {
            case b85.b:
                gs2 gs2 = k23.a;
                if (gs2 != null) {
                    return ((Number) gs2.H(this, Float.valueOf(f))).floatValue();
                }
                dd4 dd4 = (dd4) this.y;
                if (dd4.K) {
                    return f;
                }
                ? obj = new Object();
                obj.w = dd4;
                while (true) {
                    ao aoVar = ((dd4) obj.w).M;
                    float f3 = Float.NaN;
                    if (aoVar == null || (c12 = qs.c1(k23, (k23[]) aoVar.b)) < 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = ((float[]) aoVar.c)[c12];
                    }
                    boolean isNaN = Float.isNaN(f2);
                    Object obj2 = obj.w;
                    if (!isNaN) {
                        ((dd4) obj2).n0(dd4.G0(), k23);
                        return k23.a(f2, ((dd4) obj.w).B0(), dd4.B0());
                    }
                    dd4 dd42 = (dd4) obj2;
                    gs2 gs22 = dd42.D;
                    if (!(gs22 == null || (vr2 = dd42.E) == null || !((Boolean) vr2.y(k23)).booleanValue())) {
                        dd4 dd43 = (dd4) obj.w;
                        tp4 tp4 = dd43.G;
                        if (tp4 == null) {
                            long[] jArr = bg6.a;
                            tp4 = new tp4();
                            dd43.G = tp4;
                        }
                        Object g = tp4.g(k23);
                        if (g == null) {
                            g = new gh5(dd43.J0(), dd43, k23);
                            tp4.m(k23, g);
                        }
                        gh5 gh5 = (gh5) g;
                        gh5.w = dd43.J0();
                        p95 p95 = dd4.G0().J;
                        if (!(p95 == null || (snapshotObserver = ((je) p95).getSnapshotObserver()) == null)) {
                            snapshotObserver.a.e(gh5, xc4.z, new ad4(gs22, obj, k23, 0));
                        }
                        ((dd4) obj.w).n0(dd4.G0(), k23);
                        ao aoVar2 = ((dd4) obj.w).M;
                        if (aoVar2 != null && (c1 = qs.c1(k23, (k23[]) aoVar2.b)) >= 0) {
                            f3 = ((float[]) aoVar2.c)[c1];
                        }
                        if (!Float.isNaN(f3)) {
                            return k23.a(f3, ((dd4) obj.w).B0(), dd4.B0());
                        }
                    }
                    dd4 K0 = ((dd4) obj.w).K0();
                    if (K0 == null) {
                        ((dd4) obj.w).n0(dd4.G0(), k23);
                        return f;
                    }
                    obj.w = K0;
                }
                break;
            default:
                return f;
        }
    }

    public final ey3 d() {
        int i = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                return ((dd4) obj).getLayoutDirection();
            default:
                return ((je) obj).getLayoutDirection();
        }
    }

    public final int f() {
        int i = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                return ((dd4) obj).b0();
            default:
                return ((je) obj).getRoot().b0.p.w;
        }
    }
}

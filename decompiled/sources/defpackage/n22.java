package defpackage;

/* renamed from: n22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n22 {
    public static final jo7 a = new jo7(120, (i12) j12.a, 2);
    public static final jo7 b;
    public static final jo7 c;

    static {
        rc1 rc1 = new rc1(0.4f, 0.0f, 0.6f, 1.0f);
        b = new jo7(150, (i12) rc1, 2);
        c = new jo7(120, (i12) rc1, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((r11 instanceof defpackage.dk2) != false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        if ((r10 instanceof defpackage.dk2) != false) goto L_0x0009;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    public static final Object a(uj ujVar, float f, df3 df3, df3 df32, h61 h61) {
        jo7 jo7;
        jo7 jo72;
        jo7 jo73 = null;
        if (df32 != null) {
            boolean z = df32 instanceof eo5;
            jo7 = a;
            if (!z) {
                if (!(df32 instanceof vy1)) {
                    if (!(df32 instanceof r23)) {
                    }
                }
            }
        } else {
            if (df3 != null) {
                boolean z2 = df3 instanceof eo5;
                jo7 = b;
                if (!z2 && !(df3 instanceof vy1)) {
                    if (df3 instanceof r23) {
                        jo73 = c;
                    }
                }
            }
            jo72 = jo73;
            p81 p81 = p81.w;
            if (jo72 == null) {
                Object c2 = uj.c(ujVar, new lx1(f), jo72, (Float) null, (vr2) null, h61, 12);
                if (c2 == p81) {
                    return c2;
                }
            } else {
                Object f2 = ujVar.f(h61, new lx1(f));
                if (f2 == p81) {
                    return f2;
                }
            }
            return vs7.a;
        }
        jo73 = jo7;
        jo72 = jo73;
        p81 p812 = p81.w;
        if (jo72 == null) {
        }
        return vs7.a;
    }
}

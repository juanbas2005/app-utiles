package defpackage;

/* renamed from: oc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class oc5 {
    public static final long a = wg7.c;
    public static final /* synthetic */ int b = 0;

    static {
        xg7[] xg7Arr = wg7.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (defpackage.wg7.a(r3, r0.c) != false) goto L_0x0035;
     */
    public static final nc5 a(nc5 nc5, int i, int i2, long j, mf7 mf7, qj5 qj5, m64 m64, int i3, int i4, jg7 jg7) {
        long j2;
        nc5 nc52 = nc5;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        mf7 mf72 = mf7;
        qj5 qj52 = qj5;
        m64 m642 = m64;
        int i7 = i3;
        int i8 = i4;
        jg7 jg72 = jg7;
        if (i5 == 0 || i5 == nc52.a) {
            xg7[] xg7Arr = wg7.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((mf72 == null || mf72.equals(nc52.d)) && ((i6 == 0 || i6 == nc52.b) && ((qj52 == null || qj52.equals(nc52.e)) && ((m642 == null || m642.equals(nc52.f)) && ((i7 == 0 || i7 == nc52.g) && ((i8 == 0 || i8 == nc52.h) && (jg72 == null || jg72.equals(nc52.i)))))))) {
                return nc52;
            }
        } else {
            j2 = 0;
        }
        xg7[] xg7Arr2 = wg7.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = nc52.c;
        }
        if (mf72 == null) {
            mf72 = nc52.d;
        }
        if (i5 == 0) {
            i5 = nc52.a;
        }
        if (i6 == 0) {
            i6 = nc52.b;
        }
        qj5 qj53 = nc52.e;
        if (qj53 != null && qj52 == null) {
            qj52 = qj53;
        }
        if (m642 == null) {
            m642 = nc52.f;
        }
        if (i7 == 0) {
            i7 = nc52.g;
        }
        if (i8 == 0) {
            i8 = nc52.h;
        }
        if (jg72 == null) {
            jg72 = nc52.i;
        }
        return new nc5(i5, i6, j3, mf72, qj52, m642, i7, i8, jg72);
    }
}

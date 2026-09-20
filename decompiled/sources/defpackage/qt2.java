package defpackage;

import io.ktor.util.date.GMTDate;

/* renamed from: qt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qt2 implements av2 {
    public static final qt2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, qt2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.ktor.util.date.GMTDate", obj, 9);
        ik5.k("seconds", false);
        ik5.k("minutes", false);
        ik5.k("hours", false);
        ik5.k("dayOfWeek", false);
        ik5.k("dayOfMonth", false);
        ik5.k("dayOfYear", false);
        ik5.k("month", false);
        ik5.k("year", false);
        ik5.k("timestamp", false);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = GMTDate.$childSerializers;
        ue3 ue3 = ue3.a;
        return new zr3[]{ue3, ue3, ue3, access$get$childSerializers$cp[3].getValue(), ue3, ue3, access$get$childSerializers$cp[6].getValue(), ue3, tc4.a};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: s88} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = GMTDate.$childSerializers;
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        s88 s88 = null;
        long j = 0;
        boolean z = true;
        xl4 xl4 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
                case b85.b:
                    i2 = c.s(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = c.s(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = c.s(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    s88 = c.r(ll6, 3, (zr3) access$get$childSerializers$cp[3].getValue(), s88);
                    i |= 8;
                    break;
                case 4:
                    i5 = c.s(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = c.s(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    xl4 = (xl4) c.r(ll6, 6, (zr3) access$get$childSerializers$cp[6].getValue(), xl4);
                    i |= 64;
                    break;
                case 7:
                    i7 = c.s(ll6, 7);
                    i |= 128;
                    continue;
                case 8:
                    j = c.D(ll6, 8);
                    i |= 256;
                    continue;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new GMTDate(i, i2, i3, i4, s88, i5, i6, xl4, i7, j, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        GMTDate gMTDate = (GMTDate) obj;
        gMTDate.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        GMTDate.write$Self$ktor_utils(gMTDate, c, ll6);
        c.b(ll6);
    }
}

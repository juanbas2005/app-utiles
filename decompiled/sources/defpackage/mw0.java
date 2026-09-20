package defpackage;

/* renamed from: mw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mw0 implements ms2 {
    public final Object D(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, yt2 yt2, Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        x51 x51 = (x51) obj2;
        hs2 hs2 = (hs2) obj3;
        sr2 sr2 = (sr2) obj4;
        int intValue = num.intValue();
        int i8 = intValue & 6;
        int i9 = intValue;
        jl4 jl4 = jl4.w;
        if (i8 == 0) {
            if (yt2.g(jl4)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | i9;
        } else {
            i = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt2.g(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((i9 & 384) == 0) {
            if (yt2.h(booleanValue)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((i9 & 3072) == 0) {
            if (yt2.g(x51)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((i9 & 24576) == 0) {
            if (yt2.i(hs2)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((i9 & 196608) == 0) {
            if (yt2.i(sr2)) {
                i2 = 131072;
            } else {
                i2 = 65536;
            }
            i |= i2;
        }
        if ((599187 & i) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i & 1, z)) {
            a61.c(str, booleanValue, x51, jl4, hs2, sr2, yt2, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}

package defpackage;

/* renamed from: qr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qr6 {
    public static final py2 a = new py2("NO_VALUE", 4);

    public static pr6 a(vc0 vc0, int i) {
        int i2;
        int i3 = 0;
        if ((i & 1) != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if ((i & 2) == 0) {
            i3 = 16;
        }
        int i4 = i & 4;
        vc0 vc02 = vc0.w;
        if (i4 != 0) {
            vc0 = vc02;
        }
        if (i2 > 0 || i3 > 0 || vc0 == vc02) {
            int i5 = i3 + i2;
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            return new pr6(i2, i5, vc0);
        }
        rf2.j("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", vc0);
        return null;
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final di2 c(mr6 mr6, e81 e81, int i, vc0 vc0) {
        if ((i == 0 || i == -3) && vc0 == vc0.w) {
            return mr6;
        }
        return new jn0(mr6, e81, i, vc0);
    }
}

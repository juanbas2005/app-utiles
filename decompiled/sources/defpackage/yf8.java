package defpackage;

/* renamed from: yf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yf8 implements gs2 {
    public final /* synthetic */ h06 A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ h06 x;
    public final /* synthetic */ zw5 y;
    public final /* synthetic */ h06 z;

    public /* synthetic */ yf8(zw5 zw5, h06 h06, h06 h062, h06 h063) {
        this.y = zw5;
        this.x = h06;
        this.z = h062;
        this.A = h063;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        int i = this.w;
        vs7 vs7 = vs7.a;
        h06 h06 = this.A;
        h06 h062 = this.z;
        zw5 zw5 = this.y;
        h06 h063 = this.x;
        switch (i) {
            case b85.b:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue != 21589) {
                    return vs7;
                }
                long j = 1;
                if (longValue >= 1) {
                    byte readByte = zw5.readByte();
                    boolean z4 = false;
                    if ((readByte & 1) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((readByte & 2) == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z4 = true;
                    }
                    if (z2) {
                        j = 5;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (z4) {
                        j += 4;
                    }
                    if (longValue >= j) {
                        if (z2) {
                            h063.w = Integer.valueOf(zw5.k());
                        }
                        if (z3) {
                            h062.w = Integer.valueOf(zw5.k());
                        }
                        if (!z4) {
                            return vs7;
                        }
                        h06.w = Integer.valueOf(zw5.k());
                        return vs7;
                    }
                    rf2.i("bad zip: extended timestamp extra too short");
                } else {
                    rf2.i("bad zip: extended timestamp extra too short");
                }
                return null;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 != 1) {
                    return vs7;
                }
                if (h063.w != null) {
                    rf2.i("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else if (longValue2 == 24) {
                    h063.w = Long.valueOf(zw5.l());
                    h062.w = Long.valueOf(zw5.l());
                    h06.w = Long.valueOf(zw5.l());
                    return vs7;
                } else {
                    rf2.i("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
        }
    }

    public /* synthetic */ yf8(h06 h06, zw5 zw5, h06 h062, h06 h063) {
        this.x = h06;
        this.y = zw5;
        this.z = h062;
        this.A = h063;
    }
}

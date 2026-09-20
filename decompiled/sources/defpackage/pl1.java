package defpackage;

/* renamed from: pl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pl1 {
    public static final so1 a;

    static {
        String str;
        boolean z;
        ol1 ol1;
        int i = pa7.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            ol1 = ol1.H;
        } else {
            dn1 dn1 = aw1.a;
            gy2 gy2 = pe4.a;
            gy2 gy22 = gy2.B;
            ol1 = gy2;
            if (gy2 == null) {
                ol1 = ol1.H;
            }
        }
        a = ol1;
    }
}

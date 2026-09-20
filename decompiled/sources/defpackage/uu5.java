package defpackage;

/* renamed from: uu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class uu5 {
    public static final dg0 a = td0.u("xn--");

    static {
        dg0 dg0 = dg0.z;
    }

    public static int a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / 700;
        } else {
            i3 = i / 2;
        }
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        ku4.c(i, "unexpected digit: ");
        return 0;
    }
}

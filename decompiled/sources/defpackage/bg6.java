package defpackage;

/* renamed from: bg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bg6 {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final tp4 b = new tp4(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int c(int i) {
        if (i > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int d(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}

package defpackage;

/* renamed from: o4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o4 extends f1 {
    public static o4 c;

    public final int[] e(int i) {
        int length = i().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && i().charAt(i) == 10 && (i().charAt(i) == 10 || (i != 0 && i().charAt(i - 1) != 10))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !s(i2)) {
            i2++;
        }
        return h(i, i2);
    }

    public final int[] q(int i) {
        int length = i().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && i().charAt(i - 1) == 10 && !s(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (i().charAt(i2) == 10 || (i2 != 0 && i().charAt(i2 - 1) != 10))) {
            i2--;
        }
        return h(i2, i);
    }

    public final boolean s(int i) {
        if (i <= 0 || i().charAt(i - 1) == 10) {
            return false;
        }
        if (i == i().length() || i().charAt(i) == 10) {
            return true;
        }
        return false;
    }
}

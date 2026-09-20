package defpackage;

import java.util.RandomAccess;

/* renamed from: rs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rs extends h2 implements RandomAccess {
    public final /* synthetic */ int[] w;

    public rs(int[] iArr) {
        this.w = iArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return qs.G0(this.w, ((Number) obj).intValue());
    }

    public final int f() {
        return this.w.length;
    }

    public final Object get(int i) {
        return Integer.valueOf(this.w[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.w;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.w.length == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.w;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (intValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        }
        return -1;
    }
}

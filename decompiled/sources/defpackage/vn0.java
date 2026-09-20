package defpackage;

import java.util.Arrays;

/* renamed from: vn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vn0 extends ko5 {
    public char[] a;
    public int b;

    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

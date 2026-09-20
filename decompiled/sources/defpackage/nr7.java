package defpackage;

import java.util.Arrays;

/* renamed from: nr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr7 extends ko5 {
    public int[] a;
    public int b;

    public final Object a() {
        return new mr7(Arrays.copyOf(this.a, this.b));
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

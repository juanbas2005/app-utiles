package defpackage;

import java.util.Arrays;

/* renamed from: sr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sr7 extends ko5 {
    public long[] a;
    public int b;

    public final Object a() {
        return new rr7(Arrays.copyOf(this.a, this.b));
    }

    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

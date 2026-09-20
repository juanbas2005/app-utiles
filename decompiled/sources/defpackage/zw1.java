package defpackage;

import java.util.Arrays;

/* renamed from: zw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw1 extends ko5 {
    public double[] a;
    public int b;

    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

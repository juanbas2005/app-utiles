package defpackage;

import java.util.Arrays;

/* renamed from: jh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jh2 extends ko5 {
    public float[] a;
    public int b;

    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

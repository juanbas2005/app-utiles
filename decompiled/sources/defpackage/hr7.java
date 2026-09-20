package defpackage;

import java.util.Arrays;

/* renamed from: hr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hr7 extends ko5 {
    public byte[] a;
    public int b;

    public final Object a() {
        return new gr7(Arrays.copyOf(this.a, this.b));
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final int d() {
        return this.b;
    }
}

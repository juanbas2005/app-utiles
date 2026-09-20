package defpackage;

import java.io.OutputStream;

/* renamed from: x44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x44 extends OutputStream {
    public long w;

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.w += (long) i2;
    }

    public final void write(byte[] bArr) {
        this.w += (long) bArr.length;
    }

    public final void write(int i) {
        this.w++;
    }
}

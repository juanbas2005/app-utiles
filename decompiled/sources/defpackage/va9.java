package defpackage;

import java.io.FilterOutputStream;

/* renamed from: va9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class va9 extends FilterOutputStream {
    public void write(byte[] bArr) {
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}

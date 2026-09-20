package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: ls7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ls7 extends OutputStream {
    public final FileOutputStream w;

    public ls7(FileOutputStream fileOutputStream) {
        this.w = fileOutputStream;
    }

    public final void flush() {
        this.w.flush();
    }

    public final void write(byte[] bArr) {
        bArr.getClass();
        this.w.write(bArr);
    }

    public final void write(int i) {
        this.w.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.w.write(bArr, i, i2);
    }

    public final void close() {
    }
}

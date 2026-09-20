package defpackage;

import java.io.InputStream;

/* renamed from: q82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q82 extends InputStream {
    public final InputStream w;
    public int x = 1073741824;

    public q82(InputStream inputStream) {
        this.w = inputStream;
    }

    public final int available() {
        return this.x;
    }

    public final void close() {
        this.w.close();
    }

    public final int read() {
        int read = this.w.read();
        if (read == -1) {
            this.x = 0;
        }
        return read;
    }

    public final long skip(long j) {
        return this.w.skip(j);
    }

    public final int read(byte[] bArr) {
        int read = this.w.read(bArr);
        if (read == -1) {
            this.x = 0;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.w.read(bArr, i, i2);
        if (read == -1) {
            this.x = 0;
        }
        return read;
    }
}

package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* renamed from: j2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j2 extends FilterInputStream {
    public int w;

    public j2(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.w = i;
    }

    public final int available() {
        return Math.min(super.available(), this.w);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.w;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.w -= read;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = super.skip(Math.min(j, (long) this.w));
        if (skip >= 0) {
            this.w = (int) (((long) this.w) - skip);
        }
        return skip;
    }

    public final int read() {
        if (this.w <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.w--;
        }
        return read;
    }
}

package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: tf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tf0 extends FilterInputStream {
    public long w = 1048577;
    public long x = -1;

    public tf0(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.w);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.x = this.w;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.w;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.w -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.x != -1) {
            this.in.reset();
            this.w = this.x;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.w));
        this.w -= skip;
        return skip;
    }

    public final int read() {
        if (this.w == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.w--;
        }
        return read;
    }
}

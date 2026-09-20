package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: yd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd3 extends InputStream {
    public long A;
    public long B = -1;
    public final InputStream w;
    public final sy4 x;
    public final ui7 y;
    public long z = -1;

    public yd3(InputStream inputStream, sy4 sy4, ui7 ui7) {
        this.y = ui7;
        this.w = inputStream;
        this.x = sy4;
        this.A = ((ry4) sy4.z.x).O();
    }

    public final void a(long j) {
        long j2 = this.z;
        if (j2 == -1) {
            this.z = j;
        } else {
            this.z = j2 + j;
        }
    }

    public final int available() {
        try {
            return this.w.available();
        } catch (IOException e) {
            ui7 ui7 = this.y;
            sy4 sy4 = this.x;
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final void close() {
        sy4 sy4 = this.x;
        ui7 ui7 = this.y;
        long b = ui7.b();
        if (this.B == -1) {
            this.B = b;
        }
        try {
            this.w.close();
            long j = this.z;
            if (j != -1) {
                sy4.h(j);
            }
            long j2 = this.A;
            if (j2 != -1) {
                py4 py4 = sy4.z;
                py4.h();
                ry4.z((ry4) py4.x, j2);
            }
            sy4.i(this.B);
            sy4.b();
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final void mark(int i) {
        this.w.mark(i);
    }

    public final boolean markSupported() {
        return this.w.markSupported();
    }

    public final int read() {
        ui7 ui7 = this.y;
        sy4 sy4 = this.x;
        try {
            int read = this.w.read();
            long b = ui7.b();
            if (this.A == -1) {
                this.A = b;
            }
            if (read == -1 && this.B == -1) {
                this.B = b;
                sy4.i(b);
                sy4.b();
                return read;
            }
            a(1);
            sy4.h(this.z);
            return read;
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final void reset() {
        try {
            this.w.reset();
        } catch (IOException e) {
            ui7 ui7 = this.y;
            sy4 sy4 = this.x;
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final long skip(long j) {
        ui7 ui7 = this.y;
        sy4 sy4 = this.x;
        try {
            long skip = this.w.skip(j);
            long b = ui7.b();
            if (this.A == -1) {
                this.A = b;
            }
            if (skip == 0 && j != 0 && this.B == -1) {
                this.B = b;
                sy4.i(b);
                return skip;
            }
            a(skip);
            sy4.h(this.z);
            return skip;
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        ui7 ui7 = this.y;
        sy4 sy4 = this.x;
        try {
            int read = this.w.read(bArr, i, i2);
            long b = ui7.b();
            if (this.A == -1) {
                this.A = b;
            }
            if (read == -1 && this.B == -1) {
                this.B = b;
                sy4.i(b);
                sy4.b();
                return read;
            }
            a((long) read);
            sy4.h(this.z);
            return read;
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        ui7 ui7 = this.y;
        sy4 sy4 = this.x;
        try {
            int read = this.w.read(bArr);
            long b = ui7.b();
            if (this.A == -1) {
                this.A = b;
            }
            if (read == -1 && this.B == -1) {
                this.B = b;
                sy4.i(b);
                sy4.b();
                return read;
            }
            a((long) read);
            sy4.h(this.z);
            return read;
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }
}

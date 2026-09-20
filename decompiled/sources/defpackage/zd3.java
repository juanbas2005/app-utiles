package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: zd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zd3 extends OutputStream {
    public final OutputStream w;
    public final ui7 x;
    public final sy4 y;
    public long z = -1;

    public zd3(OutputStream outputStream, sy4 sy4, ui7 ui7) {
        this.w = outputStream;
        this.y = sy4;
        this.x = ui7;
    }

    public final void close() {
        long j = this.z;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        sy4 sy4 = this.y;
        if (i != 0) {
            sy4.e(j);
        }
        ui7 ui7 = this.x;
        long b = ui7.b();
        py4 py4 = sy4.z;
        py4.h();
        ry4.y((ry4) py4.x, b);
        try {
            this.w.close();
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final void flush() {
        try {
            this.w.flush();
        } catch (IOException e) {
            ui7 ui7 = this.x;
            sy4 sy4 = this.y;
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public final void write(int i) {
        sy4 sy4 = this.y;
        try {
            this.w.write(i);
            long j = this.z + 1;
            this.z = j;
            sy4.e(j);
        } catch (IOException e) {
            f21.t(this.x, sy4, sy4);
            throw e;
        }
    }

    public final void write(byte[] bArr) {
        sy4 sy4 = this.y;
        try {
            this.w.write(bArr);
            long length = this.z + ((long) bArr.length);
            this.z = length;
            sy4.e(length);
        } catch (IOException e) {
            f21.t(this.x, sy4, sy4);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        sy4 sy4 = this.y;
        try {
            this.w.write(bArr, i, i2);
            long j = this.z + ((long) i2);
            this.z = j;
            sy4.e(j);
        } catch (IOException e) {
            f21.t(this.x, sy4, sy4);
            throw e;
        }
    }
}

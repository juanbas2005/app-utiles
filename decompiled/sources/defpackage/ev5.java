package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: ev5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ev5 extends InputStream {
    public int w;
    public int x;
    public final /* synthetic */ gv5 y;

    public ev5(gv5 gv5, dv5 dv5) {
        this.y = gv5;
        this.w = gv5.I(dv5.b + 4);
        this.x = dv5.c;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ku4.j("buffer");
            return 0;
        } else if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int i3 = this.x;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.w;
            gv5 gv5 = this.y;
            gv5.D(i4, i, i2, bArr);
            this.w = gv5.I(this.w + i2);
            this.x -= i2;
            return i2;
        }
    }

    public final int read() {
        gv5 gv5 = this.y;
        RandomAccessFile randomAccessFile = gv5.w;
        if (this.x == 0) {
            return -1;
        }
        randomAccessFile.seek((long) this.w);
        int read = randomAccessFile.read();
        this.w = gv5.I(this.w + 1);
        this.x--;
        return read;
    }
}

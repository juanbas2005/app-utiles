package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: r33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r33 implements oy6 {
    public int A;
    public final ed0 w;
    public int x;
    public int y;
    public int z;

    public r33(ed0 ed0) {
        ed0.getClass();
        this.w = ed0;
    }

    public final long Y(long j, sc0 sc0) {
        int i;
        int readInt;
        sc0.getClass();
        do {
            int i2 = this.z;
            ed0 ed0 = this.w;
            if (i2 == 0) {
                ed0.skip((long) this.A);
                this.A = 0;
                if ((this.x & 4) == 0) {
                    i = this.y;
                    int m = dg8.m(ed0);
                    this.z = m;
                    byte readByte = ed0.readByte() & 255;
                    this.x = ed0.readByte() & 255;
                    Logger logger = s33.z;
                    if (logger.isLoggable(Level.FINE)) {
                        dg0 dg0 = i33.a;
                        logger.fine(i33.b(true, this.y, m, readByte, this.x));
                    }
                    readInt = ed0.readInt() & Integer.MAX_VALUE;
                    this.y = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long Y = ed0.Y(Math.min(j, (long) i2), sc0);
                if (Y != -1) {
                    this.z -= (int) Y;
                    return Y;
                }
            }
            return -1;
        } while (readInt == i);
        rf2.i("TYPE_CONTINUATION streamId changed");
        return 0;
    }

    public final ri7 g() {
        return this.w.g();
    }

    public final void close() {
    }
}

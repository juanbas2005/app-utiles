package defpackage;

import java.io.InputStream;

/* renamed from: o82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o82 extends k82 {
    public o82(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.w.mark(Integer.MAX_VALUE);
        } else {
            h.q("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void k(long j) {
        int i = this.x;
        if (((long) i) > j) {
            this.x = 0;
            this.w.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public o82(byte[] bArr) {
        super(bArr);
        this.w.mark(Integer.MAX_VALUE);
    }
}

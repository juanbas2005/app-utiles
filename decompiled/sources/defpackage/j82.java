package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: j82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j82 extends MediaDataSource {
    public long w;
    public final /* synthetic */ o82 x;

    public j82(o82 o82) {
        this.x = o82;
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        o82 o82 = this.x;
        DataInputStream dataInputStream = o82.w;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.w;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        o82.k(j);
                        this.w = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = o82.read(bArr, i, i2);
                if (read >= 0) {
                    this.w += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.w = -1;
            return -1;
        }
        return -1;
    }

    public final void close() {
    }
}

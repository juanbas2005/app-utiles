package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: a07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a07 extends f56 {
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ AtomicLong c;

    public a07(byte[] bArr, AtomicLong atomicLong) {
        this.b = bArr;
        this.c = atomicLong;
    }

    public final long a() {
        return (long) this.b.length;
    }

    public final yh4 b() {
        k26 k26 = yh4.e;
        return ie1.G("application/octet-stream");
    }

    public final void d(dd0 dd0) {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                int min = Math.min(32768, bArr.length - i);
                dd0.write(bArr, i, min);
                i += min;
                this.c.addAndGet((long) min);
            } else {
                return;
            }
        }
    }
}

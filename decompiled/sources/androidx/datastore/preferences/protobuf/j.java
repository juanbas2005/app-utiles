package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j {
    public abstract k a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048 A[LOOP:0: B:17:0x0048->B:20:0x0055, LOOP_START] */
    public final boolean b(int i, d dVar, Object obj) {
        int i2 = dVar.b;
        us0 us0 = dVar.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            dVar.w(0);
            ((k) obj).c(i3 << 3, Long.valueOf(us0.s()));
            return true;
        } else if (i4 == 1) {
            dVar.w(1);
            ((k) obj).c((i3 << 3) | 1, Long.valueOf(us0.p()));
            return true;
        } else if (i4 == 2) {
            ((k) obj).c((i3 << 3) | 2, dVar.e());
            return true;
        } else if (i4 == 3) {
            k kVar = new k(0, new int[8], new Object[8], true);
            int i5 = i3 << 3;
            int i6 = i5 | 4;
            int i7 = i + 1;
            if (i7 < 100) {
                while (dVar.a() != Integer.MAX_VALUE && b(i7, dVar, kVar)) {
                }
                if (i6 == dVar.b) {
                    if (kVar.e) {
                        kVar.e = false;
                    }
                    ((k) obj).c(i5 | 3, kVar);
                    return true;
                }
                throw new IOException("Protocol message end-group tag did not match expected tag.");
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                dVar.w(5);
                ((k) obj).c(5 | (i3 << 3), Integer.valueOf(us0.o()));
                return true;
            }
            throw InvalidProtocolBufferException.b();
        }
    }
}

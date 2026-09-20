package defpackage;

/* renamed from: j97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j97 implements mk1 {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r2 != -1) goto L_0x0054;
     */
    public final pk1 a(xy6 xy6, v75 v75) {
        long j;
        String str = xy6.b;
        u83 u83 = xy6.a;
        if (!sg3.e(str, "image/svg+xml")) {
            ed0 k = u83.k();
            if (k.c0(0, i97.b)) {
                dg0 dg0 = i97.a;
                byte[] bArr = dg0.w;
                if (bArr.length > 0) {
                    byte b = bArr[0];
                    long length = 1024 - ((long) bArr.length);
                    long j2 = 0;
                    while (true) {
                        if (j2 >= length) {
                            j = -1;
                            break;
                        }
                        byte b2 = b;
                        long j3 = length;
                        j = k.C(b2, j2, j3);
                        if (j == -1 || k.c0(j, dg0)) {
                            break;
                        }
                        j2 = j + 1;
                        length = j3;
                        b = b2;
                    }
                } else {
                    h.q("bytes is empty");
                }
            }
            return null;
        }
        return new k97(u83, v75);
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof j97)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true);
    }
}

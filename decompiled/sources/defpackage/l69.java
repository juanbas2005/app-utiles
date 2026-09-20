package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: l69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l69 {
    public static final l69 c = new l69(e69.b, c69.A());
    public final e69 a;
    public final c69 b;

    public l69(e69 e69, c69 c69) {
        e69.getClass();
        this.a = e69;
        this.b = c69;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r2.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        r7.addSuppressed(r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x002c, B:9:0x0040, B:23:0x0075, B:33:0x0094] */
    public static l69 a(yk8 yk8, boolean z) {
        e69 e69;
        int i;
        int C = yk8.C();
        if (C <= 1) {
            yk8.C();
            int a2 = yk8.a(yk8.A());
            gl8 gl8 = gl8.a;
            int i2 = rk8.a;
            c69 z2 = c69.z(yk8, gl8.b);
            yk8.b(a2);
            gx5 gx5 = new gx5();
            Inflater inflater = (Inflater) gx5.x;
            if (z) {
                int a3 = yk8.a(yk8.A());
                int c2 = yk8.c();
                if (c2 < 0) {
                    i = 4096;
                } else {
                    i = Math.min(c2, 4096);
                }
                e69 = e69.a(yk8.h(new InflaterInputStream(new aa0(gx5, yk8), inflater, i), 4096));
                inflater.reset();
                if (yk8.c() == 0) {
                    yk8.b(a3);
                } else {
                    throw new IOException("Unexpected bytes remaining after FlagsBlob parsing.");
                }
            } else {
                inflater.setInput(yk8.z());
                e69 = e69.a(yk8.h(new aa0(4, (Object) gx5), 4096));
                inflater.reset();
            }
            gx5.close();
            return new l69(e69, z2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 44);
        sb.append("Unsupported version: ");
        sb.append(C);
        sb.append(". Current version is: 1");
        throw new IOException(sb.toString());
        throw th;
    }
}

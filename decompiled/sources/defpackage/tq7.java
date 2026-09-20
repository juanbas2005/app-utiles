package defpackage;

import java.nio.ByteBuffer;

/* renamed from: tq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tq7 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final am6 b;
    public volatile int c = 0;

    public tq7(am6 am6, int i) {
        this.b = am6;
        this.a = i;
    }

    public final int a(int i) {
        ok4 b2 = b();
        int a2 = b2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.z;
        int i2 = a2 + b2.w;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ye4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final ok4 b() {
        ThreadLocal threadLocal = d;
        ok4 ok4 = (ok4) threadLocal.get();
        ok4 ok42 = ok4;
        if (ok4 == null) {
            ? ye4 = new ye4();
            threadLocal.set(ye4);
            ok42 = ye4;
        }
        pk4 pk4 = (pk4) this.b.x;
        int a2 = pk4.a(6);
        if (a2 != 0) {
            int i = a2 + pk4.w;
            int i2 = (this.a * 4) + ((ByteBuffer) pk4.z).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) pk4.z).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) pk4.z;
            ok42.z = byteBuffer;
            if (byteBuffer != null) {
                ok42.w = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ok42.x = i4;
                ok42.y = ((ByteBuffer) ok42.z).getShort(i4);
                return ok42;
            }
            ok42.w = 0;
            ok42.x = 0;
            ok42.y = 0;
        }
        return ok42;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ok4 b2 = b();
        int a2 = b2.a(4);
        if (a2 != 0) {
            i = ((ByteBuffer) b2.z).getInt(a2 + b2.w);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        ok4 b3 = b();
        int a3 = b3.a(16);
        if (a3 != 0) {
            int i3 = a3 + b3.w;
            i2 = ((ByteBuffer) b3.z).getInt(((ByteBuffer) b3.z).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

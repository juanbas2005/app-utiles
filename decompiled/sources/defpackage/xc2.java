package defpackage;

import java.io.Closeable;

/* renamed from: xc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xc2 extends u83 {
    public boolean A;
    public zw5 B;
    public final ae5 w;
    public final nd2 x;
    public final String y;
    public final Closeable z;

    public xc2(ae5 ae5, nd2 nd2, String str, Closeable closeable) {
        this.w = ae5;
        this.x = nd2;
        this.y = str;
        this.z = closeable;
    }

    public final ie1 a() {
        return null;
    }

    public final synchronized void close() {
        try {
            this.A = true;
            zw5 zw5 = this.B;
            if (zw5 != null) {
                i.a(zw5);
            }
            Closeable closeable = this.z;
            if (closeable != null) {
                i.a(closeable);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized ed0 k() {
        if (!this.A) {
            zw5 zw5 = this.B;
            if (zw5 != null) {
                return zw5;
            }
            oy6 L = this.x.L(this.w);
            L.getClass();
            zw5 zw52 = new zw5(L);
            this.B = zw52;
            return zw52;
        }
        throw new IllegalStateException("closed");
    }
}

package defpackage;

import java.io.IOException;

/* renamed from: qy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qy6 implements hf0 {
    public final tc0 b;
    private volatile js0 closed;

    public qy6(tc0 tc0) {
        this.b = tc0;
    }

    public final void a(Throwable th) {
        if (this.closed == null) {
            String message = th.getMessage();
            if (message == null) {
                message = "Channel was cancelled";
            }
            this.closed = new js0(new IOException(message, th));
        }
    }

    public final Throwable b() {
        js0 js0 = this.closed;
        if (js0 != null) {
            return js0.a(is0.D);
        }
        return null;
    }

    public final Object d(int i, h61 h61) {
        Throwable b2 = b();
        if (b2 == null) {
            return Boolean.valueOf(this.b.j((long) i));
        }
        throw b2;
    }

    public final tc0 g() {
        Throwable b2 = b();
        if (b2 == null) {
            return this.b;
        }
        throw b2;
    }

    public final boolean h() {
        return this.b.x();
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ls0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ls0 implements AutoCloseable, o81 {
    public final e81 w;

    public ls0(e81 e81) {
        e81.getClass();
        this.w = e81;
    }

    public final void close() {
        r16.u(this.w, (CancellationException) null);
    }

    public final e81 k() {
        return this.w;
    }
}

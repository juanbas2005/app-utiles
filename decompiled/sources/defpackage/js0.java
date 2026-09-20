package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: js0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class js0 {
    public final Throwable a;

    public js0(Throwable th) {
        this.a = th;
    }

    public final Throwable a(vr2 vr2) {
        Throwable th = this.a;
        if (th == null) {
            return null;
        }
        if (th instanceof e71) {
            return ((e71) th).a();
        }
        if (th instanceof CancellationException) {
            return rc9.b(((CancellationException) th).getMessage(), th);
        }
        return (Throwable) vr2.y(th);
    }
}

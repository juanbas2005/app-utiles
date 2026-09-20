package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: nj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nj8 extends rj8 {
    public static final nj8 b = new nj8(sj8.a);
    public final AtomicReference a;

    public nj8(rj8 rj8) {
        this.a = new AtomicReference(rj8);
    }

    public final void a(String str, Level level, boolean z) {
        ((rj8) this.a.get()).a(str, level, z);
    }

    public final yj8 b() {
        return ((rj8) this.a.get()).b();
    }

    public final b85 c() {
        return ((rj8) this.a.get()).c();
    }
}

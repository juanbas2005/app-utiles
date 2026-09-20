package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* renamed from: lf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf2 implements lu5 {
    public final kf2 a;
    public final kf2 b;
    public final kf2 c;
    public final kf2 d;
    public final qd1 e;
    public final qd1 f;
    public final qd1 g;

    public lf2(kf2 kf2, kf2 kf22, kf2 kf23, kf2 kf24, qd1 qd1, qd1 qd12, qd1 qd13) {
        this.a = kf2;
        this.b = kf22;
        this.c = kf23;
        this.d = kf24;
        this.e = qd1;
        this.f = qd12;
        this.g = qd13;
    }

    public final Object get() {
        return new if2((oe2) this.a.get(), (nu5) this.b.get(), (we2) this.c.get(), (nu5) this.d.get(), (RemoteConfigManager) this.e.get(), (b01) this.f.get(), (SessionManager) this.g.get());
    }
}

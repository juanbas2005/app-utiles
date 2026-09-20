package defpackage;

/* renamed from: jl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jl3 extends gl3 {
    public final ll3 D;
    public final kl3 E;
    public final bp0 F;
    public final Object G;

    public jl3(ll3 ll3, kl3 kl3, bp0 bp0, Object obj) {
        this.D = ll3;
        this.E = kl3;
        this.F = bp0;
        this.G = obj;
    }

    public final boolean r() {
        return false;
    }

    public final void s(Throwable th) {
        bp0 bp0 = this.F;
        bp0 f0 = ll3.f0(bp0);
        ll3 ll3 = this.D;
        kl3 kl3 = this.E;
        Object obj = this.G;
        if (f0 == null || !ll3.u0(kl3, f0, obj)) {
            kl3.w.c(new o74(2), 2);
            bp0 f02 = ll3.f0(bp0);
            if (f02 == null || !ll3.u0(kl3, f02, obj)) {
                ll3.d(ll3.z(kl3, obj));
            }
        }
    }
}

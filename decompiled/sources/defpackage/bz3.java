package defpackage;

import java.util.Map;

/* renamed from: bz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz3 implements mh4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ vr2 d;
    public final /* synthetic */ cz3 e;
    public final /* synthetic */ iz3 f;
    public final /* synthetic */ vr2 g;

    public bz3(int i, int i2, Map map, vr2 vr2, cz3 cz3, iz3 iz3, vr2 vr22) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = vr2;
        this.e = cz3;
        this.f = iz3;
        this.g = vr22;
    }

    public final Map a() {
        return this.c;
    }

    public final void b() {
        gc3 gc3;
        uy3 uy3 = this.f.w;
        boolean a0 = this.e.a0();
        vr2 vr2 = this.g;
        if (!a0 || (gc3 = ((hc3) uy3.a0.d).s0) == null) {
            vr2.y(((hc3) uy3.a0.d).L);
        } else {
            vr2.y(gc3.L);
        }
    }

    public final int c() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final vr2 g() {
        return this.d;
    }
}

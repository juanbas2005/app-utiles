package defpackage;

import java.util.Map;

/* renamed from: nh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nh4 implements mh4 {
    public final int a;
    public final int b;
    public final Map c;
    public final pb d;
    public final z0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ oh4 g;
    public final /* synthetic */ wd h;

    public nh4(int i, int i2, Map map, pb pbVar, z0 z0Var, oh4 oh4, wd wdVar) {
        this.f = i;
        this.g = oh4;
        this.h = wdVar;
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = pbVar;
        this.e = z0Var;
    }

    public final Map a() {
        return this.c;
    }

    public final void b() {
        oh4 oh4 = this.g;
        boolean z = oh4 instanceof dd4;
        wd wdVar = this.h;
        if (z) {
            wdVar.y(((dd4) oh4).L);
            return;
        }
        wdVar.y(new eu6(this.f, oh4.getLayoutDirection(), oh4.b(), oh4.Y()));
    }

    public final int c() {
        return this.b;
    }

    public final vr2 d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    public final gs2 f() {
        return this.e;
    }
}

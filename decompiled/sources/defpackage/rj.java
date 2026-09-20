package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: rj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rj extends a97 implements vr2 {
    public il A;
    public d06 B;
    public int C;
    public final /* synthetic */ uj D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ ub7 F;
    public final /* synthetic */ long G;
    public final /* synthetic */ vr2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj(uj ujVar, Object obj, ub7 ub7, long j, vr2 vr2, f61 f61) {
        super(1, f61);
        this.D = ujVar;
        this.E = obj;
        this.F = ub7;
        this.G = j;
        this.H = vr2;
    }

    public final f61 l(f61 f61) {
        return new rj(this.D, this.E, this.F, this.G, this.H, f61);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, d06] */
    public final Object s(Object obj) {
        uj ujVar;
        CancellationException cancellationException;
        il ilVar;
        d06 d06;
        al alVar;
        ub7 ub7 = this.F;
        int i = this.C;
        uj ujVar2 = this.D;
        if (i == 0) {
            o85.q(obj);
            try {
                ujVar2.c.y = (ol) ujVar2.a.a.y(this.E);
                ujVar2.e.setValue(ub7.c);
                ujVar2.d.setValue(Boolean.TRUE);
                il ilVar2 = ujVar2.c;
                il ilVar3 = new il(ilVar2.w, ilVar2.x.getValue(), tf4.m(ilVar2.y), ilVar2.z, Long.MIN_VALUE, ilVar2.B);
                ? obj2 = new Object();
                long j = this.G;
                qj qjVar = new qj((Object) ujVar2, (Object) ilVar3, (Object) this.H, (Object) obj2, 0);
                ujVar = ujVar2;
                try {
                    this.A = ilVar3;
                    this.B = obj2;
                    this.C = 1;
                    il ilVar4 = ilVar3;
                    Object d = i95.d(ilVar4, ub7, j, qjVar, this);
                    il ilVar5 = ilVar4;
                    p81 p81 = p81.w;
                    if (d == p81) {
                        return p81;
                    }
                    ilVar = ilVar5;
                    d06 = obj2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    uj.b(ujVar);
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                ujVar = ujVar2;
                cancellationException = e;
                uj.b(ujVar);
                throw cancellationException;
            }
        } else if (i == 1) {
            d06 = this.B;
            ilVar = this.A;
            try {
                o85.q(obj);
                ujVar = ujVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                ujVar = ujVar2;
                uj.b(ujVar);
                throw cancellationException;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (d06.w) {
            alVar = al.w;
        } else {
            alVar = al.x;
        }
        uj.b(ujVar);
        return new fl(ilVar, alVar);
    }

    public final Object y(Object obj) {
        return ((rj) l((f61) obj)).s(vs7.a);
    }
}

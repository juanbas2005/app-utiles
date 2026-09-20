package defpackage;

import cu.lestebang.utiletecsa.MainActivity;

/* renamed from: yd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd4 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ MainActivity C;
    public final /* synthetic */ ed5 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd4(MainActivity mainActivity, ed5 ed5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = mainActivity;
        this.D = ed5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((yd4) o(f61, o81)).s(vs7);
            default:
                return ((yd4) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ed5 ed5 = this.D;
        MainActivity mainActivity = this.C;
        switch (i) {
            case b85.b:
                return new yd4(mainActivity, ed5, f61, 0);
            default:
                return new yd4(mainActivity, ed5, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        ed5 ed5 = this.D;
        MainActivity mainActivity = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    di2 u = gr8.u(gr8.F(gr8.w(new n0(mainActivity, (f61) null, 2))), -1);
                    int i3 = MainActivity.g0;
                    di2 F = gr8.F(new d31(new qi2(new kj2(u, mainActivity.v().e, new ud4(3, (f61) null, 0)), new tc1(ed5, (f61) null, 8), 2), 1));
                    lg lgVar = new lg(6, mainActivity);
                    this.B = 1;
                    if (F.a(lgVar, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    w54 w54 = mainActivity.w;
                    yd4 yd4 = new yd4(mainActivity, ed5, (f61) null, 0);
                    this.B = 1;
                    if (g75.P(w54, k54.z, yd4, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}

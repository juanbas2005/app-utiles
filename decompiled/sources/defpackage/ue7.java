package defpackage;

/* renamed from: ue7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue7 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ze7 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue7(ze7 ze7, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.B = ze7;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        ze7 ze7 = this.B;
        switch (i) {
            case b85.b:
                return new ue7(ze7, f61, 0);
            case 1:
                return new ue7(ze7, f61, 1);
            case 2:
                return new ue7(ze7, f61, 2);
            default:
                return new ue7(ze7, f61, 3);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        ze7 ze7 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                ze7.B = false;
                return vs7;
            case 1:
                o85.q(obj);
                ze7.f();
                return vs7;
            case 2:
                o85.q(obj);
                ze7.d(ze7.B);
                return vs7;
            default:
                o85.q(obj);
                ze7.p();
                return vs7;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                ((ue7) l(f61)).s(vs7);
                return vs7;
            case 1:
                ((ue7) l(f61)).s(vs7);
                return vs7;
            case 2:
                ((ue7) l(f61)).s(vs7);
                return vs7;
            default:
                ((ue7) l(f61)).s(vs7);
                return vs7;
        }
    }
}

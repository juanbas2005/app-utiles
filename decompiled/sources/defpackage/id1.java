package defpackage;

/* renamed from: id1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class id1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ vr2 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id1(f61 f61, vr2 vr2, int i) {
        super(2, f61);
        this.A = i;
        this.C = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((id1) o((f61) obj2, (rd5) obj)).s(vs7);
            case 1:
                return ((id1) o((f61) obj2, (rd5) obj)).s(vs7);
            default:
                ((id1) o((f61) obj2, (pp4) obj)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        vr2 vr2 = this.C;
        switch (i) {
            case b85.b:
                id1 id1 = new id1(f61, vr2, 0);
                id1.B = obj;
                return id1;
            case 1:
                id1 id12 = new id1(f61, vr2, 1);
                id12.B = obj;
                return id12;
            default:
                id1 id13 = new id1(vr2, f61);
                id13.B = obj;
                return id13;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vr2 vr2 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                rd5 rd5 = (rd5) this.B;
                rd5.getClass();
                return vr2.y(rd5.c());
            case 1:
                o85.q(obj);
                rd5 rd52 = (rd5) this.B;
                rd52.getClass();
                return vr2.y(rd52.c());
            default:
                o85.q(obj);
                vr2.y((pp4) this.B);
                return vs7.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public id1(vr2 vr2, f61 f61) {
        super(2, f61);
        this.A = 2;
        this.C = vr2;
    }
}

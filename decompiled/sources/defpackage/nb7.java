package defpackage;

/* renamed from: nb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nb7 extends l66 implements gs2 {
    public final /* synthetic */ o81 A;
    public final /* synthetic */ co5 B;
    public final /* synthetic */ hs2 C;
    public final /* synthetic */ vr2 D;
    public int y;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nb7(o81 o81, co5 co5, hs2 hs2, vr2 vr2, f61 f61) {
        super(2, f61);
        this.A = o81;
        this.B = co5;
        this.C = hs2;
        this.D = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((nb7) o((f61) obj2, (g97) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        nb7 nb7 = new nb7(this.A, this.B, this.C, this.D, f61);
        nb7.z = obj;
        return nb7;
    }

    public final Object s(Object obj) {
        int i = this.y;
        if (i == 0) {
            o85.q(obj);
            this.y = 1;
            Object g = sb7.g((g97) this.z, this.A, this.B, this.C, this.D, this);
            p81 p81 = p81.w;
            if (g == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }
}

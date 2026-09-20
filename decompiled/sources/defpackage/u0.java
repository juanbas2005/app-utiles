package defpackage;

/* renamed from: u0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ v0 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = v0Var;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((u0) o(f61, o81)).s(vs7);
                return vs7;
            default:
                ((u0) o(f61, o81)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        v0 v0Var = this.B;
        switch (i) {
            case b85.b:
                return new u0(v0Var, f61, 0);
            default:
                return new u0(v0Var, f61, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [r23, java.lang.Object] */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        v0 v0Var = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                if (v0Var.Z == null) {
                    ? obj2 = new Object();
                    ap4 ap4 = v0Var.M;
                    if (ap4 != null) {
                        ar7.H(v0Var.J0(), (e81) null, (r81) null, new n0(ap4, obj2, (f61) null, 0), 3);
                    }
                    v0Var.Z = obj2;
                }
                return vs7;
            default:
                o85.q(obj);
                r23 r23 = v0Var.Z;
                if (r23 != null) {
                    s23 s23 = new s23(r23);
                    ap4 ap42 = v0Var.M;
                    if (ap42 != null) {
                        ar7.H(v0Var.J0(), (e81) null, (r81) null, new n0(ap42, s23, (f61) null, 1), 3);
                    }
                    v0Var.Z = null;
                }
                return vs7;
        }
    }
}

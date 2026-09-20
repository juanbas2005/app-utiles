package defpackage;

/* renamed from: jy1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy1 extends l66 implements gs2 {
    public /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ ds2 D;
    public final /* synthetic */ ds2 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int y = 0;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy1(nf1 nf1, jk0 jk0, gs2 gs2, sr2 sr2, sn snVar, f61 f61) {
        super(2, f61);
        this.B = nf1;
        this.C = jk0;
        this.D = gs2;
        this.E = sr2;
        this.F = snVar;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        g97 g97 = (g97) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((jy1) o(f61, g97)).s(vs7);
            default:
                return ((jy1) o(f61, g97)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.F;
        ds2 ds2 = this.E;
        ds2 ds22 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                sr2 sr2 = (sr2) ds2;
                jy1 jy1 = new jy1((nf1) this.B, (jk0) obj3, (gs2) ds22, sr2, (sn) obj2, f61);
                jy1.A = obj;
                return jy1;
            default:
                jy1 jy12 = new jy1((o81) obj3, (pe7) ds22, (t46) ds2, (co5) obj2, f61);
                jy12.A = obj;
                return jy12;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: g97} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
        if (r11 == r9) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        if (r3 == r9) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r3 == r9) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        Object obj2;
        g97 g97;
        Object obj3;
        f61 f61;
        el3 el3;
        Object obj4;
        g97 g972;
        int i = this.y;
        vs7 vs7 = vs7.a;
        ds2 ds2 = this.E;
        ds2 ds22 = this.D;
        Object obj5 = p81.w;
        Object obj6 = this.F;
        Object obj7 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.z;
                if (i2 == 0) {
                    o85.q(obj);
                    g97 = (g97) this.A;
                    this.A = g97;
                    this.z = 1;
                    obj2 = sb7.a(g97, false, lk5.w, this);
                    break;
                } else if (i2 == 1) {
                    g97 = (g97) this.A;
                    o85.q(obj);
                    obj2 = obj;
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.A = null;
                this.z = 2;
                sr2 sr2 = (sr2) ds2;
                if (my1.i(g97, (qk5) obj2, (nf1) this.B, (jk0) obj7, (gs2) ds22, sr2, (sn) obj6, this) != obj5) {
                    return vs7;
                }
                return obj5;
            default:
                o81 o81 = (o81) obj7;
                co5 co5 = (co5) obj6;
                int i3 = this.z;
                if (i3 == 0) {
                    o85.q(obj);
                    g972 = this.A;
                    el3 = ar7.H(o81, (e81) null, r81.z, new mb7(co5, (f61) null, 0), 1);
                    this.A = g972;
                    this.B = el3;
                    this.z = 1;
                    obj4 = sb7.b(g972, this, 3);
                    break;
                } else if (i3 == 1) {
                    el3 = (h27) this.B;
                    g972 = (g97) this.A;
                    o85.q(obj);
                    obj4 = obj;
                } else if (i3 == 2) {
                    el3 = (el3) this.A;
                    o85.q(obj);
                    obj3 = obj;
                    f61 = null;
                    qk5 qk5 = (qk5) obj3;
                    if (qk5 == null) {
                        sb7.f(o81, el3, new lb7(co5, f61, 0));
                        return vs7;
                    }
                    qk5.a();
                    sb7.f(o81, el3, new lb7(co5, f61, 1));
                    ((t46) ds2).y(new l35(qk5.c));
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qk5 qk52 = (qk5) obj4;
                qk52.a();
                pe7 pe7 = (pe7) ds22;
                if (pe7 != sb7.a) {
                    f61 = null;
                    sb7.f(o81, el3, new ii3((Object) pe7, (Object) co5, (Object) qk52, (f61) null, 28));
                } else {
                    f61 = null;
                }
                this.A = el3;
                this.B = f61;
                this.z = 2;
                obj3 = sb7.i(g972, lk5.x, this);
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy1(o81 o81, pe7 pe7, t46 t46, co5 co5, f61 f61) {
        super(2, f61);
        this.C = o81;
        this.D = pe7;
        this.E = t46;
        this.F = co5;
    }
}

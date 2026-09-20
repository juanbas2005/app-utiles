package defpackage;

/* renamed from: be0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ uj C;
    public final /* synthetic */ float D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ df3 F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be0(uj ujVar, float f, boolean z, df3 df3, aq4 aq4, f61 f61) {
        super(2, f61);
        this.A = 2;
        this.C = ujVar;
        this.D = f;
        this.E = z;
        this.F = df3;
        this.G = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((be0) o(f61, o81)).s(vs7);
            case 1:
                return ((be0) o(f61, o81)).s(vs7);
            default:
                return ((be0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.G;
        switch (i) {
            case b85.b:
                ce0 ce0 = (ce0) obj2;
                df3 df3 = this.F;
                return new be0(this.C, this.D, this.E, ce0, df3, f61, 0);
            case 1:
                ql0 ql0 = (ql0) obj2;
                df3 df32 = this.F;
                return new be0(this.C, this.D, this.E, ql0, df32, f61, 1);
            default:
                return new be0(this.C, this.D, this.E, this.F, (aq4) obj2, f61);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: eo5} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r9.f(r0, r1) == r8) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (defpackage.n22.a(r9, r10, (defpackage.df3) r13.getValue(), r14, r0) == r8) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        boolean z = this.E;
        Object obj2 = p81.w;
        uj ujVar = this.C;
        float f = this.D;
        Object obj3 = this.G;
        df3 df3 = this.F;
        eo5 eo5 = null;
        switch (i) {
            case b85.b:
                ce0 ce0 = (ce0) obj3;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    if (lx1.b(((lx1) ujVar.e.getValue()).w, f)) {
                        return vs7;
                    }
                    if (!z) {
                        lx1 lx1 = new lx1(f);
                        this.B = 1;
                        if (ujVar.f(this, lx1) != obj2) {
                            return vs7;
                        }
                    } else {
                        float f2 = ((lx1) ujVar.e.getValue()).w;
                        if (lx1.b(f2, 0.0f)) {
                            eo5 = new eo5(0);
                        } else if (lx1.b(f2, ce0.a)) {
                            eo5 = new Object();
                        } else if (lx1.b(f2, 0.0f)) {
                            eo5 = new Object();
                        }
                        this.B = 2;
                        if (n22.a(ujVar, f, eo5, df3, this) != obj2) {
                            return vs7;
                        }
                    }
                    return obj2;
                } else if (i2 == 1 || i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                ql0 ql0 = (ql0) obj3;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    if (lx1.b(((lx1) ujVar.e.getValue()).w, f)) {
                        return vs7;
                    }
                    if (!z) {
                        lx1 lx12 = new lx1(f);
                        this.B = 1;
                        if (ujVar.f(this, lx12) != obj2) {
                            return vs7;
                        }
                    } else {
                        float f3 = ((lx1) ujVar.e.getValue()).w;
                        if (lx1.b(f3, 0.0f)) {
                            eo5 = new eo5(0);
                        } else if (lx1.b(f3, ql0.b)) {
                            eo5 = new Object();
                        } else if (lx1.b(f3, 0.0f)) {
                            eo5 = new Object();
                        } else if (lx1.b(f3, ql0.c)) {
                            eo5 = new Object();
                        }
                        this.B = 2;
                        if (n22.a(ujVar, f, eo5, df3, this) != obj2) {
                            return vs7;
                        }
                    }
                    return obj2;
                } else if (i3 == 1 || i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                aq4 aq4 = (aq4) obj3;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    if (lx1.b(((lx1) ujVar.e.getValue()).w, f)) {
                        return vs7;
                    }
                    if (z) {
                        this.B = 2;
                        break;
                    } else {
                        lx1 lx13 = new lx1(f);
                        this.B = 1;
                        break;
                    }
                    return obj2;
                } else if (i4 == 1 || i4 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aq4.setValue(df3);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be0(uj ujVar, float f, boolean z, Object obj, df3 df3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ujVar;
        this.D = f;
        this.E = z;
        this.G = obj;
        this.F = df3;
    }
}

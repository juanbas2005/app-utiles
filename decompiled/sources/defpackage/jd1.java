package defpackage;

/* renamed from: jd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jd1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public Object B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd1(d37 d37, f61 f61, boolean z, vs4 vs4, String str, String str2, boolean z2) {
        super(2, f61);
        this.A = 2;
        this.B = d37;
        this.E = z;
        this.D = vs4;
        this.G = str;
        this.H = str2;
        this.F = z2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((jd1) o((f61) obj2, (kl7) obj)).s(vs7);
            case 1:
                return ((jd1) o((f61) obj2, (kl7) obj)).s(vs7);
            default:
                return ((jd1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case b85.b:
                boolean z = this.E;
                boolean z2 = this.F;
                jd1 jd1 = new jd1(z, z2, (a96) obj3, f61, (vr2) obj2, 0);
                jd1.D = obj;
                return jd1;
            case 1:
                boolean z3 = this.E;
                boolean z4 = this.F;
                jd1 jd12 = new jd1(z3, z4, (a96) obj3, f61, (vr2) obj2, 1);
                jd12.D = obj;
                return jd12;
            default:
                boolean z5 = this.F;
                return new jd1((d37) this.B, f61, this.E, (vs4) this.D, (String) obj3, (String) obj2, z5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (((defpackage.gs4) r3).c(r2, r1, r0) == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        if (r0 != r11) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0242  */
    public final Object s(Object obj) {
        Object obj2;
        Boolean bool;
        Object obj3;
        kl7 kl7;
        kl7 kl72;
        jl7 jl7;
        Boolean bool2;
        Object obj4;
        Boolean bool3;
        Object obj5;
        kl7 kl73;
        kl7 kl74;
        jl7 jl72;
        Boolean bool4;
        Object e;
        Object value;
        Object value2;
        Object value3;
        int i = this.A;
        jl7 jl73 = jl7.x;
        jl7 jl74 = jl7.w;
        Object obj6 = vs7.a;
        boolean z = this.F;
        boolean z2 = this.E;
        p81 p81 = p81.w;
        Object obj7 = this.G;
        Object obj8 = this.H;
        switch (i) {
            case b85.b:
                vr2 vr2 = (vr2) obj8;
                a96 a96 = (a96) obj7;
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    kl7 = (kl7) this.D;
                    if (z2) {
                        if (z) {
                            jl73 = jl74;
                        }
                        if (!z) {
                            this.D = kl7;
                            this.B = jl73;
                            this.C = 1;
                            bool2 = kl7.b(this);
                            if (bool2 == p81) {
                                return p81;
                            }
                            jl7 jl75 = jl73;
                            kl72 = kl7;
                            jl7 = jl75;
                        }
                        id1 id1 = new id1((f61) null, vr2, 0);
                        this.D = kl7;
                        this.B = null;
                        this.C = 3;
                        obj3 = kl7.a(jl73, id1, this);
                        if (obj3 == p81) {
                        }
                        if (!z) {
                        }
                    } else {
                        kl7.getClass();
                        return vr2.y(((cw5) kl7).c());
                    }
                } else if (i2 == 1) {
                    jl7 = (jl7) this.B;
                    kl72 = (kl7) this.D;
                    o85.q(obj);
                    bool2 = obj;
                } else if (i2 == 2) {
                    jl7 = (jl7) this.B;
                    kl72 = (kl7) this.D;
                    o85.q(obj);
                    kl7 kl75 = kl72;
                    jl73 = jl7;
                    kl7 = kl75;
                    id1 id12 = new id1((f61) null, vr2, 0);
                    this.D = kl7;
                    this.B = null;
                    this.C = 3;
                    obj3 = kl7.a(jl73, id12, this);
                    if (obj3 == p81) {
                        return p81;
                    }
                    if (!z) {
                    }
                } else if (i2 == 3) {
                    kl7 = (kl7) this.D;
                    o85.q(obj);
                    obj3 = obj;
                    if (!z) {
                        return obj3;
                    }
                    this.D = obj3;
                    this.C = 4;
                    bool = kl7.b(this);
                    if (bool == p81) {
                        return p81;
                    }
                    obj2 = obj3;
                    if (!bool.booleanValue()) {
                    }
                } else if (i2 == 4) {
                    Object obj9 = this.D;
                    o85.q(obj);
                    obj2 = obj9;
                    bool = obj;
                    if (!bool.booleanValue()) {
                        return obj2;
                    }
                    eh3 g = a96.g();
                    g.b.e(g.e, g.f);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!bool2.booleanValue()) {
                    eh3 g2 = a96.g();
                    this.D = kl72;
                    this.B = jl7;
                    this.C = 2;
                    Object f = g2.b.f(this);
                    if (f == p81) {
                        obj6 = f;
                    }
                    if (obj6 == p81) {
                        return p81;
                    }
                }
                kl7 kl752 = kl72;
                jl73 = jl7;
                kl7 = kl752;
                id1 id122 = new id1((f61) null, vr2, 0);
                this.D = kl7;
                this.B = null;
                this.C = 3;
                obj3 = kl7.a(jl73, id122, this);
                if (obj3 == p81) {
                }
                if (!z) {
                }
            case 1:
                vr2 vr22 = (vr2) obj8;
                a96 a962 = (a96) obj7;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    kl73 = (kl7) this.D;
                    if (z2) {
                        if (z) {
                            jl73 = jl74;
                        }
                        if (!z) {
                            this.D = kl73;
                            this.B = jl73;
                            this.C = 1;
                            bool4 = kl73.b(this);
                            if (bool4 == p81) {
                                return p81;
                            }
                            jl7 jl76 = jl73;
                            kl74 = kl73;
                            jl72 = jl76;
                        }
                        id1 id13 = new id1((f61) null, vr22, 1);
                        this.D = kl73;
                        this.B = null;
                        this.C = 3;
                        obj5 = kl73.a(jl73, id13, this);
                        if (obj5 == p81) {
                        }
                        if (!z) {
                        }
                    } else {
                        kl73.getClass();
                        return vr22.y(((cw5) kl73).c());
                    }
                } else if (i3 == 1) {
                    jl72 = (jl7) this.B;
                    kl74 = (kl7) this.D;
                    o85.q(obj);
                    bool4 = obj;
                } else if (i3 == 2) {
                    jl72 = (jl7) this.B;
                    kl74 = (kl7) this.D;
                    o85.q(obj);
                    kl7 kl76 = kl74;
                    jl73 = jl72;
                    kl73 = kl76;
                    id1 id132 = new id1((f61) null, vr22, 1);
                    this.D = kl73;
                    this.B = null;
                    this.C = 3;
                    obj5 = kl73.a(jl73, id132, this);
                    if (obj5 == p81) {
                        return p81;
                    }
                    if (!z) {
                    }
                } else if (i3 == 3) {
                    kl73 = (kl7) this.D;
                    o85.q(obj);
                    obj5 = obj;
                    if (!z) {
                        return obj5;
                    }
                    this.D = obj5;
                    this.C = 4;
                    bool3 = kl73.b(this);
                    if (bool3 == p81) {
                        return p81;
                    }
                    obj4 = obj5;
                    if (!bool3.booleanValue()) {
                    }
                } else if (i3 == 4) {
                    Object obj10 = this.D;
                    o85.q(obj);
                    obj4 = obj10;
                    bool3 = obj;
                    if (!bool3.booleanValue()) {
                        return obj4;
                    }
                    eh3 g3 = a962.g();
                    g3.b.e(g3.e, g3.f);
                    return obj4;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!bool4.booleanValue()) {
                    eh3 g4 = a962.g();
                    this.D = kl74;
                    this.B = jl72;
                    this.C = 2;
                    Object f2 = g4.b.f(this);
                    if (f2 == p81) {
                        obj6 = f2;
                    }
                    if (obj6 == p81) {
                        return p81;
                    }
                }
                kl7 kl762 = kl74;
                jl73 = jl72;
                kl73 = kl762;
                id1 id1322 = new id1((f61) null, vr22, 1);
                this.D = kl73;
                this.B = null;
                this.C = 3;
                obj5 = kl73.a(jl73, id1322, this);
                if (obj5 == p81) {
                }
                if (!z) {
                }
            default:
                String str = (String) obj8;
                String str2 = (String) obj7;
                ur4 ur4 = ((vs4) this.D).b;
                d37 d37 = (d37) this.B;
                int i4 = this.C;
                if (i4 != 0) {
                    if (i4 == 1) {
                        o85.q(obj);
                        ((o66) obj).getClass();
                        this.C = 2;
                        e = ((gs4) ur4).e(str2, str, z, this);
                        break;
                    } else if (i4 == 2) {
                        o85.q(obj);
                        e = ((o66) obj).w;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                    hs4 hs4 = (hs4) ((is7) d37.getValue()).a;
                    if (z2) {
                        this.C = 1;
                        break;
                    }
                    this.C = 2;
                    e = ((gs4) ur4).e(str2, str, z, this);
                }
                Object obj11 = e;
                if (!(obj11 instanceof m66)) {
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, is7.a((is7) value3, (Object) null, false, (hv2) null, 5)));
                    return obj6;
                }
                do {
                    value2 = d37.getValue();
                } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) o66.a(obj11)), 1)));
                return obj6;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd1(boolean z, boolean z2, a96 a96, f61 f61, vr2 vr2, int i) {
        super(2, f61);
        this.A = i;
        this.E = z;
        this.F = z2;
        this.G = a96;
        this.H = vr2;
    }
}

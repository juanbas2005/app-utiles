package defpackage;

import java.util.List;

/* renamed from: yi2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi2 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public Object B;
    public int C;
    public /* synthetic */ Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi2(hs2 hs2, j43 j43, f61 f61) {
        super(3, f61);
        this.A = 6;
        this.E = hs2;
        this.F = j43;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: fi2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: w77} */
    /* JADX WARNING: type inference failed for: r12v6, types: [ll3, w77, java.lang.Object, fl3] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0144, code lost:
        if (r1 == r9) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019c, code lost:
        if (r0 == r9) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e8, code lost:
        if (r1 == r9) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x022c, code lost:
        if (r1 == r9) goto L_0x023d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        w77 w77;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj7 = this.F;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                fi2 fi2 = (fi2) this.D;
                Object obj8 = this.E;
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    this.D = null;
                    this.E = null;
                    this.B = fi2;
                    this.C = 1;
                    obj2 = ((gs2) obj7).H(obj8, this);
                    break;
                } else if (i2 == 1) {
                    fi2 = (fi2) this.B;
                    o85.q(obj);
                    obj2 = obj;
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.D = null;
                this.E = null;
                this.B = null;
                this.C = 2;
                if (fi2.k(obj2, this) != p81) {
                    return vs7;
                }
                return p81;
            case 1:
                fi2 fi22 = (fi2) this.D;
                Object[] objArr = (Object[]) this.E;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    Object obj9 = objArr[0];
                    Object obj10 = objArr[1];
                    Object obj11 = objArr[2];
                    this.D = null;
                    this.E = null;
                    this.B = fi22;
                    this.C = 1;
                    obj3 = ((jq5) obj7).C(obj9, obj10, obj11, this);
                    break;
                } else if (i3 == 1) {
                    fi22 = (fi2) this.B;
                    o85.q(obj);
                    obj3 = obj;
                } else if (i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.D = null;
                this.E = null;
                this.B = null;
                this.C = 2;
                if (fi22.k(obj3, this) != p81) {
                    return vs7;
                }
                return p81;
            case 2:
                fi2 fi23 = (fi2) this.D;
                Object[] objArr2 = (Object[]) this.E;
                int i4 = this.C;
                if (i4 == 0) {
                    o85.q(obj);
                    Object obj12 = objArr2[0];
                    Object obj13 = objArr2[1];
                    Object obj14 = objArr2[2];
                    Object obj15 = objArr2[3];
                    Object obj16 = objArr2[4];
                    this.D = null;
                    this.E = null;
                    this.B = fi23;
                    this.C = 1;
                    obj4 = ((ks2) obj7).F(obj12, obj13, obj14, obj15, obj16, this);
                    break;
                } else if (i4 == 1) {
                    fi23 = this.B;
                    o85.q(obj);
                    obj4 = obj;
                } else if (i4 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.D = null;
                this.E = null;
                this.B = null;
                this.C = 2;
                if (fi23.k(obj4, this) != p81) {
                    return vs7;
                }
                return p81;
            case 3:
                fi2 fi24 = (fi2) this.D;
                Object[] objArr3 = (Object[]) this.E;
                int i5 = this.C;
                if (i5 == 0) {
                    o85.q(obj);
                    Object obj17 = objArr3[0];
                    Object obj18 = objArr3[1];
                    this.D = null;
                    this.E = null;
                    this.B = fi24;
                    this.C = 1;
                    obj5 = ((hs2) obj7).u(obj17, obj18, this);
                    break;
                } else if (i5 == 1) {
                    fi24 = (fi2) this.B;
                    o85.q(obj);
                    obj5 = obj;
                } else if (i5 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.D = null;
                this.E = null;
                this.B = null;
                this.C = 2;
                if (fi24.k(obj5, this) != p81) {
                    return vs7;
                }
                return p81;
            case 4:
                wk6 wk6 = (wk6) this.D;
                y53 y53 = (y53) this.E;
                int i6 = this.C;
                if (i6 == 0) {
                    o85.q(obj);
                    this.D = null;
                    this.E = null;
                    this.C = 1;
                    obj6 = wk6.w.a(y53, this);
                    if (obj6 == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj6 = obj;
                } else if (i6 == 2) {
                    l43 l43 = (l43) this.B;
                    o85.q(obj);
                    return l43;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43 l432 = (l43) obj6;
                yl1 d = l432.d();
                this.D = null;
                this.E = null;
                this.B = l432;
                this.C = 2;
                if (g43.b((List) obj7, d, this) == p81) {
                    return p81;
                }
                return l432;
            case 5:
                y53 y532 = (y53) this.D;
                vr2 vr2 = (vr2) this.E;
                int i7 = this.C;
                if (i7 == 0) {
                    o85.q(obj);
                    ? fl3 = new fl3(y532.e);
                    c81 a0 = ((vr0) obj7).a.y.a0(me6.E);
                    a0.getClass();
                    cc4 cc4 = b63.a;
                    fl3.v(new h43(4, ((el3) a0).v(new h43(3, fl3))));
                    try {
                        y532.e = fl3;
                        this.D = null;
                        this.E = null;
                        this.B = fl3;
                        this.C = 1;
                        if (vr2.y(this) == p81) {
                            return p81;
                        }
                        w77 = fl3;
                    } catch (Throwable th) {
                        th = th;
                        w77 = fl3;
                        try {
                            w77.getClass();
                            w77.c0(new av0(th, false));
                            throw th;
                        } catch (Throwable th2) {
                            w77.v0();
                            throw th2;
                        }
                    }
                } else if (i7 == 1) {
                    w77 = this.B;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w77.v0();
                return vs7;
            default:
                yk6 yk6 = (yk6) this.B;
                y53 y533 = (y53) this.D;
                int i8 = this.C;
                if (i8 == 0) {
                    o85.q(obj);
                    wk6 wk62 = new wk6(yk6, ((j43) obj7).y);
                    this.B = null;
                    this.D = null;
                    this.C = 1;
                    Object u = ((hs2) this.E).u(wk62, y533, this);
                    if (u == p81) {
                        return p81;
                    }
                    return u;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj4 = this.F;
        switch (i) {
            case b85.b:
                yi2 yi2 = new yi2((Object) (gs2) obj4, (f61) obj3, 0);
                yi2.D = (fi2) obj;
                yi2.E = obj2;
                return yi2.s(vs7);
            case 1:
                yi2 yi22 = new yi2((f61) obj3, (ds2) (jq5) obj4, 1);
                yi22.D = (fi2) obj;
                yi22.E = (Object[]) obj2;
                return yi22.s(vs7);
            case 2:
                yi2 yi23 = new yi2((f61) obj3, (ds2) (ks2) obj4, 2);
                yi23.D = (fi2) obj;
                yi23.E = (Object[]) obj2;
                return yi23.s(vs7);
            case 3:
                yi2 yi24 = new yi2((Object) (hs2) obj4, (f61) obj3, 3);
                yi24.D = (fi2) obj;
                yi24.E = (Object[]) obj2;
                return yi24.s(vs7);
            case 4:
                yi2 yi25 = new yi2((Object) (List) obj4, (f61) obj3, 4);
                yi25.D = (wk6) obj;
                yi25.E = (y53) obj2;
                return yi25.s(vs7);
            case 5:
                yi2 yi26 = new yi2((Object) (vr0) obj4, (f61) obj3, 5);
                yi26.D = (y53) obj;
                yi26.E = (vr2) obj2;
                return yi26.s(vs7);
            default:
                yi2 yi27 = new yi2((hs2) this.E, (j43) obj4, (f61) obj3);
                yi27.B = (yk6) obj;
                yi27.D = (y53) obj2;
                return yi27.s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi2(f61 f61, ds2 ds2, int i) {
        super(3, f61);
        this.A = i;
        this.F = ds2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi2(Object obj, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.F = obj;
    }
}

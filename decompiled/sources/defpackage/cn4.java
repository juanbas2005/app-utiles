package defpackage;

/* renamed from: cn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn4 extends a97 implements gs2 {
    public d06 A;
    public d06 B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ e06 F;
    public final /* synthetic */ h06 G;
    public final /* synthetic */ h06 H;
    public final /* synthetic */ float I;
    public final /* synthetic */ en4 J;
    public final /* synthetic */ float K;
    public final /* synthetic */ zh6 L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn4(e06 e06, h06 h06, h06 h062, float f, en4 en4, float f2, zh6 zh6, f61 f61) {
        super(2, f61);
        this.F = e06;
        this.G = h06;
        this.H = h062;
        this.I = f;
        this.J = en4;
        this.K = f2;
        this.L = zh6;
    }

    public final Object H(Object obj, Object obj2) {
        return ((cn4) o((f61) obj2, (xh6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        cn4 cn4 = new cn4(this.F, this.G, this.H, this.I, this.J, this.K, this.L, f61);
        cn4.E = obj;
        return cn4;
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r9v28, types: [java.lang.Object, d06] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0189  */
    public final Object s(Object obj) {
        char c;
        int i;
        d06 d06;
        int i2;
        Object obj2;
        d06 d062;
        xh6 xh6;
        h06 h06;
        Object obj3;
        xh6 xh62;
        Object obj4;
        e06 e06;
        h06 h062;
        h06 h063;
        Object obj5;
        cn4 cn4;
        int i3;
        char c2;
        h06 h064;
        Object obj6;
        d06 d063;
        int i4;
        int i5;
        xh6 xh63;
        cn4 cn42 = this;
        int i6 = cn42.D;
        h06 h065 = cn42.H;
        e06 e062 = cn42.F;
        char c3 = 3;
        int i7 = 2;
        int i8 = 1;
        h06 h066 = cn42.G;
        Object obj7 = p81.w;
        if (i6 == 0) {
            o85.q(obj);
            xh62 = (xh6) cn42.E;
            ? obj8 = new Object();
            obj8.w = true;
            d06 = obj8;
        } else if (i6 == 1) {
            d06 d064 = cn42.B;
            d062 = cn42.A;
            o85.q(obj);
            obj2 = obj7;
            xh63 = (xh6) cn42.E;
            d06 = d064;
            i4 = 2;
            i5 = 1;
            h06 = h066;
            c = 3;
            obj3 = obj;
            d06.w = ((Boolean) obj3).booleanValue();
            cn42 = this;
            h066 = h06;
            xh62 = xh6;
            d06 = d062;
            obj7 = obj2;
            i7 = i2;
            i8 = i;
            c3 = c;
        } else if (i6 == 2) {
            i3 = cn42.C;
            d06 d065 = cn42.A;
            o85.q(obj);
            cn4 cn43 = cn42;
            h063 = h066;
            cn4 = cn43;
            e06 = e062;
            i2 = 2;
            i = 1;
            obj5 = obj7;
            d06 = d065;
            xh6 = (xh6) cn42.E;
            h062 = h065;
            if (d06.w) {
                long j = 50 - ((long) i3);
                cn4.E = xh6;
                cn4.A = d06;
                cn4.B = d06;
                cn4.D = 3;
                c2 = 3;
                en4 en4 = cn4.J;
                zh6 zh6 = cn4.L;
                h064 = h063;
                cn42 = cn4;
                h06 h067 = h062;
                obj6 = obj5;
                long j2 = j;
                h065 = h067;
                e062 = e06;
                obj4 = en4.d(en4, h065, e062, zh6, h064, j2, cn42);
                if (obj4 != obj6) {
                    return obj6;
                }
                d063 = d06;
                d06.w = ((Boolean) obj4).booleanValue();
                h066 = h06;
                xh62 = xh6;
                d06 = d062;
                obj7 = obj2;
                i7 = i2;
                i8 = i;
                c3 = c;
                return obj6;
            }
            h06 h068 = h063;
            c = 3;
            cn42 = cn4;
            xh62 = xh6;
            h065 = h062;
            e062 = e06;
            i7 = i2;
            h066 = h068;
            obj7 = obj5;
            i8 = i;
            c3 = c;
        } else if (i6 == 3) {
            d06 d066 = cn42.B;
            d063 = cn42.A;
            o85.q(obj);
            obj6 = obj7;
            xh6 = (xh6) cn42.E;
            d06 = d066;
            i2 = 2;
            i = 1;
            h064 = h066;
            c2 = 3;
            obj4 = obj;
            d06.w = ((Boolean) obj4).booleanValue();
            h066 = h06;
            xh62 = xh6;
            d06 = d062;
            obj7 = obj2;
            i7 = i2;
            i8 = i;
            c3 = c;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z = d06.w;
        Object obj9 = vs7.a;
        if (z) {
            d06.w = false;
            float floatValue = e062.w - ((Number) ((il) h066.w).x.getValue()).floatValue();
            boolean z2 = ((an4) h065.w).c;
            en4 en42 = cn42.J;
            if (!z2) {
                float abs = Math.abs(floatValue);
                float f = cn42.I;
                if (abs >= f) {
                    float signum = Math.signum(floatValue) * f;
                    en42.e(xh62, signum);
                    il ilVar = (il) h066.w;
                    il D2 = gr8.D(ilVar, ((Number) ilVar.x.getValue()).floatValue() + signum, 0.0f, 30);
                    h066.w = D2;
                    int C2 = dh4.C(Math.abs(e062.w - ((Number) D2.x.getValue()).floatValue()) / cn42.K);
                    if (C2 > 100) {
                        C2 = 100;
                    }
                    float f2 = e062.w;
                    int i9 = C2;
                    en4 en43 = cn42.J;
                    obj5 = obj7;
                    float f3 = f2;
                    e06 = e062;
                    il ilVar2 = (il) h066.w;
                    h062 = h065;
                    int i10 = i9;
                    b9 b9Var = new b9((Object) en43, (Object) h062, (Object) e06, (Object) cn42.L, (Object) d06, 5);
                    en4 en44 = en43;
                    cn42.E = xh62;
                    cn42.A = d06;
                    cn42.B = null;
                    cn42.C = i10;
                    cn42.D = i7;
                    en44.getClass();
                    ? obj10 = new Object();
                    obj10.w = ((Number) ilVar2.x.getValue()).floatValue();
                    Float f4 = new Float(f3);
                    jo7 O = kl8.O(i10, i7, j12.c);
                    xh6 xh64 = xh62;
                    qj qjVar = new qj((Object) obj10, (Object) en44, (Object) xh64, (Object) b9Var, 11);
                    xh6 = xh64;
                    cn4 cn44 = cn42;
                    h063 = h066;
                    cn4 = cn44;
                    i2 = i7;
                    il ilVar3 = ilVar2;
                    jo7 jo7 = O;
                    qj qjVar2 = qjVar;
                    i = 1;
                    int i11 = i10;
                    Object g = i95.g(ilVar3, f4, jo7, true, qjVar2, cn4);
                    if (g != obj5) {
                        g = obj9;
                    }
                    if (g != obj5) {
                        i3 = i11;
                        if (d06.w) {
                            h06 h0682 = h063;
                            c = 3;
                            cn42 = cn4;
                            xh62 = xh6;
                            h065 = h062;
                            e062 = e06;
                            i7 = i2;
                            h066 = h0682;
                            obj7 = obj5;
                            i8 = i;
                            c3 = c;
                            boolean z3 = d06.w;
                            Object obj92 = vs7.a;
                            if (z3) {
                                return obj92;
                            }
                        }
                        long j3 = 50 - ((long) i3);
                        cn4.E = xh6;
                        cn4.A = d06;
                        cn4.B = d06;
                        cn4.D = 3;
                        c2 = 3;
                        en4 en45 = cn4.J;
                        zh6 zh62 = cn4.L;
                        h064 = h063;
                        cn42 = cn4;
                        h06 h0672 = h062;
                        obj6 = obj5;
                        long j22 = j3;
                        h065 = h0672;
                        e062 = e06;
                        obj4 = en4.d(en45, h065, e062, zh62, h064, j22, cn42);
                        if (obj4 != obj6) {
                        }
                        return obj6;
                    }
                    return obj5;
                }
            }
            i4 = i7;
            i5 = i8;
            h06 = h066;
            c = c3;
            obj2 = obj7;
            xh63 = xh62;
            en42.e(xh63, floatValue);
            cn42.E = xh63;
            cn42.A = d06;
            cn42.B = d06;
            cn42.D = i5;
            obj3 = en4.d(cn42.J, h065, e062, cn42.L, h06, 50, cn42);
            if (obj3 == obj2) {
                return obj2;
            }
            d062 = d06;
            d06.w = ((Boolean) obj3).booleanValue();
            cn42 = this;
            h066 = h06;
            xh62 = xh6;
            d06 = d062;
            obj7 = obj2;
            i7 = i2;
            i8 = i;
            c3 = c;
            boolean z32 = d06.w;
            Object obj922 = vs7.a;
            if (z32) {
            }
            return obj2;
        }
        return obj922;
    }
}

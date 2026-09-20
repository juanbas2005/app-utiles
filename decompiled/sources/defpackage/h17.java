package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.util.List;

/* renamed from: h17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h17 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h17(ze7 ze7, o81 o81, Context context) {
        this.w = 4;
        this.y = ze7;
        this.z = o81;
        this.x = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: hf7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: hf7} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        ul ulVar;
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        bg7 bg7;
        bg7 bg72;
        cg7 cg7;
        cg7 cg72;
        bg7 bg73;
        bg7 bg74;
        cg7 cg73;
        cg7 cg74;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        kg5 kg5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.w;
        vs7 vs7 = vs7.a;
        hf7 hf7 = null;
        Object obj2 = this.x;
        Object obj3 = this.z;
        Object obj4 = this.y;
        boolean z6 = false;
        switch (i) {
            case b85.b:
                Context context = (Context) obj2;
                aq4 aq4 = (aq4) obj4;
                aq4 aq42 = (aq4) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    aq4.setValue(q17.m(context));
                }
                if (booleanValue && ((yb5) aq4.getValue()) != null) {
                    z6 = true;
                }
                aq42.setValue(Boolean.valueOf(z6));
                return vs7;
            case 1:
                d06 d06 = (d06) obj2;
                ul ulVar2 = (ul) obj4;
                yy6 yy6 = (yy6) obj3;
                ul ulVar3 = (ul) obj;
                if (d06.w) {
                    Object obj5 = ulVar3.a;
                    int i2 = ulVar3.c;
                    int i3 = ulVar3.b;
                    if ((obj5 instanceof yy6) && i3 == ulVar2.b && i2 == ulVar2.c) {
                        if (yy6 == null) {
                            yy6 = new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65535);
                        }
                        ulVar = new ul(i3, i2, yy6);
                        d06.w = ulVar2.equals(ulVar3);
                        return ulVar;
                    }
                }
                ulVar = ulVar3;
                d06.w = ulVar2.equals(ulVar3);
                return ulVar;
            case 2:
                vr2 vr2 = (vr2) obj4;
                vf7 vf7 = (vf7) ((h06) obj3).w;
                hf7 h = ((jz0) obj2).h((List) obj);
                if (vf7 != null) {
                    vf7.a((hf7) null, h);
                }
                vr2.y(h);
                return vs7;
            case 3:
                he7 he7 = (he7) obj4;
                d06 d062 = (d06) obj3;
                oe7 oe7 = (oe7) obj;
                switch (((ps3) obj2).ordinal()) {
                    case b85.b:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        if (lg7.c(oe7.f)) {
                            oe7.i();
                            return vs7;
                        }
                        boolean f = oe7.f();
                        long j = oe7.f;
                        if (f) {
                            int f2 = lg7.f(j);
                            oe7.q(f2, f2);
                            return vs7;
                        }
                        int e5 = lg7.e(j);
                        oe7.q(e5, e5);
                        return vs7;
                    case 1:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        if (lg7.c(oe7.f)) {
                            oe7.m();
                            return vs7;
                        }
                        boolean f3 = oe7.f();
                        long j2 = oe7.f;
                        if (f3) {
                            int e6 = lg7.e(j2);
                            oe7.q(e6, e6);
                            return vs7;
                        }
                        int f4 = lg7.f(j2);
                        oe7.q(f4, f4);
                        return vs7;
                    case 2:
                        kg7 kg7 = oe7.e;
                        kg7.a = null;
                        vl vlVar = oe7.g;
                        String str = vlVar.x;
                        String str2 = vlVar.x;
                        if (str.length() <= 0) {
                            return vs7;
                        }
                        if (oe7.f()) {
                            kg7.a = null;
                            if (str2.length() <= 0 || (d = oe7.d()) == null) {
                                return vs7;
                            }
                            int intValue = d.intValue();
                            oe7.q(intValue, intValue);
                            return vs7;
                        }
                        kg7.a = null;
                        if (str2.length() <= 0 || (e = oe7.e()) == null) {
                            return vs7;
                        }
                        int intValue2 = e.intValue();
                        oe7.q(intValue2, intValue2);
                        return vs7;
                    case 3:
                        kg7 kg72 = oe7.e;
                        kg72.a = null;
                        vl vlVar2 = oe7.g;
                        String str3 = vlVar2.x;
                        String str4 = vlVar2.x;
                        if (str3.length() <= 0) {
                            return vs7;
                        }
                        if (oe7.f()) {
                            kg72.a = null;
                            if (str4.length() <= 0 || (e2 = oe7.e()) == null) {
                                return vs7;
                            }
                            int intValue3 = e2.intValue();
                            oe7.q(intValue3, intValue3);
                            return vs7;
                        }
                        kg72.a = null;
                        if (str4.length() <= 0 || (d2 = oe7.d()) == null) {
                            return vs7;
                        }
                        int intValue4 = d2.intValue();
                        oe7.q(intValue4, intValue4);
                        return vs7;
                    case 4:
                        oe7.j();
                        return vs7;
                    case 5:
                        oe7.l();
                        return vs7;
                    case 6:
                        oe7.o();
                        return vs7;
                    case 7:
                        oe7.n();
                        return vs7;
                    case 8:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        if (oe7.f()) {
                            oe7.o();
                            return vs7;
                        }
                        oe7.n();
                        return vs7;
                    case 9:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        if (oe7.f()) {
                            oe7.n();
                            return vs7;
                        }
                        oe7.o();
                        return vs7;
                    case 10:
                        if (oe7.g.x.length() <= 0 || (bg7 = oe7.c) == null) {
                            return vs7;
                        }
                        int g = oe7.g(bg7, -1);
                        oe7.q(g, g);
                        return vs7;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        if (oe7.g.x.length() <= 0 || (bg72 = oe7.c) == null) {
                            return vs7;
                        }
                        int g2 = oe7.g(bg72, 1);
                        oe7.q(g2, g2);
                        return vs7;
                    case 12:
                    case h75.h /*48*/:
                        return vs7;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        if (oe7.g.x.length() <= 0 || (cg7 = oe7.i) == null) {
                            return vs7;
                        }
                        int h2 = oe7.h(cg7, -1);
                        oe7.q(h2, h2);
                        return vs7;
                    case 14:
                        if (oe7.g.x.length() <= 0 || (cg72 = oe7.i) == null) {
                            return vs7;
                        }
                        int h3 = oe7.h(cg72, 1);
                        oe7.q(h3, h3);
                        return vs7;
                    case h75.g /*15*/:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        oe7.q(0, 0);
                        return vs7;
                    case 16:
                        oe7.e.a = null;
                        vl vlVar3 = oe7.g;
                        if (vlVar3.x.length() <= 0) {
                            return vs7;
                        }
                        int length = vlVar3.x.length();
                        oe7.q(length, length);
                        return vs7;
                    case 17:
                        he7.b.d(false);
                        return vs7;
                    case 18:
                        he7.b.p();
                        return vs7;
                    case 19:
                        he7.b.f();
                        return vs7;
                    case 20:
                        List a = oe7.a(new ha7(3));
                        if (a == null) {
                            return vs7;
                        }
                        he7.a(a);
                        return vs7;
                    case 21:
                        List a2 = oe7.a(new ha7(4));
                        if (a2 == null) {
                            return vs7;
                        }
                        he7.a(a2);
                        return vs7;
                    case 22:
                        List a3 = oe7.a(new ha7(5));
                        if (a3 == null) {
                            return vs7;
                        }
                        he7.a(a3);
                        return vs7;
                    case 23:
                        List a4 = oe7.a(new ha7(6));
                        if (a4 == null) {
                            return vs7;
                        }
                        he7.a(a4);
                        return vs7;
                    case 24:
                        List a5 = oe7.a(new ha7(7));
                        if (a5 == null) {
                            return vs7;
                        }
                        he7.a(a5);
                        return vs7;
                    case 25:
                        List a6 = oe7.a(new ha7(8));
                        if (a6 == null) {
                            return vs7;
                        }
                        he7.a(a6);
                        return vs7;
                    case 26:
                        oe7.e.a = null;
                        vl vlVar4 = oe7.g;
                        if (vlVar4.x.length() <= 0) {
                            return vs7;
                        }
                        oe7.q(0, vlVar4.x.length());
                        return vs7;
                    case 27:
                        oe7.i();
                        oe7.p();
                        return vs7;
                    case 28:
                        oe7.m();
                        oe7.p();
                        return vs7;
                    case 29:
                        if (oe7.g.x.length() > 0 && (bg73 = oe7.c) != null) {
                            int g3 = oe7.g(bg73, -1);
                            oe7.q(g3, g3);
                        }
                        oe7.p();
                        return vs7;
                    case 30:
                        if (oe7.g.x.length() > 0 && (bg74 = oe7.c) != null) {
                            int g4 = oe7.g(bg74, 1);
                            oe7.q(g4, g4);
                        }
                        oe7.p();
                        return vs7;
                    case 31:
                        if (oe7.g.x.length() > 0 && (cg73 = oe7.i) != null) {
                            int h4 = oe7.h(cg73, -1);
                            oe7.q(h4, h4);
                        }
                        oe7.p();
                        return vs7;
                    case 32:
                        if (oe7.g.x.length() > 0 && (cg74 = oe7.i) != null) {
                            int h5 = oe7.h(cg74, 1);
                            oe7.q(h5, h5);
                        }
                        oe7.p();
                        return vs7;
                    case 33:
                        oe7.e.a = null;
                        if (oe7.g.x.length() > 0) {
                            oe7.q(0, 0);
                        }
                        oe7.p();
                        return vs7;
                    case 34:
                        oe7.e.a = null;
                        vl vlVar5 = oe7.g;
                        if (vlVar5.x.length() > 0) {
                            int length2 = vlVar5.x.length();
                            oe7.q(length2, length2);
                        }
                        oe7.p();
                        return vs7;
                    case 35:
                        kg7 kg73 = oe7.e;
                        kg73.a = null;
                        vl vlVar6 = oe7.g;
                        String str5 = vlVar6.x;
                        String str6 = vlVar6.x;
                        if (str5.length() > 0) {
                            if (oe7.f()) {
                                kg73.a = null;
                                if (str6.length() > 0 && (e3 = oe7.e()) != null) {
                                    int intValue5 = e3.intValue();
                                    oe7.q(intValue5, intValue5);
                                }
                            } else {
                                kg73.a = null;
                                if (str6.length() > 0 && (d3 = oe7.d()) != null) {
                                    int intValue6 = d3.intValue();
                                    oe7.q(intValue6, intValue6);
                                }
                            }
                        }
                        oe7.p();
                        return vs7;
                    case 36:
                        kg7 kg74 = oe7.e;
                        kg74.a = null;
                        vl vlVar7 = oe7.g;
                        String str7 = vlVar7.x;
                        String str8 = vlVar7.x;
                        if (str7.length() > 0) {
                            if (oe7.f()) {
                                kg74.a = null;
                                if (str8.length() > 0 && (d4 = oe7.d()) != null) {
                                    int intValue7 = d4.intValue();
                                    oe7.q(intValue7, intValue7);
                                }
                            } else {
                                kg74.a = null;
                                if (str8.length() > 0 && (e4 = oe7.e()) != null) {
                                    int intValue8 = e4.intValue();
                                    oe7.q(intValue8, intValue8);
                                }
                            }
                        }
                        oe7.p();
                        return vs7;
                    case 37:
                        oe7.j();
                        oe7.p();
                        return vs7;
                    case 38:
                        oe7.l();
                        oe7.p();
                        return vs7;
                    case 39:
                        oe7.o();
                        oe7.p();
                        return vs7;
                    case 40:
                        oe7.n();
                        oe7.p();
                        return vs7;
                    case 41:
                        oe7.e.a = null;
                        if (oe7.g.x.length() > 0) {
                            if (oe7.f()) {
                                oe7.o();
                            } else {
                                oe7.n();
                            }
                        }
                        oe7.p();
                        return vs7;
                    case 42:
                        oe7.e.a = null;
                        if (oe7.g.x.length() > 0) {
                            if (oe7.f()) {
                                oe7.n();
                            } else {
                                oe7.o();
                            }
                        }
                        oe7.p();
                        return vs7;
                    case 43:
                        oe7.e.a = null;
                        if (oe7.g.x.length() <= 0) {
                            return vs7;
                        }
                        long j3 = oe7.f;
                        int i4 = lg7.c;
                        int i5 = (int) (j3 & 4294967295L);
                        oe7.q(i5, i5);
                        return vs7;
                    case 44:
                        if (!he7.e) {
                            he7.a(sg3.D(new ou0("\n", 1)));
                            return vs7;
                        }
                        d062.w = he7.a.x.x.r.b(he7.l);
                        return vs7;
                    case 45:
                        if (!he7.e) {
                            he7.a(sg3.D(new ou0("\t", 1)));
                            return vs7;
                        }
                        d062.w = false;
                        return vs7;
                    case 46:
                        ps7 ps7 = he7.h;
                        if (ps7 != null) {
                            ps7.a(hf7.a(oe7.h, oe7.g, oe7.f, 4));
                        }
                        ps7 ps72 = he7.h;
                        if (ps72 == null) {
                            return vs7;
                        }
                        kg5 kg52 = ps72.a;
                        if (!(kg52 == null || (kg5 = (kg5) kg52.x) == null)) {
                            ps72.a = kg5;
                            ps72.c -= ((hf7) kg52.y).a.x.length();
                            ps72.b = new kg5(27, ps72.b, (hf7) kg52.y);
                            hf7 = kg5.y;
                        }
                        if (hf7 == null) {
                            return vs7;
                        }
                        he7.k.y(hf7);
                        return vs7;
                    case 47:
                        ps7 ps73 = he7.h;
                        if (ps73 == null) {
                            return vs7;
                        }
                        kg5 kg53 = ps73.b;
                        if (kg53 != null) {
                            ps73.b = (kg5) kg53.x;
                            hf7 hf72 = (hf7) kg53.y;
                            ps73.a = new kg5(27, ps73.a, hf72);
                            ps73.c = hf72.a.x.length() + ps73.c;
                            hf7 = kg53.y;
                        }
                        if (hf7 == null) {
                            return vs7;
                        }
                        he7.k.y(hf7);
                        return vs7;
                    default:
                        h.c();
                        return null;
                }
            default:
                ze7 ze7 = (ze7) obj4;
                o81 o81 = (o81) obj3;
                Context context2 = (Context) obj2;
                wc7 wc7 = (wc7) obj;
                lp4 lp4 = wc7.a;
                lp4 lp42 = wc7.a;
                ld7 ld7 = ld7.b;
                lp4.a(ld7);
                id7 id7 = id7.z;
                if (lg7.c(ze7.n().b) || !ze7.j() || (ze7.f instanceof zd5) || ze7.h == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                n17 n17 = new n17(2, (Object) o81, (Object) new ue7(ze7, (f61) null, 1));
                Resources resources = context2.getResources();
                k77 k77 = new k77(4, (Object) n17, (Object) null);
                if (z2) {
                    lp42.a(new hd7(hj8.k, resources.getString(17039363), 16843537, k77));
                }
                id7 id72 = id7.z;
                if (lg7.c(ze7.n().b) || (ze7.f instanceof zd5) || ze7.h == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                n17 n172 = new n17(2, (Object) o81, (Object) new ue7(ze7, (f61) null, 2));
                Resources resources2 = context2.getResources();
                k77 k772 = new k77(4, (Object) n172, (Object) null);
                if (z3) {
                    lp42.a(new hd7(hj8.l, resources2.getString(17039361), 16843538, k772));
                }
                id7 id73 = id7.z;
                if (!ze7.j() || !((Boolean) ze7.x.getValue()).booleanValue() || ze7.h == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                n17 n173 = new n17(2, (Object) o81, (Object) new ue7(ze7, (f61) null, 3));
                Resources resources3 = context2.getResources();
                k77 k773 = new k77(4, (Object) n173, (Object) null);
                if (z4) {
                    lp42.a(new hd7(hj8.m, resources3.getString(17039371), 16843539, k773));
                }
                id7 id74 = id7.z;
                if (lg7.d(ze7.n().b) != ze7.n().a.x.length()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                df7 df7 = new df7(ze7, 0);
                df7 df72 = new df7(ze7, 1);
                Resources resources4 = context2.getResources();
                k77 k774 = new k77(4, (Object) df72, (Object) df7);
                if (z5) {
                    lp42.a(new hd7(hj8.n, resources4.getString(17039373), 16843646, k774));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    id7 id75 = id7.z;
                    if (ze7.j() && lg7.c(ze7.n().b)) {
                        z6 = true;
                    }
                    df7 df73 = new df7(ze7, 2);
                    Resources resources5 = context2.getResources();
                    k77 k775 = new k77(4, (Object) df73, (Object) null);
                    if (z6) {
                        lp42.a(new hd7(id75.w, resources5.getString(id75.x), id75.y, k775));
                    }
                }
                lp42.a(ld7);
                return vs7;
        }
    }

    public /* synthetic */ h17(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }
}

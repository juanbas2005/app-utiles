package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.data.repository.forum.ForumAdminDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumCategoryDto;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: ju1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ju1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju1(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }

    private final Object v(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            ur4 ur4 = ((vs4) this.C).b;
            this.B = 1;
            Object k = ((gs4) ur4).k((String) this.D, this);
            p81 p81 = p81.w;
            if (k == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
            ((o66) obj).getClass();
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    private final Object x(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            this.B = 1;
            Object G = t49.G(1000, this);
            p81 p81 = p81.w;
            if (G == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bc4.k().e(bd8.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((op5) this.D).c(new q31(7));
        return vs7.a;
    }

    private final Object z(Object obj) {
        az4 az4 = (az4) this.D;
        op5 op5 = (op5) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            zy4 zy4 = new zy4(op5);
            az4.a.registerDefaultNetworkCallback(zy4);
            qm3 qm3 = new qm3(9, (Object) az4, (Object) zy4);
            this.C = null;
            this.B = 1;
            Object c = w95.c(op5, qm3, this);
            p81 p81 = p81.w;
            if (c == p81) {
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

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case 9:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 10:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case 19:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case 23:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 25:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 27:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((ju1) o((f61) obj2, (op5) obj)).s(vs7);
            default:
                return ((ju1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                return new ju1((vp6) this.C, (ku1) obj2, f61, 0);
            case 1:
                return new ju1((sf2) this.C, (pn6) obj2, f61, 1);
            case 2:
                return new ju1((vh2) this.C, (sh2) obj2, f61, 2);
            case 3:
                return new ju1((vh2) this.C, (df3) obj2, f61, 3);
            case 4:
                return new ju1((ef3) this.C, (aq4) obj2, f61, 4);
            case 5:
                return new ju1((lo2) obj2, f61, 5);
            case 6:
                ju1 ju1 = new ju1((lo2) obj2, f61, 6);
                ju1.C = obj;
                return ju1;
            case 7:
                return new ju1((np2) this.C, (ez4) obj2, f61, 7);
            case 8:
                return new ju1((ob5) this.C, (List) obj2, f61, 8);
            case 9:
                return new ju1((c23) obj2, f61, 9);
            case 10:
                return new ju1((c23) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ju1((c23) this.C, (az7) obj2, f61, 11);
            case 12:
                return new ju1((c23) this.C, (g40) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new ju1((q43) this.C, (md2) obj2, f61, 13);
            case 14:
                return new ju1((ji3) this.C, (vr2) obj2, f61, 14);
            case h75.g:
                return new ju1((ji3) this.C, (in5) obj2, f61, 15);
            case 16:
                return new ju1((qw6) this.C, (Context) obj2, f61, 16);
            case 17:
                return new ju1((uk5) this.C, (ob5) obj2, f61, 17);
            case 18:
                return new ju1((o44) this.C, (ng) obj2, f61, 18);
            case 19:
                return new ju1((p94) this.C, (String) obj2, f61, 19);
            case 20:
                return new ju1((p94) this.C, (al3) obj2, f61, 20);
            case 21:
                return new ju1((uh4) this.C, (Uri) obj2, f61, 21);
            case 22:
                return new ju1((b37) this.C, (mm4) obj2, f61, 22);
            case 23:
                ju1 ju12 = new ju1((en4) obj2, f61, 23);
                ju12.C = obj;
                return ju12;
            case 24:
                ju1 ju13 = new ju1((NautaOverlayService) obj2, f61, 24);
                ju13.C = obj;
                return ju13;
            case 25:
                return new ju1((gs4) this.C, (String) obj2, f61, 25);
            case 26:
                return new ju1((vs4) this.C, (String) obj2, f61, 26);
            case 27:
                return new ju1((oy4) this.C, (op5) obj2, f61, 27);
            case 28:
                ju1 ju14 = new ju1((az4) obj2, f61, 28);
                ju14.C = obj;
                return ju14;
            default:
                return new ju1((i05) this.C, (gs2) obj2, f61, 29);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v111, resolved type: m66} */
    /* JADX WARNING: type inference failed for: r5v15, types: [im5, bj6] */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0445, code lost:
        if (r4 == r3) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0599, code lost:
        if (defpackage.t49.G(6000, r6) == r0) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05b4, code lost:
        if (defpackage.ob5.g(r1, (r1.k() + 1) % ((java.util.List) r6.D).size(), r6) == r0) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06b8, code lost:
        if (r2 == r0) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0878, code lost:
        if (r3 == r2) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x08af, code lost:
        if (r1.b(r6) == r2) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:?, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06f4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118 A[Catch:{ all -> 0x00f6 }] */
    public final Object s(Object obj) {
        Object obj2;
        m66 m66;
        Object obj3;
        lo2 lo2;
        Object obj4;
        Object obj5;
        Object value;
        Object value2;
        is7 is7;
        c23 c23;
        Object obj6;
        c23 c232;
        Object obj7;
        c23 c233;
        Object obj8;
        c23 c234;
        Object obj9;
        c23 c235;
        Object obj10;
        String str;
        Object obj11;
        zn6 zn6;
        String str2;
        boolean A2;
        Object obj12;
        az7 az7;
        Object obj13;
        String str3;
        Object obj14;
        Object obj15;
        o81 o81;
        Object J;
        d37 d37;
        Object value3;
        long longValue;
        long j;
        Class<List> cls = List.class;
        boolean z = false;
        boolean z2 = true;
        switch (this.A) {
            case b85.b:
                p81 p81 = p81.w;
                int i = this.B;
                if (i == 0) {
                    o85.q(obj);
                    c6 a = ((vp6) this.C).a();
                    lg lgVar = new lg(5, (ku1) this.D);
                    this.B = 1;
                    if (a.a(lgVar, this) == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 1:
                sf2 sf2 = (sf2) this.C;
                rn6 rn6 = sf2.b;
                Object obj16 = p81.w;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    zf2 zf2 = zf2.a;
                    this.B = 1;
                    obj2 = zf2.b(this);
                    break;
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                } else if (i2 == 2) {
                    o85.q(obj);
                    Boolean a2 = rn6.a.a();
                    if (a2 != null) {
                        z2 = a2.booleanValue();
                    } else {
                        Boolean a3 = rn6.b.a();
                        if (a3 != null) {
                            z2 = a3.booleanValue();
                        }
                    }
                    if (!z2) {
                        new Integer(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                    } else {
                        oe2 oe2 = sf2.a;
                        rf2 rf2 = new rf2(0);
                        oe2.a();
                        oe2.j.add(rf2);
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Iterable<h91> values = ((Map) obj2).values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    for (h91 h91 : values) {
                        if (h91.a.a()) {
                            this.B = 2;
                            break;
                        }
                    }
                }
                new Integer(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return vs7.a;
            case 2:
                vs7 vs7 = vs7.a;
                Object obj17 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    vh2 vh2 = (vh2) this.C;
                    sh2 sh2 = (sh2) this.D;
                    float f = sh2.a;
                    float f2 = sh2.b;
                    float f3 = sh2.d;
                    float f4 = sh2.c;
                    this.B = 1;
                    vh2.a = f;
                    vh2.b = f2;
                    vh2.c = f3;
                    vh2.d = f4;
                    Object b = vh2.b(this);
                    if (b != obj17) {
                        b = vs7;
                    }
                    if (b == obj17) {
                        return obj17;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 3:
                p81 p812 = p81.w;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((vh2) this.C).a((df3) this.D, this) == p812) {
                        return p812;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 4:
                p81 p813 = p81.w;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ArrayList arrayList = new ArrayList();
                    di2 a4 = ((ef3) this.C).a();
                    n40 n40 = new n40(3, arrayList, (aq4) this.D);
                    this.B = 1;
                    if (a4.a(n40, this) == p813) {
                        return p813;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 5:
                Object obj18 = p81.w;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    ArrayList arrayList2 = ((lo2) this.D).c;
                    if (arrayList2 != null) {
                        return new o66(arrayList2);
                    }
                    lo2 lo22 = (lo2) this.D;
                    hm5 i7 = f55.i(lo22.a, "forum_categories");
                    ? im5 = new im5(i7.c, i7.a.c.v);
                    im5.b(im5, "sort_order", w75.ASCENDING);
                    im5.d("*");
                    h66 h66 = h66.a;
                    gm5 gm5 = i7.a;
                    String str4 = i7.b;
                    this.C = lo22;
                    this.B = 1;
                    obj3 = h66.a(gm5, str4, im5, this);
                    if (obj3 == obj18) {
                        return obj18;
                    }
                    lo2 = lo22;
                } else if (i6 == 1) {
                    lo2 = (lo2) this.C;
                    try {
                        o85.q(obj);
                        obj3 = obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        m66 = new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj3;
                t77 t77 = jm5.b.d;
                String str5 = jm5.a;
                gs3 gs3 = gs3.c;
                List<ForumCategoryDto> list = (List) ((f96) t77).s(b26.c(cls, x91.C(b26.b(ForumCategoryDto.class))), str5);
                ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
                for (ForumCategoryDto forumCategoryDto : list) {
                    arrayList3.add(new qm2(forumCategoryDto.getKey(), forumCategoryDto.getLabel()));
                }
                lo2.c = arrayList3;
                m66 = arrayList3;
                return new o66(m66);
            case 6:
                o81 o812 = (o81) this.C;
                Object obj19 = p81.w;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    j77 j77 = ((lo2) this.D).a;
                    UserInfo j2 = rg3.t(j77).j();
                    if (j2 != null) {
                        String id = j2.getId();
                        if (id != null) {
                            hm5 i9 = f55.i(j77, "app_admins");
                            gm5 gm52 = i9.a;
                            String str6 = i9.c;
                            ku4 ku4 = gm52.c.v;
                            im5 im52 = new im5(str6, ku4);
                            new zc9(ku4, im52.f, 4).a("user_id", xd2.EQ, id);
                            im52.d("*");
                            h66 h662 = h66.a;
                            String str7 = i9.b;
                            this.C = null;
                            this.B = 1;
                            obj4 = h662.a(gm52, str7, im52, this);
                            break;
                        }
                    }
                    obj19 = Boolean.valueOf(z);
                    Boolean bool = Boolean.FALSE;
                    if (obj19 instanceof m66) {
                    }
                } else if (i8 == 1) {
                    try {
                        o85.q(obj);
                        obj4 = obj;
                        jm5 jm52 = (jm5) obj4;
                        t77 t772 = jm52.b.d;
                        String str8 = jm52.a;
                        gs3 gs32 = gs3.c;
                        z = !((List) ((f96) t772).s(b26.c(cls, x91.C(b26.b(ForumAdminDto.class))), str8)).isEmpty();
                        obj19 = Boolean.valueOf(z);
                    } catch (Throwable th) {
                        obj19 = new m66(th);
                    }
                    Boolean bool2 = Boolean.FALSE;
                    if (obj19 instanceof m66) {
                        return bool2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj19;
            case 7:
                np2 np2 = (np2) this.C;
                Object obj20 = p81.w;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    sn2 sn2 = np2.b;
                    this.B = 1;
                    Object j3 = ((lo2) sn2).j((ez4) this.D, this);
                    if (j3 == obj20) {
                        return obj20;
                    }
                    obj5 = j3;
                } else if (i10 == 1) {
                    o85.q(obj);
                    obj5 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj5 instanceof m66)) {
                    vs7 vs72 = (vs7) obj5;
                    d37 d372 = np2.e;
                    do {
                        value2 = d372.getValue();
                        is7 = (is7) value2;
                    } while (!d372.i(value2, is7.a(is7, mo2.a((mo2) is7.a, (ArrayList) null, (List) null, (String) null, (String) null, false, false, new hv2(25, (Object) Boolean.TRUE), (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16319), false, (hv2) null, 6)));
                    np2.g();
                }
                Throwable a5 = o66.a(obj5);
                if (a5 != null) {
                    d37 d373 = np2.e;
                    do {
                        value = d373.getValue();
                    } while (!d373.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) a5), 1)));
                }
                return vs7.a;
            case 8:
                Object obj21 = p81.w;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 == 1) {
                        o85.q(obj);
                        ob5 ob5 = (ob5) this.C;
                        this.B = 2;
                        break;
                    } else if (i11 != 2) {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                o85.q(obj);
                this.B = 1;
                break;
            case 9:
                c23 c236 = (c23) this.D;
                nz7 nz7 = c236.b;
                Object obj22 = p81.w;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    c6 b2 = nz7.b(az7.RECARGAR_SALDO);
                    this.C = c236;
                    this.B = 1;
                    obj10 = gr8.H(b2, this);
                    if (obj10 != obj22) {
                        c235 = c236;
                    }
                    return obj22;
                } else if (i12 == 1) {
                    o85.q(obj);
                    c235 = (c23) this.C;
                    obj10 = obj;
                } else if (i12 == 2) {
                    o85.q(obj);
                    c234 = (c23) this.C;
                    obj9 = obj;
                    vy7 vy7 = (vy7) obj9;
                    if (vy7 == null || (r7 = vy7.c) == null) {
                        String str9 = c236.m;
                    }
                    c234.m = str9;
                    c6 b3 = nz7.b(az7.CAMBIAR_PIN);
                    this.C = c236;
                    this.B = 3;
                    obj8 = gr8.H(b3, this);
                    if (obj8 != obj22) {
                        c233 = c236;
                        vy7 vy72 = (vy7) obj8;
                        String str10 = c236.n;
                        c233.n = str10;
                        c6 b4 = nz7.b(az7.ADELANTA_SALDO);
                        this.C = c236;
                        this.B = 4;
                        obj7 = gr8.H(b4, this);
                        if (obj7 != obj22) {
                        }
                    }
                    return obj22;
                } else if (i12 == 3) {
                    o85.q(obj);
                    c233 = (c23) this.C;
                    obj8 = obj;
                    vy7 vy722 = (vy7) obj8;
                    if (vy722 == null || (str10 = vy722.c) == null) {
                        String str102 = c236.n;
                    }
                    c233.n = str102;
                    c6 b42 = nz7.b(az7.ADELANTA_SALDO);
                    this.C = c236;
                    this.B = 4;
                    obj7 = gr8.H(b42, this);
                    if (obj7 != obj22) {
                        c232 = c236;
                        vy7 vy73 = (vy7) obj7;
                        String str11 = c236.o;
                        c232.o = str11;
                        c6 b5 = nz7.b(az7.CONSULTAR_ADELANTO);
                        this.C = c236;
                        this.B = 5;
                        obj6 = gr8.H(b5, this);
                        if (obj6 != obj22) {
                        }
                    }
                    return obj22;
                } else if (i12 == 4) {
                    o85.q(obj);
                    c232 = (c23) this.C;
                    obj7 = obj;
                    vy7 vy732 = (vy7) obj7;
                    if (vy732 == null || (str11 = vy732.c) == null) {
                        String str112 = c236.o;
                    }
                    c232.o = str112;
                    c6 b52 = nz7.b(az7.CONSULTAR_ADELANTO);
                    this.C = c236;
                    this.B = 5;
                    obj6 = gr8.H(b52, this);
                    if (obj6 != obj22) {
                        c23 = c236;
                        vy7 vy74 = (vy7) obj6;
                        String str12 = c236.p;
                        c23.p = str12;
                        return vs7.a;
                    }
                    return obj22;
                } else if (i12 == 5) {
                    o85.q(obj);
                    c23 = (c23) this.C;
                    obj6 = obj;
                    vy7 vy742 = (vy7) obj6;
                    if (vy742 == null || (str12 = vy742.c) == null) {
                        String str122 = c236.p;
                    }
                    c23.p = str122;
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vy7 vy75 = (vy7) obj10;
                if (vy75 == null || (str = vy75.c) == null) {
                    str = c236.l;
                }
                c235.l = str;
                c6 b6 = nz7.b(az7.TRANSFERIR_SALDO);
                this.C = c236;
                this.B = 2;
                obj9 = gr8.H(b6, this);
                if (obj9 != obj22) {
                    c234 = c236;
                    vy7 vy76 = (vy7) obj9;
                    String str92 = c236.m;
                    c234.m = str92;
                    c6 b32 = nz7.b(az7.CAMBIAR_PIN);
                    this.C = c236;
                    this.B = 3;
                    obj8 = gr8.H(b32, this);
                    if (obj8 != obj22) {
                    }
                }
                return obj22;
            case 10:
                vs7 vs73 = vs7.a;
                c23 c237 = (c23) this.D;
                Context context = c237.h;
                Object obj23 = p81.w;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    c6 a6 = c237.d.a();
                    this.B = 1;
                    obj12 = gr8.H(a6, this);
                    break;
                } else if (i13 == 1) {
                    o85.q(obj);
                    obj12 = obj;
                } else if (i13 == 2) {
                    zn6 = (zn6) this.C;
                    o85.q(obj);
                    obj11 = obj;
                    vy7 vy77 = (vy7) obj11;
                    if (!(vy77 == null || (str2 = vy77.c) == null)) {
                        A2 = sg3.A(context, "android.permission.CALL_PHONE");
                        rg5 rg5 = c237.g;
                        if (!A2) {
                            int i14 = zn6.f;
                            rg5.getClass();
                            rg5.b(context, str2, i14);
                        } else {
                            rg5.getClass();
                            rg5.e(context, str2);
                        }
                    }
                    return vs73;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zn6 zn62 = (zn6) obj12;
                nz7 nz72 = c237.b;
                if (zn62.f == 1) {
                    az7 = zn62.t;
                } else {
                    az7 = zn62.s;
                }
                c6 b7 = nz72.b(az7);
                this.C = zn62;
                this.B = 2;
                obj11 = gr8.H(b7, this);
                if (obj11 != obj23) {
                    zn6 = zn62;
                    vy7 vy772 = (vy7) obj11;
                    A2 = sg3.A(context, "android.permission.CALL_PHONE");
                    rg5 rg52 = c237.g;
                    if (!A2) {
                    }
                    return vs73;
                }
                return obj23;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                vs7 vs74 = vs7.a;
                c23 c238 = (c23) this.C;
                Context context2 = c238.h;
                Object obj24 = p81.w;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    c6 b8 = c238.b.b((az7) this.D);
                    this.B = 1;
                    obj13 = gr8.H(b8, this);
                    if (obj13 == obj24) {
                        return obj24;
                    }
                } else if (i15 == 1) {
                    o85.q(obj);
                    obj13 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vy7 vy78 = (vy7) obj13;
                if (!(vy78 == null || (str3 = vy78.c) == null)) {
                    boolean A3 = sg3.A(context2, "android.permission.CALL_PHONE");
                    rg5 rg53 = c238.g;
                    if (A3) {
                        int i16 = c238.q;
                        rg53.getClass();
                        rg5.b(context2, str3, i16);
                    } else {
                        rg53.getClass();
                        rg5.e(context2, str3);
                    }
                }
                return vs74;
            case 12:
                p81 p814 = p81.w;
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((c23) this.C).d.c((g40) this.D, this) == p814) {
                        return p814;
                    }
                } else if (i17 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                q43 q43 = (q43) this.C;
                p81 p815 = p81.w;
                int i18 = this.B;
                if (i18 == 0) {
                    o85.q(obj);
                    el3 el3 = (el3) q43.k().a0(me6.E);
                    if (el3 != null) {
                        z = el3.l();
                    }
                    if (z) {
                        this.B = 1;
                        Object a7 = ((h45) q43).a((md2) this.D, this);
                        if (a7 == p815) {
                            return p815;
                        }
                        return a7;
                    }
                    throw new IllegalStateException("Client already closed");
                } else if (i18 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 14:
                ji3 ji3 = (ji3) this.C;
                ThreadLocal threadLocal = ji3.b;
                Object obj25 = p81.w;
                int i19 = this.B;
                if (i19 == 0) {
                    o85.q(obj);
                    Object obj26 = threadLocal.get();
                    Boolean bool3 = Boolean.TRUE;
                    if (!sg3.e(obj26, bool3)) {
                        threadLocal.set(bool3);
                        qe1 qe1 = ji3.c;
                        id1 id1 = new id1((vr2) this.D, (f61) null);
                        this.B = 1;
                        obj14 = qe1.a(new fn5(id1, (f61) null, 1), this);
                        if (obj14 == obj25) {
                            return obj25;
                        }
                    } else {
                        h.s("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                } else if (i19 == 1) {
                    try {
                        o85.q(obj);
                        obj14 = obj;
                    } catch (Throwable th2) {
                        threadLocal.set(Boolean.FALSE);
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pp4 pp4 = (pp4) obj14;
                threadLocal.set(Boolean.FALSE);
                return pp4;
            case h75.g:
                Object obj27 = p81.w;
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    di2 b9 = ((ji3) this.C).c.b();
                    this.B = 1;
                    obj15 = gr8.J(b9, this);
                    if (obj15 == obj27) {
                        return obj27;
                    }
                } else if (i20 == 1) {
                    o85.q(obj);
                    obj15 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pp4 pp42 = (pp4) obj15;
                if (pp42 != null) {
                    in5 in5 = (in5) this.D;
                    in5.getClass();
                    Object obj28 = pp42.a.get(in5);
                    if (obj28 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj28;
                        obj28 = Arrays.copyOf(bArr, bArr.length);
                    }
                    Object obj29 = obj28;
                    if (obj29 != null) {
                        return obj29;
                    }
                }
                return -1L;
            case 16:
                p81 p816 = p81.w;
                int i21 = this.B;
                if (i21 == 0) {
                    o85.q(obj);
                    String string = ((Context) this.D).getString(R.string.report_sent);
                    string.getClass();
                    this.B = 1;
                    if (qw6.b((qw6) this.C, string, (String) null, this, 14) == p816) {
                        return p816;
                    }
                } else if (i21 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 17:
                p81 p817 = p81.w;
                int i22 = this.B;
                if (i22 == 0) {
                    o85.q(obj);
                    l70 l70 = new l70((Object) (ob5) this.D, (f61) null, 1);
                    this.B = 1;
                    if (fd1.s((uk5) this.C, l70, this) == p817) {
                        return p817;
                    }
                } else if (i22 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 18:
                p81 p818 = p81.w;
                int i23 = this.B;
                if (i23 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    bk5.a((o44) this.C, (ng) this.D, this);
                    return p818;
                } else if (i23 != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    o85.q(obj);
                    ta1.e();
                    return null;
                }
            case 19:
                Object obj30 = p81.w;
                int i24 = this.B;
                if (i24 == 0) {
                    o85.q(obj);
                    xk3 xk3 = ((p94) this.C).a;
                    this.B = 1;
                    Object P = sg3.P(this, xk3.a, true, false, new uk3((String) this.D, xk3, 0));
                    if (P == obj30) {
                        return obj30;
                    }
                    return P;
                } else if (i24 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 20:
                vs7 vs75 = vs7.a;
                Object obj31 = p81.w;
                int i25 = this.B;
                if (i25 == 0) {
                    o85.q(obj);
                    xk3 xk32 = ((p94) this.C).a;
                    this.B = 1;
                    Object P2 = sg3.P(this, xk32.a, false, true, new m0(26, xk32, (al3) this.D));
                    if (P2 != obj31) {
                        P2 = vs75;
                    }
                    if (P2 == obj31) {
                        return obj31;
                    }
                } else if (i25 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs75;
            case 21:
                p81 p819 = p81.w;
                int i26 = this.B;
                if (i26 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((uh4) this.C).a.i((Uri) this.D, this) == p819) {
                        return p819;
                    }
                } else if (i26 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 22:
                p81 p8110 = p81.w;
                int i27 = this.B;
                if (i27 == 0) {
                    o85.q(obj);
                    lg lgVar2 = new lg(8, (mm4) this.D);
                    this.B = 1;
                    if (((b37) this.C).a(lgVar2, this) == p8110) {
                        return p8110;
                    }
                } else if (i27 != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    o85.q(obj);
                }
                ta1.e();
                return null;
            case 23:
                en4 en4 = (en4) this.D;
                Object obj32 = p81.w;
                int i28 = this.B;
                if (i28 == 0) {
                    o85.q(obj);
                    o81 = (o81) this.C;
                    if (r16.X(o81.k())) {
                        en4.h = null;
                    }
                    en4.h = null;
                    return vs7.a;
                } else if (i28 == 1) {
                    o81 = (o81) this.C;
                    o85.q(obj);
                    J = obj;
                } else if (i28 == 2) {
                    o81 = (o81) this.C;
                    try {
                        o85.q(obj);
                        if (r16.X(o81.k())) {
                            ad0 ad0 = en4.g;
                            this.C = o81;
                            this.B = 1;
                            ad0.getClass();
                            J = ad0.J(ad0, this);
                            if (J == obj32) {
                                return obj32;
                            }
                        }
                        en4.h = null;
                        return vs7.a;
                    } catch (Throwable th3) {
                        en4.h = null;
                        throw th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o81 o813 = o81;
                float e0 = en4.c.e0(6.0f);
                float e02 = en4.c.e0(1.0f);
                zh6 zh6 = en4.a;
                this.C = o813;
                this.B = 2;
                if (en4.c(en4, zh6, (an4) J, e0, e02, this) != obj32) {
                    o81 = o813;
                    if (r16.X(o81.k())) {
                    }
                    en4.h = null;
                    return vs7.a;
                }
                return obj32;
            case 24:
                o81 o814 = (o81) this.C;
                p81 p8111 = p81.w;
                int i29 = this.B;
                if (i29 == 0) {
                    o85.q(obj);
                } else if (i29 == 1) {
                    o85.q(obj);
                    d37 = ((NautaOverlayService) this.D).H;
                    do {
                        value3 = d37.getValue();
                        longValue = ((Number) value3).longValue();
                        j = 0;
                        if (longValue > 0) {
                            j = longValue - 1;
                        }
                    } while (!d37.i(value3, new Long(j)));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!gl0.X(o814)) {
                    this.C = o814;
                    this.B = 1;
                    if (t49.G(1000, this) == p8111) {
                        return p8111;
                    }
                    d37 = ((NautaOverlayService) this.D).H;
                    do {
                        value3 = d37.getValue();
                        longValue = ((Number) value3).longValue();
                        j = 0;
                        if (longValue > 0) {
                        }
                    } while (!d37.i(value3, new Long(j)));
                    if (!gl0.X(o814)) {
                    }
                }
                return vs7.a;
            case 25:
                vs7 vs76 = vs7.a;
                Object obj33 = p81.w;
                int i30 = this.B;
                if (i30 == 0) {
                    o85.q(obj);
                    hr4 hr4 = ((gs4) this.C).b;
                    this.B = 1;
                    Object P3 = sg3.P(this, hr4.a.a, false, true, new cb((String) this.D, 17));
                    if (P3 != obj33) {
                        P3 = vs76;
                    }
                    if (P3 == obj33) {
                        return obj33;
                    }
                } else if (i30 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs76;
            case 26:
                return v(obj);
            case 27:
                return x(obj);
            case 28:
                return z(obj);
            default:
                p81 p8112 = p81.w;
                int i31 = this.B;
                if (i31 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((i05) this.C).a.g(hq4.x, (gs2) this.D, this) == p8112) {
                        return p8112;
                    }
                } else if (i31 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju1(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
    }
}

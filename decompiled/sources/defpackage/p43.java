package defpackage;

import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: p43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p43 extends a97 implements hs2 {
    public final /* synthetic */ int A = 0;
    public int B;
    public Object C;
    public /* synthetic */ Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p43(Long l, Long l2, Long l3, f61 f61) {
        super(3, f61);
        this.E = l;
        this.F = l2;
        this.G = l3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0234  */
    public final Object s(Object obj) {
        md2 md2;
        Object obj2;
        l43 l43;
        Object obj3;
        j85 j85;
        as3 as3;
        as3 as32;
        boolean z;
        Object obj4;
        int i = this.A;
        p81 p81 = p81.w;
        Object obj5 = this.F;
        Object obj6 = this.G;
        switch (i) {
            case b85.b:
                q43 q43 = (q43) obj6;
                j43 j43 = (j43) obj5;
                f96 f96 = j43.E;
                yg5 yg5 = (yg5) this.D;
                Object obj7 = this.E;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    y53 y53 = new y53();
                    y53 y532 = (y53) yg5.w;
                    y532.getClass();
                    y53.e = y532.e;
                    y53.e(y532);
                    Class<Object> cls = Object.class;
                    if (obj7 == null) {
                        y53.d = m15.a;
                        gq3 b = b26.a.b(cls);
                        try {
                            as32 = b26.b(cls);
                        } catch (Throwable unused) {
                            as32 = null;
                        }
                        y53.b(new fp7(b, as32));
                    } else if (obj7 instanceof j85) {
                        y53.d = obj7;
                        y53.b((fp7) null);
                    } else {
                        y53.d = obj7;
                        gq3 b2 = b26.a.b(cls);
                        try {
                            as3 = b26.b(cls);
                        } catch (Throwable unused2) {
                            as3 = null;
                        }
                        y53.b(new fp7(b2, as3));
                    }
                    f96.D(qr0.b);
                    Url b3 = y53.a.b();
                    i53 i53 = y53.b;
                    gz2 d1 = y53.c.d1();
                    Object obj8 = y53.d;
                    if (obj8 instanceof j85) {
                        j85 = (j85) obj8;
                    } else {
                        j85 = null;
                    }
                    if (j85 != null) {
                        w77 w77 = y53.e;
                        iz0 iz0 = y53.f;
                        md2 = new md2(b3, i53, d1, j85, w77, iz0);
                        iz0.e(w43.b, j43.F);
                        ArrayList arrayList = new ArrayList();
                        for (Object next : d1.names()) {
                            if (b53.a.contains((String) next)) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            q43.getClass();
                            for (t43 t43 : (Set) md2.h) {
                                if (!q43.A().contains(t43)) {
                                    rf2.j("Engine doesn't support ", t43);
                                }
                            }
                            this.D = yg5;
                            this.E = null;
                            this.C = md2;
                            this.B = 1;
                            obj2 = q43.O(q43, md2, this);
                            if (obj2 == p81) {
                                return p81;
                            }
                            i63 i63 = (i63) obj2;
                            md2.getClass();
                            i63.getClass();
                            l43 = new l43(j43);
                            l43.x = new xl1(l43, md2);
                            l43.y = new yl1(l43, i63);
                            iz0 attributes = l43.getAttributes();
                            au auVar = l43.A;
                            attributes.getClass();
                            auVar.getClass();
                            attributes.c().remove(auVar);
                            obj3 = i63.e;
                            if (!(obj3 instanceof hf0)) {
                            }
                            yl1 d = l43.d();
                            f96.D(qr0.c);
                            r16.Q(d.k()).v(new h43(2, j43, d));
                            this.D = null;
                            this.E = null;
                            this.C = null;
                            this.B = 2;
                            if (yg5.d(this, l43) == p81) {
                            }
                            return vs7.a;
                        }
                        String obj9 = arrayList.toString();
                        obj9.getClass();
                        throw new IllegalArgumentException("Header(s) " + obj9 + " are controlled by the engine and cannot be set explicitly");
                    }
                    ku4.x("No request transformation found: ", y53.d);
                } else if (i2 == 1) {
                    o85.q(obj);
                    md2 = (md2) this.C;
                    obj2 = obj;
                    i63 i632 = (i63) obj2;
                    md2.getClass();
                    i632.getClass();
                    l43 = new l43(j43);
                    l43.x = new xl1(l43, md2);
                    l43.y = new yl1(l43, i632);
                    iz0 attributes2 = l43.getAttributes();
                    au auVar2 = l43.A;
                    attributes2.getClass();
                    auVar2.getClass();
                    attributes2.c().remove(auVar2);
                    obj3 = i632.e;
                    if (!(obj3 instanceof hf0)) {
                        l43.getAttributes().e(auVar2, obj3);
                    }
                    yl1 d2 = l43.d();
                    f96.D(qr0.c);
                    r16.Q(d2.k()).v(new h43(2, j43, d2));
                    this.D = null;
                    this.E = null;
                    this.C = null;
                    this.B = 2;
                    if (yg5.d(this, l43) == p81) {
                        return p81;
                    }
                    return vs7.a;
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                Long l = (Long) obj6;
                Long l2 = (Long) obj5;
                Long l3 = (Long) this.E;
                wk6 wk6 = (wk6) this.C;
                y53 y533 = (y53) this.D;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    cc4 cc4 = a73.a;
                    as7 d3 = y533.a.d();
                    d3.getClass();
                    String str = d3.w;
                    if (str.equals("ws") || str.equals("wss")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Map map = (Map) y533.f.d(u43.a);
                    if (map != null) {
                        obj4 = map.get(x63.a);
                    } else {
                        obj4 = null;
                    }
                    y63 y63 = (y63) obj4;
                    if (y63 == null && !((!z || l3 == null) && l2 == null && l == null)) {
                        y63 = new y63();
                        y533.c(y63);
                    }
                    if (y63 != null) {
                        Long l4 = y63.b;
                        if (l4 != null) {
                            l2 = l4;
                        }
                        y63.a(l2);
                        y63.b = l2;
                        Long l5 = y63.c;
                        if (l5 != null) {
                            l = l5;
                        }
                        y63.a(l);
                        y63.c = l;
                        if (z) {
                            Long l6 = y63.a;
                            if (l6 != null) {
                                l3 = l6;
                            }
                            y63.b(l3);
                            Long l7 = y63.a;
                            if (!(l7 == null || l7.longValue() == Long.MAX_VALUE)) {
                                y533.e.v(new h43(5, ar7.H(wk6, new k81("request-timeout"), (r81) null, new p0(l7, y533, y533.e, (f61) null, 28), 2)));
                            }
                        }
                    }
                    this.C = null;
                    this.D = null;
                    this.B = 1;
                    Object a = wk6.w.a(y533, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i3 == 1) {
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
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case b85.b:
                p43 p43 = new p43((j43) obj5, (q43) obj4, (f61) obj3);
                p43.D = (yg5) obj;
                p43.E = obj2;
                return p43.s(vs7);
            default:
                p43 p432 = new p43((Long) this.E, (Long) obj5, (Long) obj4, (f61) obj3);
                p432.C = (wk6) obj;
                p432.D = (y53) obj2;
                return p432.s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p43(j43 j43, q43 q43, f61 f61) {
        super(3, f61);
        this.F = j43;
        this.G = q43;
    }
}

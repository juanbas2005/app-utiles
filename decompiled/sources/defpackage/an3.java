package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: an3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class an3 implements im3, j42, hy0 {
    public final ArrayList a;
    public final pl3 b;
    public final vr2 c;
    public final wl3 d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public an3(pl3 pl3, vr2 vr2, int i) {
        this(pl3, vr2, 0);
        this.g = i;
        pl3.getClass();
        vr2.getClass();
        switch (i) {
            case 1:
                this(pl3, vr2, 0);
                this.h = new LinkedHashMap();
                return;
            case 2:
                this(pl3, vr2, 0);
                this.h = new ArrayList();
                return;
            default:
                this.a.add("primitive");
                return;
        }
    }

    public void A(ll6 ll6, int i, zr3 zr3, Object obj) {
        switch (this.g) {
            case 1:
                ll6.getClass();
                zr3.getClass();
                if (obj != null || this.d.e) {
                    E(ll6, i, zr3, obj);
                    return;
                }
                return;
            default:
                E(ll6, i, zr3, obj);
                return;
        }
    }

    public final void B(long j) {
        String str = (String) K();
        str.getClass();
        L(str, em3.a(Long.valueOf(j)));
    }

    public final j42 C(lo5 lo5, int i) {
        lo5.getClass();
        return H(J(lo5, i), lo5.h(i));
    }

    public final void D(String str) {
        str.getClass();
        String str2 = (String) K();
        str2.getClass();
        L(str2, em3.b(str));
    }

    public final void E(ll6 ll6, int i, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        this.a.add(J(ll6, i));
        if (zr3.getDescriptor().c()) {
            g(zr3, obj);
        } else if (obj == null) {
            e();
        } else {
            g(zr3, obj);
        }
    }

    public final void F(Object obj, double d2) {
        String str = (String) obj;
        str.getClass();
        L(str, em3.a(Double.valueOf(d2)));
        if (!this.d.h && Math.abs(d2) > Double.MAX_VALUE) {
            throw ar7.b(Double.valueOf(d2), str);
        }
    }

    public final void G(Object obj, float f2) {
        String str = (String) obj;
        str.getClass();
        L(str, em3.a(Float.valueOf(f2)));
        if (!this.d.h && Math.abs(f2) > Float.MAX_VALUE) {
            throw ar7.b(Float.valueOf(f2), str);
        }
    }

    public final j42 H(Object obj, ll6 ll6) {
        String str = (String) obj;
        str.getClass();
        ll6.getClass();
        if (n47.a(ll6)) {
            return new b2(this, str);
        }
        if (ll6.j() && ll6.equals(em3.a)) {
            return new b2(this, str, ll6);
        }
        this.a.add(str);
        return this;
    }

    public JsonElement I() {
        switch (this.g) {
            case b85.b /*0*/:
                JsonElement jsonElement = (JsonElement) this.h;
                if (jsonElement != null) {
                    return jsonElement;
                }
                h.q("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new JsonObject((LinkedHashMap) this.h);
            default:
                return new JsonArray((ArrayList) this.h);
        }
    }

    public final String J(ll6 ll6, int i) {
        String str;
        ll6.getClass();
        int i2 = this.g;
        ll6.getClass();
        switch (i2) {
            case 2:
                str = String.valueOf(i);
                break;
            default:
                pl3 pl3 = this.b;
                pl3.getClass();
                rm3.d(pl3, ll6);
                str = ll6.f(i);
                break;
        }
        str.getClass();
        String str2 = (String) dt0.H0(this.a);
        return str;
    }

    public final Object K() {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(sg3.x(arrayList));
        }
        throw new IllegalArgumentException("No tag in stack for requested element");
    }

    public void L(String str, JsonElement jsonElement) {
        int i = this.g;
        str.getClass();
        jsonElement.getClass();
        switch (i) {
            case b85.b /*0*/:
                if (str != "primitive") {
                    h.q("This output can only consume primitives with 'primitive' tag");
                    return;
                } else if (((JsonElement) this.h) == null) {
                    this.h = jsonElement;
                    this.c.y(jsonElement);
                    return;
                } else {
                    h.q("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                    return;
                }
            case 1:
                ((LinkedHashMap) this.h).put(str, jsonElement);
                return;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), jsonElement);
                return;
        }
    }

    public final z53 a() {
        return this.b.b;
    }

    public final void b(ll6 ll6) {
        ll6.getClass();
        if (!this.a.isEmpty()) {
            K();
        }
        this.c.y(I());
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [an3, hn3] */
    public final hy0 c(ll6 ll6) {
        vr2 vr2;
        an3 an3;
        ll6.getClass();
        if (dt0.H0(this.a) == null) {
            vr2 = this.c;
        } else {
            vr2 = new gg0(2, (Object) this);
        }
        n85 u = ll6.u();
        boolean e2 = sg3.e(u, n57.m);
        pl3 pl3 = this.b;
        if (e2 || (u instanceof yk5)) {
            an3 = new an3(pl3, vr2, 2);
        } else if (sg3.e(u, n57.n)) {
            ll6 e3 = aa5.e(ll6.h(0), pl3.b);
            n85 u2 = e3.u();
            if ((u2 instanceof no5) || sg3.e(u2, ql6.l)) {
                vr2.getClass();
                ? an32 = new an3(pl3, vr2, 1);
                an32.j = true;
                an3 = an32;
            } else if (pl3.a.d) {
                an3 = new an3(pl3, vr2, 2);
            } else {
                throw ar7.c(e3);
            }
        } else {
            an3 = new an3(pl3, vr2, 1);
        }
        String str = this.e;
        if (str != null) {
            if (an3 instanceof hn3) {
                hn3 hn3 = (hn3) an3;
                hn3.L("key", em3.b(str));
                String str2 = this.f;
                if (str2 == null) {
                    str2 = ll6.a();
                }
                hn3.L("value", em3.b(str2));
            } else {
                String str3 = this.f;
                if (str3 == null) {
                    str3 = ll6.a();
                }
                an3.L(str, em3.b(str3));
            }
            this.e = null;
            this.f = null;
        }
        return an3;
    }

    public final void d(lo5 lo5, int i, double d2) {
        lo5.getClass();
        F(J(lo5, i), d2);
    }

    public final void e() {
        String str = (String) dt0.H0(this.a);
        if (str == null) {
            this.c.y(JsonNull.INSTANCE);
        } else {
            L(str, JsonNull.INSTANCE);
        }
    }

    public final boolean f(ll6 ll6) {
        ll6.getClass();
        return this.d.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 != defpackage.fq0.w) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (defpackage.sg3.e(r0, defpackage.n57.o) == false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    public final void g(zr3 zr3, Object obj) {
        String str;
        zr3 zr32;
        zr3.getClass();
        Object H0 = dt0.H0(this.a);
        pl3 pl3 = this.b;
        if (H0 == null) {
            ll6 e2 = aa5.e(zr3.getDescriptor(), pl3.b);
            if ((e2.u() instanceof no5) || e2.u() == ql6.l) {
                new an3(pl3, this.c, 0).g(zr3, obj);
                return;
            }
        }
        boolean z = zr3 instanceof q2;
        fq0 fq0 = pl3.a.j;
        if (!z) {
            int ordinal = fq0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n85 u = zr3.getDescriptor().u();
                    if (!sg3.e(u, n57.l)) {
                    }
                } else if (ordinal != 2) {
                    h.c();
                    return;
                }
            }
            str = null;
            if (!z) {
                q2 q2Var = (q2) zr3;
                if (obj != null) {
                    zr32 = c35.g(q2Var, this, obj);
                } else {
                    ku4.w(q2Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                    return;
                }
            } else {
                zr32 = zr3;
            }
            if (str != null) {
                b35.a(pl3, zr3, zr32, str);
                b35.e(zr32.getDescriptor().u());
                String a2 = zr32.getDescriptor().a();
                this.e = str;
                this.f = a2;
            }
            zr32.serialize(this, obj);
        }
        str = b35.f(pl3, zr3.getDescriptor());
        if (!z) {
        }
        if (str != null) {
        }
        zr32.serialize(this, obj);
    }

    public final void h(double d2) {
        F(K(), d2);
    }

    public final void i(short s) {
        String str = (String) K();
        str.getClass();
        L(str, em3.a(Short.valueOf(s)));
    }

    public final void j(ll6 ll6, int i, long j) {
        ll6.getClass();
        L(J(ll6, i), em3.a(Long.valueOf(j)));
    }

    public final void k(byte b2) {
        String str = (String) K();
        str.getClass();
        L(str, em3.a(Byte.valueOf(b2)));
    }

    public final void l(boolean z) {
        String str = (String) K();
        str.getClass();
        Boolean valueOf = Boolean.valueOf(z);
        ub3 ub3 = em3.a;
        L(str, new nm3(valueOf, false, (ll6) null));
    }

    public final j42 m(ll6 ll6) {
        ll6.getClass();
        if (dt0.H0(this.a) != null) {
            if (this.e != null) {
                this.f = ll6.a();
            }
            return H(K(), ll6);
        }
        return new an3(this.b, this.c, 0).m(ll6);
    }

    public final void n(ll6 ll6, int i, boolean z) {
        ll6.getClass();
        String J = J(ll6, i);
        Boolean valueOf = Boolean.valueOf(z);
        ub3 ub3 = em3.a;
        L(J, new nm3(valueOf, false, (ll6) null));
    }

    public final void o(ll6 ll6, int i, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        this.a.add(J(ll6, i));
        g(zr3, obj);
    }

    public final void p(float f2) {
        G(K(), f2);
    }

    public final void q(lo5 lo5, int i, byte b2) {
        lo5.getClass();
        L(J(lo5, i), em3.a(Byte.valueOf(b2)));
    }

    public final void r(char c2) {
        String str = (String) K();
        str.getClass();
        L(str, em3.b(String.valueOf(c2)));
    }

    public final void s(JsonObject jsonObject) {
        g(gm3.a, jsonObject);
    }

    public final void t(lo5 lo5, int i, float f2) {
        lo5.getClass();
        G(J(lo5, i), f2);
    }

    public final void u(ll6 ll6, int i) {
        ll6.getClass();
        String str = (String) K();
        str.getClass();
        L(str, em3.b(ll6.f(i)));
    }

    public final void v(lo5 lo5, int i, short s) {
        lo5.getClass();
        L(J(lo5, i), em3.a(Short.valueOf(s)));
    }

    public final void w(int i, int i2, ll6 ll6) {
        ll6.getClass();
        L(J(ll6, i), em3.a(Integer.valueOf(i2)));
    }

    public final void x(ll6 ll6, int i, String str) {
        ll6.getClass();
        str.getClass();
        L(J(ll6, i), em3.b(str));
    }

    public final void y(lo5 lo5, int i, char c2) {
        lo5.getClass();
        L(J(lo5, i), em3.b(String.valueOf(c2)));
    }

    public final void z(int i) {
        String str = (String) K();
        str.getClass();
        L(str, em3.a(Integer.valueOf(i)));
    }

    public an3(pl3 pl3, vr2 vr2, char c2) {
        this.a = new ArrayList();
        this.b = pl3;
        this.c = vr2;
        this.d = pl3.a;
    }
}

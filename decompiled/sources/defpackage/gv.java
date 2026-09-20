package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: gv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((gv) o((f61) obj2, (i26) obj)).s(vs7);
                return vs7;
            case 1:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 2:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 3:
                ((gv) o((f61) obj2, (pp4) obj)).s(vs7);
                return vs7;
            case 4:
                return ((gv) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((gv) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 7:
                return ((gv) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 9:
                ((gv) o((f61) obj2, (eo7) obj)).s(vs7);
                return vs7;
            case 10:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 12:
                ((gv) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            default:
                return ((gv) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                gv gvVar = new gv((a) obj3, (UserSession) obj2, f61, 0);
                gvVar.B = obj;
                return gvVar;
            case 1:
                return new gv((aq4) this.B, (vu1) obj3, (yx6) obj2, f61, 1);
            case 2:
                return new gv((c23) this.B, (Uri) obj3, (xi) obj2, f61, 2);
            case 3:
                gv gvVar2 = new gv((in5) obj3, (Long) obj2, f61, 3);
                gvVar2.B = obj;
                return gvVar2;
            case 4:
                return new gv((hf0) this.B, (fp7) obj3, (pl3) obj2, f61, 4);
            case 5:
                gv gvVar3 = new gv((uk5) obj3, (wd7) obj2, f61, 5);
                gvVar3.B = obj;
                return gvVar3;
            case 6:
                return new gv((sk3) this.B, (lk7) obj3, (MainActivity) obj2, f61, 6);
            case 7:
                return new gv((dc5) this.B, (String) obj3, (String) obj2, f61, 7);
            case 8:
                return new gv((wp5) this.B, (Context) obj3, (String) obj2, f61, 8);
            case 9:
                gv gvVar4 = new gv((lq5) obj3, (d06) obj2, f61, 9);
                gvVar4.B = obj;
                return gvVar4;
            case 10:
                return new gv((in8) this.B, (uu) obj3, (o81) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new gv((d07) this.B, (byte[]) obj3, (AtomicLong) obj2, f61, 11);
            case 12:
                return new gv((kg5) this.B, (String) obj3, (String) obj2, f61, 12);
            default:
                gv gvVar5 = new gv((String) obj3, (String) obj2, f61, 13);
                gvVar5.B = obj;
                return gvVar5;
        }
    }

    public final Object s(Object obj) {
        Throwable th;
        hk1 hk1;
        Iterator it;
        Object value;
        String str;
        int i = this.A;
        String str2 = null;
        vs7 vs7 = vs7.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                i26 i26 = (i26) this.B;
                o85.q(obj);
                a aVar = (a) obj3;
                cf4 cf4 = aVar.d;
                int a = ((UserSession) obj2).getExpiresAt().compareTo(td3.a.c());
                ub4 ub4 = ub4.w;
                if (a <= 0) {
                    ms3 ms3 = (ms3) cf4.z;
                    String str3 = (String) cf4.y;
                    if (ms3.a(ub4)) {
                        ms3.b(ub4, str3, (Throwable) null, "Session expired while trying to refresh the session. Updating status...");
                    }
                    aVar.u(new ln6(i26));
                }
                zu zuVar = new zu(i26);
                ms3 ms32 = (ms3) cf4.z;
                String str4 = (String) cf4.y;
                if (ms32.a(ub4)) {
                    ms32.b(ub4, str4, (Throwable) null, "Emitting event " + zuVar);
                }
                aVar.g.r(zuVar);
                return vs7;
            case 1:
                o85.q(obj);
                vu1 vu1 = (vu1) obj3;
                yx6 yx6 = (yx6) obj2;
                for (zs4 zs4 : (Set) ((aq4) this.B).getValue()) {
                    if (!((List) vu1.b().e.w.getValue()).contains(zs4) && !yx6.contains(zs4)) {
                        vu1.b().c(zs4);
                    }
                }
                return vs7;
            case 2:
                o85.q(obj);
                Cursor query = ((c23) this.B).h.getContentResolver().query((Uri) obj3, new String[]{"data1"}, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str2 = query.getString(query.getColumnIndexOrThrow("data1"));
                        }
                        query.close();
                        if (str2 != null) {
                            StringBuilder sb = new StringBuilder();
                            int length = str2.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                char charAt = str2.charAt(i2);
                                if (Character.isDigit(charAt)) {
                                    sb.append(charAt);
                                }
                            }
                            ((xi) obj2).y(d57.j1(sb.toString()));
                        }
                    } catch (Throwable th2) {
                        ed1.i(query, th);
                        throw th2;
                    }
                }
                return vs7;
            case 3:
                o85.q(obj);
                ((pp4) this.B).c((in5) obj3, (Long) obj2);
                return vs7;
            case 4:
                o85.q(obj);
                hf0 hf0 = (hf0) this.B;
                hf0.getClass();
                aa0 aa0 = new aa0(0, (Object) hf0);
                pl3 pl3 = (pl3) obj2;
                zr3 x = z85.x(pl3.b, tf4.i((fp7) obj3));
                sw5 sw5 = new sw5(new f96(aa0), new char[16384], pl3.a);
                if (sw5.z() == 8) {
                    sw5.j((byte) 8);
                    hk1 = hk1.x;
                } else {
                    hk1 = hk1.w;
                }
                int ordinal = hk1.ordinal();
                if (ordinal == 0) {
                    it = new mm3(pl3, sw5, x);
                } else if (ordinal == 1) {
                    it = new lm3(pl3, sw5, x);
                } else if (ordinal != 2) {
                    h.c();
                    return null;
                } else {
                    h.s("AbstractJsonLexer.determineFormat must be called beforehand.");
                    return null;
                }
                return new g21(new cn3(it, 0));
            case 5:
                o85.q(obj);
                o81 o81 = (o81) this.B;
                uk5 uk5 = (uk5) obj3;
                wd7 wd7 = (wd7) obj2;
                r71 r71 = new r71(uk5, wd7, (f61) null, 1);
                r81 r81 = r81.z;
                ar7.H(o81, (e81) null, r81, r71, 1);
                return ar7.H(o81, (e81) null, r81, new r71(uk5, wd7, (f61) null, 2), 1);
            case 6:
                o85.q(obj);
                ((sk3) this.B).c((lk7) obj3);
                int i3 = MainActivity.g0;
                ((MainActivity) obj2).f0.setValue((Object) null);
                return vs7;
            case 7:
                o85.q(obj);
                dc5 dc5 = (dc5) this.B;
                dc5.b.clear();
                f73 f73 = new f73(0);
                f73.f((g73) null, "https://pamarillas.cu/");
                dc5.a(dc5, f73.c(), true);
                f73 f732 = new f73(0);
                f732.f((g73) null, "https://pamarillas.cu/");
                f73 f = f732.c().f();
                String str5 = (String) obj3;
                f.a("q", str5);
                String str6 = (String) obj2;
                f.a("d", str6);
                f.a("lim", "50");
                f.a("flr", "ALL");
                yb5 a2 = dc5.a(dc5, f.c(), false);
                int intValue = ((Number) a2.w).intValue();
                String str7 = (String) a2.x;
                if (300 > intValue || intValue >= 400) {
                    return dc5.b(str7, "well", "h4", "media-heading");
                }
                f73 f733 = new f73(0);
                f733.f((g73) null, "https://pamarillas.cu/blancas/");
                f73 f2 = f733.c().f();
                f2.a("q", str5);
                f2.a("d", str6);
                f2.a("lim", "50");
                f2.a("flr", "ALL");
                String str8 = (String) dc5.a(dc5, f2.c(), false).x;
                String g1 = d57.g1(d57.c1(str8, "<div class=\"container\">", str8), "<script type=\"text/javascript\">");
                ArrayList b = dc5.b(g1, "well-1", "div", "title-well-1");
                if (!b.isEmpty()) {
                    return b;
                }
                ArrayList b2 = ec5.b(g1, "div", "row-loading");
                ArrayList arrayList = new ArrayList();
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    it0.h0(arrayList, dc5.b((String) it2.next(), "well-3", "div", "title-well-4"));
                }
                return arrayList;
            case 8:
                o85.q(obj);
                wp5 wp5 = (wp5) this.B;
                if (wp5.a == null && wp5.d == rv.y) {
                    Toast.makeText((Context) obj3, (String) obj2, 1).show();
                }
                return vs7;
            case 9:
                eo7 eo7 = (eo7) this.B;
                o85.q(obj);
                u5 u5Var = (u5) eo7.w;
                a54 a54 = (a54) eo7.x;
                b54 b54 = (b54) eo7.y;
                lq5 lq5 = (lq5) obj3;
                d37 d37 = lq5.c;
                do {
                    value = d37.getValue();
                } while (!pb4.t(wp5.a((wp5) ((is7) value).a, u5Var, a54, b54, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16376), 6, d37, value));
                if (u5Var != null) {
                    d06 d06 = (d06) obj2;
                    if (!d06.w) {
                        d06.w = true;
                        ar7.H(u58.a(lq5), (e81) null, (r81) null, new iq5(lq5, (f61) null, 1), 3);
                        ar7.H(u58.a(lq5), (e81) null, (r81) null, new iq5(lq5, (f61) null, 2), 3);
                    }
                }
                if (u5Var != null) {
                    str = u5Var.e;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (!d57.I0(str) && !str.equals(lq5.e)) {
                    lq5.e = str;
                    ar7.H(u58.a(lq5), (e81) null, (r81) null, new iq5(lq5, (f61) null, 0), 3);
                }
                return vs7;
            case 10:
                o85.q(obj);
                ((in8) this.B).x0(new gq6((uu) obj3, (o81) obj2));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                o85.q(obj);
                a07 a07 = new a07((byte[]) obj3, (AtomicLong) obj2);
                try {
                    d45 d45 = ((d07) this.B).b;
                    o9 o9Var = new o9(12);
                    o9Var.N("https://speed.cloudflare.com/__up");
                    o9Var.G("POST", a07);
                    kd6 kd6 = new kd6(o9Var);
                    d45.getClass();
                    new dx5(d45, kd6, false).f().close();
                } catch (CancellationException unused) {
                    throw new CancellationException();
                } catch (Exception unused2) {
                }
                return vs7;
            case 12:
                o85.q(obj);
                ((ay4) ((kg5) this.B).x).t((String) obj3, (String) obj2);
                return vs7;
            default:
                UserDataPreferences userDataPreferences = (UserDataPreferences) this.B;
                o85.q(obj);
                ArrayList M0 = dt0.M0(sg3.D(((String) obj3) + ":::" + ((String) obj2)), userDataPreferences.getAsterisco99History());
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = M0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String str9 = (String) next;
                    if (hashSet.add(d57.c1(str9, ":::", str9))) {
                        arrayList2.add(next);
                    }
                }
                return UserDataPreferences.copy$default(userDataPreferences, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, dt0.V0(5, arrayList2), (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -67108865, -1, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }
}

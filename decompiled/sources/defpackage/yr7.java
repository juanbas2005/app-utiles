package defpackage;

import io.ktor.http.Url;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: yr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yr7 {
    public static final Url k = j45.e("http://localhost").b();
    public String a = "";
    public boolean b = false;
    public int c = 0;
    public as7 d = null;
    public String e = null;
    public String f = null;
    public String g;
    public List h;
    public wc5 i;
    public v70 j;

    /* JADX WARNING: type inference failed for: r7v0, types: [tc0, java.lang.Object] */
    public yr7() {
        uc5.b.getClass();
        d42 d42 = tc5.b;
        d42.getClass();
        Set set = ss0.a;
        Charset charset = mo0.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.getClass();
        int length = "".length();
        ? obj = new Object();
        if (length <= 0) {
            ss0.f(obj, new gg0(13, (Object) sb));
            this.g = sb.toString();
            List list = a42.w;
            this.h = new ArrayList(et0.e0(list, 10));
            dz2 dz2 = new dz2(1);
        } else {
            int i2 = 0;
            do {
                byte[] r = rg3.r(newEncoder, "", i2, length);
                obj.D(r.length, r);
                int length2 = r.length;
                if (length2 >= 0) {
                    i2 += length2;
                } else {
                    h.s("Check failed.");
                    throw null;
                }
            } while (i2 < length);
        }
        ss0.f(obj, new gg0(13, (Object) sb));
        this.g = sb.toString();
        List list2 = a42.w;
        this.h = new ArrayList(et0.e0(list2, 10));
        dz2 dz22 = new dz2(1);
        for (String str : d42.names()) {
            List<String> v = d42.v(str);
            v = v == null ? list2 : v;
            String e2 = ss0.e(str, false);
            ArrayList arrayList = new ArrayList(et0.e0(v, 10));
            for (String str2 : v) {
                str2.getClass();
                arrayList.add(ss0.e(str2, true));
            }
            dz22.L(e2, arrayList);
        }
        this.i = dz22;
        this.j = new v70((wc5) dz22);
    }

    public final void a() {
        if (this.a.length() <= 0 && !d().w.equals("file")) {
            Url url = k;
            this.a = url.getHost();
            if (this.d == null) {
                this.d = url.getProtocolOrNull();
            }
            if (this.c == 0) {
                e(url.getSpecifiedPort());
            }
        }
    }

    public final Url b() {
        String str;
        a();
        as7 as7 = this.d;
        String str2 = this.a;
        int i2 = this.c;
        List<String> list = this.h;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (String c2 : list) {
            arrayList.add(ss0.c(c2));
        }
        uc5 f2 = h75.f((wc5) this.j.y);
        String d2 = ss0.d(0, 0, 15, this.g);
        String str3 = this.e;
        String str4 = null;
        if (str3 != null) {
            str = ss0.c(str3);
        } else {
            str = null;
        }
        String str5 = this.f;
        if (str5 != null) {
            str4 = ss0.c(str5);
        }
        return new Url(as7, str2, i2, arrayList, f2, d2, str, str4, this.b, c());
    }

    public final String c() {
        a();
        StringBuilder sb = new StringBuilder(256);
        t35.f(this, sb);
        return sb.toString();
    }

    public final as7 d() {
        as7 as7 = this.d;
        if (as7 != null) {
            return as7;
        }
        as7 as72 = as7.y;
        return as7.y;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= 65536) {
            h.j(hl6.k(i2, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.c = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        t35.f(this, sb);
        return sb.toString();
    }
}

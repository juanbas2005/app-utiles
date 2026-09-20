package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: g73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g73 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;

    public g73(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        String str = this.h;
        return str.substring(d57.F0(str, ':', this.a.length() + 3, 4) + 1, d57.F0(str, '@', 0, 6));
    }

    public final String b() {
        String str = this.h;
        int F0 = d57.F0(str, '/', this.a.length() + 3, 4);
        return str.substring(F0, dg8.c(F0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        String str = this.h;
        int F0 = d57.F0(str, '/', this.a.length() + 3, 4);
        int c2 = dg8.c(F0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (F0 < c2) {
            int i = F0 + 1;
            int d2 = dg8.d(str, '/', i, c2);
            arrayList.add(str.substring(i, d2));
            F0 = d2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int F0 = d57.F0(str, '?', 0, 6) + 1;
        return str.substring(F0, dg8.d(str, '#', F0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, dg8.c(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g73) || !((g73) obj).h.equals(this.h)) {
            return false;
        }
        return true;
    }

    public final f73 f() {
        int i;
        ArrayList arrayList;
        f73 f73 = new f73(0);
        ArrayList arrayList2 = (ArrayList) f73.h;
        String str = this.a;
        f73.c = str;
        f73.d = e();
        f73.e = a();
        f73.f = this.d;
        str.getClass();
        int i2 = -1;
        if (str.equals("http")) {
            i = 80;
        } else if (str.equals("https")) {
            i = 443;
        } else {
            i = -1;
        }
        int i3 = this.e;
        if (i3 != i) {
            i2 = i3;
        }
        f73.b = i2;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d2 = d();
        String str2 = null;
        if (d2 != null) {
            arrayList = f73.g(ie1.v(0, 0, 83, d2, " \"'<>#"));
        } else {
            arrayList = null;
        }
        f73.i = arrayList;
        if (this.g != null) {
            String str3 = this.h;
            str2 = str3.substring(d57.F0(str3, '#', 0, 6) + 1);
        }
        f73.g = str2;
        return f73;
    }

    public final String g() {
        f73 f73;
        try {
            f73 = new f73(0);
            f73.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            f73 = null;
        }
        f73.getClass();
        f73.d = ie1.v(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        f73.e = ie1.v(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return f73.c().h;
    }

    public final URI h() {
        String str;
        String str2;
        String str3;
        f73 f2 = f();
        ArrayList arrayList = (ArrayList) f2.h;
        String str4 = (String) f2.f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str4).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        f2.f = str;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ie1.v(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) f2.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str5 = (String) arrayList2.get(i2);
                if (str5 != null) {
                    str3 = ie1.v(0, 0, 67, str5, "\\^`{|}");
                } else {
                    str3 = null;
                }
                arrayList2.set(i2, str3);
            }
        }
        String str6 = (String) f2.g;
        if (str6 != null) {
            str2 = ie1.v(0, 0, 35, str6, " \"#<>\\^`{|}");
        } else {
            str2 = null;
        }
        f2.g = str2;
        String f73 = f2.toString();
        try {
            return new URI(f73);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(f73).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                rf2.o(e2);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final URL i() {
        try {
            return new URL(this.h);
        } catch (MalformedURLException e2) {
            rf2.o(e2);
            return null;
        }
    }

    public final String toString() {
        return this.h;
    }
}

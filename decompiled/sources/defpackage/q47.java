package defpackage;

import io.ktor.http.Url;
import java.util.List;

/* renamed from: q47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q47 {
    public static final List a = sg3.E("apikey", "Authorization");

    public static String a(String str) {
        str.getClass();
        if (d57.I0(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d57.i1(2, str));
        sb.append("...");
        sb.append(" (len=" + str.length() + ')');
        return sb.toString();
    }

    public static String b(Url url) {
        url.getClass();
        yr7 d = j45.d(url);
        d.a = d57.i1(2, d.a).concat("...");
        return d.c();
    }
}

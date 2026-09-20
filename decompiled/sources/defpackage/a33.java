package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a33 {
    public static final vy2[] a;
    public static final Map b;

    static {
        vy2 vy2 = new vy2(vy2.i, "");
        dg0 dg0 = vy2.f;
        vy2 vy22 = new vy2(dg0, "GET");
        vy2 vy23 = new vy2(dg0, "POST");
        dg0 dg02 = vy2.g;
        vy2 vy24 = new vy2(dg02, "/");
        vy2 vy25 = new vy2(dg02, "/index.html");
        dg0 dg03 = vy2.h;
        vy2 vy26 = new vy2(dg03, "http");
        vy2 vy27 = new vy2(dg03, "https");
        dg0 dg04 = vy2.e;
        vy2 vy28 = new vy2(dg04, "200");
        vy2 vy29 = new vy2(dg04, "204");
        vy2 vy210 = new vy2(dg04, "206");
        vy2 vy211 = vy29;
        vy2 vy212 = new vy2(dg04, "304");
        vy2 vy213 = vy211;
        vy2 vy214 = new vy2(dg04, "400");
        vy2 vy215 = vy213;
        vy2 vy216 = new vy2(dg04, "404");
        vy2 vy217 = vy215;
        vy2 vy218 = vy22;
        vy2 vy219 = new vy2(dg04, "500");
        vy2 vy220 = vy217;
        vy2 vy221 = new vy2("accept-charset", "");
        vy2 vy222 = vy2;
        vy2 vy223 = vy23;
        vy2 vy224 = new vy2("accept-encoding", "gzip, deflate");
        vy2 vy225 = new vy2("accept-language", "");
        vy2 vy226 = new vy2("accept-ranges", "");
        vy2 vy227 = vy223;
        vy2 vy228 = vy226;
        vy2 vy229 = vy227;
        vy2 vy230 = vy222;
        vy2[] vy2Arr = {vy230, vy218, vy229, vy24, vy25, vy26, vy27, vy28, vy220, vy210, vy212, vy214, vy216, vy219, vy221, vy224, vy225, vy228, new vy2("accept", ""), new vy2("access-control-allow-origin", ""), new vy2("age", ""), new vy2("allow", ""), new vy2("authorization", ""), new vy2("cache-control", ""), new vy2("content-disposition", ""), new vy2("content-encoding", ""), new vy2("content-language", ""), new vy2("content-length", ""), new vy2("content-location", ""), new vy2("content-range", ""), new vy2("content-type", ""), new vy2("cookie", ""), new vy2("date", ""), new vy2("etag", ""), new vy2("expect", ""), new vy2("expires", ""), new vy2("from", ""), new vy2("host", ""), new vy2("if-match", ""), new vy2("if-modified-since", ""), new vy2("if-none-match", ""), new vy2("if-range", ""), new vy2("if-unmodified-since", ""), new vy2("last-modified", ""), new vy2("link", ""), new vy2("location", ""), new vy2("max-forwards", ""), new vy2("proxy-authenticate", ""), new vy2("proxy-authorization", ""), new vy2("range", ""), new vy2("referer", ""), new vy2("refresh", ""), new vy2("retry-after", ""), new vy2("server", ""), new vy2("set-cookie", ""), new vy2("strict-transport-security", ""), new vy2("transfer-encoding", ""), new vy2("user-agent", ""), new vy2("vary", ""), new vy2("via", ""), new vy2("www-authenticate", "")};
        a = vy2Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(vy2Arr[i].a)) {
                linkedHashMap.put(vy2Arr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(dg0 dg0) {
        dg0.getClass();
        int d = dg0.d();
        int i = 0;
        while (i < d) {
            byte i2 = dg0.i(i);
            if (65 > i2 || i2 >= 91) {
                i++;
            } else {
                rf2.i("PROTOCOL_ERROR response malformed: mixed case name: ".concat(dg0.r()));
                return;
            }
        }
    }
}

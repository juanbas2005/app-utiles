package io.github.jan.supabase.exceptions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/exceptions/RestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "supabase-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RestException extends Exception {
    public final int w;

    /* JADX WARNING: Illegal instructions before constructor call */
    public RestException(String str, String str2, yl1 yl1) {
        super(r0.toString());
        String str3;
        String str4;
        str.getClass();
        yl1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "\n".concat(str2);
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("\nURL: ");
        List list = q47.a;
        sb.append(q47.b(yl1.V().c().D()));
        sb.append("\nHeaders: ");
        cz2 a = yl1.V().c().a();
        a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.l()) {
            linkedHashMap.put((String) entry.getKey(), dt0.b1((Iterable) entry.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            String str5 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            if (q47.a.contains(str5)) {
                String str6 = (String) dt0.y0(list2);
                if (str6 != null) {
                    if (sg3.e(str5, "Authorization")) {
                        str4 = "Bearer ".concat(q47.a(d57.z0(7, str6)));
                    } else {
                        str4 = q47.a(str6);
                    }
                    list2 = sg3.D(str4);
                } else {
                    list2 = null;
                }
            }
            linkedHashMap2.put(key, list2);
        }
        sb.append(linkedHashMap2.toString());
        sb.append("\nHttp Method: ");
        sb.append(yl1.V().c().getMethod().a);
        this.w = yl1.e().w;
    }
}

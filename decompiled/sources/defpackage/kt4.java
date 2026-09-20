package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: kt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kt4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ nt4 x;

    public /* synthetic */ kt4(nt4 nt4, int i) {
        this.w = i;
        this.x = nt4;
    }

    public final Object b() {
        List list;
        int i = this.w;
        nt4 nt4 = this.x;
        switch (i) {
            case b85.b:
                String str = nt4.c;
                if (str != null) {
                    return new k26(str, 0);
                }
                return null;
            case 1:
                return Boolean.valueOf(nt4.r.e(nt4.a));
            case 2:
                String str2 = nt4.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) nt4.e.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str2);
                    parse.getClass();
                    for (String next : parse.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(next);
                        if (queryParameters.size() <= 1) {
                            String str3 = (String) dt0.y0(queryParameters);
                            if (str3 == null) {
                                nt4.g = true;
                                str3 = next;
                            }
                            mt4 mt4 = new mt4();
                            int i2 = 0;
                            for (xf4 a = k26.a(nt4.n, str3); a != null; a = a.c()) {
                                uf4 g = a.c.g(1);
                                g.getClass();
                                mt4.b.add(g.a);
                                if (a.b().w > i2) {
                                    String quote = Pattern.quote(str3.substring(i2, a.b().w));
                                    quote.getClass();
                                    sb.append(quote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i2 = a.b().x + 1;
                            }
                            if (i2 < str3.length()) {
                                String quote2 = Pattern.quote(str3.substring(i2));
                                quote2.getClass();
                                sb.append(quote2);
                            }
                            sb.append("$");
                            mt4.a = nt4.h(sb.toString());
                            linkedHashMap.put(next, mt4);
                        } else {
                            h.j(pb4.m("Query parameter ", next, " must only be present once in ", str2, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                    }
                }
                return linkedHashMap;
            case 3:
                String str4 = nt4.a;
                Uri parse2 = Uri.parse(str4);
                parse2.getClass();
                if (parse2.getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Uri parse3 = Uri.parse(str4);
                parse3.getClass();
                String fragment = parse3.getFragment();
                StringBuilder sb2 = new StringBuilder();
                fragment.getClass();
                nt4.a(fragment, arrayList, sb2);
                return new yb5(arrayList, sb2.toString());
            case 4:
                yb5 yb5 = (yb5) nt4.h.getValue();
                if (yb5 == null || (list = (List) yb5.w) == null) {
                    return new ArrayList();
                }
                return list;
            case 5:
                yb5 yb52 = (yb5) nt4.h.getValue();
                if (yb52 != null) {
                    return (String) yb52.x;
                }
                return null;
            case 6:
                String str5 = (String) nt4.j.getValue();
                if (str5 != null) {
                    return new k26(str5, 0);
                }
                return null;
            default:
                return null;
        }
    }
}

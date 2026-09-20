package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* renamed from: k04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k04 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ k04(int i, Collection collection) {
        this.w = 2;
        this.x = i;
        this.y = collection;
    }

    public final Object y(Object obj) {
        String str;
        as3 as3;
        int i = this.w;
        vs7 vs7 = vs7.a;
        vr2 vr2 = null;
        Object obj2 = this.y;
        int i2 = this.x;
        switch (i) {
            case b85.b:
                r24 r24 = (r24) obj;
                lm1 lm1 = ((n04) obj2).a;
                ix6 h = j45.h();
                if (h != null) {
                    vr2 = h.e();
                }
                j45.m(h, j45.j(h), vr2);
                lm1.getClass();
                int i3 = r24.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    r24.a(i2 + i4);
                }
                return vs7;
            case 1:
                im5 im5 = (im5) obj2;
                y53 y53 = (y53) obj;
                y53.getClass();
                dz2 dz2 = y53.c;
                String str2 = im5.b;
                y53.d(im5.c);
                pv8.q(y53, l51.c);
                JsonElement jsonElement = im5.e;
                if (jsonElement != null) {
                    y53.d = jsonElement;
                    Class<JsonElement> cls = JsonElement.class;
                    gq3 b = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused) {
                        as3 = null;
                    }
                    y53.b(new fp7(b, as3));
                }
                if (!d57.I0(str2)) {
                    i53 i53 = im5.c;
                    if (sg3.e(i53, i53.b) || sg3.e(i53, i53.g)) {
                        b35.t(y53, "Accept-Profile", str2);
                    } else {
                        b35.t(y53, "Content-Profile", str2);
                    }
                }
                d4 d4Var = im5.d;
                if (sg3.e(d4Var, b4.a)) {
                    str = "text/csv";
                } else if (sg3.e(d4Var, c4.a)) {
                    str = "application/geo+json";
                } else if (sg3.e(d4Var, d4.a)) {
                    str = "application/json";
                } else if (sg3.e(d4Var, e4.a)) {
                    str = "application/vnd.pgrst.object+json".concat("");
                } else {
                    h.c();
                    return null;
                }
                b35.t(y53, "Accept", str);
                sn6 sn6 = new sn6();
                sn6.addAll(im5.a());
                b35.t(y53, "Prefer", dt0.E0(wn6.d(sn6), ",", (String) null, (String) null, (vr2) null, 62));
                v70 v70 = y53.a.j;
                LinkedHashMap linkedHashMap = im5.f;
                int i5 = m18.a;
                linkedHashMap.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), dt0.w0((List) entry.getValue()));
                }
                v70.getClass();
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    v70.p0((String) entry2.getKey(), (String) entry2.getValue());
                }
                o55.b(dz2, im5.g);
                if (i2 <= 0) {
                    return vs7;
                }
                dz2.p0("x-retry-count", String.valueOf(i2));
                return vs7;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ k04(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }
}

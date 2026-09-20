package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* renamed from: im5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class im5 {
    public f76 a = d76.b;
    public final String b;
    public i53 c;
    public final d4 d;
    public JsonElement e;
    public final LinkedHashMap f;
    public final dz2 g;
    public final boolean h;

    public im5(String str, ku4 ku4) {
        ku4.getClass();
        this.b = str;
        this.c = i53.b;
        this.d = d4.a;
        this.f = new LinkedHashMap();
        this.g = new dz2(0);
        this.h = true;
    }

    public static void b(bj6 bj6, String str, w75 w75) {
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = bj6.f;
        List list = (List) linkedHashMap.get("order");
        if (list != null) {
            str2 = (String) dt0.y0(list);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2.concat(",");
        }
        linkedHashMap.put("order", sg3.D(str3 + str + '.' + w75.w + '.' + "nullslast"));
    }

    public static void c(bj6 bj6, long j, long j2) {
        LinkedHashMap linkedHashMap = bj6.f;
        linkedHashMap.put("offset", sg3.D(String.valueOf(j)));
        linkedHashMap.put("limit", sg3.D(String.valueOf((j2 - j) + 1)));
    }

    public List a() {
        return a42.w;
    }

    public final void d(String str) {
        e76 e76 = new e76(str);
        this.f.put("select", sg3.D(str));
        this.a = e76;
    }

    public final void e(i53 i53) {
        i53.getClass();
        this.c = i53;
    }

    public final List f() {
        return sg3.D("return=".concat(this.a.a));
    }
}

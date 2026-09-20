package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: am3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am3 implements l42 {
    public static final xl3 e = new xl3(0);
    public static final yl3 f = new yl3(0);
    public static final yl3 g = new yl3(1);
    public static final zl3 h = new Object();
    public final HashMap a;
    public final HashMap b;
    public final xl3 c = e;
    public boolean d = false;

    public am3() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, h);
        hashMap.remove(cls3);
    }

    public final l42 a(Class cls, q25 q25) {
        this.a.put(cls, q25);
        this.b.remove(cls);
        return this;
    }
}

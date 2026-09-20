package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv0 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final xv0 f;
    public final Set g;

    public gv0(String str, Set set, Set set2, int i, int i2, xv0 xv0, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = xv0;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static fv0 a(av5 av5) {
        return new fv0(av5, new av5[0]);
    }

    public static fv0 b(Class cls) {
        return new fv0(cls, new Class[0]);
    }

    public static gv0 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(av5.a(cls));
        for (Class cls2 : clsArr) {
            h75.d("Null interface", cls2);
            hashSet.add(av5.a(cls2));
        }
        return new gv0((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ev0(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

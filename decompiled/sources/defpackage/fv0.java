package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: fv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fv0 {
    public String a;
    public int b;
    public int c;
    public final Object d;
    public final Collection e;
    public final Serializable f;
    public Object g;

    public fv0(Class cls, Class[] clsArr) {
        this.a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet.add(av5.a(cls));
        for (Class cls2 : clsArr) {
            h75.d("Null interface", cls2);
            ((HashSet) this.d).add(av5.a(cls2));
        }
    }

    public void a(zp1 zp1) {
        if (!((HashSet) this.d).contains(zp1.a)) {
            ((HashSet) this.e).add(zp1);
        } else {
            h.q("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public gv0 b() {
        boolean z;
        if (((xv0) this.g) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new gv0(this.a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.b, this.c, (xv0) this.g, (HashSet) this.f);
        }
        h.s("Missing required property: factory.");
        return null;
    }

    public void c(int i) {
        boolean z;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b = i;
        } else {
            h.s("Instantiation type has already been set.");
        }
    }

    public fv0(byte[] bArr, String str, List list, String str2, int i, int i2) {
        this.d = bArr;
        this.a = str;
        this.e = list;
        this.f = str2;
        this.b = i2;
        this.c = i;
    }

    public fv0(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public fv0(av5 av5, av5[] av5Arr) {
        this.a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet.add(av5);
        for (av5 d2 : av5Arr) {
            h75.d("Null interface", d2);
        }
        Collections.addAll((HashSet) this.d, av5Arr);
    }
}

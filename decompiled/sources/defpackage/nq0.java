package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: nq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nq0 {
    public final String a;
    public List b = a42.w;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public nq0(String str) {
        this.a = str;
    }

    public static /* synthetic */ void b(nq0 nq0, String str, ll6 ll6, int i) {
        boolean z;
        if ((i & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        nq0.a(str, ll6, z);
    }

    public final void a(String str, ll6 ll6, boolean z) {
        str.getClass();
        ll6.getClass();
        if (this.d.add(str)) {
            this.c.add(str);
            this.e.add(ll6);
            this.f.add(a42.w);
            this.g.add(Boolean.valueOf(z));
            return;
        }
        StringBuilder q = b81.q("Element with name '", str, "' is already registered in ");
        q.append(this.a);
        throw new IllegalArgumentException(q.toString().toString());
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: uu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uu3 {
    public int a;
    public r16 b;
    public final ArrayList c = new ArrayList(0);
    public uu3 d;
    public uu3 e;
    public pu3 f;
    public final ArrayList g;

    public uu3(int i) {
        this.a = i;
        nk4.a.getClass();
        List<nk4> a2 = mk4.a();
        ArrayList arrayList = new ArrayList(et0.e0(a2, 10));
        for (nk4 nk4 : a2) {
            ((ro3) nk4).getClass();
            arrayList.add(new xp3());
        }
        this.g = arrayList;
    }

    public final r16 a() {
        r16 r16 = this.b;
        if (r16 != null) {
            return r16;
        }
        sg3.a0("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!uu3.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        uu3 uu3 = (uu3) obj;
        if (this.a == uu3.a && a().equals(uu3.a()) && sg3.e(this.c, uu3.c) && sg3.e(this.e, uu3.e) && sg3.e(this.d, uu3.d) && sg3.e(this.f, uu3.f) && sg3.e(this.g, uu3.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = a().hashCode();
        return this.c.hashCode() + ((hashCode + (this.a * 31)) * 31);
    }
}

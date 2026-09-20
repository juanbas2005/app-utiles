package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: iy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iy0 implements ba5 {
    public final List a;
    public final String b;

    public iy0(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        dt0.g1(list).size();
    }

    public final boolean a(up2 up2) {
        up2.getClass();
        List<ba5> list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        for (ba5 j : list) {
            if (!aa5.j(j, up2)) {
                return false;
            }
        }
        return true;
    }

    public final void b(up2 up2, ArrayList arrayList) {
        up2.getClass();
        for (ba5 ba5 : this.a) {
            ba5.getClass();
            up2.getClass();
            ba5.b(up2, arrayList);
        }
    }

    public final String toString() {
        return this.b;
    }

    public final Collection x(up2 up2, vr2 vr2) {
        up2.getClass();
        HashSet hashSet = new HashSet();
        for (ba5 x : this.a) {
            hashSet.addAll(x.x(up2, vr2));
        }
        return hashSet;
    }
}

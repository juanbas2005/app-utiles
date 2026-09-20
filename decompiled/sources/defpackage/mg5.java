package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mg5 {
    public static final ArrayList e = new ArrayList();
    public final zk2 a;
    public final z85 b;
    public List c;
    public boolean d;

    public mg5(zk2 zk2, z85 z85) {
        zk2.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        if (!(arrayList instanceof ar3) || (arrayList instanceof cr3)) {
            this.a = zk2;
            this.b = z85;
            this.c = arrayList;
            this.d = true;
            if (!arrayList.isEmpty()) {
                h.s("The shared empty array list has been modified");
                throw null;
            }
            return;
        }
        mp7.l0("kotlin.collections.MutableList", arrayList);
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.a.x + "`, " + this.c.size() + " handlers";
    }
}

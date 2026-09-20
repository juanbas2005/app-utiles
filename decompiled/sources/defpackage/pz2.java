package defpackage;

import java.util.ArrayList;

/* renamed from: pz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pz2 extends g31 {
    public g31[] p0 = new g31[4];
    public int q0 = 0;

    public final void M(int i, g98 g98, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            g31 g31 = this.p0[i2];
            ArrayList arrayList2 = g98.a;
            if (!arrayList2.contains(g31)) {
                arrayList2.add(g31);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            su0.n(this.p0[i3], i, arrayList, g98);
        }
    }

    public void N() {
    }
}

package defpackage;

import java.util.Set;

/* renamed from: af5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class af5 implements v36 {
    public final Set w;
    public final eq4 x = new eq4(new cu2[16]);

    public af5(Set set) {
        this.w = set;
    }

    public final void c() {
        eq4 eq4 = this.x;
        Object[] objArr = eq4.w;
        int i = eq4.y;
        for (int i2 = 0; i2 < i; i2++) {
            v36 v36 = ((cu2) objArr[i2]).a;
            this.w.remove(v36);
            v36.c();
        }
    }

    public final void a() {
    }

    public final void b() {
    }
}

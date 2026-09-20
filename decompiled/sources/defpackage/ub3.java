package defpackage;

import java.util.Arrays;

/* renamed from: ub3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ub3 extends ik5 {
    public final boolean l = true;

    public ub3(String str, av2 av2) {
        super(str, av2, 1);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ub3) {
            ll6 ll6 = (ll6) obj;
            if (this.a.equals(ll6.a())) {
                ub3 ub3 = (ub3) obj;
                if (ub3.l && Arrays.equals((ll6[]) this.j.getValue(), (ll6[]) ub3.j.getValue()) && (i = this.c) == ll6.e()) {
                    int i2 = 0;
                    while (i2 < i) {
                        if (sg3.e(h(i2).a(), ll6.h(i2).a()) && sg3.e(h(i2).u(), ll6.h(i2).u())) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode() * 31;
    }

    public final boolean j() {
        return this.l;
    }
}

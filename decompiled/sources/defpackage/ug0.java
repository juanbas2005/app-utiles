package defpackage;

/* renamed from: ug0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ug0 implements og0 {
    public final boolean a;
    public final String b;

    public ug0(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean a(jc6 jc6) {
        int i;
        boolean z = this.a;
        String str = this.b;
        if (z && str == null) {
            str = jc6.o();
        }
        hc6 hc6 = jc6.b;
        if (hc6 != null) {
            i = 0;
            for (lc6 lc6 : hc6.a()) {
                jc6 jc62 = (jc6) lc6;
                if (str == null || jc62.o().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (this.a) {
            return f21.h("only-of-type <", this.b, ">");
        }
        return "only-child";
    }
}

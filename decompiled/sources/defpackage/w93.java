package defpackage;

/* renamed from: w93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w93 implements xx5 {
    public final ql4 w;

    public w93(ql4 ql4) {
        this.w = ql4;
    }

    public final vw3 b() {
        fu6 g0 = this.w.g0();
        g0.getClass();
        return g0;
    }

    public final boolean equals(Object obj) {
        w93 w93;
        ql4 ql4 = null;
        if (obj instanceof w93) {
            w93 = (w93) obj;
        } else {
            w93 = null;
        }
        if (w93 != null) {
            ql4 = w93.w;
        }
        return this.w.equals(ql4);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        fu6 g0 = this.w.g0();
        g0.getClass();
        sb.append(g0);
        sb.append('}');
        return sb.toString();
    }
}

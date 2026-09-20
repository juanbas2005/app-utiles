package defpackage;

/* renamed from: l61  reason: default package */
public final class l61 implements gs2 {
    public final ClassLoader w;
    public final vp7 x;
    public final sr2 y;
    public final h06 z;

    public l61(ClassLoader classLoader, vp7 vp7, sr2 sr2, h06 h06) {
        this.w = classLoader;
        this.x = vp7;
        this.y = sr2;
        this.z = h06;
    }

    public final Object H(Object obj, Object obj2) {
        c2 c2Var;
        m61 m61;
        int intValue = ((Number) obj).intValue();
        xu3 xu3 = (xu3) obj2;
        xu3.getClass();
        if (xu3.equals(xu3.c)) {
            return gs3.c;
        }
        uu3 uu3 = xu3.b;
        ks3 ks3 = null;
        if (uu3 != null) {
            if (this.y == null) {
                m61 = null;
            } else {
                m61 = new m61(intValue, 0, new k3(8, this.z));
            }
            c2Var = pd8.L(uu3, this.w, this.x, true, m61);
        } else {
            c2Var = null;
        }
        zu3 zu3 = xu3.a;
        if (zu3 != null) {
            ks3 = pd8.N(zu3);
        }
        return new gs3(c2Var, ks3);
    }
}

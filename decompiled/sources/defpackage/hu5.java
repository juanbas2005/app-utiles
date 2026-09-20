package defpackage;

/* renamed from: hu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hu5 {
    public final j44 a;

    public hu5(sr2 sr2) {
        this.a = new j44(sr2);
    }

    public abstract ju5 a(Object obj);

    public c28 b() {
        return this.a;
    }

    public final ju5 c(vr2 vr2) {
        return new ju5(this, (Object) null, false, (ux6) null, vr2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: zy0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: b12} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: w37} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: b12} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: b12} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r2 == r1) goto L_0x0034;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final c28 d(ju5 ju5, c28 c28) {
        b12 b12;
        b12 b122 = null;
        if (!(c28 instanceof b12)) {
            if (c28 instanceof w37) {
                if ((ju5.b || ju5.f != null) && !ju5.e) {
                    w37 w37 = (w37) c28;
                    boolean e = sg3.e(ju5.a(), w37.a);
                    b12 = w37;
                }
            } else if (c28 instanceof zy0) {
                vr2 vr2 = ju5.d;
                zy0 zy0 = (zy0) c28;
                vr2 vr22 = zy0.a;
                b12 = zy0;
            }
            b122 = b12;
        } else if (ju5.e) {
            b122 = (b12) c28;
            b122.a.setValue(ju5.a());
        }
        if (b122 != null) {
            return b122;
        }
        if (ju5.e) {
            Object obj = ju5.f;
            ux6 ux6 = ju5.c;
            if (ux6 == null) {
                ux6 = g22.K;
            }
            return new b12(new ed5(obj, ux6));
        }
        vr2 vr23 = ju5.d;
        if (vr23 != null) {
            return new zy0(vr23);
        }
        return new w37(ju5.a());
    }
}

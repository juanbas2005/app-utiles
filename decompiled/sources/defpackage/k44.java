package defpackage;

/* renamed from: k44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k44 implements w98 {
    public sr2 a;
    public ed5 b;
    public final ed5 c = u55.p(Boolean.FALSE);

    public final long a() {
        lq1 lq1;
        if (this.b == null) {
            sr2 sr2 = this.a;
            if (sr2 == null || (lq1 = (lq1) sr2.b()) == null) {
                lq1 = lq1.c;
            }
            this.b = u55.p(lq1);
            this.a = null;
        }
        ed5 ed5 = this.b;
        ed5.getClass();
        return ((lq1) ed5.getValue()).a;
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}

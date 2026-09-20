package defpackage;

/* renamed from: tr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tr6 {
    public final ed5 a;
    public final ed5 b;
    public final wz0 c = new wz0(4);
    public final long d = wl4.a();
    public long e = jt0.f;
    public float f = 1.0f;
    public float g = 1.0f;
    public long h = ql7.b;
    public long i = 0;
    public z38 j;

    public tr6() {
        Boolean bool = Boolean.FALSE;
        this.a = u55.p(bool);
        this.b = u55.p(bool);
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        ed5 ed5 = this.a;
        boolean booleanValue = ((Boolean) ed5.getValue()).booleanValue();
        ed5 ed52 = this.b;
        if (booleanValue && !z) {
            ed52.setValue(Boolean.TRUE);
        } else if (z) {
            ed52.setValue(Boolean.FALSE);
        }
        ed5.setValue(Boolean.valueOf(z));
    }
}

package defpackage;

/* renamed from: sz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz4 {
    public ll4 a;
    public int b;
    public eq4 c;
    public eq4 d;
    public boolean e;
    public final /* synthetic */ o00 f;

    public sz4(o00 o00, ll4 ll4, int i, eq4 eq4, eq4 eq42, boolean z) {
        this.f = o00;
        this.a = ll4;
        this.b = i;
        this.c = eq4;
        this.d = eq42;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        eq4 eq4 = this.c;
        int i3 = this.b;
        kl4 kl4 = (kl4) eq4.w[i + i3];
        kl4 kl42 = (kl4) this.d.w[i3 + i2];
        if (!sg3.e(kl4, kl42) && kl4.getClass() != kl42.getClass()) {
            return false;
        }
        return true;
    }
}

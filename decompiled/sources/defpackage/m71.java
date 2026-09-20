package defpackage;

/* renamed from: m71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m71 implements vr2 {
    public final /* synthetic */ hf7 A;
    public final /* synthetic */ c93 B;
    public final /* synthetic */ v35 C;
    public final /* synthetic */ ze7 D;
    public final /* synthetic */ o81 E;
    public final /* synthetic */ yb0 F;
    public final /* synthetic */ u44 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ rf7 z;

    public /* synthetic */ m71(u44 u44, boolean z2, boolean z3, rf7 rf7, hf7 hf7, c93 c93, v35 v35, ze7 ze7, o81 o81, yb0 yb0) {
        this.w = u44;
        this.x = z2;
        this.y = z3;
        this.z = rf7;
        this.A = hf7;
        this.B = c93;
        this.C = v35;
        this.D = ze7;
        this.E = o81;
        this.F = yb0;
    }

    public final Object y(Object obj) {
        cg7 d;
        sk2 sk2 = (sk2) obj;
        u44 u44 = this.w;
        boolean b = u44.b();
        boolean a = sk2.a();
        vs7 vs7 = vs7.a;
        if (b != a) {
            u44.f.setValue(Boolean.valueOf(sk2.a()));
            boolean b2 = u44.b();
            hf7 hf7 = this.A;
            v35 v35 = this.C;
            if (!b2 || !this.x || this.y) {
                pv8.C(u44);
            } else {
                pv8.N(this.z, u44, hf7, this.B, v35);
            }
            if (sk2.a() && (d = u44.d()) != null) {
                ar7.H(this.E, (e81) null, (r81) null, new w6(this.F, hf7, u44, d, v35, (f61) null, 5), 3);
            }
            if (!sk2.a()) {
                this.D.g((l35) null);
            }
        }
        return vs7;
    }
}

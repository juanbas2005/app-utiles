package defpackage;

/* renamed from: k33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k33 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ k33(p33 p33, int i, sc0 sc0, int i2, boolean z2) {
        this.z = p33;
        this.x = i;
        this.A = sc0;
        this.y = i2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final Object b() {
        switch (this.w) {
            case b85.b:
                p33 p33 = (p33) this.z;
                int i = this.x;
                sc0 sc0 = (sc0) this.A;
                int i2 = this.y;
                p33.G.getClass();
                sc0.skip((long) i2);
                p33.S.B(i, k62.D);
                synchronized (p33) {
                    p33.U.remove(Integer.valueOf(i));
                }
                return vs7.a;
            default:
                int i3 = this.x;
                int i4 = this.y;
                return "Expected " + ((ih5) this.z).a + " but got " + ((CharSequence) this.A).subSequence(i3, i4 + i3 + 1).toString();
        }
    }

    public /* synthetic */ k33(ih5 ih5, CharSequence charSequence, int i, int i2) {
        this.z = ih5;
        this.A = charSequence;
        this.x = i;
        this.y = i2;
    }
}

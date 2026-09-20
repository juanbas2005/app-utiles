package defpackage;

/* renamed from: jp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jp1 implements sr2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ kp1 x;

    public /* synthetic */ jp1(kp1 kp1) {
        this.x = kp1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: l86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: h86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: j86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: f86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: f86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: f86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: j86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: j86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: h86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: h86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: l86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: l86} */
    /* JADX WARNING: type inference failed for: r0v7, types: [e86, wo1, vo1] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        l86 l86;
        h86 h86;
        j86 j86;
        f86 f86;
        int i = this.w;
        kp1 kp1 = this.x;
        switch (i) {
            case b85.b:
                y76 y76 = (y76) h49.w(kp1, d86.b);
                e86 e86 = kp1.U;
                if (y76 == null) {
                    if (e86 != null) {
                        kp1.W0(e86);
                    }
                    kp1.U = null;
                } else if (e86 == null) {
                    ns8 ns8 = new ns8(18, (Object) kp1);
                    jp1 jp1 = new jp1(kp1, new wv2(14, kp1), new f96(17, (Object) kp1));
                    ef3 ef3 = kp1.M;
                    boolean z = kp1.N;
                    float f = kp1.O;
                    jo7 jo7 = c86.a;
                    ? wo1 = new wo1();
                    wo1.V0(new ai(ef3, z, f, ns8, jp1));
                    kp1.V0(wo1);
                    kp1.U = wo1;
                }
                return vs7.a;
            default:
                um4 um4 = ((zg4) h49.w(kp1, ch4.b)).d;
                q86 q86 = (q86) h49.w(kp1, d86.a);
                y76 y762 = (y76) h49.w(kp1, d86.b);
                if (kp1.Q) {
                    l86 = new Object();
                } else {
                    l86 = l86.d;
                }
                if (kp1.R) {
                    p86 p86 = q86.a;
                    h86 = new Object();
                } else {
                    h86 = h86.g;
                }
                if (kp1.S) {
                    j86 = new Object();
                } else {
                    j86 = j86.d;
                }
                if (kp1.T) {
                    f86 = new Object();
                } else {
                    f86 = f86.f;
                }
                return new n86(l86, h86, j86, f86);
        }
    }

    public /* synthetic */ jp1(kp1 kp1, wv2 wv2, f96 f96) {
        this.x = kp1;
    }
}

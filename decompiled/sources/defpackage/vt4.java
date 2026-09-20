package defpackage;

/* renamed from: vt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vt4 implements vr2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ vr2 B;
    public final /* synthetic */ vr2 C;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ eg6 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ gs2 z;

    public /* synthetic */ vt4(boolean z2, eg6 eg6, int i, gs2 gs2, boolean z3, vr2 vr2, vr2 vr22) {
        this.w = z2;
        this.x = eg6;
        this.y = i;
        this.z = gs2;
        this.A = z3;
        this.B = vr2;
        this.C = vr22;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [vr2] */
    /* JADX WARNING: type inference failed for: r0v6, types: [vr2] */
    /* JADX WARNING: type inference failed for: r0v11, types: [gs2] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object y(Object obj) {
        k51 k51;
        k51 k512;
        k51 k513;
        gk gkVar = (gk) obj;
        ? r0 = 0;
        boolean z2 = this.w;
        eg6 eg6 = this.x;
        if (z2) {
            Object obj2 = eg6.a().get(td0.H.toString());
            if (obj2 == null) {
                obj2 = null;
            }
            if (mp7.a0(2, obj2)) {
                r0 = (gs2) obj2;
            }
            int i = this.y;
            if (r0 != 0 && (k513 = (k51) r0.H(gkVar, Integer.valueOf(i))) != null) {
                return k513;
            }
            return (k51) this.z.H(gkVar, Integer.valueOf(i));
        } else if (this.A) {
            Object obj3 = eg6.a().get(me6.G.toString());
            if (obj3 == null) {
                obj3 = null;
            }
            if (mp7.a0(1, obj3)) {
                r0 = (vr2) obj3;
            }
            if (r0 == 0 || (k512 = (k51) r0.y(gkVar)) == null) {
                return (k51) this.B.y(gkVar);
            }
            return k512;
        } else {
            Object obj4 = eg6.a().get(g22.E.toString());
            if (obj4 == null) {
                obj4 = null;
            }
            if (mp7.a0(1, obj4)) {
                r0 = (vr2) obj4;
            }
            if (r0 == 0 || (k51 = (k51) r0.y(gkVar)) == null) {
                return (k51) this.C.y(gkVar);
            }
            return k51;
        }
    }
}

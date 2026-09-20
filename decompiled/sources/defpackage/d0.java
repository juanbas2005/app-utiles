package defpackage;

/* renamed from: d0  reason: default package */
public final class d0 implements sr2 {
    public final int A;
    public final kd6 w;
    public final st5 x;
    public final k2 y;
    public final int z;

    public d0(kd6 kd6, st5 st5, k2 k2Var, int i, int i2) {
        this.w = kd6;
        this.x = st5;
        this.y = k2Var;
        this.z = i;
        this.A = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r1 & 64) == 64) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if ((r1 & 64) == 64) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r1.i != false) goto L_0x0036;
     */
    public final Object b() {
        int i;
        k2 k2Var = this.y;
        boolean z2 = k2Var instanceof js5;
        int i2 = 0;
        if (z2) {
            i = ((js5) k2Var).K.size();
        } else if (k2Var instanceof qs5) {
            i = ((qs5) k2Var).K.size();
        } else {
            i = 0;
        }
        st5 st5 = this.x;
        if (z2) {
            int i3 = ((js5) k2Var).y;
            if ((i3 & 32) != 32) {
            }
        } else if (k2Var instanceof qs5) {
            int i4 = ((qs5) k2Var).y;
            if ((i4 & 32) != 32) {
            }
        } else if (k2Var instanceof wr5) {
            qt5 qt5 = (qt5) st5;
            if (qt5.h == sr5.z) {
                i2 = 2;
            }
            return this.w.j0(st5, k2Var, this.z, i + i2 + this.A);
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + k2Var.getClass());
        }
        i2 = 1;
        return this.w.j0(st5, k2Var, this.z, i + i2 + this.A);
    }
}

package defpackage;

/* renamed from: fy0  reason: default package */
public final class fy0 implements vr2 {
    public final /* synthetic */ int w;
    public final up2 x;

    public /* synthetic */ fy0(up2 up2, int i) {
        this.w = i;
        this.x = up2;
    }

    public final Object y(Object obj) {
        boolean z;
        int i = this.w;
        up2 up2 = this.x;
        switch (i) {
            case b85.b:
                rm rmVar = (rm) obj;
                rmVar.getClass();
                return rmVar.m(up2);
            default:
                up2 up22 = (up2) obj;
                up22.getClass();
                if (up22.a.c() || !up22.b().equals(up2)) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

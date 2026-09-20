package defpackage;

/* renamed from: fw3  reason: default package */
public final class fw3 implements sr2 {
    public final /* synthetic */ int w;
    public final qw3 x;

    public /* synthetic */ fw3(qw3 qw3, int i) {
        this.w = i;
        this.x = qw3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: vp7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [sr2] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        oq3 oq3;
        int i = this.w;
        ? r1 = 0;
        qw3 qw3 = this.x;
        switch (i) {
            case b85.b:
                qw3 qw32 = this.x;
                su3 su3 = qw32.A;
                return ag8.l(qw32, su3.h, su3.f, a42.w, (vp7) qw32.E.getValue(), true);
            case 1:
                qw3 qw33 = this.x;
                if (!r16.Z(qw33)) {
                    return qw33.a();
                }
                su3 su32 = qw33.A;
                return ag8.l(qw33, su32.h, su32.f, a42.w, (vp7) qw33.E.getValue(), false);
            case 2:
                uu3 uu3 = qw3.A.j;
                if (uu3 != null) {
                    ClassLoader d = m06.d(qw3.x.b());
                    vp7 vp7 = (vp7) qw3.E.getValue();
                    if (!jb5.v(qw3)) {
                        r1 = new fw3(qw3, 5);
                    }
                    return pd8.M(uu3, d, vp7, r1, 4);
                }
                sg3.a0("returnType");
                throw null;
            case 3:
                yq3 yq3 = qw3.x;
                if (yq3 instanceof oq3) {
                    oq3 = (oq3) yq3;
                } else {
                    oq3 = null;
                }
                if (oq3 != null) {
                    r1 = ((kq3) oq3.y.getValue()).d();
                }
                vp7 vp72 = vp7.d;
                return aa5.f(qw3.A.e, r1, qw3, m06.d(yq3.b()));
            case 4:
                boolean v = jb5.v(qw3);
                su3 su33 = qw3.A;
                if (v) {
                    return null;
                }
                yq3 yq32 = qw3.x;
                su33.getClass();
                fo3 fo3 = tf4.z(su33).b;
                if (fo3 == null) {
                    return null;
                }
                if (yq32 instanceof pr3) {
                    try {
                        return ((pr3) yq32).x.getDeclaredField(fo3.C);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("javaField is only supported for top-level properties for now: ");
                    sb.append(yq32);
                    rf2.n(sb, su33.b, qw3.y);
                    return null;
                }
            default:
                return qw3.n().k();
        }
    }
}

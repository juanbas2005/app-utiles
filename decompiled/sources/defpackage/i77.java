package defpackage;

/* renamed from: i77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class i77 extends n77 {
    public final vr2 a;
    public final gs2 b;
    public final n77 c;

    public i77(vr2 vr2, gs2 gs2, n77 n77) {
        n77.getClass();
        this.a = vr2;
        this.b = gs2;
        this.c = n77;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r9 == r5) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r9 == r5) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static Object c(i77 i77, String str, vr2 vr2, h61 h61) {
        h77 h77;
        int i;
        int i2;
        gs2 gs2;
        if (h61 instanceof h77) {
            h77 = (h77) h61;
            int i3 = h77.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h77.C = i3 - Integer.MIN_VALUE;
                Object obj = h77.A;
                i = h77.C;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    n77 n77 = i77.c;
                    h77.z = i77;
                    h77.C = 1;
                    obj = n77.a(str, vr2, h77);
                } else if (i == 1) {
                    i77 = h77.z;
                    o85.q(obj);
                } else if (i != 2) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    o85.q(obj);
                    throw ((Throwable) obj);
                }
                yl1 yl1 = (yl1) obj;
                w63 e = yl1.e();
                e.getClass();
                i2 = e.w;
                if ((200 <= i2 && i2 < 300) || (gs2 = i77.b) == null) {
                    return obj;
                }
                h77.z = null;
                h77.C = 2;
                obj = gs2.H(yl1, h77);
            }
        }
        h77 = new h77(i77, h61);
        Object obj2 = h77.A;
        i = h77.C;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        yl1 yl12 = (yl1) obj2;
        w63 e2 = yl12.e();
        e2.getClass();
        i2 = e2.w;
        if ((200 <= i2 || i2 < 300) && (gs2 = i77.b) == null) {
        }
    }

    public final Object a(String str, vr2 vr2, h61 h61) {
        return b((String) this.a.y(str), vr2, h61);
    }

    public Object b(String str, vr2 vr2, h61 h61) {
        return c(this, str, vr2, h61);
    }
}

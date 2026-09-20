package defpackage;

/* renamed from: j30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j30 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ j30(boolean z, sr2 sr2) {
        this.w = 2;
        this.x = z;
        this.y = sr2;
    }

    public final Object y(Object obj) {
        float f;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                ax0 ax0 = (ax0) obj2;
                ((g30) ax0.a).e(z);
                ((f30) ax0.b).i(z);
                return new l30((a64) obj, ax0, 0);
            case 1:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte byteValue = b.byteValue();
                if (ss0.a.contains(b) || ss0.d.contains(b)) {
                    sb.append((char) byteValue);
                } else if (!z || byteValue != 32) {
                    sb.append(ss0.g(byteValue));
                } else {
                    sb.append('+');
                }
                return vs7;
            case 2:
                sr2 sr2 = (sr2) obj2;
                l76 l76 = (l76) obj;
                if (z) {
                    f = 1.0f;
                } else {
                    f = ((Number) sr2.b()).floatValue();
                }
                l76.c(f);
                return vs7;
            default:
                mx0 mx0 = (mx0) obj2;
                mx0.s(z);
                return new l30((a64) obj, mx0, 1);
        }
    }

    public /* synthetic */ j30(int i, Object obj, boolean z) {
        this.w = i;
        this.y = obj;
        this.x = z;
    }
}

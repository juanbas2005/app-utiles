package defpackage;

/* renamed from: m24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m24 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ob5 x;

    public /* synthetic */ m24(ob5 ob5, int i) {
        this.w = i;
        this.x = ob5;
    }

    public final Object b() {
        int n;
        int i;
        int i2;
        int i3 = this.w;
        ob5 ob5 = this.x;
        switch (i3) {
            case b85.b:
                n = ob5.n();
                break;
            case 1:
                n = ob5.n();
                break;
            case 2:
                if (ob5.k.a()) {
                    i = ob5.r.d();
                } else {
                    i = ob5.k();
                }
                return Integer.valueOf(i);
            case 3:
                boolean a = ob5.k.a();
                bd5 bd5 = ob5.q;
                if (!a) {
                    i2 = ob5.k();
                } else if (bd5.d() != -1) {
                    i2 = bd5.d();
                } else {
                    float abs = Math.abs(ob5.l());
                    tp1 tp1 = ob5.n;
                    qb5 qb5 = rb5.a;
                    if (abs >= Math.abs(Math.min(tp1.e0(56.0f), ((float) ob5.o()) / 2.0f) / ((float) ob5.o()))) {
                        boolean booleanValue = ((Boolean) ob5.E.getValue()).booleanValue();
                        int i4 = ob5.e;
                        if (booleanValue) {
                            i2 = i4 + 1;
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = ob5.k();
                    }
                }
                n = ob5.j(i2);
                break;
            case 4:
                n = ob5.n();
                break;
            default:
                n = ob5.k();
                break;
        }
        return Integer.valueOf(n);
    }
}

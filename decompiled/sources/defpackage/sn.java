package defpackage;

/* renamed from: sn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sn implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;

    public /* synthetic */ sn(int i, sr2 sr2) {
        this.w = i;
        this.x = sr2;
    }

    public final Object y(Object obj) {
        float f;
        int i = this.w;
        vs7 vs7 = vs7.a;
        sr2 sr2 = this.x;
        switch (i) {
            case b85.b:
                ((l76) obj).c(((Number) sr2.b()).floatValue());
                return vs7;
            case 1:
                qk5 qk5 = (qk5) obj;
                sr2.b();
                return vs7;
            case 2:
                l76 l76 = (l76) obj;
                if (l76.M != 2) {
                    l76.w |= 32768;
                    l76.M = 2;
                }
                l76.c(((Number) sr2.b()).floatValue());
                return vs7;
            case 3:
                ok6 ok6 = (ok6) obj;
                Object b = sr2.b();
                if (Float.isNaN(((Number) b).floatValue())) {
                    b = null;
                }
                Float f2 = (Float) b;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.0f;
                }
                mq5 mq5 = new mq5(f, new ms0(1.0f));
                yr3[] yr3Arr = mk6.a;
                nk6 nk6 = jk6.c;
                yr3 yr3 = mk6.a[1];
                ok6.f(nk6, mq5);
                return vs7;
            case 4:
                ((ua6) obj).getClass();
                return sr2.b();
            case 5:
                l35 l35 = (l35) obj;
                sr2.b();
                return vs7;
            case 6:
                obj.getClass();
                return sr2.b();
            default:
                tp1 tp1 = (tp1) obj;
                return (l35) sr2.b();
        }
    }
}

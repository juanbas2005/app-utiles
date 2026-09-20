package defpackage;

/* renamed from: wc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wc implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ bd x;

    public /* synthetic */ wc(bd bdVar, int i) {
        this.w = i;
        this.x = bdVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r4 > 0.999999f) goto L_0x005d;
     */
    public final Object b() {
        float f;
        int i = this.w;
        bd bdVar = this.x;
        switch (i) {
            case b85.b:
                Object value = bdVar.l.getValue();
                if (value != null) {
                    return value;
                }
                float d = bdVar.j.d();
                ed5 ed5 = bdVar.g;
                if (Float.isNaN(d)) {
                    return ed5.getValue();
                }
                float c = bdVar.b().c(ed5.getValue());
                if (Float.isNaN(c) || d == c) {
                    return ed5.getValue();
                }
                Object a = bdVar.b().a(d);
                if (a == null) {
                    return ed5.getValue();
                }
                return a;
            case 1:
                float c2 = bdVar.b().c(bdVar.h.getValue());
                float c3 = bdVar.b().c(bdVar.i.getValue()) - c2;
                float abs = Math.abs(c3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (bdVar.e() - c2) / c3;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 2:
                return bdVar.b();
            default:
                return new yb5(bdVar.b(), bdVar.i.getValue());
        }
    }
}

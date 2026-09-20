package defpackage;

/* renamed from: zi5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zi5 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ dj5 x;

    public /* synthetic */ zi5(dj5 dj5, int i) {
        this.w = i;
        this.x = dj5;
    }

    public final Object k(Object obj, f61 f61) {
        Object value;
        int i = this.w;
        vs7 vs7 = vs7.a;
        dj5 dj5 = this.x;
        switch (i) {
            case b85.b:
                dj5.g = ((zn6) obj).f;
                return vs7;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                d37 d37 = dj5.e;
                do {
                    value = d37.getValue();
                    ((oi5) ((is7) value).a).getClass();
                } while (!d37.i(value, new is7(6, new oi5(booleanValue))));
                return vs7;
        }
    }
}

package defpackage;

/* renamed from: xm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xm6 implements cb2 {
    public final /* synthetic */ int a;
    public final ku5 b;
    public final ku5 c;

    public /* synthetic */ xm6(ku5 ku5, ku5 ku52, int i) {
        this.a = i;
        this.b = ku5;
        this.c = ku52;
    }

    public final Object get() {
        int i = this.a;
        ku5 ku5 = this.c;
        ku5 ku52 = this.b;
        switch (i) {
            case b85.b:
                return new wm6((mi7) ku52.get(), (q18) ku5.get());
            default:
                return new rn6((qo6) ku52.get(), (qo6) ku5.get());
        }
    }
}

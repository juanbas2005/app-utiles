package defpackage;

/* renamed from: wa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wa5 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ob5 x;
    public final /* synthetic */ o81 y;

    public /* synthetic */ wa5(ob5 ob5, o81 o81, int i) {
        this.w = i;
        this.x = ob5;
        this.y = o81;
    }

    public final Object b() {
        int i = this.w;
        o81 o81 = this.y;
        ob5 ob5 = this.x;
        boolean z = false;
        switch (i) {
            case b85.b:
                if (ob5.b()) {
                    ar7.H(o81, (e81) null, (r81) null, new xa5(ob5, (f61) null, 0), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (ob5.c()) {
                    ar7.H(o81, (e81) null, (r81) null, new xa5(ob5, (f61) null, 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (ob5.b()) {
                    ar7.H(o81, (e81) null, (r81) null, new xa5(ob5, (f61) null, 0), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (ob5.c()) {
                    ar7.H(o81, (e81) null, (r81) null, new xa5(ob5, (f61) null, 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

package defpackage;

/* renamed from: ks1  reason: default package */
public final class ks1 implements sr2 {
    public final /* synthetic */ int w;
    public final ms1 x;
    public final fv3 y;

    public /* synthetic */ ks1(ms1 ms1, fv3 fv3, int i) {
        this.w = i;
        this.x = ms1;
        this.y = fv3;
    }

    public final Object b() {
        int i = this.w;
        fv3 fv3 = this.y;
        ms1 ms1 = this.x;
        switch (i) {
            case b85.b:
                return d57.g1(ms1.a.o().b(fv3.j(m27.C), ms1), "Collection");
            default:
                return d57.g1(ms1.a.o().b(fv3.k("Array"), ms1), "Array");
        }
    }
}

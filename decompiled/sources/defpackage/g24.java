package defpackage;

/* renamed from: g24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g24 {
    public final oe6 a;
    public final vo2 b;
    public final tp4 c = new tp4();

    public g24(oe6 oe6, vo2 vo2) {
        this.a = oe6;
        this.b = vo2;
        long[] jArr = bg6.a;
    }

    public final gs2 a(int i, Object obj, Object obj2) {
        tp4 tp4 = this.c;
        f24 f24 = (f24) tp4.g(obj);
        if (f24 == null || f24.c != i || !sg3.e(f24.b, obj2)) {
            f24 f242 = new f24(this, i, obj, obj2);
            tp4.m(obj, f242);
            fw0 fw0 = f242.d;
            if (fw0 != null) {
                return fw0;
            }
            fw0 fw02 = new fw0(818252804, new p13(22, (Object) this, (Object) f242), true);
            f242.d = fw02;
            return fw02;
        }
        fw0 fw03 = f24.d;
        if (fw03 != null) {
            return fw03;
        }
        fw0 fw04 = new fw0(818252804, new p13(22, (Object) f24.e, (Object) f24), true);
        f24.d = fw04;
        return fw04;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        f24 f24 = (f24) this.c.g(obj);
        if (f24 != null) {
            return f24.b;
        }
        h24 h24 = (h24) this.b.b();
        int e = h24.e(obj);
        if (e != -1) {
            return h24.c(e);
        }
        return null;
    }
}

package defpackage;

/* renamed from: wv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wv5 {
    public static final p2 a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: pb2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: pb2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: pb2} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        pb2 pb2;
        Integer num = uh3.a;
        if (num == null || num.intValue() >= 34) {
            pb2 = new Object();
        } else {
            pb2 = new pb2();
        }
        a = pb2;
    }

    public abstract int a();

    public int b() {
        int a2;
        int i;
        do {
            a2 = a() >>> 1;
            i = a2 % 198;
        } while ((a2 - i) + 197 < 0);
        return 3 + i;
    }

    public abstract long c();

    public long d() {
        return e();
    }

    public long e() {
        long c;
        long j;
        do {
            c = c() >>> 1;
            j = c % 1000;
        } while ((c - j) + 999 < 0);
        return j;
    }
}

package defpackage;

/* renamed from: u58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u58 {
    public static final hr2 a = new hr2(11);

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    public static final ls0 a(r58 r58) {
        ls0 ls0;
        r58.getClass();
        synchronized (a) {
            ls0 = (ls0) r58.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (ls0 == null) {
                e81 e81 = x32.w;
                dn1 dn1 = aw1.a;
                e81 = pe4.a.B;
                ls0 ls02 = new ls0(e81.X(b85.d()));
                r58.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", ls02);
                ls0 = ls02;
            }
        }
        return ls0;
    }
}

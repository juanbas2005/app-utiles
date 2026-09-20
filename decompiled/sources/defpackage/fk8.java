package defpackage;

/* renamed from: fk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fk8 {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final hk8 b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: hk8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: hk8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: hk8} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        hk8 hk8;
        int i = 0;
        while (true) {
            if (i >= 2) {
                hk8 = new Object();
                break;
            }
            hk8 hk82 = null;
            try {
                hk82 = (hk8) Class.forName(a[i]).asSubclass(hk8.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused) {
            }
            if (hk82 != null) {
                hk8 = hk82;
                break;
            }
            i++;
        }
        b = hk8;
    }
}

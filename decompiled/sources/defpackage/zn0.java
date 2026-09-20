package defpackage;

/* renamed from: zn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zn0 {
    public static final y25 a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: me0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: me0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: me0} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        boolean z;
        me0 me0;
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        if (z) {
            me0 = new Object();
        } else {
            me0 = new me0(4096, 1);
        }
        a = me0;
    }
}

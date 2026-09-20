package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: xi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xi8 {
    public static final ad9 a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ad9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: ad9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ad9} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        ad9 ad9;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = Arrays.asList(new ad9[0]).iterator();
            if (it.hasNext()) {
                ad9 ad92 = (ad9) it.next();
                if (!it.hasNext()) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    ad9 = ad92;
                } else {
                    throw new IllegalStateException("Expected at most one FlagsService");
                }
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                ad9 = new Object();
            }
            a = ad9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}

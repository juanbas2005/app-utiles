package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ea9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ea9 {
    public static final da9 a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: da9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: da9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: da9} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        da9 da9;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = Arrays.asList(new da9[0]).iterator();
            if (it.hasNext()) {
                da9 da92 = (da9) it.next();
                g75.o("Expected at most one FlagsService", !it.hasNext());
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                da9 = da92;
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                da9 = new Object();
            }
            a = da9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}

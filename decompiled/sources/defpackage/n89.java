package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* renamed from: n89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n89 implements os2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ n89(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object apply(Object obj) {
        switch (this.w) {
            case b85.b:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((w89) this.x).c)), (Throwable) obj);
                return null;
            case 1:
                d79 d79 = (d79) obj;
                lb9 lb9 = f99.a;
                String str = (String) this.x;
                y69 y69 = (y69) d79.t(str, z69.u()).k();
                if (!Collections.unmodifiableList(((z69) y69.x).t()).contains("")) {
                    y69.b();
                    ((z69) y69.x).v("");
                }
                b79 b79 = (b79) d79.k();
                y69.b();
                ((z69) y69.x).w("");
                b79.b();
                ((d79) b79.x).v().put(str, (z69) y69.d());
                return (d79) b79.d();
            default:
                ca9 ca9 = (ca9) this.x;
                w69 w69 = (w69) obj;
                k68 k68 = new k68(27, false);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    synchronized (ca9.j) {
                        Uri uri = ca9.g;
                        k68 k682 = new k68((pk8) w69.t());
                        k682.y = new k68[]{k68};
                        ((ka9) ca9.d.get()).a(uri, k682);
                        ca9.h = w69.t();
                    }
                    synchronized (ca9.k) {
                        Uri uri2 = ca9.i;
                        k68 k683 = new k68((pk8) w69.u());
                        k683.y = new k68[]{k68};
                        ((ka9) ca9.d.get()).a(uri2, k683);
                        w69.u();
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                    return null;
                } catch (IOException e) {
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                }
        }
    }
}

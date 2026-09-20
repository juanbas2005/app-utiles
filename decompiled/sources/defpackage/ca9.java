package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: ca9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ca9 {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final x77 b;
    public final x77 c;
    public final x77 d;
    public final x77 e = n85.k(new rg4(27, (Object) this));
    public final x77 f;
    public final Uri g;
    public volatile p69 h;
    public final Uri i;

    public ca9(Context context, x77 x77, x77 x772, x77 x773) {
        this.a = context;
        this.c = x77;
        this.b = x773;
        this.d = x772;
        Pattern pattern = pa9.a;
        kd6 kd6 = new kd6(context);
        kd6.P0("phenotype_storage_info");
        kd6.Q0("storage-info.pb");
        this.g = kd6.R0();
        kd6 kd62 = new kd6(context);
        kd62.P0("phenotype_storage_info");
        kd62.Q0("device-encrypted-storage-info.pb");
        Set set = pa9.d;
        l55.A(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        kd62.y = "directboot-files";
        this.i = kd62.R0();
        this.f = n85.k(new uy5(21, (Object) x77));
    }

    public final void a() {
        yj2 yj2;
        if (h49.W(this.a) && c().x() + 86400000 < System.currentTimeMillis()) {
            jm4 jm4 = (jm4) this.c.get();
            jm4.getClass();
            ListenableFuture e2 = pt2.e((ListenableFuture) this.f.get());
            int i2 = yj2.D;
            if (e2 instanceof yj2) {
                yj2 = (yj2) e2;
            } else {
                yj2 = new op2(e2);
            }
            pt2.g(yj2, new h89(2, this), jm4);
            return;
        }
        f93 f93 = f93.x;
    }

    public final r99 b() {
        String str;
        p69 c2 = c();
        boolean v = c2.v();
        q93 v2 = q93.v(c2.A());
        vk8 u = c2.u();
        String w = c2.w();
        q93 v3 = q93.v(c2.y());
        q93 v4 = q93.v(c2.z());
        if (!c2.B() || c2.C().u() != ((long) Build.VERSION.SDK_INT)) {
            str = "";
        } else {
            str = c2.C().t();
        }
        return new r99(v, v2, u, w, str, v3, v4, c2.t(), c2.E(), c2.D(), c2.F());
    }

    public final p69 c() {
        p69 p69;
        InputStream x;
        p69 p692 = this.h;
        if (p692 != null) {
            return p692;
        }
        synchronized (j) {
            p69 = this.h;
            if (p69 == null) {
                p69 = p69.H();
                if (h49.W(this.a)) {
                    rm8 rm8 = (rm8) p69.s(7);
                    gl8 gl8 = gl8.a;
                    int i2 = rk8.a;
                    gl8 gl82 = gl8.b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        x = o55.x(((ka9) this.d.get()).b(this.g));
                        nl8 a2 = ((ml8) rm8).a(x, gl82);
                        if (x != null) {
                            x.close();
                        }
                        p69 p693 = (p69) a2;
                        StrictMode.setThreadPolicy(threadPolicy);
                        p69 = p693;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.h = p69;
                }
            }
        }
        return p69;
        throw th;
    }
}

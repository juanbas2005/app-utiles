package defpackage;

import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ta1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ta1 implements ua1, ul7, xv0, i12, g61, c55, e72, e77 {
    public final /* synthetic */ int w;

    public /* synthetic */ ta1(c72 c72) {
        this.w = 13;
    }

    public static /* synthetic */ void e() {
        throw new RuntimeException();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [char, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static /* synthetic */ void f(int r2, int i, String str) {
        throw new IllegalArgumentException("Parse error at char " + i + ": " + (str + r2 + '\''));
    }

    public static /* synthetic */ void g(int i, Object obj) {
        throw new IllegalArgumentException("Parse error at char " + i + ": " + obj);
    }

    public static /* synthetic */ void h(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [char, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static /* synthetic */ void k(int i, int r2, String str) {
        throw new IllegalArgumentException((str + i + r2).toString());
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new FileNotFoundException(str + obj);
    }

    public Object a(JsonReader jsonReader) {
        return va1.a(jsonReader);
    }

    public Object apply(Object obj) {
        switch (this.w) {
            case 3:
                kf1.b.getClass();
                return va1.a.u((ra1) obj).getBytes(Charset.forName("UTF-8"));
            default:
                String u = sm6.b.u((rm6) obj);
                u.getClass();
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = u.getBytes(mo0.a);
                bytes.getClass();
                return bytes;
        }
    }

    public Object c(yb9 yb9) {
        int i;
        switch (this.w) {
            case 18:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public Object d(kd6 kd6) {
        switch (this.w) {
            case 6:
                Set d = kd6.d(av5.a(y00.class));
                wv2 wv2 = wv2.y;
                if (wv2 == null) {
                    synchronized (wv2.class) {
                        try {
                            wv2 = wv2.y;
                            if (wv2 == null) {
                                wv2 = new wv2(0);
                                wv2.y = wv2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return new ho1(d, wv2);
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case h75.g:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 17:
                oz3 oz3 = ExecutorsRegistrar.a;
                return hs7.w;
            case 26:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(kd6);
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(kd6);
        }
    }

    public void j(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public yb9 q(Object obj) {
        vz0 vz0 = (vz0) obj;
        return b35.l((Object) null);
    }

    public /* synthetic */ ta1(int i) {
        this.w = i;
    }

    public float b(float f) {
        return f;
    }
}

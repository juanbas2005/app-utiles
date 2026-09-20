package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: c49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c49 implements Runnable {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public c49(r69 r69, f59 f59) {
        this.w = 5;
        this.x = f59;
        Objects.requireNonNull(r69);
        this.y = r69;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r0v40, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v32, types: [int] */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        InputStream open;
        Throwable th;
        ? r1 = 0;
        switch (this.w) {
            case b85.b:
                v49 v49 = (v49) this.y;
                y19 y19 = (y19) v49.w;
                q09 q09 = y19.A;
                pz8 pz8 = y19.B;
                y19.e(q09);
                q09.b1();
                q09.b1();
                ir8 b = ir8.b(q09.g1().getString("dma_consent_settings", (String) null));
                ir8 ir8 = (ir8) this.x;
                int i = ir8.a;
                if (h39.l(i, b.a)) {
                    SharedPreferences.Editor edit = q09.g1().edit();
                    edit.putString("dma_consent_settings", ir8.b);
                    edit.apply();
                    y19.g(pz8);
                    pz8.J.b("Setting DMA consent(FE)", ir8);
                    y19 y192 = (y19) v49.w;
                    if (y192.j().m1()) {
                        r69 j = y192.j();
                        j.b1();
                        j.d1();
                        j.q1(new k69(j, 1));
                        return;
                    }
                    r69 j2 = y192.j();
                    j2.b1();
                    j2.d1();
                    if (j2.l1()) {
                        j2.q1(new v59(j2, j2.s1(false)));
                        return;
                    }
                    return;
                }
                y19.g(pz8);
                pz8.H.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
                return;
            case 1:
                v49 v492 = ((AppMeasurementDynamiteService) this.y).d.I;
                y19.f(v492);
                k68 k68 = (k68) this.x;
                v492.b1();
                v492.d1();
                k68 k682 = v492.z;
                if (k68 != k682) {
                    if (k682 == null) {
                        r1 = 1;
                    }
                    z65.m("EventInterceptor already set.", r1);
                }
                v492.z = k68;
                return;
            case 2:
                v49 v493 = (v49) this.y;
                v493.b1();
                if (Build.VERSION.SDK_INT >= 30) {
                    q09 q092 = ((y19) v493.w).A;
                    y19.e(q092);
                    SparseArray i1 = q092.i1();
                    for (u79 u79 : (List) this.x) {
                        int i2 = u79.y;
                        if (!i1.contains(i2) || ((Long) i1.get(i2)).longValue() < u79.x) {
                            v493.A1().add(u79);
                        }
                    }
                    v493.B1();
                    return;
                }
                return;
            case 3:
                y19 y193 = (y19) ((v49) this.y).w;
                vy8 l = y193.l();
                String str = (String) this.x;
                String str2 = l.N;
                if (str2 != null && !str2.equals(str)) {
                    r1 = 1;
                }
                l.N = str;
                if (r1 != 0) {
                    y193.l().h1();
                    return;
                }
                return;
            case 4:
                a09 a09 = (a09) this.y;
                synchronized (a09.y) {
                    try {
                        k55 k55 = (k55) a09.z;
                        if (k55 != null) {
                            k55.g(((yb9) this.x).i());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 5:
                r69 r69 = (r69) this.y;
                iy8 iy8 = r69.z;
                y19 y194 = (y19) r69.w;
                if (iy8 == null) {
                    pz8 pz82 = y194.B;
                    y19.g(pz82);
                    pz82.B.a("Failed to send current screen to service");
                    return;
                }
                try {
                    f59 f59 = (f59) this.x;
                    if (f59 == null) {
                        iy8.m(0, (String) null, (String) null, y194.w.getPackageName());
                    } else {
                        iy8.m(f59.c, f59.a, f59.b, y194.w.getPackageName());
                    }
                    r69.p1();
                    return;
                } catch (RemoteException e) {
                    RemoteException remoteException = e;
                    pz8 pz83 = ((y19) r69.w).B;
                    y19.g(pz83);
                    pz83.B.b("Failed to send current screen to the service", remoteException);
                    return;
                }
            case 6:
                ((m69) this.y).y.n1((ComponentName) this.x);
                return;
            case 7:
                r89 r89 = (r89) this.x;
                int i3 = ((ba9) this.y).a;
                synchronized (r89) {
                    try {
                        SparseArray sparseArray = r89.A;
                        ba9 ba9 = (ba9) sparseArray.get(i3);
                        if (ba9 != null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                            sb.append("Timing out request: ");
                            sb.append(i3);
                            Log.w("MessengerIpcClient", sb.toString());
                            sparseArray.remove(i3);
                            ba9.c(new Exception("Timed out waiting for response", (Throwable) null));
                            r89.d();
                        }
                    } catch (Throwable th3) {
                        while (true) {
                            throw th3;
                            break;
                        }
                    }
                }
                return;
            case 8:
                r69 r692 = ((m69) this.y).y;
                r692.z = null;
                if (((m11) this.x).x == 7777) {
                    if (r692.C == null) {
                        r692.C = Executors.newScheduledThreadPool(1);
                    }
                    r692.C.schedule(new ge(28, (Object) this), ((Long) by8.Z.a((Object) null)).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                r692.r1();
                return;
            case 9:
                v89 v89 = (v89) this.x;
                v89.T();
                Runnable runnable = (Runnable) this.y;
                v89.n0().b1();
                if (v89.L == null) {
                    v89.L = new ArrayList();
                }
                v89.L.add(runnable);
                v89.l();
                return;
            case 10:
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((x69) ((Service) ((n49) this.x).x)).c((JobParameters) this.y);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                a09 a092 = (a09) this.y;
                try {
                    yb9 q = ((e77) a092.y).q(((yb9) this.x).i());
                    gv1 gv1 = yb7.b;
                    q.e(gv1, a092);
                    q.d(gv1, a092);
                    q.a(gv1, a092);
                    return;
                } catch (RuntimeExecutionException e2) {
                    RuntimeExecutionException runtimeExecutionException = e2;
                    if (runtimeExecutionException.getCause() instanceof Exception) {
                        a092.j((Exception) runtimeExecutionException.getCause());
                        return;
                    } else {
                        ((yb9) a092.z).o(runtimeExecutionException);
                        return;
                    }
                } catch (CancellationException unused) {
                    a092.f();
                    return;
                } catch (Exception e3) {
                    ((yb9) a092.z).o(e3);
                    return;
                }
            case 12:
                Context context = ((x49) this.x).b;
                n36 n36 = bl2.f;
                if (n36 == null) {
                    synchronized (bl2.e) {
                        try {
                            n36 = bl2.f;
                            if (n36 == null) {
                                ig igVar = new ig(4);
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    int length = list.length;
                                    while (r1 < length) {
                                        String str3 = list[r1];
                                        if (str3.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str3.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str3);
                                                open = assets.open(sb2.toString());
                                                gl8 gl8 = gl8.a;
                                                int i4 = rk8.a;
                                                bl2 bl2 = new bl2(context, e99.v(open, gl8.b));
                                                igVar.k(bl2.b, bl2);
                                                if (open != null) {
                                                    open.close();
                                                }
                                            } catch (zzaeh e4) {
                                                StringBuilder sb3 = new StringBuilder(str3.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str3);
                                                Log.e("PackageInfo", sb3.toString(), e4);
                                            } catch (Throwable th4) {
                                                th.addSuppressed(th4);
                                                break;
                                            }
                                        }
                                        r1++;
                                    }
                                }
                                n36 = igVar.c(true);
                                bl2.f = n36;
                            }
                        } catch (IOException e5) {
                            Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e5);
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                String str4 = (String) this.y;
                if (!n36.containsKey(str4)) {
                    StringBuilder sb4 = new StringBuilder(str4.length() + 173);
                    sb4.append("Config package ");
                    sb4.append(str4);
                    sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                    Log.e("FilePhenotypeFlags", sb4.toString());
                    return;
                }
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                this.x = null;
                this.y = null;
                return;
            default:
                yb9 yb9 = (yb9) this.x;
                try {
                    yb9.m(((Callable) this.y).call());
                    return;
                } catch (Exception e6) {
                    yb9.o(e6);
                    return;
                } catch (Throwable th6) {
                    yb9.o(new RuntimeException(th6));
                    return;
                }
        }
        throw th;
    }

    public /* synthetic */ c49(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj2;
        this.y = obj;
    }

    public /* synthetic */ c49(Object obj, boolean z, Object obj2, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public c49(n49 n49, v89 v89, Runnable runnable) {
        this.w = 9;
        this.x = v89;
        this.y = runnable;
    }

    public /* synthetic */ c49() {
        this.w = 13;
    }
}

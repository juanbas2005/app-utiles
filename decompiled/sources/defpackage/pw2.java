package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pw2 implements Handler.Callback {
    public static final Status K = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (m11) null);
    public static final Status L = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (m11) null);
    public static final Object M = new Object();
    public static pw2 N;
    public final Context A;
    public final lw2 B;
    public final k68 C;
    public final AtomicInteger D;
    public final AtomicInteger E;
    public final ConcurrentHashMap F;
    public final os G;
    public final os H;
    public final ph8 I;
    public volatile boolean J;
    public long w = 10000;
    public boolean x = false;
    public dc7 y;
    public yf3 z;

    /* JADX WARNING: type inference failed for: r2v5, types: [ph8, android.os.Handler] */
    public pw2(Context context, Looper looper) {
        lw2 lw2 = lw2.e;
        boolean z2 = true;
        this.D = new AtomicInteger(1);
        this.E = new AtomicInteger(0);
        this.F = new ConcurrentHashMap(5, 0.75f, 1);
        this.G = new os(0);
        this.H = new os(0);
        this.J = true;
        this.A = context;
        ? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.I = handler;
        this.B = lw2;
        this.C = new k68(8);
        PackageManager packageManager = context.getPackageManager();
        if (sg3.q == null) {
            sg3.q = Boolean.valueOf((!za5.w() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z2);
        }
        if (sg3.q.booleanValue()) {
            this.J = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static void a() {
        synchronized (M) {
            try {
                pw2 pw2 = N;
                if (pw2 != null) {
                    pw2.E.incrementAndGet();
                    ph8 ph8 = pw2.I;
                    ph8.sendMessageAtFrontOfQueue(ph8.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(ln lnVar, m11 m11) {
        String str = (String) lnVar.b.y;
        String valueOf = String.valueOf(m11);
        return new Status(17, pb4.n(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), m11.y, m11);
    }

    public static pw2 e(Context context) {
        pw2 pw2;
        HandlerThread handlerThread;
        synchronized (M) {
            if (N == null) {
                synchronized (g99.g) {
                    try {
                        handlerThread = g99.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            g99.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = g99.i;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = lw2.d;
                N = new pw2(applicationContext, looper);
            }
            pw2 = N;
        }
        return pw2;
    }

    public final ng8 b(kw2 kw2) {
        ln lnVar = kw2.f;
        ConcurrentHashMap concurrentHashMap = this.F;
        ng8 ng8 = (ng8) concurrentHashMap.get(lnVar);
        if (ng8 == null) {
            ng8 = new ng8(this, kw2);
            concurrentHashMap.put(lnVar, ng8);
        }
        if (ng8.e.r()) {
            this.H.add(lnVar);
        }
        ng8.r();
        return ng8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    public final void c(xb7 xb7, int i, kw2 kw2) {
        qg8 qg8;
        pw2 pw2;
        long j;
        if (i != 0) {
            ln lnVar = kw2.f;
            if (f()) {
                g96 g96 = (g96) f96.z().x;
                boolean z2 = true;
                if (g96 != null) {
                    if (g96.x) {
                        boolean z3 = g96.y;
                        ng8 ng8 = (ng8) this.F.get(lnVar);
                        if (ng8 != null) {
                            iw2 iw2 = ng8.e;
                            if (iw2 instanceof y50) {
                                y50 y50 = iw2;
                                if (y50.w != null && !y50.q()) {
                                    p11 a = qg8.a(ng8, y50, i);
                                    if (a != null) {
                                        ng8.o++;
                                        z2 = a.y;
                                    }
                                }
                            }
                        }
                        z2 = z3;
                    }
                }
                long j2 = 0;
                if (z2) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = SystemClock.elapsedRealtime();
                }
                long j3 = j2;
                pw2 = this;
                qg8 = new qg8(pw2, i, lnVar, j, j3);
                if (qg8 == null) {
                    yb9 yb9 = xb7.a;
                    ph8 ph8 = pw2.I;
                    Objects.requireNonNull(ph8);
                    yb9.c(new w80(ph8, 4), qg8);
                    return;
                }
                return;
            }
            qg8 = null;
            pw2 = this;
            if (qg8 == null) {
            }
        }
    }

    public final boolean f() {
        int i;
        if (this.x) {
            return false;
        }
        g96 g96 = (g96) f96.z().x;
        if (g96 != null && !g96.x) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.C.x;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        if (i == -1) {
            return true;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [kw2, yf3] */
    public final boolean g(m11 m11, int i) {
        boolean z2;
        int intValue;
        lw2 lw2 = this.B;
        lw2.getClass();
        Context context = this.A;
        if (!rd3.B(context)) {
            int i2 = m11.x;
            PendingIntent pendingIntent = m11.y;
            if (i2 == 0 || pendingIntent == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                pendingIntent = null;
                Intent a = lw2.a(context, (String) null, i2);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.x;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                lw2.f(context, i2, PendingIntent.getActivity(context, 0, intent, nh8.a | 134217728));
                Integer num = m11.A;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                int i4 = intValue;
                jg8 jg8 = new jg8(i4, m11.x, System.currentTimeMillis(), context.getPackageName(), false);
                if (lw2.c == null) {
                    lw2.c = new kw2(context, yf3.m, ym.a, jw2.c);
                }
                yf3 yf3 = lw2.c;
                yf3.getClass();
                za0 b = i93.b();
                b.e = new cc2[]{h03.C0};
                b.c = false;
                b.d = new uy5(12, (Object) jg8);
                yf3.b(2, b.a());
                return true;
            }
        }
        return false;
    }

    public final void h(m11 m11, int i) {
        if (!g(m11, i)) {
            ph8 ph8 = this.I;
            ph8.sendMessage(ph8.obtainMessage(5, i, 0, m11));
        }
    }

    /* JADX WARNING: type inference failed for: r1v38, types: [kw2, yf3] */
    /* JADX WARNING: type inference failed for: r9v8, types: [kw2, yf3] */
    /* JADX WARNING: type inference failed for: r1v44, types: [kw2, yf3] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0330  */
    public final boolean handleMessage(Message message) {
        ng8 ng8;
        boolean z2;
        Status status;
        cc2[] f;
        qc3 qc3 = yf3.n;
        int i = message.what;
        ec7 ec7 = ec7.x;
        Context context = this.A;
        long j = 300000;
        ph8 ph8 = this.I;
        ConcurrentHashMap concurrentHashMap = this.F;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.w = j;
                ph8.removeMessages(12);
                for (ln obtainMessage : concurrentHashMap.keySet()) {
                    ph8.sendMessageDelayed(ph8.obtainMessage(12, obtainMessage), this.w);
                }
                break;
            case 2:
                throw b81.j(message.obj);
            case 3:
                for (ng8 ng82 : concurrentHashMap.values()) {
                    z65.g(ng82.p.I);
                    ng82.n = null;
                    ng82.r();
                }
                break;
            case 4:
            case 8:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ug8 ug8 = (ug8) message.obj;
                kw2 kw2 = ug8.c;
                jh8 jh8 = ug8.a;
                ng8 ng83 = (ng8) concurrentHashMap.get(kw2.f);
                if (ng83 == null) {
                    ng83 = b(kw2);
                }
                if (!ng83.e.r() || this.E.get() == ug8.b) {
                    ng83.p(jh8);
                    return true;
                }
                jh8.a(K);
                ng83.q();
                return true;
            case 5:
                int i2 = message.arg1;
                m11 m11 = (m11) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ng8 = (ng8) it.next();
                        if (ng8.j == i2) {
                        }
                    } else {
                        ng8 = null;
                    }
                }
                if (ng8 != null) {
                    int i3 = m11.x;
                    if (i3 == 13) {
                        this.B.getClass();
                        int i4 = rw2.e;
                        String f2 = m11.f(i3);
                        String str = m11.z;
                        ng8.j(new Status(17, pb4.n(new StringBuilder(f2.length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", f2, ": ", str), (PendingIntent) null, (m11) null));
                        return true;
                    }
                    ng8.j(d(ng8.f, m11));
                    return true;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 65);
                sb.append("Could not find API instance ");
                sb.append(i2);
                sb.append(" while trying to fail enqueued calls.");
                Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    v30.b((Application) context.getApplicationContext());
                    v30 v30 = v30.A;
                    v30.a(new mg8(this));
                    AtomicBoolean atomicBoolean = v30.w;
                    AtomicBoolean atomicBoolean2 = v30.x;
                    if (!atomicBoolean2.get()) {
                        Boolean bool = i95.d;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                bool = Boolean.valueOf(Process.isIsolated());
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", (Class[]) null).invoke((Object) null, (Object[]) null);
                                    Object[] objArr = new Object[0];
                                    if (invoke != null) {
                                        bool = (Boolean) invoke;
                                    } else {
                                        throw new RuntimeException(h75.L("expected a non-null reference", objArr));
                                    }
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            i95.d = bool;
                        }
                        if (bool.booleanValue()) {
                            z2 = true;
                            if (!z2) {
                                this.w = 300000;
                                break;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z2 = atomicBoolean.get();
                    if (!z2) {
                    }
                }
                break;
            case 7:
                b((kw2) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ng8 ng84 = (ng8) concurrentHashMap.get(message.obj);
                    z65.g(ng84.p.I);
                    if (ng84.l) {
                        ng84.r();
                        return true;
                    }
                }
                break;
            case 10:
                os osVar = this.H;
                osVar.getClass();
                es esVar = new es(osVar);
                while (esVar.hasNext()) {
                    ng8 ng85 = (ng8) concurrentHashMap.remove((ln) esVar.next());
                    if (ng85 != null) {
                        ng85.q();
                    }
                }
                osVar.clear();
                return true;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ng8 ng86 = (ng8) concurrentHashMap.get(message.obj);
                    pw2 pw2 = ng86.p;
                    z65.g(pw2.I);
                    boolean z3 = ng86.l;
                    if (z3) {
                        if (z3) {
                            pw2 pw22 = ng86.p;
                            ln lnVar = ng86.f;
                            pw22.I.removeMessages(11, lnVar);
                            pw22.I.removeMessages(9, lnVar);
                            ng86.l = false;
                        }
                        if (pw2.B.b(pw2.A, mw2.a) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent) null, (m11) null);
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", (PendingIntent) null, (m11) null);
                        }
                        ng86.j(status);
                        ng86.e.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ng8 ng87 = (ng8) concurrentHashMap.get(message.obj);
                    z65.g(ng87.p.I);
                    y50 y50 = ng87.e;
                    if (y50.p() && ng87.i.isEmpty()) {
                        k68 k68 = ng87.g;
                        if (!((Map) k68.x).isEmpty() || !((Map) k68.y).isEmpty()) {
                            ng87.k();
                        } else {
                            y50.d("Timing out service connection.");
                            return true;
                        }
                    }
                    return true;
                }
                break;
            case 14:
                throw b81.j(message.obj);
            case h75.g:
                og8 og8 = (og8) message.obj;
                if (concurrentHashMap.containsKey(og8.a)) {
                    ng8 ng88 = (ng8) concurrentHashMap.get(og8.a);
                    if (ng88.m.contains(og8) && !ng88.l) {
                        if (!ng88.e.p()) {
                            ng88.r();
                            return true;
                        }
                        ng88.g();
                        return true;
                    }
                }
                break;
            case 16:
                og8 og82 = (og8) message.obj;
                if (concurrentHashMap.containsKey(og82.a)) {
                    ng8 ng89 = (ng8) concurrentHashMap.get(og82.a);
                    if (ng89.m.remove(og82)) {
                        pw2 pw23 = ng89.p;
                        pw23.I.removeMessages(15, og82);
                        pw23.I.removeMessages(16, og82);
                        cc2 cc2 = og82.b;
                        LinkedList<jh8> linkedList = ng89.d;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (jh8 jh82 : linkedList) {
                            if ((jh82 instanceof sg8) && (f = ((sg8) jh82).f(ng89)) != null) {
                                int length = f.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        if (!b35.j(f[i5], cc2)) {
                                            i5++;
                                        } else if (i5 >= 0) {
                                            arrayList.add(jh82);
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            jh8 jh83 = (jh8) arrayList.get(i6);
                            linkedList.remove(jh83);
                            jh83.b(new UnsupportedApiCallException(cc2));
                        }
                        break;
                    }
                }
                break;
            case 17:
                dc7 dc7 = this.y;
                if (dc7 != null) {
                    if (dc7.w > 0 || f()) {
                        if (this.z == null) {
                            this.z = new kw2(context, qc3, ec7, jw2.c);
                        }
                        this.z.c(dc7);
                    }
                    this.y = null;
                    return true;
                }
                break;
            case 18:
                rg8 rg8 = (rg8) message.obj;
                long j2 = rg8.c;
                sk4 sk4 = rg8.a;
                int i7 = rg8.b;
                if (j2 == 0) {
                    dc7 dc72 = new dc7(i7, Arrays.asList(new sk4[]{sk4}));
                    if (this.z == null) {
                        this.z = new kw2(context, qc3, ec7, jw2.c);
                    }
                    this.z.c(dc72);
                    return true;
                }
                dc7 dc73 = this.y;
                if (dc73 != null) {
                    List list = dc73.x;
                    if (dc73.w != i7 || (list != null && list.size() >= rg8.d)) {
                        ph8.removeMessages(17);
                        dc7 dc74 = this.y;
                        if (dc74 != null) {
                            if (dc74.w > 0 || f()) {
                                if (this.z == null) {
                                    this.z = new kw2(context, qc3, ec7, jw2.c);
                                }
                                this.z.c(dc74);
                            }
                            this.y = null;
                        }
                    } else {
                        dc7 dc75 = this.y;
                        if (dc75.x == null) {
                            dc75.x = new ArrayList();
                        }
                        dc75.x.add(sk4);
                    }
                }
                if (this.y == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sk4);
                    this.y = new dc7(i7, arrayList2);
                    ph8.sendMessageDelayed(ph8.obtainMessage(17), j2);
                    return true;
                }
                break;
            case 19:
                this.x = false;
                return true;
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 20);
                sb2.append("Unknown message id: ");
                sb2.append(i);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
        return true;
    }
}

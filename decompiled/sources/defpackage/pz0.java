package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* renamed from: pz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pz0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pz0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object call() {
        int i;
        ComponentName componentName;
        String str = null;
        boolean z = false;
        switch (this.a) {
            case b85.b:
                sz0 sz0 = (sz0) this.c;
                e01 e01 = ((qz0) this.b).b;
                synchronized (e01) {
                    FileOutputStream openFileOutput = e01.a.openFileOutput(e01.b, 0);
                    try {
                        openFileOutput.write(sz0.a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            case 1:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                am6 H = am6.H();
                H.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) H.A).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (H) {
                    try {
                        String str2 = (String) H.x;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null) {
                                ServiceInfo serviceInfo = resolveService.serviceInfo;
                                if (serviceInfo != null) {
                                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                                        String str3 = serviceInfo.name;
                                        if (str3 != null) {
                                            if (str3.startsWith(".")) {
                                                H.x = context.getPackageName() + serviceInfo.name;
                                            } else {
                                                H.x = serviceInfo.name;
                                            }
                                            str = (String) H.x;
                                        }
                                    }
                                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                }
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (H.K(context)) {
                        componentName = bb0.x0(context, intent2);
                    } else {
                        componentName = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentName == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (SecurityException e) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
                    i = 401;
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i = 402;
                }
                return Integer.valueOf(i);
            default:
                kd8 kd8 = kd8.w;
                oe8 oe8 = (oe8) this.b;
                re8 re8 = (re8) this.c;
                String str4 = re8.l;
                String str5 = re8.c;
                fe8 fe8 = re8.i;
                be8 be8 = re8.a;
                if (oe8 instanceof me8) {
                    s84 s84 = ((me8) oe8).a;
                    kd8 d = fe8.d(str5);
                    ud8 v = re8.h.v();
                    v.getClass();
                    sg3.O(v.a, false, true, new sd8(str5, 1));
                    if (d != null) {
                        if (d == kd8.x) {
                            if (s84 instanceof r84) {
                                String str6 = se8.a;
                                bc4.k().m(str6, "Worker result SUCCESS for " + str4);
                                if (be8.c()) {
                                    re8.c();
                                } else {
                                    fe8.j(kd8.y, str5);
                                    ce1 ce1 = ((r84) s84).a;
                                    ce1.getClass();
                                    sg3.O(fe8.a, false, true, new k77(23, (Object) ce1, (Object) str5));
                                    re8.f.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    cq1 cq1 = re8.j;
                                    for (String str7 : cq1.a(str5)) {
                                        if (fe8.d(str7) == kd8.A && ((Boolean) sg3.O(cq1.a, true, false, new cb(str7, 10))).booleanValue()) {
                                            bc4.k().m(se8.a, "Setting status to enqueued for ".concat(str7));
                                            fe8.j(kd8, str7);
                                            fe8.i(currentTimeMillis, str7);
                                        }
                                    }
                                }
                            } else if (s84 instanceof q84) {
                                String str8 = se8.a;
                                bc4.k().m(str8, "Worker result RETRY for " + str4);
                                re8.b(-256);
                            } else {
                                String str9 = se8.a;
                                bc4.k().m(str9, "Worker result FAILURE for " + str4);
                                if (be8.c()) {
                                    re8.c();
                                } else {
                                    re8.d(s84);
                                }
                            }
                        } else if (!d.a()) {
                            re8.b(-512);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (oe8 instanceof le8) {
                    s84 s842 = ((le8) oe8).a;
                    String str10 = se8.a;
                    bc4.k().m(str10, "Worker result FAILURE for " + str4);
                    if (be8.c()) {
                        re8.c();
                    } else {
                        re8.d(s842);
                    }
                } else if (oe8 instanceof ne8) {
                    int i2 = ((ne8) oe8).a;
                    if (sg3.e(be8.y, Boolean.TRUE)) {
                        String str11 = se8.a;
                        bc4.k().e(str11, "Worker " + be8.c + " was interrupted. Backing off.");
                        re8.b(i2);
                    } else {
                        kd8 d2 = fe8.d(str5);
                        if (d2 == null || d2.a()) {
                            String str12 = se8.a;
                            bc4.k().e(str12, "Status for " + str5 + " is " + d2 + " ; not doing any work");
                        } else {
                            String str13 = se8.a;
                            bc4.k().e(str13, "Status for " + str5 + " is " + d2 + "; not doing any work and rescheduling for later execution");
                            fe8.j(kd8, str5);
                            fe8.k(i2, str5);
                            fe8.g(-1, str5);
                        }
                    }
                } else {
                    h.c();
                    return null;
                }
                return Boolean.valueOf(z);
                z = true;
                return Boolean.valueOf(z);
        }
    }
}

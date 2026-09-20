package com.wireguard.android.backend;

import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GoBackend {
    public static CompletableFuture e = new CompletableFuture();
    public final Context a;
    public kz0 b;
    public ay4 c;
    public int d = -1;

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static class VpnService extends android.net.VpnService {
        public GoBackend w;

        public final void onCreate() {
            GoBackend.e.complete(this);
            super.onCreate();
        }

        public final void onDestroy() {
            ay4 ay4;
            GoBackend goBackend = this.w;
            if (!(goBackend == null || (ay4 = goBackend.c) == null)) {
                int i = goBackend.d;
                if (i != -1) {
                    GoBackend.wgTurnOff(i);
                }
                GoBackend goBackend2 = this.w;
                goBackend2.c = null;
                goBackend2.d = -1;
                goBackend2.b = null;
                d37 d37 = ((v78) ay4.x).e;
                d37.getClass();
                d37.l((Object) null, false);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                GoBackend.e = GoBackend.e.newIncompleteFuture();
            } else {
                GoBackend.e = new CompletableFuture();
            }
            super.onDestroy();
        }

        public final int onStartCommand(Intent intent, int i, int i2) {
            GoBackend.e.complete(this);
            if (intent == null || intent.getComponent() == null || !intent.getComponent().getPackageName().equals(getPackageName())) {
                Log.d("WireGuard/GoBackend", "Service started by Always-on VPN feature");
            }
            return super.onStartCommand(intent, i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r3 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r3.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r3 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if ((r0 instanceof java.lang.RuntimeException) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        throw ((java.lang.RuntimeException) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        defpackage.rf2.o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a  */
    public GoBackend(Context context) {
        File file;
        try {
            System.loadLibrary("wg-go");
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            Log.d("WireGuard/SharedLibraryLoader", "Failed to load library normally, so attempting to extract from apk", e);
            File file2 = null;
            try {
                file = File.createTempFile("lib", ".so", context.getCodeCacheDir());
                try {
                    if (u55.k(context, file)) {
                        System.load(file.getAbsolutePath());
                        file.delete();
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        Log.d("WireGuard/SharedLibraryLoader", "Failed to load library apk:/wg-go", e);
                    } catch (Throwable th) {
                        th = th;
                        file2 = file;
                        if (file2 != null) {
                            file2.delete();
                        }
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                file = null;
                Log.d("WireGuard/SharedLibraryLoader", "Failed to load library apk:/wg-go", e);
            } catch (Throwable th2) {
                th = th2;
                if (file2 != null) {
                }
                throw th;
            }
        }
        this.a = context;
    }

    private static native int wgGetSocketV4(int i);

    private static native int wgGetSocketV6(int i);

    /* access modifiers changed from: private */
    public static native void wgTurnOff(int i);

    private static native int wgTurnOn(String str, int i, String str2);

    private static native String wgVersion();

    public final Set b() {
        if (this.c == null) {
            return Collections.EMPTY_SET;
        }
        os osVar = new os(0);
        this.c.getClass();
        osVar.add("utiles");
        return osVar;
    }

    public final void c(int i, kz0 kz0, ay4 ay4) {
        int i2;
        ay4 ay42 = this.c;
        if (ay42 == ay4) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        if (i == 2) {
            if (i2 == 3) {
                i = 1;
            } else {
                i = 3;
            }
        }
        if (i != i2 || ay4 != ay42 || kz0 != this.b) {
            if (i == 3) {
                kz0 kz02 = this.b;
                if (ay42 != null) {
                    d(1, (kz0) null, ay42);
                }
                try {
                    d(i, kz0, ay4);
                } catch (Exception e2) {
                    if (ay42 != null) {
                        d(3, kz02, ay42);
                    }
                    throw e2;
                }
            } else if (i == 1 && ay4 == ay42) {
                d(1, (kz0) null, ay4);
            }
        }
    }

    public final void d(int i, kz0 kz0, ay4 ay4) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Throwable th;
        int i2 = i;
        kz0 kz02 = kz0;
        ay4 ay42 = ay4;
        ay42.getClass();
        if (i2 == 1) {
            str = "DOWN";
        } else if (i2 == 2) {
            str = "TOGGLE";
        } else if (i2 != 3) {
            str = "null";
        } else {
            str = "UP";
        }
        Log.i("WireGuard/GoBackend", "Bringing tunnel utiles ".concat(str));
        if (i2 != 3) {
            z = true;
            z2 = false;
            int i3 = this.d;
            if (i3 == -1) {
                Log.w("WireGuard/GoBackend", "Tunnel already down");
                return;
            }
            this.c = null;
            this.d = -1;
            this.b = null;
            wgTurnOff(i3);
            try {
                ((VpnService) e.get(0, TimeUnit.NANOSECONDS)).stopSelf();
            } catch (TimeoutException unused) {
            }
        } else if (kz02 != null) {
            List<gf5> list = kz02.b;
            lf3 lf3 = kz02.a;
            Context context = this.a;
            if (android.net.VpnService.prepare(context) == null) {
                if (!e.isDone()) {
                    Log.d("WireGuard/GoBackend", "Requesting to start VpnService");
                    context.startService(new Intent(context, VpnService.class));
                }
                try {
                    VpnService vpnService = (VpnService) e.get(2, TimeUnit.SECONDS);
                    vpnService.w = this;
                    if (this.d != -1) {
                        Log.w("WireGuard/GoBackend", "Tunnel already up");
                        return;
                    }
                    int i4 = 0;
                    loop0:
                    while (i4 < 10) {
                        for (gf5 gf5 : list) {
                            gb3 gb3 = (gb3) gf5.b.orElse((Object) null);
                            if (gb3 != null) {
                                String str2 = gb3.a;
                                if (gb3.a().orElse((Object) null) == null) {
                                    if (i4 < 9) {
                                        Log.w("WireGuard/GoBackend", "DNS host \"" + str2 + "\" failed to resolve; trying again");
                                        Thread.sleep(1000);
                                        i4++;
                                    } else {
                                        throw new BackendException(str2);
                                    }
                                }
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    lf3.getClass();
                    StringBuilder o = b81.o("private_key=");
                    o.append(((ns3) lf3.f.y).e());
                    o.append(10);
                    lf3.g.ifPresent(new kf3(1, o));
                    sb.append(o.toString());
                    sb.append("replace_peers=true\n");
                    for (gf5 gf52 : list) {
                        gf52.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("public_key=");
                        sb2.append(gf52.e.e());
                        sb2.append(10);
                        for (hb3 append : gf52.a) {
                            sb2.append("allowed_ip=");
                            sb2.append(append);
                            sb2.append(10);
                        }
                        gf52.b.flatMap(new ff5()).ifPresent(new kf3(3, sb2));
                        gf52.c.ifPresent(new kf3(4, sb2));
                        gf52.d.ifPresent(new kf3(5, sb2));
                        sb.append(sb2.toString());
                    }
                    String sb3 = sb.toString();
                    VpnService.Builder builder = new VpnService.Builder(vpnService);
                    builder.setSession("utiles");
                    for (String addDisallowedApplication : lf3.d) {
                        builder.addDisallowedApplication(addDisallowedApplication);
                    }
                    for (String addAllowedApplication : lf3.e) {
                        builder.addAllowedApplication(addAllowedApplication);
                    }
                    for (hb3 hb3 : lf3.a) {
                        builder.addAddress(hb3.a, hb3.b);
                    }
                    for (InetAddress hostAddress : lf3.b) {
                        builder.addDnsServer(hostAddress.getHostAddress());
                    }
                    for (String addSearchDomain : lf3.c) {
                        builder.addSearchDomain(addSearchDomain);
                    }
                    boolean z4 = false;
                    for (gf5 gf53 : list) {
                        for (hb3 hb32 : gf53.a) {
                            int i5 = hb32.b;
                            if (i5 == 0) {
                                z4 = true;
                            }
                            builder.addRoute(hb32.a, i5);
                        }
                    }
                    if (!z4 || list.size() != 1) {
                        builder.allowFamily(OsConstants.AF_INET);
                        builder.allowFamily(OsConstants.AF_INET6);
                    }
                    builder.setMtu(((Integer) lf3.h.orElse(1280)).intValue());
                    if (Build.VERSION.SDK_INT >= 29) {
                        builder.setMetered(false);
                    }
                    vpnService.setUnderlyingNetworks((Network[]) null);
                    z = true;
                    builder.setBlocking(true);
                    ParcelFileDescriptor establish = builder.establish();
                    if (establish != null) {
                        try {
                            Log.d("WireGuard/GoBackend", "Go backend " + wgVersion());
                            this.d = wgTurnOn("utiles", establish.detachFd(), sb3);
                            establish.close();
                            int i6 = this.d;
                            if (i6 >= 0) {
                                this.c = ay42;
                                this.b = kz02;
                                vpnService.protect(wgGetSocketV4(i6));
                                vpnService.protect(wgGetSocketV6(this.d));
                                z2 = false;
                            } else {
                                throw new BackendException(Integer.valueOf(this.d));
                            }
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        throw new BackendException(new Object[0]);
                    }
                } catch (TimeoutException e2) {
                    BackendException backendException = new BackendException(new Object[0]);
                    backendException.initCause(e2);
                    throw backendException;
                }
            } else {
                throw new BackendException(new Object[0]);
            }
        } else {
            throw new BackendException(new Object[0]);
        }
        if (i2 != 0) {
            d37 d37 = ((v78) ay42.x).e;
            if (i2 == 3) {
                z3 = z;
            } else {
                z3 = z2;
            }
            Boolean valueOf = Boolean.valueOf(z3);
            d37.getClass();
            d37.l((Object) null, valueOf);
            return;
        }
        throw null;
        throw th;
    }
}

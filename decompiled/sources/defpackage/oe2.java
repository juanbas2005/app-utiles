package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oe2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oe2 {
    public static final Object k = new Object();
    public static final js l = new zt6(0);
    public final Context a;
    public final String b;
    public final cf2 c;
    public final cw0 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final oz3 g;
    public final nu5 h;
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    public oe2(Context context, String str, cf2 cf2) {
        List<String> list;
        this.a = context;
        z65.h(str);
        this.b = str;
        this.c = cf2;
        o10 o10 = FirebaseInitProvider.w;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        Class<ComponentDiscoveryService> cls = ComponentDiscoveryService.class;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String next : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList2.add(next.substring(31));
                }
            }
            list = arrayList2;
        }
        for (String wv0 : list) {
            arrayList.add(new wv0(0, wv0));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        hs7 hs7 = hs7.w;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.add(new wv0(1, new FirebaseCommonRegistrar()));
        arrayList3.add(new wv0(1, new ExecutorsRegistrar()));
        arrayList4.add(gv0.c(context, Context.class, new Class[0]));
        arrayList4.add(gv0.c(this, oe2.class, new Class[0]));
        arrayList4.add(gv0.c(cf2, cf2.class, new Class[0]));
        hz2 hz2 = new hz2(23);
        if (i75.h(context) && FirebaseInitProvider.x.get()) {
            arrayList4.add(gv0.c(o10, o10.class, new Class[0]));
        }
        cw0 cw0 = new cw0(arrayList3, arrayList4, hz2);
        this.d = cw0;
        Trace.endSection();
        this.g = new oz3(new bw0(2, this, context));
        this.h = cw0.h(wl1.class);
        le2 le2 = new le2(this);
        a();
        if (this.e.get()) {
            v30.A.w.get();
        }
        this.i.add(le2);
        Trace.endSection();
    }

    public static oe2 c() {
        oe2 oe2;
        synchronized (k) {
            try {
                oe2 = (oe2) l.get("[DEFAULT]");
                if (oe2 != null) {
                    ((wl1) oe2.h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i95.q() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oe2;
    }

    public static oe2 f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    oe2 c2 = c();
                    return c2;
                }
                cf2 a2 = cf2.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                oe2 g2 = g(context, a2);
                return g2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [u30, java.lang.Object] */
    public static oe2 g(Context context, cf2 cf2) {
        oe2 oe2;
        AtomicReference atomicReference = me2.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = me2.a;
            if (atomicReference2.get() == null) {
                ? obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        v30.b(application);
                        v30.A.a(obj);
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            js jsVar = l;
            z65.m("FirebaseApp name " + "[DEFAULT]" + " already exists!", !jsVar.containsKey("[DEFAULT]"));
            z65.l("Application context cannot be null.", context);
            oe2 = new oe2(context, "[DEFAULT]", cf2);
            jsVar.put("[DEFAULT]", oe2);
        }
        oe2.e();
        return oe2;
    }

    public final void a() {
        z65.m("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(pv8.B(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(pv8.B(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!i75.h(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = ne2.b;
            if (atomicReference.get() == null) {
                ne2 ne2 = new ne2(context);
                while (!atomicReference.compareAndSet((Object) null, ne2)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(ne2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        cw0 cw0 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) cw0.B;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (cw0) {
                    hashMap = new HashMap((HashMap) cw0.w);
                }
                cw0.b(hashMap, equals);
                break;
            }
        }
        ((wl1) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oe2)) {
            return false;
        }
        oe2 oe2 = (oe2) obj;
        oe2.a();
        return this.b.equals(oe2.b);
    }

    public final boolean h() {
        boolean z;
        a();
        he1 he1 = (he1) this.g.get();
        synchronized (he1) {
            z = he1.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        hv2.k0("name", this.b);
        hv2.k0("options", this.c);
        return hv2.toString();
    }
}

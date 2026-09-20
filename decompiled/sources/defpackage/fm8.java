package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzaeh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* renamed from: fm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class fm8 implements y36, y49, tz8 {
    public static fm8 A;
    public static Boolean B;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public fm8(x49 x49, String str) {
        this.w = 11;
        this.x = x49;
        this.z = str;
        Context context = x49.b;
        Pattern pattern = pa9.a;
        kd6 kd6 = new kd6(context);
        kd6.P0("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        kd6.Q0(sb.toString());
        this.y = kd6.R0();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void a(int r10, java.lang.Throwable r11, byte[] r12) {
        /*
            r9 = this;
            java.lang.Object r12 = r9.x
            v49 r12 = (defpackage.v49) r12
            r12.b1()
            java.lang.Object r0 = r9.z
            a89 r0 = (defpackage.a89) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r10 == r1) goto L_0x0018
            r1 = 204(0xcc, float:2.86E-43)
            if (r10 == r1) goto L_0x0018
            r1 = 304(0x130, float:4.26E-43)
            if (r10 != r1) goto L_0x0033
            r10 = r1
        L_0x0018:
            if (r11 != 0) goto L_0x0033
            java.lang.Object r10 = r12.w
            y19 r10 = (defpackage.y19) r10
            pz8 r10 = r10.B
            defpackage.y19.g(r10)
            mz8 r10 = r10.J
            long r1 = r0.w
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r10.b(r1, r11)
            d59 r10 = defpackage.d59.y
            goto L_0x006f
        L_0x0033:
            java.lang.Object r1 = r12.w
            y19 r1 = (defpackage.y19) r1
            pz8 r1 = r1.B
            defpackage.y19.g(r1)
            mz8 r1 = r1.E
            long r2 = r0.w
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.d(r4, r2, r3, r11)
            ay8 r11 = defpackage.by8.u
            r1 = 0
            java.lang.Object r11 = r11.a(r1)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = ","
            java.lang.String[] r11 = r11.split(r1)
            java.util.List r11 = java.util.Arrays.asList(r11)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x006d
            d59 r10 = defpackage.d59.A
            goto L_0x006f
        L_0x006d:
            d59 r10 = defpackage.d59.z
        L_0x006f:
            java.lang.Object r9 = r9.y
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r11 = r12.w
            y19 r11 = (defpackage.y19) r11
            r69 r2 = r11.j()
            lm8 r3 = new lm8
            long r5 = r0.w
            int r4 = r10.w
            long r7 = r0.B
            r3.<init>(r4, r5, r7)
            r7 = r5
            r2.b1()
            r2.d1()
            r11 = 1
            z99 r11 = r2.s1(r11)
            z46 r1 = new z46
            r6 = 11
            r4 = 0
            r5 = r3
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r2.q1(r1)
            java.lang.Object r11 = r12.w
            y19 r11 = (defpackage.y19) r11
            pz8 r11 = r11.B
            defpackage.y19.g(r11)
            mz8 r11 = r11.J
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "[sgtm] Updated status for row_id"
            r11.c(r12, r10, r0)
            monitor-enter(r9)
            r9.set(r10)     // Catch:{ all -> 0x00bc }
            r9.notifyAll()     // Catch:{ all -> 0x00bc }
            monitor-exit(r9)     // Catch:{ all -> 0x00bc }
            return
        L_0x00bc:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch:{ all -> 0x00bc }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm8.a(int, java.lang.Throwable, byte[]):void");
    }

    public void accept(Object obj, Object obj2) {
        xb7 xb7 = (xb7) obj2;
        d49 d49 = (d49) ((f49) obj).l();
        t39 t39 = new t39((b49) this.x, (uw2) this.z);
        Parcel I = d49.I();
        I.writeString((String) this.y);
        ds8.c(I, t39);
        d49.J(I, 28);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01f1 */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023c  */
    public ge2 b() {
        String str;
        x49 x49;
        String str2;
        int i;
        e79 e79;
        l69 l69;
        ge2 ge2;
        InputStream x2;
        Throwable th;
        e79 e792;
        StrictMode.ThreadPolicy threadPolicy;
        str = (String) this.z;
        x49 = (x49) this.x;
        x77 x77 = x49.f;
        if (!h49.W(x49.b)) {
            return new ge2(t99.A(), new dv5(3, 17, 11));
        }
        Class<Process> cls = Process.class;
        if (B == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                B = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = cls.getMethod("isIsolated", (Class[]) null).invoke(cls, (Object[]) null);
                    invoke.getClass();
                    B = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    B = Boolean.FALSE;
                }
            }
        }
        if (B.booleanValue()) {
            return new ge2(t99.A(), new dv5(3, 18, 11));
        }
        r99 b = x49.g.b();
        vk8 vk8 = b.c;
        lk8 lk8 = lk8.A;
        js jsVar = u49.a;
        int indexOf = str.indexOf("#");
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        } else if (!str.contains("@")) {
            str2 = str;
        } else {
            h.q("Invalid package name: ".concat(str));
            return null;
        }
        if (!b.h) {
            i = 14;
        } else if (!b.a || !b.b.contains(lk8)) {
            i = 3;
        } else if (vk8.f() != 0) {
            List list = b.f;
            if (!list.isEmpty() && !list.contains(str2)) {
                i = 5;
            } else if (b.g.contains(str2)) {
                i = 6;
            } else {
                i = 0;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            e79 = new e79((l69) null, new dv5(i));
        } else {
            try {
                String str3 = b.e;
                if (str3.isEmpty()) {
                    o75 o75 = (o75) x49.h.get();
                    if (!o75.b()) {
                        c35.q(Level.WARNING, x49.a(), (Exception) null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        e792 = new e79(l69.c, new dv5(3, 7, 11));
                        e79 = e792;
                    } else {
                        str3 = ((ApplicationInfo) o75.a()).dataDir;
                    }
                }
                String str4 = File.separator;
                String str5 = b.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
                sb.append(str3);
                sb.append(str4);
                sb.append(str5);
                String sb2 = sb.toString();
                fm8 fm8 = new fm8(vk8, str);
                Uri.Builder scheme = new Uri.Builder().scheme("file");
                String obj = fm8.c().toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + sb2.length() + String.valueOf(str4).length() + obj.length());
                sb3.append(str4);
                sb3.append(sb2);
                sb3.append(str4);
                sb3.append(obj);
                Uri build = scheme.appendEncodedPath(sb3.toString()).build();
                threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    e79 e793 = new e79((l69) ((ka9) x77.get()).a(build, new k93(b.k.t())), new dv5(5, 2, 11));
                    StrictMode.setThreadPolicy(threadPolicy);
                    e79 = e793;
                } catch (FileNotFoundException ) {
                    c35.q(Level.INFO, x49.a(), (Exception) null, "Shared storage file not found for %s", str);
                    e79 = new e79((l69) null, new dv5(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                    dv5 dv5 = e79.b;
                    l69 = e79.a;
                    if (l69 != null) {
                    }
                } catch (zzaeh e) {
                    c35.q(Level.SEVERE, x49.a(), e, "Failed to parse snapshot from shared storage for %s", str);
                    e79 = new e79((l69) null, new dv5(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                    dv5 dv52 = e79.b;
                    l69 = e79.a;
                    if (l69 != null) {
                    }
                }
            } catch (Exception e2) {
                c35.q(Level.WARNING, x49.a(), e2, "Failed to read shared file for %s", str);
                e792 = new e79(l69.c, new dv5(3, 10, 11));
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        }
        dv5 dv522 = e79.b;
        l69 = e79.a;
        if (l69 != null) {
            return new ge2(l69, dv522);
        }
        int i2 = dv522.c;
        try {
            rm8 rm8 = (rm8) t99.A().s(7);
            gl8 gl8 = gl8.a;
            int i3 = rk8.a;
            gl8 gl82 = gl8.b;
            x2 = o55.x(((ka9) x77.get()).b((Uri) this.y));
            nl8 a = ((ml8) rm8).a(x2, gl82);
            if (x2 != null) {
                x2.close();
            }
            return new ge2((t99) a, new dv5(4, i2, 11));
        } catch (IOException | RuntimeException unused2) {
            c35.q(Level.INFO, x49.a(), (Exception) null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            if (g()) {
                ge2 = new ge2(l69.c, new dv5(3, 16, 11));
            } else {
                ge2 = new ge2(t99.A(), new dv5(3, 11, 11));
            }
            return ge2;
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public File c() {
        String str = (String) ((x77) this.y).get();
        String str2 = (String) ((x77) this.z).get();
        return new File(pb4.n(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    public void d(vk8 vk8, Set set, String str) {
        x79[] x79Arr;
        if (!set.isEmpty() && !((AtomicBoolean) this.x).getAndSet(true)) {
            if (ns8.y == null) {
                synchronized (ns8.class) {
                    try {
                        if (ns8.y == null) {
                            ns8.y = new ns8(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) ns8.y.x).add(0, new px8(3));
        }
        byte[] v = vk8.v();
        ((ConcurrentHashMap) this.y).compute(str, new v79(v));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.z).putIfAbsent((String) it.next(), new AtomicReference(new x79(str, v)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof x79) {
                        x79 x79 = (x79) obj;
                        if (str.equals(x79.w)) {
                            x79.a(v);
                            break;
                        } else {
                            x79 x792 = new x79(str, v);
                            x79Arr = str.compareTo(x79.w) < 0 ? new x79[]{x792, x79} : new x79[]{x79, x792};
                        }
                    } else {
                        x79[] x79Arr2 = (x79[]) obj;
                        int binarySearch = Arrays.binarySearch(x79Arr2, str);
                        if (binarySearch >= 0) {
                            x79Arr2[binarySearch].a(v);
                            break;
                        }
                        int i = ~binarySearch;
                        int length = x79Arr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            x79Arr = (x79[]) Arrays.copyOf(x79Arr2, i2);
                        } else {
                            x79[] x79Arr3 = new x79[i2];
                            System.arraycopy(x79Arr2, 0, x79Arr3, 0, i);
                            System.arraycopy(x79Arr2, i, x79Arr3, i + 1, i3);
                            x79Arr = x79Arr3;
                        }
                        x79Arr[i] = new x79(str, v);
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(obj, x79Arr)) {
                            break;
                        } else if (atomicReference.get() != obj) {
                        }
                    }
                }
            }
        }
    }

    public synchronized void e(int i, int i2, long j, long j2) {
        synchronized (this) {
            ((y19) this.x).G.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = (AtomicLong) this.z;
            if (atomicLong.get() != -1) {
                if (elapsedRealtime - atomicLong.get() <= 1800000) {
                    return;
                }
            }
            yb9 c = ((yf3) this.y).c(new dc7(0, Arrays.asList(new sk4[]{new sk4(36301, i, 0, j, j2, (String) null, (String) null, 0, i2)})));
            cp0 cp0 = new cp0(3, elapsedRealtime, this);
            c.getClass();
            c.d(yb7.a, cp0);
        }
    }

    public void f(String str, Object obj) {
        fm8 fm8 = new fm8(2);
        ((fm8) this.z).y = fm8;
        this.z = fm8;
        fm8.z = obj;
        fm8.x = str;
    }

    public boolean g() {
        p69 c = ((x49) this.x).g.c();
        if (!c.v() || !((AbstractCollection) c.A()).contains(lk8.A)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[Catch:{ all -> 0x0023 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public void j(String str, int i, Throwable th, byte[] bArr, Map map) {
        switch (this.w) {
            case 9:
                ((v89) this.z).u(true, i, th, bArr, (String) this.x, (ArrayList) this.y, map);
                return;
            default:
                long j = ((x89) this.y).a;
                v89 v89 = (v89) this.z;
                String str2 = (String) this.x;
                v89.n0().b1();
                v89.j0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        v89.Q = false;
                        v89.L();
                        throw th3;
                    }
                }
                if (i != 200) {
                    if (i == 204) {
                        i = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ? substring = str3.substring(0, Math.min(32, str3.length()));
                    mz8 mz8 = v89.G().G;
                    Integer valueOf = Integer.valueOf(i);
                    if (th == null) {
                        th = substring;
                    }
                    mz8.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
                    uq8 uq8 = v89.y;
                    v89.R(uq8);
                    uq8.o1(Long.valueOf(j));
                    v89.K();
                    v89.Q = false;
                    v89.L();
                    return;
                }
                if (th == null) {
                    uq8 uq82 = v89.y;
                    v89.R(uq82);
                    uq82.j1(Long.valueOf(j));
                    v89.G().J.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                    xz8 xz8 = v89.x;
                    v89.R(xz8);
                    if (xz8.g1()) {
                        uq8 uq83 = v89.y;
                        v89.R(uq83);
                        if (uq83.i1(str2)) {
                            v89.o(str2);
                            v89.Q = false;
                            v89.L();
                            return;
                        }
                    }
                    v89.K();
                    v89.Q = false;
                    v89.L();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ? substring2 = str32.substring(0, Math.min(32, str32.length()));
                mz8 mz82 = v89.G().G;
                Integer valueOf2 = Integer.valueOf(i);
                if (th == null) {
                }
                mz82.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
                uq8 uq84 = v89.y;
                v89.R(uq84);
                uq84.o1(Long.valueOf(j));
                v89.K();
                v89.Q = false;
                v89.L();
                return;
        }
    }

    public String toString() {
        switch (this.w) {
            case 3:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.x);
                sb.append('{');
                fm8 fm8 = (fm8) ((fm8) this.y).y;
                String str = "";
                while (fm8 != null) {
                    Object obj = fm8.z;
                    sb.append(str);
                    String str2 = (String) fm8.x;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    fm8 = (fm8) fm8.y;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fm8(v89 v89, String str, Object obj, int i) {
        this.w = i;
        this.x = str;
        this.y = obj;
        this.z = v89;
    }

    public fm8(int i) {
        this.w = i;
        switch (i) {
            case 8:
                this.x = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.y = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.z = new ConcurrentHashMap();
                return;
            default:
                return;
        }
    }

    public fm8(Context context, y19 y19) {
        this.w = 4;
        this.z = new AtomicLong(-1);
        this.y = new kw2(context, yf3.n, new ec7("measurement:api"), jw2.c);
        this.x = y19;
    }

    public fm8(String str) {
        this.w = 3;
        fm8 fm8 = new fm8(2);
        this.y = fm8;
        this.z = fm8;
        this.x = str;
    }

    public fm8(vk8 vk8, String str) {
        this.w = 7;
        this.x = u50.c;
        this.y = n85.k(new k68(21, this, vk8));
        this.z = n85.k(new k68(20, this, str));
    }

    public /* synthetic */ fm8(Object obj, Serializable serializable, Object obj2, int i) {
        this.w = i;
        this.x = obj;
        this.y = serializable;
        this.z = obj2;
    }
}

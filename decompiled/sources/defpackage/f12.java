package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: f12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f12 {
    public static final px8 b = new px8(2);
    public static final rx8 c = new rx8(2);
    public static final dx8 d = new dx8(3);
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static final ThreadLocal j = new ThreadLocal();
    public static final cj k = new cj(6);
    public static final s63 l = new s63(29);
    public static o89 m;
    public static h99 n;
    public final Context a;

    public f12(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (b35.j(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, i69] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0214, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r0 = r2.O(new defpackage.z25(r7), r3, r0, new defpackage.z25(r4.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0225, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0228, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022e, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0237, code lost:
        throw new java.lang.Exception("No cached result cursor holder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0238, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023a, code lost:
        if (r6 != 2) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023c, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r0 = r2.M(new defpackage.z25(r7), r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024d, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r0 = r2.L(new defpackage.z25(r7), r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025d, code lost:
        r0 = defpackage.z25.M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0261, code lost:
        if (r0 == null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0263, code lost:
        r2 = new defpackage.f12((android.content.Context) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0273, code lost:
        throw new java.lang.Exception("Failed to load remote module.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0274, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027d, code lost:
        throw new java.lang.Exception("Failed to create IDynamiteLoader.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027e, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0287, code lost:
        throw new java.lang.Exception("Failed to determine which loading route to use.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
        if (r4 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        if (r4.booleanValue() == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        r10 = new java.lang.StringBuilder((r3.length() + 40) + java.lang.String.valueOf(r0).length());
        r10.append("Selected remote version of ");
        r10.append(r3);
        r10.append(", version >= ");
        r10.append(r0);
        android.util.Log.i("DynamiteModule", r10.toString());
        r2 = defpackage.f12.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5 = n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0135, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        if (r5 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r2 = (defpackage.i69) r13.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        if (r2 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
        if (r2.a == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        r6 = r29.getApplicationContext();
        r2 = r2.a;
        new defpackage.z25((java.lang.Object) null);
        r7 = defpackage.f12.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0152, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0155, code lost:
        if (h < 2) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015b, code lost:
        if (r11 == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r0 = r5.M(new defpackage.z25(r6), r3, r0, new defpackage.z25(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0182, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r0 = r5.L(new defpackage.z25(r6), r3, r0, new defpackage.z25(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0197, code lost:
        r0 = (android.content.Context) defpackage.z25.M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019d, code lost:
        if (r0 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019f, code lost:
        r2 = new defpackage.f12(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ad, code lost:
        throw new java.lang.Exception("Failed to get module context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b8, code lost:
        throw new java.lang.Exception("No result cursor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c0, code lost:
        throw new java.lang.Exception("DynamiteLoaderV2 was not cached.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c4, code lost:
        r10 = new java.lang.StringBuilder((r3.length() + 40) + java.lang.String.valueOf(r0).length());
        r10.append("Selected remote version of ");
        r10.append(r3);
        r10.append(", version >= ");
        r10.append(r0);
        android.util.Log.i("DynamiteModule", r10.toString());
        r2 = h(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        if (r2 == null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f7, code lost:
        r5 = r2.e(r2.I(), 6);
        r6 = r5.readInt();
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0208, code lost:
        if (r6 < 3) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020a, code lost:
        r4 = (defpackage.i69) r13.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0210, code lost:
        if (r4 == null) goto L_0x022e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02d7 A[Catch:{ all -> 0x00b8 }] */
    public static f12 c(Context context, e12 e12, String str) {
        int i2;
        Context context2;
        int i3;
        Context context3 = context;
        e12 e122 = e12;
        String str2 = str;
        Context applicationContext = context3.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = j;
            i69 i69 = (i69) threadLocal.get();
            ? obj = new Object();
            threadLocal.set(obj);
            String str3 = ".";
            cj cjVar = k;
            String str4 = " and remote version is ";
            Long l2 = (Long) cjVar.get();
            long longValue = l2.longValue();
            try {
                String str5 = " found. Local version is ";
                cjVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                d12 b2 = e122.b(context3, str2, l);
                String str6 = "No acceptable module ";
                String str7 = "VersionPolicy returned invalid code:";
                int i4 = b2.a;
                int i5 = b2.b;
                String str8 = "Failed to load remote module: ";
                StringBuilder sb = new StringBuilder(str2.length() + 26 + String.valueOf(i4).length() + 19 + str2.length() + 1 + String.valueOf(i5).length());
                sb.append("Considering local module ");
                sb.append(str2);
                sb.append(":");
                sb.append(i4);
                sb.append(" and remote module ");
                sb.append(str2);
                sb.append(":");
                sb.append(i5);
                Log.i("DynamiteModule", sb.toString());
                int i6 = b2.c;
                if (i6 != 0) {
                    if (i6 == -1) {
                        if (b2.a != 0) {
                            i6 = -1;
                        }
                    }
                    if (!(i6 == 1 && b2.b == 0)) {
                        if (i6 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str2));
                            f12 f12 = new f12(applicationContext);
                            if (longValue == 0) {
                                cjVar.remove();
                            } else {
                                cjVar.set(l2);
                            }
                            Cursor cursor = obj.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(i69);
                            return f12;
                        } else if (i6 == 1) {
                            try {
                                int i7 = b2.b;
                                try {
                                    synchronized (f12.class) {
                                        try {
                                            if (e(context)) {
                                                Boolean bool = e;
                                            } else {
                                                context2 = context;
                                                try {
                                                    throw new Exception("Remote loading disabled");
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            context2 = context;
                                            throw th;
                                        }
                                    }
                                } catch (RemoteException e2) {
                                    e = e2;
                                    Context context4 = context;
                                    throw new Exception("Failed to load remote module.", e);
                                } catch (DynamiteModule$LoadingException e3) {
                                    e = e3;
                                    Context context5 = context;
                                    throw e;
                                } catch (Throwable th3) {
                                    th = th3;
                                    context2 = context;
                                    try {
                                        throw new Exception("Failed to load remote module.", th);
                                    } catch (DynamiteModule$LoadingException e4) {
                                        e = e4;
                                        String message = e.getMessage();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
                                        sb2.append(str8);
                                        sb2.append(message);
                                        Log.w("DynamiteModule", sb2.toString());
                                        i3 = b2.a;
                                        if (i3 != 0) {
                                            if (e12.b(context2, str2, new bc4(i3, 8)).c == -1) {
                                                Log.i("DynamiteModule", "Selected local version of ".concat(str2));
                                                f12 f122 = new f12(applicationContext);
                                                if (i2 != 0) {
                                                    k.set(l2);
                                                }
                                                return f122;
                                            }
                                        }
                                        throw new Exception("Remote load failed. No local fallback found.", e);
                                    }
                                }
                            } catch (DynamiteModule$LoadingException e5) {
                                e = e5;
                                context2 = context;
                                String message2 = e.getMessage();
                                StringBuilder sb22 = new StringBuilder(String.valueOf(message2).length() + 30);
                                sb22.append(str8);
                                sb22.append(message2);
                                Log.w("DynamiteModule", sb22.toString());
                                i3 = b2.a;
                                if (i3 != 0) {
                                }
                                throw new Exception("Remote load failed. No local fallback found.", e);
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 36);
                            sb3.append(str7);
                            sb3.append(i6);
                            throw new Exception(sb3.toString());
                        }
                    }
                }
                int i8 = b2.a;
                int i9 = b2.b;
                StringBuilder sb4 = new StringBuilder(str2.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
                sb4.append(str6);
                sb4.append(str2);
                sb4.append(str5);
                sb4.append(i8);
                sb4.append(str4);
                sb4.append(i9);
                sb4.append(str3);
                throw new Exception(sb4.toString());
            } finally {
                if (longValue == 0) {
                    k.remove();
                } else {
                    k.set(l2);
                }
                Cursor cursor2 = obj.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                j.set(i69);
            }
        } else {
            throw new Exception("null application Context");
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0061=Splitter:B:33:0x0061, B:18:0x0043=Splitter:B:18:0x0043, B:52:0x00a7=Splitter:B:52:0x00a7} */
    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            java.lang.String r1 = "Failed to retrieve remote module version: "
            java.lang.String r2 = "Failed to load module via V2: "
            java.lang.Class<f12> r3 = defpackage.f12.class
            monitor-enter(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r0 = e     // Catch:{ all -> 0x0050 }
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L_0x00e8
            android.content.Context r0 = r13.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r7 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r7 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.Class r0 = r0.loadClass(r7)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.String r7 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r7)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.Class r7 = r0.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            monitor-enter(r7)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
            java.lang.Object r8 = r0.get(r5)     // Catch:{ all -> 0x003b }
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8     // Catch:{ all -> 0x003b }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003b }
            if (r8 != r9) goto L_0x003e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003b }
            goto L_0x00bd
        L_0x003b:
            r0 = move-exception
            goto L_0x00bf
        L_0x003e:
            if (r8 == 0) goto L_0x0047
            g(r8)     // Catch:{ DynamiteModule$LoadingException -> 0x0043 }
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003b }
            goto L_0x00bd
        L_0x0047:
            boolean r8 = e(r13)     // Catch:{ all -> 0x003b }
            if (r8 != 0) goto L_0x0054
            monitor-exit(r7)     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0050:
            r0 = move-exception
            r14 = r0
            goto L_0x0237
        L_0x0054:
            boolean r8 = g     // Catch:{ all -> 0x003b }
            if (r8 != 0) goto L_0x00b4
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003b }
            boolean r9 = r8.equals(r5)     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x0061
            goto L_0x00b4
        L_0x0061:
            int r9 = f(r13, r14, r15, r4)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            java.lang.String r10 = f     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            if (r10 == 0) goto L_0x00a7
            boolean r10 = r10.isEmpty()     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            if (r10 == 0) goto L_0x0070
            goto L_0x00a7
        L_0x0070:
            java.lang.ClassLoader r10 = defpackage.gr8.c0()     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            if (r10 == 0) goto L_0x0077
            goto L_0x009c
        L_0x0077:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            r11 = 29
            if (r10 < r11) goto L_0x008e
            defpackage.w10.b()     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            java.lang.String r10 = f     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            defpackage.z65.k(r10)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            dalvik.system.DelegateLastClassLoader r10 = defpackage.w10.a(r11, r10)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            goto L_0x009c
        L_0x008e:
            bv8 r10 = new bv8     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            java.lang.String r11 = f     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            defpackage.z65.k(r11)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            java.lang.ClassLoader r12 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            r10.<init>(r11, r12)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
        L_0x009c:
            g(r10)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            r0.set(r5, r10)     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            e = r8     // Catch:{ DynamiteModule$LoadingException -> 0x00aa }
            monitor-exit(r7)     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x0050 }
            return r9
        L_0x00a7:
            monitor-exit(r7)     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x0050 }
            return r9
        L_0x00aa:
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003b }
            r0.set(r5, r8)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003b }
            goto L_0x00bd
        L_0x00b4:
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003b }
            r0.set(r5, r8)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003b }
        L_0x00bd:
            monitor-exit(r7)     // Catch:{ all -> 0x003b }
            goto L_0x00e6
        L_0x00bf:
            monitor-exit(r7)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00c3, NoSuchFieldException -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c3:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            int r8 = r0.length()     // Catch:{ all -> 0x0050 }
            int r8 = r8 + 30
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r9.<init>(r8)     // Catch:{ all -> 0x0050 }
            r9.append(r2)     // Catch:{ all -> 0x0050 }
            r9.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0050 }
            android.util.Log.w(r7, r0)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0050 }
        L_0x00e6:
            e = r0     // Catch:{ all -> 0x0050 }
        L_0x00e8:
            monitor-exit(r3)     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x011d
            int r13 = f(r13, r14, r15, r6)     // Catch:{ DynamiteModule$LoadingException -> 0x00f8 }
            return r13
        L_0x00f4:
            r0 = move-exception
            r14 = r0
            goto L_0x0239
        L_0x00f8:
            r0 = move-exception
            r14 = r0
            java.lang.String r15 = "DynamiteModule"
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00f4 }
            int r0 = r0.length()     // Catch:{ all -> 0x00f4 }
            int r0 = r0 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r2.<init>(r0)     // Catch:{ all -> 0x00f4 }
            r2.append(r1)     // Catch:{ all -> 0x00f4 }
            r2.append(r14)     // Catch:{ all -> 0x00f4 }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.w(r15, r14)     // Catch:{ all -> 0x00f4 }
            return r6
        L_0x011d:
            java.lang.String r1 = "Failed to retrieve remote module version: "
            o89 r7 = h(r13)     // Catch:{ all -> 0x00f4 }
            if (r7 != 0) goto L_0x0127
            goto L_0x022d
        L_0x0127:
            android.os.Parcel r0 = r7.I()     // Catch:{ RemoteException -> 0x014e }
            r2 = 6
            android.os.Parcel r0 = r7.e(r0, r2)     // Catch:{ RemoteException -> 0x014e }
            int r2 = r0.readInt()     // Catch:{ RemoteException -> 0x014e }
            r0.recycle()     // Catch:{ RemoteException -> 0x014e }
            r0 = 3
            if (r2 < r0) goto L_0x01b3
            java.lang.ThreadLocal r0 = j     // Catch:{ RemoteException -> 0x014e }
            java.lang.Object r2 = r0.get()     // Catch:{ RemoteException -> 0x014e }
            i69 r2 = (defpackage.i69) r2     // Catch:{ RemoteException -> 0x014e }
            if (r2 == 0) goto L_0x0152
            android.database.Cursor r2 = r2.a     // Catch:{ RemoteException -> 0x014e }
            if (r2 == 0) goto L_0x0152
            int r6 = r2.getInt(r6)     // Catch:{ RemoteException -> 0x014e }
            goto L_0x022d
        L_0x014e:
            r0 = move-exception
            r14 = r0
            goto L_0x0205
        L_0x0152:
            z25 r8 = new z25     // Catch:{ RemoteException -> 0x014e }
            r8.<init>(r13)     // Catch:{ RemoteException -> 0x014e }
            cj r2 = k     // Catch:{ RemoteException -> 0x014e }
            java.lang.Object r2 = r2.get()     // Catch:{ RemoteException -> 0x014e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ RemoteException -> 0x014e }
            long r11 = r2.longValue()     // Catch:{ RemoteException -> 0x014e }
            r9 = r14
            r10 = r15
            y73 r14 = r7.N(r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x014e }
            java.lang.Object r14 = defpackage.z25.M(r14)     // Catch:{ RemoteException -> 0x014e }
            android.database.Cursor r14 = (android.database.Cursor) r14     // Catch:{ RemoteException -> 0x014e }
            if (r14 == 0) goto L_0x01a0
            boolean r15 = r14.moveToFirst()     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            if (r15 != 0) goto L_0x0178
            goto L_0x01a0
        L_0x0178:
            int r15 = r14.getInt(r6)     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            if (r15 <= 0) goto L_0x0191
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            i69 r0 = (defpackage.i69) r0     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            if (r0 == 0) goto L_0x018d
            android.database.Cursor r2 = r0.a     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            if (r2 != 0) goto L_0x018d
            r0.a = r14     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            goto L_0x018e
        L_0x018d:
            r4 = r6
        L_0x018e:
            if (r4 == 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r5 = r14
        L_0x0192:
            if (r5 == 0) goto L_0x0197
            r5.close()     // Catch:{ all -> 0x00f4 }
        L_0x0197:
            r6 = r15
            goto L_0x022d
        L_0x019a:
            r0 = move-exception
            r15 = r0
            goto L_0x01ae
        L_0x019d:
            r0 = move-exception
            r15 = r0
            goto L_0x01b1
        L_0x01a0:
            java.lang.String r15 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r15, r0)     // Catch:{ RemoteException -> 0x019d, all -> 0x019a }
            if (r14 == 0) goto L_0x022d
            r14.close()     // Catch:{ all -> 0x00f4 }
            goto L_0x022d
        L_0x01ae:
            r5 = r14
            goto L_0x0231
        L_0x01b1:
            r5 = r14
            goto L_0x0206
        L_0x01b3:
            r9 = r14
            r10 = r15
            r14 = 2
            if (r2 != r14) goto L_0x01de
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r15 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r14, r15)     // Catch:{ RemoteException -> 0x014e }
            z25 r14 = new z25     // Catch:{ RemoteException -> 0x014e }
            r14.<init>(r13)     // Catch:{ RemoteException -> 0x014e }
            android.os.Parcel r15 = r7.I()     // Catch:{ RemoteException -> 0x014e }
            defpackage.et8.b(r15, r14)     // Catch:{ RemoteException -> 0x014e }
            r15.writeString(r9)     // Catch:{ RemoteException -> 0x014e }
            r15.writeInt(r10)     // Catch:{ RemoteException -> 0x014e }
            r14 = 5
            android.os.Parcel r14 = r7.e(r15, r14)     // Catch:{ RemoteException -> 0x014e }
            int r15 = r14.readInt()     // Catch:{ RemoteException -> 0x014e }
            r14.recycle()     // Catch:{ RemoteException -> 0x014e }
            goto L_0x0197
        L_0x01de:
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r15 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r14, r15)     // Catch:{ RemoteException -> 0x014e }
            z25 r14 = new z25     // Catch:{ RemoteException -> 0x014e }
            r14.<init>(r13)     // Catch:{ RemoteException -> 0x014e }
            android.os.Parcel r15 = r7.I()     // Catch:{ RemoteException -> 0x014e }
            defpackage.et8.b(r15, r14)     // Catch:{ RemoteException -> 0x014e }
            r15.writeString(r9)     // Catch:{ RemoteException -> 0x014e }
            r15.writeInt(r10)     // Catch:{ RemoteException -> 0x014e }
            android.os.Parcel r14 = r7.e(r15, r0)     // Catch:{ RemoteException -> 0x014e }
            int r15 = r14.readInt()     // Catch:{ RemoteException -> 0x014e }
            r14.recycle()     // Catch:{ RemoteException -> 0x014e }
            goto L_0x0197
        L_0x0203:
            r15 = r14
            goto L_0x0231
        L_0x0205:
            r15 = r14
        L_0x0206:
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x022e }
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x022e }
            int r0 = r0.length()     // Catch:{ all -> 0x022e }
            int r0 = r0 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r2.<init>(r0)     // Catch:{ all -> 0x022e }
            r2.append(r1)     // Catch:{ all -> 0x022e }
            r2.append(r15)     // Catch:{ all -> 0x022e }
            java.lang.String r15 = r2.toString()     // Catch:{ all -> 0x022e }
            android.util.Log.w(r14, r15)     // Catch:{ all -> 0x022e }
            if (r5 == 0) goto L_0x022d
            r5.close()     // Catch:{ all -> 0x00f4 }
        L_0x022d:
            return r6
        L_0x022e:
            r0 = move-exception
            r14 = r0
            goto L_0x0203
        L_0x0231:
            if (r5 == 0) goto L_0x0236
            r5.close()     // Catch:{ all -> 0x00f4 }
        L_0x0236:
            throw r15     // Catch:{ all -> 0x00f4 }
        L_0x0237:
            monitor-exit(r3)     // Catch:{ all -> 0x0050 }
            throw r14     // Catch:{ all -> 0x00f4 }
        L_0x0239:
            defpackage.z65.k(r13)     // Catch:{ Exception -> 0x023d }
            goto L_0x0246
        L_0x023d:
            r0 = move-exception
            r13 = r0
            java.lang.String r15 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r15, r0, r13)
        L_0x0246:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f12.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        int i2;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i2 = 268435456;
            } else {
                i2 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i2);
            if (mw2.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0137, code lost:
        if (r6 != false) goto L_0x0144;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7 A[SYNTHETIC, Splitter:B:59:0x00e7] */
    public static int f(Context context, String str, boolean z, boolean z2) {
        Throwable th;
        Exception exc;
        ContentProviderClient acquireUnstableContentProviderClient;
        MatrixCursor matrixCursor;
        boolean z3;
        Cursor query;
        Throwable th2;
        MatrixCursor matrixCursor2 = null;
        try {
            long longValue = ((Long) k.get()).longValue();
            String str2 = "api_force_staging";
            boolean z4 = true;
            if (true != z) {
                str2 = "api";
            }
            Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(longValue)).build();
            acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            boolean z5 = false;
            if (acquireUnstableContentProviderClient != null) {
                try {
                    query = acquireUnstableContentProviderClient.query(build, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        int count = query.getCount();
                        int columnCount = query.getColumnCount();
                        matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                        int i2 = 0;
                        while (i2 < count) {
                            if (query.moveToPosition(i2)) {
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else if (type == 4) {
                                        objArr[i3] = query.getBlob(i3);
                                    } else {
                                        throw new RemoteException("Unknown column type");
                                    }
                                }
                                matrixCursor.addRow(objArr);
                                i2++;
                            } else {
                                throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                            }
                        }
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        if (matrixCursor != null) {
                            try {
                                if (matrixCursor.moveToFirst()) {
                                    int i4 = matrixCursor.getInt(0);
                                    if (i4 > 0) {
                                        synchronized (f12.class) {
                                            f = matrixCursor.getString(2);
                                            int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                            if (columnIndex >= 0) {
                                                h = matrixCursor.getInt(columnIndex);
                                            }
                                            int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                            if (columnIndex2 >= 0) {
                                                if (matrixCursor.getInt(columnIndex2) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                g = z3;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                        i69 i69 = (i69) j.get();
                                        if (i69 == null || i69.a != null) {
                                            z4 = false;
                                        } else {
                                            i69.a = matrixCursor;
                                        }
                                        z5 = z3;
                                    }
                                    matrixCursor2 = matrixCursor;
                                    if (!z2 || !z5) {
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                    throw new Exception("forcing fallback to container DynamiteLoader impl");
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                matrixCursor2 = matrixCursor;
                            } catch (Throwable th3) {
                                th = th3;
                                matrixCursor2 = matrixCursor;
                                if (matrixCursor2 != null) {
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        throw new Exception("Failed to connect to dynamite module ContentResolver.");
                    }
                } catch (RemoteException ) {
                    acquireUnstableContentProviderClient.release();
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    acquireUnstableContentProviderClient.release();
                    throw th5;
                }
                acquireUnstableContentProviderClient.release();
            }
            matrixCursor = null;
            if (matrixCursor != null) {
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new Exception("Failed to connect to dynamite module ContentResolver.");
            throw th2;
            try {
                if (!(exc instanceof DynamiteModule$LoadingException)) {
                    String message = exc.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                    sb.append("V2 version check failed: ");
                    sb.append(message);
                    throw new Exception(sb.toString(), exc);
                }
                throw exc;
            } catch (Throwable th6) {
                th = th6;
                if (matrixCursor2 != null) {
                    matrixCursor2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [gg8] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void g(ClassLoader classLoader) {
        try {
            h99 h99 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class[]) null).newInstance((Object[]) null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof h99) {
                    h99 = (h99) queryLocalInterface;
                } else {
                    h99 = new gg8(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                }
            }
            n = h99;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new Exception("Failed to instantiate dynamite loader", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [gg8] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static o89 h(Context context) {
        o89 o89;
        synchronized (f12.class) {
            o89 o892 = m;
            if (o892 != null) {
                return o892;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    o89 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof o89) {
                        o89 = (o89) queryLocalInterface;
                    } else {
                        o89 = new gg8(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                    }
                }
                if (o89 != null) {
                    m = o89;
                    return o89;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
        }
        return null;
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}

package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: u55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u55 {
    public static final /* synthetic */ int a = 0;

    public static boolean A(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static IOException B(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return C(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return C(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return C(file, iOException, str);
                }
                return C(file, iOException, str);
            } else if (parentFile.canWrite()) {
                return C(file, iOException, str);
            } else {
                return C(file, iOException, str);
            }
        } else if (parentFile.canRead()) {
            if (parentFile.canWrite()) {
                return C(file, iOException, str);
            }
            return C(file, iOException, str);
        } else if (parentFile.canWrite()) {
            return C(file, iOException, str);
        } else {
            return C(file, iOException, str);
        }
    }

    public static IOException C(File file, IOException iOException, String str) {
        String str2;
        try {
            Locale locale = Locale.US;
            String str3 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str3.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str3);
            str2 = sb.toString();
            try {
                String str4 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(str2.length() + str4.length());
                sb2.append(str2);
                sb2.append(str4);
                str2 = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            str2 = "Inoperable file:".concat(" failed");
        }
        return new IOException(str2, iOException);
    }

    public static final void a(boolean z, sr2 sr2, ml4 ml4, boolean z2, uv5 uv5, yt2 yt2, int i, int i2) {
        int i3;
        uv5 uv52;
        boolean z3;
        uv5 uv53;
        boolean z4;
        ml4 ml42;
        uv5 uv54;
        boolean z5;
        ml4 ml43;
        float f;
        long j;
        a37 a37;
        a37 v;
        ml4 ml44;
        uv5 uv55;
        int i4;
        int i5;
        int i6;
        boolean z6 = z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i7 = i;
        yt22.g0(408580840);
        if ((i7 & 6) == 0) {
            if (yt22.h(z6)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.i(sr22)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i3 | 3456;
        if ((i7 & 24576) == 0) {
            if ((i2 & 16) == 0) {
                uv52 = uv5;
                if (yt22.g(uv52)) {
                    i4 = 16384;
                    i8 |= i4;
                }
            } else {
                uv52 = uv5;
            }
            i4 = 8192;
            i8 |= i4;
        } else {
            uv52 = uv5;
        }
        int i9 = i8 | 196608;
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i9 & 1, z3)) {
            yt22.a0();
            int i10 = i7 & 1;
            ml4 ml45 = jl4.w;
            if (i10 == 0 || yt22.C()) {
                if ((i2 & 16) != 0) {
                    qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
                    uv5 uv56 = qt0.l0;
                    if (uv56 == null) {
                        uv55 = new uv5(st0.d(qt0, kl8.q), st0.d(qt0, kl8.s), jt0.b(0.38f, st0.d(qt0, kl8.n)), jt0.b(0.38f, st0.d(qt0, kl8.o)));
                        qt0.l0 = uv55;
                    } else {
                        uv55 = uv56;
                    }
                } else {
                    uv55 = uv52;
                }
                z5 = true;
                uv54 = uv55;
                ml43 = ml45;
            } else {
                yt22.Y();
                ml43 = ml4;
                z5 = z2;
                uv54 = uv52;
            }
            yt22.s();
            if (z6) {
                f = 6.0f;
            } else {
                f = 0.0f;
            }
            a37 a2 = vj.a(f, hj8.H(vm4.x, yt22), yt22);
            uv54.getClass();
            if (z5 && z6) {
                j = uv54.a;
            } else if (z5 && !z6) {
                j = uv54.b;
            } else if (z5 || !z6) {
                j = uv54.d;
            } else {
                j = uv54.c;
            }
            if (z5) {
                yt22.e0(1194671677);
                a37 = a2;
                v = ru6.a(j, hj8.H(vm4.y, yt22), (String) null, yt22, 0, 12);
                yt22.r(false);
            } else {
                a37 = a2;
                yt22.e0(1194849338);
                v = v(new jt0(j), yt22);
                yt22.r(false);
            }
            a37 a372 = v;
            if (sr22 != null) {
                z4 = z5;
                ml44 = su0.L(ml45, z6, (ap4) null, d86.a(false, kl8.r / 2.0f, 0, q96.a, 244), z4, new s86(3), sr2);
            } else {
                z4 = z5;
                ml44 = ml45;
            }
            if (sr2 != null) {
                h23 h23 = hf3.a;
                ml45 = al4.w;
            }
            ml4 h = yu6.h(x91.K(yu6.s(ml43.d(ml45).d(ml44), xb4.C, 2), 2.0f), kl8.p);
            a37 a373 = a37;
            boolean g = yt22.g(a372) | yt22.g(a373);
            Object Q = yt22.Q();
            if (g || Q == ay0.a) {
                Q = new vv5(a372, a373, 0);
                yt22.o0(Q);
            }
            tf4.c(h, (vr2) Q, yt22, 0);
            ml42 = ml43;
            uv53 = uv54;
        } else {
            yt22.Y();
            z4 = z2;
            uv53 = uv52;
            ml42 = ml4;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new uo0(z, sr2, ml42, z4, uv53, i7, i2, 1);
        }
    }

    public static final long b(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static float c(int i) {
        Set set = v98.x;
        if (i == 2) {
            return 900.0f;
        }
        if (i == 1) {
            return 480.0f;
        }
        return 0.0f;
    }

    public static int d(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                Class cls = AppOpsManager.class;
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    i = ((AppOpsManager) context.getSystemService(cls)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(cls);
                    int callingUid = Binder.getCallingUid();
                    int i2 = 1;
                    if (appOpsManager == null) {
                        i = 1;
                    } else {
                        i = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                    }
                    if (i == 0) {
                        String b = dn.b(context);
                        if (appOpsManager != null) {
                            i2 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, b);
                        }
                        i = i2;
                    }
                } else {
                    i = ((AppOpsManager) context.getSystemService(cls)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (i == 0) {
                    return 0;
                }
                return -2;
            }
            return 0;
        }
        return -1;
    }

    public static final aq4 e(di2 di2, Object obj, e81 e81, yt2 yt2, int i, int i2) {
        if ((i2 & 2) != 0) {
            e81 = x32.w;
        }
        boolean i3 = yt2.i(e81) | yt2.i(di2);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (i3 || Q == d63) {
            Q = new ii3((Object) e81, (Object) di2, (f61) null, 26);
            yt2.o0(Q);
        }
        gs2 gs2 = (gs2) Q;
        Object Q2 = yt2.Q();
        if (Q2 == d63) {
            Q2 = p(obj);
            yt2.o0(Q2);
        }
        aq4 aq4 = (aq4) Q2;
        boolean i4 = yt2.i(gs2);
        Object Q3 = yt2.Q();
        if (i4 || Q3 == d63) {
            Q3 = new wx6(gs2, aq4, (f61) null, 2);
            yt2.o0(Q3);
        }
        t49.j(di2, e81, (gs2) Q3, yt2);
        return aq4;
    }

    public static final aq4 f(b37 b37, yt2 yt2) {
        return e(b37, b37.getValue(), x32.w, yt2, 0, 0);
    }

    public static final int g(ab6 ab6, String str) {
        ab6.getClass();
        int columnCount = ab6.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            } else if (str.equals(ab6.getColumnName(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return i;
        }
        String h = pb4.h('`', "`", str);
        int columnCount2 = ab6.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            } else if (h.equals(ab6.getColumnName(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = ab6.getColumnCount();
            String concat = ".".concat(str);
            String h2 = pb4.h('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = ab6.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (k57.m0(columnName, concat, false) || (columnName.charAt(0) == '`' && k57.m0(columnName, h2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final eq4 h() {
        cf4 cf4 = vx6.b;
        eq4 eq4 = (eq4) cf4.f();
        if (eq4 != null) {
            return eq4;
        }
        eq4 eq42 = new eq4(new xt2[0]);
        cf4.D(eq42);
        return eq42;
    }

    public static final oq1 i(sr2 sr2) {
        cf4 cf4 = vx6.a;
        return new oq1(sr2, (ux6) null);
    }

    public static final oq1 j(sr2 sr2, ux6 ux6) {
        cf4 cf4 = vx6.a;
        return new oq1(sr2, ux6);
    }

    public static boolean k(Context context, File file) {
        InputStream inputStream;
        HashSet hashSet = new HashSet();
        if (context.getApplicationInfo().sourceDir != null) {
            hashSet.add(context.getApplicationInfo().sourceDir);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            hashSet.addAll(Arrays.asList(context.getApplicationInfo().splitSourceDirs));
        }
        for (String str : Build.SUPPORTED_ABIS) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ZipFile zipFile = new ZipFile(new File((String) it.next()), 1);
                try {
                    String mapLibraryName = System.mapLibraryName("wg-go");
                    StringBuilder sb = new StringBuilder();
                    sb.append("lib");
                    char c = File.separatorChar;
                    sb.append(c);
                    sb.append(str);
                    sb.append(c);
                    sb.append(mapLibraryName);
                    String sb2 = sb.toString();
                    ZipEntry entry = zipFile.getEntry(sb2);
                    if (entry == null) {
                        zipFile.close();
                    } else {
                        Log.d("WireGuard/SharedLibraryLoader", "Extracting apk:/" + sb2 + " to " + file.getAbsolutePath());
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            inputStream = zipFile.getInputStream(entry);
                            byte[] bArr = new byte[32768];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileOutputStream.getFD().sync();
                                    inputStream.close();
                                    fileOutputStream.close();
                                    zipFile.close();
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return false;
        throw th;
        throw th;
    }

    public static final String l(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static int m(int i) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("u55", "No cameras!");
            return -1;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    public static final int n(ab6 ab6, String str) {
        ab6.getClass();
        int g = g(ab6, str);
        if (g >= 0) {
            return g;
        }
        int columnCount = ab6.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ab6.getColumnName(i));
        }
        String E0 = dt0.E0(arrayList, (String) null, (String) null, (String) null, (vr2) null, 63);
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + E0 + ']');
    }

    public static String o(String str, Object... objArr) {
        int indexOf;
        String str2;
        String str3;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb2.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(sb2);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str3, e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + sb2.length() + 9);
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb4.append(str, i3, indexOf);
            sb4.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb4.append(str, i3, str.length());
        if (i < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb4.append(", ");
                sb4.append(objArr[i4]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static ed5 p(Object obj) {
        return new ed5(obj, g22.K);
    }

    public static void q(hf7 hf7, td7 td7, bg7 bg7, dy3 dy3, vf7 vf7, boolean z, v35 v35) {
        ly5 ly5;
        if (z) {
            int p = v35.p(lg7.e(hf7.b));
            String str = zd7.a;
            if (p < bg7.a.a.x.length()) {
                ly5 = bg7.b(p);
            } else if (p != 0) {
                ly5 = bg7.b(p - 1);
            } else {
                ly5 = new ly5(0.0f, 0.0f, 1.0f, (float) ((int) (zd7.a(td7.b, td7.g, td7.h) & 4294967295L)));
            }
            float f = ly5.b;
            float f2 = ly5.a;
            long R = dy3.R((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (R >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (R & 4294967295L));
            long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
            ly5 c = z85.c((((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (floatToRawIntBits << 32), (((long) Float.floatToRawIntBits(ly5.c - f2)) << 32) | (((long) Float.floatToRawIntBits(ly5.d - f)) & 4294967295L));
            if (sg3.e((vf7) vf7.a.b.get(), vf7)) {
                vf7.b.h(c);
            }
        }
    }

    public static final aq4 r(Object obj, gs2 gs2, yt2 yt2, int i) {
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = p((Object) null);
            yt2.o0(Q);
        }
        aq4 aq4 = (aq4) Q;
        boolean i2 = yt2.i(gs2);
        Object Q2 = yt2.Q();
        if (i2 || Q2 == d63) {
            Q2 = new wx6(gs2, aq4, (f61) null, 1);
            yt2.o0(Q2);
        }
        t49.h((gs2) Q2, yt2, obj);
        return aq4;
    }

    public static final Object s(Object[] objArr, sr2 sr2, yt2 yt2, int i) {
        return u(Arrays.copyOf(objArr, objArr.length), mf6.a, sr2, yt2, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object t(Object[] objArr, lf6 lf6, sr2 sr2, yt2 yt2, int i) {
        return u(Arrays.copyOf(objArr, objArr.length), lf6, sr2, yt2, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object u(Object[] objArr, lf6 lf6, sr2 sr2, yt2 yt2, int i, int i2) {
        Object[] objArr2;
        lf6 lf62;
        boolean z;
        Object obj;
        Object obj2;
        Object e;
        long j = yt2.T;
        rd3.i(36);
        String l = Long.toString(j, 36);
        l.getClass();
        lf6.getClass();
        re6 re6 = (re6) yt2.k(te6.a);
        Object Q = yt2.Q();
        Object obj3 = null;
        d63 d63 = ay0.a;
        if (Q == d63) {
            if (re6 == null || (e = re6.e(l)) == null) {
                obj2 = null;
            } else {
                obj2 = lf6.b(e);
            }
            if (obj2 == null) {
                obj2 = sr2.b();
            }
            objArr2 = objArr;
            lf62 = lf6;
            ne6 ne6 = new ne6(lf62, re6, l, obj2, objArr2);
            yt2.o0(ne6);
            Q = ne6;
        } else {
            objArr2 = objArr;
            lf62 = lf6;
        }
        ne6 ne62 = (ne6) Q;
        if (Arrays.equals(objArr2, ne62.A)) {
            obj3 = ne62.z;
        }
        if (obj3 == null) {
            obj3 = sr2.b();
        }
        boolean i3 = yt2.i(ne62);
        if ((((i & 112) ^ 48) <= 32 || !yt2.i(lf62)) && (i & 48) != 32) {
            z = false;
        } else {
            z = true;
        }
        boolean i4 = i3 | z | yt2.i(re6) | yt2.g(l) | yt2.i(obj3) | yt2.i(objArr2);
        Object Q2 = yt2.Q();
        if (i4 || Q2 == d63) {
            String str = l;
            Object[] objArr3 = objArr2;
            obj = obj3;
            zo2 zo2 = new zo2(ne62, lf62, re6, str, obj, objArr3);
            yt2.o0(zo2);
            Q2 = zo2;
        } else {
            obj = obj3;
        }
        t49.l((sr2) Q2, yt2);
        return obj;
    }

    public static final aq4 v(Object obj, yt2 yt2) {
        Object Q = yt2.Q();
        if (Q == ay0.a) {
            Q = p(obj);
            yt2.o0(Q);
        }
        aq4 aq4 = (aq4) Q;
        aq4.setValue(obj);
        return aq4;
    }

    public static final ze1 w(sr2 sr2) {
        return new ze1(3, new w6(sr2, (f61) null));
    }

    public static final a66 x(a66 a66) {
        a66.getClass();
        z56 a2 = a66.a();
        d66 d66 = a66.C;
        a2.g = new it7(d66.k(), d66.a());
        return a2.a();
    }

    public static final ly5 y(dy3 dy3) {
        ly5 v = t49.v(dy3, true);
        long A = dy3.A(v.d());
        long A2 = dy3.A((((long) Float.floatToRawIntBits(v.c)) << 32) | (((long) Float.floatToRawIntBits(v.d)) & 4294967295L));
        return new ly5(Float.intBitsToFloat((int) (A >> 32)), Float.intBitsToFloat((int) (A & 4294967295L)), Float.intBitsToFloat((int) (A2 >> 32)), Float.intBitsToFloat((int) (A2 & 4294967295L)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xa9, ja9, java.lang.Object] */
    public static IOException z(ka9 ka9, Uri uri, IOException iOException, String str) {
        try {
            ? obj = new Object();
            obj.w = true;
            File file = (File) ka9.a(uri, obj);
            if (!file.exists()) {
                return B(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return B(file, iOException, str);
                    }
                    return B(file, iOException, str);
                } else if (file.canWrite()) {
                    return B(file, iOException, str);
                } else {
                    return B(file, iOException, str);
                }
            } else if (file.canRead()) {
                if (file.canWrite()) {
                    return B(file, iOException, str);
                }
                return B(file, iOException, str);
            } else if (file.canWrite()) {
                return B(file, iOException, str);
            } else {
                return B(file, iOException, str);
            }
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }
}

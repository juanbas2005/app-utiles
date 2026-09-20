package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: uw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uw2 {
    public static uw2 c;
    public Object a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r1v3, types: [uw2, java.lang.Object] */
    public static uw2 a(Context context) {
        z65.k(context);
        synchronized (uw2.class) {
            if (c == null) {
                zu8 zu8 = j79.a;
                synchronized (j79.class) {
                    if (j79.e == null) {
                        j79.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                ? obj = new Object();
                obj.a = context.getApplicationContext();
                c = obj;
            }
        }
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r5 = r9;
     */
    public static final boolean d(PackageInfo packageInfo, boolean z) {
        lp8 lp8;
        lp8 lp82;
        lp8 lp83;
        int i;
        r29 r29;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                try {
                    lp8 = g69.c;
                } catch (IllegalArgumentException unused) {
                    Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                    if (z) {
                        r29 = e(packageInfo, g69.a);
                    } else {
                        r29 = e(packageInfo, g69.a[0]);
                    }
                    if (r29 != null) {
                        return true;
                    }
                }
            } else {
                lp8 = g69.b;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] bArr = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    bArr = signatureArr[0].toByteArray();
                }
                if (bArr != null) {
                    ql8 ql8 = vn8.A;
                    Object[] objArr = {bArr};
                    c35.p(1, objArr);
                    lp82 = new lp8(1, objArr);
                } else {
                    ql8 ql82 = vn8.A;
                    lp82 = lp8.D;
                }
            } else if (i2 >= 28) {
                SigningInfo d = packageInfo.signingInfo;
                if (d != null && !d.hasMultipleSigners()) {
                    if (d.getSigningCertificateHistory() != null) {
                        ql8 ql83 = vn8.A;
                        Object[] objArr2 = new Object[4];
                        Signature[] v = d.getSigningCertificateHistory();
                        int length = v.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray = v[i3].toByteArray();
                            byteArray.getClass();
                            int length2 = objArr2.length;
                            int i5 = i4 + 1;
                            if (i5 >= 0) {
                                if (i5 <= length2) {
                                    i = length2;
                                } else {
                                    i = (length2 >> 1) + length2 + 1;
                                    if (i < i5) {
                                        int highestOneBit = Integer.highestOneBit(i4);
                                        i = highestOneBit + highestOneBit;
                                    }
                                    if (i < 0) {
                                        i = Integer.MAX_VALUE;
                                    }
                                }
                                if (i > length2) {
                                    objArr2 = Arrays.copyOf(objArr2, i);
                                }
                                objArr2[i4] = byteArray;
                                i3++;
                                i4 = i5;
                            } else {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                        }
                        if (i4 == 0) {
                            lp83 = lp8.D;
                        } else {
                            lp83 = new lp8(i4, objArr2);
                        }
                        lp82 = lp83;
                    }
                }
                ql8 ql84 = vn8.A;
                lp82 = lp8.D;
            } else {
                throw new IllegalStateException();
            }
            if (!lp82.isEmpty()) {
                vn8 v2 = lp82.v();
                int size = v2.size();
                int i6 = 0;
                loop1:
                while (i6 < size) {
                    byte[] bArr2 = (byte[]) v2.get(i6);
                    ql8 x = lp8.listIterator(0);
                    while (true) {
                        int i7 = i6 + 1;
                        if (x.hasNext()) {
                            if (Arrays.equals(bArr2, (byte[]) x.next())) {
                                break loop1;
                            }
                        } else {
                            break;
                        }
                    }
                    return true;
                }
            }
            throw new IllegalArgumentException("Unable to obtain package certificate history.");
        }
        return false;
    }

    public static r29 e(PackageInfo packageInfo, r29... r29Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            u39 u39 = new u39(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < r29Arr.length; i++) {
                if (r29Arr[i].equals(u39)) {
                    return r29Arr[i];
                }
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d1  */
    public boolean b(int i) {
        zc9 zc9;
        int length;
        int i2;
        ApplicationInfo applicationInfo;
        PackageManager.NameNotFoundException nameNotFoundException;
        String[] packagesForUid = ((Context) this.a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            zc9 = zc9.i("no pkgs");
        } else {
            zc9 = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z65.k(zc9);
                    break;
                }
                String str = packagesForUid[i3];
                if (str == null) {
                    zc9 = zc9.i("null pkg");
                } else if (!str.equals((String) this.b)) {
                    zu8 zu8 = j79.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        j79.a();
                        if (((tj8) j79.c).L()) {
                            boolean a2 = rw2.a((Context) this.a);
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            try {
                                z65.k(j79.e);
                                try {
                                    j79.a();
                                    z65.k(j79.e);
                                    Context context = (Context) z25.M(z25.L(new z25(j79.e)));
                                    tj8 tj8 = (tj8) j79.c;
                                    Parcel I = tj8.I();
                                    int i4 = et8.a;
                                    I.writeInt(1);
                                    int M = h75.M(I, 20293);
                                    h75.F(I, 1, str);
                                    h75.K(I, 2, 4);
                                    I.writeInt(a2 ? 1 : 0);
                                    h75.K(I, 3, 4);
                                    I.writeInt(0);
                                    h75.C(I, 4, new z25(context));
                                    h75.K(I, 5, 4);
                                    I.writeInt(0);
                                    h75.K(I, 6, 4);
                                    I.writeInt(1);
                                    h75.K(I, 8, 4);
                                    I.writeInt(0);
                                    h75.O(I, M);
                                    Parcel e = tj8.e(I, 6);
                                    w99 w99 = (w99) et8.a(e, w99.CREATOR);
                                    e.recycle();
                                    if (w99.w) {
                                        k75.n(w99.z);
                                        zc9 = new zc9(true, (Object) null, (Object) null, 0);
                                    } else {
                                        String str2 = w99.x;
                                        if (i75.q(w99.y) == 4) {
                                            nameNotFoundException = new PackageManager.NameNotFoundException();
                                        } else {
                                            nameNotFoundException = null;
                                        }
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        k75.n(w99.z);
                                        i75.q(w99.y);
                                        zc9 = new zc9(false, str2, nameNotFoundException, 0);
                                    }
                                } catch (DynamiteModule$LoadingException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    zc9 = zc9.j("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                }
                            } catch (RemoteException e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                zc9 = zc9.j("module call", e3);
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(allowThreadDiskReads2);
                                throw th;
                            }
                            StrictMode.setThreadPolicy(allowThreadDiskReads2);
                            if (zc9.x) {
                                this.b = str;
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 28) {
                                i2 = 134217792;
                            } else {
                                i2 = 64;
                            }
                            try {
                                PackageInfo packageInfo = ((Context) this.a).getPackageManager().getPackageInfo(str, i2);
                                boolean a3 = rw2.a((Context) this.a);
                                if (packageInfo == null) {
                                    zc9 = zc9.i("null pkg");
                                    if (zc9.x) {
                                    }
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr == null || signatureArr.length != 1) {
                                        zc9 = zc9.i("single cert required");
                                        if (zc9.x) {
                                        }
                                    } else {
                                        u39 u39 = new u39(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                        try {
                                            zc9 b2 = j79.b(str3, u39, a3, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                            if (b2.x && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    zc9 b3 = j79.b(str3, u39, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                    if (b3.x) {
                                                        zc9 = zc9.i("debuggable release cert app rejected");
                                                        if (zc9.x) {
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                    throw th2;
                                                }
                                            }
                                            zc9 = b2;
                                            if (zc9.x) {
                                            }
                                        } catch (Throwable th3) {
                                            StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                            throw th3;
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                zc9 = zc9.j("no pkg ".concat(str), e4);
                            }
                        }
                    } catch (RemoteException | DynamiteModule$LoadingException e5) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } else {
                    zc9 = zc9.A;
                }
                if (zc9.x) {
                    break;
                }
                i3++;
            }
        }
        if (!zc9.x && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th4 = (Throwable) zc9.z;
            if (th4 != null) {
                Log.d("GoogleCertificatesRslt", zc9.f(), th4);
            } else {
                Log.d("GoogleCertificatesRslt", zc9.f());
            }
        }
        return zc9.x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0, types: [k93, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [p99, android.content.BroadcastReceiver] */
    /* JADX WARNING: Multi-variable type inference failed */
    public w89 c(x49 x49) {
        b89 b89 = (b89) this.b;
        b89 b892 = w89.j;
        if (b89 != b892) {
            q11 q11 = w89.i;
            q11.getClass();
            ? obj = new Object();
            obj.w = false;
            ConcurrentHashMap concurrentHashMap = q11.a;
            Context context = x49.b;
            String str = b89.d;
            if (str == null) {
                str = b89.a.apply(context);
                b89.d = str;
            }
            d89 d89 = (d89) concurrentHashMap.computeIfAbsent(str, new s89(x49, b89, obj));
            if (obj.w) {
                Context context2 = x49.b;
                ay4 ay4 = new ay4(22, q11);
                if (p99.a == null) {
                    synchronized (p99.class) {
                        try {
                            if (p99.a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new BroadcastReceiver(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new BroadcastReceiver(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                p99.a = ay4;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.a = d89.a;
            this.b = b892;
        }
        return (w89) this.a;
    }
}

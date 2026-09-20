package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: tp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tp5 {
    public static final tz2 a = new tz2(6);

    public static void a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0271, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0274, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0277, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0290, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x029e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        r6.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:185:0x0254, B:213:0x028c] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:187:0x0257, B:222:0x029a] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:189:0x025a, B:230:0x02a6] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x016e A[SYNTHETIC, Splitter:B:100:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a1 A[Catch:{ all -> 0x018f, all -> 0x019c, FileNotFoundException -> 0x018d, IOException -> 0x018b, IllegalStateException -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x028c A[SYNTHETIC, Splitter:B:213:0x028c] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x029a A[SYNTHETIC, Splitter:B:222:0x029a] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107 A[SYNTHETIC, Splitter:B:58:0x0107] */
    public static void b(Context context, Executor executor, sp5 sp5, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        FileInputStream fileInputStream;
        boolean z6;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        int i;
        au1 au1;
        FileInputStream b;
        Throwable th2;
        bu1[] bu1Arr;
        boolean z7;
        DataInputStream dataInputStream;
        Throwable th3;
        Context context2 = context;
        sp5 sp52 = sp5;
        Context applicationContext = context2.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context2.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        dataInputStream = new DataInputStream(new FileInputStream(file));
                        long readLong = dataInputStream.readLong();
                        dataInputStream.close();
                        if (readLong == packageInfo.lastUpdateTime) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            sp52.e(2, (Object) null);
                        }
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    if (z7) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context2.getPackageName());
                        hq5.c(context2, false);
                        return;
                    }
                }
                z7 = false;
                if (z7) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context2.getPackageName());
            byte[] bArr = ar7.w0;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            AssetManager assetManager = assets;
            au1 au12 = new au1(assetManager, executor, sp52, name, file2);
            byte[] bArr2 = (byte[]) au12.d;
            if (bArr2 == null) {
                au12.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (!file2.exists()) {
                    try {
                        if (!file2.createNewFile()) {
                            au12.c(4, (Serializable) null);
                        }
                    } catch (IOException unused2) {
                        z5 = true;
                        au12.c(4, (Serializable) null);
                    }
                } else if (!file2.canWrite()) {
                    au12.c(4, (Serializable) null);
                }
                au12.a = true;
                try {
                    fileInputStream = au12.b(assetManager, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    sp52.e(6, e);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    bu1[] bu1Arr2 = (bu1[]) au12.h;
                    try {
                        b = au12.b(assetManager, "dexopt/baseline.profm");
                        if (b == null) {
                        }
                    } catch (FileNotFoundException e2) {
                        sp52.e(9, e2);
                    } catch (IOException e3) {
                        sp52.e(7, e3);
                    } catch (IllegalStateException e4) {
                        au12.h = null;
                        sp52.e(8, e4);
                    } catch (Throwable th5) {
                        th2.addSuppressed(th5);
                    }
                } catch (IOException e5) {
                    sp52.e(7, e5);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    bu1[] bu1Arr22 = (bu1[]) au12.h;
                    b = au12.b(assetManager, "dexopt/baseline.profm");
                    if (b == null) {
                    }
                }
                if (fileInputStream != null) {
                    try {
                        if (Arrays.equals(bArr, r16.b0(fileInputStream, 4))) {
                            bu1Arr = ar7.R(fileInputStream, r16.b0(fileInputStream, 4), (String) au12.g);
                            try {
                                fileInputStream.close();
                            } catch (IOException e6) {
                                sp52.e(7, e6);
                            }
                            au12.h = bu1Arr;
                        } else {
                            throw new IllegalStateException("Invalid magic");
                        }
                    } catch (IOException e7) {
                        sp52.e(7, e7);
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            sp52.e(7, e8);
                        }
                        bu1Arr = null;
                        au12.h = bu1Arr;
                        bu1[] bu1Arr222 = (bu1[]) au12.h;
                        b = au12.b(assetManager, "dexopt/baseline.profm");
                        if (b == null) {
                        }
                    } catch (IllegalStateException e9) {
                        sp52.e(8, e9);
                        fileInputStream.close();
                        bu1Arr = null;
                        au12.h = bu1Arr;
                        bu1[] bu1Arr2222 = (bu1[]) au12.h;
                        b = au12.b(assetManager, "dexopt/baseline.profm");
                        if (b == null) {
                        }
                    } catch (Throwable th6) {
                        Throwable th7 = th6;
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            sp52.e(7, e10);
                        }
                        throw th7;
                    }
                }
                bu1[] bu1Arr22222 = (bu1[]) au12.h;
                if (bu1Arr22222 != null && ((i = Build.VERSION.SDK_INT) >= 31 || i == 24 || i == 25)) {
                    b = au12.b(assetManager, "dexopt/baseline.profm");
                    if (b == null) {
                        if (b != null) {
                            b.close();
                        }
                        au1 = null;
                        if (au1 != null) {
                        }
                    } else if (Arrays.equals(ar7.x0, r16.b0(b, 4))) {
                        au12.h = ar7.O(b, r16.b0(b, 4), bArr2, bu1Arr22222);
                        b.close();
                        au1 = au12;
                        if (au1 != null) {
                            au12 = au1;
                        }
                    } else {
                        throw new IllegalStateException("Invalid magic");
                    }
                }
                sp5 sp53 = (sp5) au12.c;
                bu1[] bu1Arr3 = (bu1[]) au12.h;
                byte[] bArr3 = (byte[]) au12.d;
                if (!(bu1Arr3 == null || bArr3 == null)) {
                    if (au12.a) {
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr3);
                            if (!ar7.b0(byteArrayOutputStream, bArr3, bu1Arr3)) {
                                sp53.e(5, (Object) null);
                                au12.h = null;
                                byteArrayOutputStream.close();
                            } else {
                                au12.e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                au12.h = null;
                            }
                        } catch (IOException e11) {
                            sp53.e(7, e11);
                        } catch (IllegalStateException e12) {
                            sp53.e(8, e12);
                        } catch (Throwable th8) {
                            th.addSuppressed(th8);
                        }
                    } else {
                        h.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        return;
                    }
                }
                byte[] bArr4 = (byte[]) au12.e;
                if (bArr4 == null) {
                    z6 = false;
                    z3 = true;
                } else if (au12.a) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream((File) au12.f);
                            try {
                                FileChannel channel = fileOutputStream.getChannel();
                                try {
                                    FileLock tryLock = channel.tryLock();
                                    if (tryLock != null) {
                                        try {
                                            if (tryLock.isValid()) {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr5, 0, read);
                                                }
                                                z3 = true;
                                                try {
                                                    au12.c(1, (Serializable) null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    try {
                                                        byteArrayInputStream.close();
                                                        au12.e = null;
                                                        au12.h = null;
                                                        z6 = true;
                                                    } catch (FileNotFoundException e13) {
                                                        e = e13;
                                                        au12.c(6, e);
                                                        au12.e = null;
                                                        au12.h = null;
                                                        z6 = false;
                                                        if (z6) {
                                                        }
                                                        z2 = z6;
                                                        if (z2) {
                                                        }
                                                        z4 = false;
                                                        hq5.c(context2, z4);
                                                        return;
                                                    } catch (IOException e14) {
                                                        e = e14;
                                                        try {
                                                            au12.c(7, e);
                                                            au12.e = null;
                                                            au12.h = null;
                                                            z6 = false;
                                                            if (z6) {
                                                            }
                                                            z2 = z6;
                                                            if (z2) {
                                                            }
                                                            z4 = false;
                                                            hq5.c(context2, z4);
                                                            return;
                                                        } catch (Throwable th9) {
                                                            au12.e = null;
                                                            au12.h = null;
                                                            throw th9;
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    Throwable th11 = th;
                                                    if (tryLock != null) {
                                                        tryLock.close();
                                                    }
                                                    throw th11;
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            z3 = true;
                                            Throwable th112 = th;
                                            if (tryLock != null) {
                                            }
                                            throw th112;
                                        }
                                    }
                                    z3 = true;
                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                } catch (Throwable th13) {
                                    th = th13;
                                    z3 = true;
                                    Throwable th14 = th;
                                    if (channel != null) {
                                    }
                                    throw th14;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                z3 = true;
                                Throwable th16 = th;
                                fileOutputStream.close();
                                throw th16;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            z3 = true;
                            Throwable th18 = th;
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th19) {
                                th18.addSuppressed(th19);
                            }
                            throw th18;
                        }
                    } catch (FileNotFoundException e15) {
                        e = e15;
                        z3 = true;
                        au12.c(6, e);
                        au12.e = null;
                        au12.h = null;
                        z6 = false;
                        if (z6) {
                        }
                        z2 = z6;
                        if (z2) {
                        }
                        z4 = false;
                        hq5.c(context2, z4);
                        return;
                    } catch (IOException e16) {
                        e = e16;
                        z3 = true;
                        au12.c(7, e);
                        au12.e = null;
                        au12.h = null;
                        z6 = false;
                        if (z6) {
                        }
                        z2 = z6;
                        if (z2) {
                        }
                        z4 = false;
                        hq5.c(context2, z4);
                        return;
                    }
                } else {
                    h.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    return;
                }
                if (z6) {
                    a(packageInfo, filesDir);
                }
                z2 = z6;
                if (z2 || !z) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                hq5.c(context2, z4);
                return;
            }
            z5 = true;
            z2 = false;
            if (z2) {
            }
            z4 = false;
            hq5.c(context2, z4);
            return;
            throw th2;
            throw th;
            throw th3;
        } catch (PackageManager.NameNotFoundException e17) {
            sp52.e(7, e17);
            hq5.c(context2, false);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: hq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hq5 {
    public static final m56 a = new Object();
    public static final Object b = new Object();
    public static s63 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return y4.b(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static s63 b() {
        s63 s63 = new s63(6);
        c = s63;
        a.j(s63);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        b();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x00f7 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public static void c(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        gq5 gq5;
        gq5 gq52;
        AssetFileDescriptor openFd;
        Throwable th;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    if (c != null) {
                        return;
                    }
                }
                int i = 0;
                try {
                    openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (openFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    openFd.close();
                } catch (IOException unused) {
                    z2 = false;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    if (i2 != 30) {
                        File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length = file.length();
                        if (!file.exists() || length <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (!file2.exists() || length2 <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        try {
                            long a2 = a(context);
                            File file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                gq5 = gq5.a(file3);
                            } else {
                                gq5 = null;
                            }
                            if (gq5 != null && gq5.c == a2) {
                                int i3 = gq5.b;
                                if (i3 != 2) {
                                    i = i3;
                                    if (z && z4 && i != 1) {
                                        i = 2;
                                    }
                                    if (gq5 != null && gq5.b == 2 && i == 1 && length < gq5.d) {
                                        i = 3;
                                    }
                                    gq52 = new gq5(1, i, a2, length2);
                                    if (gq5 == null || !gq5.equals(gq52)) {
                                        gq52.b(file3);
                                    }
                                    b();
                                    return;
                                }
                            }
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                            i = 2;
                            i = 3;
                            gq52 = new gq5(1, i, a2, length2);
                            gq52.b(file3);
                            b();
                            return;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            b();
                            return;
                        }
                    }
                }
                b();
                return;
            }
        }
        return;
        throw th;
    }
}

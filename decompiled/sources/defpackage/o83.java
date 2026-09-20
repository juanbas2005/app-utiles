package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import java.io.File;

/* renamed from: o83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o83 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ o9 x;

    public /* synthetic */ o83(o9 o9Var, int i) {
        this.w = i;
        this.x = o9Var;
    }

    public final Object b() {
        int i;
        m57 m57;
        int i2;
        hx5 hx5;
        int i3 = this.w;
        o9 o9Var = this.x;
        switch (i3) {
            case b85.b:
                Class cls = ActivityManager.class;
                Context context = (Context) o9Var.x;
                Bitmap.Config[] configArr = i.a;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService(cls);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                qa qaVar = new qa();
                if (d > 0.0d) {
                    Bitmap.Config[] configArr2 = i.a;
                    try {
                        Object systemService2 = context.getSystemService(cls);
                        systemService2.getClass();
                        ActivityManager activityManager = (ActivityManager) systemService2;
                        if ((context.getApplicationInfo().flags & 1048576) != 0) {
                            i2 = activityManager.getLargeMemoryClass();
                        } else {
                            i2 = activityManager.getMemoryClass();
                        }
                    } catch (Exception unused2) {
                        i2 = 256;
                    }
                    i = (int) (d * ((double) i2) * 1024.0d * 1024.0d);
                } else {
                    i = 0;
                }
                if (i > 0) {
                    m57 = new kg5(i, qaVar);
                } else {
                    m57 = new ji8(21, (Object) qaVar);
                }
                return new nx5(m57, qaVar);
            default:
                d63 d63 = d63.O;
                Context context2 = (Context) o9Var.x;
                synchronized (d63) {
                    try {
                        hx5 = d63.P;
                        if (hx5 == null) {
                            sp3 sp3 = nd2.w;
                            dn1 dn1 = aw1.a;
                            cm1 cm1 = cm1.y;
                            Bitmap.Config[] configArr3 = i.a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir != null) {
                                cacheDir.mkdirs();
                                File M = qd2.M(cacheDir);
                                String str = ae5.x;
                                ae5 l = tz2.l(M);
                                long j = 10485760;
                                try {
                                    File file = l.toFile();
                                    file.mkdir();
                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                    j = z65.q((long) (0.02d * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), 10485760, 262144000);
                                } catch (Exception unused3) {
                                }
                                hx5 hx52 = new hx5(j, cm1, sp3, l);
                                d63.P = hx52;
                                hx5 = hx52;
                            } else {
                                throw new IllegalStateException("cacheDir == null");
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                return hx5;
        }
    }
}

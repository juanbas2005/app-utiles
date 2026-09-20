package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ql2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ql2 {
    public static final kd4 a = new kd4(16);
    public static final ThreadPoolExecutor b;
    public static final Object c = new Object();
    public static final zt6 d = new zt6(0);

    static {
        i56 i56 = new i56(0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), i56);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((kl2) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052 A[Catch:{ all -> 0x00b2, all -> 0x007c, all -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005b A[SYNTHETIC, Splitter:B:34:0x005b] */
    public static pl2 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typeface;
        kd4 kd4 = a;
        Trace.beginSection(f55.v("getFontSync"));
        try {
            Typeface typeface2 = (Typeface) kd4.h(str);
            if (typeface2 != null) {
                return new pl2(typeface2);
            }
            try {
                cm2 a2 = jl2.a(context, list);
                List list2 = a2.b;
                int i3 = a2.a;
                if (i3 == 0) {
                    dm2[] dm2Arr = (dm2[]) list2.get(0);
                    if (dm2Arr != null) {
                        if (dm2Arr.length != 0) {
                            int length = dm2Arr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i5 = dm2Arr[i4].f;
                                if (i5 == 0) {
                                    i4++;
                                } else if (i5 >= 0) {
                                    i2 = i5;
                                }
                            }
                            if (i2 == 0) {
                            }
                        }
                    }
                    i2 = 1;
                    if (i2 == 0) {
                    }
                } else if (i3 == 1) {
                    i2 = -2;
                    if (i2 == 0) {
                        pl2 pl2 = new pl2(i2);
                        Trace.endSection();
                        return pl2;
                    }
                    if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                        dm2[] dm2Arr2 = (dm2[]) list2.get(0);
                        a35 a35 = mq7.a;
                        Trace.beginSection(f55.v("TypefaceCompat.createFromFontInfo"));
                        typeface = mq7.a.e(context, dm2Arr2, i);
                    } else {
                        a35 a352 = mq7.a;
                        Trace.beginSection(f55.v("TypefaceCompat.createFromFontInfoWithFallback"));
                        typeface = mq7.a.f(context, list2, i);
                        Trace.endSection();
                    }
                    if (typeface != null) {
                        kd4.l(str, typeface);
                        pl2 pl22 = new pl2(typeface);
                        Trace.endSection();
                        return pl22;
                    }
                    pl2 pl23 = new pl2(-3);
                    Trace.endSection();
                    return pl23;
                }
                i2 = -3;
                if (i2 == 0) {
                }
            } catch (PackageManager.NameNotFoundException unused) {
                pl2 pl24 = new pl2(-1);
                Trace.endSection();
                return pl24;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}

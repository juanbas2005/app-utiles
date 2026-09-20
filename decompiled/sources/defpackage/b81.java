package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;

/* renamed from: b81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class b81 implements zi0 {
    public static final int[] w = {2, 1, 4, 3};
    public static final /* synthetic */ int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i == 3) {
            return "DELEGATION";
        }
        if (i == 4) {
            return "SYNTHESIZED";
        }
        throw null;
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i == 3) {
            return "FATAL_ERROR";
        }
        if (i != 4) {
            return "null";
        }
        return "INVALID_PAYLOAD";
    }

    public static /* synthetic */ String D(int i) {
        if (i == 1) {
            return "Document";
        }
        if (i != 2) {
            return "null";
        }
        return "RenderOptions";
    }

    public static /* synthetic */ String E(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i == 3) {
            return "DELEGATION";
        }
        if (i != 4) {
            return "null";
        }
        return "SYNTHESIZED";
    }

    public static /* synthetic */ int[] F(int i) {
        int[] iArr = new int[i];
        System.arraycopy(x, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ int a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return i - i2;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i == 0) {
            throw null;
        } else if (i == i2) {
            return true;
        } else {
            return false;
        }
    }

    public static float d(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static ap4 e(yt2 yt2) {
        ap4 ap4 = new ap4();
        yt2.o0(ap4);
        return ap4;
    }

    public static be5 f(float f, float f2, float f3, float f4) {
        be5 be5 = new be5();
        be5.j(f, f2);
        be5.h(f3, f4);
        return be5;
    }

    public static ju5 g(long j, yy0 yy0) {
        return yy0.a(new jt0(j));
    }

    public static is7 h(Object obj, is7 is7, Object obj2, boolean z, int i) {
        return is7.a(is7, obj2, z, new hv2(25, obj), i);
    }

    public static ClassCastException j(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object k(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String l(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, sg2 sg2, String str2) {
        return str + sg2 + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, xo7 xo7, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(xo7);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap r(Class cls, wt wtVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, wtVar);
        return hashMap;
    }

    public static Map s(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.KotlinNothingValueException, java.lang.RuntimeException] */
    public static KotlinNothingValueException t(String str) {
        yb3.c(str);
        return new RuntimeException();
    }

    public static void u(wr0 wr0, long j) {
        wr0.D().p();
        wr0.e0(j);
    }

    public static void v(be5 be5, float f, float f2, float f3, float f4) {
        be5.c();
        be5.j(f, f2);
        be5.h(f3, f4);
    }

    public static /* synthetic */ void w(ab6 ab6) {
        boolean isTerminated;
        if (ab6 instanceof AutoCloseable) {
            ab6.close();
        } else if (ab6 instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) ab6;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (ab6 instanceof TypedArray) {
            ((TypedArray) ab6).recycle();
        } else if (ab6 instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) ab6).release();
        } else if (ab6 instanceof MediaDrm) {
            ((MediaDrm) ab6).release();
        } else {
            ku4.v();
        }
    }

    public static boolean x(String str, String str2, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.KotlinNothingValueException, java.lang.RuntimeException] */
    public static KotlinNothingValueException z(String str) {
        i84.b(str);
        return new RuntimeException();
    }
}

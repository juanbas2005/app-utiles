package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: o85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o85 {
    public static x83 a;
    public static final /* synthetic */ int b = 0;
    public static x83 c;

    public static long a(boolean z, int i, d40 d40, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        long j8;
        d40.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j9 = j2 + 900000;
                if (j6 < j9) {
                    return j9;
                }
            }
            return j6;
        } else if (z) {
            if (d40 == d40.x) {
                j8 = j * ((long) i);
            } else {
                j8 = (long) Math.scalb((float) j, i - 1);
            }
            if (j8 > 18000000) {
                j8 = 18000000;
            }
            return j2 + j8;
        } else if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
            } else {
                j7 = j2 + j5;
            }
            if (j4 == j5 || i2 != 0) {
                return j7;
            }
            return (j5 - j4) + j7;
        } else if (j2 == -1) {
            return Long.MAX_VALUE;
        } else {
            return j2 + j3;
        }
    }

    public static final m66 b(Throwable th) {
        th.getClass();
        return new m66(th);
    }

    public static void d(wy3 wy3, n85 n85, kc0 kc0, float f, int i) {
        float f2;
        n85 n852 = n85;
        if ((i & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        boolean z = n852 instanceof l85;
        rd2 rd2 = rd2.a;
        if (z) {
            ly5 ly5 = ((l85) n852).l;
            float f3 = ly5.a;
            long floatToRawIntBits = (((long) Float.floatToRawIntBits(ly5.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
            wy3 wy32 = wy3;
            wy32.H0(kc0, floatToRawIntBits, p(ly5), f2, rd2, (lt0) null, 3);
        } else if (n852 instanceof m85) {
            m85 m85 = (m85) n852;
            eh ehVar = m85.m;
            if (ehVar != null) {
                wy3.s(ehVar, kc0, f2, rd2, (lt0) null, 3);
                return;
            }
            l96 l96 = m85.l;
            float intBitsToFloat = Float.intBitsToFloat((int) (l96.h >> 32));
            float f4 = l96.a;
            long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(l96.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32);
            rd2 rd22 = rd2;
            long j = floatToRawIntBits2;
            wy3.z0(kc0, j, (((long) Float.floatToRawIntBits(l96.b())) << 32) | (((long) Float.floatToRawIntBits(l96.a())) & 4294967295L), (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32), f2, rd22, (lt0) null, 3);
        } else if (n852 instanceof k85) {
            wy3.s(((k85) n852).l, kc0, f2, rd2, (lt0) null, 3);
        } else {
            h.c();
        }
    }

    public static void e(wy3 wy3, n85 n85, long j) {
        n85 n852 = n85;
        if (n852 instanceof l85) {
            ly5 ly5 = ((l85) n852).l;
            float f = ly5.a;
            float f2 = ly5.b;
            wy3.E0(j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), p(ly5), 1.0f, 3);
            return;
        }
        wy3 wy32 = wy3;
        long j2 = j;
        boolean z = n852 instanceof m85;
        rd2 rd2 = rd2.a;
        if (z) {
            m85 m85 = (m85) n852;
            eh ehVar = m85.m;
            if (ehVar != null) {
                wy32.w0(ehVar, j2, rd2);
                return;
            }
            l96 l96 = m85.l;
            float intBitsToFloat = Float.intBitsToFloat((int) (l96.h >> 32));
            float f3 = l96.a;
            float f4 = l96.b;
            long floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
            long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(l96.b())) << 32) | (((long) Float.floatToRawIntBits(l96.a())) & 4294967295L);
            wy3 wy33 = wy32;
            long j3 = j2;
            long j4 = floatToRawIntBits;
            long j5 = floatToRawIntBits2;
            wy33.c0(j3, j4, j5, (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(intBitsToFloat))), rd2);
        } else if (n852 instanceof k85) {
            wy32.w0(((k85) n852).l, j2, rd2);
        } else {
            h.c();
        }
    }

    public static ArrayList g(Context context) {
        ActivityManager activityManager;
        Collection collection;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (collection = activityManager.getRunningAppProcesses()) == null) {
            collection = a42.w;
        }
        ArrayList u0 = dt0.u0(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new ep5(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, sg3.e(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ep5 h(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        Iterator it = g(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ep5) obj).b == myPid) {
                break;
            }
        }
        ep5 ep5 = (ep5) obj;
        if (ep5 != null) {
            return ep5;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if ((i < 28 || (str = Application.getProcessName()) == null) && (str = i95.q()) == null) {
            str = "";
        }
        return new ep5(str, myPid, 0, false);
    }

    public static final x83 i() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Pin", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(20.0f, 4.0f);
        be5.f(4.0f);
        be5.d(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        be5.n(12.0f);
        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        be5.g(16.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.m(6.0f);
        be5.d(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        be5.c();
        be5.j(7.64f, 15.0f);
        be5.f(6.49f);
        be5.n(-4.5f);
        be5.i(-0.9f, 0.66f);
        be5.i(-0.58f, -0.89f);
        be5.h(6.77f, 9.0f);
        be5.g(0.87f);
        be5.m(15.0f);
        be5.c();
        be5.j(13.5f, 15.0f);
        be5.f(9.61f);
        be5.n(-1.02f);
        be5.e(1.07f, -1.07f, 1.77f, -1.77f, 2.13f, -2.15f);
        be5.e(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f);
        be5.e(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f);
        be5.e(-0.52f, 0.0f, -0.8f, 0.39f, -0.9f, 0.72f);
        be5.i(-1.01f, -0.42f);
        be5.e(0.01f, -0.02f, 0.18f, -0.76f, 1.0f, -1.15f);
        be5.e(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f);
        be5.e(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f);
        be5.e(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f);
        be5.e(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f);
        be5.i(0.03f, 0.05f);
        be5.g(2.37f);
        be5.m(15.0f);
        be5.c();
        be5.j(18.75f, 14.15f);
        be5.d(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f);
        be5.e(-0.04f, 0.0f, -1.6f, 0.08f, -2.05f, -1.51f);
        be5.i(1.03f, -0.41f);
        be5.e(0.03f, 0.1f, 0.19f, 0.86f, 1.02f, 0.86f);
        be5.e(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f);
        be5.e(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f);
        be5.g(-0.5f);
        be5.n(-1.0f);
        be5.g(0.46f);
        be5.e(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f);
        be5.e(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f);
        be5.e(-0.5f, 0.0f, -0.74f, 0.32f, -0.85f, 0.64f);
        be5.i(-0.99f, -0.41f);
        be5.d(15.2f, 9.9f, 15.68f, 9.0f, 16.94f, 9.0f);
        be5.e(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f);
        be5.e(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f);
        be5.e(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f);
        be5.n(0.07f);
        be5.e(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f);
        be5.d(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final x83 j() {
        x83 x83 = c;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.SupportAgent", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        long j = jt0.b;
        ky6 ky6 = new ky6(j);
        be5 e = pb4.e(21.0f, 12.22f);
        e.d(21.0f, 6.73f, 16.74f, 3.0f, 12.0f, 3.0f);
        e.e(-4.69f, 0.0f, -9.0f, 3.65f, -9.0f, 9.28f);
        e.d(2.4f, 12.62f, 2.0f, 13.26f, 2.0f, 14.0f);
        e.n(2.0f);
        e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.g(0.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.i(0.0f, -4.81f);
        e.e(0.0f, -3.83f, 2.95f, -7.18f, 6.78f, -7.29f);
        e.e(3.96f, -0.12f, 7.22f, 3.06f, 7.22f, 7.0f);
        e.m(19.0f);
        e.g(-7.0f);
        e.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.n(0.0f);
        e.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.g(7.0f);
        e.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.n(-1.22f);
        e.e(0.59f, -0.31f, 1.0f, -0.92f, 1.0f, -1.64f);
        e.n(-2.3f);
        e.d(22.0f, 13.14f, 21.59f, 12.53f, 21.0f, 12.22f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        ky6 ky62 = new ky6(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new ie5(9.0f, 13.0f));
        arrayList.add(new qe5(-1.0f, 0.0f));
        arrayList.add(new me5(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f));
        arrayList.add(new me5(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f));
        w83.a(w83, arrayList, ky62, 14336);
        ky6 ky63 = new ky6(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new ie5(15.0f, 13.0f));
        arrayList2.add(new qe5(-1.0f, 0.0f));
        arrayList2.add(new me5(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f));
        arrayList2.add(new me5(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f));
        w83.a(w83, arrayList2, ky63, 14336);
        ky6 ky64 = new ky6(j);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new ie5(18.0f, 11.03f));
        arrayList3.add(new fe5(17.52f, 8.18f, 15.04f, 6.0f, 12.05f, 6.0f));
        arrayList3.add(new ne5(-3.03f, 0.0f, -6.29f, 2.51f, -6.03f, 6.45f));
        arrayList3.add(new ne5(2.47f, -1.01f, 4.33f, -3.21f, 4.86f, -5.89f));
        arrayList3.add(new fe5(12.19f, 9.19f, 14.88f, 11.0f, 18.0f, 11.03f));
        arrayList3.add(ee5.c);
        w83.a(w83, arrayList3, ky64, 14336);
        x83 b2 = w83.b();
        c = b2;
        return b2;
    }

    public static final ib1 k(a68 a68) {
        if (a68 instanceof ry2) {
            return ((ry2) a68).d();
        }
        return gb1.b;
    }

    public static final w58 l(a68 a68) {
        if (a68 instanceof ry2) {
            return ((ry2) a68).c();
        }
        return jo1.b;
    }

    public static final du7 m(du7 du7, boolean z) {
        du7.getClass();
        qo1 w = pe2.w(du7, z);
        if (w != null) {
            return w;
        }
        fu6 n = n(du7);
        if (n != null) {
            return n;
        }
        return du7.o0(false);
    }

    public static final fu6 n(du7 du7) {
        gg3 gg3;
        gg3 gg32;
        wo7 L = du7.L();
        if (L instanceof gg3) {
            gg3 = (gg3) L;
        } else {
            gg3 = null;
        }
        if (gg3 != null) {
            LinkedHashSet<vw3> linkedHashSet = gg3.x;
            ArrayList arrayList = new ArrayList(et0.e0(linkedHashSet, 10));
            boolean z = false;
            for (vw3 vw3 : linkedHashSet) {
                if (iq7.e(vw3)) {
                    vw3 = m(vw3.n0(), false);
                    z = true;
                }
                arrayList.add(vw3);
            }
            if (!z) {
                gg32 = null;
            } else {
                vw3 vw32 = gg3.w;
                if (vw32 == null) {
                    vw32 = null;
                } else if (iq7.e(vw32)) {
                    vw32 = m(vw32.n0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                gg32 = new gg3(linkedHashSet2);
                gg32.w = vw32;
            }
            if (gg32 != null) {
                return gg32.a();
            }
        }
        return null;
    }

    public static final ArrayList o(JsonArray jsonArray) {
        String str;
        jsonArray.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(jsonArray, 10));
        Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElement = (JsonElement) em3.e((JsonElement) it.next()).get((Object) "indexName");
            if (jsonElement != null) {
                JsonPrimitive f = em3.f(jsonElement);
                if (f instanceof JsonNull) {
                    str = null;
                } else {
                    str = f.getContent();
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            throw new IllegalArgumentException("Key indexName missing in object.\n Body: " + jsonArray);
        }
        return arrayList;
    }

    public static final long p(ly5 ly5) {
        float f = ly5.c - ly5.a;
        float f2 = ly5.d - ly5.b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void q(Object obj) {
        if (obj instanceof m66) {
            throw ((m66) obj).w;
        }
    }

    public static final Rect r(se3 se3) {
        return new Rect(se3.a, se3.b, se3.c, se3.d);
    }

    public static final RectF s(ly5 ly5) {
        return new RectF(ly5.a, ly5.b, ly5.c, ly5.d);
    }

    public static final ly5 t(Rect rect) {
        return new ly5((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static final ly5 u(RectF rectF) {
        return new ly5(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final String v(String str) {
        char c2;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                c2 = (char) (charAt + ' ');
            } else if (charAt < 0 || charAt >= 128) {
                c2 = Character.toLowerCase(charAt);
            } else {
                c2 = charAt;
            }
            if (c2 != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(str, 0, i);
        int length2 = str.length() - 1;
        if (i <= length2) {
            while (true) {
                char charAt2 = str.charAt(i);
                if ('A' <= charAt2 && charAt2 < '[') {
                    charAt2 = (char) (charAt2 + ' ');
                } else if (charAt2 < 0 || charAt2 >= 128) {
                    charAt2 = Character.toLowerCase(charAt2);
                }
                sb.append(charAt2);
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static final Object w(ye6 ye6, gq3 gq3) {
        ye6.getClass();
        gq3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zr3 D = i95.D(gq3);
        Iterator it = b35.n(D, b42.w).iterator();
        while (it.hasNext()) {
            zq4 zq4 = (zq4) it.next();
            linkedHashMap.put(zq4.a, zq4.b.a);
        }
        return D.deserialize(new v96(ye6, linkedHashMap));
    }

    public static final fu6 y(fu6 fu6, fu6 fu62) {
        fu6.getClass();
        fu62.getClass();
        if (gr8.N(fu6)) {
            return fu6;
        }
        return new t(fu6, fu62);
    }

    public abstract void A(rw8 rw8, rw8 rw82);

    public abstract boolean B(sw8 sw8, rw8 rw8, rw8 rw82);

    public abstract rw8 C(y99 y99);

    public abstract kw8 D(y99 y99);

    public abstract boolean E(sw8 sw8, Object obj, Object obj2);

    public abstract String c(byte[] bArr, int i, int i2);

    public abstract int f(String str, byte[] bArr, int i, int i2);

    public abstract v76 x(uo7 uo7, zw3 zw3);

    public abstract void z(rw8 rw8, Thread thread);
}

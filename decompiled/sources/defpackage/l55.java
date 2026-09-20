package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.SQLException;
import android.util.Log;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: l55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l55 {
    public static x83 a;
    public static x83 b;

    public static void A(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void B(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = o55.v("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                h.q(hl6.p(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                return;
            } else {
                str = o55.v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void C(int i, int i2) {
        if (i < 0 || i > i2) {
            h.l(E(i, i2, "index"));
        }
    }

    public static void D(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = E(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = E(i2, i3, "end index");
            } else {
                str = o55.v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String E(int i, int i2, String str) {
        if (i < 0) {
            return o55.v("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o55.v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        h.q(hl6.p(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[SYNTHETIC] */
    public static final java.lang.Object a(defpackage.g97 r6, defpackage.q50 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.nj6
            if (r0 == 0) goto L_0x0013
            r0 = r7
            nj6 r0 = (defpackage.nj6) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            nj6 r0 = new nj6
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r2) goto L_0x0027
            g97 r6 = r0.z
            defpackage.o85.q(r7)
            goto L_0x0040
        L_0x0027:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r6)
            r6 = 0
            return r6
        L_0x002e:
            defpackage.o85.q(r7)
        L_0x0031:
            r0.z = r6
            r0.B = r2
            lk5 r7 = defpackage.lk5.x
            java.lang.Object r7 = r6.c(r7, r0)
            p81 r1 = defpackage.p81.w
            if (r7 != r1) goto L_0x0040
            return r1
        L_0x0040:
            kk5 r7 = (defpackage.kk5) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L_0x0049:
            if (r4 >= r3) goto L_0x005b
            java.lang.Object r5 = r1.get(r4)
            qk5 r5 = (defpackage.qk5) r5
            boolean r5 = defpackage.ub5.a(r5)
            if (r5 != 0) goto L_0x0058
            goto L_0x0031
        L_0x0058:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x005b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l55.a(g97, q50):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r13v10, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r0v3, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r15 == r6) goto L_0x00c3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095 A[Catch:{ CancellationException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b A[Catch:{ CancellationException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f A[Catch:{ CancellationException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public static final Object b(g97 g97, wd7 wd7, kk5 kk5, int i, q50 q50) {
        qj6 qj6;
        int i2;
        g06 g06;
        long j;
        jx1 jx1;
        lj6 lj6;
        if (q50 instanceof qj6) {
            qj6 qj62 = (qj6) q50;
            int i3 = qj62.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qj62.E = i3 - Integer.MIN_VALUE;
                qj6 = qj62;
                Object obj = qj6.D;
                i2 = qj6.E;
                vs7 vs7 = vs7.a;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    qk5 qk5 = (qk5) dt0.w0(kk5.a);
                    j = qk5.a;
                    long j2 = qk5.c;
                    if (i > 2) {
                        lj6 = d63.M;
                    } else {
                        lj6 = d63.L;
                    }
                    wd7.a(j2, lj6);
                    ? obj3 = new Object();
                    obj3.w = 9205357640488583168L;
                    long b2 = g97.g().b();
                    rj6 rj6 = new rj6(j, obj3, (f61) null);
                    qj6.z = g97;
                    qj6.A = wd7;
                    qj6.B = obj3;
                    qj6.C = j;
                    qj6.E = 1;
                    obj = g97.j(b2, rj6, qj6);
                    g06 = obj3;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else if (i2 == 1) {
                    long j3 = qj6.C;
                    g06 g062 = qj6.B;
                    wd7 wd72 = qj6.A;
                    g97 g972 = qj6.z;
                    try {
                        o85.q(obj);
                        j = j3;
                        wd7 = wd72;
                        g97 = g972;
                        g06 = g062;
                    } catch (CancellationException e) {
                        e = e;
                        wd7 = wd72;
                        wd7.onCancel();
                        throw e;
                    }
                } else if (i2 == 2) {
                    wd7 = qj6.A;
                    g97 = qj6.z;
                    try {
                        o85.q(obj);
                        if (((Boolean) obj).booleanValue()) {
                            List list = g97.B.O.a;
                            int size = list.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                qk5 qk52 = (qk5) list.get(i4);
                                if (ub5.c(qk52)) {
                                    qk52.a();
                                }
                            }
                            wd7.b();
                            return vs7;
                        }
                        wd7.onCancel();
                        return vs7;
                    } catch (CancellationException e2) {
                        e = e2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jx1 = (jx1) obj;
                if (jx1 == null) {
                    jx1 = jx1.y;
                }
                if (jx1 != jx1.z) {
                    wd7.onCancel();
                    return vs7;
                } else if (jx1 == jx1.w) {
                    wd7.b();
                    return vs7;
                } else {
                    if (jx1 == jx1.x) {
                        wd7.e(g06.w);
                    }
                    oc4 oc4 = new oc4(wd7, 2);
                    qj6.z = g97;
                    qj6.A = wd7;
                    qj6.B = null;
                    qj6.E = 2;
                    obj = my1.f(g97, j, oc4, qj6);
                }
            }
        }
        qj6 = new h61(q50);
        Object obj4 = qj6.D;
        i2 = qj6.E;
        vs7 vs72 = vs7.a;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        jx1 = (jx1) obj4;
        if (jx1 == null) {
        }
        if (jx1 != jx1.z) {
        }
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int i3 = (j > jArr[i2] ? 1 : (j == jArr[i2] ? 0 : -1));
            if (i3 > 0) {
                i = i2 + 1;
            } else if (i3 >= 0) {
                return i2;
            } else {
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void d(vr2 vr2, Object obj, e81 e81) {
        UndeliveredElementException e = e(vr2, obj, (UndeliveredElementException) null);
        if (e != null) {
            bb0.p0(e81, e);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [kotlinx.coroutines.internal.UndeliveredElementException, java.lang.RuntimeException] */
    public static final UndeliveredElementException e(vr2 vr2, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            vr2.y(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            su0.b(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static final int f(float f) {
        return Math.round((float) Math.ceil((double) f));
    }

    public static int g(int i, int i2) {
        int i3 = i - i2;
        if (i3 > i2) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i > i2) {
            i5 *= i;
            if (i6 <= i3) {
                i5 /= i6;
                i6++;
            }
            i--;
        }
        while (i6 <= i3) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    public static float[] h(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        ku4.v();
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r13 = 0;
        r15 = 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[Catch:{ NumberFormatException -> 0x00aa }, LOOP:3: B:22:0x0068->B:41:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0095 A[SYNTHETIC] */
    public static xe5[] i(String str) {
        int i;
        String trim;
        float[] fArr;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str2.length()) {
            while (i4 < str2.length()) {
                char charAt = str2.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (!(charAt == 'e' || charAt == 'E')) {
                    trim = str2.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i6;
                                    while (true) {
                                        if (i11 < trim.length()) {
                                            char charAt2 = trim.charAt(i11);
                                            if (charAt2 != ' ') {
                                                if (charAt2 != 'E' && charAt2 != 'e') {
                                                    switch (charAt2) {
                                                        case ',':
                                                            break;
                                                        case '-':
                                                            if (i11 != i6 && i7 == 0) {
                                                            }
                                                        case '.':
                                                            if (i8 == 0) {
                                                                i7 = 0;
                                                                i8 = 1;
                                                                break;
                                                            }
                                                    }
                                                } else {
                                                    i7 = 1;
                                                    if (i9 != 0) {
                                                        i11++;
                                                    }
                                                }
                                            }
                                            i7 = 0;
                                            i9 = 1;
                                            if (i9 != 0) {
                                            }
                                        }
                                    }
                                    if (i6 < i11) {
                                        fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                        i5++;
                                    }
                                    if (i10 != 0) {
                                        i6 = i11;
                                    } else {
                                        i6 = i11 + 1;
                                    }
                                    i2 = 0;
                                }
                                fArr = h(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                ku4.o(f21.h("error in parsing \"", trim, "\""), e);
                                return null;
                            }
                        }
                        arrayList.add(new xe5(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str2.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str2.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new xe5(str2.charAt(i3), new float[0]));
        }
        return (xe5[]) arrayList.toArray(new xe5[i]);
    }

    public static final dj0 j(dj0 dj0, p16 p16, List list, boolean z) {
        p16.getClass();
        List parameters = p16.getParameters();
        if (parameters == null || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (g18.i(((t16) it.next()).y())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (g18.i(p16.k())) {
            return new x18(dj0, p16, list, z);
        }
        return dj0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        if (r2.e() == false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c1  */
    public static final k98 k(yt2 yt2) {
        bc8 bc8;
        Context context;
        Object Q;
        al2 al2;
        boolean z;
        al2 al22;
        boolean z2;
        boolean z3;
        zk2 zk2;
        boolean z4;
        n98 n98;
        ct6 ct6;
        yt2 yt22 = yt2;
        al2 al23 = al2.z;
        al2 al24 = al2.y;
        yt22.e0(280825064);
        long p = ((tp1) yt22.k(xy0.h)).p(pv8.O(((k44) ((w98) yt22.k(xy0.v))).a()));
        boolean z5 = false;
        yt22.r(false);
        int i = bc8.c;
        Set set = rx1.a;
        Set set2 = nx1.a;
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (lx1.a(px1.b(p), ((lx1) next).w) >= 0) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float f = ((lx1) it.next()).w;
            while (it.hasNext()) {
                f = Math.max(f, ((lx1) it.next()).w);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : set2) {
                if (lx1.a(px1.a(p), ((lx1) next2).w) >= 0) {
                    arrayList2.add(next2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                float f2 = ((lx1) it2.next()).w;
                while (it2.hasNext()) {
                    f2 = Math.max(f2, ((lx1) it2.next()).w);
                }
                bc8 = new bc8((int) f, (int) f2);
                context = (Context) yt22.k(ye.b);
                boolean g = yt22.g(context);
                Q = yt22.Q();
                if (g || Q == ay0.a) {
                    z98.n.getClass();
                    context.getClass();
                    n98 = (n98) y98.b.getValue();
                    if (n98 == null) {
                        et6 et6 = et6.c;
                        if (et6.c == null) {
                            ReentrantLock reentrantLock = et6.d;
                            reentrantLock.lock();
                            try {
                                if (et6.c == null) {
                                    try {
                                        g48 b2 = bt6.b();
                                        if (b2 != null) {
                                            g48 g48 = g48.B;
                                            g48.getClass();
                                            Object value = b2.A.getValue();
                                            value.getClass();
                                            Object value2 = g48.A.getValue();
                                            value2.getClass();
                                            if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                                ct6 = new ct6(context);
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    ct6 = null;
                                    et6.c = new et6(ct6);
                                }
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                        n98 = et6.c;
                        n98.getClass();
                    }
                    ub8 ub8 = new ub8();
                    s63 s63 = new s63(14);
                    ma2.a();
                    ay4 ay4 = new ay4(ub8, n98, s63);
                    y98.c.getClass();
                    xi0 w = gr8.w(new pd7(ay4, context, (f61) null, 8));
                    dn1 dn1 = aw1.a;
                    Q = new c6(gr8.L(w, pe4.a), 3);
                    yt22.o0(Q);
                }
                zk2 zk22 = zk2.z;
                bl2 bl2 = bl2.d;
                ArrayList arrayList3 = new ArrayList();
                boolean z6 = false;
                for (qy2 qy2 : (List) u55.e((di2) Q, a42.w, (e81) null, yt22, 48, 2).getValue()) {
                    gb0 gb0 = qy2.a;
                    if (gb0.b() > gb0.a()) {
                        al2 = al23;
                    } else {
                        al2 = al24;
                    }
                    gb0 gb02 = qy2.a;
                    bl2 bl22 = qy2.c;
                    if (al2 == al23 && bl22 == bl2) {
                        z6 = true;
                    }
                    ly5 t = o85.t(gb02.c());
                    if (bl22 != bl2.c) {
                        z = z5;
                    } else {
                        z = true;
                    }
                    gb0 gb03 = qy2.a;
                    if (gb03.b() > gb03.a()) {
                        al22 = al23;
                    } else {
                        al22 = al24;
                    }
                    if (al22 != al24) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    py2 py2 = qy2.b;
                    if (py2 == py2.z || (py2 == py2.y && bl22 == bl2)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (gb02.b() == 0 || gb02.a() == 0) {
                        zk2 = zk2.y;
                    } else {
                        zk2 = zk22;
                    }
                    if (zk2 != zk22) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    arrayList3.add(new a03(t, z, z2, z3, z4));
                    z5 = false;
                }
                return new k98(bc8, new km5(arrayList3, z6));
            }
            rf2.c();
        } else {
            rf2.c();
        }
        bc8 = null;
        context = (Context) yt22.k(ye.b);
        boolean g2 = yt22.g(context);
        Q = yt22.Q();
        z98.n.getClass();
        context.getClass();
        n98 = (n98) y98.b.getValue();
        if (n98 == null) {
        }
        ub8 ub82 = new ub8();
        s63 s632 = new s63(14);
        ma2.a();
        ay4 ay42 = new ay4(ub82, n98, s632);
        y98.c.getClass();
        xi0 w2 = gr8.w(new pd7(ay42, context, (f61) null, 8));
        dn1 dn12 = aw1.a;
        Q = new c6(gr8.L(w2, pe4.a), 3);
        yt22.o0(Q);
        zk2 zk222 = zk2.z;
        bl2 bl23 = bl2.d;
        ArrayList arrayList32 = new ArrayList();
        boolean z62 = false;
        while (r0.hasNext()) {
        }
        return new k98(bc8, new km5(arrayList32, z62));
    }

    public static final Object l(dl5 dl5, String str, h61 h61) {
        Object d = dl5.d(str, new ha7(14), h61);
        if (d == p81.w) {
            return d;
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        defpackage.dh4.f(r1, r2);
     */
    public static final void m(ua6 ua6, String str) {
        ua6.getClass();
        ab6 k0 = ua6.k0(str);
        k0.i0();
        dh4.f(k0, (Throwable) null);
    }

    public static final Method n(Class cls, p16 p16) {
        p16.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", (Class[]) null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            h.m("No unbox method found in inline class: ", cls, " (calling ", p16);
            return null;
        }
    }

    public static int o(int[] iArr, int i, boolean z) {
        boolean z2;
        int[] iArr2 = iArr;
        int i2 = i;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i10 = 1;
            while (i10 < iArr2[i5]) {
                int i11 = i3 - i10;
                int i12 = length - i5;
                int i13 = i12 - 2;
                int g = g(i11 - 1, i13);
                if (z && i7 == 0) {
                    int i14 = i12 - 1;
                    if (i11 - i14 >= i14) {
                        g -= g(i11 - i12, i13);
                    }
                }
                boolean z3 = true;
                if (i12 - 1 > 1) {
                    int i15 = i11 - i13;
                    int i16 = 0;
                    while (i15 > i2) {
                        i16 += g((i11 - i15) - 1, i12 - 3);
                        i15--;
                        int[] iArr3 = iArr;
                        z3 = z3;
                    }
                    z2 = z3;
                    g -= (i8 - i5) * i16;
                } else {
                    z2 = true;
                    if (i11 > i2) {
                        g--;
                    }
                }
                i6 += g;
                i10++;
                i7 &= ~i9;
                iArr2 = iArr;
                boolean z4 = z2;
            }
            i3 -= i10;
            i5++;
            iArr2 = iArr;
        }
    }

    public static boolean p(Context context, int i) {
        if (z(context, "com.google.android.gms", i)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                uw2 a2 = uw2.a(context);
                a2.getClass();
                if (packageInfo != null) {
                    if (!uw2.d(packageInfo, false)) {
                        if (uw2.d(packageInfo, true)) {
                            if (!rw2.a((Context) a2.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static final boolean q(as3 as3) {
        gq3 gq3;
        if (as3.v()) {
            return false;
        }
        vq3 J = as3.J();
        Class cls = null;
        if (J instanceof gq3) {
            gq3 = (gq3) J;
        } else {
            gq3 = null;
        }
        if (gq3 != null) {
            cls = kl8.w(gq3);
        }
        if (cls == null || cls.equals(Void.TYPE)) {
            return false;
        }
        return true;
    }

    public static final boolean r(u16 u16) {
        oq3 oq3;
        gu3 d0;
        u16.getClass();
        List<t16> a2 = u16.a();
        if (a2 == null || !a2.isEmpty()) {
            for (t16 u : a2) {
                if (u.u() != qr3.w) {
                    return false;
                }
            }
        }
        String name = u16.getName();
        yq3 B = u16.B();
        String str = null;
        if (B instanceof oq3) {
            oq3 = (oq3) B;
        } else {
            oq3 = null;
        }
        if (!(oq3 == null || (d0 = oq3.d0()) == null)) {
            str = d0.m;
        }
        if (sg3.e(name, str)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: oj6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: oj6} */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object, d06] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0166, code lost:
        if (r3 == r13) goto L_0x0168;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public static final Object s(g97 g97, zc9 zc9, ig igVar, kk5 kk5, q50 q50) {
        oj6 oj6;
        Object obj;
        int i;
        d06 d06;
        lj6 lj6;
        boolean z;
        u44 u44;
        lj6 lj62;
        boolean z2;
        g97 g972 = g97;
        zc9 zc92 = zc9;
        kk5 kk52 = kk5;
        q50 q502 = q50;
        lj6 lj63 = d63.K;
        if (q502 instanceof oj6) {
            oj6 oj62 = (oj6) q502;
            int i2 = oj62.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oj62.D = i2 - Integer.MIN_VALUE;
                oj6 = oj62;
                oj6 oj63 = oj6;
                obj = oj63.C;
                i = oj63.D;
                int i3 = 0;
                if (i != 0) {
                    o85.q(obj);
                    qk5 qk5 = (qk5) kk52.a.get(0);
                    int i4 = kk52.e & 1;
                    Object obj2 = p81.w;
                    if (i4 != 0) {
                        long j = qk5.c;
                        ze7 ze7 = (ze7) zc92.z;
                        u44 u442 = ze7.d;
                        if (u442 == null || u442.d() == null || !ze7.k()) {
                            z2 = false;
                        } else {
                            ze7.t = -1;
                            ok2 ok2 = ze7.l;
                            if (ok2 != null) {
                                ok2.a(ok2);
                            }
                            zc92.e(ze7.n(), j, false, d63.K);
                            z2 = true;
                        }
                        if (z2) {
                            qk5.a();
                            long j2 = qk5.a;
                            ay5 ay5 = new ay5(12, (Object) zc92);
                            oj63.z = g972;
                            oj63.A = zc92;
                            oj63.D = 1;
                            obj = my1.f(g972, j2, ay5, oj63);
                            if (obj == obj2) {
                            }
                        }
                        return vs7.a;
                    }
                    int i5 = igVar.b;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            lj62 = d63.M;
                        } else {
                            lj62 = d63.L;
                        }
                        lj6 = lj62;
                    } else {
                        lj6 = lj63;
                    }
                    long j3 = qk5.c;
                    ze7 ze72 = (ze7) zc92.z;
                    if (!ze72.k() || ze72.n().a.x.length() == 0 || (u44 = ze72.d) == null || u44.d() == null) {
                        z = false;
                    } else {
                        ok2 ok22 = ze72.l;
                        if (ok22 != null) {
                            ok2.a(ok22);
                        }
                        ze72.o = j3;
                        ze72.t = -1;
                        ze72.h(true);
                        long e = zc92.e(ze72.n(), ze72.o, true, lj6);
                        if (i5 >= 2) {
                            zc92.x = true;
                            zc92.y = new lg7(e);
                        }
                        z = true;
                    }
                    if (z) {
                        ? obj3 = new Object();
                        obj3.w = !lj6.equals(lj63);
                        long j4 = qk5.a;
                        g5 g5Var = new g5((Object) zc92, (Object) lj6, (Object) obj3, 25);
                        oj63.z = g972;
                        oj63.A = zc92;
                        oj63.B = obj3;
                        oj63.D = 2;
                        obj = my1.f(g972, j4, g5Var, oj63);
                        d06 = obj3;
                    }
                    return vs7.a;
                    return obj2;
                } else if (i == 1) {
                    zc92 = oj63.A;
                    g972 = oj63.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        zc92.d();
                        throw th;
                    }
                } else if (i == 2) {
                    d06 d062 = oj63.B;
                    zc92 = oj63.A;
                    g97 g973 = oj63.z;
                    try {
                        o85.q(obj);
                        g97 g974 = g973;
                        d06 = d062;
                        g972 = g974;
                        if (((Boolean) obj).booleanValue() && d06.w) {
                            List list = g972.B.O.a;
                            int size = list.size();
                            while (i3 < size) {
                                qk5 qk52 = (qk5) list.get(i3);
                                if (ub5.c(qk52)) {
                                    qk52.a();
                                }
                                i3++;
                            }
                        }
                        zc92.d();
                        return vs7.a;
                    } catch (Throwable th2) {
                        zc92.d();
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((Boolean) obj).booleanValue()) {
                    List list2 = g972.B.O.a;
                    int size2 = list2.size();
                    while (i3 < size2) {
                        qk5 qk53 = (qk5) list2.get(i3);
                        if (ub5.c(qk53)) {
                            qk53.a();
                        }
                        i3++;
                    }
                }
                zc92.d();
                return vs7.a;
            }
        }
        oj6 = new h61(q502);
        oj6 oj632 = oj6;
        obj = oj632.C;
        i = oj632.D;
        int i32 = 0;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        zc92.d();
        return vs7.a;
    }

    public static final void t(js jsVar, vr2 vr2) {
        jsVar.getClass();
        zt6 zt6 = new zt6(999);
        int i = jsVar.y;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            zt6.put(jsVar.g(i2), jsVar.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                vr2.y(zt6);
                zt6.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            vr2.y(zt6);
        }
    }

    public static final String u(int i, yt2 yt2) {
        return ((Resources) yt2.k(ye.c)).getString(i);
    }

    public static final String v(int i, Object[] objArr, yt2 yt2) {
        return ((Resources) yt2.k(ye.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void w(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final Class x(as3 as3) {
        vq3 vq3;
        gq3 gq3;
        if (as3 != null) {
            vq3 = as3.J();
        } else {
            vq3 = null;
        }
        if (vq3 instanceof gq3) {
            gq3 = (gq3) vq3;
        } else {
            gq3 = null;
        }
        if (gq3 != null && gq3.z()) {
            if (!g18.k(as3)) {
                return kl8.u(gq3);
            }
            as3 s = g18.s(as3);
            if (s != null && !g18.k(s) && !q(s)) {
                return kl8.u(gq3);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r15 == r6) goto L_0x00a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ CancellationException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public static final Object y(g97 g97, wd7 wd7, kk5 kk5, q50 q50) {
        pj6 pj6;
        int i;
        qk5 qk5;
        qk5 qk52;
        boolean z;
        if (q50 instanceof pj6) {
            pj6 pj62 = (pj6) q50;
            int i2 = pj62.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pj62.D = i2 - Integer.MIN_VALUE;
                pj6 = pj62;
                Object obj = pj6.C;
                i = pj6.D;
                Object obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    qk5 = (qk5) dt0.w0(kk5.a);
                    long j = qk5.a;
                    pj6.z = g97;
                    pj6.A = wd7;
                    pj6.B = qk5;
                    pj6.D = 1;
                    obj = my1.b(g97, j, pj6);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else if (i == 1) {
                    qk5 qk53 = pj6.B;
                    wd7 = pj6.A;
                    g97 g972 = pj6.z;
                    o85.q(obj);
                    g97 g973 = g972;
                    qk5 = qk53;
                    g97 = g973;
                } else if (i == 2) {
                    wd7 = pj6.A;
                    g97 = pj6.z;
                    try {
                        o85.q(obj);
                        if (((Boolean) obj).booleanValue()) {
                            List list = g97.B.O.a;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                qk5 qk54 = (qk5) list.get(i3);
                                if (ub5.c(qk54)) {
                                    qk54.a();
                                }
                            }
                            wd7.b();
                        } else {
                            wd7.onCancel();
                        }
                        return vs7.a;
                    } catch (CancellationException e) {
                        wd7.onCancel();
                        throw e;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qk52 = (qk5) obj;
                if (qk52 != null) {
                    long j2 = qk52.c;
                    if (l35.c(l35.d(qk5.c, j2)) < my1.h(g97.g(), qk5.i)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        wd7.a(j2, sj6.a);
                        long j3 = qk52.a;
                        oc4 oc4 = new oc4(wd7, 1);
                        pj6.z = g97;
                        pj6.A = wd7;
                        pj6.B = null;
                        pj6.D = 2;
                        obj = my1.f(g97, j3, oc4, pj6);
                    }
                }
                return vs7.a;
            }
        }
        pj6 = new h61(q50);
        Object obj3 = pj6.C;
        i = pj6.D;
        Object obj22 = p81.w;
        if (i != 0) {
        }
        qk52 = (qk5) obj3;
        if (qk52 != null) {
        }
        return vs7.a;
    }

    public static boolean z(Context context, String str, int i) {
        tb1 a2 = cf8.a(context);
        a2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: jb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jb5 {
    public static x83 a;
    public static Boolean b;
    public static x83 c;

    public static final long A(long j, long j2) {
        return mh2.a(r(j) - r(j2), s(j) - s(j2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static List B(jv6 jv6, int i, jv6 jv62, boolean z, boolean z2, boolean z3) {
        boolean z4;
        a42 a42;
        boolean z5;
        int i2;
        boolean z6;
        int i3;
        int i4;
        jv6 jv63 = jv6;
        int i5 = i;
        jv6 jv64 = jv62;
        int u = jv6.u(i);
        int i6 = i5 + u;
        int f = jv6.f(i);
        int f2 = jv63.f(i6);
        int i7 = f2 - f;
        if (i5 < 0 || (jv63.b[(jv6.r(i) * 5) + 1] & 201326592) == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        jv64.w(u);
        jv64.x(i7, jv64.t);
        if (jv63.g < i6) {
            jv63.B(i6);
        }
        if (jv63.k < f2) {
            jv63.C(f2, i6);
        }
        int[] iArr = jv64.b;
        int i8 = jv64.t;
        int i9 = i8 * 5;
        qs.J0(i9, i5 * 5, i6 * 5, jv63.b, iArr);
        Object[] objArr = jv64.c;
        int i10 = jv64.i;
        System.arraycopy(jv63.c, f, objArr, i10, i7);
        int i11 = jv64.v;
        iArr[i9 + 2] = i11;
        int i12 = i8 - i5;
        int i13 = i8 + u;
        int g = i10 - jv64.g(iArr, i8);
        int i14 = jv64.m;
        int i15 = jv64.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i16 = i14;
        int i17 = i9;
        int i18 = i8;
        while (i18 < i13) {
            if (i18 != i8) {
                int i19 = (i18 * 5) + 2;
                iArr[i19] = iArr[i19] + i12;
            }
            int[] iArr2 = iArr;
            int g2 = jv64.g(iArr, i18) + g;
            if (i16 < i18) {
                i3 = i8;
                i4 = 0;
            } else {
                i3 = i8;
                i4 = jv64.k;
            }
            iArr2[(i18 * 5) + 4] = jv6.i(g2, i4, i15, length);
            if (i18 == i16) {
                i16++;
            }
            i18++;
            i8 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        jv64.m = i16;
        int a2 = iv6.a(jv63.d, i5, jv63.p());
        int a3 = iv6.a(jv63.d, i6, jv63.p());
        if (a2 < a3) {
            ArrayList arrayList = jv63.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i20 = a2; i20 < a3; i20++) {
                st2 st2 = (st2) arrayList.get(i20);
                st2.a += i12;
                arrayList2.add(st2);
            }
            jv64.d.addAll(iv6.a(jv64.d, jv64.t, jv64.p()), arrayList2);
            arrayList.subList(a2, a3).clear();
            a42 = arrayList2;
        } else {
            a42 = a42.w;
        }
        if (!a42.isEmpty()) {
            HashMap hashMap = jv63.e;
            HashMap hashMap2 = jv64.e;
            if (!(hashMap == null || hashMap2 == null)) {
                int size = a42.size();
                for (int i21 = 0; i21 < size; i21++) {
                    au2 au2 = (au2) hashMap.get((st2) a42.get(i21));
                }
            }
        }
        int i22 = jv64.v;
        jv64.Q(i11);
        int G = jv63.G(jv63.b, i5);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (G >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                jv63.R();
                jv63.a(G - jv63.t);
                jv63.R();
            }
            jv63.a(i5 - jv63.t);
            boolean J = jv63.J();
            if (z6) {
                jv63.O();
                jv63.j();
                jv63.O();
                jv63.j();
            }
            z5 = J;
        } else {
            boolean K = jv63.K(i5, u);
            jv63.L(f, i7, i5 - 1);
            z5 = K;
        }
        if (z5) {
            ey0.a("Unexpectedly removed anchors");
        }
        int i23 = jv64.o;
        int i24 = iArr3[i17 + 1];
        if ((1073741824 & i24) != 0) {
            i2 = 1;
        } else {
            i2 = i24 & 67108863;
        }
        jv64.o = i23 + i2;
        if (z2) {
            jv64.t = i13;
            jv64.i = i10 + i7;
        }
        if (z7) {
            jv64.W(i11);
        }
        return a42;
    }

    public static final long D(long j, long j2) {
        return mh2.a(r(j2) + r(j), s(j2) + s(j));
    }

    public static final vw3 E(vw3 vw3, rm rmVar) {
        if (!vw3.getAnnotations().isEmpty() || !rmVar.isEmpty()) {
            return vw3.n0().v0(b85.r(vw3.J(), rmVar));
        }
        return vw3;
    }

    public static final du7 F(vw3 vw3) {
        fu6 fu6;
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof zg2) {
            zg2 zg2 = (zg2) n0;
            fu6 fu62 = zg2.x;
            if (!fu62.L().getParameters().isEmpty() && fu62.L().u() != null) {
                List<qp7> parameters = fu62.L().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(et0.e0(parameters, 10));
                for (qp7 p27 : parameters) {
                    arrayList.add(new p27(p27));
                }
                fu62 = wn6.v(fu62, arrayList, (ro7) null, 2);
            }
            fu6 fu63 = zg2.y;
            if (!fu63.L().getParameters().isEmpty() && fu63.L().u() != null) {
                List<qp7> parameters2 = fu63.L().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(et0.e0(parameters2, 10));
                for (qp7 p272 : parameters2) {
                    arrayList2.add(new p27(p272));
                }
                fu63 = wn6.v(fu63, arrayList2, (ro7) null, 2);
            }
            fu6 = kl8.n(fu62, fu63);
        } else if (n0 instanceof fu6) {
            fu6 fu64 = (fu6) n0;
            boolean isEmpty = fu64.L().getParameters().isEmpty();
            fu6 = fu64;
            if (!isEmpty) {
                vq0 u = fu64.L().u();
                fu6 = fu64;
                if (u != null) {
                    List<qp7> parameters3 = fu64.L().getParameters();
                    parameters3.getClass();
                    ArrayList arrayList3 = new ArrayList(et0.e0(parameters3, 10));
                    for (qp7 p273 : parameters3) {
                        arrayList3.add(new p27(p273));
                    }
                    fu6 = wn6.v(fu64, arrayList3, (ro7) null, 2);
                }
            }
        } else {
            h.c();
            return null;
        }
        return ub5.m(fu6, n0);
    }

    public static int G(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final long H(float f, long j) {
        return mh2.a(r(j) * f, s(j) * f);
    }

    public static final long I(long j, jk5 jk5) {
        long i = jk5.i(r(j), s(j));
        return mh2.a(Float.intBitsToFloat((int) (i >> 32)), Float.intBitsToFloat((int) (i & 4294967295L)));
    }

    public static String J(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static void K(String str, Object obj) {
        if (obj == null) {
            ku4.j(str.concat(" must not be null"));
        }
    }

    public static final Object a(a96 a96, vr2 vr2, f61 f61) {
        h81 h81;
        if (a96.k() && a96.n() && a96.l()) {
            return vr2.y(f61);
        }
        if (f61.r().a0(pk0.y) == null) {
            return vr2.y(f61);
        }
        k05 k05 = new k05((Object) vr2, (f61) null, 12);
        il7 il7 = (il7) f61.r().a0(il7.x);
        if (il7 != null) {
            h81 = il7.w;
        } else {
            h81 = null;
        }
        if (h81 != null) {
            return ar7.e0(h81, k05, f61);
        }
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        try {
            ol6 ol6 = a96.d;
            if (ol6 != null) {
                ol6.execute(new z46(kk0, a96, false, k05, 2));
                return kk0.t();
            }
            sg3.a0("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e) {
            kk0.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
    }

    public static final Collection b(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final boolean c(vw3 vw3, wo7 wo7, Set set) {
        wq0 wq0;
        List list;
        qp7 qp7;
        boolean z;
        if (sg3.e(vw3.L(), wo7)) {
            return true;
        }
        vq0 u = vw3.L().u();
        if (u instanceof wq0) {
            wq0 = (wq0) u;
        } else {
            wq0 = null;
        }
        if (wq0 != null) {
            list = wq0.u0();
        } else {
            list = null;
        }
        ss h1 = dt0.h1(vw3.G());
        if (!(h1 instanceof Collection) || !((Collection) h1).isEmpty()) {
            Iterator it = h1.iterator();
            do {
                f02 f02 = (f02) it;
                if (f02.x.hasNext()) {
                    ka3 ka3 = (ka3) f02.next();
                    int i = ka3.a;
                    xp7 xp7 = (xp7) ka3.b;
                    if (list != null) {
                        qp7 = (qp7) dt0.z0(i, list);
                    } else {
                        qp7 = null;
                    }
                    if ((qp7 == null || set == null || !set.contains(qp7)) && !xp7.c()) {
                        vw3 b2 = xp7.b();
                        b2.getClass();
                        z = c(b2, wo7, set);
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                }
            } while (!z);
            return true;
        }
        return false;
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            zb3.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            zb3.a("invalid end value");
        }
        if (i3 < 0) {
            zb3.a("invalid maxLines value");
        }
        if (i < 0) {
            zb3.a("invalid width value");
        }
        if (i4 < 0) {
            zb3.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents((int[]) null, (int[]) null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            obtain.setLineBreakConfig(v4.c().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final p27 e(vw3 vw3, k28 k28, qp7 qp7) {
        k28 k282;
        vw3.getClass();
        if (qp7 != null) {
            k282 = qp7.I();
        } else {
            k282 = null;
        }
        if (k282 == k28) {
            k28 = k28.y;
        }
        return new p27(vw3, k28);
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static final long g(float f, long j) {
        return mh2.a(r(j) / f, s(j) / f);
    }

    public static final float h(long j, long j2) {
        float r = r(j);
        return (s(j2) * s(j)) + (r(j2) * r);
    }

    public static final float i(ob5 ob5) {
        if (ob5.m().e == z75.x) {
            return Float.intBitsToFloat((int) (ob5.q() >> 32));
        }
        return Float.intBitsToFloat((int) (ob5.q() & 4294967295L));
    }

    public static final void j(vw3 vw3, fu6 fu6, LinkedHashSet linkedHashSet, Set set) {
        wq0 wq0;
        List list;
        qp7 qp7;
        vq0 u = vw3.L().u();
        if (!(u instanceof qp7)) {
            vq0 u2 = vw3.L().u();
            if (u2 instanceof wq0) {
                wq0 = (wq0) u2;
            } else {
                wq0 = null;
            }
            if (wq0 != null) {
                list = wq0.u0();
            } else {
                list = null;
            }
            int i = 0;
            for (xp7 xp7 : vw3.G()) {
                int i2 = i + 1;
                if (list != null) {
                    qp7 = (qp7) dt0.z0(i, list);
                } else {
                    qp7 = null;
                }
                if ((qp7 == null || set == null || !set.contains(qp7)) && !xp7.c() && !dt0.q0(linkedHashSet, xp7.b().L().u()) && !sg3.e(xp7.b().L(), fu6.L())) {
                    vw3 b2 = xp7.b();
                    b2.getClass();
                    j(b2, fu6, linkedHashSet, set);
                }
                i = i2;
            }
        } else if (!sg3.e(vw3.L(), fu6.L())) {
            linkedHashSet.add(u);
        } else {
            for (vw3 vw32 : ((qp7) u).getUpperBounds()) {
                vw32.getClass();
                j(vw32, fu6, linkedHashSet, set);
            }
        }
    }

    public static final fv3 k(vw3 vw3) {
        vw3.getClass();
        fv3 g = vw3.L().g();
        g.getClass();
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[Catch:{ IllegalAccessException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ IllegalAccessException -> 0x0110 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d A[Catch:{ IllegalAccessException -> 0x0110 }] */
    public static final Object l(u16 u16, Member member) {
        Object obj;
        AccessibleObject accessibleObject;
        try {
            yr1.I.getClass();
            Object obj2 = yr1.K;
            if (obj2 == null || obj2 == null) {
                List<t16> parameters = u16.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    for (t16 u : parameters) {
                        if (u.u() == qr3.y) {
                            if (!r16.Z(u16)) {
                                obj = r16.F(u16);
                            } else {
                                obj = null;
                            }
                            yr1.I.getClass();
                            if (obj != yr1.K) {
                                obj = null;
                            }
                            r16.Z(u16);
                            if (member == null) {
                                accessibleObject = (AccessibleObject) member;
                            } else {
                                accessibleObject = null;
                            }
                            if (accessibleObject != null) {
                                accessibleObject.setAccessible(we.y(u16));
                            }
                            if (member != null) {
                                return null;
                            }
                            if (member instanceof Field) {
                                return ((Field) member).get(obj);
                            }
                            if (member instanceof Method) {
                                int length = ((Method) member).getParameterTypes().length;
                                if (length == 0) {
                                    return ((Method) member).invoke((Object) null, (Object[]) null);
                                }
                                if (length == 1) {
                                    Method method = (Method) member;
                                    if (obj == null) {
                                        Class cls = ((Method) member).getParameterTypes()[0];
                                        cls.getClass();
                                        obj = g18.f(cls);
                                    }
                                    return method.invoke((Object) null, new Object[]{obj});
                                } else if (length == 2) {
                                    Class cls2 = ((Method) member).getParameterTypes()[1];
                                    cls2.getClass();
                                    return ((Method) member).invoke((Object) null, new Object[]{obj, g18.f(cls2)});
                                } else {
                                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                                }
                            } else {
                                throw new AssertionError("delegate field/method " + member + " neither field nor method");
                            }
                        }
                    }
                }
                throw new RuntimeException('\'' + u16 + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (!r16.Z(u16)) {
            }
            yr1.I.getClass();
            if (obj != yr1.K) {
            }
            r16.Z(u16);
            if (member == null) {
            }
            if (accessibleObject != null) {
            }
            if (member != null) {
            }
        } catch (IllegalAccessException e) {
            throw new Exception("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
        }
    }

    public static final long m(long j) {
        float sqrt = (float) Math.sqrt((double) ((s(j) * s(j)) + (r(j) * r(j))));
        if (sqrt > 0.0f) {
            return g(sqrt, j);
        }
        h.q("Can't get the direction of a 0-length vector");
        return 0;
    }

    public static final Object n(wu2 wu2, yu2 yu2) {
        wu2.getClass();
        yu2.getClass();
        if (wu2.l(yu2)) {
            return wu2.k(yu2);
        }
        return null;
    }

    public static final Object o(wu2 wu2, yu2 yu2, int i) {
        int i2;
        wu2.getClass();
        yu2.getClass();
        wu2.o(yu2);
        pc2 pc2 = wu2.w;
        xu2 xu2 = yu2.d;
        pc2.getClass();
        mv6 mv6 = pc2.a;
        if (xu2.y) {
            Object obj = mv6.get(xu2);
            if (obj == null) {
                i2 = 0;
            } else {
                i2 = ((List) obj).size();
            }
            if (i < i2) {
                wu2.o(yu2);
                if (xu2.y) {
                    Object obj2 = mv6.get(xu2);
                    if (obj2 != null) {
                        return yu2.a(((List) obj2).get(i));
                    }
                    throw new IndexOutOfBoundsException();
                }
                h.q("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        h.q("getRepeatedField() can only be called on repeated fields.");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ql4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ql4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: vw3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ql4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ql4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ql4} */
    /* JADX WARNING: type inference failed for: r3v3, types: [vq0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final vw3 p(qp7 qp7) {
        ql4 ql4;
        qp7.getClass();
        List upperBounds = qp7.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = qp7.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            ql4 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ? u = next.L().u();
            if (u instanceof ql4) {
                ql4 = u;
            }
            if (ql4 != null && ql4.v() != iq0.x && ql4.v() != iq0.A) {
                ql4 = next;
                break;
            }
        }
        vw3 vw3 = (vw3) ql4;
        if (vw3 != null) {
            return vw3;
        }
        List upperBounds3 = qp7.getUpperBounds();
        upperBounds3.getClass();
        Object w0 = dt0.w0(upperBounds3);
        w0.getClass();
        return (vw3) w0;
    }

    public static final x83 q() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(19.14f, 12.94f);
        e.e(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        e.e(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        e.i(2.03f, -1.58f);
        e.e(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        e.i(-1.92f, -3.32f);
        e.e(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        e.i(-2.39f, 0.96f);
        e.e(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        e.h(14.4f, 2.81f);
        e.e(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        e.g(-3.84f);
        e.e(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        e.h(9.25f, 5.35f);
        e.d(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        e.h(5.24f, 5.33f);
        e.e(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        e.h(2.74f, 8.87f);
        e.d(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        e.i(2.03f, 1.58f);
        e.d(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        e.l(0.02f, 0.64f, 0.07f, 0.94f);
        e.i(-2.03f, 1.58f);
        e.e(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        e.i(1.92f, 3.32f);
        e.e(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        e.i(2.39f, -0.96f);
        e.e(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        e.i(0.36f, 2.54f);
        e.e(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        e.g(3.84f);
        e.e(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        e.i(0.36f, -2.54f);
        e.e(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        e.i(2.39f, 0.96f);
        e.e(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        e.i(1.92f, -3.32f);
        e.e(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        e.h(19.14f, 12.94f);
        e.c();
        e.j(12.0f, 15.6f);
        e.e(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        e.l(1.62f, -3.6f, 3.6f, -3.6f);
        e.l(3.6f, 1.62f, 3.6f, 3.6f);
        e.k(13.98f, 15.6f, 12.0f, 15.6f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final float r(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float s(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean t(qp7 qp7, wo7 wo7, Set set) {
        qp7.getClass();
        List<vw3> upperBounds = qp7.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (vw3 vw3 : upperBounds) {
            vw3.getClass();
            if (c(vw3, qp7.g0().L(), set) && (wo7 == null || sg3.e(vw3.L(), wo7))) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(Context context) {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            b = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            rg d = rg.d();
            d.a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static final boolean v(u16 u16) {
        u16.getClass();
        return yq3.w.e(u16.h());
    }

    public static final boolean w(ob5 ob5, float f) {
        float f2;
        boolean z;
        ob5.m().getClass();
        if (ob5.r()) {
            f2 = -f;
        } else {
            f2 = i(ob5);
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public static final boolean x(vw3 vw3, vw3 vw32) {
        vw3.getClass();
        vw32.getClass();
        return xw3.a.b(vw3, vw32);
    }

    public static final vv6 y(ArrayList arrayList) {
        vv6 vv6 = new vv6();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ji4 ji4 = (ji4) next;
            if (!(ji4 == null || ji4 == ii4.b)) {
                vv6.add(next);
            }
        }
        return vv6;
    }

    public static final du7 z(vw3 vw3) {
        vw3.getClass();
        du7 g = iq7.g(vw3, true);
        g.getClass();
        return g;
    }

    public abstract jb5 C(gq3 gq3, Object obj);
}

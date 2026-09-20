package defpackage;

import android.app.KeyguardManager;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.WindowManager;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: g5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g5(s41 s41, fu7 fu7, el3 el3, xh6 xh6) {
        this.w = 9;
        this.y = s41;
        this.x = el3;
        this.z = xh6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: android.app.KeyguardManager} */
    /* JADX WARNING: type inference failed for: r1v54, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x077b  */
    public final Object y(Object obj) {
        int length;
        float f;
        float f2;
        boolean z2;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        iz1 iz1;
        float f3;
        boolean z3;
        iz1 iz12;
        qk0 qk0;
        long j;
        float f4;
        long j2;
        fw0 fw0;
        fw0 fw02;
        fw0 fw03;
        long j3;
        fw0 fw04;
        fw0 fw05;
        f5 f5Var;
        boolean z4;
        cf4 cf4;
        Object g;
        float f5;
        float f6;
        u44 u44;
        Object obj2 = obj;
        int i = this.w;
        iz1 iz13 = rd2.a;
        KeyguardManager keyguardManager = null;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        Object obj4 = this.x;
        Object obj5 = this.y;
        switch (i) {
            case b85.b:
                t54 t54 = (t54) obj5;
                kw1 kw1 = (kw1) obj2;
                h5 h5Var = new h5(0, (vr2) obj4);
                t54.k().x0(h5Var);
                return new i5((Object) (sr2) obj3, (Object) t54, (Object) h5Var, 0);
            case 1:
                vs7 vs72 = vs7;
                aw awVar = (aw) obj3;
                vr2 vr2 = (vr2) obj4;
                y53 y53 = (y53) obj2;
                y53.getClass();
                yr7 yr7 = y53.a;
                b35.t(y53, "Authorization", "Bearer ".concat((String) obj5));
                vr2 vr22 = awVar.e;
                if (vr22 != null) {
                    vr22.y(y53);
                }
                vr2.y(y53);
                Integer num = awVar.d.c.b;
                if (num == null || (length = yr7.toString().length()) <= num.intValue()) {
                    return vs72;
                }
                int intValue = num.intValue();
                List list = q47.a;
                throw new IllegalStateException(("Your URL length exceeds the limit of " + intValue + " characters (" + length + "). Url: " + q47.b(yr7.b())).toString());
            case 2:
                vs7 vs73 = vs7;
                String str = (String) obj2;
                str.getClass();
                ((td) ((cs0) obj5)).b(new vl(str));
                Toast.makeText((Context) obj4, (String) obj3, 0).show();
                return vs73;
            case 3:
                vs7 vs74 = vs7;
                vr2 vr23 = (vr2) obj4;
                aq4 aq4 = (aq4) obj3;
                hf7 hf7 = (hf7) obj2;
                ((aq4) obj5).setValue(hf7);
                boolean e = sg3.e((String) aq4.getValue(), hf7.a.x);
                vl vlVar = hf7.a;
                aq4.setValue(vlVar.x);
                if (!e) {
                    vr23.y(vlVar.x);
                }
                return vs74;
            case 4:
                vs7 vs75 = vs7;
                ar7.H((o81) obj5, (e81) null, (r81) null, new p0((sk2) obj2, (aq4) obj4, (ek7) obj3, (f61) null, 11), 3);
                return vs75;
            case 5:
                vs7 vs76 = vs7;
                f5 f5Var2 = new f5(9, (o81) obj4, (ek7) obj3);
                yr3[] yr3Arr = mk6.a;
                ((ok6) obj2).f(zj6.c, new h4((String) obj5, f5Var2));
                return vs76;
            case 6:
                boolean z5 = true;
                vs7 vs77 = vs7;
                l96 l96 = (l96) obj4;
                kc0 kc0 = (kc0) obj3;
                hz1 hz1 = (hz1) obj2;
                w57 w57 = (w57) ((o9) obj5).y;
                w57.getClass();
                float floatValue = Float.valueOf(w57.w).floatValue();
                if (floatValue < 0.0f) {
                    f = 0.0f;
                } else {
                    f = floatValue;
                }
                float f7 = f / 2.0f;
                float min = Math.min(Math.abs(l96.b()), Math.abs(l96.a()));
                float f8 = l96.a;
                float f9 = l96.b;
                if (f * 2.0f <= min) {
                    z5 = false;
                }
                long j4 = l96.e;
                l57 l57 = new l57(f, 0.0f, 0, 0, 30);
                if (z5) {
                    hz1.F0(hz1, kc0, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (((long) Float.floatToRawIntBits(l96.b())) << 32) | (((long) Float.floatToRawIntBits(l96.a())) & 4294967295L), j4, 0.0f, (iz1) null, (lt0) null, 240);
                } else {
                    long j5 = j4;
                    if (Float.intBitsToFloat((int) (j5 >> 32)) < f7) {
                        float f10 = f8 + f;
                        float f11 = f9 + f;
                        float f12 = l96.c - f;
                        float f13 = l96.d - f;
                        wr0 j0 = hz1.j0();
                        long L = j0.L();
                        j0.D().h();
                        try {
                            ((ji8) j0.x).p(f10, f11, f12, f13, 0);
                            hz1.F0(hz1, kc0, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (((long) Float.floatToRawIntBits(l96.b())) << 32) | (((long) Float.floatToRawIntBits(l96.a())) & 4294967295L), j5, 0.0f, (iz1) null, (lt0) null, 240);
                        } finally {
                            b81.u(j0, L);
                        }
                    } else {
                        hz1.F0(hz1, kc0, (((long) Float.floatToRawIntBits(f8 + f7)) << 32) | (((long) Float.floatToRawIntBits(f9 + f7)) & 4294967295L), (((long) Float.floatToRawIntBits(l96.b() - f)) << 32) | (((long) Float.floatToRawIntBits(l96.a() - f)) & 4294967295L), sg3.X(f7, j5), 0.0f, l57, (lt0) null, 208);
                    }
                }
                return vs77;
            case 7:
                vs7 vs78 = vs7;
                ly5 ly5 = (ly5) obj4;
                float f14 = ly5.b;
                float f15 = ly5.d;
                float f16 = ly5.a;
                float f17 = ly5.c;
                kc0 kc02 = (kc0) obj3;
                hz1 hz12 = (hz1) obj2;
                w57 w572 = (w57) ((o9) obj5).y;
                w572.getClass();
                float floatValue2 = Float.valueOf(w572.w).floatValue();
                if (floatValue2 < 0.0f) {
                    f2 = 0.0f;
                } else {
                    f2 = floatValue2;
                }
                if (f2 * 2.0f > Math.min(Math.abs(f17 - f16), Math.abs(f15 - f14))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    floatToRawIntBits = ly5.d();
                } else {
                    float f18 = f2 / 2.0f;
                    floatToRawIntBits = (((long) Float.floatToRawIntBits(f18 + f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f16 + f18)) << 32);
                }
                long j6 = floatToRawIntBits;
                if (z2) {
                    floatToRawIntBits2 = ly5.c();
                } else {
                    floatToRawIntBits2 = (((long) Float.floatToRawIntBits((f17 - f16) - f2)) << 32) | (((long) Float.floatToRawIntBits((f15 - f14) - f2)) & 4294967295L);
                }
                long j7 = floatToRawIntBits2;
                if (z2) {
                    iz1 = iz13;
                } else {
                    iz1 = new l57(f2, 0.0f, 0, 0, 30);
                }
                hz1.q(hz12, kc02, j6, j7, 0.0f, iz1, (lt0) null, 104);
                return vs78;
            case 8:
                vs7 vs79 = vs7;
                Context context = (Context) obj5;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj4;
                WindowManager windowManager = (WindowManager) obj3;
                float floatValue3 = ((Float) obj2).floatValue();
                vx0 vx0 = fi0.f;
                if (vx0 != null) {
                    int height = context.getResources().getDisplayMetrics().heightPixels - vx0.getHeight();
                    int i3 = layoutParams.y - ((int) floatValue3);
                    if (height < 0) {
                        height = 0;
                    }
                    layoutParams.y = z65.p(i3, 0, height);
                    try {
                        windowManager.updateViewLayout(vx0, layoutParams);
                    } catch (Throwable unused) {
                    }
                }
                return vs79;
            case 9:
                vs7 vs710 = vs7;
                s41 s41 = (s41) obj5;
                el3 el3 = (el3) obj4;
                xh6 xh6 = (xh6) obj3;
                float floatValue4 = ((Float) obj2).floatValue();
                if (s41.M) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                zh6 zh6 = s41.L;
                long f19 = zh6.f(zh6.i(f3 * floatValue4));
                zh6 zh62 = xh6.a;
                float h = zh6.h(zh6.f(zh62.d(zh62.k, f19, 1))) * f3;
                if (Math.abs(h) < Math.abs(floatValue4)) {
                    el3.o(rc9.b("Scroll animation cancelled because scroll was not consumed (" + h + " < " + floatValue4 + ")", (Throwable) null));
                }
                return vs710;
            case 10:
                u44 u442 = (u44) obj5;
                hf7 hf72 = (hf7) obj4;
                v35 v35 = (v35) obj3;
                hz1 hz13 = (hz1) obj2;
                cg7 d = u442.d();
                if (d == null) {
                    return vs7;
                }
                qk0 D = hz13.j0().D();
                long j8 = ((lg7) u442.A.getValue()).a;
                long j9 = ((lg7) u442.B.getValue()).a;
                bg7 bg7 = d.a;
                pn4 pn4 = bg7.b;
                ag7 ag7 = bg7.a;
                kb9 kb9 = u442.y;
                vs7 vs711 = vs7;
                long j10 = u442.z;
                if (!lg7.c(j8)) {
                    kb9.k(j10);
                    int p = v35.p(lg7.f(j8));
                    int p2 = v35.p(lg7.e(j8));
                    if (p != p2) {
                        D.f(bg7.i(p, p2), kb9);
                    }
                } else if (!lg7.c(j9)) {
                    long b = ag7.b.b();
                    jt0 jt0 = new jt0(b);
                    if (b == 16) {
                        jt0 = null;
                    }
                    if (jt0 != null) {
                        j2 = jt0.a;
                    } else {
                        j2 = jt0.b;
                    }
                    kb9.k(jt0.b(jt0.d(j2) * 0.2f, j2));
                    int p3 = v35.p(lg7.f(j9));
                    int p4 = v35.p(lg7.e(j9));
                    if (p3 != p4) {
                        D.f(bg7.i(p3, p4), kb9);
                    }
                } else if (!lg7.c(hf72.b)) {
                    kb9.k(j10);
                    long j11 = hf72.b;
                    int p5 = v35.p(lg7.f(j11));
                    int p6 = v35.p(lg7.e(j11));
                    if (p5 != p6) {
                        D.f(bg7.i(p5, p6), kb9);
                    }
                }
                if (!bg7.d() || ag7.f == 3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    long j12 = bg7.c;
                    ly5 c = z85.c(0, (((long) Float.floatToRawIntBits((float) ((int) (j12 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (j12 >> 32)))) << 32));
                    D.h();
                    qk0.q(D, c);
                }
                yy6 yy6 = ag7.b.a;
                rd7 rd7 = yy6.m;
                kf7 kf7 = yy6.a;
                if (rd7 == null) {
                    rd7 = rd7.b;
                }
                rd7 rd72 = rd7;
                lq6 lq6 = yy6.n;
                if (lq6 == null) {
                    lq6 = lq6.d;
                }
                lq6 lq62 = lq6;
                iz1 iz14 = yy6.p;
                if (iz14 == null) {
                    iz12 = iz13;
                } else {
                    iz12 = iz14;
                }
                try {
                    kc0 c2 = kf7.c();
                    jf7 jf7 = jf7.a;
                    if (c2 != null) {
                        if (kf7 != jf7) {
                            f4 = kf7.a();
                        } else {
                            f4 = 1.0f;
                        }
                        qk0 = D;
                        try {
                            pn4.j(qk0, c2, f4, lq62, rd72, iz12);
                        } catch (Throwable th) {
                            th = th;
                            if (z3) {
                            }
                            throw th;
                        }
                    } else {
                        qk0 = D;
                        pn4 pn42 = pn4;
                        if (kf7 != jf7) {
                            j = kf7.b();
                        } else {
                            j = jt0.b;
                        }
                        pn42.i(qk0, j, lq62, rd72, iz12);
                    }
                    if (!z3) {
                        return vs711;
                    }
                    qk0.p();
                    return vs711;
                } catch (Throwable th2) {
                    th = th2;
                    qk0 = D;
                    if (z3) {
                        qk0.p();
                    }
                    throw th;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                e06 e06 = (e06) obj5;
                gl glVar = (gl) obj2;
                float floatValue5 = ((Number) glVar.e.getValue()).floatValue() - e06.w;
                float a = ((eh6) obj4).a(floatValue5);
                e06.w = ((Number) glVar.e.getValue()).floatValue();
                ((e06) obj3).w = ((Number) glVar.b()).floatValue();
                if (Math.abs(floatValue5 - a) > 0.5f) {
                    glVar.a();
                }
                return vs7;
            case 12:
                Context context2 = (Context) obj4;
                md7 md7 = (md7) obj3;
                y51 y51 = (y51) obj2;
                List list2 = ((yc7) obj5).a;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    xc7 xc7 = (xc7) list2.get(i4);
                    if (xc7 instanceof hd7) {
                        hd7 hd7 = (hd7) xc7;
                        yg ygVar = new yg(8, hd7);
                        if (hd7.c == 0) {
                            fw03 = null;
                        } else {
                            fw03 = new fw0(-1930700965, new yn1(0, hd7), true);
                        }
                        y51.b(y51, ygVar, fw03, new f5(16, hd7, md7), 6);
                    } else if (xc7 instanceof nd7) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            nd7 nd7 = (nd7) xc7;
                            if (context2 != null) {
                                int i5 = nd7.c;
                                TextClassification textClassification = nd7.b;
                                Drawable drawable = nd7.d;
                                if (i5 < 0) {
                                    ph6 ph6 = new ph6(14, textClassification);
                                    if (drawable != null) {
                                        fw02 = new fw0(-1123224187, new gd7(drawable, 0), true);
                                    } else {
                                        fw02 = null;
                                    }
                                    y51.b(y51, ph6, fw02, new n17(1, (Object) context2, (Object) textClassification), 6);
                                } else {
                                    RemoteAction e2 = pc7.e(textClassification.getActions().get(i5));
                                    ph6 ph62 = new ph6(15, e2);
                                    if (drawable != null) {
                                        fw0 = new fw0(1106162332, new gd7(drawable, 1), true);
                                    } else {
                                        fw0 = null;
                                    }
                                    y51.b(y51, ph62, fw0, new fd7(0, (Object) e2), 6);
                                }
                            }
                        }
                    } else if (xc7 instanceof ld7) {
                        y51.a.add(x91.f);
                    }
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                yx6 yx6 = (yx6) obj5;
                zs4 zs4 = (zs4) obj4;
                kw1 kw12 = (kw1) obj2;
                yx6.add(zs4);
                return new i5((Object) (vu1) obj3, (Object) zs4, (Object) yx6, 2);
            case 14:
                ez4 ez4 = (ez4) obj2;
                ez4.getClass();
                ((aq4) obj3).setValue((Object) null);
                ((gs2) obj5).H(((en2) obj4).a, ez4);
                return vs7;
            case h75.g /*15*/:
                List list3 = (List) obj5;
                h34 h34 = (h34) obj2;
                h34.getClass();
                h34.P(list3.size(), new e3(10, (Object) new vd2(6), (Object) list3), new y20(3, list3), new fw0(802480018, new aa9(list3, (gs2) obj4, (aq4) obj3, 1), true));
                return vs7;
            case 16:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                in5 in5 = (in5) obj3;
                pp4 pp4 = (pp4) obj2;
                in5 in52 = kz2.c;
                in5 in53 = kz2.d;
                String str4 = "";
                if (((String) ie1.K(pp4, in53, str4)).equals(str2)) {
                    in5 c3 = kz2.c(pp4, str2);
                    if (c3 != null && !c3.a.equals(str3)) {
                        kz2.d(pp4, str2);
                        HashSet hashSet = new HashSet((Collection) ie1.K(pp4, in5, new HashSet()));
                        hashSet.add(str2);
                        pp4.d(in5, hashSet);
                    }
                } else {
                    long longValue = ((Long) ie1.K(pp4, in52, 0L)).longValue();
                    long j13 = 1;
                    if (longValue + 1 == 30) {
                        long longValue2 = ((Long) ie1.K(pp4, in52, 0L)).longValue();
                        Set hashSet2 = new HashSet();
                        String str5 = null;
                        for (Map.Entry entry : pp4.a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                Set set = (Set) entry.getValue();
                                for (String next : set) {
                                    long j14 = j13;
                                    if (str5 == null || str5.compareTo(next) > 0) {
                                        str4 = ((in5) entry.getKey()).a;
                                        str5 = next;
                                        hashSet2 = set;
                                    }
                                    j13 = j14;
                                }
                            }
                            j13 = j13;
                        }
                        j3 = j13;
                        HashSet hashSet3 = new HashSet(hashSet2);
                        hashSet3.remove(str5);
                        str4.getClass();
                        pp4.d(new in5(str4), hashSet3);
                        longValue = longValue2 - j3;
                        pp4.d(in52, Long.valueOf(longValue));
                    } else {
                        j3 = 1;
                    }
                    HashSet hashSet4 = new HashSet((Collection) ie1.K(pp4, in5, new HashSet()));
                    hashSet4.add(str2);
                    pp4.d(in5, hashSet4);
                    pp4.d(in52, Long.valueOf(longValue + j3));
                    pp4.d(in53, str2);
                }
                return null;
            case 17:
                Context context3 = (Context) obj4;
                c23 c23 = (c23) obj3;
                az7 az7 = (az7) obj2;
                az7.getClass();
                if (!((o03) obj5).H || !sg3.A(context3, "android.permission.CALL_PHONE")) {
                    c23.f(az7);
                } else {
                    c23.g(az7);
                }
                return vs7;
            case 18:
                sk3 sk3 = (sk3) obj5;
                qt4 qt4 = (qt4) obj4;
                cl3 cl3 = (cl3) obj2;
                cl3.getClass();
                Set set2 = (Set) ((a37) obj3).getValue();
                w52 w52 = sk3.e;
                ArrayList arrayList = new ArrayList();
                Iterator it = w52.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((lk7) next2).B) {
                        arrayList.add(next2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    lk7 lk7 = (lk7) it2.next();
                    boolean contains = set2.contains(lk7);
                    boolean f20 = pk3.f(qt4, lk7);
                    f5 f5Var3 = new f5(29, sk3, lk7);
                    ml4 ml4 = jl4.w;
                    if (contains) {
                        ml4 = gw8.p(ml4, new ww0(27));
                    }
                    ml4 ml42 = ml4;
                    fw0 fw06 = new fw0(-1419703348, new kk3(lk7, i2), true);
                    fw0 fw07 = new fw0(1061471245, new kk3(lk7, 1), true);
                    fw0 fw08 = new fw0(-752321458, new kk3(lk7, 2), true);
                    ml42.getClass();
                    fw0 fw09 = new fw0(740049843, new j92(f20, fw07, fw06, 2), true);
                    vr2 vr24 = cl3.c;
                    if (vr24 != null) {
                        fw04 = fw08;
                        z4 = f20;
                        f5Var = f5Var3;
                        fw05 = fw09;
                        vr24.y(new bl3(z4, f5Var, ml42, fw05, fw04));
                    } else {
                        fw04 = fw08;
                        z4 = f20;
                        f5Var = f5Var3;
                        fw05 = fw09;
                    }
                    kx4 kx4 = cl3.a;
                    if (!(kx4 == null || (cf4 = cl3.b) == null)) {
                        if (!z4) {
                            fw04 = null;
                        }
                        kx4.a.b(new yw4(z4, f5Var, fw05, ml42, fw04, cf4));
                    }
                    i2 = 0;
                }
                return vs7;
            case 19:
                t54 t542 = (t54) obj5;
                kw1 kw13 = (kw1) obj2;
                ? obj6 = new Object();
                o54 o54 = new o54((a64) obj3, obj6, (vr2) obj4);
                t542.k().x0(o54);
                return new i5(t542, (q54) o54, (Object) obj6, 3);
            case 20:
                bo4 bo4 = (bo4) obj4;
                h06 h06 = (h06) obj3;
                if (((Set) obj5).contains(obj2) && (g = bo4.x.g(obj2)) != null) {
                    if (g instanceof up4) {
                        up4 up4 = (up4) g;
                        Object[] objArr = up4.b;
                        long[] jArr = up4.a;
                        int length2 = jArr.length - 2;
                        if (length2 >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j15 = jArr[i6];
                                if ((((~j15) << 7) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        if ((255 & j15) < 128) {
                                            xk6 xk6 = (xk6) objArr[(i6 << 3) + i8];
                                            if (h06.w == null) {
                                                h06.w = new ArrayList();
                                            }
                                            ((List) h06.w).add(xk6);
                                        }
                                        j15 >>= 8;
                                    }
                                    if (i7 != 8) {
                                    }
                                }
                                if (i6 != length2) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        xk6 xk62 = (xk6) g;
                        if (h06.w == null) {
                            h06.w = new ArrayList();
                        }
                        ((List) h06.w).add(xk62);
                    }
                }
                return vs7;
            case 21:
                xz1 xz1 = (xz1) obj4;
                o81 o81 = (o81) obj3;
                ok6 ok6 = (ok6) obj2;
                mk6.e(ok6, (String) obj5);
                if (xz1.c()) {
                    ok6.f(zj6.v, new h4((String) null, new hk3(xz1, o81)));
                }
                return vs7;
            case 22:
                bw4 bw4 = (bw4) obj5;
                fx0 fx0 = (fx0) obj4;
                rv4 rv4 = (rv4) obj3;
                kw1 kw14 = (kw1) obj2;
                if (bw4.e == null) {
                    bw4.e = fx0;
                    rv4.a(rv4, fx0);
                    return new m30(5, fx0, bw4);
                }
                ku4.m("NavigationEventState '", bw4, "' is already registered with a NavigationEventHandler '", fx0, "'.");
                return null;
            case 23:
                la5 la5 = (la5) obj4;
                ib ibVar = (ib) obj3;
                wy3 wy3 = (wy3) obj2;
                long j16 = ((wu6) ((ji1) obj5).get()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                if (intBitsToFloat > 0.0f) {
                    float e0 = wy3.e0(4.0f);
                    tk0 tk0 = wy3.w;
                    float e02 = wy3.e0(la5.b(wy3.getLayoutDirection()));
                    float f21 = intBitsToFloat / 2.0f;
                    float a2 = ((float) ibVar.a(dh4.C(intBitsToFloat), dh4.C((Float.intBitsToFloat((int) (tk0.e() >> 32)) - e02) - wy3.e0(la5.c(wy3.getLayoutDirection()))), wy3.getLayoutDirection())) + e02 + f21;
                    float f22 = (a2 - f21) - e0;
                    if (f22 < 0.0f) {
                        f5 = 0.0f;
                    } else {
                        f5 = f22;
                    }
                    float f23 = a2 + f21 + e0;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (tk0.e() >> 32));
                    if (f23 > intBitsToFloat2) {
                        f6 = intBitsToFloat2;
                    } else {
                        f6 = f23;
                    }
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                    float f24 = (-intBitsToFloat3) / 2.0f;
                    float f25 = intBitsToFloat3 / 2.0f;
                    wr0 wr0 = tk0.x;
                    long L2 = wr0.L();
                    wr0.D().h();
                    try {
                        ((ji8) wr0.x).p(f5, f24, f6, f25, 0);
                        wy3.a();
                    } finally {
                        b81.u(wr0, L2);
                    }
                } else {
                    wy3.a();
                }
                return vs7;
            case 24:
                pe6 pe6 = (pe6) obj5;
                ue6 ue6 = (ue6) obj3;
                kw1 kw15 = (kw1) obj2;
                tp4 tp4 = pe6.x;
                if (!tp4.b(obj4)) {
                    pe6.w.remove(obj4);
                    tp4.m(obj4, ue6);
                    return new i5((Object) pe6, obj4, (Object) ue6, 5);
                }
                ku4.w(obj4, " was used multiple times ", "Key ");
                return null;
            case 25:
                zc9 zc9 = (zc9) obj5;
                lj6 lj6 = (lj6) obj4;
                d06 d06 = (d06) obj3;
                qk5 qk5 = (qk5) obj2;
                long j17 = qk5.c;
                ze7 ze7 = (ze7) zc9.z;
                if (!(!ze7.k() || ze7.n().a.x.length() == 0 || (u44 = ze7.d) == null || u44.d() == null)) {
                    zc9.e(ze7.n(), j17, false, lj6);
                    i2 = 1;
                }
                if (i2 != 0) {
                    qk5.a();
                    d06.w = true;
                }
                return vs7;
            case 26:
                Context context4 = (Context) obj5;
                se4 se4 = (se4) obj3;
                vr2 vr25 = (vr2) obj4;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue() || Build.VERSION.SDK_INT < 33 || sg3.A(context4, "android.permission.POST_NOTIFICATIONS")) {
                    vr25.y(bool);
                } else {
                    se4.d0("android.permission.POST_NOTIFICATIONS");
                }
                return vs7;
            case 27:
                Context context5 = (Context) obj5;
                String str6 = (String) obj3;
                vr2 vr26 = (vr2) obj4;
                Boolean bool2 = (Boolean) obj2;
                boolean booleanValue = bool2.booleanValue();
                Object systemService = context5.getSystemService("keyguard");
                if (systemService instanceof KeyguardManager) {
                    keyguardManager = systemService;
                }
                if (!booleanValue || (keyguardManager != null && keyguardManager.isDeviceSecure())) {
                    vr26.y(bool2);
                } else {
                    str6.getClass();
                    Toast.makeText(context5, str6, 0).show();
                }
                return vs7;
            case 28:
                xw0 xw0 = (xw0) obj3;
                Throwable th3 = (Throwable) obj2;
                ((gg0) obj5).y(th3);
                ad0 ad0 = (ad0) ((am6) obj4).z;
                ad0.j(th3, false);
                while (true) {
                    Object a3 = rn0.a(ad0.p());
                    if (a3 == null) {
                        return vs7;
                    }
                    xw0.H(a3, th3);
                }
            default:
                e17 e17 = (e17) obj5;
                h34 h342 = (h34) obj2;
                h342.getClass();
                List b2 = e17.b();
                h342.P(b2.size(), new e3(20, (Object) new nf6(24), (Object) b2), new y20(11, b2), new fw0(802480018, new p17(b2, e17, (gs2) obj4, (aq4) obj3), true));
                return vs7;
        }
    }

    public /* synthetic */ g5(vr2 vr2, aq4 aq4, aq4 aq42) {
        this.w = 3;
        this.x = vr2;
        this.y = aq4;
        this.z = aq42;
    }

    public /* synthetic */ g5(kz2 kz2, String str, String str2, in5 in5) {
        this.w = 16;
        this.y = str;
        this.x = str2;
        this.z = in5;
    }

    public /* synthetic */ g5(e06 e06, eh6 eh6, e06 e062, rl1 rl1) {
        this.w = 11;
        this.y = e06;
        this.x = eh6;
        this.z = e062;
    }

    public /* synthetic */ g5(Context context, WindowManager.LayoutParams layoutParams, vx0 vx0, WindowManager windowManager) {
        this.w = 8;
        this.y = context;
        this.x = layoutParams;
        this.z = windowManager;
    }

    public /* synthetic */ g5(Object obj, Object obj2, vr2 vr2, int i) {
        this.w = i;
        this.y = obj;
        this.z = obj2;
        this.x = vr2;
    }

    public /* synthetic */ g5(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
        this.z = obj3;
    }
}

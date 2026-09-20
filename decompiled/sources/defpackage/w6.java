package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import cu.lestebang.utiletecsa.data.repository.forum.ForumCommentFeedDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* renamed from: w6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(dy7 dy7, String str, String str2, String str3, String str4, f61 f61) {
        super(2, f61);
        this.A = 19;
        this.C = dy7;
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.D = str4;
    }

    private final Object A(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            jy1 jy1 = new jy1((o81) this.C, (pe7) this.E, (t46) this.F, (co5) this.G, (f61) null);
            this.B = 1;
            Object s = fd1.s((uk5) this.D, jy1, this);
            p81 p81 = p81.w;
            if (s == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    private final Object B(Object obj) {
        xh6 xh6;
        h06 h06;
        Object obj2;
        al7 e;
        xh6 xh62;
        zh6 zh6 = (zh6) this.F;
        h06 h062 = (h06) this.G;
        cl7 cl7 = (cl7) this.E;
        int i = this.B;
        f61 f61 = null;
        if (i == 0) {
            o85.q(obj);
            xh6 xh63 = (xh6) this.D;
            float j = zh6.j(zh6.f(((al7) h062.w).a));
            zh6 zh62 = cl7.a;
            zh62.h(zh62.f(xh63.a(zh62.i(zh62.e(j)), 1)));
            xh62 = xh63;
        } else if (i == 1) {
            o85.q(obj);
            xh6 = (xh6) this.D;
            h06 = (h06) this.C;
            obj2 = obj;
            h06.w = obj2;
            al7 al7 = (al7) h062.w;
            jz0 jz0 = cl7.e;
            long j2 = al7.b;
            long j3 = al7.a;
            ((z38) jz0.x).a(Float.intBitsToFloat((int) (j3 >> 32)), j2);
            ((z38) jz0.y).a(Float.intBitsToFloat((int) (j3 & 4294967295L)), j2);
            e = cl7.e(cl7.f);
            if (e != null) {
                jz0 jz02 = cl7.e;
                long j4 = e.b;
                long j5 = e.a;
                ((z38) jz02.x).a(Float.intBitsToFloat((int) (j5 >> 32)), j4);
                ((z38) jz02.y).a(Float.intBitsToFloat((int) (j5 & 4294967295L)), j4);
                h062.w = ((al7) h062.w).a(e);
            }
            float j6 = zh6.j(zh6.f(((al7) h062.w).a));
            zh6 zh63 = cl7.a;
            zh63.h(zh63.f(xh6.a(zh63.i(zh63.e(j6)), 1)));
            xh62 = xh6;
            f61 = null;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (((al7) h062.w).c) {
            ad0 ad0 = cl7.f;
            this.D = xh62;
            this.C = h062;
            this.B = 1;
            obj2 = gl0.L(new k05((Object) ad0, f61, 0), this);
            p81 p81 = p81.w;
            if (obj2 == p81) {
                return p81;
            }
            xh6 = xh62;
            h06 = h062;
            h06.w = obj2;
            al7 al72 = (al7) h062.w;
            jz0 jz03 = cl7.e;
            long j22 = al72.b;
            long j32 = al72.a;
            ((z38) jz03.x).a(Float.intBitsToFloat((int) (j32 >> 32)), j22);
            ((z38) jz03.y).a(Float.intBitsToFloat((int) (j32 & 4294967295L)), j22);
            e = cl7.e(cl7.f);
            if (e != null) {
            }
            float j62 = zh6.j(zh6.f(((al7) h062.w).a));
            zh6 zh632 = cl7.a;
            zh632.h(zh632.f(xh6.a(zh632.i(zh632.e(j62)), 1)));
            xh62 = xh6;
            f61 = null;
            if (((al7) h062.w).c) {
            }
            return p81;
        }
        return vs7.a;
    }

    private final Object G(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            qe1 qe1 = ((dy7) this.C).a;
            bc0 bc0 = new bc0((Object) (String) this.E, (Object) (String) this.F, (Serializable) (String) this.G, (Object) (String) this.D, (f61) null, 2);
            this.B = 1;
            Object a = qe1.a(bc0, this);
            p81 p81 = p81.w;
            if (a == p81) {
                return p81;
            }
            return a;
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: el3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    private final Object v(Object obj) {
        el3 el3;
        c9 c9Var;
        d37 d37;
        fg5 fg5;
        fg5 fg52;
        List H;
        yx5 yx5;
        zx5 zx5;
        Object obj2 = p81.w;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            el3 Q = r16.Q(((o81) this.D).k());
            gy5 gy5 = (gy5) this.E;
            synchronized (gy5.c) {
                Throwable th = gy5.e;
                if (th != null) {
                    throw th;
                } else if (((dy5) gy5.u.getValue()).compareTo(dy5.x) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                } else if (gy5.d == null) {
                    gy5.d = Q;
                    if (gy5.C() != null) {
                        ey0.a("called outside of runRecomposeAndApplyChanges");
                    }
                } else {
                    throw new IllegalStateException("Recomposer already running");
                }
            }
            yg ygVar = new yg(25, (gy5) this.E);
            nx6.e(nx6.a);
            synchronized (nx6.c) {
                nx6.h = dt0.N0(nx6.h, ygVar);
            }
            c9 c9Var2 = new c9(16, ygVar);
            d37 d372 = gy5.z;
            tz2 tz2 = ((gy5) this.E).y;
            do {
                d37 = gy5.z;
                fg5 = (fg5) d37.getValue();
                pe2 pe2 = pe2.D;
                wf5 wf5 = fg5.y;
                if (!wf5.containsKey(tz2)) {
                    fg52 = fg5;
                } else if (fg5.isEmpty()) {
                    fg52 = new fg5(tz2, tz2, wf5.f(tz2, new k74(pe2, pe2)));
                } else {
                    Object obj3 = fg5.x;
                    Object obj4 = wf5.get(obj3);
                    obj4.getClass();
                    fg52 = new fg5(fg5.w, tz2, wf5.f(obj3, new k74(((k74) obj4).a, tz2)).f(tz2, new k74(obj3, pe2)));
                }
                if (fg5 == fg52 || d37.i(fg5, fg52)) {
                    break;
                }
                d37 = gy5.z;
                fg5 = (fg5) d37.getValue();
                pe2 pe22 = pe2.D;
                wf5 wf52 = fg5.y;
                if (!wf52.containsKey(tz2)) {
                }
                break;
                break;
            } while (d37.i(fg5, fg52));
            try {
                break;
                gy5 gy52 = (gy5) this.E;
                synchronized (gy52.c) {
                    H = gy52.H();
                }
                int size = H.size();
                for (int i2 = 0; i2 < size; i2++) {
                    for (Object obj5 : ((py0) H.get(i2)).B.y) {
                        if (obj5 instanceof yx5) {
                            yx5 = (yx5) obj5;
                        } else {
                            yx5 = null;
                        }
                        if (!(yx5 == null || (zx5 = yx5.a) == null)) {
                            zx5.p(yx5, (Object) null);
                        }
                    }
                }
                ii3 ii3 = new ii3((Object) (fy5) this.F, (Object) (gj) this.G, (f61) null, 16);
                this.D = Q;
                this.C = c9Var2;
                this.B = 1;
                if (gl0.L(ii3, this) == obj2) {
                    return obj2;
                }
                el3 = Q;
                c9Var = c9Var2;
            } catch (Throwable th2) {
                th = th2;
                el3 = Q;
                c9Var = c9Var2;
                c9Var.h();
                gy5 gy53 = (gy5) this.E;
                synchronized (gy53.c) {
                    try {
                        if (gy53.d == el3) {
                            gy53.d = null;
                        }
                        if (gy53.C() != null) {
                            ey0.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                d37 d373 = gy5.z;
                jv2.f(((gy5) this.E).y);
                throw th;
            }
        } else if (i == 1) {
            c9Var = this.C;
            el3 = this.D;
            try {
                o85.q(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c9Var.h();
        gy5 gy54 = (gy5) this.E;
        synchronized (gy54.c) {
            try {
                if (gy54.d == el3) {
                    gy54.d = null;
                }
                if (gy54.C() != null) {
                    ey0.a("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        d37 d374 = gy5.z;
        jv2.f(((gy5) this.E).y);
        return vs7.a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v13, types: [ol] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r4 == r6) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (defpackage.oi6.g1(r3, r0) == r6) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0179, code lost:
        if (defpackage.oi6.e1(r3, r0) == r6) goto L_0x0190;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    private final Object x(Object obj) {
        float f;
        ed5 ed5;
        hi6 hi6;
        p38 p38;
        kl klVar;
        qq4 qq4;
        oi6 oi6;
        mm7 mm7 = (mm7) this.G;
        Object obj2 = this.F;
        oi6 oi62 = (oi6) this.E;
        int i = this.B;
        Object obj3 = vs7.a;
        Object obj4 = p81.w;
        if (i == 0) {
            o85.q(obj);
            Object value = oi62.x.getValue();
            if (!sg3.e(obj2, value)) {
                oi6.d1(oi62);
                oi62.n1(0.0f);
                mm7.q(obj2);
                mm7.o(0);
                oi62.O0(value);
                oi62.x.setValue(obj2);
            }
            qq4 qq42 = oi62.G;
            this.C = qq42;
            this.D = oi62;
            this.B = 1;
            if (qq42.a(this) != obj4) {
                qq4 = qq42;
                oi6 = oi62;
            }
            return obj4;
        } else if (i == 1) {
            oi6 = (oi6) this.D;
            qq4 = (qq4) this.C;
            o85.q(obj);
        } else if (i == 2) {
            o85.q(obj);
            this.B = 3;
        } else if (i == 3) {
            o85.q(obj);
            ed5 = oi62.y;
            ad5 ad5 = oi62.E;
            if (!sg3.e(ed5.getValue(), obj2)) {
                if (ad5.d() >= 1.0f || ((hi6 = oi62.K) != null && sg3.e((Object) null, hi6.b))) {
                    f = 0.0f;
                } else {
                    if (hi6 != null) {
                        p38 = hi6.b;
                    } else {
                        p38 = null;
                    }
                    kl klVar2 = oi6.O;
                    if (p38 != null) {
                        long j = hi6.a;
                        kl klVar3 = hi6.e;
                        f = 0.0f;
                        kl klVar4 = hi6.f;
                        if (klVar4 == null) {
                            klVar = klVar2;
                        } else {
                            klVar = klVar4;
                        }
                        klVar2 = p38.j(j, klVar3, oi6.P, klVar);
                    } else {
                        f = 0.0f;
                        if (!(hi6 == null || hi6.a == 0)) {
                            long j2 = hi6.g;
                            if (j2 == Long.MIN_VALUE) {
                                j2 = oi62.B;
                            }
                            float f2 = ((float) j2) / 1.0E9f;
                            if (f2 > 0.0f) {
                                klVar2 = new kl(1.0f / f2);
                            }
                        }
                    }
                    if (hi6 == null) {
                        hi6 = new hi6();
                    }
                    kl klVar5 = hi6.e;
                    hi6.b = null;
                    hi6.c = false;
                    hi6.d = ad5.d();
                    klVar5.e(0, ad5.d());
                    long j3 = oi62.B;
                    hi6.g = j3;
                    hi6.a = 0;
                    hi6.f = klVar2;
                    hi6.h = dh4.D((1.0d - ((double) ad5.d())) * ((double) j3));
                    oi62.K = hi6;
                }
                this.C = null;
                this.D = null;
                this.B = 4;
            }
            return obj3;
        } else if (i == 4) {
            o85.q(obj);
            f = 0.0f;
            oi62.O0(obj2);
            oi62.n1(f);
            mm7.j();
            this.B = 5;
            if (oi6.f1(oi62, this) == obj4) {
                return obj4;
            }
            return obj3;
        } else if (i == 5) {
            o85.q(obj);
            return obj3;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            Object obj5 = oi6.z;
            qq4.k((Object) null);
            if (!sg3.e(obj2, obj5)) {
                this.C = null;
                this.D = null;
                this.B = 2;
                if (oi62.I != Long.MIN_VALUE ? (r4 = oi62.h1(this)) != obj4 : (r4 = pd8.s(r()).a(oi62.L, this)) != obj4) {
                    Object obj6 = obj3;
                }
            }
            ed5 = oi62.y;
            ad5 ad52 = oi62.E;
            if (!sg3.e(ed5.getValue(), obj2)) {
            }
            return obj3;
        } catch (Throwable th) {
            qq4.k((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: fi2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ad0} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e A[Catch:{ all -> 0x0026 }] */
    private final java.lang.Object z(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.G
            sr2 r0 = (defpackage.sr2) r0
            int r1 = r10.B
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p81 r6 = defpackage.p81.w
            if (r1 == 0) goto L_0x0041
            if (r1 == r4) goto L_0x0014
            if (r1 == r3) goto L_0x002f
            if (r1 != r2) goto L_0x0029
        L_0x0014:
            java.lang.Object r1 = r10.E
            java.lang.Object r4 = r10.D
            en0 r4 = (defpackage.en0) r4
            java.lang.Object r7 = r10.C
            br4 r7 = (defpackage.br4) r7
            java.lang.Object r8 = r10.F
            fi2 r8 = (defpackage.fi2) r8
            defpackage.o85.q(r11)     // Catch:{ all -> 0x0026 }
            goto L_0x0073
        L_0x0026:
            r10 = move-exception
            goto L_0x00a3
        L_0x0029:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r10)
            return r5
        L_0x002f:
            java.lang.Object r1 = r10.E
            java.lang.Object r4 = r10.D
            en0 r4 = (defpackage.en0) r4
            java.lang.Object r7 = r10.C
            br4 r7 = (defpackage.br4) r7
            java.lang.Object r8 = r10.F
            fi2 r8 = (defpackage.fi2) r8
            defpackage.o85.q(r11)     // Catch:{ all -> 0x0026 }
            goto L_0x0084
        L_0x0041:
            defpackage.o85.q(r11)
            java.lang.Object r11 = r10.F
            r8 = r11
            fi2 r8 = (defpackage.fi2) r8
            br4 r7 = new br4
            r11 = 13
            r1 = 0
            r7.<init>((char) r1, (int) r11)
            qu6 r11 = new qu6
            r11.<init>()
            r7.x = r11
            r11 = 6
            ad0 r11 = defpackage.rj1.c(r4, r11, r5)
            java.lang.Object r1 = r7.S(r11, r0)     // Catch:{ all -> 0x00a1 }
            r10.F = r8     // Catch:{ all -> 0x00a1 }
            r10.C = r7     // Catch:{ all -> 0x00a1 }
            r10.D = r11     // Catch:{ all -> 0x00a1 }
            r10.E = r1     // Catch:{ all -> 0x00a1 }
            r10.B = r4     // Catch:{ all -> 0x00a1 }
            java.lang.Object r4 = r8.k(r1, r10)     // Catch:{ all -> 0x00a1 }
            if (r4 != r6) goto L_0x0072
            goto L_0x009e
        L_0x0072:
            r4 = r11
        L_0x0073:
            r10.F = r8     // Catch:{ all -> 0x0026 }
            r10.C = r7     // Catch:{ all -> 0x0026 }
            r10.D = r4     // Catch:{ all -> 0x0026 }
            r10.E = r1     // Catch:{ all -> 0x0026 }
            r10.B = r3     // Catch:{ all -> 0x0026 }
            java.lang.Object r11 = r4.q(r10)     // Catch:{ all -> 0x0026 }
            if (r11 != r6) goto L_0x0084
            goto L_0x009e
        L_0x0084:
            java.lang.Object r11 = r7.S(r4, r0)     // Catch:{ all -> 0x0026 }
            boolean r9 = defpackage.sg3.e(r11, r1)     // Catch:{ all -> 0x0026 }
            if (r9 != 0) goto L_0x0073
            r10.F = r8     // Catch:{ all -> 0x0026 }
            r10.C = r7     // Catch:{ all -> 0x0026 }
            r10.D = r4     // Catch:{ all -> 0x0026 }
            r10.E = r11     // Catch:{ all -> 0x0026 }
            r10.B = r2     // Catch:{ all -> 0x0026 }
            java.lang.Object r1 = r8.k(r11, r10)     // Catch:{ all -> 0x0026 }
            if (r1 != r6) goto L_0x009f
        L_0x009e:
            return r6
        L_0x009f:
            r1 = r11
            goto L_0x0073
        L_0x00a1:
            r10 = move-exception
            r4 = r11
        L_0x00a3:
            java.lang.Object r11 = r7.x
            in8 r11 = (defpackage.in8) r11
            if (r11 == 0) goto L_0x00ac
            r11.N0(r4)
        L_0x00ac:
            java.lang.Object r11 = r7.x
            in8 r11 = (defpackage.in8) r11
            if (r11 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.vm5.b(r0)
        L_0x00b8:
            r11.C0()
            r7.x = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6.z(java.lang.Object):java.lang.Object");
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                ((w6) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case 2:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((w6) o((f61) obj2, (np5) obj)).s(vs7);
            case 7:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((w6) o((f61) obj2, (fg0) obj)).s(vs7);
            case 10:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return ((w6) o((f61) obj2, (di2) obj)).s(vs7);
            case 12:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                ((w6) o((f61) obj2, (fi2) obj)).s(vs7);
                return p81;
            case 17:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((w6) o((f61) obj2, (xh6) obj)).s(vs7);
            case 19:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((w6) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new w6((Object) (p7) this.D, (Object) (String) this.E, (Object) (String) this.F, (Object) (String) this.G, f61, 0);
            case 1:
                w6 w6Var = new w6((Object) (mh) this.D, (Object) (vr2) this.E, (Object) (og) this.F, (Object) (o44) this.G, f61, 1);
                w6Var.C = obj;
                return w6Var;
            case 2:
                return new w6((d37) this.C, f61, (c30) this.D, (b56) this.F, (String) this.E);
            case 3:
                w6 w6Var2 = new w6((gs2) this.F, (af0) this.G, f61);
                w6Var2.E = obj;
                return w6Var2;
            case 4:
                return new w6((u44) this.C, (aq4) this.D, (rf7) this.E, (ze7) this.F, (c93) this.G, f61, 4);
            case 5:
                return new w6((yb0) this.C, (hf7) this.D, (u44) this.E, (cg7) this.F, (v35) this.G, f61, 5);
            case 6:
                w6 w6Var3 = new w6((Object) (in8) this.D, (Object) (k54) this.E, (Object) (e81) this.F, (Object) (di2) this.G, f61, 6);
                w6Var3.C = obj;
                return w6Var3;
            case 7:
                return new w6((lo2) this.G, (String) this.F, f61);
            case 8:
                w6 w6Var4 = new w6((c23) this.D, (Uri) this.G, (String) this.F, f61);
                w6Var4.C = obj;
                return w6Var4;
            case 9:
                w6 w6Var5 = new w6((Object) (px3) this.D, this.E, (Object) (zr3) this.F, (Object) (Charset) this.G, f61, 9);
                w6Var5.C = obj;
                return w6Var5;
            case 10:
                return new w6((uj) this.C, (x17) this.D, (List) this.E, (bd5) this.F, (ad5) this.G, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                w6 w6Var6 = new w6((Object) (hx0) this.D, (Object) (aq4) this.E, (Object) (ad5) this.F, (Object) (aq4) this.G, f61, 11);
                w6Var6.C = obj;
                return w6Var6;
            case 12:
                return new w6((Context) this.C, (Uri) this.D, (aq4) this.E, (aq4) this.F, (aq4) this.G, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new w6((s83) this.C, (jx5) this.D, (uu6) this.E, (g72) this.F, (Bitmap) this.G, f61, 13);
            case 14:
                w6 w6Var7 = new w6((Object) (gy5) this.E, (Object) (fy5) this.F, (Object) (gj) this.G, f61, 14);
                w6Var7.D = obj;
                return w6Var7;
            case h75.g:
                return new w6((Object) (oi6) this.E, this.F, (Object) (mm7) this.G, f61, 15);
            case 16:
                w6 w6Var8 = new w6((sr2) this.G, f61);
                w6Var8.F = obj;
                return w6Var8;
            case 17:
                w6 w6Var9 = new w6((Object) (uk5) this.D, (Object) (pe7) this.E, (Object) (t46) this.F, (Object) (co5) this.G, f61, 17);
                w6Var9.C = obj;
                return w6Var9;
            case 18:
                w6 w6Var10 = new w6((Object) (cl7) this.E, (Object) (zh6) this.F, (Object) (h06) this.G, f61, 18);
                w6Var10.D = obj;
                return w6Var10;
            case 19:
                return new w6((dy7) this.C, (String) this.E, (String) this.F, (String) this.G, (String) this.D, f61);
            default:
                return new w6((dy7) this.C, (String) this.E, (List) this.D, (String) this.F, (String) this.G, f61);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: fl3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: m66} */
    /* JADX WARNING: type inference failed for: r14v3, types: [im5, bj6] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05d0, code lost:
        r7.v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05df, code lost:
        if (defpackage.r16.Q(r6.k()).isCancelled() == false) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05e1, code lost:
        r2.a(defpackage.r16.Q(r6.k()).E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05f0, code lost:
        r5.E = r6;
        r5.C = null;
        r5.B = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05fb, code lost:
        if (r7.j0(r5) != r11) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        r5.E = null;
        r5.C = null;
        r5.D = null;
        r5.B = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x060a, code lost:
        if (r2.f(r5) != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0623, code lost:
        if (r7.j0(r5) != r11) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        r5.E = null;
        r5.C = null;
        r5.D = null;
        r5.B = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0633, code lost:
        if (r2.f(r5) != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0643, code lost:
        if (r7.j0(r5) != r11) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r5.E = null;
        r5.C = null;
        r5.D = r0;
        r5.B = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0653, code lost:
        if (r2.f(r5) != r11) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01dd, code lost:
        if (r0 == r11) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020c, code lost:
        if (((defpackage.uj) r5.C).f(r5, r1) == r11) goto L_0x020e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x042b A[Catch:{ CancellationException -> 0x0457, Exception -> 0x044b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:249:0x0626=Splitter:B:249:0x0626, B:241:0x05fe=Splitter:B:241:0x05fe} */
    public final Object s(Object obj) {
        Object obj2;
        p7 p7Var;
        Object obj3;
        k20 k20;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        fl3 fl3;
        ly5 ly5;
        m66 m66;
        Object obj4;
        lo2 lo2;
        List<ForumCommentFeedDto> list;
        String str;
        int i;
        Object obj5;
        String str2;
        String str3;
        String str4;
        String str5;
        Throwable th;
        Object obj6;
        zs4 zs4;
        Object obj7;
        boolean z;
        int i2 = this.A;
        boolean z2 = false;
        Object obj8 = vs7.a;
        p81 p81 = p81.w;
        switch (i2) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    p7 p7Var2 = this.D;
                    p7Var = p7Var2;
                    this.C = p7Var;
                    this.B = 1;
                    if (p7.a(p7Var, new v6(p7Var2, (String) this.E, (String) this.F, (String) this.G, (f61) null), this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    p7Var = (p7) this.C;
                    o85.q(obj);
                } else if (i3 == 2) {
                    f61 f61 = (f61) ((p7) this.C);
                    try {
                        o85.q(obj);
                        obj2 = obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj2 = new m66(e2);
                    }
                    return new o66(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                UserInfo j = rg3.t(p7Var.a).j();
                if (j != null) {
                    this.C = null;
                    this.B = 2;
                    obj2 = p7Var.l(j, (String) null, this);
                    if (obj2 == p81) {
                        return p81;
                    }
                    return new o66(obj2);
                }
                throw new IllegalStateException("No se pudo obtener la sesión. Inténtalo de nuevo.");
            case 1:
                og ogVar = (og) this.F;
                mh mhVar = (mh) this.D;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    o81 o81 = (o81) this.C;
                    r44 r44 = s44.a;
                    View view = mhVar.w;
                    r44.getClass();
                    qc3 qc3 = new qc3(view);
                    v44 v44 = new v44(mhVar.w, new mg((o44) this.G), qc3);
                    if (e67.a) {
                        ar7.H(o81, (e81) null, (r81) null, new n0(ogVar, qc3, (f61) null, 4), 3);
                    }
                    vr2 vr2 = (vr2) this.E;
                    if (vr2 != null) {
                        vr2.y(v44);
                    }
                    ogVar.c = v44;
                    this.B = 1;
                    mhVar.a(v44, this);
                    return p81;
                } else if (i4 != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    try {
                        o85.q(obj);
                        throw new RuntimeException();
                    } catch (Throwable th2) {
                        ogVar.c = null;
                        throw th2;
                    }
                }
            case 2:
                d37 d37 = (d37) this.C;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    k20 = (k20) ((is7) d37.getValue()).a;
                    this.G = k20;
                    this.B = 1;
                    obj3 = ((c30) this.D).b.b((b56) this.F, (String) this.E, (Throwable) null, this);
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    k20 = (k20) this.G;
                    o85.q(obj);
                    obj3 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj3 instanceof m66)) {
                    vs7 vs7 = (vs7) obj3;
                    obj3 = k20.a(k20, (List) null, new hv2(25, (Object) Boolean.TRUE), 1);
                }
                boolean z3 = obj3 instanceof m66;
                if (!z3) {
                    if (z3) {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        do {
                            value3 = d37.getValue();
                        } while (!d37.i(value3, is7.a((is7) value3, obj3, false, (hv2) null, 4)));
                        return obj8;
                    }
                    do {
                        value2 = d37.getValue();
                    } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                    return obj8;
                }
                do {
                    value = d37.getValue();
                } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj3)), 1)));
                return obj8;
            case 3:
                af0 af0 = (af0) this.G;
                o81 o812 = (o81) this.E;
                switch (this.B) {
                    case b85.b:
                        o85.q(obj);
                        fl3 = new fl3(r16.Q(o812.k()));
                        ff8 ff8 = new ff8(af0, o812.k().X(fl3));
                        this.E = o812;
                        this.C = fl3;
                        this.B = 1;
                        if (((gs2) this.F).H(ff8, this) == p81) {
                            break;
                        }
                        break;
                    case 1:
                        fl3 = this.C;
                        try {
                            o85.q(obj);
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            this.E = o812;
                            this.C = null;
                            this.D = th;
                            this.B = 6;
                            break;
                        }
                    case 2:
                        o85.q(obj);
                        break;
                    case 3:
                    case 5:
                        o81 o813 = (o81) ((Throwable) this.D);
                        try {
                            o85.q(obj);
                            return obj8;
                        } catch (Throwable unused) {
                            return obj8;
                        }
                    case 4:
                        o85.q(obj);
                        break;
                    case 6:
                        th = (Throwable) this.D;
                        o85.q(obj);
                        break;
                    case 7:
                        th = (Throwable) this.D;
                        try {
                            o85.q(obj);
                            break;
                        } catch (Throwable unused2) {
                            break;
                        }
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 4:
                u44 u44 = (u44) this.C;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    ze1 w = u55.w(new wi((aq4) this.D, 19));
                    nn0 nn0 = new nn0(u44, (rf7) this.E, (ze7) this.F, (c93) this.G, 1);
                    this.B = 1;
                    if (w.a(nn0, this) == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th4) {
                        pv8.C(u44);
                        throw th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pv8.C(u44);
                return obj8;
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    yb0 yb0 = (yb0) this.C;
                    td7 td7 = ((u44) this.E).a;
                    bg7 bg7 = ((cg7) this.F).a;
                    this.B = 1;
                    int p = ((v35) this.G).p(lg7.e(((hf7) this.D).b));
                    if (p < bg7.a.a.x.length()) {
                        ly5 = bg7.b(p);
                    } else if (p != 0) {
                        ly5 = bg7.b(p - 1);
                    } else {
                        ly5 = new ly5(0.0f, 0.0f, 1.0f, (float) ((int) (zd7.a(td7.b, td7.g, td7.h) & 4294967295L)));
                    }
                    Object a = yb0.a(ly5, this);
                    if (a != p81) {
                        a = obj8;
                    }
                    if (a == p81) {
                        return p81;
                    }
                    return obj8;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 6:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    p0 p0Var = new p0((e81) this.F, (di2) this.G, (np5) this.C, (f61) null, 20);
                    this.B = 1;
                    if (g75.P((in8) this.D, (k54) this.E, p0Var, this) == p81) {
                        return p81;
                    }
                    return obj8;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 7:
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    lo2 lo22 = (lo2) this.G;
                    j77 j77 = lo22.a;
                    String str6 = (String) this.F;
                    UserInfo j2 = rg3.t(j77).j();
                    if (j2 != null) {
                        str2 = j2.getId();
                    } else {
                        str2 = null;
                    }
                    hm5 i10 = f55.i(j77, "forum_comments_feed");
                    gm5 gm5 = i10.a;
                    String str7 = i10.c;
                    ku4 ku4 = gm5.c.v;
                    ? im5 = new im5(str7, ku4);
                    zc9 zc9 = new zc9(ku4, im5.f, 4);
                    str6.getClass();
                    zc9.a("post_id", xd2.EQ, str6);
                    im5.b(im5, "created_at", w75.ASCENDING);
                    im5.d("*");
                    h66 h66 = h66.a;
                    String str8 = i10.b;
                    this.C = lo22;
                    this.D = str2;
                    this.E = null;
                    this.B = 1;
                    obj5 = h66.a(gm5, str8, im5, this);
                    if (obj5 == p81) {
                        return p81;
                    }
                    lo2 = lo22;
                    str = str2;
                } else if (i9 == 1) {
                    hm5 hm5 = (hm5) ((String) this.E);
                    str = (String) this.D;
                    lo2 lo23 = (lo2) this.C;
                    o85.q(obj);
                    lo2 = lo23;
                    obj5 = obj;
                } else if (i9 == 2) {
                    str = (String) this.E;
                    list = (List) this.D;
                    lo2 = (lo2) this.C;
                    try {
                        o85.q(obj);
                        obj4 = obj;
                        Map map = (Map) obj4;
                        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                        for (ForumCommentFeedDto forumCommentFeedDto : list) {
                            Integer num = (Integer) map.get(forumCommentFeedDto.getId());
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            arrayList.add(lo2.f(lo2, forumCommentFeedDto, str, i));
                        }
                        m66 = arrayList;
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        m66 = new m66(e4);
                    }
                    return new o66(m66);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj5;
                t77 t77 = jm5.b.d;
                String str9 = jm5.a;
                gs3 gs3 = gs3.c;
                list = (List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(ForumCommentFeedDto.class))), str9);
                ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                for (ForumCommentFeedDto id : list) {
                    arrayList2.add(id.getId());
                }
                this.C = lo2;
                this.D = list;
                this.E = str;
                this.B = 2;
                obj4 = lo2.d(lo2, str, arrayList2, this);
                if (obj4 == p81) {
                    return p81;
                }
                Map map2 = (Map) obj4;
                ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
                while (r1.hasNext()) {
                }
                m66 = arrayList3;
                return new o66(m66);
            case 8:
                String str10 = (String) this.F;
                c23 c23 = (c23) this.D;
                o81 o814 = (o81) this.C;
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    Cursor query = c23.h.getContentResolver().query((Uri) this.G, new String[]{"data1", "display_name"}, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str5 = query.getString(query.getColumnIndexOrThrow("data1"));
                                try {
                                    str4 = query.getString(query.getColumnIndexOrThrow("display_name"));
                                } catch (Throwable unused3) {
                                    str4 = null;
                                }
                            } else {
                                str5 = null;
                                str4 = null;
                            }
                            query.close();
                        } catch (Throwable th5) {
                            ed1.i(query, th);
                            throw th5;
                        }
                    } else {
                        str5 = null;
                        str4 = null;
                    }
                    if (str5 == null) {
                        return obj8;
                    }
                    Pattern compile = Pattern.compile("\\+53|[^0-9]");
                    compile.getClass();
                    String replaceAll = compile.matcher(str5).replaceAll("");
                    replaceAll.getClass();
                    str3 = d57.j1(replaceAll);
                    if (str10.equals("*99")) {
                        nz7 nz7 = c23.b;
                        if (str4 == null) {
                            str4 = str3;
                        }
                        this.C = null;
                        this.E = str3;
                        this.B = 1;
                        if (nz7.a(str4, str3, this) == p81) {
                            return p81;
                        }
                    }
                } else if (i11 == 1) {
                    str3 = (String) this.E;
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String n = b81.n(str10, str3);
                Context context = c23.h;
                Context context2 = c23.h;
                boolean A2 = sg3.A(context, "android.permission.CALL_PHONE");
                rg5 rg5 = c23.g;
                if (A2) {
                    int i12 = c23.q;
                    rg5.getClass();
                    rg5.b(context2, n, i12);
                    return obj8;
                }
                rg5.getClass();
                rg5.e(context2, n);
                return obj8;
            case 9:
                fg0 fg0 = (fg0) this.C;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    Object obj9 = this.E;
                    obj9.getClass();
                    zr3 zr3 = (zr3) this.F;
                    zr3.getClass();
                    this.C = null;
                    this.B = 1;
                    if (px3.a((px3) this.D, (di2) obj9, zr3, (Charset) this.G, fg0, this) == p81) {
                        return p81;
                    }
                    return obj8;
                } else if (i13 == 1) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 10:
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj6 = uj.c((uj) this.C, new Float(1.0f), (x17) this.D, (Float) null, (vr2) null, this, 12);
                    break;
                } else if (i14 == 1) {
                    o85.q(obj);
                    obj6 = obj;
                } else if (i14 == 2) {
                    o85.q(obj);
                    ad5 ad5 = (ad5) this.G;
                    ad5.e((ad5.d() + 90.0f) % 360.0f);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((fl) obj6).b == al.x) {
                    bd5 bd5 = (bd5) this.F;
                    bd5.e((bd5.d() + 1) % ((List) this.E).size());
                    Float f = new Float(0.0f);
                    this.B = 2;
                    break;
                } else {
                    return obj8;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ad5 ad52 = (ad5) this.F;
                aq4 aq4 = (aq4) this.G;
                hx0 hx0 = (hx0) this.D;
                aq4 aq42 = (aq4) this.E;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    di2 di2 = (di2) this.C;
                    if (((List) aq42.getValue()).size() < 2) {
                        this.B = 1;
                        if (di2.a(su4.w, this) != p81) {
                            return obj8;
                        }
                    } else {
                        ad52.e(0.0f);
                        zs4 zs42 = (zs4) dt0.G0((List) aq42.getValue());
                        hx0.g(zs42);
                        hx0.g((zs4) ((List) aq42.getValue()).get(((List) aq42.getValue()).size() - 2));
                        n40 n40 = new n40(6, aq4, ad52);
                        this.C = zs42;
                        this.B = 2;
                        if (di2.a(n40, this) != p81) {
                            zs4 = zs42;
                        }
                    }
                    return p81;
                } else if (i15 == 1) {
                    o85.q(obj);
                    return obj8;
                } else if (i15 == 2) {
                    zs4 = (zs4) this.C;
                    try {
                        o85.q(obj);
                    } catch (Throwable th6) {
                        aq4.setValue(Boolean.FALSE);
                        throw th6;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hx0.e(zs4, false);
                aq4.setValue(Boolean.FALSE);
                return obj8;
            case 12:
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    dn1 dn1 = aw1.a;
                    obj7 = ar7.e0(cm1.y, new an2((Context) this.C, (Uri) this.D, (f61) null, 1), this);
                    if (obj7 == p81) {
                        return p81;
                    }
                } else if (i16 == 1) {
                    o85.q(obj);
                    obj7 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byte[] bArr = (byte[]) obj7;
                ((aq4) this.E).setValue(Boolean.FALSE);
                aq4 aq43 = (aq4) this.F;
                if (bArr == null) {
                    z2 = true;
                }
                aq43.setValue(Boolean.valueOf(z2));
                if (bArr == null) {
                    return obj8;
                }
                ((aq4) this.G).setValue(bArr);
                return obj8;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    s83 s83 = (s83) this.C;
                    ArrayList arrayList4 = ((jx5) this.D).g;
                    uu6 uu6 = (uu6) this.E;
                    g72 g72 = (g72) this.F;
                    if (((Bitmap) this.G) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mx5 mx5 = new mx5(s83, arrayList4, 0, s83, uu6, g72, z);
                    this.B = 1;
                    Object b = mx5.b(s83, this);
                    if (b == p81) {
                        return p81;
                    }
                    return b;
                } else if (i17 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 14:
                return v(obj);
            case h75.g:
                return x(obj);
            case 16:
                return z(obj);
            case 17:
                return A(obj);
            case 18:
                return B(obj);
            case 19:
                return G(obj);
            default:
                int i18 = this.B;
                if (i18 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.C).a;
                    bc0 bc0 = new bc0((Object) (String) this.E, (Object) (List) this.D, (Serializable) (String) this.F, (Object) (String) this.G, (f61) null, 3);
                    this.B = 1;
                    Object a2 = qe1.a(bc0, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i18 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(sr2 sr2, f61 f61) {
        super(2, f61);
        this.A = 16;
        this.G = sr2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(gs2 gs2, af0 af0, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.F = gs2;
        this.G = af0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(c23 c23, Uri uri, String str, f61 f61) {
        super(2, f61);
        this.A = 8;
        this.D = c23;
        this.G = uri;
        this.F = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(d37 d37, f61 f61, c30 c30, b56 b56, String str) {
        super(2, f61);
        this.A = 2;
        this.C = d37;
        this.D = c30;
        this.F = b56;
        this.E = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(lo2 lo2, String str, f61 f61) {
        super(2, f61);
        this.A = 7;
        this.G = lo2;
        this.F = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6(dy7 dy7, String str, List list, String str2, String str3, f61 f61) {
        super(2, f61);
        this.A = 20;
        this.C = dy7;
        this.E = str;
        this.D = list;
        this.F = str2;
        this.G = str3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, Object obj4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
        this.G = obj5;
    }
}

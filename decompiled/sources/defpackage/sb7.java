package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;

/* renamed from: sb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sb7 {
    public static final zy1 a = new zy1(3, (f61) null, 2);

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    public static final java.lang.Object a(defpackage.g97 r5, boolean r6, defpackage.lk5 r7, defpackage.q50 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jb7
            if (r0 == 0) goto L_0x0013
            r0 = r8
            jb7 r0 = (defpackage.jb7) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            jb7 r0 = new jb7
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            int r1 = r0.D
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002f
            boolean r5 = r0.B
            lk5 r6 = r0.A
            g97 r7 = r0.z
            defpackage.o85.q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L_0x004a
        L_0x002f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r5)
            r5 = 0
            return r5
        L_0x0036:
            defpackage.o85.q(r8)
        L_0x0039:
            r0.z = r5
            r0.A = r7
            r0.B = r6
            r0.D = r2
            java.lang.Object r8 = r5.c(r7, r0)
            p81 r1 = defpackage.p81.w
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            kk5 r8 = (defpackage.kk5) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L_0x0039
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb7.a(g97, boolean, lk5, q50):java.lang.Object");
    }

    public static /* synthetic */ Object b(g97 g97, q50 q50, int i) {
        boolean z;
        lk5 lk5;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            lk5 = lk5.x;
        } else {
            lk5 = lk5.w;
        }
        return a(g97, z, lk5, q50);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[LOOP:0: B:17:0x004a->B:18:0x004c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[SYNTHETIC] */
    public static final java.lang.Object c(defpackage.g97 r7, defpackage.h61 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.kb7
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kb7 r0 = (defpackage.kb7) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            kb7 r0 = new kb7
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r2) goto L_0x0027
            g97 r7 = r0.z
            defpackage.o85.q(r8)
            goto L_0x0040
        L_0x0027:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r7)
            r7 = 0
            return r7
        L_0x002e:
            defpackage.o85.q(r8)
        L_0x0031:
            r0.z = r7
            r0.B = r2
            lk5 r8 = defpackage.lk5.x
            java.lang.Object r8 = r7.c(r8, r0)
            p81 r1 = defpackage.p81.w
            if (r8 != r1) goto L_0x0040
            return r1
        L_0x0040:
            kk5 r8 = (defpackage.kk5) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L_0x004a:
            if (r5 >= r3) goto L_0x0058
            java.lang.Object r6 = r1.get(r5)
            qk5 r6 = (defpackage.qk5) r6
            r6.a()
            int r5 = r5 + 1
            goto L_0x004a
        L_0x0058:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L_0x005e:
            if (r4 >= r1) goto L_0x006e
            java.lang.Object r3 = r8.get(r4)
            qk5 r3 = (defpackage.qk5) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x006b
            goto L_0x0031
        L_0x006b:
            int r4 = r4 + 1
            goto L_0x005e
        L_0x006e:
            vs7 r7 = defpackage.vs7.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb7.c(g97, h61):java.lang.Object");
    }

    public static Object d(uk5 uk5, vr2 vr2, f61 f61) {
        Object L = gl0.L(new ng(uk5, (hs2) a, vr2, (f61) null), f61);
        if (L == p81.w) {
            return L;
        }
        return vs7.a;
    }

    public static boolean e(kk5 kk5, boolean z) {
        boolean z2;
        List list = kk5.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qk5 qk5 = (qk5) list.get(i);
            if (z) {
                z2 = ub5.a(qk5);
            } else {
                z2 = ub5.b(qk5);
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public static h27 f(o81 o81, el3 el3, gs2 gs2) {
        return ar7.H(o81, (e81) null, r81.z, new ii3((Object) el3, (Object) gs2, (f61) null, 29), 1);
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [vr2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [f61, e81] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r2v23, types: [h61] */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03cf, code lost:
        defpackage.h.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03d2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01c5, code lost:
        r1 = (defpackage.qk5) r1;
        r22 = r8;
        r8 = r5;
        r5 = r9;
        r9 = r6;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f9, code lost:
        r1 = (defpackage.nc4) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01ff, code lost:
        if (defpackage.sg3.e(r1, r14) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0201, code lost:
        r9.y(new defpackage.l35(r3.c));
        r2.z = r8;
        r2.A = r7;
        r2.B = r0;
        r5 = null;
        r2.C = null;
        r2.D = null;
        r2.E = null;
        r2.F = null;
        r2.G = null;
        r2.H = null;
        r2.J = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0225, code lost:
        if (c(r11, r2) != r4) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0229, code lost:
        r3 = r7;
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x022b, code lost:
        f(r2, r0, new defpackage.lb7(r3, r5, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0234, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0237, code lost:
        if ((r1 instanceof defpackage.lc4) == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0239, code lost:
        r1 = ((defpackage.lc4) r1).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0240, code lost:
        if ((r1 instanceof defpackage.kc4) == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0242, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0243, code lost:
        r3 = r5;
        r5 = r8;
        r8 = r6;
        r6 = r7;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0248, code lost:
        if (r1 != null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x024a, code lost:
        r20 = r12;
        r19 = r14;
        r0 = f(r5, r0, new defpackage.lb7(r6, (defpackage.f61) null, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x025a, code lost:
        r20 = r12;
        r19 = r14;
        r1.a();
        r0 = f(r5, r0, new defpackage.lb7(r6, (defpackage.f61) null, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x026c, code lost:
        if (r1 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x026e, code lost:
        if (r7 != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0270, code lost:
        if (r3 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0272, code lost:
        r3.y(new defpackage.l35(r1.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x027c, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x027d, code lost:
        r2.z = r11;
        r2.A = r5;
        r2.B = r6;
        r2.C = r7;
        r2.D = r9;
        r2.E = r8;
        r2.F = r3;
        r2.G = r1;
        r2.H = r0;
        r2.J = 5;
        r18 = r0;
        r0 = r11.j(r11.g().a(), new defpackage.rj6(r1, (defpackage.f61) null), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02a6, code lost:
        if (r0 != r4) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02aa, code lost:
        r13 = r11;
        r11 = r7;
        r7 = r3;
        r3 = r1;
        r1 = r0;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02b1, code lost:
        r1 = (defpackage.qk5) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02b3, code lost:
        if (r1 != null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02b5, code lost:
        if (r7 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b7, code lost:
        r7.y(new defpackage.l35(r3.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02c1, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02c2, code lost:
        r26 = r1;
        r0 = defpackage.ar7.H(r5, (defpackage.e81) null, r10, new defpackage.k05(r0, r6, (defpackage.f61) null, 27), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02d1, code lost:
        if (r8 == r15) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02d3, code lost:
        r25 = r6;
        r8 = r25;
        r1 = r26;
        r12 = null;
        f(r5, r0, new defpackage.pb7(r8, r25, r26, (defpackage.f61) null, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02ef, code lost:
        r12 = null;
        r8 = r6;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02f3, code lost:
        if (r9 != null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f5, code lost:
        r2.z = r5;
        r2.A = r8;
        r2.B = r11;
        r2.C = r7;
        r2.D = r0;
        r2.E = r3;
        r2.F = r12;
        r2.G = r12;
        r2.H = r12;
        r2.J = 6;
        r1 = i(r13, r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0310, code lost:
        if (r1 != r4) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0314, code lost:
        r2 = r3;
        r3 = r0;
        r0 = r2;
        r2 = r5;
        r4 = r7;
        r7 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x031a, code lost:
        r13 = (defpackage.qk5) r1;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x031f, code lost:
        r2.z = r13;
        r2.A = r5;
        r2.B = r8;
        r2.C = r11;
        r2.D = r9;
        r2.E = r7;
        r2.F = r0;
        r2.G = r3;
        r2.H = r1;
        r2.J = 7;
        r6 = h(r13, r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x033a, code lost:
        if (r6 != r4) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x033d, code lost:
        r10 = r7;
        r7 = r0;
        r0 = r1;
        r1 = r6;
        r6 = r3;
        r3 = r8;
        r8 = r10;
        r10 = r11;
        r15 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0346, code lost:
        r1 = (defpackage.nc4) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x034e, code lost:
        if (defpackage.sg3.e(r1, r19) == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0350, code lost:
        r9.y(new defpackage.l35(r0.c));
        r2.z = r5;
        r2.A = r3;
        r2.B = r7;
        r2.C = r12;
        r2.D = r12;
        r2.E = r12;
        r2.F = r12;
        r2.G = r12;
        r2.H = r12;
        r2.J = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0374, code lost:
        if (c(r15, r2) != r4) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0376, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0377, code lost:
        r2 = r5;
        r0 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0379, code lost:
        f(r2, r0, new defpackage.lb7(r3, r12, 7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0382, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0385, code lost:
        if ((r1 instanceof defpackage.lc4) == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0387, code lost:
        r13 = ((defpackage.lc4) r1).a;
        r2 = r5;
        r0 = r6;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x038e, code lost:
        r8 = r3;
        r3 = r7;
        r7 = r10;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0394, code lost:
        if ((r1 instanceof defpackage.kc4) == false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0396, code lost:
        r2 = r5;
        r0 = r6;
        r4 = r8;
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x039b, code lost:
        if (r13 == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039d, code lost:
        r13.a();
        f(r2, r3, new defpackage.lb7(r8, r12, 5));
        r7.y(new defpackage.l35(r13.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03b3, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03b4, code lost:
        f(r2, r3, new defpackage.lb7(r8, r12, 6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03bd, code lost:
        if (r4 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03bf, code lost:
        r4.y(new defpackage.l35(r0.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03c9, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03ca, code lost:
        defpackage.h.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03cd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03ce, code lost:
        return r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Unknown variable types count: 2 */
    public static final Object g(g97 g97, o81 o81, co5 co5, hs2 hs2, vr2 vr2, q50 q50) {
        ob7 ob7;
        int i;
        co5 co52;
        mc4 mc4;
        vr2 vr22;
        o81 o812;
        g97 g972;
        vr2 vr23;
        vr2 vr24;
        el3 el3;
        vr2 vr25;
        o81 o813;
        co5 co53;
        hs2 hs22;
        vr2 vr26;
        qk5 qk5;
        o81 o814;
        co5 co54;
        vr2 vr27;
        hs2 hs23;
        Object obj;
        int i2;
        vr2 vr28;
        ? r5;
        co5 co55;
        o81 o815;
        g97 g973;
        el3 el32;
        g97 g974 = g97;
        q50 q502 = q50;
        if (q502 instanceof ob7) {
            ob7 ob72 = (ob7) q502;
            int i3 = ob72.J;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ob72.J = i3 - Integer.MIN_VALUE;
                ob7 = ob72;
                Object obj2 = ob7.I;
                i = ob7.J;
                r81 r81 = r81.z;
                lk5 lk5 = lk5.x;
                mc4 mc42 = mc4.a;
                hs2 hs24 = a;
                vs7 vs7 = vs7.a;
                Object obj3 = p81.w;
                switch (i) {
                    case b85.b:
                        o85.q(obj2);
                        ob7.z = g974;
                        o815 = o81;
                        ob7.A = o815;
                        co55 = co5;
                        ob7.B = co55;
                        r5 = 0;
                        ob7.C = null;
                        ob7.D = null;
                        hs22 = hs2;
                        ob7.E = hs22;
                        vr28 = vr2;
                        ob7.F = vr28;
                        i2 = 1;
                        ob7.J = 1;
                        obj = b(g974, ob7, 3);
                        if (obj != obj3) {
                            vr22 = null;
                            vr25 = null;
                        }
                        break;
                    case 1:
                        vr2 vr29 = ob7.C;
                        o85.q(obj2);
                        obj = obj2;
                        vr25 = vr29;
                        o815 = (o81) ob7.A;
                        i2 = 1;
                        hs22 = (hs2) ob7.E;
                        co55 = (co5) ob7.B;
                        vr28 = (vr2) ob7.F;
                        g974 = (g97) ob7.z;
                        vr22 = (vr2) ob7.D;
                        r5 = 0;
                        qk5 qk52 = (qk5) obj;
                        qk52.a();
                        qk5 qk53 = qk52;
                        el3 H = ar7.H(o815, r5, r81, new mb7(co55, r5, i2), i2);
                        if (hs22 != hs24) {
                            co5 co56 = co55;
                            co54 = co56;
                            qk5 = qk53;
                            f(o815, H, new pb7(hs22, co56, qk53, r5, 0));
                        } else {
                            co54 = co55;
                            qk5 = qk53;
                        }
                        if (vr22 != null) {
                            ob7.z = g974;
                            ob7.A = o815;
                            ob7.B = co54;
                            ob7.C = vr25;
                            ob7.D = vr22;
                            ob7.E = hs22;
                            ob7.F = vr28;
                            ob7.G = qk5;
                            ob7.H = H;
                            ob7.J = 3;
                            Object h = h(g974, lk5, ob7);
                            if (h != obj3) {
                                el3 el33 = H;
                                g973 = g974;
                                el32 = el33;
                                co5 co57 = co54;
                                o813 = o815;
                                obj2 = h;
                                vr26 = vr28;
                                co53 = co57;
                                break;
                            }
                        } else {
                            ob7.z = g974;
                            ob7.A = o815;
                            ob7.B = co54;
                            ob7.C = vr25;
                            ob7.D = vr22;
                            ob7.E = hs22;
                            ob7.F = vr28;
                            ob7.G = H;
                            ob7.J = 2;
                            Object i4 = i(g974, lk5, ob7);
                            if (i4 != obj3) {
                                el3 el34 = H;
                                g972 = g974;
                                el3 = el34;
                                hs23 = hs22;
                                vr27 = vr22;
                                o814 = o815;
                                obj2 = i4;
                                vr24 = vr28;
                                vr23 = vr25;
                                break;
                            }
                        }
                        break;
                    case 2:
                        el3 = (el3) ob7.G;
                        vr24 = (vr2) ob7.F;
                        hs23 = (hs2) ob7.E;
                        vr27 = (vr2) ob7.D;
                        vr23 = ob7.C;
                        co54 = (co5) ob7.B;
                        o814 = (o81) ob7.A;
                        g972 = (g97) ob7.z;
                        o85.q(obj2);
                        break;
                    case 3:
                        el32 = (el3) ob7.H;
                        qk5 = (qk5) ob7.G;
                        vr26 = (vr2) ob7.F;
                        hs22 = (hs2) ob7.E;
                        vr22 = (vr2) ob7.D;
                        vr25 = ob7.C;
                        co53 = (co5) ob7.B;
                        o813 = (o81) ob7.A;
                        g973 = (g97) ob7.z;
                        o85.q(obj2);
                        break;
                    case 4:
                        el3 = (el3) ob7.B;
                        co5 co58 = (co5) ob7.A;
                        o81 o816 = (o81) ob7.z;
                        o85.q(obj2);
                        f61 f61 = null;
                        break;
                    case 5:
                        el3 el35 = (el3) ob7.H;
                        qk5 qk54 = (qk5) ob7.G;
                        vr2 vr210 = (vr2) ob7.F;
                        hs2 hs25 = (hs2) ob7.E;
                        vr2 vr211 = ob7.C;
                        co5 co59 = (co5) ob7.B;
                        g97 g975 = (g97) ob7.z;
                        o85.q(obj2);
                        vr2 vr212 = (vr2) ob7.D;
                        vr2 vr213 = vr211;
                        o812 = (o81) ob7.A;
                        vr22 = vr212;
                        lk5 lk52 = lk5;
                        mc4 = mc42;
                        break;
                    case 6:
                        qk5 qk55 = (qk5) ob7.E;
                        el3 el36 = (el3) ob7.D;
                        vr2 vr214 = ob7.C;
                        vr2 vr215 = (vr2) ob7.B;
                        co5 co510 = (co5) ob7.A;
                        o81 o817 = (o81) ob7.z;
                        o85.q(obj2);
                        f61 f612 = null;
                        break;
                    case 7:
                        qk5 qk56 = (qk5) ob7.H;
                        el3 el37 = (el3) ob7.F;
                        vr2 vr216 = (vr2) ob7.E;
                        vr22 = (vr2) ob7.D;
                        vr2 vr217 = ob7.C;
                        g97 g976 = (g97) ob7.z;
                        o85.q(obj2);
                        qk5 qk57 = (qk5) ob7.G;
                        co52 = (co5) ob7.B;
                        o812 = (o81) ob7.A;
                        mc4 = mc42;
                        ? r12 = 0;
                        break;
                    case 8:
                        el3 el38 = (el3) ob7.B;
                        co52 = (co5) ob7.A;
                        o81 o818 = (o81) ob7.z;
                        o85.q(obj2);
                        f61 f613 = null;
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ob7 = new h61(q502);
        Object obj22 = ob7.I;
        i = ob7.J;
        r81 r812 = r81.z;
        lk5 lk53 = lk5.x;
        mc4 mc422 = mc4.a;
        hs2 hs242 = a;
        vs7 vs72 = vs7.a;
        Object obj32 = p81.w;
        switch (i) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object h(g97 g97, lk5 lk5, h61 h61) {
        qb7 qb7;
        int i;
        h06 h06;
        if (h61 instanceof qb7) {
            qb7 qb72 = (qb7) h61;
            int i2 = qb72.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qb72.B = i2 - Integer.MIN_VALUE;
                qb7 = qb72;
                Object obj = qb7.A;
                i = qb7.B;
                if (i != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    obj2.w = kc4.a;
                    long b = g97.g().b();
                    fm2 fm2 = new fm2(lk5, obj2, (f61) null, 4);
                    qb7.z = obj2;
                    qb7.B = 1;
                    Object h = g97.h(b, fm2, qb7);
                    p81 p81 = p81.w;
                    if (h == p81) {
                        return p81;
                    }
                    h06 = obj2;
                } else if (i == 1) {
                    h06 = qb7.z;
                    try {
                        o85.q(obj);
                    } catch (PointerEventTimeoutCancellationException unused) {
                        return mc4.a;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return h06.w;
            }
        }
        qb7 = new h61(h61);
        Object obj3 = qb7.A;
        i = qb7.B;
        if (i != 0) {
        }
        return h06.w;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r9 = r0.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r10 >= r9) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r11 = (defpackage.qk5) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r11.c() != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (defpackage.ub5.n(r11, r8.B.T, r8.d()) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r1.z = r8;
        r1.A = r2;
        r1.C = 2;
        r0 = r8.c(defpackage.lk5.y, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        if (r0 != r7) goto L_0x0031;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[LOOP:2: B:34:0x00b9->B:38:0x00c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7 A[EDGE_INSN: B:48:0x00c7->B:37:0x00c7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public static final Object i(g97 g97, lk5 lk5, q50 q50) {
        rb7 rb7;
        int i;
        Object obj;
        g97 g972;
        lk5 lk52;
        rb7 rb72;
        List list;
        int size;
        int i2;
        rb7 rb73;
        lk5 lk53;
        g97 g973;
        Object c;
        List list2;
        int size2;
        int i3;
        q50 q502 = q50;
        if (q502 instanceof rb7) {
            rb7 rb74 = (rb7) q502;
            int i4 = rb74.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rb74.C = i4 - Integer.MIN_VALUE;
                rb7 = rb74;
                Object obj2 = rb7.B;
                i = rb7.C;
                obj = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    g973 = g97;
                    rb73 = rb7;
                    lk53 = lk5;
                    rb73.z = g973;
                    rb73.A = lk53;
                    rb73.C = 1;
                    c = g973.c(lk53, rb73);
                    if (c != obj) {
                        Object obj3 = c;
                        g972 = g973;
                        obj2 = obj3;
                        rb7 rb75 = rb73;
                        lk52 = lk53;
                        rb72 = rb75;
                        list = ((kk5) obj2).a;
                        size = list.size();
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            return list.get(0);
                            i2++;
                        }
                        return null;
                    }
                    return obj;
                } else if (i == 1) {
                    lk52 = rb7.A;
                    g972 = rb7.z;
                    o85.q(obj2);
                    rb72 = rb7;
                    list = ((kk5) obj2).a;
                    size = list.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (!ub5.c((qk5) list.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        return list.get(0);
                    }
                    return null;
                } else if (i == 2) {
                    lk52 = rb7.A;
                    g972 = rb7.z;
                    o85.q(obj2);
                    rb72 = rb7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lk5 lk54 = lk52;
                rb73 = rb72;
                lk53 = lk54;
                list2 = ((kk5) obj2).a;
                size2 = list2.size();
                i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        g973 = g972;
                        break;
                    }
                    if (!((qk5) list2.get(i3)).c()) {
                        break;
                    }
                    i3++;
                }
                rb73.z = g973;
                rb73.A = lk53;
                rb73.C = 1;
                c = g973.c(lk53, rb73);
                if (c != obj) {
                }
                return obj;
            }
        }
        rb7 = new h61(q502);
        Object obj22 = rb7.B;
        i = rb7.C;
        obj = p81.w;
        if (i != 0) {
        }
        lk5 lk542 = lk52;
        rb73 = rb72;
        lk53 = lk542;
        list2 = ((kk5) obj22).a;
        size2 = list2.size();
        i3 = 0;
        while (true) {
            if (i3 < size2) {
            }
            if (!((qk5) list2.get(i3)).c()) {
            }
            i3++;
        }
        rb73.z = g973;
        rb73.A = lk53;
        rb73.C = 1;
        c = g973.c(lk53, rb73);
        if (c != obj) {
        }
        return obj;
    }
}

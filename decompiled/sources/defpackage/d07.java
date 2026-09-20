package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* renamed from: d07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d07 {
    public static final List c = sg3.E("https://speed.cloudflare.com/__down?bytes=104857600", "https://mia-fl-us-ping.vultr.com/vultr.com.100MB.bin", "http://speedtest.flowja.com:8080/download?size=100000000", "http://www.speed.com.do:8080/download?size=100000000", "http://speedtest.accesshaiti.ht:8080/download?size=100000000");
    public final h81 a;
    public final d45 b;

    public d07(h81 h81) {
        this.a = h81;
        c45 c45 = new c45();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c45.a(10, timeUnit);
        c45.y = fg8.b(30, timeUnit);
        c45.z = fg8.b(60, timeUnit);
        this.b = new d45(c45);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r3 = r9;
        r6 = r10;
        r8 = r0;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076 A[Catch:{ CancellationException -> 0x0081, Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[ExcHandler: CancellationException (r0v2 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object a(d07 d07, op5 op5, long j, h61 h61) {
        zz6 zz6;
        int i;
        Iterator it;
        zz6 zz62;
        long j2;
        op5 op52;
        d07 d072;
        double doubleValue;
        d07.getClass();
        if (h61 instanceof zz6) {
            zz6 = (zz6) h61;
            int i2 = zz6.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zz6.E = i2 - Integer.MIN_VALUE;
                Object obj = zz6.C;
                i = zz6.E;
                if (i != 0) {
                    o85.q(obj);
                    op52 = op5;
                    j2 = j;
                    it = c.iterator();
                    zz62 = zz6;
                } else if (i == 1) {
                    long j3 = zz6.B;
                    it = zz6.A;
                    op5 op53 = zz6.z;
                    try {
                        o85.q(obj);
                        d072 = d07;
                        j2 = j3;
                        zz62 = zz6;
                        op52 = op53;
                    } catch (CancellationException e) {
                    } catch (Exception unused) {
                    }
                    doubleValue = ((Number) obj).doubleValue();
                    if (doubleValue >= 0.0d) {
                        return new Double(doubleValue);
                    }
                    d07 = d072;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (it.hasNext()) {
                    String str = (String) it.next();
                    zz62.z = op52;
                    zz62.A = it;
                    zz62.B = j2;
                    zz62.E = 1;
                    d072 = d07;
                    obj = d072.b(op52, str, j2, zz62);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    doubleValue = ((Number) obj).doubleValue();
                    if (doubleValue >= 0.0d) {
                    }
                    d07 = d072;
                    if (it.hasNext()) {
                    }
                }
                return new Double(-1.0d);
            }
        }
        zz6 = new zz6(d07, h61);
        Object obj2 = zz6.C;
        i = zz6.E;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
        return new Double(-1.0d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: a66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: a66} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9 A[Catch:{ all -> 0x0048, all -> 0x0171 }] */
    public final java.lang.Object b(defpackage.op5 r30, java.lang.String r31, long r32, defpackage.h61 r34) {
        /*
            r29 = this;
            r0 = r29
            r1 = r34
            boolean r2 = r1 instanceof defpackage.c07
            if (r2 == 0) goto L_0x0017
            r2 = r1
            c07 r2 = (defpackage.c07) r2
            int r3 = r2.K
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.K = r3
            goto L_0x001c
        L_0x0017:
            c07 r2 = new c07
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.I
            int r3 = r2.K
            r6 = 1
            if (r3 == 0) goto L_0x0054
            if (r3 != r6) goto L_0x004c
            double r8 = r2.H
            long r10 = r2.G
            long r12 = r2.F
            long r14 = r2.E
            f06 r0 = r2.D
            java.io.InputStream r3 = r2.C
            r16 = 0
            byte[] r4 = r2.B
            java.io.Closeable r5 = r2.A
            r34 = 0
            op5 r7 = r2.z
            defpackage.o85.q(r1)     // Catch:{ all -> 0x0048 }
            r1 = r0
            r0 = r7
            r27 = r14
            r14 = r8
            r7 = r10
            r9 = r27
            goto L_0x014c
        L_0x0048:
            r0 = move-exception
            r1 = r0
            goto L_0x0170
        L_0x004c:
            r34 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            return r34
        L_0x0054:
            r34 = 0
            r16 = 0
            defpackage.o85.q(r1)
            o9 r1 = new o9
            r3 = 12
            r1.<init>((int) r3)
            r3 = r31
            r1.N(r3)
            r1.x()
            kd6 r3 = new kd6
            r3.<init>((defpackage.o9) r1)
            d45 r0 = r0.b
            r0.getClass()
            dx5 r1 = new dx5
            r4 = 0
            r1.<init>(r0, r3, r4)
            a66 r5 = r1.f()
            boolean r0 = r5.M     // Catch:{ all -> 0x0048 }
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 != 0) goto L_0x008d
            java.lang.Double r0 = new java.lang.Double     // Catch:{ all -> 0x0048 }
            r0.<init>(r3)     // Catch:{ all -> 0x0048 }
            r5.close()
            return r0
        L_0x008d:
            d66 r0 = r5.C     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x009a
            java.lang.Double r0 = new java.lang.Double     // Catch:{ all -> 0x0048 }
            r0.<init>(r3)     // Catch:{ all -> 0x0048 }
            r5.close()
            return r0
        L_0x009a:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0048 }
            ed0 r0 = r0.l()     // Catch:{ all -> 0x0048 }
            java.io.InputStream r0 = r0.l0()     // Catch:{ all -> 0x0048 }
            f06 r7 = new f06     // Catch:{ all -> 0x0048 }
            r7.<init>()     // Catch:{ all -> 0x0048 }
            r8 = 0
            r12 = r3
            r14 = r16
            r3 = r0
            r4 = r1
            r1 = r7
            r7 = r8
            r0 = r30
            r9 = r32
        L_0x00bd:
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            long r18 = r18 - r12
            r20 = 10000(0x2710, double:4.9407E-320)
            int r11 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r11 >= 0) goto L_0x0165
            int r11 = r3.read(r4)     // Catch:{ all -> 0x0048 }
            r1.w = r11     // Catch:{ all -> 0x0048 }
            r6 = -1
            if (r11 == r6) goto L_0x0165
            r29 = r7
            long r6 = (long) r11     // Catch:{ all -> 0x0048 }
            long r6 = r29 + r6
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            r29 = r9
            long r8 = r19 - r12
            double r8 = (double) r8     // Catch:{ all -> 0x0048 }
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 / r10
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x014f
            double r10 = (double) r6     // Catch:{ all -> 0x0048 }
            r14 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r10 = r10 * r14
            r14 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r10 = r10 / r14
            double r10 = r10 / r8
            r14 = r6
            e07 r7 = new e07     // Catch:{ all -> 0x0048 }
            r19 = r8
            yz6 r8 = defpackage.yz6.y     // Catch:{ all -> 0x0048 }
            r21 = 4621819117588971520(0x4024000000000000, double:10.0)
            r31 = r7
            double r6 = r19 / r21
            float r6 = (float) r6     // Catch:{ all -> 0x0048 }
            r7 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            float r6 = defpackage.z65.o(r6, r7, r9)     // Catch:{ all -> 0x0048 }
            r19 = r14
            r14 = 8
            r7 = r31
            r23 = r12
            r25 = r19
            r13 = r6
            r11 = r10
            r9 = r29
            r7.<init>((defpackage.yz6) r8, (long) r9, (double) r11, (float) r13, (int) r14)     // Catch:{ all -> 0x0048 }
            r2.z = r0     // Catch:{ all -> 0x0048 }
            r2.A = r5     // Catch:{ all -> 0x0048 }
            r2.B = r4     // Catch:{ all -> 0x0048 }
            r2.C = r3     // Catch:{ all -> 0x0048 }
            r2.D = r1     // Catch:{ all -> 0x0048 }
            r2.E = r9     // Catch:{ all -> 0x0048 }
            r13 = r23
            r2.F = r13     // Catch:{ all -> 0x0048 }
            r6 = r3
            r8 = r4
            r3 = r25
            r2.G = r3     // Catch:{ all -> 0x0048 }
            r2.H = r11     // Catch:{ all -> 0x0048 }
            r15 = 1
            r2.K = r15     // Catch:{ all -> 0x0048 }
            ad0 r15 = r0.B     // Catch:{ all -> 0x0048 }
            java.lang.Object r7 = r15.b(r2, r7)     // Catch:{ all -> 0x0048 }
            p81 r15 = defpackage.p81.w
            if (r7 != r15) goto L_0x0141
            return r15
        L_0x0141:
            r27 = r3
            r4 = r8
            r7 = r27
            r27 = r13
            r14 = r11
            r12 = r27
            r3 = r6
        L_0x014c:
            r6 = 1
            goto L_0x00bd
        L_0x014f:
            r9 = r29
            r8 = r4
            r23 = r12
            r18 = 1
            r27 = r6
            r6 = r3
            r3 = r27
            r12 = r3
            r4 = r8
            r7 = r12
            r3 = r6
            r6 = r18
            r12 = r23
            goto L_0x00bd
        L_0x0165:
            java.lang.Double r0 = new java.lang.Double     // Catch:{ all -> 0x0048 }
            r0.<init>(r14)     // Catch:{ all -> 0x0048 }
            r1 = r34
            defpackage.ed1.i(r5, r1)
            return r0
        L_0x0170:
            throw r1     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r0 = move-exception
            defpackage.ed1.i(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d07.b(op5, java.lang.String, long, h61):java.lang.Object");
    }
}

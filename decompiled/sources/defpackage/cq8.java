package defpackage;

import java.io.Closeable;

/* renamed from: cq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cq8 implements Closeable {
    public static final /* synthetic */ int x = 0;
    public final String w;

    static {
        new Exception();
    }

    public cq8(String str, vq8 vq8) {
        this.w = str;
        if (vq8.d == null) {
            Thread.currentThread();
        }
    }

    public final void close() {
        vq8 vq8 = (vq8) sp8.e.get();
        cq8 cq8 = vq8.b;
        if (cq8 == null) {
            StringBuilder sb = new StringBuilder(115);
            sb.append("Tried to end [<missing root>], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new IllegalStateException(sb.toString());
        } else if (this != cq8) {
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append("Tried to end span <missing root>, but that span is not the current span. The current span is <missing root>.");
            throw new IllegalStateException(sb2.toString());
        } else if (vq8.d != null) {
            sp8.a(vq8, (cq8) null, 2);
        } else {
            sp8.a(vq8, (cq8) null, 4);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r8v20 ?, r8v16 ?, r8v17 ?, r8v19 ?, r8v21 ?, r8v22 ?, r8v23 ?, r8v26 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final java.lang.String toString() {
        /*
            r24 = this;
            boolean r0 = defpackage.sp8.a
            r0 = 0
            r1 = r24
            r2 = r0
            r3 = r2
        L_0x0007:
            r4 = 14
            r5 = 0
            if (r1 == 0) goto L_0x0011
            int r3 = r3 + r4
            int r2 = r2 + 1
            r1 = r5
            goto L_0x0007
        L_0x0011:
            r1 = 250(0xfa, float:3.5E-43)
            java.lang.String r6 = "<missing root>"
            if (r2 <= r1) goto L_0x0518
            int r1 = r2 + -1
            java.lang.String[] r7 = new java.lang.String[r2]
            r8 = r24
        L_0x001d:
            if (r1 < 0) goto L_0x0028
            r8.getClass()
            r7[r1] = r6
            int r1 = r1 + -1
            r8 = r5
            goto L_0x001d
        L_0x0028:
            r1 = 8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r8 = r7.clone()
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            os8 r8 = defpackage.os8.z(r2, r8)
            at7 r8 = r8.v()
            r9 = r0
            r10 = r9
        L_0x003c:
            boolean r11 = r8.hasNext()
            r12 = 1
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r8.next()
            int r13 = r9 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r14 = r10 + 1
            int r15 = r1.length
            r16 = r4
            int r4 = r14 + r14
            if (r4 <= r15) goto L_0x0070
            if (r4 <= r15) goto L_0x006c
            int r17 = r15 >> 1
            int r15 = r15 + r17
            int r15 = r15 + r12
            if (r15 >= r4) goto L_0x0067
            int r4 = r4 + -1
            int r4 = java.lang.Integer.highestOneBit(r4)
            int r4 = r4 + r4
            r15 = r4
        L_0x0067:
            if (r15 >= 0) goto L_0x006c
            r15 = 2147483647(0x7fffffff, float:NaN)
        L_0x006c:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r15)
        L_0x0070:
            if (r11 == 0) goto L_0x007d
            int r10 = r10 + r10
            r1[r10] = r11
            int r10 = r10 + r12
            r1[r10] = r9
            r9 = r13
            r10 = r14
            r4 = r16
            goto L_0x003c
        L_0x007d:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "null key in entry: null="
            java.lang.String r0 = r1.concat(r0)
            defpackage.ku4.j(r0)
            return r5
        L_0x008b:
            r16 = r4
            r4 = -1
            if (r10 != 0) goto L_0x0099
            n36 r1 = defpackage.n36.E
            r21 = r0
            r0 = r5
            r18 = r0
            goto L_0x0277
        L_0x0099:
            if (r10 != r12) goto L_0x00b2
            r8 = r1[r0]
            java.util.Objects.requireNonNull(r8)
            r8 = r1[r12]
            java.util.Objects.requireNonNull(r8)
            n36 r8 = new n36
            r8.<init>(r12, r12, r5, r1)
            r21 = r0
            r0 = r5
            r18 = r0
            r1 = r8
            goto L_0x0277
        L_0x00b2:
            int r8 = r1.length
            int r8 = r8 >> r12
            defpackage.l55.C(r10, r8)
            int r8 = defpackage.os8.w(r10)
            if (r10 != r12) goto L_0x00d3
            r8 = r1[r0]
            java.util.Objects.requireNonNull(r8)
            r8 = r1[r12]
            java.util.Objects.requireNonNull(r8)
            r21 = r0
            r8 = r5
            r18 = r8
            r10 = r12
            r22 = r10
            r20 = 2
            goto L_0x0251
        L_0x00d3:
            int r11 = r8 + -1
            r13 = 128(0x80, float:1.8E-43)
            r14 = 3
            if (r8 > r13) goto L_0x015f
            byte[] r8 = new byte[r8]
            java.util.Arrays.fill(r8, r4)
            r13 = r0
            r15 = r13
            r17 = r5
        L_0x00e3:
            if (r13 >= r10) goto L_0x0144
            r18 = r5
            int r5 = r15 + r15
            int r19 = r13 + r13
            r20 = 2
            r9 = r1[r19]
            java.util.Objects.requireNonNull(r9)
            r19 = r19 ^ 1
            r21 = r0
            r0 = r1[r19]
            java.util.Objects.requireNonNull(r0)
            int r19 = r9.hashCode()
            int r19 = defpackage.z65.X(r19)
        L_0x0103:
            r19 = r19 & r11
            r22 = r12
            byte r12 = r8[r19]
            r4 = 255(0xff, float:3.57E-43)
            r12 = r12 & r4
            if (r12 != r4) goto L_0x011c
            byte r4 = (byte) r5
            r8[r19] = r4
            if (r15 >= r13) goto L_0x0119
            r1[r5] = r9
            r4 = r5 ^ 1
            r1[r4] = r0
        L_0x0119:
            int r15 = r15 + 1
            goto L_0x0134
        L_0x011c:
            r4 = r1[r12]
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x013e
            r4 = r12 ^ 1
            js8 r5 = new js8
            r12 = r1[r4]
            java.util.Objects.requireNonNull(r12)
            r5.<init>(r9, r0, r12)
            r1[r4] = r0
            r17 = r5
        L_0x0134:
            int r13 = r13 + 1
            r5 = r18
            r0 = r21
            r12 = r22
            r4 = -1
            goto L_0x00e3
        L_0x013e:
            int r19 = r19 + 1
            r12 = r22
            r4 = -1
            goto L_0x0103
        L_0x0144:
            r21 = r0
            r18 = r5
            r22 = r12
            r20 = 2
            if (r15 != r10) goto L_0x0150
            goto L_0x0251
        L_0x0150:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r21] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r0[r22] = r4
            r0[r20] = r17
        L_0x015c:
            r8 = r0
            goto L_0x0251
        L_0x015f:
            r21 = r0
            r18 = r5
            r22 = r12
            r20 = 2
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r0) goto L_0x01e2
            short[] r8 = new short[r8]
            r0 = -1
            java.util.Arrays.fill(r8, r0)
            r5 = r18
            r0 = r21
            r4 = r0
        L_0x0177:
            if (r0 >= r10) goto L_0x01cd
            int r9 = r4 + r4
            int r12 = r0 + r0
            r13 = r1[r12]
            java.util.Objects.requireNonNull(r13)
            r12 = r12 ^ 1
            r12 = r1[r12]
            java.util.Objects.requireNonNull(r12)
            int r15 = r13.hashCode()
            int r15 = defpackage.z65.X(r15)
        L_0x0191:
            r15 = r15 & r11
            short r14 = r8[r15]
            char r14 = (char) r14
            r19 = r5
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r5) goto L_0x01ac
            short r5 = (short) r9
            r8[r15] = r5
            if (r4 >= r0) goto L_0x01a7
            r1[r9] = r13
            r5 = r9 ^ 1
            r1[r5] = r12
        L_0x01a7:
            int r4 = r4 + 1
            r5 = r19
            goto L_0x01c3
        L_0x01ac:
            r5 = r1[r14]
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x01c7
            r5 = r14 ^ 1
            js8 r9 = new js8
            r14 = r1[r5]
            java.util.Objects.requireNonNull(r14)
            r9.<init>(r13, r12, r14)
            r1[r5] = r12
            r5 = r9
        L_0x01c3:
            int r0 = r0 + 1
            r14 = 3
            goto L_0x0177
        L_0x01c7:
            int r15 = r15 + 1
            r5 = r19
            r14 = 3
            goto L_0x0191
        L_0x01cd:
            r19 = r5
            if (r4 != r10) goto L_0x01d3
            goto L_0x0251
        L_0x01d3:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r21] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r22] = r4
            r0[r20] = r19
            goto L_0x015c
        L_0x01e2:
            int[] r8 = new int[r8]
            r0 = -1
            java.util.Arrays.fill(r8, r0)
            r5 = r18
            r0 = r21
            r4 = r0
        L_0x01ed:
            if (r0 >= r10) goto L_0x023d
            int r9 = r4 + r4
            int r12 = r0 + r0
            r13 = r1[r12]
            java.util.Objects.requireNonNull(r13)
            r12 = r12 ^ 1
            r12 = r1[r12]
            java.util.Objects.requireNonNull(r12)
            int r14 = r13.hashCode()
            int r14 = defpackage.z65.X(r14)
        L_0x0207:
            r14 = r14 & r11
            r15 = r8[r14]
            r19 = r5
            r5 = -1
            if (r15 != r5) goto L_0x021e
            r8[r14] = r9
            if (r4 >= r0) goto L_0x0219
            r1[r9] = r13
            r5 = r9 ^ 1
            r1[r5] = r12
        L_0x0219:
            int r4 = r4 + 1
            r5 = r19
            goto L_0x0235
        L_0x021e:
            r5 = r1[r15]
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x0238
            r5 = r15 ^ 1
            js8 r9 = new js8
            r14 = r1[r5]
            java.util.Objects.requireNonNull(r14)
            r9.<init>(r13, r12, r14)
            r1[r5] = r12
            r5 = r9
        L_0x0235:
            int r0 = r0 + 1
            goto L_0x01ed
        L_0x0238:
            int r14 = r14 + 1
            r5 = r19
            goto L_0x0207
        L_0x023d:
            r19 = r5
            if (r4 != r10) goto L_0x0242
            goto L_0x0251
        L_0x0242:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r21] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r22] = r4
            r0[r20] = r19
            goto L_0x015c
        L_0x0251:
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x026d
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r0 = r8[r20]
            js8 r0 = (defpackage.js8) r0
            r4 = r8[r21]
            r5 = r8[r22]
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r10 = r5.intValue()
            int r5 = r10 + r10
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            r8 = r4
            goto L_0x026f
        L_0x026d:
            r0 = r18
        L_0x026f:
            n36 r4 = new n36
            r5 = r22
            r4.<init>(r10, r5, r8, r1)
            r1 = r4
        L_0x0277:
            int r4 = r1.z
            if (r0 != 0) goto L_0x04d1
            int r5 = r2 >> 2
            if (r4 <= r5) goto L_0x0283
        L_0x027f:
            r4 = r18
            goto L_0x0469
        L_0x0283:
            int r0 = r2 + 1
            int[] r8 = new int[r0]
            r9 = r21
        L_0x0289:
            if (r9 >= r2) goto L_0x029c
            r10 = r7[r9]
            java.lang.Object r10 = r1.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0289
        L_0x029c:
            r8[r2] = r4
            j32 r1 = new j32
            r4 = 1
            r1.<init>(r8, r4)
            r9 = r21
        L_0x02a6:
            if (r9 >= r0) goto L_0x0398
            int r10 = r1.d
            int r10 = r10 + r4
            r1.d = r10
            r4 = r8[r9]
        L_0x02af:
            r10 = r18
        L_0x02b1:
            int r11 = r1.d
            if (r11 <= 0) goto L_0x0393
            int r11 = r1.c
            java.lang.Object r12 = r1.g
            rq8 r12 = (defpackage.rq8) r12
            r13 = 1073741824(0x40000000, float:2.0)
            if (r11 != 0) goto L_0x0304
            java.util.HashMap r11 = r12.d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r11 = r11.containsKey(r12)
            if (r11 != 0) goto L_0x02ed
            rq8 r11 = new rq8
            r11.<init>(r9, r13)
            java.lang.Object r13 = r1.g
            rq8 r13 = (defpackage.rq8) r13
            java.util.HashMap r13 = r13.d
            r13.put(r12, r11)
            if (r10 == 0) goto L_0x02e1
            java.lang.Object r11 = r1.g
            rq8 r11 = (defpackage.rq8) r11
            r10.c = r11
        L_0x02e1:
            int r10 = r1.d
            r23 = -1
            int r10 = r10 + -1
            r1.d = r10
            r1.d()
            goto L_0x02af
        L_0x02ed:
            if (r10 == 0) goto L_0x02f5
            java.lang.Object r4 = r1.g
            rq8 r4 = (defpackage.rq8) r4
            r10.c = r4
        L_0x02f5:
            r1.b = r9
            int r4 = r1.c
            r22 = 1
            int r4 = r4 + 1
            r1.c = r4
            r1.c()
            goto L_0x0393
        L_0x0304:
            java.util.HashMap r11 = r12.d
            int r12 = r1.b
            r12 = r8[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r11.get(r12)
            rq8 r11 = (defpackage.rq8) r11
            int r11 = r11.a
            int r12 = r1.c
            int r11 = r11 + r12
            r11 = r8[r11]
            if (r11 != r4) goto L_0x032d
            if (r10 == 0) goto L_0x0325
            java.lang.Object r4 = r1.g
            rq8 r4 = (defpackage.rq8) r4
            r10.c = r4
        L_0x0325:
            int r12 = r12 + 1
            r1.c = r12
            r1.c()
            goto L_0x0393
        L_0x032d:
            java.lang.Object r11 = r1.g
            rq8 r11 = (defpackage.rq8) r11
            java.util.HashMap r11 = r11.d
            int r12 = r1.b
            r12 = r8[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r11.get(r12)
            rq8 r11 = (defpackage.rq8) r11
            rq8 r12 = new rq8
            int r14 = r11.a
            int r15 = r1.c
            int r15 = r15 + r14
            r23 = -1
            int r15 = r15 + -1
            r12.<init>(r14, r15)
            java.lang.Object r14 = r1.g
            rq8 r14 = (defpackage.rq8) r14
            java.util.HashMap r14 = r14.d
            int r15 = r1.b
            r15 = r8[r15]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.put(r15, r12)
            int r14 = r12.b
            r22 = 1
            int r14 = r14 + 1
            r15 = r8[r14]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.util.HashMap r13 = r12.d
            r13.put(r15, r11)
            r11.a = r14
            if (r10 == 0) goto L_0x0377
            r10.c = r12
        L_0x0377:
            rq8 r10 = new rq8
            r11 = 1073741824(0x40000000, float:2.0)
            r10.<init>(r9, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r13.put(r11, r10)
            int r10 = r1.d
            r23 = -1
            int r10 = r10 + -1
            r1.d = r10
            r1.d()
            r10 = r12
            goto L_0x02b1
        L_0x0393:
            int r9 = r9 + 1
            r4 = 1
            goto L_0x02a6
        L_0x0398:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            nq8 r4 = new nq8
            java.lang.Object r9 = r1.f
            rq8 r9 = (defpackage.rq8) r9
            r11 = r21
            r10 = -1
            r4.<init>(r9, r11, r10, r10)
            r0.push(r4)
        L_0x03ac:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x041d
            java.lang.Object r10 = r0.pop()
            nq8 r10 = (defpackage.nq8) r10
            rq8 r11 = r10.d
            java.util.HashMap r11 = r11.d
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L_0x03c4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03ac
            java.lang.Object r12 = r11.next()
            rq8 r12 = (defpackage.rq8) r12
            int r13 = r10.b
            int r14 = r10.c
            int r15 = r12.a
            r17 = r9
            int r9 = r12.b
            boolean r15 = r1.h(r13, r14, r15, r9)
            if (r15 != 0) goto L_0x0403
            java.util.HashMap r15 = r12.d
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x03f8
            int r15 = r12.a
            int r19 = r15 + r14
            r20 = r11
            int r11 = r19 - r13
            boolean r11 = r1.h(r13, r14, r15, r11)
            if (r11 == 0) goto L_0x03fa
        L_0x03f6:
            r15 = 1
            goto L_0x0406
        L_0x03f8:
            r20 = r11
        L_0x03fa:
            nq8 r11 = new nq8
            int r13 = r12.a
            r15 = 1
            r11.<init>(r12, r15, r13, r9)
            goto L_0x040e
        L_0x0403:
            r20 = r11
            goto L_0x03f6
        L_0x0406:
            nq8 r11 = new nq8
            int r9 = r10.a
            int r9 = r9 + r15
            r11.<init>(r12, r9, r13, r14)
        L_0x040e:
            int r9 = r4.a
            int r12 = r11.a
            if (r9 >= r12) goto L_0x0415
            r4 = r11
        L_0x0415:
            r0.push(r11)
            r9 = r17
            r11 = r20
            goto L_0x03c4
        L_0x041d:
            r17 = r9
            int r0 = r4.c
            r22 = 1
            int r0 = r0 + 1
            int r1 = r8.length
            int r1 = java.lang.Math.min(r1, r0)
            r11 = 0
        L_0x042b:
            int r0 = r4.b
            int r10 = r1 - r0
            int r12 = r11 % r10
            int r12 = r12 + r0
            r12 = r8[r12]
            java.util.HashMap r9 = r9.d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r9 = r9.get(r12)
            rq8 r9 = (defpackage.rq8) r9
            if (r9 != 0) goto L_0x0443
            goto L_0x045e
        L_0x0443:
            int r12 = r9.a
        L_0x0445:
            int r13 = r9.b
            r22 = 1
            int r13 = r13 + 1
            if (r12 >= r13) goto L_0x042b
            int r13 = r8.length
            if (r12 >= r13) goto L_0x042b
            int r13 = r11 % r10
            int r13 = r13 + r0
            r13 = r8[r13]
            r14 = r8[r12]
            if (r13 != r14) goto L_0x045e
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L_0x0445
        L_0x045e:
            d12 r4 = new d12
            int r11 = r11 / r10
            r4.<init>(r0, r1, r11)
            int r10 = r10 * r11
            if (r10 >= r5) goto L_0x0469
            goto L_0x027f
        L_0x0469:
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x046e
            goto L_0x04c9
        L_0x046e:
            int r1 = r4.a
            java.lang.String r5 = " -> "
            if (r1 <= 0) goto L_0x0485
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r7, r1)
            java.lang.String r8 = android.text.TextUtils.join(r5, r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r8.concat(r5)
            goto L_0x0486
        L_0x0485:
            r8 = r0
        L_0x0486:
            int r9 = r4.b
            int r4 = r4.c
            int r10 = r9 - r1
            int r10 = r10 * r4
            int r10 = r10 + r1
            if (r10 >= r2) goto L_0x04a0
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r7, r10, r2)
            java.lang.String r0 = android.text.TextUtils.join(r5, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r5.concat(r0)
        L_0x04a0:
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r7, r1, r9)
            java.lang.String r1 = android.text.TextUtils.join(r5, r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r5 = "{"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = "}x"
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x04c9:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x04d0
            goto L_0x051c
        L_0x04d0:
            return r0
        L_0x04d1:
            java.lang.Object r1 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r0 = r0.a
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            int r5 = r2.length()
            int r6 = r0.length()
            int r7 = r1.length()
            int r4 = r4 + 33
            int r4 = r4 + r5
            int r4 = r4 + 5
            int r4 = r4 + r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r22 = 1
            int r4 = r4 + 1
            int r4 = r4 + r7
            r5.<init>(r4)
            java.lang.String r4 = "Multiple entries with same key: "
            java.lang.String r6 = "="
            defpackage.f21.v(r5, r4, r3, r6, r2)
            java.lang.String r2 = " and "
            java.lang.String r0 = defpackage.pb4.n(r5, r2, r0, r6, r1)
            defpackage.h.q(r0)
            return r18
        L_0x0518:
            r16 = r4
            r18 = r5
        L_0x051c:
            char[] r0 = new char[r3]
            r1 = r24
        L_0x0520:
            if (r1 == 0) goto L_0x052d
            int r3 = r3 + -14
            r1 = r16
            r11 = 0
            r6.getChars(r11, r1, r0, r3)
            r1 = r18
            goto L_0x0520
        L_0x052d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq8.toString():java.lang.String");
    }
}

package defpackage;

/* renamed from: oq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oq1 extends o37 implements a37 {
    public final sr2 x;
    public final ux6 y;
    public nq1 z = new nq1(nx6.j().g());

    public oq1(sr2 sr2, ux6 ux6) {
        this.x = sr2;
        this.y = ux6;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final defpackage.nq1 d(defpackage.nq1 r21, defpackage.ix6 r22, boolean r23, defpackage.sr2 r24) {
        /*
            r20 = this;
            r3 = r20
            r6 = r21
            r0 = r22
            boolean r1 = r6.c(r3, r0)
            if (r1 == 0) goto L_0x00c2
            if (r23 == 0) goto L_0x00c1
            eq4 r1 = defpackage.u55.h()
            java.lang.Object[] r2 = r1.w
            int r3 = r1.y
            r4 = 0
        L_0x0017:
            if (r4 >= r3) goto L_0x0023
            r5 = r2[r4]
            xt2 r5 = (defpackage.xt2) r5
            r5.b()
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0023:
            hp4 r2 = r6.e     // Catch:{ all -> 0x0038 }
            cf4 r3 = defpackage.vx6.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r4 = r3.f()     // Catch:{ all -> 0x0038 }
            te3 r4 = (defpackage.te3) r4     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x003b
            te3 r4 = new te3     // Catch:{ all -> 0x0038 }
            r4.<init>()     // Catch:{ all -> 0x0038 }
            r3.D(r4)     // Catch:{ all -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            goto L_0x00af
        L_0x003b:
            int r3 = r4.a     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r5 = r2.b     // Catch:{ all -> 0x0038 }
            int[] r8 = r2.c     // Catch:{ all -> 0x0038 }
            long[] r2 = r2.a     // Catch:{ all -> 0x0038 }
            int r9 = r2.length     // Catch:{ all -> 0x0038 }
            int r9 = r9 + -2
            if (r9 < 0) goto L_0x009c
            r10 = 0
        L_0x0049:
            r11 = r2[r10]     // Catch:{ all -> 0x0038 }
            long r13 = ~r11     // Catch:{ all -> 0x0038 }
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0097
            int r13 = r10 - r9
            int r13 = ~r13     // Catch:{ all -> 0x0038 }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L_0x0063:
            if (r15 >= r13) goto L_0x0094
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x008b
            int r16 = r10 << 3
            int r16 = r16 + r15
            r17 = r5[r16]     // Catch:{ all -> 0x0038 }
            r16 = r8[r16]     // Catch:{ all -> 0x0038 }
            r7 = r17
            n37 r7 = (defpackage.n37) r7     // Catch:{ all -> 0x0038 }
            r20 = r14
            int r14 = r3 + r16
            r4.a = r14     // Catch:{ all -> 0x0038 }
            vr2 r14 = r0.e()     // Catch:{ all -> 0x0038 }
            if (r14 == 0) goto L_0x008d
            r14.y(r7)     // Catch:{ all -> 0x0038 }
            goto L_0x008d
        L_0x008b:
            r20 = r14
        L_0x008d:
            long r11 = r11 >> r20
            int r15 = r15 + 1
            r14 = r20
            goto L_0x0063
        L_0x0094:
            r7 = r14
            if (r13 != r7) goto L_0x009c
        L_0x0097:
            if (r10 == r9) goto L_0x009c
            int r10 = r10 + 1
            goto L_0x0049
        L_0x009c:
            r4.a = r3     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r0 = r1.w
            int r1 = r1.y
            r7 = 0
        L_0x00a3:
            if (r7 >= r1) goto L_0x00c1
            r2 = r0[r7]
            xt2 r2 = (defpackage.xt2) r2
            r2.a()
            int r7 = r7 + 1
            goto L_0x00a3
        L_0x00af:
            java.lang.Object[] r2 = r1.w
            int r1 = r1.y
            r7 = 0
        L_0x00b4:
            if (r7 >= r1) goto L_0x00c0
            r3 = r2[r7]
            xt2 r3 = (defpackage.xt2) r3
            r3.a()
            int r7 = r7 + 1
            goto L_0x00b4
        L_0x00c0:
            throw r0
        L_0x00c1:
            return r6
        L_0x00c2:
            hp4 r5 = new hp4
            r5.<init>()
            cf4 r0 = defpackage.vx6.a
            java.lang.Object r1 = r0.f()
            te3 r1 = (defpackage.te3) r1
            if (r1 != 0) goto L_0x00d9
            te3 r1 = new te3
            r1.<init>()
            r0.D(r1)
        L_0x00d9:
            r4 = r1
            int r1 = r4.a
            eq4 r7 = defpackage.u55.h()
            java.lang.Object[] r0 = r7.w
            int r2 = r7.y
            r8 = 0
        L_0x00e5:
            if (r8 >= r2) goto L_0x00f1
            r9 = r0[r8]
            xt2 r9 = (defpackage.xt2) r9
            r9.b()
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f1:
            int r0 = r1 + 1
            r4.a = r0     // Catch:{ all -> 0x0188 }
            mq1 r0 = new mq1     // Catch:{ all -> 0x0188 }
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0188 }
            r2 = r24
            java.lang.Object r0 = defpackage.j45.k(r0, r2)     // Catch:{ all -> 0x0188 }
            r4.a = r1     // Catch:{ all -> 0x0188 }
            java.lang.Object[] r1 = r7.w
            int r2 = r7.y
            r7 = 0
        L_0x0108:
            if (r7 >= r2) goto L_0x0114
            r4 = r1[r7]
            xt2 r4 = (defpackage.xt2) r4
            r4.a()
            int r7 = r7 + 1
            goto L_0x0108
        L_0x0114:
            java.lang.Object r1 = defpackage.nx6.c
            monitor-enter(r1)
            ix6 r2 = defpackage.nx6.j()     // Catch:{ all -> 0x0136 }
            java.lang.Object r4 = r6.f     // Catch:{ all -> 0x0136 }
            java.lang.Object r7 = defpackage.nq1.h     // Catch:{ all -> 0x0136 }
            if (r4 == r7) goto L_0x0138
            ux6 r7 = r3.y     // Catch:{ all -> 0x0136 }
            if (r7 == 0) goto L_0x0138
            boolean r4 = r7.i(r0, r4)     // Catch:{ all -> 0x0136 }
            r7 = 1
            if (r4 != r7) goto L_0x0138
            r6.e = r5     // Catch:{ all -> 0x0136 }
            int r0 = r6.d(r3, r2)     // Catch:{ all -> 0x0136 }
            r6.g = r0     // Catch:{ all -> 0x0136 }
            r4 = r6
            goto L_0x0156
        L_0x0136:
            r0 = move-exception
            goto L_0x0186
        L_0x0138:
            nq1 r4 = r3.z     // Catch:{ all -> 0x0136 }
            monitor-enter(r1)     // Catch:{ all -> 0x0136 }
            p37 r6 = defpackage.nx6.m(r4, r3)     // Catch:{ all -> 0x0183 }
            r6.a(r4)     // Catch:{ all -> 0x0183 }
            long r7 = r2.g()     // Catch:{ all -> 0x0183 }
            r6.a = r7     // Catch:{ all -> 0x0183 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            r4 = r6
            nq1 r4 = (defpackage.nq1) r4     // Catch:{ all -> 0x0136 }
            r4.e = r5     // Catch:{ all -> 0x0136 }
            int r2 = r4.d(r3, r2)     // Catch:{ all -> 0x0136 }
            r4.g = r2     // Catch:{ all -> 0x0136 }
            r4.f = r0     // Catch:{ all -> 0x0136 }
        L_0x0156:
            monitor-exit(r1)
            cf4 r0 = defpackage.vx6.a
            java.lang.Object r0 = r0.f()
            te3 r0 = (defpackage.te3) r0
            if (r0 == 0) goto L_0x0182
            int r0 = r0.a
            if (r0 != 0) goto L_0x0182
            ix6 r0 = defpackage.nx6.j()
            r0.m()
            monitor-enter(r1)
            ix6 r0 = defpackage.nx6.j()     // Catch:{ all -> 0x017f }
            long r2 = r0.g()     // Catch:{ all -> 0x017f }
            r4.c = r2     // Catch:{ all -> 0x017f }
            int r0 = r0.h()     // Catch:{ all -> 0x017f }
            r4.d = r0     // Catch:{ all -> 0x017f }
            monitor-exit(r1)
            return r4
        L_0x017f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0182:
            return r4
        L_0x0183:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0186:
            monitor-exit(r1)
            throw r0
        L_0x0188:
            r0 = move-exception
            java.lang.Object[] r1 = r7.w
            int r2 = r7.y
            r7 = 0
        L_0x018e:
            if (r7 >= r2) goto L_0x019a
            r3 = r1[r7]
            xt2 r3 = (defpackage.xt2) r3
            r3.a()
            int r7 = r7 + 1
            goto L_0x018e
        L_0x019a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq1.d(nq1, ix6, boolean, sr2):nq1");
    }

    public final nq1 e() {
        ix6 j = nx6.j();
        return d((nq1) nx6.i(this.z, j), j, false, this.x);
    }

    public final p37 getFirstStateRecord() {
        return this.z;
    }

    public final Object getValue() {
        vr2 e = nx6.j().e();
        if (e != null) {
            e.y(this);
        }
        ix6 j = nx6.j();
        return d((nq1) nx6.i(this.z, j), j, true, this.x).f;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.z = (nq1) p37;
    }

    public final String toString() {
        String str;
        nq1 nq1 = (nq1) nx6.h(this.z);
        nq1 nq12 = (nq1) nx6.h(this.z);
        if (nq12.c(this, nx6.j())) {
            str = String.valueOf(nq12.f);
        } else {
            str = "<Not calculated>";
        }
        int hashCode = hashCode();
        return "DerivedState(value=" + str + ")@" + hashCode;
    }
}

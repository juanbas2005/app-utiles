package defpackage;

/* renamed from: rj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rj6 extends l66 implements gs2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int y = 0;
    public long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj6(long j, g06 g06, f61 f61) {
        super(2, f61);
        this.z = j;
        this.C = g06;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        g97 g97 = (g97) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((rj6) o(f61, g97)).s(vs7);
            default:
                return ((rj6) o(f61, g97)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                rj6 rj6 = new rj6(this.z, (g06) obj2, f61);
                rj6.B = obj;
                return rj6;
            default:
                rj6 rj62 = new rj6((qk5) obj2, f61);
                rj62.B = obj;
                return rj62;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    public final java.lang.Object s(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.y
            java.lang.Object r1 = r9.C
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p81 r4 = defpackage.p81.w
            r5 = 1
            switch(r0) {
                case 0: goto L_0x0051;
                default: goto L_0x000d;
            }
        L_0x000d:
            int r0 = r9.A
            if (r0 == 0) goto L_0x0021
            if (r0 != r5) goto L_0x001d
            long r0 = r9.z
            java.lang.Object r2 = r9.B
            g97 r2 = (defpackage.g97) r2
            defpackage.o85.q(r10)
            goto L_0x0047
        L_0x001d:
            defpackage.h.s(r3)
            goto L_0x0050
        L_0x0021:
            defpackage.o85.q(r10)
            java.lang.Object r10 = r9.B
            g97 r10 = (defpackage.g97) r10
            qk5 r1 = (defpackage.qk5) r1
            long r0 = r1.b
            g58 r2 = r10.g()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L_0x0038:
            r9.B = r2
            r9.z = r0
            r9.A = r5
            r10 = 3
            java.lang.Object r10 = defpackage.sb7.b(r2, r9, r10)
            if (r10 != r4) goto L_0x0047
            r2 = r4
            goto L_0x0050
        L_0x0047:
            qk5 r10 = (defpackage.qk5) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0038
            r2 = r10
        L_0x0050:
            return r2
        L_0x0051:
            g06 r1 = (defpackage.g06) r1
            int r0 = r9.A
            if (r0 == 0) goto L_0x0065
            if (r0 != r5) goto L_0x0061
            java.lang.Object r9 = r9.B
            g97 r9 = (defpackage.g97) r9
            defpackage.o85.q(r10)
            goto L_0x0083
        L_0x0061:
            defpackage.h.s(r3)
            goto L_0x00b5
        L_0x0065:
            defpackage.o85.q(r10)
            java.lang.Object r10 = r9.B
            g97 r10 = (defpackage.g97) r10
            long r2 = r9.z
            ph6 r0 = new ph6
            r6 = 2
            r0.<init>(r6, r1)
            r9.B = r10
            r9.A = r5
            java.lang.Object r9 = defpackage.my1.c(r10, r2, r0, r9)
            if (r9 != r4) goto L_0x0080
            r2 = r4
            goto L_0x00b5
        L_0x0080:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0083:
            qk5 r10 = (defpackage.qk5) r10
            if (r10 == 0) goto L_0x009b
            long r0 = r1.w
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x009b
            jx1 r2 = defpackage.jx1.x
            goto L_0x00b5
        L_0x009b:
            h97 r9 = r9.B
            kk5 r9 = r9.O
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.dt0.w0(r9)
            qk5 r9 = (defpackage.qk5) r9
            boolean r10 = defpackage.ub5.d(r9)
            if (r10 == 0) goto L_0x00b3
            r9.a()
            jx1 r2 = defpackage.jx1.w
            goto L_0x00b5
        L_0x00b3:
            jx1 r2 = defpackage.jx1.z
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj6.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj6(qk5 qk5, f61 f61) {
        super(2, f61);
        this.C = qk5;
    }
}

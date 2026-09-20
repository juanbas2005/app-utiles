package defpackage;

/* renamed from: vf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf extends l66 implements gs2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf(Object obj, f61 f61, int i) {
        super(2, f61);
        this.y = i;
        this.B = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        g97 g97 = (g97) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((vf) o(f61, g97)).s(vs7);
            case 1:
                return ((vf) o(f61, g97)).s(vs7);
            case 2:
                return ((vf) o(f61, g97)).s(vs7);
            case 3:
                return ((vf) o(f61, g97)).s(vs7);
            default:
                ((vf) o(f61, g97)).s(vs7);
                return p81.w;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.B;
        switch (i) {
            case b85.b:
                vf vfVar = new vf((xf) obj2, f61, 0);
                vfVar.A = obj;
                return vfVar;
            case 1:
                vf vfVar2 = new vf((lk5) obj2, f61, 1);
                vfVar2.A = obj;
                return vfVar2;
            case 2:
                vf vfVar3 = new vf((m92) obj2, f61, 2);
                vfVar3.A = obj;
                return vfVar3;
            case 3:
                vf vfVar4 = new vf((vr2) obj2, f61, 3);
                vfVar4.A = obj;
                return vfVar4;
            default:
                vf vfVar5 = new vf((j71) obj2, f61, 4);
                vfVar5.A = obj;
                return vfVar5;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: g97} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: g97} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: g97} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object s(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.y
            lk5 r1 = defpackage.lk5.x
            lk5 r2 = defpackage.lk5.w
            vs7 r3 = defpackage.vs7.a
            r4 = 2
            java.lang.Object r5 = r14.B
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p81 r7 = defpackage.p81.w
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L_0x0103;
                case 1: goto L_0x00e1;
                case 2: goto L_0x009d;
                case 3: goto L_0x004c;
                default: goto L_0x0014;
            }
        L_0x0014:
            int r0 = r14.z
            if (r0 == 0) goto L_0x0027
            if (r0 != r8) goto L_0x0022
            java.lang.Object r0 = r14.A
            g97 r0 = (defpackage.g97) r0
            defpackage.o85.q(r15)
            goto L_0x003a
        L_0x0022:
            defpackage.h.s(r6)
            r7 = r9
            goto L_0x0039
        L_0x0027:
            defpackage.o85.q(r15)
            java.lang.Object r15 = r14.A
            g97 r15 = (defpackage.g97) r15
            r0 = r15
        L_0x002f:
            r14.A = r0
            r14.z = r8
            java.lang.Object r15 = r0.c(r2, r14)
            if (r15 != r7) goto L_0x003a
        L_0x0039:
            return r7
        L_0x003a:
            kk5 r15 = (defpackage.kk5) r15
            r1 = r5
            j71 r1 = (defpackage.j71) r1
            boolean r15 = defpackage.sj6.a(r15)
            r15 = r15 ^ r8
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r1.y(r15)
            goto L_0x002f
        L_0x004c:
            int r0 = r14.z
            if (r0 == 0) goto L_0x0065
            if (r0 == r8) goto L_0x005d
            if (r0 != r4) goto L_0x0058
            defpackage.o85.q(r15)
            goto L_0x0095
        L_0x0058:
            defpackage.h.s(r6)
            r3 = r9
            goto L_0x009c
        L_0x005d:
            java.lang.Object r0 = r14.A
            g97 r0 = (defpackage.g97) r0
            defpackage.o85.q(r15)
            goto L_0x0078
        L_0x0065:
            defpackage.o85.q(r15)
            java.lang.Object r15 = r14.A
            r0 = r15
            g97 r0 = (defpackage.g97) r0
            r14.A = r0
            r14.z = r8
            java.lang.Object r15 = defpackage.i95.b(r0, r14)
            if (r15 != r7) goto L_0x0078
            goto L_0x0093
        L_0x0078:
            qk5 r15 = (defpackage.qk5) r15
            r15.a()
            vr2 r5 = (defpackage.vr2) r5
            long r10 = r15.c
            l35 r15 = new l35
            r15.<init>(r10)
            r5.y(r15)
            r14.A = r9
            r14.z = r4
            java.lang.Object r15 = defpackage.sb7.i(r0, r1, r14)
            if (r15 != r7) goto L_0x0095
        L_0x0093:
            r3 = r7
            goto L_0x009c
        L_0x0095:
            qk5 r15 = (defpackage.qk5) r15
            if (r15 == 0) goto L_0x009c
            r15.a()
        L_0x009c:
            return r3
        L_0x009d:
            int r0 = r14.z
            if (r0 == 0) goto L_0x00b6
            if (r0 == r8) goto L_0x00ae
            if (r0 != r4) goto L_0x00a9
            defpackage.o85.q(r15)
            goto L_0x00d7
        L_0x00a9:
            defpackage.h.s(r6)
            r3 = r9
            goto L_0x00e0
        L_0x00ae:
            java.lang.Object r0 = r14.A
            g97 r0 = (defpackage.g97) r0
            defpackage.o85.q(r15)
            goto L_0x00c9
        L_0x00b6:
            defpackage.o85.q(r15)
            java.lang.Object r15 = r14.A
            r0 = r15
            g97 r0 = (defpackage.g97) r0
            r14.A = r0
            r14.z = r8
            java.lang.Object r15 = defpackage.sb7.b(r0, r14, r8)
            if (r15 != r7) goto L_0x00c9
            goto L_0x00d5
        L_0x00c9:
            qk5 r15 = (defpackage.qk5) r15
            r14.A = r9
            r14.z = r4
            java.lang.Object r15 = defpackage.sb7.i(r0, r2, r14)
            if (r15 != r7) goto L_0x00d7
        L_0x00d5:
            r3 = r7
            goto L_0x00e0
        L_0x00d7:
            qk5 r15 = (defpackage.qk5) r15
            if (r15 == 0) goto L_0x00e0
            m92 r5 = (defpackage.m92) r5
            r5.b()
        L_0x00e0:
            return r3
        L_0x00e1:
            int r0 = r14.z
            if (r0 == 0) goto L_0x00f0
            if (r0 != r8) goto L_0x00eb
            defpackage.o85.q(r15)
            goto L_0x0102
        L_0x00eb:
            defpackage.h.s(r6)
            r15 = r9
            goto L_0x0102
        L_0x00f0:
            defpackage.o85.q(r15)
            java.lang.Object r15 = r14.A
            g97 r15 = (defpackage.g97) r15
            lk5 r5 = (defpackage.lk5) r5
            r14.z = r8
            java.lang.Object r15 = defpackage.sb7.i(r15, r5, r14)
            if (r15 != r7) goto L_0x0102
            r15 = r7
        L_0x0102:
            return r15
        L_0x0103:
            xf r5 = (defpackage.xf) r5
            int r0 = r14.z
            if (r0 == 0) goto L_0x0123
            if (r0 == r8) goto L_0x011b
            if (r0 != r4) goto L_0x0115
            java.lang.Object r0 = r14.A
            g97 r0 = (defpackage.g97) r0
            defpackage.o85.q(r15)
            goto L_0x014c
        L_0x0115:
            defpackage.h.s(r6)
            r3 = r9
            goto L_0x01ad
        L_0x011b:
            java.lang.Object r0 = r14.A
            g97 r0 = (defpackage.g97) r0
            defpackage.o85.q(r15)
            goto L_0x0136
        L_0x0123:
            defpackage.o85.q(r15)
            java.lang.Object r15 = r14.A
            r0 = r15
            g97 r0 = (defpackage.g97) r0
            r14.A = r0
            r14.z = r8
            java.lang.Object r15 = defpackage.sb7.b(r0, r14, r4)
            if (r15 != r7) goto L_0x0136
            goto L_0x014a
        L_0x0136:
            qk5 r15 = (defpackage.qk5) r15
            long r10 = r15.a
            r5.h = r10
            long r10 = r15.c
            r5.b = r10
        L_0x0140:
            r14.A = r0
            r14.z = r4
            java.lang.Object r15 = r0.c(r1, r14)
            if (r15 != r7) goto L_0x014c
        L_0x014a:
            r3 = r7
            goto L_0x01ad
        L_0x014c:
            kk5 r15 = (defpackage.kk5) r15
            java.util.List r15 = r15.a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r15.size()
            r2.<init>(r6)
            int r6 = r15.size()
            r8 = 0
            r10 = r8
        L_0x015f:
            if (r10 >= r6) goto L_0x0172
            java.lang.Object r11 = r15.get(r10)
            r12 = r11
            qk5 r12 = (defpackage.qk5) r12
            boolean r12 = r12.d
            if (r12 == 0) goto L_0x016f
            r2.add(r11)
        L_0x016f:
            int r10 = r10 + 1
            goto L_0x015f
        L_0x0172:
            int r15 = r2.size()
        L_0x0176:
            if (r8 >= r15) goto L_0x018d
            java.lang.Object r6 = r2.get(r8)
            r10 = r6
            qk5 r10 = (defpackage.qk5) r10
            long r10 = r10.a
            long r12 = r5.h
            boolean r10 = defpackage.a35.i(r10, r12)
            if (r10 == 0) goto L_0x018a
            goto L_0x018e
        L_0x018a:
            int r8 = r8 + 1
            goto L_0x0176
        L_0x018d:
            r6 = r9
        L_0x018e:
            qk5 r6 = (defpackage.qk5) r6
            if (r6 != 0) goto L_0x0199
            java.lang.Object r15 = defpackage.dt0.y0(r2)
            r6 = r15
            qk5 r6 = (defpackage.qk5) r6
        L_0x0199:
            if (r6 == 0) goto L_0x01a3
            long r10 = r6.a
            r5.h = r10
            long r10 = r6.c
            r5.b = r10
        L_0x01a3:
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L_0x0140
            r14 = -1
            r5.h = r14
        L_0x01ad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.s(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* renamed from: a98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a98 implements lh4 {
    public final /* synthetic */ gs2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ a37 d;
    public final /* synthetic */ a37 e;
    public final /* synthetic */ a37 f;
    public final /* synthetic */ bd5 g;
    public final /* synthetic */ bd5 h;
    public final /* synthetic */ vr i;
    public final /* synthetic */ a37 j;

    public a98(gs2 gs2, boolean z, float f2, a37 a37, a37 a372, a37 a373, bd5 bd5, bd5 bd52, vr vrVar, a37 a374) {
        this.a = gs2;
        this.b = z;
        this.c = f2;
        this.d = a37;
        this.e = a372;
        this.f = a373;
        this.g = bd5;
        this.h = bd52;
        this.i = vrVar;
        this.j = a374;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, h06] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x017e: MOVE  (r9v4 int) = (r21v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final defpackage.mh4 b(defpackage.oh4 r29, java.util.List r30, long r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = defpackage.k31.g(r31)
            int r4 = r2.size()
            int r5 = defpackage.k31.j(r31)
            int r6 = defpackage.k31.j(r31)
            if (r6 != 0) goto L_0x003b
            float r5 = defpackage.b98.f
            int r5 = r1.r0(r5)
            int r6 = defpackage.k31.h(r31)
            if (r5 <= r6) goto L_0x0025
            r5 = r6
        L_0x0025:
            a37 r6 = r0.d
            java.lang.Object r6 = r6.getValue()
            lx1 r6 = (defpackage.lx1) r6
            float r6 = r6.w
            int r6 = r1.r0(r6)
            int r7 = defpackage.k31.h(r31)
            if (r6 <= r7) goto L_0x003f
            r6 = r7
            goto L_0x003f
        L_0x003b:
            int r6 = defpackage.k31.j(r31)
        L_0x003f:
            b42 r9 = defpackage.b42.w
            r7 = 1
            if (r4 >= r7) goto L_0x0050
            vd2 r0 = new vd2
            r2 = 20
            r0.<init>((int) r2)
            mh4 r0 = r1.d0(r6, r3, r9, r0)
            return r0
        L_0x0050:
            r15 = 0
            r16 = 10
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r31
            long r12 = defpackage.k31.a(r10, r12, r13, r14, r15, r16)
            h06 r8 = new h06
            r8.<init>()
            gs2 r10 = r0.a
            if (r10 == 0) goto L_0x009f
            int r10 = r2.size()
            r14 = 0
        L_0x006a:
            if (r14 >= r10) goto L_0x0098
            java.lang.Object r15 = r2.get(r14)
            gh4 r15 = (defpackage.gh4) r15
            java.lang.Object r11 = defpackage.rc9.P(r15)
            java.lang.String r7 = "header"
            boolean r7 = defpackage.sg3.e(r11, r7)
            if (r7 == 0) goto L_0x0094
            eh5 r7 = r15.y(r12)
            r8.w = r7
            r7 = 1
            if (r4 <= r7) goto L_0x008b
            java.util.List r2 = r2.subList(r7, r4)
        L_0x008b:
            int r4 = r4 + -1
            java.lang.Object r7 = r8.w
            eh5 r7 = (defpackage.eh5) r7
            int r7 = r7.x
            goto L_0x00a0
        L_0x0094:
            int r14 = r14 + 1
            r7 = 1
            goto L_0x006a
        L_0x0098:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            kotlin.KotlinNothingValueException r0 = defpackage.b81.z(r0)
            throw r0
        L_0x009f:
            r7 = 0
        L_0x00a0:
            if (r4 <= 0) goto L_0x00a8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            int r10 = defpackage.k31.h(r12)
            float r11 = defpackage.b98.b
            int r11 = r1.r0(r11)
            int r10 = r10 - r11
            boolean r11 = r0.b
            if (r11 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r10 = r6
        L_0x00ba:
            float r14 = r0.c
            int r15 = r1.r0(r14)
            if (r10 >= r15) goto L_0x00c3
            r10 = r15
        L_0x00c3:
            int r15 = defpackage.k31.g(r12)
            r18 = r3
            a37 r3 = r0.e
            java.lang.Object r19 = r3.getValue()
            r30 = r3
            r3 = r19
            lx1 r3 = (defpackage.lx1) r3
            float r3 = r3.w
            int r3 = r1.r0(r3)
            if (r15 >= r3) goto L_0x00de
            r15 = r3
        L_0x00de:
            if (r4 == 0) goto L_0x015f
            java.util.ArrayList r3 = new java.util.ArrayList
            r19 = r7
            int r7 = r2.size()
            r3.<init>(r7)
            int r7 = r2.size()
            r21 = r5
            r20 = r11
            r11 = r19
            r5 = 0
            r19 = r9
            r9 = 0
        L_0x00f9:
            if (r9 >= r7) goto L_0x0166
            java.lang.Object r22 = r2.get(r9)
            r23 = r2
            r2 = r22
            gh4 r2 = (defpackage.gh4) r2
            int r11 = -r11
            r24 = r3
            r17 = r4
            r22 = r7
            r16 = r9
            r7 = 0
            r9 = 1
            long r3 = defpackage.m31.j(r7, r11, r9, r12)
            int r11 = r1.r0(r14)
            java.lang.Object r25 = r30.getValue()
            r7 = r25
            lx1 r7 = (defpackage.lx1) r7
            float r7 = r7.w
            int r7 = r1.r0(r7)
            r26 = r12
            long r11 = defpackage.x91.x(r11, r10, r7, r15)
            long r3 = defpackage.m31.e(r3, r11)
            eh5 r2 = r2.y(r3)
            int r3 = r2.b0()
            if (r20 == 0) goto L_0x0144
            if (r5 >= r3) goto L_0x0144
            float r4 = defpackage.b98.b
            int r4 = r1.r0(r4)
            int r5 = r4 + r3
        L_0x0144:
            int r11 = r2.x
            r4 = r17
            boolean r2 = r4.add(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = r24
            r3.add(r2)
            int r2 = r16 + 1
            r9 = r2
            r7 = r22
            r2 = r23
            r12 = r26
            goto L_0x00f9
        L_0x015f:
            r21 = r5
            r19 = r9
            r20 = r11
            r5 = 0
        L_0x0166:
            bd5 r2 = r0.h
            bd5 r3 = r0.g
            a37 r7 = r0.f
            if (r20 == 0) goto L_0x01a1
            java.lang.Object r9 = r8.w
            eh5 r9 = (defpackage.eh5) r9
            if (r9 == 0) goto L_0x0177
            int r11 = r9.w
            goto L_0x0178
        L_0x0177:
            r11 = 0
        L_0x0178:
            int r5 = java.lang.Math.max(r5, r11)
            if (r5 <= r6) goto L_0x019f
            r9 = r21
            if (r5 <= r9) goto L_0x019f
            int r5 = java.lang.Math.max(r5, r9)
            int r6 = defpackage.k31.h(r31)
            if (r5 <= r6) goto L_0x018d
            r5 = r6
        L_0x018d:
            java.lang.Object r6 = r7.getValue()
            lx1 r6 = (defpackage.lx1) r6
            float r6 = r6.w
            int r6 = r1.r0(r6)
            if (r6 <= r5) goto L_0x019c
            r6 = r5
        L_0x019c:
            r3.e(r6)
        L_0x019f:
            r9 = r6
            goto L_0x01bf
        L_0x01a1:
            int r3 = r3.d()
            if (r3 <= 0) goto L_0x019f
            java.lang.Object r3 = r7.getValue()
            lx1 r3 = (defpackage.lx1) r3
            float r3 = r3.w
            int r3 = r1.r0(r3)
            int r5 = r2.d()
            if (r5 >= r6) goto L_0x01ba
            r5 = r6
        L_0x01ba:
            int r6 = defpackage.z65.p(r3, r6, r5)
            goto L_0x019f
        L_0x01bf:
            r2.e(r9)
            wg1 r2 = new wg1
            r17 = r4
            r4 = 3
            vr r7 = r0.i
            a37 r0 = r0.j
            r5 = r8
            r6 = r17
            r3 = r18
            r8 = r0
            r2.<init>((int) r3, (int) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            r0 = r19
            mh4 r0 = r1.d0(r9, r3, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a98.b(oh4, java.util.List, long):mh4");
    }
}

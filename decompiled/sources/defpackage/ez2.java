package defpackage;

import java.util.Iterator;

/* renamed from: ez2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ez2 extends l66 implements gs2 {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ fz2 E;
    public Iterator y;
    public int[] z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez2(fz2 fz2, f61 f61) {
        super(2, f61);
        this.E = fz2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((ez2) o((f61) obj2, (bl6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        ez2 ez2 = new ez2(this.E, f61);
        ez2.D = obj;
        return ez2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    public final java.lang.Object s(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.D
            bl6 r0 = (defpackage.bl6) r0
            int r1 = r9.C
            fz2 r2 = r9.E
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r4) goto L_0x001b
            int r1 = r9.B
            int r5 = r9.A
            int[] r6 = r9.z
            java.util.Iterator r7 = r9.y
            defpackage.o85.q(r10)
            r10 = r7
            goto L_0x005c
        L_0x001b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r9)
            r9 = 0
            return r9
        L_0x0022:
            defpackage.o85.q(r10)
            java.util.ArrayList r10 = r2.a
            java.util.Iterator r10 = r10.iterator()
            r1 = r3
        L_0x002c:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r10.next()
            int[] r5 = (int[]) r5
            r6 = r5
            r5 = r1
            r1 = r3
        L_0x003b:
            int r7 = r6.length
            if (r1 >= r7) goto L_0x0061
            int r7 = r2.a(r5)
            r8 = -1
            if (r7 == r8) goto L_0x005c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r9.D = r0
            r9.y = r10
            r9.z = r6
            r9.A = r5
            r9.B = r1
            r9.C = r4
            r0.c(r9, r2)
            p81 r9 = defpackage.p81.w
            return r9
        L_0x005c:
            int r1 = r1 + 6
            int r5 = r5 + 6
            goto L_0x003b
        L_0x0061:
            r1 = r5
            goto L_0x002c
        L_0x0063:
            vs7 r9 = defpackage.vs7.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.s(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* renamed from: fu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fu7 {
    public static final kl f = new kl(0.0f);
    public final m38 a;
    public long b = Long.MIN_VALUE;
    public kl c = f;
    public boolean d;
    public float e;

    public fu7(hl hlVar) {
        this.a = hlVar.a(we.v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (r13 != 0.0f) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (defpackage.pd8.s(r0).a(r8, r3) == r12) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public final Object a(g5 g5Var, g20 g20, h61 h61) {
        eu7 eu7;
        int i;
        sr2 sr2;
        eu7 eu72;
        vr2 vr2;
        float f2;
        float f3;
        h61 h612 = h61;
        if (h612 instanceof eu7) {
            eu7 = (eu7) h612;
            int i2 = eu7.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eu7.E = i2 - Integer.MIN_VALUE;
                Object obj = eu7.C;
                i = eu7.E;
                kl klVar = f;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (this.d) {
                        bc3.c("animateToZero called while previous animation is running");
                    }
                    e81 e81 = eu7.x;
                    e81.getClass();
                    lm4 lm4 = (lm4) e81.a0(xb4.U);
                    if (lm4 != null) {
                        f3 = lm4.M();
                    } else {
                        f3 = 1.0f;
                    }
                    this.d = true;
                    f2 = f3;
                    eu72 = eu7;
                    vr2 = g5Var;
                    sr2 = g20;
                } else if (i == 1) {
                    float f4 = eu7.B;
                    sr2 sr22 = eu7.A;
                    vr2 vr22 = (vr2) eu7.z;
                    o85.q(obj);
                    float f5 = f4;
                    eu72 = eu7;
                    sr2 = sr22;
                    f2 = f5;
                    vr2 = vr22;
                    sr2.b();
                } else if (i == 2) {
                    sr2 = (sr2) eu7.z;
                    try {
                        o85.q(obj);
                        sr2.b();
                        this.b = Long.MIN_VALUE;
                        this.c = klVar;
                        this.d = false;
                        return vs7.a;
                    } catch (Throwable th) {
                        this.b = Long.MIN_VALUE;
                        this.c = klVar;
                        this.d = false;
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (Math.abs(this.e) < 0.01f) {
                    jf jfVar = new jf(this, f2, vr2);
                    eu72.z = vr2;
                    eu72.A = sr2;
                    eu72.B = f2;
                    eu72.E = 1;
                    e81 e812 = eu72.x;
                    e812.getClass();
                    if (pd8.s(e812).a(jfVar, eu72) == p81) {
                        return p81;
                    }
                    sr2.b();
                }
                if (Math.abs(this.e) != 0.0f) {
                    this.b = Long.MIN_VALUE;
                    this.c = klVar;
                    this.d = false;
                    return vs7.a;
                }
                k77 k77 = new k77(15, (Object) this, (Object) vr2);
                eu72.z = sr2;
                eu72.A = null;
                eu72.E = 2;
                e81 e813 = eu72.x;
                e813.getClass();
            }
        }
        eu7 = new eu7(this, h612);
        Object obj2 = eu7.C;
        i = eu7.E;
        kl klVar2 = f;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        if (Math.abs(this.e) < 0.01f) {
        }
        if (Math.abs(this.e) != 0.0f) {
        }
    }
}

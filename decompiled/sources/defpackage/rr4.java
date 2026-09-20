package defpackage;

import java.util.Iterator;

/* renamed from: rr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rr4 extends l66 implements gs2 {
    public int A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ sr2 E;
    public final /* synthetic */ gs2 F;
    public final /* synthetic */ sr2 G;
    public final /* synthetic */ sr2 H;
    public qk5 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr4(sr2 sr2, gs2 gs2, sr2 sr22, sr2 sr23, f61 f61) {
        super(2, f61);
        this.E = sr2;
        this.F = gs2;
        this.G = sr22;
        this.H = sr23;
    }

    public final Object H(Object obj, Object obj2) {
        return ((rr4) o((f61) obj2, (g97) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        rr4 rr4 = new rr4(this.E, this.F, this.G, this.H, f61);
        rr4.D = obj;
        return rr4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r2 == r8) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r13 == r8) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8 A[SYNTHETIC, Splitter:B:61:0x00d8] */
    public final Object s(Object obj) {
        sr2 sr2;
        int i;
        Object obj2;
        qk5 qk5;
        int i2;
        long j;
        int i3;
        Iterator it;
        p81 p81;
        Object obj3;
        int i4;
        Object obj4;
        g97 g97 = (g97) this.D;
        int i5 = this.C;
        sr2 sr22 = this.H;
        p81 p812 = p81.w;
        if (i5 == 0) {
            o85.q(obj);
            this.D = g97;
            this.C = 1;
            obj4 = sb7.b(g97, this, 2);
        } else if (i5 == 1) {
            o85.q(obj);
            obj4 = obj;
        } else if (i5 == 2) {
            j = this.B;
            i3 = this.A;
            i2 = this.z;
            qk5 = this.y;
            try {
                o85.q(obj);
                obj2 = obj;
                it = ((kk5) obj2).a.iterator();
                qk5 qk52 = (qk5) obj3;
                if (qk52 != null) {
                    try {
                        long q = ub5.q(qk52, false);
                        j = l35.e(j, q);
                        this.E.b();
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        sr22 = sr2;
                        p812 = p81;
                        lk5 lk5 = lk5.x;
                        this.D = g97;
                        this.y = qk5;
                        this.z = i2;
                        this.A = i3;
                        this.B = j;
                        this.C = 2;
                        obj2 = g97.c(lk5, this);
                    } catch (Throwable th) {
                        th = th;
                        i = 1;
                    }
                    if (!qk52.h || qk52.d) {
                        long q2 = ub5.q(qk52, false);
                        j = l35.e(j, q2);
                        if (i2 == 0 && l35.c(j) > g97.g().f()) {
                            this.E.b();
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            qk52.a();
                            this.F.H(new Float(Float.intBitsToFloat((int) (q2 >> 32))), new Float(Float.intBitsToFloat((int) (q2 & 4294967295L))));
                        }
                        sr22 = sr2;
                        p812 = p81;
                        lk5 lk52 = lk5.x;
                        this.D = g97;
                        this.y = qk5;
                        this.z = i2;
                        this.A = i3;
                        this.B = j;
                        this.C = 2;
                        obj2 = g97.c(lk52, this);
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = i3;
                }
                if (i4 != 0 && i2 == 0) {
                    this.G.b();
                }
                if (i2 != 0) {
                    sr2.b();
                }
                return vs7.a;
            } catch (Throwable th2) {
                th = th2;
                sr2 = sr22;
            }
            while (true) {
                if (!it.hasNext()) {
                    sr2 = sr22;
                    p81 = p812;
                    obj3 = null;
                    break;
                }
                try {
                    obj3 = it.next();
                    p81 = p812;
                    if (a35.i(((qk5) obj3).a, qk5.a)) {
                        break;
                    }
                    sr22 = sr2;
                    p812 = p81;
                } catch (Throwable th3) {
                    th = th3;
                }
                sr2 = sr22;
                th = th3;
                i = i2;
                if (i != 0) {
                    sr2.b();
                }
                throw th;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = 0;
        qk5 = (qk5) obj4;
        i3 = 0;
        i2 = 0;
        lk5 lk522 = lk5.x;
        this.D = g97;
        this.y = qk5;
        this.z = i2;
        this.A = i3;
        this.B = j;
        this.C = 2;
        obj2 = g97.c(lk522, this);
    }
}

package defpackage;

import java.util.Iterator;

/* renamed from: vz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vz6 extends l66 implements gs2 {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ sr2 D;
    public final /* synthetic */ gs2 E;
    public final /* synthetic */ sr2 F;
    public qk5 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vz6(sr2 sr2, gs2 gs2, sr2 sr22, f61 f61) {
        super(2, f61);
        this.D = sr2;
        this.E = gs2;
        this.F = sr22;
    }

    public final Object H(Object obj, Object obj2) {
        return ((vz6) o((f61) obj2, (g97) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        vz6 vz6 = new vz6(this.D, this.E, this.F, f61);
        vz6.C = obj;
        return vz6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r2 == r8) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r12 != r8) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f5  */
    public final Object s(Object obj) {
        sr2 sr2;
        int i;
        Object obj2;
        qk5 qk5;
        long j;
        Object obj3;
        Object obj4;
        g97 g97 = (g97) this.C;
        int i2 = this.B;
        sr2 sr22 = this.F;
        int i3 = 1;
        p81 p81 = p81.w;
        if (i2 == 0) {
            o85.q(obj);
            this.C = g97;
            this.B = 1;
            obj4 = sb7.b(g97, this, 2);
        } else if (i2 == 1) {
            o85.q(obj);
            obj4 = obj;
        } else if (i2 == 2) {
            j = this.A;
            i = this.z;
            qk5 = this.y;
            try {
                o85.q(obj);
                obj2 = obj;
                Iterator it = ((kk5) obj2).a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        sr2 = sr22;
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    sr2 = sr22;
                    if (a35.i(((qk5) obj3).a, qk5.a)) {
                        break;
                    }
                    sr22 = sr2;
                }
                qk5 qk52 = (qk5) obj3;
                if (qk52 != null) {
                    if (!qk52.h || qk52.d) {
                        long q = ub5.q(qk52, false);
                        j = l35.e(j, q);
                        if (i == 0 && l35.c(j) > g97.g().f()) {
                            try {
                                this.D.b();
                                i = 1;
                            } catch (Throwable th) {
                                th = th;
                                if (i3 != 0) {
                                }
                                throw th;
                            }
                        }
                        if (i != 0) {
                            qk52.a();
                            this.E.H(new Float(Float.intBitsToFloat((int) (q >> 32))), new Float(Float.intBitsToFloat((int) (q & 4294967295L))));
                        }
                        sr22 = sr2;
                        lk5 lk5 = lk5.x;
                        this.C = g97;
                        this.y = qk5;
                        this.z = i;
                        this.A = j;
                        this.B = 2;
                        obj2 = g97.c(lk5, this);
                    }
                }
                if (i != 0) {
                    sr2.b();
                }
                return vs7.a;
            } catch (Throwable th2) {
                th = th2;
                i3 = i;
                sr2 = sr22;
                if (i3 != 0) {
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
        i = 0;
        try {
            lk5 lk52 = lk5.x;
            this.C = g97;
            this.y = qk5;
            this.z = i;
            this.A = j;
            this.B = 2;
            obj2 = g97.c(lk52, this);
        } catch (Throwable th3) {
            th = th3;
            i3 = i;
            if (i3 != 0) {
            }
            throw th;
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy3 {
    public final qb a;
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public qb h;
    public final HashMap i = new HashMap();
    public final /* synthetic */ int j;

    public vy3(qb qbVar, int i2) {
        this.j = i2;
        this.a = qbVar;
    }

    public static final void a(vy3 vy3, kb kbVar, int i2, xz4 xz4) {
        float f2;
        HashMap hashMap = vy3.i;
        float f3 = (float) i2;
        long floatToRawIntBits = ((long) Float.floatToRawIntBits(f3)) << 32;
        long floatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        while (true) {
            long j2 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (vy3.j) {
                    case b85.b:
                        o95 o95 = xz4.l0;
                        if (o95 != null) {
                            fx2 fx2 = (fx2) o95;
                            float[] b2 = fx2.b();
                            if (!fx2.O) {
                                j2 = eh4.b(j2, b2);
                            }
                        }
                        j2 = gr8.T(j2, xz4.Z);
                        break;
                    default:
                        fd4 a1 = xz4.a1();
                        a1.getClass();
                        long j3 = a1.P;
                        j2 = l35.e((((long) Float.floatToRawIntBits((float) ((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (j3 >> 32)))) << 32), j2);
                        break;
                }
                xz4 = xz4.Q;
                xz4.getClass();
                if (xz4.equals(vy3.a.f())) {
                    if (kbVar instanceof h23) {
                        f2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    } else {
                        f2 = Float.intBitsToFloat((int) (j2 >> 32));
                    }
                    int round = Math.round(f2);
                    if (hashMap.containsKey(kbVar)) {
                        int intValue = ((Number) sf4.U(kbVar, hashMap)).intValue();
                        h23 h23 = nb.a;
                        round = ((Number) kbVar.a.H(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(kbVar, Integer.valueOf(round));
                    return;
                }
            } while (!vy3.b(xz4).containsKey(kbVar));
            float c2 = (float) vy3.c(xz4, kbVar);
            long floatToRawIntBits3 = (long) Float.floatToRawIntBits(c2);
            floatToRawIntBits = ((long) Float.floatToRawIntBits(c2)) << 32;
            floatToRawIntBits2 = floatToRawIntBits3 & 4294967295L;
        }
    }

    public final Map b(xz4 xz4) {
        switch (this.j) {
            case b85.b:
                return xz4.J0().a();
            default:
                fd4 a1 = xz4.a1();
                a1.getClass();
                return a1.J0().a();
        }
    }

    public final int c(xz4 xz4, kb kbVar) {
        switch (this.j) {
            case b85.b:
                return xz4.X(kbVar);
            default:
                fd4 a1 = xz4.a1();
                a1.getClass();
                return a1.X(kbVar);
        }
    }

    public final boolean d() {
        if (this.c || this.e || this.f || this.g) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        h();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.b = true;
        qb qbVar = this.a;
        qb g2 = qbVar.g();
        if (g2 != null) {
            if (this.c) {
                g2.V();
            } else if (this.e || this.d) {
                g2.requestLayout();
            }
            if (this.f) {
                qbVar.V();
            }
            if (this.g) {
                qbVar.requestLayout();
            }
            g2.a().f();
        }
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        pb pbVar = new pb(0, this);
        qb qbVar = this.a;
        qbVar.H(pbVar);
        hashMap.putAll(b(qbVar.f()));
        this.b = false;
    }

    public final void h() {
        vy3 a2;
        vy3 a3;
        boolean d2 = d();
        qb qbVar = this.a;
        if (!d2) {
            qb g2 = qbVar.g();
            if (g2 != null) {
                qbVar = g2.a().h;
                if (qbVar == null || !qbVar.a().d()) {
                    qb qbVar2 = this.h;
                    if (qbVar2 != null && !qbVar2.a().d()) {
                        qb g3 = qbVar2.g();
                        if (!(g3 == null || (a3 = g3.a()) == null)) {
                            a3.h();
                        }
                        qb g4 = qbVar2.g();
                        if (g4 == null || (a2 = g4.a()) == null) {
                            qbVar = null;
                        } else {
                            qbVar = a2.h;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = qbVar;
    }
}

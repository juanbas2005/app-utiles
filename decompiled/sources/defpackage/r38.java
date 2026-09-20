package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: r38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r38 implements m38 {
    public long w;
    public long x;
    public final Object y;
    public final Object z;

    public r38(o79 o79) {
        this.z = o79;
        y19 y19 = (y19) o79.w;
        this.y = new h79(this, y19, 0);
        y19.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w = elapsedRealtime;
        this.x = elapsedRealtime;
    }

    public boolean a() {
        return true;
    }

    public long b(long j) {
        long j2 = this.x;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long j4 = this.w;
        long j5 = j3 / j4;
        if (((o46) this.z) == o46.w || j5 % 2 == 0) {
            return j3 - (j5 * j4);
        }
        return ((j5 + 1) * j4) - j3;
    }

    public ol c(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2 = this.x;
        long j3 = this.w;
        if (j + j2 <= j3) {
            return olVar2;
        }
        return ((o38) this.y).j(j3 - j2, olVar, olVar3, olVar2);
    }

    public long d(ol olVar, ol olVar2, ol olVar3) {
        return Long.MAX_VALUE;
    }

    public boolean e(boolean z2, boolean z3, long j) {
        o79 o79 = (o79) this.z;
        o79.b1();
        o79.d1();
        y19 y19 = (y19) o79.w;
        boolean a = y19.a();
        pz8 pz8 = y19.B;
        if (a) {
            q09 q09 = y19.A;
            y19.e(q09);
            l09 l09 = q09.L;
            y19.G.getClass();
            l09.b(System.currentTimeMillis());
        }
        long j2 = j - this.w;
        if (z2 || j2 >= 1000) {
            if (!z3) {
                j2 = j - this.x;
                this.x = j;
            }
            y19.g(pz8);
            pz8.J.b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            l59 l59 = y19.H;
            y19.f(l59);
            d99.Y1(l59.g1(!y19.z.r1()), bundle, true);
            if (!z3) {
                v49 v49 = y19.I;
                y19.f(v49);
                v49.j1("auto", "_e", bundle);
            }
            this.w = j;
            h79 h79 = (h79) this.y;
            h79.c();
            h79.b(((Long) by8.p0.a((Object) null)).longValue());
            return true;
        }
        y19.g(pz8);
        pz8.J.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    public ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2 = j;
        ol olVar4 = olVar3;
        return ((o38) this.y).j(b(j2), olVar, olVar2, c(j2, olVar, olVar4, olVar2));
    }

    public ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2 = j;
        ol olVar4 = olVar3;
        return ((o38) this.y).t(b(j2), olVar, olVar2, c(j2, olVar, olVar4, olVar2));
    }

    public r38(o38 o38, o46 o46) {
        this.y = o38;
        this.z = o46;
        this.w = ((long) (o38.r() + o38.n())) * 1000000;
        this.x = 0;
    }
}

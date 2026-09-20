package defpackage;

/* renamed from: w38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w38 extends ll4 implements gz1 {
    public bm7 K;
    public n52 L;
    public x82 M;
    public tr6 N;

    public final void p0(wy3 wy3) {
        jt0 jt0;
        wy3.a();
        bm7 bm7 = this.K;
        v38 v38 = new v38(this, 0);
        tr6 tr6 = this.N;
        if (tr6.a()) {
            jt0 = new jt0(tr6.e);
        } else {
            jt0 = null;
        }
        am7 a = bm7.a(v38, jt0, (ol) null, new v38(this, 1));
        tr6 tr62 = this.N;
        long j = ((jt0) a.getValue()).a;
        wz0 wz0 = tr62.c;
        if (tr62.b() && ((Boolean) ((ed5) wz0.g).getValue()).booleanValue()) {
            j = ((jt0) ((ed5) wz0.h).getValue()).a;
        }
        long j2 = j;
        if (tr62.b()) {
            tr62.e = j2;
        }
        if (jt0.d(j2) != 0.0f) {
            nm7 nm7 = this.L.a;
            nm7 nm72 = this.M.a;
            hz1.f0(wy3, j2, 0, 0, 0.0f, 126);
        }
    }
}

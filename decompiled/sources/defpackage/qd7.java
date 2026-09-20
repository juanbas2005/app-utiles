package defpackage;

/* renamed from: qd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qd7 extends wo1 implements ry0, zc7 {
    public kg5 M;
    public ne1 N;
    public ue7 O;
    public o71 P;
    public h27 Q;
    public final oq1 R = u55.i(new fd7(1, (Object) this));
    public ly5 S = ly5.e;

    public qd7(kg5 kg5, ne1 ne1, ue7 ue7, o71 o71) {
        this.M = kg5;
        this.N = ne1;
        this.O = ue7;
        this.P = o71;
    }

    public final void N0() {
        kg5 kg5 = this.M;
        kg5.y = qj7.y;
        kg5.x = this;
    }

    public final void O0() {
        kg5 kg5 = this.M;
        kg5.y = qj7.x;
        kg5.x = null;
    }

    public final yc7 Q() {
        return (yc7) this.R.getValue();
    }

    public final long g(dy3 dy3) {
        return k(dy3).d();
    }

    public final ly5 k(dy3 dy3) {
        if (!this.J) {
            return this.S;
        }
        ly5 ly5 = (ly5) this.P.y(dy3);
        if (ly5 == null) {
            return this.S;
        }
        this.S = ly5;
        return ly5;
    }
}

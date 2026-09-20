package defpackage;

import java.util.List;

/* renamed from: k34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k34 extends in8 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ j24 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ ib E;
    public final /* synthetic */ h80 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ long I;
    public final /* synthetic */ s34 J;
    public final i34 x;
    public final j24 y;
    public final long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k34(long j, boolean z2, i34 i34, j24 j24, int i, int i2, ib ibVar, h80 h80, int i3, int i4, long j2, s34 s34) {
        super(4);
        int i5;
        this.A = z2;
        this.B = j24;
        this.C = i;
        this.D = i2;
        this.E = ibVar;
        this.F = h80;
        this.G = i3;
        this.H = i4;
        this.I = j2;
        this.J = s34;
        this.x = i34;
        this.y = j24;
        int i6 = Integer.MAX_VALUE;
        if (z2) {
            i5 = k31.h(j);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        this.z = m31.b(0, i5, 0, !z2 ? k31.g(j) : i6, 5);
    }

    public final n34 d1(long j, int i) {
        int i2;
        int i3 = i;
        i34 i34 = this.x;
        Object b = i34.b(i3);
        Object t = i34.b.t(i3);
        List I0 = I0(this.y, i3, j);
        if (i3 == this.C - 1) {
            i2 = 0;
        } else {
            i2 = this.D;
        }
        int i4 = i2;
        return new n34(i, I0, this.A, this.E, this.F, this.B.x.getLayoutDirection(), this.G, this.H, i4, this.I, b, t, this.J.o, j);
    }
}

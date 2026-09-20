package defpackage;

import java.util.List;

/* renamed from: zz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zz3 extends in8 {
    public final /* synthetic */ j24 A;
    public final /* synthetic */ n04 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ long E;
    public final wz3 x;
    public final j24 y;
    public final int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz3(wz3 wz3, j24 j24, int i, n04 n04, int i2, int i3, long j) {
        super(4);
        this.A = j24;
        this.B = n04;
        this.C = i2;
        this.D = i3;
        this.E = j;
        this.x = wz3;
        this.y = j24;
        this.z = i;
    }

    public final e04 d1(int i, int i2, int i3, int i4, long j) {
        int i5;
        int i6 = i;
        wz3 wz3 = this.x;
        Object b = wz3.b(i6);
        Object t = wz3.b.t(i6);
        long j2 = j;
        List I0 = I0(this.y, i6, j2);
        if (k31.f(j2)) {
            i5 = k31.j(j2);
        } else {
            if (!k31.e(j2)) {
                bc3.a("does not have fixed height");
            }
            i5 = k31.i(j2);
        }
        ey3 layoutDirection = this.A.x.getLayoutDirection();
        wz0 wz0 = this.B.m;
        int i7 = this.D;
        long j3 = this.E;
        int i8 = this.C;
        return new e04(i6, b, i5, i4, layoutDirection, i8, i7, I0, j3, t, wz0, j2, i2, i3);
    }
}

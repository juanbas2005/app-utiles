package defpackage;

/* renamed from: t24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t24 {
    public final vr2 a;
    public final cf4 b = new cf4(10);
    public l90 c;
    public int d = -1;
    public int e = -1;
    public int f;

    public t24(vr2 vr2) {
        this.a = vr2;
    }

    public final s24 a(int i, long j, boolean z, vr2 vr2) {
        l90 l90 = this.c;
        if (l90 == null) {
            return t02.a;
        }
        un5 un5 = (un5) l90.d;
        boolean z2 = un5 instanceof yh;
        tn5 tn5 = new tn5(l90, i, this.b, vr2);
        tn5.d = new k31(j);
        if (!z2) {
            un5.a(tn5);
        } else if (z) {
            yh yhVar = (yh) un5;
            yhVar.x.add(new wo5(1, tn5));
            if (!yhVar.y) {
                yhVar.y = true;
                yhVar.w.post(yhVar);
            }
        } else {
            yh yhVar2 = (yh) un5;
            yhVar2.x.add(new wo5(0, tn5));
            if (!yhVar2.y) {
                yhVar2.y = true;
                yhVar2.w.post(yhVar2);
            }
        }
        ag8.L((long) i, "compose:lazy:schedule_prefetch:index");
        return tn5;
    }
}

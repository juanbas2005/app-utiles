package defpackage;

/* renamed from: bm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bm7 {
    public final lo7 a;
    public final ed5 b = u55.p((Object) null);
    public final /* synthetic */ mm7 c;

    public bm7(mm7 mm7, lo7 lo7, String str) {
        this.c = mm7;
        this.a = lo7;
    }

    public final am7 a(vr2 vr2, Object obj, ol olVar, vr2 vr22) {
        ed5 ed5 = this.b;
        am7 am7 = (am7) ed5.getValue();
        mm7 mm7 = this.c;
        if (am7 == null) {
            Object y = vr22.y(mm7.a.H0());
            Object y2 = vr22.y(mm7.a.H0());
            lo7 lo7 = this.a;
            ol olVar2 = (ol) lo7.a.y(y2);
            olVar2.d();
            im7 im7 = new im7(mm7, y, olVar2, lo7);
            am7 = new am7(this, im7, vr2, vr22);
            ed5.setValue(am7);
            mm7.j.add(im7);
        }
        am7.y = vr22;
        am7.x = vr2;
        am7.b(mm7.f(), obj, olVar);
        return am7;
    }
}

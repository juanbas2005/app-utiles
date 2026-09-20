package defpackage;

/* renamed from: ad  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ad {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ bd d;

    public ad(bd bdVar) {
        this.d = bdVar;
    }

    public final void a(float f, float f2) {
        boolean z;
        Object obj;
        float f3;
        bd bdVar = this.d;
        ad5 ad5 = bdVar.j;
        float d2 = ad5.d();
        ad5.e(f);
        bdVar.k.e(f2);
        if (!Float.isNaN(d2)) {
            if (f >= d2) {
                z = true;
            } else {
                z = false;
            }
            ll1 b2 = bdVar.b();
            ed5 ed5 = bdVar.g;
            if (ad5.d() == b2.c(ed5.getValue())) {
                float d3 = ad5.d();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                Object b3 = bdVar.b().b(d3 + f3, z);
                if (b3 == null) {
                    b3 = ed5.getValue();
                }
                if (z) {
                    this.a = ed5.getValue();
                    this.b = b3;
                } else {
                    this.a = b3;
                    this.b = ed5.getValue();
                }
            } else {
                Object b4 = bdVar.b().b(ad5.d(), false);
                if (b4 == null) {
                    b4 = ed5.getValue();
                }
                Object b5 = bdVar.b().b(ad5.d(), true);
                if (b5 == null) {
                    b5 = ed5.getValue();
                }
                this.a = b4;
                this.b = b5;
            }
            ll1 b6 = bdVar.b();
            Object obj2 = this.a;
            obj2.getClass();
            float c2 = b6.c(obj2);
            ll1 b7 = bdVar.b();
            Object obj3 = this.b;
            obj3.getClass();
            this.c = Math.abs(c2 - b7.c(obj3));
            if (Math.abs(ad5.d() - bdVar.b().c(ed5.getValue())) >= this.c / 2.0f) {
                if (z) {
                    obj = this.b;
                } else {
                    obj = this.a;
                }
                if (obj == null) {
                    obj = ed5.getValue();
                }
                if (((Boolean) bdVar.a.y(obj)).booleanValue()) {
                    bdVar.f(obj);
                }
            }
        }
    }
}

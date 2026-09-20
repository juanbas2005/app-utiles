package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: ve8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ve8 implements jy0, q54 {
    public gs2 A = zw0.a;
    public final je w;
    public final py0 x;
    public boolean y;
    public in8 z;

    public ve8(je jeVar, py0 py0) {
        this.w = jeVar;
        this.x = py0;
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            this.w.getView().setTag(R.id.wrapped_composition_tag, (Object) null);
            in8 in8 = this.z;
            if (in8 != null) {
                in8.M0(this);
            }
            this.z = null;
        }
        this.x.o();
    }

    public final void c(gs2 gs2) {
        this.w.setOnReadyForComposition(new lh(10, this, gs2));
    }

    public final void o(t54 t54, j54 j54) {
        if (j54 == j54.ON_DESTROY) {
            b();
        } else if (j54 == j54.ON_CREATE && !this.y) {
            c(this.A);
        }
    }
}

package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mh implements o81 {
    public final View w;
    public final rf7 x;
    public final o81 y;
    public final AtomicReference z = new AtomicReference((Object) null);

    public mh(View view, rf7 rf7, o81 o81) {
        this.w = view;
        this.x = rf7;
        this.y = o81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final void a(v44 v44, h61 h61) {
        jh jhVar;
        int i;
        if (h61 instanceof jh) {
            jhVar = (jh) h61;
            int i2 = jhVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jhVar.B = i2 - Integer.MIN_VALUE;
                Object obj = jhVar.z;
                i = jhVar.B;
                if (i != 0) {
                    o85.q(obj);
                    lh lhVar = new lh(0, v44, this);
                    n0 n0Var = new n0(this, (f61) null, 5);
                    jhVar.B = 1;
                    if (gl0.L(new ng((Object) lhVar, (Object) this.z, (Object) n0Var, (f61) null, 18), jhVar) == p81.w) {
                        return;
                    }
                } else if (i != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                }
                ta1.e();
            }
        }
        jhVar = new jh(this, h61);
        Object obj2 = jhVar.z;
        i = jhVar.B;
        if (i != 0) {
        }
        ta1.e();
    }

    public final e81 k() {
        return this.y.k();
    }
}

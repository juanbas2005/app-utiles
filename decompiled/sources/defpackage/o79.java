package defpackage;

import android.os.Looper;

/* renamed from: o79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o79 extends fy8 {
    public final uy5 A = new uy5(20, (Object) this);
    public final r38 B = new r38(this);
    public final k68 C = new k68(22, (Object) this);
    public ph8 y;
    public boolean z = true;

    public o79(y19 y19) {
        super(y19);
    }

    public final boolean f1() {
        return false;
    }

    public final void g1() {
        b1();
        if (this.y == null) {
            this.y = new ph8(Looper.getMainLooper(), 2);
        }
    }
}

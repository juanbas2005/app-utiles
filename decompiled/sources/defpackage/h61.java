package defpackage;

/* renamed from: h61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h61 extends q50 {
    public final e81 x;
    public transient f61 y;

    /* JADX WARNING: Illegal instructions before constructor call */
    public h61(f61 f61) {
        this(f61, r0);
        e81 e81;
        if (f61 != null) {
            e81 = f61.r();
        } else {
            e81 = null;
        }
    }

    public e81 r() {
        e81 e81 = this.x;
        e81.getClass();
        return e81;
    }

    public void t() {
        f61 f61 = this.y;
        if (!(f61 == null || f61 == this)) {
            c81 a0 = r().a0(hz2.z);
            a0.getClass();
            h81 h81 = (h81) a0;
            sv1 sv1 = (sv1) f61;
            sv1.k();
            kk0 m = sv1.m();
            if (m != null) {
                m.o();
            }
        }
        this.y = zu0.x;
    }

    public h61(f61 f61, e81 e81) {
        super(f61);
        this.x = e81;
    }
}

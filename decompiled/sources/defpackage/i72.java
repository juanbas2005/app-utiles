package defpackage;

/* renamed from: i72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i72 extends h81 {
    public static final /* synthetic */ int B = 0;
    public as A;
    public long y;
    public boolean z;

    public final h81 n0(int i) {
        su0.g(1);
        return this;
    }

    public final void o0(boolean z2) {
        long j;
        long j2 = this.y;
        if (z2) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.y = j3;
        if (j3 <= 0 && this.z) {
            shutdown();
        }
    }

    public final void p0(vv1 vv1) {
        as asVar = this.A;
        if (asVar == null) {
            asVar = new as();
            this.A = asVar;
        }
        asVar.addLast(vv1);
    }

    public final void q0(boolean z2) {
        long j;
        long j2 = this.y;
        if (z2) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.y = j + j2;
        if (!z2) {
            this.z = true;
        }
    }

    public abstract long r0();

    public final boolean s0() {
        Object obj;
        as asVar = this.A;
        if (asVar == null) {
            return false;
        }
        if (asVar.isEmpty()) {
            obj = null;
        } else {
            obj = asVar.removeFirst();
        }
        vv1 vv1 = (vv1) obj;
        if (vv1 == null) {
            return false;
        }
        vv1.run();
        return true;
    }

    public abstract void shutdown();
}

package defpackage;

/* renamed from: h02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h02 extends vb5 {
    public final pq6 A;
    public final qc3 B;

    public h02(pq6 pq6, kq6 kq6, qc3 qc3) {
        this.A = pq6;
        this.B = qc3;
    }

    public final long i() {
        return 9205357640488583168L;
    }

    public final void j(wy3 wy3) {
        qc3 qc3 = this.B;
        pq6 pq6 = this.A;
        long e = wy3.w.e();
        ey3 layoutDirection = wy3.getLayoutDirection();
        synchronized (qc3) {
            try {
                li liVar = (li) qc3.y;
                if (liVar == null) {
                    li liVar2 = new li(gr8.h, 0, ey3.w, 1.0f, (kq6) null);
                    qc3.y = liVar2;
                    liVar = liVar2;
                }
                liVar.a = pq6;
                liVar.b = e;
                liVar.c = layoutDirection;
                liVar.d = wy3.w.b();
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(float f) {
    }

    public final void e(lt0 lt0) {
    }
}

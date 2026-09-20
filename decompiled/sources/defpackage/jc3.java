package defpackage;

/* renamed from: jc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jc3 extends vb5 {
    public final pq6 A;
    public final qc3 B;
    public float C = 1.0f;

    public jc3(pq6 pq6, kq6 kq6, qc3 qc3) {
        this.A = pq6;
        this.B = qc3;
    }

    public final void d(float f) {
        this.C = f;
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
                tp4 tp4 = (tp4) qc3.x;
                if (tp4 == null) {
                    tp4 = new tp4();
                    qc3.x = tp4;
                }
                if (((kc3) tp4.g(liVar)) == null) {
                    pq6.a(e, layoutDirection, wy3);
                    Object obj = new Object();
                    int i = jt0.h;
                    dh4.b();
                    tp4 tp42 = (tp4) qc3.x;
                    if (tp42 == null) {
                        tp42 = new tp4();
                        qc3.x = tp42;
                    }
                    tp42.m(new li(liVar.a, liVar.b, liVar.c, liVar.d, (kq6) null), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wy3.e();
        throw null;
    }

    public final void e(lt0 lt0) {
    }

    public final void f(ey3 ey3) {
    }
}

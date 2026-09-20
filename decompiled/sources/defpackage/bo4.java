package defpackage;

import java.util.ArrayList;

/* renamed from: bo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bo4 extends in8 {
    public final c9 A;
    public final tp4 x = fb5.d();
    public final ArrayList y = new ArrayList();
    public final tp4 z = new tp4();

    public bo4() {
        super(7);
        yg ygVar = new yg(17, this);
        nx6.e(nx6.a);
        synchronized (nx6.c) {
            nx6.h = dt0.N0(nx6.h, ygVar);
        }
        this.A = new c9(16, ygVar);
    }

    public final void A0(xk6 xk6) {
        this.y.add(new zn4(xk6));
    }

    public final void B0() {
        synchronized (this.w) {
            try {
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ao4 ao4 = (ao4) arrayList.get(i);
                    if (ao4 instanceof yn4) {
                        fb5.b(this.x, ((yn4) ao4).a, ((yn4) ao4).b);
                    } else if (ao4 instanceof zn4) {
                        fb5.t(this.x, ((zn4) ao4).a);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } finally {
            }
        }
        this.y.clear();
    }

    public final void C0() {
        this.A.h();
        this.y.clear();
        this.z.a();
        synchronized (this.w) {
            this.x.a();
        }
    }

    public final vr2 L0(xk6 xk6) {
        tp4 tp4 = this.z;
        vr2 vr2 = (vr2) tp4.g(xk6);
        if (vr2 == null) {
            vr2 = new w34(2, this, xk6);
            int f = tp4.f(xk6);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = tp4.c;
            Object obj = objArr[f];
            tp4.b[f] = xk6;
            objArr[f] = vr2;
        }
        return vr2;
    }

    public final void N0(en0 en0) {
        this.z.k(en0);
        A0(en0);
        B0();
    }
}

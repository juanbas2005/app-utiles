package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sx2 extends u18 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = jt0.g;
    public List f;
    public boolean g;
    public eh h;
    public vr2 i;
    public final pb j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public sx2() {
        int i2 = e38.a;
        this.f = a42.w;
        this.g = true;
        this.j = new pb(14, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    public final void a(hz1 hz1) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = eh4.a();
                this.b = fArr;
            } else {
                eh4.d(fArr);
            }
            eh4.h(fArr, this.q + this.m, this.r + this.n);
            eh4.e(fArr, this.l);
            eh4.f(fArr, this.o, this.p);
            eh4.h(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                eh ehVar = this.h;
                if (ehVar == null) {
                    ehVar = gh.a();
                    this.h = ehVar;
                }
                o55.u(this.f, ehVar);
            }
            this.g = false;
        }
        wr0 j0 = hz1.j0();
        long L = j0.L();
        j0.D().h();
        try {
            wr0 wr0 = (wr0) ((ji8) j0.x).x;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                wr0.D().j(fArr2);
            }
            eh ehVar2 = this.h;
            if (!this.f.isEmpty() && ehVar2 != null) {
                wr0.D().k(ehVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((u18) arrayList.get(i2)).a(hz1);
            }
        } finally {
            b81.u(j0, L);
        }
    }

    public final vr2 b() {
        return this.i;
    }

    public final void d(pb pbVar) {
        this.i = pbVar;
    }

    public final void e(int i2, u18 u18) {
        ArrayList arrayList = this.c;
        if (i2 < arrayList.size()) {
            arrayList.set(i2, u18);
        } else {
            arrayList.add(u18);
        }
        g(u18);
        u18.d(this.j);
        c();
    }

    public final void f(long j2) {
        if (this.d && j2 != 16) {
            long j3 = this.e;
            if (j3 == 16) {
                this.e = j2;
                return;
            }
            int i2 = e38.a;
            if (jt0.h(j3) != jt0.h(j2) || jt0.g(j3) != jt0.g(j2) || jt0.e(j3) != jt0.e(j2)) {
                this.d = false;
                this.e = jt0.g;
            }
        }
    }

    public final void g(u18 u18) {
        if (u18 instanceof ce5) {
            ce5 ce5 = (ce5) u18;
            kc0 kc0 = ce5.b;
            if (this.d && kc0 != null) {
                if (kc0 instanceof ky6) {
                    f(((ky6) kc0).a);
                } else {
                    this.d = false;
                    this.e = jt0.g;
                }
            }
            kc0 kc02 = ce5.g;
            if (!this.d || kc02 == null) {
                return;
            }
            if (kc02 instanceof ky6) {
                f(((ky6) kc02).a);
                return;
            }
            this.d = false;
            this.e = jt0.g;
        } else if (u18 instanceof sx2) {
            sx2 sx2 = (sx2) u18;
            if (!sx2.d || !this.d) {
                this.d = false;
                this.e = jt0.g;
                return;
            }
            f(sx2.e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("\t");
            sb.append(((u18) arrayList.get(i2)).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

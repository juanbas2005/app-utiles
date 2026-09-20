package defpackage;

/* renamed from: mm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class mm7 {
    public final in8 a;
    public final mm7 b;
    public final String c;
    public final ed5 d;
    public final ed5 e = u55.p((Object) null);
    public final ed5 f;
    public final cd5 g;
    public final cd5 h;
    public final ed5 i;
    public final yx6 j;
    public final yx6 k;
    public final ed5 l;
    public final oq1 m;

    public mm7(in8 in8, mm7 mm7, String str) {
        this.a = in8;
        this.b = mm7;
        this.c = str;
        this.d = u55.p(in8.H0());
        this.f = u55.p(new hm7(in8.H0(), in8.H0()));
        this.g = new cd5(0);
        this.h = new cd5(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.i = u55.p(bool);
        this.j = new yx6();
        this.k = new yx6();
        this.l = u55.p(bool);
        this.m = u55.i(new au4(this, 2));
        in8.P0(this);
    }

    public final void a(Object obj, yt2 yt2, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        yt2.g0(-1493585151);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                z3 = yt2.g(obj);
            } else {
                z3 = yt2.i(obj);
            }
            if (z3) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (!yt2.V(i3 & 1, z)) {
            yt2.Y();
        } else if (!h()) {
            yt2.e0(466062241);
            q(obj);
            int i6 = i3 & 112;
            if (i6 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (z2 || Q == d63) {
                Q = u55.i(new au4(this, 1));
                yt2.o0(Q);
            }
            if (((Boolean) ((a37) Q).getValue()).booleanValue()) {
                yt2.e0(466470356);
                Object Q2 = yt2.Q();
                if (Q2 == d63) {
                    Q2 = t49.D(yt2);
                    yt2.o0(Q2);
                }
                o81 o81 = (o81) Q2;
                boolean i7 = yt2.i(o81);
                if (i6 != 32) {
                    z4 = false;
                }
                boolean z5 = i7 | z4;
                Object Q3 = yt2.Q();
                if (z5 || Q3 == d63) {
                    Q3 = new k77(9, (Object) o81, (Object) this);
                    yt2.o0(Q3);
                }
                t49.f(o81, this, (vr2) Q3, yt2);
                yt2.r(false);
            } else {
                yt2.e0(467712929);
                yt2.r(false);
            }
            yt2.r(false);
        } else {
            yt2.e0(467722849);
            yt2.r(false);
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) this, obj, i2, 22);
        }
    }

    public final long b() {
        yx6 yx6 = this.j;
        int size = yx6.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, ((im7) yx6.get(i2)).H.d());
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j2 = Math.max(j2, ((mm7) yx62.get(i3)).b());
        }
        return j2;
    }

    public final void c() {
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            im7 im7 = (im7) yx6.get(i2);
            im7.B = null;
            im7.A = null;
            im7.E = false;
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mm7) yx62.get(i3)).c();
        }
    }

    public final boolean d() {
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((im7) yx6.get(i2)).A != null) {
                return true;
            }
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((mm7) yx62.get(i3)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        mm7 mm7 = this.b;
        if (mm7 != null) {
            return mm7.e();
        }
        return this.g.d();
    }

    public final gm7 f() {
        return (gm7) this.f.getValue();
    }

    public final long g() {
        return ((Number) this.m.getValue()).longValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void i(boolean z, long j2) {
        long j3;
        cd5 cd5 = this.h;
        int i2 = (cd5.d() > Long.MIN_VALUE ? 1 : (cd5.d() == Long.MIN_VALUE ? 0 : -1));
        in8 in8 = this.a;
        if (i2 == 0) {
            cd5.e(j2);
            ((ed5) in8.w).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((ed5) in8.w).getValue()).booleanValue()) {
            ((ed5) in8.w).setValue(Boolean.TRUE);
        }
        this.i.setValue(Boolean.FALSE);
        yx6 yx6 = this.j;
        int size = yx6.size();
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            im7 im7 = (im7) yx6.get(i3);
            ed5 ed5 = im7.C;
            ed5 ed52 = im7.C;
            if (!((Boolean) ed5.getValue()).booleanValue()) {
                if (z) {
                    j3 = im7.b().b();
                } else {
                    j3 = j2;
                }
                im7.d(im7.b().f(j3));
                im7.G = im7.b().d(j3);
                if (im7.b().e(j3)) {
                    ed52.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ed52.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i4 = 0; i4 < size2; i4++) {
            mm7 mm7 = (mm7) yx62.get(i4);
            ed5 ed53 = mm7.d;
            in8 in82 = mm7.a;
            if (!sg3.e(ed53.getValue(), in82.H0())) {
                mm7.i(z, j2);
            }
            if (!sg3.e(mm7.d.getValue(), in82.H0())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.h.e(Long.MIN_VALUE);
        in8 in8 = this.a;
        if (in8 instanceof dq4) {
            in8.O0(this.d.getValue());
        }
        o(0);
        ((ed5) in8.w).setValue(Boolean.FALSE);
        yx6 yx6 = this.k;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mm7) yx6.get(i2)).j();
        }
    }

    public final void k(float f2) {
        Object obj;
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            im7 im7 = (im7) yx6.get(i2);
            im7.getClass();
            int i3 = (f2 > -4.0f ? 1 : (f2 == -4.0f ? 0 : -1));
            if (i3 == 0 || f2 == -5.0f) {
                ub7 ub7 = im7.B;
                if (ub7 != null) {
                    im7.b().h(ub7.c);
                    im7.A = null;
                    im7.B = null;
                }
                if (i3 == 0) {
                    obj = im7.b().d;
                } else {
                    obj = im7.b().c;
                }
                im7.b().h(obj);
                im7.b().i(obj);
                im7.d(obj);
                im7.H.e(im7.b().b());
            } else {
                im7.D.e(f2);
            }
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((mm7) yx62.get(i4)).k(f2);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.h.e(Long.MIN_VALUE);
        in8 in8 = this.a;
        ((ed5) in8.w).setValue(Boolean.FALSE);
        boolean h2 = h();
        ed5 ed5 = this.d;
        if (!h2 || !sg3.e(in8.H0(), obj) || !sg3.e(ed5.getValue(), obj2)) {
            if (!sg3.e(in8.H0(), obj) && (in8 instanceof dq4)) {
                in8.O0(obj);
            }
            ed5.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new hm7(obj, obj2));
        }
        yx6 yx6 = this.k;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            mm7 mm7 = (mm7) yx6.get(i2);
            mm7.getClass();
            if (mm7.h()) {
                mm7.l(mm7.a.H0(), mm7.d.getValue());
            }
        }
        yx6 yx62 = this.j;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((im7) yx62.get(i3)).c(0);
        }
    }

    public final void m(long j2) {
        cd5 cd5 = this.h;
        if (cd5.d() == Long.MIN_VALUE) {
            cd5.e(j2);
        }
        o(j2);
        this.i.setValue(Boolean.FALSE);
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((im7) yx6.get(i2)).c(j2);
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mm7 mm7 = (mm7) yx62.get(i3);
            if (!sg3.e(mm7.d.getValue(), mm7.a.H0())) {
                mm7.m(j2);
            }
        }
    }

    public final void n(hi6 hi6) {
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            im7 im7 = (im7) yx6.get(i2);
            ed5 ed5 = im7.F;
            if (!sg3.e(im7.b().c, im7.b().d)) {
                im7.B = im7.b();
                im7.A = hi6;
            }
            im7.z.setValue(new ub7(im7.J, im7.w, ed5.getValue(), ed5.getValue(), im7.G.c()));
            im7.H.e(im7.b().b());
            im7.E = true;
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mm7) yx62.get(i3)).n(hi6);
        }
    }

    public final void o(long j2) {
        if (this.b == null) {
            this.g.e(j2);
        }
    }

    public final void p() {
        ub7 ub7;
        yx6 yx6 = this.j;
        int size = yx6.size();
        for (int i2 = 0; i2 < size; i2++) {
            im7 im7 = (im7) yx6.get(i2);
            hi6 hi6 = im7.A;
            if (!(hi6 == null || (ub7 = im7.B) == null)) {
                long D = dh4.D(((double) hi6.g) * ((double) hi6.d));
                Object f2 = ub7.f(D);
                if (im7.E) {
                    im7.b().i(f2);
                }
                im7.b().h(f2);
                im7.H.e(im7.b().b());
                if (im7.D.d() != -2.0f && !im7.E) {
                    im7.c(im7.K.e());
                } else {
                    im7.d(f2);
                }
                if (D >= hi6.g) {
                    im7.A = null;
                    im7.B = null;
                } else {
                    hi6.c = false;
                }
            }
        }
        yx6 yx62 = this.k;
        int size2 = yx62.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mm7) yx62.get(i3)).p();
        }
    }

    public final void q(Object obj) {
        ed5 ed5 = this.d;
        if (!sg3.e(ed5.getValue(), obj)) {
            this.f.setValue(new hm7(ed5.getValue(), obj));
            in8 in8 = this.a;
            if (!sg3.e(in8.H0(), ed5.getValue())) {
                in8.O0(ed5.getValue());
            }
            ed5.setValue(obj);
            if (this.h.d() == Long.MIN_VALUE) {
                this.i.setValue(Boolean.TRUE);
            }
            yx6 yx6 = this.j;
            int size = yx6.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((im7) yx6.get(i2)).D.e(-2.0f);
            }
        }
    }

    public final String toString() {
        yx6 yx6 = this.j;
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < yx6.size(); i2++) {
            str = str + ((im7) yx6.get(i2)) + ", ";
        }
        return str;
    }
}

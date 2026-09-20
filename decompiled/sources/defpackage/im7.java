package defpackage;

/* renamed from: im7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class im7 implements a37 {
    public hi6 A;
    public ub7 B;
    public final ed5 C = u55.p(Boolean.TRUE);
    public final ad5 D = new ad5(-1.0f);
    public boolean E;
    public final ed5 F;
    public ol G;
    public final cd5 H;
    public boolean I;
    public final x17 J;
    public final /* synthetic */ mm7 K;
    public final lo7 w;
    public final ed5 x;
    public final ed5 y;
    public final ed5 z;

    public im7(mm7 mm7, Object obj, ol olVar, lo7 lo7) {
        this.K = mm7;
        this.w = lo7;
        ed5 p = u55.p(obj);
        this.x = p;
        Object obj2 = null;
        ed5 p2 = u55.p(kl8.M(0.0f, 0.0f, (Object) null, 7));
        this.y = p2;
        Object obj3 = obj;
        ol olVar2 = olVar;
        lo7 lo72 = lo7;
        this.z = u55.p(new ub7((je2) p2.getValue(), lo72, obj3, p.getValue(), olVar2));
        this.F = u55.p(obj3);
        this.G = olVar2;
        this.H = new cd5(b().b());
        Float f = (Float) l78.a.get(lo72);
        if (f != null) {
            float floatValue = f.floatValue();
            ol olVar3 = (ol) lo72.a.y(obj3);
            int b = olVar3.b();
            for (int i = 0; i < b; i++) {
                olVar3.e(i, floatValue);
            }
            obj2 = this.w.b.y(olVar3);
        }
        this.J = kl8.M(0.0f, 0.0f, obj2, 3);
    }

    public final ub7 b() {
        return (ub7) this.z.getValue();
    }

    public final void c(long j) {
        if (this.D.d() == -1.0f) {
            this.I = true;
            if (sg3.e(b().c, b().d)) {
                d(b().c);
                return;
            }
            d(b().f(j));
            this.G = b().d(j);
        }
    }

    public final void d(Object obj) {
        this.F.setValue(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: je2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: je2} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void e(Object obj, boolean z2) {
        Object obj2;
        je2 je2;
        ub7 ub7 = this.B;
        if (ub7 != null) {
            obj2 = ub7.c;
        } else {
            obj2 = null;
        }
        ed5 ed5 = this.x;
        boolean e = sg3.e(obj2, ed5.getValue());
        cd5 cd5 = this.H;
        ed5 ed52 = this.z;
        je2 je22 = this.J;
        if (e) {
            ed52.setValue(new ub7(je22, this.w, obj, obj, this.G.c()));
            this.E = true;
            cd5.e(b().b());
            return;
        }
        ed5 ed53 = this.y;
        if (!z2 || this.I) {
            je22 = ed53.getValue();
        } else if (((je2) ed53.getValue()) instanceof x17) {
            je22 = ed53.getValue();
        }
        mm7 mm7 = this.K;
        long e2 = mm7.e();
        ed5 ed54 = mm7.i;
        if (e2 <= 0) {
            je2 = je22;
        } else {
            je2 = new s27(je22, mm7.e());
        }
        ed52.setValue(new ub7(je2, this.w, obj, ed5.getValue(), this.G));
        cd5.e(b().b());
        this.E = false;
        ed54.setValue(Boolean.TRUE);
        if (mm7.h()) {
            yx6 yx6 = mm7.j;
            int size = yx6.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                im7 im7 = (im7) yx6.get(i);
                j = Math.max(j, im7.H.d());
                im7.c(0);
            }
            ed54.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, je2 je2) {
        this.x.setValue(obj2);
        this.y.setValue(je2);
        if (!sg3.e(b().d, obj) || !sg3.e(b().c, obj2)) {
            e(obj, false);
        }
    }

    public final void g(Object obj, je2 je2, Object obj2, ol olVar) {
        Object obj3;
        Object obj4;
        if (this.E) {
            ub7 ub7 = this.B;
            if (ub7 != null) {
                obj4 = ub7.c;
            } else {
                obj4 = null;
            }
            if (sg3.e(obj, obj4)) {
                return;
            }
        }
        ed5 ed5 = this.x;
        boolean e = sg3.e(ed5.getValue(), obj);
        ad5 ad5 = this.D;
        if (!e || ad5.d() != -1.0f || (obj2 != null && !obj2.equals(b().d))) {
            ed5.setValue(obj);
            this.y.setValue(je2);
            if (obj2 != null) {
                obj3 = obj2;
            } else if (ad5.d() == -3.0f) {
                obj3 = obj;
            } else {
                obj3 = this.F.getValue();
            }
            if (obj2 != null) {
                d(obj3);
                if (olVar != null) {
                    this.G = olVar;
                }
            }
            ed5 ed52 = this.C;
            boolean z2 = true;
            e(obj3, !((Boolean) ed52.getValue()).booleanValue());
            if (ad5.d() != -3.0f) {
                z2 = false;
            }
            ed52.setValue(Boolean.valueOf(z2));
            if (ad5.d() >= 0.0f) {
                d(b().f((long) (ad5.d() * ((float) b().b()))));
            } else if (ad5.d() == -3.0f) {
                d(obj);
            }
            this.E = false;
            ad5.e(-1.0f);
        }
    }

    public final Object getValue() {
        return this.F.getValue();
    }

    public final String toString() {
        Object value = this.F.getValue();
        Object value2 = this.x.getValue();
        return "current value: " + value + ", target: " + value2 + ", spec: " + ((je2) this.y.getValue());
    }
}

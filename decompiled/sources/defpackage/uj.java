package defpackage;

/* renamed from: uj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uj {
    public final lo7 a;
    public final Object b;
    public final il c;
    public final ed5 d;
    public final ed5 e;
    public final nq4 f;
    public final ol g;
    public final ol h;
    public final ol i;
    public final ol j;

    public uj(Object obj, lo7 lo7, Object obj2) {
        ol olVar;
        ol olVar2;
        this.a = lo7;
        this.b = obj2;
        il ilVar = new il(lo7, obj, (ol) null, 60);
        this.c = ilVar;
        this.d = u55.p(Boolean.FALSE);
        this.e = u55.p(obj);
        this.f = new nq4();
        new x17(obj2);
        ol olVar3 = ilVar.y;
        boolean z = olVar3 instanceof kl;
        if (z) {
            olVar = ed1.A;
        } else if (olVar3 instanceof ll) {
            olVar = ed1.B;
        } else if (olVar3 instanceof ml) {
            olVar = ed1.C;
        } else {
            olVar = ed1.D;
        }
        this.g = olVar;
        if (z) {
            olVar2 = ed1.w;
        } else if (olVar3 instanceof ll) {
            olVar2 = ed1.x;
        } else if (olVar3 instanceof ml) {
            olVar2 = ed1.y;
        } else {
            olVar2 = ed1.z;
        }
        this.h = olVar2;
        this.i = olVar;
        this.j = olVar2;
    }

    public static final Object a(uj ujVar, Object obj) {
        lo7 lo7 = ujVar.a;
        ol olVar = ujVar.j;
        ol olVar2 = ujVar.i;
        if (!sg3.e(olVar2, ujVar.g) || !sg3.e(olVar, ujVar.h)) {
            ol olVar3 = (ol) lo7.a.y(obj);
            int b2 = olVar3.b();
            boolean z = false;
            for (int i2 = 0; i2 < b2; i2++) {
                if (olVar3.a(i2) < olVar2.a(i2) || olVar3.a(i2) > olVar.a(i2)) {
                    olVar3.e(i2, z65.o(olVar3.a(i2), olVar2.a(i2), olVar.a(i2)));
                    z = true;
                }
            }
            if (z) {
                return lo7.b.y(olVar3);
            }
        }
        return obj;
    }

    public static final void b(uj ujVar) {
        il ilVar = ujVar.c;
        ilVar.y.d();
        ilVar.z = Long.MIN_VALUE;
        ujVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(uj ujVar, Object obj, hl hlVar, Float f2, vr2 vr2, f61 f61, int i2) {
        Object obj2;
        vr2 vr22;
        if ((i2 & 4) != 0) {
            obj2 = ujVar.a.b.y(ujVar.c.y);
        } else {
            obj2 = f2;
        }
        if ((i2 & 8) != 0) {
            vr22 = null;
        } else {
            vr22 = vr2;
        }
        Object d2 = ujVar.d();
        lo7 lo7 = ujVar.a;
        return nq4.a(ujVar.f, new rj(ujVar, obj2, new ub7(hlVar, lo7, d2, obj, (ol) lo7.a.y(obj2)), ujVar.c.z, vr22, (f61) null), f61);
    }

    public final Object d() {
        return this.c.x.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(f61 f61, Object obj) {
        Object a2 = nq4.a(this.f, new sj(this, obj, (f61) null), f61);
        if (a2 == p81.w) {
            return a2;
        }
        return vs7.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(Object obj, lo7 lo7, Object obj2, int i2) {
        this(obj, lo7, (i2 & 4) != 0 ? null : obj2);
    }
}

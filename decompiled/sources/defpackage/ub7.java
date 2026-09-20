package defpackage;

/* renamed from: ub7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ub7 implements zk {
    public final m38 a;
    public final lo7 b;
    public Object c;
    public Object d;
    public ol e;
    public ol f;
    public final ol g;
    public long h;
    public ol i;

    public ub7(hl hlVar, lo7 lo7, Object obj, Object obj2, ol olVar) {
        ol olVar2;
        this.a = hlVar.a(lo7);
        this.b = lo7;
        this.c = obj2;
        this.d = obj;
        this.e = (ol) lo7.a.y(obj);
        vr2 vr2 = lo7.a;
        this.f = (ol) vr2.y(obj2);
        if (olVar != null) {
            olVar2 = tf4.m(olVar);
        } else {
            olVar2 = ((ol) vr2.y(obj)).c();
        }
        this.g = olVar2;
        this.h = -1;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final long b() {
        if (this.h < 0) {
            this.h = this.a.d(this.e, this.f, this.g);
        }
        return this.h;
    }

    public final lo7 c() {
        return this.b;
    }

    public final ol d(long j) {
        if (!e(j)) {
            return this.a.j(j, this.e, this.f, this.g);
        }
        ol olVar = this.i;
        if (olVar != null) {
            return olVar;
        }
        ol u = this.a.u(this.e, this.f, this.g);
        this.i = u;
        return u;
    }

    public final Object f(long j) {
        if (e(j)) {
            return this.c;
        }
        long j2 = j;
        ol t = this.a.t(j2, this.e, this.f, this.g);
        int b2 = t.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (Float.isNaN(t.a(i2))) {
                xm5.b("AnimationVector cannot contain a NaN. " + t + ". Animation: " + this + ", playTimeNanos: " + j2);
            }
        }
        return this.b.b.y(t);
    }

    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (!sg3.e(obj, this.d)) {
            this.d = obj;
            this.e = (ol) this.b.a.y(obj);
            this.i = null;
            this.h = -1;
        }
    }

    public final void i(Object obj) {
        if (!sg3.e(this.c, obj)) {
            this.c = obj;
            this.f = (ol) this.b.a.y(obj);
            this.i = null;
            this.h = -1;
        }
    }

    public final String toString() {
        Object obj = this.d;
        Object obj2 = this.c;
        return "TargetBasedAnimation: " + obj + " -> " + obj2 + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}

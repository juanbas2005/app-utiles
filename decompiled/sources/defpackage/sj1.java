package defpackage;

/* renamed from: sj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sj1 implements zk {
    public final q38 a;
    public final lo7 b;
    public final Object c;
    public final ol d;
    public final ol e;
    public final ol f;
    public final Object g;
    public final long h;

    public sj1(tj1 tj1, lo7 lo7, Object obj, ol olVar) {
        q38 q38 = new q38(tj1.a);
        this.a = q38;
        this.b = lo7;
        this.c = obj;
        ol olVar2 = (ol) lo7.a.y(obj);
        this.d = olVar2;
        this.e = tf4.m(olVar);
        vr2 vr2 = lo7.b;
        if (q38.d == null) {
            q38.d = olVar2.c();
        }
        ol olVar3 = q38.d;
        if (olVar3 != null) {
            int b2 = olVar3.b();
            int i = 0;
            while (true) {
                ol olVar4 = q38.d;
                lh2 lh2 = q38.a;
                if (i < b2) {
                    if (olVar4 != null) {
                        olVar4.e(i, lh2.k0(olVar2.a(i), olVar.a(i)));
                        i++;
                    } else {
                        sg3.a0("targetVector");
                        throw null;
                    }
                } else if (olVar4 != null) {
                    this.g = vr2.y(olVar4);
                    if (q38.c == null) {
                        q38.c = olVar2.c();
                    }
                    ol olVar5 = q38.c;
                    if (olVar5 != null) {
                        int b3 = olVar5.b();
                        long j = 0;
                        for (int i2 = 0; i2 < b3; i2++) {
                            olVar2.getClass();
                            j = Math.max(j, lh2.f0(olVar.a(i2)));
                        }
                        this.h = j;
                        ol m = tf4.m(this.a.a(j, this.d, olVar));
                        this.f = m;
                        int b4 = m.b();
                        for (int i3 = 0; i3 < b4; i3++) {
                            ol olVar6 = this.f;
                            float a2 = olVar6.a(i3);
                            float f2 = this.a.e;
                            olVar6.e(i3, z65.o(a2, -f2, f2));
                        }
                        return;
                    }
                    sg3.a0("velocityVector");
                    throw null;
                } else {
                    sg3.a0("targetVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("targetVector");
            throw null;
        }
    }

    public final boolean a() {
        return false;
    }

    public final long b() {
        return this.h;
    }

    public final lo7 c() {
        return this.b;
    }

    public final ol d(long j) {
        if (e(j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }

    public final Object f(long j) {
        if (e(j)) {
            return this.g;
        }
        vr2 vr2 = this.b.b;
        q38 q38 = this.a;
        ol olVar = q38.b;
        ol olVar2 = this.d;
        if (olVar == null) {
            q38.b = olVar2.c();
        }
        ol olVar3 = q38.b;
        if (olVar3 != null) {
            int b2 = olVar3.b();
            int i = 0;
            while (true) {
                ol olVar4 = q38.b;
                if (i < b2) {
                    if (olVar4 != null) {
                        olVar4.e(i, q38.a.Q(olVar2.a(i), this.e.a(i), j));
                        i++;
                    } else {
                        sg3.a0("valueVector");
                        throw null;
                    }
                } else if (olVar4 != null) {
                    return vr2.y(olVar4);
                } else {
                    sg3.a0("valueVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("valueVector");
            throw null;
        }
    }

    public final Object g() {
        return this.g;
    }
}

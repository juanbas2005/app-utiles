package defpackage;

/* renamed from: nv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nv1 extends bq7 {
    public final bq7 b;
    public final bq7 c;

    public nv1(bq7 bq7, bq7 bq72) {
        this.b = bq7;
        this.c = bq72;
    }

    public final boolean a() {
        if (this.b.a() || this.c.a()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.b.b() || this.c.b()) {
            return true;
        }
        return false;
    }

    public final rm c(rm rmVar) {
        rmVar.getClass();
        return this.c.c(this.b.c(rmVar));
    }

    public final xp7 d(vw3 vw3) {
        xp7 d = this.b.d(vw3);
        if (d == null) {
            return this.c.d(vw3);
        }
        return d;
    }

    public final vw3 f(vw3 vw3, k28 k28) {
        vw3.getClass();
        k28.getClass();
        return this.c.f(this.b.f(vw3, k28), k28);
    }
}

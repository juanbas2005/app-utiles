package defpackage;

/* renamed from: o24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o24 {
    public final Object a;
    public final q24 b;
    public int c = -1;
    public int d;
    public o24 e;
    public boolean f;
    public final ed5 g = u55.p((Object) null);

    public o24(Object obj, q24 q24) {
        this.a = obj;
        this.b = q24;
    }

    public final o24 a() {
        if (this.f) {
            bc3.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.w.add(this);
            o24 o24 = (o24) this.g.getValue();
            if (o24 != null) {
                o24.a();
            } else {
                o24 = null;
            }
            this.e = o24;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                bc3.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                c();
            }
        }
    }

    public final void c() {
        this.b.w.remove((Object) this);
        o24 o24 = this.e;
        if (o24 != null) {
            o24.b();
        }
        this.e = null;
    }
}

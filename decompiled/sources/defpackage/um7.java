package defpackage;

/* renamed from: um7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class um7 extends qm7 {
    public final /* synthetic */ int a;
    public km7 b;

    public /* synthetic */ um7(km7 km7, int i) {
        this.a = i;
        this.b = km7;
    }

    public void a(km7 km7) {
        switch (this.a) {
            case 1:
                vy vyVar = (vy) this.b;
                int i = vyVar.a0 - 1;
                vyVar.a0 = i;
                if (i == 0) {
                    vyVar.b0 = false;
                    vyVar.m();
                }
                km7.z(this);
                return;
            case 2:
                this.b.B();
                km7.z(this);
                return;
            default:
                return;
        }
    }

    public void c(km7 km7) {
        switch (this.a) {
            case 1:
                vy vyVar = (vy) this.b;
                if (!vyVar.b0) {
                    vyVar.J();
                    vyVar.b0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void f(km7 km7) {
        switch (this.a) {
            case b85.b:
                vy vyVar = (vy) this.b;
                vyVar.Y.remove(km7);
                if (!vyVar.s()) {
                    vyVar.w(vyVar, kj6.z, false);
                    vyVar.N = true;
                    vyVar.w(vyVar, kj6.y, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ um7() {
        this.a = 1;
    }
}

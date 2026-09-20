package defpackage;

/* renamed from: rj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rj7 extends f68 {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public rj7(d68 d68) {
        this.d = d68;
        this.b = false;
        this.c = 0;
    }

    public void a() {
        switch (this.a) {
            case b85.b:
                this.b = true;
                return;
            default:
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                ((sj7) obj).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    e68 e68 = ((d68) obj).d;
                    if (e68 != null) {
                        e68.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                if (!this.b) {
                    ((sj7) obj).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                d68 d68 = (d68) obj;
                if (i2 == d68.a.size()) {
                    e68 e68 = d68.d;
                    if (e68 != null) {
                        e68.c();
                    }
                    this.c = 0;
                    this.b = false;
                    d68.e = false;
                    return;
                }
                return;
        }
    }

    public rj7(sj7 sj7, int i) {
        this.d = sj7;
        this.c = i;
        this.b = false;
    }
}

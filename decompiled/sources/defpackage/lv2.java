package defpackage;

/* renamed from: lv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lv2 implements l37 {
    public final i18 a;
    public final xb7 b;

    public lv2(i18 i18, xb7 xb7) {
        this.a = i18;
        this.b = xb7;
    }

    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    public final boolean b(g10 g10) {
        if (g10.b == 4 && !this.a.a(g10)) {
            String str = g10.c;
            if (str != null) {
                this.b.b(new x00(str, g10.e, g10.f));
                return true;
            }
            ku4.j("Null token");
        }
        return false;
    }
}

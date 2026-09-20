package defpackage;

/* renamed from: vk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vk3 extends pd8 {
    public final /* synthetic */ xk3 E;

    public vk3(xk3 xk3) {
        this.E = xk3;
    }

    public final void h(ab6 ab6, Object obj) {
        al3 al3 = (al3) obj;
        ab6.getClass();
        al3.getClass();
        ab6.F(1, al3.a);
        ab6.F(2, al3.b);
        ab6.K(al3.c);
        ab6.F(4, al3.d);
        ab6.f(al3.e, 5);
        ab6.f(al3.f, 6);
        ab6.f(al3.g ? 1 : 0, 7);
        ab6.f(al3.h ? 1 : 0, 8);
        ab6.F(9, xk3.b(this.E, al3.i));
    }

    public final String n() {
        return "INSERT INTO `jetpacks` (`id`,`name`,`price`,`userId`,`lastUpdated`,`lastSynced`,`needsSync`,`deleted`,`syncAction`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}

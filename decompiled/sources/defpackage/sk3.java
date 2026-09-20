package defpackage;

import cu.lestebang.utiletecsa.feature.ayuda.navigation.Ayuda;
import cu.lestebang.utiletecsa.feature.forum.navigation.Forum;
import cu.lestebang.utiletecsa.feature.home.navigation.HomeNavGraph;
import cu.lestebang.utiletecsa.feature.infoutil.navigation.InfoUtil;
import cu.lestebang.utiletecsa.feature.nauta.navigation.Nauta;
import cu.lestebang.utiletecsa.feature.planes.navigation.Planes;
import cu.lestebang.utiletecsa.feature.profile.navigation.Profile;
import cu.lestebang.utiletecsa.feature.red.navigation.Red;
import cu.lestebang.utiletecsa.feature.registro.navigation.RegistroNavGraph;
import cu.lestebang.utiletecsa.feature.servicios.navigation.Servicios;
import cu.lestebang.utiletecsa.feature.sms.navigation.Sms;

/* renamed from: sk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk3 {
    public final String a;
    public final iu4 b;
    public final ed5 c = u55.p((Object) null);
    public final xw5 d;
    public final w52 e;
    public final xw5 f;

    public sk3(String str, iu4 iu4, cc8 cc8, f91 f91, o81 o81, az4 az4) {
        iu4.getClass();
        f91.getClass();
        o81.getClass();
        az4.getClass();
        this.a = str;
        this.b = iu4;
        this.d = kl8.N(new ze1(2, gr8.w(new ju1(az4, (f61) null, 28))), Boolean.FALSE, o81);
        this.e = lk7.F;
        this.f = gr8.t(e37.a(g42.w));
    }

    public final qt4 a(yt2 yt2) {
        qt4 qt4;
        zs4 zs4 = (zs4) u55.e(new vw5(this.b.b.z), (Object) null, (e81) null, yt2, 48, 2).getValue();
        if (zs4 != null) {
            qt4 = zs4.x;
        } else {
            qt4 = null;
        }
        ed5 ed5 = this.c;
        if (qt4 != null) {
            ed5.setValue(qt4);
        }
        if (qt4 == null) {
            return (qt4) ed5.getValue();
        }
        return qt4;
    }

    public final lk7 b(int i, yt2 yt2) {
        Object obj;
        yt2.e0(-306244188);
        w52 w52 = lk7.F;
        w52.getClass();
        e2 e2Var = new e2(0, w52);
        while (true) {
            if (!e2Var.hasNext()) {
                obj = null;
                break;
            }
            obj = e2Var.next();
            lk7 lk7 = (lk7) obj;
            qt4 a2 = a(yt2);
            if (a2 != null) {
                int i2 = qt4.A;
                gq3 gq3 = lk7.A;
                gq3.getClass();
                if (b35.m(i95.D(gq3)) == a2.x.a) {
                    break;
                }
            }
        }
        lk7 lk72 = (lk7) obj;
        yt2.r(false);
        return lk72;
    }

    public final void c(lk7 lk7) {
        lk7.getClass();
        wu4 G = uq3.G(new h43(6, this));
        int ordinal = lk7.ordinal();
        iu4 iu4 = this.b;
        switch (ordinal) {
            case b85.b:
                iu4.getClass();
                iu4.b(iu4, HomeNavGraph.INSTANCE, G);
                return;
            case 1:
                iu4.getClass();
                iu4.b(iu4, Planes.INSTANCE, G);
                return;
            case 2:
                iu4.getClass();
                iu4.b(iu4, Nauta.INSTANCE, G);
                return;
            case 3:
                iu4.getClass();
                iu4.b(iu4, InfoUtil.INSTANCE, G);
                return;
            case 4:
                iu4.getClass();
                iu4.b(iu4, Red.INSTANCE, G);
                return;
            case 5:
                iu4.getClass();
                iu4.b(iu4, Servicios.INSTANCE, G);
                return;
            case 6:
                iu4.getClass();
                iu4.b(iu4, RegistroNavGraph.INSTANCE, G);
                return;
            case 7:
                iu4.getClass();
                iu4.b(iu4, Sms.INSTANCE, G);
                return;
            case 8:
                iu4.getClass();
                iu4.b(iu4, Ayuda.INSTANCE, G);
                return;
            case 9:
                iu4.getClass();
                iu4.b(iu4, Forum.INSTANCE, G);
                return;
            case 10:
                iu4.getClass();
                iu4.b(iu4, Profile.INSTANCE, G);
                return;
            default:
                h.c();
                return;
        }
    }
}

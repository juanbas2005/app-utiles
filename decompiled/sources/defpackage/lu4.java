package defpackage;

import cu.lestebang.utiletecsa.feature.ayuda.navigation.Ayuda;
import cu.lestebang.utiletecsa.feature.forum.navigation.Forum;
import cu.lestebang.utiletecsa.feature.home.navigation.Dialer;
import cu.lestebang.utiletecsa.feature.home.navigation.Home;
import cu.lestebang.utiletecsa.feature.home.navigation.HomeNavGraph;
import cu.lestebang.utiletecsa.feature.home.navigation.Item;
import cu.lestebang.utiletecsa.feature.home.navigation.Pamarillas;
import cu.lestebang.utiletecsa.feature.home.navigation.Vpn;
import cu.lestebang.utiletecsa.feature.infoutil.navigation.InfoUtil;
import cu.lestebang.utiletecsa.feature.nauta.navigation.Nauta;
import cu.lestebang.utiletecsa.feature.planes.navigation.Planes;
import cu.lestebang.utiletecsa.feature.profile.navigation.Profile;
import cu.lestebang.utiletecsa.feature.red.navigation.Red;
import cu.lestebang.utiletecsa.feature.registro.navigation.ContactDetail;
import cu.lestebang.utiletecsa.feature.registro.navigation.Registro;
import cu.lestebang.utiletecsa.feature.registro.navigation.RegistroNavGraph;
import cu.lestebang.utiletecsa.feature.servicios.navigation.Servicios;
import cu.lestebang.utiletecsa.feature.sms.navigation.Sms;
import java.util.ArrayList;

/* renamed from: lu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lu4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ iu4 x;
    public final /* synthetic */ is2 y;

    public /* synthetic */ lu4(iu4 iu4, is2 is2) {
        this.w = 1;
        this.x = iu4;
        this.y = is2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        is2 is2 = this.y;
        switch (i) {
            case b85.b:
                fu4 fu4 = (fu4) obj;
                fu4.getClass();
                is2.getClass();
                fw0 fw0 = new fw0(-176060242, new j20(is2, 0), true);
                c26 c26 = b26.a;
                h03.g(fu4, c26.b(Ayuda.class), fw0);
                h03.g(fu4, c26.b(Forum.class), new fw0(-1846307687, new j20(is2, 1), true));
                iu4 iu4 = this.x;
                lu4 lu4 = new lu4(iu4, is2);
                Home home = Home.INSTANCE;
                gq3 b = c26.b(HomeNavGraph.class);
                home.getClass();
                ox4 ox4 = fu4.g;
                fu4 fu42 = new fu4(ox4, (Object) home, b);
                lu4.y(fu42);
                ArrayList arrayList = fu4.j;
                arrayList.add(fu42.a());
                h03.g(fu4, c26.b(InfoUtil.class), new fw0(-1935532326, new j20(is2, 2), true));
                h03.g(fu4, c26.b(Nauta.class), new fw0(-43506033, new j20(is2, 3), true));
                h03.g(fu4, c26.b(Planes.class), new fw0(914309107, new j20(is2, 4), true));
                h03.g(fu4, c26.b(Red.class), new fw0(623176777, new j20(is2, 6), true));
                lu4 lu42 = new lu4(is2, iu4, 2);
                Registro registro = Registro.INSTANCE;
                gq3 b2 = c26.b(RegistroNavGraph.class);
                registro.getClass();
                fu4 fu43 = new fu4(ox4, (Object) registro, b2);
                lu42.y(fu43);
                arrayList.add(fu43.a());
                h03.g(fu4, c26.b(Servicios.class), new fw0(149004901, new j20(is2, 7), true));
                h03.g(fu4, c26.b(Sms.class), new fw0(1402058993, new j20(is2, 8), true));
                h03.g(fu4, c26.b(Profile.class), new fw0(-1179582975, new j20(is2, 5), true));
                return vs7;
            case 1:
                fu4 fu44 = (fu4) obj;
                fu44.getClass();
                iu4 iu42 = this.x;
                yg ygVar = new yg(21, iu42);
                yd ydVar = new yd(0, iu42, h03.class, "navigateToVpn", "navigateToVpn(Landroidx/navigation/NavController;)V", 1, 0, 22);
                yd ydVar2 = new yd(0, iu42, h03.class, "navigateToPamarillas", "navigateToPamarillas(Landroidx/navigation/NavController;)V", 1, 0, 23);
                is2.getClass();
                fw0 fw02 = new fw0(1693842501, new g03(ygVar, ydVar, ydVar2, is2), true);
                c26 c262 = b26.a;
                h03.g(fu44, c262.b(Home.class), fw02);
                h03.g(fu44, c262.b(Vpn.class), new fw0(318723636, new n13(3, new ru4(0, iu42, iu4.class, "popBackStack", "popBackStack()Z", 8, 0), is2), true));
                h03.g(fu44, c262.b(Pamarillas.class), new fw0(-654435664, new n13(2, new ru4(0, iu42, iu4.class, "popBackStack", "popBackStack()Z", 8, 1), is2), true));
                h03.g(fu44, c262.b(Item.class), new fw0(-351490453, new n13(1, new ru4(0, iu42, iu4.class, "popBackStack", "popBackStack()Z", 8, 2), is2), true));
                h03.g(fu44, c262.b(Dialer.class), new fw0(730424289, new n13(4, new ru4(0, iu42, iu4.class, "popBackStack", "popBackStack()Z", 8, 3), is2), true));
                return vs7;
            default:
                fu4 fu45 = (fu4) obj;
                fu45.getClass();
                iu4 iu43 = this.x;
                xa7 xa7 = new xa7(8, (Object) iu43);
                is2.getClass();
                fw0 fw03 = new fw0(-1344467160, new n13(5, xa7, is2), true);
                c26 c263 = b26.a;
                h03.g(fu45, c263.b(Registro.class), fw03);
                h03.g(fu45, c263.b(ContactDetail.class), new fw0(883355127, new n13(6, new ru4(0, iu43, iu4.class, "popBackStack", "popBackStack()Z", 8, 4), is2), true));
                return vs7;
        }
    }

    public /* synthetic */ lu4(is2 is2, iu4 iu4, int i) {
        this.w = i;
        this.y = is2;
        this.x = iu4;
    }
}

package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.speech.tts.TextToSpeech;
import cu.lestebang.utiletecsa.core.room.data.JetpackDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ud1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ud1 implements lu5 {
    public final vd1 a;
    public final int b;

    public ud1(vd1 vd1, int i) {
        this.a = vd1;
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r15v12, types: [f53, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v54, types: [android.speech.tts.TextToSpeech$OnInitListener, java.lang.Object, n78] */
    /* JADX WARNING: type inference failed for: r1v39, types: [e45, java.lang.Object] */
    public final Object get() {
        vd1 vd1 = this.a;
        int i = this.b;
        switch (i) {
            case b85.b:
                d45 d45 = (d45) vd1.d.get();
                Context context = vd1.a.a;
                d45.getClass();
                o9 o9Var = new o9(context);
                o9Var.z = new rb3(d45);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new Object());
                o9Var.A = new zv0(tf4.P(arrayList), tf4.P(arrayList2), tf4.P(arrayList3), tf4.P(arrayList4), tf4.P(arrayList5));
                p83 p83 = (p83) o9Var.B;
                o9Var.B = new p83(p83.a, p83.b, false, p83.d, p83.e);
                return o9Var.k();
            case 1:
                f53 f53 = (f53) vd1.c.get();
                f53.getClass();
                c45 c45 = new c45();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c45.a(60, timeUnit);
                c45.y = fg8.b(60, timeUnit);
                c45.z = fg8.b(60, timeUnit);
                c45.c.add(f53);
                return new d45(c45);
            case 2:
                new rf2(12);
                ? obj = new Object();
                obj.a = e53.w;
                return obj;
            case 3:
                return new yq(vd1.a.a);
            case 4:
                return new f98(vd1.a.a, (k40) vd1.s.get(), zv1.a());
            case 5:
                return new c50((cz7) vd1.g.get(), (nz7) vd1.m.get(), (qz7) vd1.o.get(), (ol7) vd1.q.get(), (dv7) vd1.l.get(), (n78) vd1.r.get(), zv1.a());
            case 6:
                return new cz7(vd1.a.a);
            case 7:
                return new nz7((zy7) vd1.j.get(), (dv7) vd1.l.get(), zv1.a());
            case 8:
                return new zy7((xy7) vd1.i.get(), zv1.a());
            case 9:
                JetpackDatabase jetpackDatabase = (JetpackDatabase) vd1.h.get();
                jetpackDatabase.getClass();
                xy7 u = jetpackDatabase.u();
                i75.c(u);
                return u;
            case 10:
                y86 g = fb5.g(vd1.a.a, JetpackDatabase.class, "cu.lestebang.utiletecsa.jetpack.room");
                g.p = false;
                g.q = true;
                g.r = true;
                return (JetpackDatabase) g.b();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return new dy7((qe1) vd1.k.get(), zv1.a());
            case 12:
                Context context2 = vd1.a.a;
                h81 a2 = zv1.a();
                yu7 yu7 = yu7.w;
                ig0 E = gl0.E(rc9.D0(a2, b85.d()));
                n20 n20 = new n20(context2, 6);
                a42 a42 = a42.w;
                return new jf1(new gd2(yu7, new f81(29), n20), sg3.D(new n0(a42, (f61) null, 26)), new s63(4), E);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new qz7((oz7) vd1.n.get(), zv1.a());
            case 14:
                JetpackDatabase jetpackDatabase2 = (JetpackDatabase) vd1.h.get();
                jetpackDatabase2.getClass();
                oz7 v = jetpackDatabase2.v();
                i75.c(v);
                return v;
            case h75.g:
                return new ol7((ml7) vd1.p.get());
            case 16:
                JetpackDatabase jetpackDatabase3 = (JetpackDatabase) vd1.h.get();
                jetpackDatabase3.getClass();
                ml7 t = jetpackDatabase3.t();
                i75.c(t);
                return t;
            case 17:
                Context context3 = vd1.a.a;
                ? obj2 = new Object();
                obj2.a = new TextToSpeech(context3, obj2);
                return obj2;
            case 18:
                return new rz6(vd1.a.a, (vp6) vd1.x.get(), zv1.a());
            case 19:
                return new vp6((pz4) vd1.u.get(), (dv7) vd1.l.get(), (kh5) vd1.v.get(), (my7) vd1.w.get());
            case 20:
                return new Object();
            case 21:
                return new kh5(vd1.a.a);
            case 22:
                return new my7(vd1.a.a, (dv7) vd1.l.get(), zv1.a());
            case 23:
                return new td1(this, 0);
            case 24:
                return new td1(this, 1);
            case 25:
                return new gs4((dv7) vd1.l.get(), (hr4) vd1.B.get(), vd1.a.a, zv1.a());
            case 26:
                return new hr4((fr4) vd1.A.get());
            case 27:
                JetpackDatabase jetpackDatabase4 = (JetpackDatabase) vd1.h.get();
                jetpackDatabase4.getClass();
                fr4 s = jetpackDatabase4.s();
                i75.c(s);
                return s;
            case 28:
                return new td1(this, 2);
            case 29:
                return new td1(this, 3);
            case 30:
                return new n03((p94) vd1.G.get(), (dv7) vd1.l.get(), (t97) vd1.H.get());
            case 31:
                return new p94((xk3) vd1.F.get(), zv1.a());
            case 32:
                JetpackDatabase jetpackDatabase5 = (JetpackDatabase) vd1.h.get();
                jetpackDatabase5.getClass();
                xk3 r = jetpackDatabase5.r();
                i75.c(r);
                return r;
            case 33:
                return new t97(vd1.a.a);
            case 34:
                return new td1(this, 4);
            case 35:
                return new v78(vd1.a.a, zv1.a());
            case 36:
                return new az4((ConnectivityManager) vd1.M.get());
            case 37:
                Object systemService = vd1.a.a.getSystemService("connectivity");
                systemService.getClass();
                return (ConnectivityManager) systemService;
            case 38:
                return new Object();
            case 39:
                return new Object();
            case 40:
                return new p7((j77) vd1.Q.get(), (mb1) vd1.R.get(), (dv7) vd1.l.get(), zv1.a());
            case 41:
                cy6 cy6 = new cy6();
                ? obj3 = new Object();
                obj3.a = new ot4(18);
                obj3.b = 10;
                cy6.c = new h45(obj3);
                xb4 xb4 = u02.x;
                cy6.b = gl0.e0(45, y02.SECONDS);
                cy6.d(cy6, uu.a);
                cy6.d(cy6, pe2.K);
                cy6.d(cy6, td0.N);
                return new m77(new l77((String) dt0.G0(d57.W0("https://jbkhreemmiagdyfssfep.supabase.co", new String[]{"//"}, 6)), new o77((ub4) cy6.d, (nf6) cy6.e), new p77(cy6.a, (h45) cy6.c, (ArrayList) cy6.i, cy6.b), (f96) cy6.f, (cm1) cy6.g, (LinkedHashMap) cy6.j, (m25) cy6.h));
            case 42:
                er erVar = vd1.a;
                return new Object();
            case 43:
                return new gc2((j77) vd1.Q.get(), (dv7) vd1.l.get(), vd1.a.a, zv1.a());
            case 44:
                return new lo2((j77) vd1.Q.get(), zv1.a());
            case 45:
                return new yq5(zv1.a());
            case 46:
                return new s77((j77) vd1.Q.get(), zv1.a());
            case 47:
                return new kr4(vd1.a.a);
            case h75.h:
                return new dc5(zv1.a());
            case 49:
                return new ni5((nz7) vd1.m.get(), (dv7) vd1.l.get(), zv1.a());
            case 50:
                return new my4((pm0) vd1.a0.get());
            case 51:
                return new pm0(vd1.a.a, zv1.a());
            case 52:
                return new d07(zv1.a());
            case 53:
                ((pz4) vd1.u.get()).getClass();
                ((dv7) vd1.l.get()).getClass();
                return new Object();
            case 54:
                return new d17((j77) vd1.Q.get(), (dv7) vd1.l.get(), zv1.a());
            default:
                throw new AssertionError(i);
        }
    }
}

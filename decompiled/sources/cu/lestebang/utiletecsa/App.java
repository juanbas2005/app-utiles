package cu.lestebang.utiletecsa;

import android.app.Application;
import android.net.NetworkRequest;
import cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/App;", "Landroid/app/Application;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class App extends Application implements nu2 {
    public f98 A;
    public rz6 B;
    public my7 C;
    public boolean w = false;
    public final dr x = new dr(new wv2(21, this));
    public cx1 y;
    public yq z;

    public final Object a() {
        return this.x.a();
    }

    public final void b() {
        cx1 cx1;
        if (!this.w) {
            this.w = true;
            vd1 vd1 = (vd1) ((br) this.x.a());
            lu5 lu5 = vd1.e;
            if (lu5 instanceof cx1) {
                cx1 = (cx1) lu5;
            } else {
                lu5.getClass();
                cx1 = new cx1(lu5);
            }
            this.y = cx1;
            this.z = (yq) vd1.f.get();
            this.A = (f98) vd1.t.get();
            this.B = (rz6) vd1.y.get();
            this.C = (my7) vd1.w.get();
        }
        super.onCreate();
    }

    public final void onCreate() {
        b();
        sg3.p(this, "FcmNotificationChannel", R.string.fcm_channel_name, R.string.fcm_channel_description, 3);
        yq yqVar = this.z;
        if (yqVar != null) {
            yh7.a.getClass();
            hr2.m(new Object[0]);
            nd8 c = nd8.c(yqVar.a);
            r55 r55 = new r55(24);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ((be8) r55.c).j = new j31(new ny4((NetworkRequest) null), yy4.x, false, false, false, false, -1, -1, dt0.g1(linkedHashSet));
            ((be8) r55.c).e = we.i(b26.a.b(AppUpdateWorker.class));
            c.a("cu.lestebang.utiletecsa.sync.worker.appupdate", (tf5) r55.a());
            f98 f98 = this.A;
            if (f98 != null) {
                c50 c50 = (c50) f98.b;
                qi2 qi2 = new qi2(gr8.F(c50.d()), new e98(f98, (f61) null, 0), 2);
                ig0 ig0 = f98.c;
                gr8.Q(qi2, ig0);
                gr8.Q(new qi2(gr8.F(c50.c()), new e98(f98, (f61) null, 1), 2), ig0);
                gr8.Q(new qi2(gr8.F(c50.b(xz7.a, "datos", "")), new e98(f98, (f61) null, 2), 2), ig0);
                gr8.Q(new qi2(gr8.F(c50.b(vz7.a, "voz", "00:00:00")), new e98(f98, (f61) null, 3), 2), ig0);
                gr8.Q(new qi2(gr8.F(c50.b(uz7.a, "voz", "--")), new e98(f98, (f61) null, 4), 2), ig0);
                gr8.Q(new qi2(gr8.F(c50.b(tz7.a, "sms", "--")), new e98(f98, (f61) null, 5), 2), ig0);
                rz6 rz6 = this.B;
                if (rz6 != null) {
                    gr8.Q(new qi2(gr8.F(new ze1(5, rz6.b.a())), new h70(rz6, (f61) null, 1), 2), rz6.c);
                    my7 my7 = this.C;
                    if (my7 != null) {
                        ar7.H(my7.c, (e81) null, (r81) null, new gw6(my7, (f61) null, 10), 3);
                    } else {
                        sg3.a0("ussdAutoUpdaterController");
                        throw null;
                    }
                } else {
                    sg3.a0("speedOverlayAutoMonitor");
                    throw null;
                }
            } else {
                sg3.a0("widgetDataSync");
                throw null;
            }
        } else {
            sg3.a0("appUpdateScheduler");
            throw null;
        }
    }
}

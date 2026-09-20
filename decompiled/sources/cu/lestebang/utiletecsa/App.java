package cu.lestebang.utiletecsa;

import android.app.Application;
import cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker;
import java.util.LinkedHashSet;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/App;", "Landroid/app/Application;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class App extends Application implements nu2 {
    public f98 A;
    public rz6 B;
    public my7 C;
    public boolean w = false;
    public final dr x = new dr(new wv2(21, this));
    public cx1 y;
    public yq z;

    @Override // defpackage.nu2
    public final Object a() {
        return this.x.a();
    }

    public final void b() {
        cx1 cx1Var;
        if (!this.w) {
            this.w = true;
            vd1 vd1Var = (vd1) ((br) this.x.a());
            lu5 lu5Var = vd1Var.e;
            if (lu5Var instanceof cx1) {
                cx1Var = (cx1) lu5Var;
            } else {
                lu5Var.getClass();
                cx1Var = new cx1(lu5Var);
            }
            this.y = cx1Var;
            this.z = (yq) vd1Var.f.get();
            this.A = (f98) vd1Var.t.get();
            this.B = (rz6) vd1Var.y.get();
            this.C = (my7) vd1Var.w.get();
        }
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onCreate() {
        b();
        sg3.p(this, "FcmNotificationChannel", R.string.fcm_channel_name, R.string.fcm_channel_description, 3);
        yq yqVar = this.z;
        if (yqVar != null) {
            yh7.a.getClass();
            hr2.m(new Object[0]);
            nd8 c = nd8.c(yqVar.a);
            r55 r55Var = new r55(24L);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ((be8) r55Var.c).j = new j31(new ny4(null), yy4.x, false, false, false, false, -1L, -1L, dt0.g1(linkedHashSet));
            ((be8) r55Var.c).e = we.i(b26.a.b(AppUpdateWorker.class));
            c.a("cu.lestebang.utiletecsa.sync.worker.appupdate", (tf5) r55Var.a());
            f98 f98Var = this.A;
            if (f98Var != null) {
                c50 c50Var = (c50) f98Var.b;
                qi2 qi2Var = new qi2(gr8.F(c50Var.d()), new e98(f98Var, null, 0), 2);
                ig0 ig0Var = f98Var.c;
                gr8.Q(qi2Var, ig0Var);
                gr8.Q(new qi2(gr8.F(c50Var.c()), new e98(f98Var, null, 1), 2), ig0Var);
                gr8.Q(new qi2(gr8.F(c50Var.b(xz7.a, "datos", "")), new e98(f98Var, null, 2), 2), ig0Var);
                gr8.Q(new qi2(gr8.F(c50Var.b(vz7.a, "voz", "00:00:00")), new e98(f98Var, null, 3), 2), ig0Var);
                gr8.Q(new qi2(gr8.F(c50Var.b(uz7.a, "voz", "--")), new e98(f98Var, null, 4), 2), ig0Var);
                gr8.Q(new qi2(gr8.F(c50Var.b(tz7.a, "sms", "--")), new e98(f98Var, null, 5), 2), ig0Var);
                rz6 rz6Var = this.B;
                if (rz6Var != null) {
                    gr8.Q(new qi2(gr8.F(new ze1(5, rz6Var.b.a())), new h70(rz6Var, null, 1), 2), rz6Var.c);
                    my7 my7Var = this.C;
                    if (my7Var != null) {
                        ar7.H(my7Var.c, null, null, new gw6(my7Var, null, 10), 3);
                        return;
                    } else {
                        sg3.a0("ussdAutoUpdaterController");
                        throw null;
                    }
                }
                sg3.a0("speedOverlayAutoMonitor");
                throw null;
            }
            sg3.a0("widgetDataSync");
            throw null;
        }
        sg3.a0("appUpdateScheduler");
        throw null;
    }
}

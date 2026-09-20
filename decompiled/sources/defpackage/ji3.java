package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: ji3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ji3 {
    public static final /* synthetic */ yr3[] d = {b26.a.i(new ir5(si0.w, ji3.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    public final String a;
    public final ThreadLocal b = new ThreadLocal();
    public final qe1 c;

    public ji3(Context context, String str) {
        gn5 gn5;
        context.getClass();
        this.a = str;
        br4 br4 = new br4(9, (Object) new hi3(this, 0));
        hi3 hi3 = new hi3(this, 1);
        dn1 dn1 = aw1.a;
        cm1 cm1 = cm1.y;
        w77 d2 = b85.d();
        cm1.getClass();
        ig0 E = gl0.E(rc9.D0(cm1, d2));
        hn5 hn5 = new hn5(str, br4, hi3, E);
        d[0].getClass();
        gn5 gn52 = (gn5) hn5.c;
        if (gn52 == null) {
            synchronized (hn5.b) {
                try {
                    if (((gn5) hn5.c) == null) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        List list = (List) hi3.y(applicationContext);
                        qm3 qm3 = new qm3(16, (Object) applicationContext, (Object) hn5);
                        list.getClass();
                        hn5.c = new gn5(new gn5(new jf1(new gd2(hz2.I, new f81(29), new hx4(8, qm3)), sg3.D(new n0(list, (f61) null, 26)), br4, E)));
                    }
                    gn5 = (gn5) hn5.c;
                    gn5.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            gn52 = gn5;
        }
        this.c = gn52;
    }

    public final void a(vr2 vr2) {
        pp4 pp4 = (pp4) ar7.U(x32.w, new ju1(this, vr2, (f61) null, 14));
    }
}

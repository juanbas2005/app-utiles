package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: a49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a49 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ v49 y;

    public /* synthetic */ a49(v49 v49, Bundle bundle, int i) {
        this.w = i;
        this.x = bundle;
        this.y = v49;
    }

    public final void run() {
        int i;
        int i2 = this.w;
        Bundle bundle = this.x;
        v49 v49 = this.y;
        switch (i2) {
            case b85.b /*0*/:
                v49.b1();
                v49.d1();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                z65.h(string);
                z65.h(string2);
                z65.k(bundle.get("value"));
                y19 y19 = (y19) v49.w;
                if (!y19.a()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                z89 z89 = new z89(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    d99 d99 = y19.E;
                    y19.e(d99);
                    bundle.getString("app_id");
                    d99 d992 = d99;
                    zr8 J1 = d992.J1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, 0, true);
                    y19.e(d992);
                    bundle.getString("app_id");
                    zr8 J12 = d992.J1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, 0, true);
                    bundle.getString("app_id");
                    zr8 J13 = d992.J1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, 0, true);
                    String str = string2;
                    z89 z892 = z89;
                    r69 j = y19.j();
                    j.v1(new xn8(bundle.getString("app_id"), str, z892, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), J12, bundle.getLong("trigger_timeout"), J1, bundle.getLong("time_to_live"), J13));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                v49.b1();
                v49.d1();
                String string3 = bundle.getString("name");
                z65.h(string3);
                y19 y192 = (y19) v49.w;
                if (!y192.a()) {
                    pz8 pz82 = y192.B;
                    y19.g(pz82);
                    pz82.J.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                z89 z893 = new z89(0, (Object) null, string3, "");
                try {
                    d99 d993 = y192.E;
                    y19.e(d993);
                    bundle.getString("app_id");
                    zr8 J14 = d993.J1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0, true);
                    String string4 = bundle.getString("app_id");
                    String str2 = string4;
                    y192.j().v1(new xn8(str2, "", z893, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zr8) null, bundle.getLong("trigger_timeout"), (zr8) null, bundle.getLong("time_to_live"), J14));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            default:
                rg4 rg4 = v49.R;
                y19 y193 = (y19) v49.w;
                if (!bundle.isEmpty()) {
                    q09 q09 = y193.A;
                    d99 d994 = y193.E;
                    tp8 tp8 = y193.z;
                    pz8 pz83 = y193.B;
                    y19.e(q09);
                    Bundle bundle2 = new Bundle(q09.U.e());
                    for (String next : bundle.keySet()) {
                        Object obj = bundle.get(next);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            y19.e(d994);
                            if (d99.o2(obj)) {
                                d99.u1(rg4, (String) null, 27, (String) null, (String) null, 0);
                            }
                            y19.g(pz83);
                            pz83.G.c(next, obj, "Invalid default event parameter type. Name, value");
                        } else if (d99.G1(next)) {
                            y19.g(pz83);
                            pz83.G.b("Invalid default event parameter name. Name", next);
                        } else if (obj == null) {
                            bundle2.remove(next);
                        } else {
                            y19.e(d994);
                            tp8.getClass();
                            if (d994.g1("param", next, 500, obj)) {
                                d994.t1(bundle2, next, obj);
                            }
                        }
                    }
                    y19.e(d994);
                    d99 d995 = ((y19) tp8.w).E;
                    y19.e(d995);
                    if (d995.M1(201500000)) {
                        i = 100;
                    } else {
                        i = 25;
                    }
                    if (bundle2.size() > i) {
                        Iterator it = new TreeSet(bundle2.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            i3++;
                            if (i3 > i) {
                                bundle2.remove(str3);
                            }
                        }
                        y19.e(d994);
                        d99.u1(rg4, (String) null, 26, (String) null, (String) null, 0);
                        y19.g(pz83);
                        pz83.G.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                q09 q092 = y193.A;
                y19.e(q092);
                q092.U.i(bundle);
                y193.j().h1(bundle);
                return;
        }
    }
}

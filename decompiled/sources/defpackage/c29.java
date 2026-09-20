package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* renamed from: c29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c29 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ z99 x;
    public final /* synthetic */ w29 y;

    public /* synthetic */ c29(w29 w29, z99 z99, int i) {
        this.w = i;
        this.x = z99;
        this.y = w29;
    }

    public final void run() {
        int i = this.w;
        z99 z99 = this.x;
        w29 w29 = this.y;
        switch (i) {
            case b85.b:
                w29.d.T();
                w29.d.W(z99);
                return;
            case 1:
                w29.d.T();
                v89 v89 = w29.d;
                v89.n0().b1();
                v89.j0();
                z65.k(z99);
                String str = z99.w;
                z65.h(str);
                int i2 = 0;
                if (v89.c0().n1((String) null, by8.y0)) {
                    v89.Q().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int l1 = v89.c0().l1((String) null, by8.h0);
                    v89.c0();
                    long longValue = currentTimeMillis - ((Long) by8.e.a((Object) null)).longValue();
                    while (i2 < l1 && v89.E(longValue, (String) null)) {
                        i2++;
                    }
                } else {
                    v89.c0();
                    long intValue = (long) ((Integer) by8.l.a((Object) null)).intValue();
                    while (((long) i2) < intValue && v89.E(0, str)) {
                        i2++;
                    }
                }
                if (v89.c0().n1((String) null, by8.z0)) {
                    v89.n0().b1();
                    v89.D();
                }
                k89 k89 = v89.F;
                int c = hl6.c(z99.a0);
                k89.b1();
                if (c == 2 && !k89.f1(str)) {
                    j19 j19 = k89.x.w;
                    v89.R(j19);
                    bz8 o1 = j19.o1(str);
                    if (o1 != null && o1.H() && !o1.I().u().isEmpty()) {
                        v89.G().J.b("[sgtm] Going background, trigger client side upload. appId", str);
                        v89.Q().getClass();
                        v89.m(System.currentTimeMillis(), str);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                w29.d.T();
                v89 v892 = w29.d;
                v892.n0().b1();
                v892.j0();
                z65.h(z99.w);
                v892.a0(z99);
                return;
            case 3:
                w29.d.T();
                v89 v893 = w29.d;
                if (v893.U != null) {
                    ArrayList arrayList = new ArrayList();
                    v893.V = arrayList;
                    arrayList.addAll(v893.U);
                }
                uq8 uq8 = v893.y;
                v89.R(uq8);
                y19 y19 = (y19) uq8.w;
                String str2 = z99.w;
                z65.k(str2);
                z65.h(str2);
                uq8.b1();
                uq8.d1();
                try {
                    SQLiteDatabase T1 = uq8.T1();
                    String[] strArr = {str2};
                    int delete = T1.delete("apps", "app_id=?", strArr) + T1.delete("events", "app_id=?", strArr) + T1.delete("events_snapshot", "app_id=?", strArr) + T1.delete("user_attributes", "app_id=?", strArr) + T1.delete("conditional_properties", "app_id=?", strArr) + T1.delete("raw_events", "app_id=?", strArr) + T1.delete("raw_events_metadata", "app_id=?", strArr) + T1.delete("queue", "app_id=?", strArr) + T1.delete("audience_filter_values", "app_id=?", strArr) + T1.delete("main_event_params", "app_id=?", strArr) + T1.delete("default_event_params", "app_id=?", strArr) + T1.delete("trigger_uris", "app_id=?", strArr) + T1.delete("upload_queue", "app_id=?", strArr);
                    fo8 fo8 = (fo8) eo8.x.w.w;
                    if (y19.z.n1((String) null, by8.c1)) {
                        delete += T1.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + T1.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.J.c(str2, Integer.valueOf(delete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.c(pz8.k1(str2), e, "Error resetting analytics data. appId, error");
                }
                if (z99.D) {
                    v893.W(z99);
                    return;
                }
                return;
            case 4:
                w29.d.T();
                v89 v894 = w29.d;
                v894.n0().b1();
                v894.j0();
                z65.h(z99.w);
                v894.k0(z99);
                v894.l0(z99);
                return;
            case 5:
                v89 v895 = w29.d;
                v895.T();
                v895.l0(z99);
                return;
            default:
                v89 v896 = w29.d;
                v896.T();
                v896.k0(z99);
                return;
        }
    }
}

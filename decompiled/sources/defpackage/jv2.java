package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: jv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class jv2 implements d81, dl7, es0, g61, xv0, fs8 {
    public static final /* synthetic */ jv2 A = new jv2(19);
    public static final /* synthetic */ jv2 B = new jv2(20);
    public static final /* synthetic */ jv2 C = new jv2(21);
    public static final /* synthetic */ jv2 D = new jv2(22);
    public static final /* synthetic */ jv2 E = new jv2(23);
    public static final /* synthetic */ jv2 F = new jv2(24);
    public static final /* synthetic */ jv2 G = new jv2(25);
    public static final /* synthetic */ jv2 H = new jv2(26);
    public static final /* synthetic */ jv2 I = new jv2(27);
    public static final /* synthetic */ jv2 J = new jv2(28);
    public static final /* synthetic */ jv2 K = new jv2(29);
    public static final /* synthetic */ jv2 x = new jv2(16);
    public static final /* synthetic */ jv2 y = new jv2(17);
    public static final /* synthetic */ jv2 z = new jv2(18);
    public final /* synthetic */ int w;

    public /* synthetic */ jv2(int i) {
        this.w = i;
    }

    public static final boolean e(ae5 ae5) {
        ae5 ae52 = q56.A;
        dg0 dg0 = ae5.w;
        int k = dg0.k(dg0, f.a);
        if (k == -1) {
            k = dg0.k(ae5.w, f.b);
        }
        if (k != -1) {
            dg0 = dg0.p(dg0, k + 1, 0, 2);
        } else if (ae5.e() != null && dg0.d() == 2) {
            dg0 = dg0.z;
        }
        return !k57.m0(dg0.r(), ".class", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0016  */
    public static final void f(tz2 tz2) {
        d37 d37;
        fg5 fg5;
        fg5 fg52;
        int i;
        Object obj;
        d37 d372 = gy5.z;
        do {
            d37 = gy5.z;
            fg5 = (fg5) d37.getValue();
            wf5 wf5 = fg5.y;
            k74 k74 = (k74) wf5.get(tz2);
            if (k74 != null) {
                fg52 = fg5;
            } else {
                Object obj2 = k74.a;
                Object obj3 = k74.b;
                rn7 rn7 = wf5.w;
                if (tz2 != null) {
                    i = tz2.hashCode();
                } else {
                    i = 0;
                }
                rn7 v = rn7.v(i, 0, tz2);
                if (rn7 != v) {
                    if (v == null) {
                        wf5 = wf5.y;
                    } else {
                        wf5 = new wf5(v, wf5.x - 1);
                    }
                }
                pe2 pe2 = pe2.D;
                if (obj2 != pe2) {
                    Object obj4 = wf5.get(obj2);
                    obj4.getClass();
                    wf5 = wf5.f(obj2, new k74(((k74) obj4).a, obj3));
                }
                if (obj3 != pe2) {
                    Object obj5 = wf5.get(obj3);
                    obj5.getClass();
                    wf5 = wf5.f(obj3, new k74(obj2, ((k74) obj5).b));
                }
                if (obj2 != pe2) {
                    obj = fg5.w;
                } else {
                    obj = obj3;
                }
                if (obj3 != pe2) {
                    obj2 = fg5.x;
                }
                fg52 = new fg5(obj, obj2, wf5);
            }
            if (fg5 == fg52 || d37.i(fg5, fg52)) {
            }
            d37 = gy5.z;
            fg5 = (fg5) d37.getValue();
            wf5 wf52 = fg5.y;
            k74 k742 = (k74) wf52.get(tz2);
            if (k742 != null) {
            }
            return;
        } while (d37.i(fg5, fg52));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: t79} */
    /* JADX WARNING: Multi-variable type inference failed */
    public Object a() {
        switch (this.w) {
            case 18:
                List list = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(1, 3600000, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 19:
                List list2 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(68, 10000, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 20:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(29, 86400000, "measurement.monitoring.sample_period_millis").get();
            case 21:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(49, 1000, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 22:
                List list5 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(9, 1000, "measurement.upload.debug_upload_interval").get();
            case 23:
                List list6 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(64, 15000, "measurement.upload.initial_upload_delay_time").get();
            case 24:
                List list7 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(36, 5000, "measurement.service_client.idle_disconnect_millis").get();
            case 25:
                List list8 = by8.a;
                uo8.x.get();
                k68 k68 = vo8.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) k68.x;
                t79 t79 = (t79) atomicReferenceArray.get(2);
                if (t79 == null) {
                    t79 t792 = new t79("measurement.test.double_flag", (uw2) ((rg4) k68.y).x);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, (Object) null, t792)) {
                            t79 = t792;
                        } else if (atomicReferenceArray.get(2) != null) {
                            t79 = atomicReferenceArray.get(2);
                            t79.getClass();
                        }
                    }
                }
                return (Double) t79.get();
            case 26:
                List list9 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(26, 7, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 27:
                List list10 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 28:
                List list11 = by8.a;
                qn8.x.get();
                return (Boolean) rn8.a.n(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            default:
                List list12 = by8.a;
                jo8 jo8 = (jo8) io8.x.w.w;
                return (Boolean) jo8.c.get();
        }
    }

    public long b() {
        return System.currentTimeMillis();
    }

    public /* synthetic */ Object c(yb9 yb9) {
        if (yb9.k()) {
            return (Bundle) yb9.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(yb9.h())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", yb9.h());
    }

    public /* synthetic */ Object d(kd6 kd6) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(kd6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r7 != r5) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public Object g(ve2 ve2, h61 h61) {
        md3 md3;
        int i;
        String str;
        ve2 ve22;
        Exception e;
        if (h61 instanceof md3) {
            md3 = (md3) h61;
            int i2 = md3.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                md3.C = i2 - Integer.MIN_VALUE;
                Object obj = md3.A;
                i = md3.C;
                String str2 = "";
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    ve2 ve23 = (ve2) ve2;
                    yb9 d = ve23.d();
                    try {
                        d.getClass();
                        md3.z = ve23;
                        md3.C = 1;
                        Object d2 = c35.d(d, md3);
                        if (d2 != p81) {
                            Object obj2 = d2;
                            ve2 = ve23;
                            obj = obj2;
                        }
                    } catch (Exception e2) {
                        Exception exc = e2;
                        ve2 = ve23;
                        e = exc;
                        Log.w("FirebaseSessions", "Error getting authentication token.", e);
                        ve22 = ve2;
                        str = str2;
                        yb9 c = ve22.c();
                        c.getClass();
                        md3.z = str;
                        md3.C = 2;
                        obj = c35.d(c, md3);
                    }
                    return p81;
                } else if (i == 1) {
                    ve2 = (we2) md3.z;
                    try {
                        o85.q(obj);
                    } catch (Exception e3) {
                        e = e3;
                    }
                } else if (i == 2) {
                    str = (String) md3.z;
                    try {
                        o85.q(obj);
                        String str3 = (String) obj;
                        if (str3 != null) {
                            str2 = str3;
                        }
                    } catch (Exception e4) {
                        Log.w("FirebaseSessions", "Error getting Firebase installation id .", e4);
                    }
                    return new nd3(str2, str);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = ((x00) obj).a;
                str4.getClass();
                we2 we2 = ve2;
                str = str4;
                ve22 = we2;
                yb9 c2 = ve22.c();
                c2.getClass();
                md3.z = str;
                md3.C = 2;
                obj = c35.d(c2, md3);
            }
        }
        md3 = new md3(this, h61);
        Object obj3 = md3.A;
        i = md3.C;
        String str22 = "";
        p81 p812 = p81.w;
        if (i != 0) {
        }
        String str42 = ((x00) obj3).a;
        str42.getClass();
        we2 we22 = ve2;
        str = str42;
        ve22 = we22;
        yb9 c22 = ve22.c();
        c22.getClass();
        md3.z = str;
        md3.C = 2;
        obj3 = c35.d(c22, md3);
    }

    public void h(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public String toString() {
        switch (this.w) {
            case 10:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public void i(pl5 pl5, int i, int i2) {
    }
}

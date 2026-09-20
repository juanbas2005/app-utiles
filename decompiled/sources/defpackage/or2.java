package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: or2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class or2 implements i87, od1, i68, v35, fk5, hb1, sy6, fs8 {
    public static final /* synthetic */ or2 A = new or2(21);
    public static final /* synthetic */ or2 B = new or2(22);
    public static final /* synthetic */ or2 C = new or2(24);
    public static final /* synthetic */ or2 D = new or2(25);
    public static final /* synthetic */ or2 E = new or2(26);
    public static final /* synthetic */ or2 F = new or2(27);
    public static final /* synthetic */ or2 G = new or2(28);
    public static final /* synthetic */ or2 H = new or2(29);
    public static final /* synthetic */ or2 x = new or2(18);
    public static final /* synthetic */ or2 y = new or2(19);
    public static final /* synthetic */ or2 z = new or2(20);
    public final /* synthetic */ int w;

    public or2(qc3 qc3) {
        this.w = 23;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.putAll((HashMap) qc3.x);
        hashMap2.putAll((HashMap) qc3.y);
    }

    public static final String c(dg0 dg0, dg0[] dg0Arr, int i) {
        int i2;
        boolean z2;
        byte b;
        int i3;
        dg0 dg02 = dg0;
        dg0[] dg0Arr2 = dg0Arr;
        dg0 dg03 = su5.b;
        int d = dg02.d();
        int i4 = 0;
        while (i4 < d) {
            int i5 = (i4 + d) / 2;
            while (i5 > -1 && dg02.i(i5) != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (dg02.i(i2) == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z3 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z3) {
                    b = 46;
                    z2 = false;
                } else {
                    byte i12 = dg0Arr2[i9].i(i10);
                    byte[] bArr = dg8.a;
                    byte b2 = i12 & 255;
                    z2 = z3;
                    b = b2;
                }
                byte i13 = dg02.i(i6 + i11);
                byte[] bArr2 = dg8.a;
                i3 = b - (i13 & 255);
                if (i3 != 0) {
                    break;
                }
                i11++;
                i10++;
                if (i11 == i8) {
                    break;
                } else if (dg0Arr2[i9].d() != i10) {
                    z3 = z2;
                } else if (i9 == dg0Arr2.length - 1) {
                    break;
                } else {
                    i9++;
                    i10 = -1;
                    z3 = true;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i14 = i8 - i11;
                    int d2 = dg0Arr2[i9].d() - i10;
                    int length = dg0Arr2.length;
                    for (int i15 = i9 + 1; i15 < length; i15++) {
                        d2 += dg0Arr2[i15].d();
                    }
                    if (d2 >= i14) {
                        if (d2 <= i14) {
                            return dg02.o(i6, i8 + i6).n(mo0.a);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            d = i5;
        }
        return null;
    }

    public static Typeface g(String str, am2 am2, int i) {
        Typeface typeface;
        if (i == 0 && sg3.e(am2, am2.y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && sg3.e(am2, am2.B) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        boolean z2 = false;
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        int i2 = am2.w;
        if (i == 1) {
            z2 = true;
        }
        return Typeface.create(typeface, i2, z2);
    }

    public static bj7 j(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return bj7.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return bj7.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return bj7.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return bj7.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return bj7.SSL_3_0;
        }
        h.q("Unexpected TLS version: ".concat(str));
        return null;
    }

    public Object a() {
        switch (this.w) {
            case 18:
                fo8 fo8 = (fo8) eo8.x.w.w;
                return new Boolean(((Boolean) fo8.a.get()).booleanValue());
            case 19:
                List list = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(69, 1000, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 20:
                List list2 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 21:
                List list3 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(46, 5, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 22:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(65, 3600000, "measurement.upload.interval").get();
            case 24:
                List list5 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(17, 4, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 25:
                List list6 = by8.a;
                uo8.x.get();
                return (Long) vo8.a.s(1, -1, "measurement.test.cached_long_flag").get();
            case 26:
                List list7 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(62, 7200000, "measurement.redaction.app_instance_id.ttl").get();
            case 27:
                List list8 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 28:
                List list9 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(25, 0, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            default:
                List list10 = by8.a;
                jo8 jo8 = (jo8) io8.x.w.w;
                return (Boolean) jo8.b.get();
        }
    }

    public Typeface b(am2 am2, int i) {
        return g((String) null, am2, i);
    }

    public Typeface d(fv2 fv2, am2 am2, int i) {
        return g(fv2.d, am2, i);
    }

    public int e() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    public bq7 f(wo7 wo7, List list) {
        wo7.getClass();
        list.getClass();
        List parameters = wo7.getParameters();
        parameters.getClass();
        qp7 qp7 = (qp7) dt0.H0(parameters);
        if (qp7 == null || !qp7.d0()) {
            return new ja3((qp7[]) parameters.toArray(new qp7[0]), (xp7[]) list.toArray(new xp7[0]), false);
        }
        List<qp7> parameters2 = wo7.getParameters();
        parameters2.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(parameters2, 10));
        for (qp7 n : parameters2) {
            arrayList.add(n.n());
        }
        return new q27(1, sf4.a0(dt0.i1(arrayList, list)));
    }

    public j87 i(u72 u72) {
        return new nr2((Context) u72.c, (String) u72.d, (qa) u72.e, u72.a, u72.b);
    }

    public Iterable n(Object obj) {
        return (Iterable) tq3.D.get((gq3) obj);
    }

    public String toString() {
        switch (this.w) {
            case 9:
                int hashCode = hashCode();
                rd3.i(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return pb4.m("CreationExtras.Key@", num, "<", b26.a.b(Bundle.class).A(), ">");
            case 10:
                return "NO_SOURCE";
            case 14:
                int hashCode2 = hashCode();
                rd3.i(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return pb4.m("CreationExtras.Key@", num2, "<", b26.a.b(Application.class).A(), ">");
            default:
                return super.toString();
        }
    }

    public int h(int i) {
        return i;
    }

    public int p(int i) {
        return i;
    }

    public /* synthetic */ or2(int i) {
        this.w = i;
    }

    public or2() {
        this.w = 15;
        List list = Collections.EMPTY_LIST;
    }
}

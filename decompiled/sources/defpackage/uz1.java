package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: uz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uz1 implements gs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ uz1(d63 d63) {
        this.w = 3;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        Bundle bundle = null;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ne6 ne6 = (ne6) obj;
                return (yz1) ((xz1) obj2).b.h.getValue();
            case 1:
                se3 se3 = (se3) obj;
                se3 se32 = (se3) obj2;
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                t13.A(b85.v(1), (yt2) obj);
                return vs7;
            case 3:
                int intValue = ((Integer) obj2).intValue();
                ((k63) obj).getClass();
                return Long.valueOf(wv5.a.d() + Math.min((long) (Math.pow(2.0d, (double) (intValue - 1)) * 1000.0d), 60000));
            case 4:
                ((l63) obj).getClass();
                ((y53) obj2).getClass();
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                gr8.h(b85.v(1), (yt2) obj);
                return vs7;
            case 6:
                ((Integer) obj2).getClass();
                gr8.n(b85.v(1), (yt2) obj);
                return vs7;
            case 7:
                ((Integer) obj2).getClass();
                gr8.b(b85.v(1), (yt2) obj);
                return vs7;
            case 8:
                ((Integer) obj2).getClass();
                gr8.f(b85.v(1), (yt2) obj);
                return vs7;
            case 9:
                ((Integer) obj2).getClass();
                gr8.m(b85.v(1), (yt2) obj);
                return vs7;
            case 10:
                ((Integer) obj2).getClass();
                gr8.p(b85.v(1), (yt2) obj);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ((Integer) obj2).getClass();
                gr8.o(b85.v(1), (yt2) obj);
                return vs7;
            case 12:
                ((Integer) obj2).getClass();
                gr8.g(b85.v(1), (yt2) obj);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                ((Integer) obj2).getClass();
                pk3.a(b85.v(1), (yt2) obj);
                return vs7;
            case 14:
                i04 i04 = (i04) obj;
                ((Integer) obj2).intValue();
                return new px2(rj1.g(1));
            case h75.g:
                ne6 ne62 = (ne6) obj;
                n04 n04 = (n04) obj2;
                return sg3.E(Integer.valueOf(n04.d.b.d()), Integer.valueOf(n04.d.c.d()));
            case 16:
                ne6 ne63 = (ne6) obj;
                s34 s34 = (s34) obj2;
                return sg3.E(Integer.valueOf(s34.h()), Integer.valueOf(s34.i()));
            case 17:
                ne6 ne64 = (ne6) obj;
                Map d = ((x34) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 18:
                gk gkVar = (gk) obj;
                ((Integer) obj2).getClass();
                return new k51(i52.e(kl8.M(1.0f, 1600.0f, (Object) null, 4), 2), new x82(new nm7((gb2) null, (dv6) null, (cn0) null, new xf6(0.7f, ql7.b, kl8.M(0.0f, 400.0f, (Object) null, 5)), (LinkedHashMap) null, 119)));
            case 19:
                ne6 ne65 = (ne6) obj;
                iu4 iu4 = (iu4) obj2;
                ht4 ht4 = iu4.b;
                LinkedHashMap linkedHashMap = ht4.m;
                as asVar = ht4.f;
                LinkedHashMap linkedHashMap2 = ht4.l;
                ArrayList arrayList = new ArrayList();
                Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                for (Map.Entry entry : sf4.b0(ht4.s.a).entrySet()) {
                    String str = (String) entry.getKey();
                    ((nx4) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                    w95.i(j, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", j);
                }
                if (!asVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = asVar.iterator();
                    while (it.hasNext()) {
                        zs4 zs4 = (zs4) it.next();
                        zs4.getClass();
                        int i2 = zs4.x.x.a;
                        String str2 = zs4.B;
                        bt4 bt4 = zs4.D;
                        Bundle a = bt4.a();
                        Bundle j2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                        bt4.h.H(j2);
                        Bundle j3 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                        str2.getClass();
                        j3.putString("nav-entry-state:id", str2);
                        j3.putInt("nav-entry-state:destination-id", i2);
                        if (a == null) {
                            a = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                        }
                        j3.putBundle("nav-entry-state:args", a);
                        j3.putBundle("nav-entry-state:saved-state", j2);
                        arrayList2.add(j3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue2 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue2;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    w95.i(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        arrayList4.add(str4);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = ((as) entry3.getValue()).iterator();
                        while (it2.hasNext()) {
                            kb9 kb9 = ((ct4) it2.next()).a;
                            kb9.getClass();
                            Bundle j4 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                            String str5 = (String) kb9.y;
                            str5.getClass();
                            j4.putString("nav-entry-state:id", str5);
                            j4.putInt("nav-entry-state:destination-id", kb9.x);
                            Bundle bundle2 = (Bundle) kb9.z;
                            if (bundle2 == null) {
                                bundle2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                            }
                            j4.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) kb9.A;
                            bundle3.getClass();
                            j4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(j4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    w95.i(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (iu4.e) {
                    if (bundle == null) {
                        bundle = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", iu4.e);
                }
                return bundle;
            case 20:
                ne6 ne66 = (ne6) obj;
                if (((Number) ((ix4) obj2).a.e.getValue()).floatValue() == 1.0f) {
                    return jx4.w;
                }
                return jx4.x;
            case 21:
                return Integer.valueOf(((gh4) obj).l(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((gh4) obj).v(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((gh4) obj).W(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((gh4) obj).c(((Integer) obj2).intValue()));
            case 25:
                ((Integer) obj2).getClass();
                xz5.b(b85.v(1), (yt2) obj);
                return vs7;
            case 26:
                ((Integer) obj2).getClass();
                xz5.q(b85.v(1), (yt2) obj);
                return vs7;
            case 27:
                ((Integer) obj2).getClass();
                xz5.e(b85.v(1), (yt2) obj);
                return vs7;
            case 28:
                ((Integer) obj2).getClass();
                xz5.n(b85.v(1), (yt2) obj);
                return vs7;
            default:
                ne6 ne67 = (ne6) obj;
                aq4 aq4 = (aq4) obj2;
                if (aq4 instanceof sx6) {
                    sx6 sx6 = (sx6) aq4;
                    Object H = ((gs2) hf7.d.x).H(ne67, sx6.getValue());
                    if (H == null) {
                        return null;
                    }
                    ux6 a2 = sx6.a();
                    a2.getClass();
                    return new ed5(H, a2);
                }
                h.q("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                return null;
        }
    }

    public /* synthetic */ uz1(int i, int i2) {
        this.w = i2;
    }

    public /* synthetic */ uz1(int i) {
        this.w = i;
    }
}

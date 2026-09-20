package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import cu.lestebang.utiletecsa.feature.settings.service.GsmNetworkService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ju4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ju4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Context x;

    public /* synthetic */ ju4(Context context, int i) {
        this.w = i;
        this.x = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        Bundle bundle;
        Bundle[] bundleArr;
        String str;
        int i = this.w;
        ? r1 = 0;
        vs7 vs7 = vs7.a;
        Context context = this.x;
        switch (i) {
            case b85.b:
                Bundle bundle2 = (Bundle) obj;
                iu4 m = rd3.m(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(m.a.getClassLoader());
                }
                ht4 ht4 = m.b;
                LinkedHashMap linkedHashMap = ht4.m;
                Boolean bool = null;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            i95.x("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    ht4.d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        bundleArr = (Bundle[]) z85.m("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    ht4.e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray != null) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList != null) {
                                int length = intArray.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length) {
                                    int i4 = i3 + 1;
                                    Integer valueOf = Integer.valueOf(intArray[i2]);
                                    LinkedHashMap linkedHashMap2 = ht4.l;
                                    if (!sg3.e(stringArrayList.get(i3), "")) {
                                        str = stringArrayList.get(i3);
                                    } else {
                                        str = null;
                                    }
                                    linkedHashMap2.put(valueOf, str);
                                    i2++;
                                    i3 = i4;
                                }
                            } else {
                                i95.x("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                        } else {
                            i95.x("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            for (String next : stringArrayList2) {
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + next)) {
                                    ArrayList<Bundle> m2 = z85.m("android-support-nav:controller:backStackStates:" + next, bundle2);
                                    as asVar = new as(m2.size());
                                    for (Bundle ct4 : m2) {
                                        asVar.addLast(new ct4(ct4));
                                    }
                                    linkedHashMap.put(next, asVar);
                                }
                            }
                        } else {
                            i95.x("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        bool = Boolean.valueOf(z);
                    }
                    if (bool != null) {
                        r1 = bool.booleanValue();
                    }
                    m.e = r1;
                }
                return m;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb = new StringBuilder();
                int length2 = str2.length();
                while (r1 < length2) {
                    char charAt = str2.charAt(r1);
                    if (Character.isDigit(charAt) || charAt == '+') {
                        sb.append(charAt);
                    }
                    r1++;
                }
                try {
                    context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + sb.toString())));
                } catch (Throwable unused) {
                }
                return vs7;
            case 2:
                Map map = (Map) obj;
                map.getClass();
                Iterable values = map.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    }
                }
                ag8.H(context, new Intent(context, GsmNetworkService.class));
                return vs7;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ag8.H(context, new Intent(context, BalanceNotificationService.class));
                }
                return vs7;
        }
    }
}

package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lv0 implements gf6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lv0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Bundle a() {
        ArrayList arrayList;
        yb5[] yb5Arr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Bundle bundle = new Bundle();
                pv0 pv0 = ((rv0) obj).E;
                pv0.getClass();
                LinkedHashMap linkedHashMap = pv0.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(pv0.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(pv0.g));
                return bundle;
            case 1:
                Map d = ((se6) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            case 2:
                eq2 eq2 = (eq2) obj;
                do {
                } while (eq2.q(eq2.p()));
                eq2.S.f1(j54.ON_STOP);
                return new Bundle();
            case 3:
                return ((rq2) obj).Z();
            default:
                o9 o9Var = (o9) obj;
                for (Map.Entry entry2 : sf4.b0((LinkedHashMap) o9Var.A).entrySet()) {
                    o9Var.L((String) entry2.getKey(), ((d37) entry2.getValue()).getValue());
                }
                for (Map.Entry entry3 : sf4.b0((LinkedHashMap) o9Var.y).entrySet()) {
                    o9Var.L((String) entry3.getKey(), ((gf6) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) o9Var.x;
                if (linkedHashMap2.isEmpty()) {
                    yb5Arr = new yb5[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new yb5((String) entry4.getKey(), entry4.getValue()));
                    }
                    yb5Arr = (yb5[]) arrayList2.toArray(new yb5[0]);
                }
                return tf4.j((yb5[]) Arrays.copyOf(yb5Arr, yb5Arr.length));
        }
    }
}

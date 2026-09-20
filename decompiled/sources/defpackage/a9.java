package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: a9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a9 extends gr8 {
    public final /* synthetic */ int j;
    public final /* synthetic */ pv0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ hj8 m;

    public /* synthetic */ a9(pv0 pv0, String str, hj8 hj8, int i) {
        this.j = i;
        this.k = pv0;
        this.l = str;
        this.m = hj8;
    }

    public final void d0(Object obj) {
        int i = this.j;
        hj8 hj8 = this.m;
        String str = this.l;
        pv0 pv0 = this.k;
        switch (i) {
            case b85.b /*0*/:
                LinkedHashMap linkedHashMap = pv0.b;
                ArrayList arrayList = pv0.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        pv0.b(intValue, hj8, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                } else {
                    rf2.t("Attempting to launch an unregistered ActivityResultLauncher with contract ", hj8, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
            default:
                ArrayList arrayList2 = pv0.d;
                Object obj3 = pv0.b.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        pv0.b(intValue2, hj8, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                } else {
                    rf2.t("Attempting to launch an unregistered ActivityResultLauncher with contract ", hj8, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
        }
    }

    public void e0() {
        this.k.e(this.l);
    }
}

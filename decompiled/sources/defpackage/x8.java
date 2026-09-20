package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: x8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x8 implements q54 {
    public final /* synthetic */ pv0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ r8 y;
    public final /* synthetic */ hj8 z;

    public /* synthetic */ x8(pv0 pv0, String str, r8 r8Var, hj8 hj8) {
        this.w = pv0;
        this.x = str;
        this.y = r8Var;
        this.z = hj8;
    }

    public final void o(t54 t54, j54 j54) {
        j54 j542 = j54.ON_START;
        pv0 pv0 = this.w;
        String str = this.x;
        if (j542 == j54) {
            LinkedHashMap linkedHashMap = pv0.e;
            Bundle bundle = pv0.g;
            LinkedHashMap linkedHashMap2 = pv0.f;
            r8 r8Var = this.y;
            hj8 hj8 = this.z;
            linkedHashMap.put(str, new y8(r8Var, hj8));
            if (linkedHashMap2.containsKey(str)) {
                Object obj = linkedHashMap2.get(str);
                linkedHashMap2.remove(str);
                r8Var.b(obj);
            }
            q8 q8Var = (q8) gr8.M(bundle, str, q8.class);
            if (q8Var != null) {
                bundle.remove(str);
                r8Var.b(hj8.D(q8Var.x, q8Var.w));
            }
        } else if (j54.ON_STOP == j54) {
            pv0.e.remove(str);
        } else if (j54.ON_DESTROY == j54) {
            pv0.e(str);
        }
    }
}

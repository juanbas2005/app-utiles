package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* renamed from: mr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mr0 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ h06 x;

    public /* synthetic */ mr0(int i, h06 h06) {
        this.w = i;
        this.x = h06;
    }

    public final Object y(Object obj) {
        int i = this.w;
        boolean z = false;
        h06 h06 = this.x;
        switch (i) {
            case b85.b:
                iv2 iv2 = (iv2) obj;
                if (sg3.e(iv2.O(), "waiting")) {
                    h06.w = iv2;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                String str = (String) obj;
                str.getClass();
                Object obj2 = h06.w;
                if (obj2 == null || !((Bundle) obj2).containsKey(str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ln7 ln7 = (ln7) obj;
                ln7.getClass();
                t24 t24 = ((nn7) ln7).K;
                List list = (List) h06.w;
                if (list != null) {
                    list.add(t24);
                } else {
                    list = sg3.I(t24);
                }
                h06.w = list;
                return kn7.x;
            default:
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                h06.w = jsonElement;
                return vs7.a;
        }
    }
}

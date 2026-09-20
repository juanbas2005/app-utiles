package defpackage;

import android.os.Bundle;

/* renamed from: lt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lt4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Bundle x;

    public /* synthetic */ lt4(int i, Bundle bundle) {
        this.w = i;
        this.x = bundle;
    }

    public final Object y(Object obj) {
        boolean containsKey;
        int i = this.w;
        Bundle bundle = this.x;
        String str = (String) obj;
        switch (i) {
            case b85.b:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}

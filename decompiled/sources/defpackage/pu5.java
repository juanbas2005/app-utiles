package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: pu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pu5 implements k55 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ pu5(Context context, boolean z) {
        this.w = context;
        this.x = z;
    }

    public final void g(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = c35.h(this.w).edit();
        edit.putBoolean("proxy_retention", this.x);
        edit.apply();
    }
}

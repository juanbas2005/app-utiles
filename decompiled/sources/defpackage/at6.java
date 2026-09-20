package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* renamed from: at6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class at6 implements v31 {
    public final /* synthetic */ ct6 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ at6(ct6 ct6, Activity activity) {
        this.a = ct6;
        this.b = activity;
    }

    public final void accept(Object obj) {
        Configuration configuration = (Configuration) obj;
        ct6 ct6 = this.a;
        cf4 cf4 = ct6.e;
        if (cf4 != null) {
            Activity activity = this.b;
            cf4.x(activity, ct6.a(activity));
        }
    }
}

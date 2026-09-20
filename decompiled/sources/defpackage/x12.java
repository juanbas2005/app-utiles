package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* renamed from: x12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x12 extends View {
    public final /* synthetic */ a70 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x12(a70 a70, Context context) {
        super(context);
        this.w = a70;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.w.run();
    }
}

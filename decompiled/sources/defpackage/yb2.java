package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: yb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yb2 implements g61 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ Intent x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ yb2(Context context, Intent intent, boolean z) {
        this.w = context;
        this.x = intent;
        this.y = z;
    }

    public final Object c(yb9 yb9) {
        if (!za5.w() || ((Integer) yb9.i()).intValue() != 402) {
            return yb9;
        }
        return qc3.q(this.w, this.x, this.y).f(new or(1), new ta1(18));
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;

/* renamed from: jp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jp5 implements vr2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ Context w;
    public final /* synthetic */ ResolveInfo x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ String z;

    public /* synthetic */ jp5(Context context, ResolveInfo resolveInfo, boolean z2, String str, long j) {
        this.w = context;
        this.x = resolveInfo;
        this.y = z2;
        this.z = str;
        this.A = j;
    }

    public final Object y(Object obj) {
        b96.s.K(this.w, this.x, Boolean.valueOf(this.y), this.z, new lg7(this.A));
        ((md7) obj).close();
        return vs7.a;
    }
}

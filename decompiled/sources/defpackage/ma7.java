package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: ma7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ma7 {
    public static final String d = bc4.p("SystemJobInfoConverter");
    public final ComponentName a;
    public final z53 b;
    public final boolean c;

    public ma7(Context context, z53 z53, boolean z) {
        this.b = z53;
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.c = z;
    }
}

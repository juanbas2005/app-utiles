package defpackage;

import android.content.Context;

/* renamed from: q72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q72 implements db2 {
    public final /* synthetic */ int a;
    public final mu5 b;

    public /* synthetic */ q72(mu5 mu5, int i) {
        this.a = i;
        this.b = mu5;
    }

    public final Object get() {
        int i = this.a;
        mu5 mu5 = this.b;
        switch (i) {
            case b85.b:
                String packageName = ((Context) mu5.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                ku4.j("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new rg6((Context) mu5.get(), "com.google.android.datatransport.events", Integer.valueOf(rg6.z).intValue());
        }
    }
}

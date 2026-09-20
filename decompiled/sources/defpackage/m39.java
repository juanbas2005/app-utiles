package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: m39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m39 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final iv8 d;
    public final boolean e = true;
    public final Long f;
    public final Long g;
    public final String h;

    public m39(Context context, iv8 iv8, Long l, Long l2) {
        z65.k(context);
        Context applicationContext = context.getApplicationContext();
        z65.k(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (iv8 != null) {
            this.d = iv8;
            this.e = iv8.y;
            this.c = iv8.x;
            this.h = iv8.A;
            Bundle bundle = iv8.z;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

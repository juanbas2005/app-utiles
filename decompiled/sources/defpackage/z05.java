package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: z05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z05 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public z05(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompat;
        if (i == 0) {
            iconCompat = null;
        } else {
            iconCompat = IconCompat.b(i);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.e = iconCompat.c();
        }
        this.f = d15.b(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}

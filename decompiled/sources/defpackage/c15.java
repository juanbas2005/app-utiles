package defpackage;

import android.app.Notification;

/* renamed from: c15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c15 extends in8 {
    public CharSequence x;

    public final String F0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void z0(am6 am6) {
        new Notification.BigTextStyle((Notification.Builder) am6.y).setBigContentTitle((CharSequence) null).bigText(this.x);
    }
}

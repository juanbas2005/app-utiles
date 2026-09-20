package defpackage;

import android.app.Notification;

/* renamed from: hm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hm2 {
    public final int a;
    public final int b;
    public final Notification c;

    public hm2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hm2.class != obj.getClass()) {
            return false;
        }
        hm2 hm2 = (hm2) obj;
        if (this.a == hm2.a && this.b == hm2.b) {
            return this.c.equals(hm2.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

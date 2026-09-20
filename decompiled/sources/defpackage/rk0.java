package defpackage;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import java.time.ZoneId;

/* renamed from: rk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class rk0 {
    public static /* synthetic */ NotificationChannel C(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel d(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ ZoneId o(Object obj) {
        return (ZoneId) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void r() {
        /*
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk0.r():void");
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}

package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: b15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b15 extends in8 {
    public IconCompat x;
    public IconCompat y;
    public boolean z;

    public final String F0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void z0(am6 am6) {
        Bitmap bitmap;
        Context context = (Context) am6.x;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) am6.y).setBigContentTitle((CharSequence) null);
        IconCompat iconCompat = this.x;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                a15.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.x;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    } else {
                        bitmap = null;
                    }
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat2.b;
                } else if (i == 5) {
                    bitmap = IconCompat.a((Bitmap) iconCompat2.b, true);
                } else {
                    ku4.t("called getBitmap() on ", iconCompat2);
                    return;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.z) {
            IconCompat iconCompat3 = this.y;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            a15.c(bigContentTitle, false);
            a15.b(bigContentTitle, (CharSequence) null);
        }
    }
}

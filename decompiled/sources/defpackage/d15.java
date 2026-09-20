package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: d15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d15 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean l = true;
    public in8 m;
    public int n;
    public int o;
    public boolean p = false;
    public String q;
    public Bundle r;
    public int s = 0;
    public int t = 0;
    public RemoteViews u;
    public RemoteViews v;
    public String w;
    public final boolean x;
    public final Notification y;
    public final ArrayList z;

    public d15(Context context, String str) {
        Notification notification = new Notification();
        this.y = notification;
        this.a = context;
        this.w = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.z = new ArrayList();
        this.x = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        am6 am6 = new am6(this);
        d15 d15 = (d15) am6.z;
        in8 in8 = d15.m;
        if (in8 != null) {
            in8.z0(am6);
        }
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) am6.y;
        if (i2 >= 26) {
            notification = builder.build();
        } else {
            notification = builder.build();
        }
        RemoteViews remoteViews = d15.u;
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        }
        if (in8 != null) {
            d15.m.getClass();
        }
        if (!(in8 == null || (bundle = notification.extras) == null)) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", in8.F0());
        }
        return notification;
    }

    public final void c(int i2, boolean z2) {
        Notification notification = this.y;
        if (z2) {
            notification.flags = i2 | notification.flags;
            return;
        }
        notification.flags = (~i2) & notification.flags;
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.i = iconCompat;
    }

    public final void e(in8 in8) {
        if (this.m != in8) {
            this.m = in8;
            if (((d15) in8.w) != this) {
                in8.w = this;
                e(in8);
            }
        }
    }
}

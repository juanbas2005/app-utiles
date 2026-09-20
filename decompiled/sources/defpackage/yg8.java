package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: yg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yg8 extends ph8 {
    public final Context a;
    public final /* synthetic */ lw2 b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public yg8(lw2 lw2, Context context) {
        super(r2, 0);
        Looper looper;
        this.b = lw2;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = mw2.a;
        lw2 lw2 = this.b;
        Context context = this.a;
        int b2 = lw2.b(context, i2);
        int i3 = rw2.e;
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
            Intent a2 = lw2.a(context, "n", b2);
            if (a2 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 201326592);
            }
            lw2.f(context, b2, pendingIntent);
        }
    }
}

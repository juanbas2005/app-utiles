package cu.lestebang.utiletecsa.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class VpnWidgetProvider extends AppWidgetProvider {
    public static final int e = Color.parseColor("#4ADE80");
    public static final int f = Color.parseColor("#9DC3DF");
    public volatile boolean a = false;
    public final Object b = new Object();
    public v78 c;
    public h81 d;

    public static final void a(VpnWidgetProvider vpnWidgetProvider, Context context, boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.string.widget_vpn_connected;
        } else {
            i = R.string.widget_vpn_disconnected;
        }
        if (z) {
            i2 = e;
        } else {
            i2 = f;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_vpn);
        remoteViews.setTextViewText(R.id.widget_value, context.getString(i));
        remoteViews.setTextColor(R.id.widget_value, i2);
        remoteViews.setOnClickPendingIntent(R.id.widget_root, PendingIntent.getActivity(context, 0, new Intent(context, VpnToggleActivity.class).addFlags(268435456), 201326592));
        AppWidgetManager.getInstance(context).updateAppWidget(new ComponentName(context, VpnWidgetProvider.class), remoteViews);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (v78) ((vd1) ((f88) b96.u(context))).L.get();
                        this.d = zv1.a();
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        w77 d = b85.d();
        h81 h81Var = this.d;
        if (h81Var != null) {
            ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new pd7(this, context, goAsync, null, 7), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

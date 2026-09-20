package cu.lestebang.utiletecsa.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/SaldoWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SaldoWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[LOOP:0: B:18:0x005f->B:19:0x0061, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object a(SaldoWidgetProvider saldoWidgetProvider, Context context, h61 h61) {
        ke6 ke6;
        int i;
        if (h61 instanceof ke6) {
            ke6 = (ke6) h61;
            int i2 = ke6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ke6.C = i2 - Integer.MIN_VALUE;
                Object obj = ke6.A;
                i = ke6.C;
                if (i != 0) {
                    o85.q(obj);
                    k40 k40 = saldoWidgetProvider.c;
                    if (k40 != null) {
                        di2 d2 = ((c50) k40).d();
                        ke6.z = context;
                        ke6.C = 1;
                        obj = gr8.H(d2, ke6);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("balanceRepository");
                        throw null;
                    }
                } else if (i == 1) {
                    context = ke6.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = (String) obj;
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                Class<SaldoWidgetProvider> cls = SaldoWidgetProvider.class;
                int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, cls));
                appWidgetIds.getClass();
                for (int updateAppWidget : appWidgetIds) {
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_saldo);
                    remoteViews.setTextViewText(R.id.widget_value, "$" + str);
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, cls).setAction("cu.lestebang.utiletecsa.widget.SALDO_REFRESH"), 201326592);
                    broadcast.getClass();
                    remoteViews.setOnClickPendingIntent(R.id.widget_root, broadcast);
                    instance.updateAppWidget(updateAppWidget, remoteViews);
                }
                return vs7.a;
            }
        }
        ke6 = new ke6(saldoWidgetProvider, h61);
        Object obj2 = ke6.A;
        i = ke6.C;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        AppWidgetManager instance2 = AppWidgetManager.getInstance(context);
        Class<SaldoWidgetProvider> cls2 = SaldoWidgetProvider.class;
        int[] appWidgetIds2 = instance2.getAppWidgetIds(new ComponentName(context, cls2));
        appWidgetIds2.getClass();
        while (r4 < r2) {
        }
        return vs7.a;
    }

    public final void b(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (k40) ((vd1) ((le6) b96.u(context))).s.get();
                        this.d = zv1.a();
                        this.a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        b(context, intent);
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.SALDO_REFRESH")) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, SaldoWidgetProvider.class);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_saldo);
            remoteViews.setTextViewText(R.id.widget_value, context.getString(R.string.widget_refreshing));
            int[] appWidgetIds = instance.getAppWidgetIds(componentName);
            appWidgetIds.getClass();
            for (int partiallyUpdateAppWidget : appWidgetIds) {
                instance.partiallyUpdateAppWidget(partiallyUpdateAppWidget, remoteViews);
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            w77 d2 = b85.d();
            h81 h81 = this.d;
            if (h81 != null) {
                ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new je6(this, context, goAsync, (f61) null, 0), 3);
            } else {
                sg3.a0("ioDispatcher");
                throw null;
            }
        }
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        w77 d2 = b85.d();
        h81 h81 = this.d;
        if (h81 != null) {
            ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new je6(this, context, goAsync, (f61) null, 1), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DatosWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r11 == r6) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098 A[LOOP:0: B:30:0x0096->B:31:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public static final Object a(DatosWidgetProvider datosWidgetProvider, Context context, h61 h61) {
        ej1 ej1;
        int i;
        CharSequence charSequence;
        Context context2;
        if (h61 instanceof ej1) {
            ej1 = (ej1) h61;
            int i2 = ej1.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ej1.C = i2 - Integer.MIN_VALUE;
                Object obj = ej1.A;
                i = ej1.C;
                Object obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    k40 k40 = datosWidgetProvider.c;
                    if (k40 != null) {
                        di2 b2 = ((c50) k40).b(xz7.a, "datos", "");
                        ej1.z = context;
                        ej1.C = 1;
                        obj = gr8.H(b2, ej1);
                    } else {
                        sg3.a0("balanceRepository");
                        throw null;
                    }
                } else if (i == 1) {
                    context = ej1.z;
                    o85.q(obj);
                } else if (i == 2) {
                    context2 = ej1.z;
                    o85.q(obj);
                    charSequence = (String) obj;
                    context = context2;
                    String str = (String) charSequence;
                    AppWidgetManager instance = AppWidgetManager.getInstance(context);
                    Class<DatosWidgetProvider> cls = DatosWidgetProvider.class;
                    int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, cls));
                    appWidgetIds.getClass();
                    for (int updateAppWidget : appWidgetIds) {
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_datos);
                        remoteViews.setTextViewText(R.id.widget_value, str);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, cls).setAction("cu.lestebang.utiletecsa.widget.DATOS_REFRESH"), 201326592);
                        broadcast.getClass();
                        remoteViews.setOnClickPendingIntent(R.id.widget_root, broadcast);
                        instance.updateAppWidget(updateAppWidget, remoteViews);
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) obj;
                if (d57.I0(charSequence)) {
                    k40 k402 = datosWidgetProvider.c;
                    if (k402 != null) {
                        di2 c2 = ((c50) k402).c();
                        ej1.z = context;
                        ej1.C = 2;
                        obj = gr8.H(c2, ej1);
                        if (obj != obj2) {
                            context2 = context;
                            charSequence = (String) obj;
                            context = context2;
                        }
                        return obj2;
                    }
                    sg3.a0("balanceRepository");
                    throw null;
                }
                String str2 = (String) charSequence;
                AppWidgetManager instance2 = AppWidgetManager.getInstance(context);
                Class<DatosWidgetProvider> cls2 = DatosWidgetProvider.class;
                int[] appWidgetIds2 = instance2.getAppWidgetIds(new ComponentName(context, cls2));
                appWidgetIds2.getClass();
                while (r4 < r2) {
                }
                return vs7.a;
            }
        }
        ej1 = new ej1(datosWidgetProvider, h61);
        Object obj3 = ej1.A;
        i = ej1.C;
        Object obj22 = p81.w;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj3;
        if (d57.I0(charSequence)) {
        }
        String str22 = (String) charSequence;
        AppWidgetManager instance22 = AppWidgetManager.getInstance(context);
        Class<DatosWidgetProvider> cls22 = DatosWidgetProvider.class;
        int[] appWidgetIds22 = instance22.getAppWidgetIds(new ComponentName(context, cls22));
        appWidgetIds22.getClass();
        while (r4 < r2) {
        }
        return vs7.a;
    }

    public final void b(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (k40) ((vd1) ((fj1) b96.u(context))).s.get();
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
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.DATOS_REFRESH")) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, DatosWidgetProvider.class);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_datos);
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
                ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new dj1(this, context, goAsync, (f61) null, 0), 3);
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
            ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new dj1(this, context, goAsync, (f61) null, 1), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

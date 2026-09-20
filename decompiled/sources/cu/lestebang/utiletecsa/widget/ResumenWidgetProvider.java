package cu.lestebang.utiletecsa.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.sync.worker.DelegatingWorker;
import cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/ResumenWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class ResumenWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r15 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r15 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c A[LOOP:0: B:51:0x015a->B:52:0x015c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu.lestebang.utiletecsa.widget.ResumenWidgetProvider r13, android.content.Context r14, defpackage.h61 r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.widget.ResumenWidgetProvider.a(cu.lestebang.utiletecsa.widget.ResumenWidgetProvider, android.content.Context, h61):java.lang.Object");
    }

    public final k40 b() {
        k40 k40Var = this.c;
        if (k40Var != null) {
            return k40Var;
        }
        sg3.a0("balanceRepository");
        throw null;
    }

    public final void c(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (k40) ((vd1) ((y66) b96.u(context))).s.get();
                        this.d = zv1.a();
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        c(context, intent);
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.RESUMEN_REFRESH")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, ResumenWidgetProvider.class);
            String string = context.getString(R.string.widget_refreshing);
            string.getClass();
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_resumen);
            remoteViews.setTextViewText(R.id.widget_saldo_value, string);
            remoteViews.setTextViewText(R.id.widget_datos_value, string);
            remoteViews.setTextViewText(R.id.widget_voz_value, string);
            remoteViews.setTextViewText(R.id.widget_sms_value, string);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            appWidgetIds.getClass();
            for (int i : appWidgetIds) {
                appWidgetManager.partiallyUpdateAppWidget(i, remoteViews);
            }
            nd8 c = nd8.c(context);
            r55 r55Var = new r55(DelegatingWorker.class);
            be8 be8Var = (be8) r55Var.c;
            be8Var.q = true;
            be8Var.r = g85.w;
            ((be8) r55Var.c).e = we.i(b26.a.b(UssdRefreshWorker.class));
            c.b("cu.lestebang.utiletecsa.sync.worker.ussdrefresh", w82.x, (s55) r55Var.a());
            w77 d = b85.d();
            h81 h81Var = this.d;
            if (h81Var != null) {
                ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new k05(this, context, null, 9), 3);
            } else {
                sg3.a0("ioDispatcher");
                throw null;
            }
        }
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
            ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new ii3(this, context, goAsync, (f61) null, 19), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

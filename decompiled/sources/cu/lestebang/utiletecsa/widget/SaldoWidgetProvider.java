package cu.lestebang.utiletecsa.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/SaldoWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class SaldoWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[LOOP:0: B:20:0x005f->B:21:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu.lestebang.utiletecsa.widget.SaldoWidgetProvider r9, android.content.Context r10, defpackage.h61 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ke6
            if (r0 == 0) goto L13
            r0 = r11
            ke6 r0 = (defpackage.ke6) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            ke6 r0 = new ke6
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.C
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            android.content.Context r10 = r0.z
            defpackage.o85.q(r11)
            goto L48
        L28:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r9)
            return r2
        L2e:
            defpackage.o85.q(r11)
            k40 r9 = r9.c
            if (r9 == 0) goto La6
            c50 r9 = (defpackage.c50) r9
            di2 r9 = r9.d()
            r0.z = r10
            r0.C = r3
            java.lang.Object r11 = defpackage.gr8.H(r9, r0)
            p81 r9 = defpackage.p81.w
            if (r11 != r9) goto L48
            return r9
        L48:
            java.lang.String r11 = (java.lang.String) r11
            android.appwidget.AppWidgetManager r9 = android.appwidget.AppWidgetManager.getInstance(r10)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class<cu.lestebang.utiletecsa.widget.SaldoWidgetProvider> r1 = cu.lestebang.utiletecsa.widget.SaldoWidgetProvider.class
            r0.<init>(r10, r1)
            int[] r0 = r9.getAppWidgetIds(r0)
            r0.getClass()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L5f:
            if (r4 >= r2) goto La3
            r5 = r0[r4]
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            java.lang.String r7 = r10.getPackageName()
            r8 = 2131492990(0x7f0c007e, float:1.8609447E38)
            r6.<init>(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "$"
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r8 = 2131296838(0x7f090246, float:1.8211604E38)
            r6.setTextViewText(r8, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r10, r1)
            java.lang.String r8 = "cu.lestebang.utiletecsa.widget.SALDO_REFRESH"
            android.content.Intent r7 = r7.setAction(r8)
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r10, r3, r7, r8)
            r7.getClass()
            r8 = 2131296833(0x7f090241, float:1.8211594E38)
            r6.setOnClickPendingIntent(r8, r7)
            r9.updateAppWidget(r5, r6)
            int r4 = r4 + 1
            goto L5f
        La3:
            vs7 r9 = defpackage.vs7.a
            return r9
        La6:
            java.lang.String r9 = "balanceRepository"
            defpackage.sg3.a0(r9)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.widget.SaldoWidgetProvider.a(cu.lestebang.utiletecsa.widget.SaldoWidgetProvider, android.content.Context, h61):java.lang.Object");
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
        b(context, intent);
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.SALDO_REFRESH")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, SaldoWidgetProvider.class);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_saldo);
            remoteViews.setTextViewText(R.id.widget_value, context.getString(R.string.widget_refreshing));
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            appWidgetIds.getClass();
            for (int i : appWidgetIds) {
                appWidgetManager.partiallyUpdateAppWidget(i, remoteViews);
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            w77 d = b85.d();
            h81 h81Var = this.d;
            if (h81Var != null) {
                ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new je6(this, context, goAsync, null, 0), 3);
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
            ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new je6(this, context, goAsync, null, 1), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

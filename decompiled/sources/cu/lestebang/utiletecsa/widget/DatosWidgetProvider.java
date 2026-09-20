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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class DatosWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r11 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[LOOP:0: B:33:0x0096->B:34:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu.lestebang.utiletecsa.widget.DatosWidgetProvider r9, android.content.Context r10, defpackage.h61 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ej1
            if (r0 == 0) goto L13
            r0 = r11
            ej1 r0 = (defpackage.ej1) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            ej1 r0 = new ej1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.C
            r2 = 0
            java.lang.String r3 = "balanceRepository"
            r4 = 2
            r5 = 1
            p81 r6 = defpackage.p81.w
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            android.content.Context r9 = r0.z
            defpackage.o85.q(r11)
            goto L77
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r9)
            return r2
        L35:
            android.content.Context r10 = r0.z
            defpackage.o85.q(r11)
            goto L59
        L3b:
            defpackage.o85.q(r11)
            k40 r11 = r9.c
            if (r11 == 0) goto Lcf
            c50 r11 = (defpackage.c50) r11
            xz7 r1 = defpackage.xz7.a
            java.lang.String r7 = "datos"
            java.lang.String r8 = ""
            di2 r11 = r11.b(r1, r7, r8)
            r0.z = r10
            r0.C = r5
            java.lang.Object r11 = defpackage.gr8.H(r11, r0)
            if (r11 != r6) goto L59
            goto L75
        L59:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r1 = defpackage.d57.I0(r11)
            if (r1 == 0) goto L7f
            k40 r9 = r9.c
            if (r9 == 0) goto L7b
            c50 r9 = (defpackage.c50) r9
            di2 r9 = r9.c()
            r0.z = r10
            r0.C = r4
            java.lang.Object r11 = defpackage.gr8.H(r9, r0)
            if (r11 != r6) goto L76
        L75:
            return r6
        L76:
            r9 = r10
        L77:
            java.lang.String r11 = (java.lang.String) r11
            r10 = r9
            goto L7f
        L7b:
            defpackage.sg3.a0(r3)
            throw r2
        L7f:
            java.lang.String r11 = (java.lang.String) r11
            android.appwidget.AppWidgetManager r9 = android.appwidget.AppWidgetManager.getInstance(r10)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class<cu.lestebang.utiletecsa.widget.DatosWidgetProvider> r1 = cu.lestebang.utiletecsa.widget.DatosWidgetProvider.class
            r0.<init>(r10, r1)
            int[] r0 = r9.getAppWidgetIds(r0)
            r0.getClass()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L96:
            if (r4 >= r2) goto Lcc
            r5 = r0[r4]
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            java.lang.String r7 = r10.getPackageName()
            r8 = 2131492987(0x7f0c007b, float:1.8609441E38)
            r6.<init>(r7, r8)
            r7 = 2131296838(0x7f090246, float:1.8211604E38)
            r6.setTextViewText(r7, r11)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r10, r1)
            java.lang.String r8 = "cu.lestebang.utiletecsa.widget.DATOS_REFRESH"
            android.content.Intent r7 = r7.setAction(r8)
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r10, r3, r7, r8)
            r7.getClass()
            r8 = 2131296833(0x7f090241, float:1.8211594E38)
            r6.setOnClickPendingIntent(r8, r7)
            r9.updateAppWidget(r5, r6)
            int r4 = r4 + 1
            goto L96
        Lcc:
            vs7 r9 = defpackage.vs7.a
            return r9
        Lcf:
            defpackage.sg3.a0(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.widget.DatosWidgetProvider.a(cu.lestebang.utiletecsa.widget.DatosWidgetProvider, android.content.Context, h61):java.lang.Object");
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
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.DATOS_REFRESH")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, DatosWidgetProvider.class);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_datos);
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
                ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new dj1(this, context, goAsync, null, 0), 3);
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
            ar7.H(gl0.E(rc9.D0(d, h81Var)), null, null, new dj1(this, context, goAsync, null, 1), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

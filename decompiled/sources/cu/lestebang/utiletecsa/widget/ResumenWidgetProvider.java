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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/ResumenWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ResumenWidgetProvider extends AppWidgetProvider {
    public volatile boolean a = false;
    public final Object b = new Object();
    public k40 c;
    public h81 d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r15 == r5) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r15 = (java.lang.CharSequence) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        if (defpackage.d57.I0(r15) == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        r15 = ((defpackage.c50) r13.b()).c();
        r0.z = r1;
        r0.A = r14;
        r0.F = 3;
        r15 = defpackage.gr8.H(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        if (r15 != r5) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        r15 = (java.lang.String) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        r15 = (java.lang.String) r15;
        r6 = ((defpackage.c50) r13.b()).b(defpackage.uz7.a, "voz", "--");
        r0.z = r1;
        r0.A = r14;
        r0.B = r15;
        r0.F = 4;
        r6 = defpackage.gr8.H(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e3, code lost:
        if (r6 != r5) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        r12 = r1;
        r1 = r14;
        r14 = r15;
        r15 = r6;
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r15 = (java.lang.String) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f1, code lost:
        if (defpackage.d57.I0(r15) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        if (r15.equals("--") == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        r15 = ((defpackage.c50) r13.b()).b(defpackage.vz7.a, "voz", "00:00:00");
        r0.z = r6;
        r0.A = r1;
        r0.B = r14;
        r0.C = null;
        r0.F = 5;
        r15 = defpackage.gr8.H(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0119, code lost:
        if (r15 != r5) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011d, code lost:
        r15 = (java.lang.String) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        r13 = ((defpackage.c50) r13.b()).b(defpackage.tz7.a, "sms", "--");
        r0.z = r2;
        r0.A = r1;
        r0.B = r14;
        r0.C = r15;
        r0.F = 6;
        r13 = defpackage.gr8.H(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013c, code lost:
        if (r13 != r5) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013f, code lost:
        r0 = r15;
        r15 = r13;
        r13 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0143, code lost:
        r15 = (java.lang.String) r15;
        r2 = android.appwidget.AppWidgetManager.getInstance(r0);
        r4 = cu.lestebang.utiletecsa.widget.ResumenWidgetProvider.class;
        r3 = r2.getAppWidgetIds(new android.content.ComponentName(r0, r4));
        r3.getClass();
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x015a, code lost:
        if (r7 >= r5) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015c, code lost:
        r8 = r3[r7];
        r9 = new android.widget.RemoteViews(r0.getPackageName(), cu.lestebang.utiletecsa.R.layout.widget_resumen);
        r9.setTextViewText(cu.lestebang.utiletecsa.R.id.widget_saldo_value, "$" + r1);
        r9.setTextViewText(cu.lestebang.utiletecsa.R.id.widget_datos_value, r14);
        r9.setTextViewText(cu.lestebang.utiletecsa.R.id.widget_voz_value, r13);
        r9.setTextViewText(cu.lestebang.utiletecsa.R.id.widget_sms_value, r15);
        r10 = android.app.PendingIntent.getBroadcast(r0, 0, new android.content.Intent(r0, r4).setAction("cu.lestebang.utiletecsa.widget.RESUMEN_REFRESH"), 201326592);
        r10.getClass();
        r9.setOnClickPendingIntent(cu.lestebang.utiletecsa.R.id.widget_root, r10);
        r2.updateAppWidget(r8, r9);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b2, code lost:
        return defpackage.vs7.a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public static final Object a(ResumenWidgetProvider resumenWidgetProvider, Context context, h61 h61) {
        x66 x66;
        int i;
        String str;
        String str2;
        String str3;
        Context context2;
        if (h61 instanceof x66) {
            x66 = (x66) h61;
            int i2 = x66.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x66.F = i2 - Integer.MIN_VALUE;
                Object obj = x66.D;
                i = x66.F;
                Object obj2 = p81.w;
                switch (i) {
                    case b85.b:
                        o85.q(obj);
                        di2 d2 = ((c50) resumenWidgetProvider.b()).d();
                        x66.z = context;
                        x66.F = 1;
                        obj = gr8.H(d2, x66);
                        break;
                    case 1:
                        context = x66.z;
                        o85.q(obj);
                        String str4 = (String) obj;
                        di2 b2 = ((c50) resumenWidgetProvider.b()).b(xz7.a, "datos", "");
                        x66.z = context;
                        x66.A = str4;
                        x66.F = 2;
                        Object H = gr8.H(b2, x66);
                        if (H != obj2) {
                            Object obj3 = H;
                            context2 = context;
                            str3 = str4;
                            obj = obj3;
                            break;
                        }
                        break;
                    case 2:
                        str3 = x66.A;
                        context2 = x66.z;
                        o85.q(obj);
                        break;
                    case 3:
                        str3 = x66.A;
                        context2 = x66.z;
                        o85.q(obj);
                        break;
                    case 4:
                        str = x66.B;
                        str2 = x66.A;
                        Context context3 = x66.z;
                        o85.q(obj);
                        break;
                    case 5:
                        str = x66.B;
                        str2 = x66.A;
                        Context context4 = x66.z;
                        o85.q(obj);
                        break;
                    case 6:
                        String str5 = x66.C;
                        str = x66.B;
                        str2 = x66.A;
                        Context context5 = x66.z;
                        o85.q(obj);
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        x66 = new x66(resumenWidgetProvider, h61);
        Object obj4 = x66.D;
        i = x66.F;
        Object obj22 = p81.w;
        switch (i) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }

    public final k40 b() {
        k40 k40 = this.c;
        if (k40 != null) {
            return k40;
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
        c(context, intent);
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.widget.RESUMEN_REFRESH")) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, ResumenWidgetProvider.class);
            String string = context.getString(R.string.widget_refreshing);
            string.getClass();
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_resumen);
            remoteViews.setTextViewText(R.id.widget_saldo_value, string);
            remoteViews.setTextViewText(R.id.widget_datos_value, string);
            remoteViews.setTextViewText(R.id.widget_voz_value, string);
            remoteViews.setTextViewText(R.id.widget_sms_value, string);
            int[] appWidgetIds = instance.getAppWidgetIds(componentName);
            appWidgetIds.getClass();
            for (int partiallyUpdateAppWidget : appWidgetIds) {
                instance.partiallyUpdateAppWidget(partiallyUpdateAppWidget, remoteViews);
            }
            nd8 c2 = nd8.c(context);
            r55 r55 = new r55(DelegatingWorker.class);
            be8 be8 = (be8) r55.c;
            be8.q = true;
            be8.r = g85.w;
            ((be8) r55.c).e = we.i(b26.a.b(UssdRefreshWorker.class));
            c2.b("cu.lestebang.utiletecsa.sync.worker.ussdrefresh", w82.x, (s55) r55.a());
            w77 d2 = b85.d();
            h81 h81 = this.d;
            if (h81 != null) {
                ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new k05(this, context, (f61) null, 9), 3);
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
            ar7.H(gl0.E(rc9.D0(d2, h81)), (e81) null, (r81) null, new ii3((Object) this, (Object) context, (Object) goAsync, (f61) null, 19), 3);
        } else {
            sg3.a0("ioDispatcher");
            throw null;
        }
    }
}

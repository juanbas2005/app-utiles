package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import cu.lestebang.utiletecsa.widget.DatosWidgetProvider;
import cu.lestebang.utiletecsa.widget.ResumenWidgetProvider;
import cu.lestebang.utiletecsa.widget.SaldoWidgetProvider;

/* renamed from: e98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e98 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ f98 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e98(f98 f98, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = f98;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        String str = (String) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
            case 1:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
            case 2:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
            case 3:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
            case 4:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
            default:
                ((e98) o(f61, str)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new e98(this.B, f61, 0);
            case 1:
                return new e98(this.B, f61, 1);
            case 2:
                return new e98(this.B, f61, 2);
            case 3:
                return new e98(this.B, f61, 3);
            case 4:
                return new e98(this.B, f61, 4);
            default:
                return new e98(this.B, f61, 5);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        Class<DatosWidgetProvider> cls = DatosWidgetProvider.class;
        vs7 vs7 = vs7.a;
        Class<ResumenWidgetProvider> cls2 = ResumenWidgetProvider.class;
        f98 f98 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                Context context = f98.a;
                Class<SaldoWidgetProvider> cls3 = SaldoWidgetProvider.class;
                int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, cls3));
                appWidgetIds.getClass();
                if (appWidgetIds.length != 0) {
                    Intent putExtra = new Intent(context, cls3).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds);
                    putExtra.getClass();
                    context.sendBroadcast(putExtra);
                }
                Context context2 = f98.a;
                int[] appWidgetIds2 = AppWidgetManager.getInstance(context2).getAppWidgetIds(new ComponentName(context2, cls2));
                appWidgetIds2.getClass();
                if (appWidgetIds2.length != 0) {
                    Intent putExtra2 = new Intent(context2, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds2);
                    putExtra2.getClass();
                    context2.sendBroadcast(putExtra2);
                }
                return vs7;
            case 1:
                o85.q(obj);
                Context context3 = f98.a;
                int[] appWidgetIds3 = AppWidgetManager.getInstance(context3).getAppWidgetIds(new ComponentName(context3, cls));
                appWidgetIds3.getClass();
                if (appWidgetIds3.length != 0) {
                    Intent putExtra3 = new Intent(context3, cls).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds3);
                    putExtra3.getClass();
                    context3.sendBroadcast(putExtra3);
                }
                Context context4 = f98.a;
                int[] appWidgetIds4 = AppWidgetManager.getInstance(context4).getAppWidgetIds(new ComponentName(context4, cls2));
                appWidgetIds4.getClass();
                if (appWidgetIds4.length != 0) {
                    Intent putExtra4 = new Intent(context4, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds4);
                    putExtra4.getClass();
                    context4.sendBroadcast(putExtra4);
                }
                return vs7;
            case 2:
                o85.q(obj);
                Context context5 = f98.a;
                int[] appWidgetIds5 = AppWidgetManager.getInstance(context5).getAppWidgetIds(new ComponentName(context5, cls));
                appWidgetIds5.getClass();
                if (appWidgetIds5.length != 0) {
                    Intent putExtra5 = new Intent(context5, cls).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds5);
                    putExtra5.getClass();
                    context5.sendBroadcast(putExtra5);
                }
                Context context6 = f98.a;
                int[] appWidgetIds6 = AppWidgetManager.getInstance(context6).getAppWidgetIds(new ComponentName(context6, cls2));
                appWidgetIds6.getClass();
                if (appWidgetIds6.length != 0) {
                    Intent putExtra6 = new Intent(context6, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds6);
                    putExtra6.getClass();
                    context6.sendBroadcast(putExtra6);
                }
                return vs7;
            case 3:
                o85.q(obj);
                Context context7 = f98.a;
                int[] appWidgetIds7 = AppWidgetManager.getInstance(context7).getAppWidgetIds(new ComponentName(context7, cls2));
                appWidgetIds7.getClass();
                if (appWidgetIds7.length != 0) {
                    Intent putExtra7 = new Intent(context7, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds7);
                    putExtra7.getClass();
                    context7.sendBroadcast(putExtra7);
                }
                return vs7;
            case 4:
                o85.q(obj);
                Context context8 = f98.a;
                int[] appWidgetIds8 = AppWidgetManager.getInstance(context8).getAppWidgetIds(new ComponentName(context8, cls2));
                appWidgetIds8.getClass();
                if (appWidgetIds8.length != 0) {
                    Intent putExtra8 = new Intent(context8, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds8);
                    putExtra8.getClass();
                    context8.sendBroadcast(putExtra8);
                }
                return vs7;
            default:
                o85.q(obj);
                Context context9 = f98.a;
                int[] appWidgetIds9 = AppWidgetManager.getInstance(context9).getAppWidgetIds(new ComponentName(context9, cls2));
                appWidgetIds9.getClass();
                if (appWidgetIds9.length != 0) {
                    Intent putExtra9 = new Intent(context9, cls2).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds9);
                    putExtra9.getClass();
                    context9.sendBroadcast(putExtra9);
                }
                return vs7;
        }
    }
}

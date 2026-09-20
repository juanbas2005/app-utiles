package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* renamed from: oi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oi implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ui x;

    public /* synthetic */ oi(ui uiVar, int i) {
        this.w = i;
        this.x = uiVar;
    }

    public final Object y(Object obj) {
        Looper looper;
        int i = this.w;
        vs7 vs7 = vs7.a;
        ui uiVar = this.x;
        switch (i) {
            case b85.b:
                sr2 sr2 = (sr2) obj;
                View view = uiVar.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sr2.b();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new vd(2, sr2));
                    }
                }
                return vs7;
            case 1:
                ActionMode actionMode = uiVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return vs7;
            case 2:
                ActionMode actionMode2 = uiVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return vs7;
            default:
                kw1 kw1 = (kw1) obj;
                uiVar.e.f();
                return new d9(3, uiVar);
        }
    }
}

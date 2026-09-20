package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: de  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class de extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ je y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de(je jeVar, int i) {
        super(1);
        this.x = i;
        this.y = jeVar;
    }

    public final Object y(Object obj) {
        Looper looper;
        int i = this.x;
        vs7 vs7 = vs7.a;
        je jeVar = this.y;
        switch (i) {
            case b85.b:
                ((lk2) jeVar.getFocusOwner()).h(((bk2) obj).a, false);
                return vs7;
            case 1:
                sr2 sr2 = (sr2) obj;
                jeVar.getUncaughtExceptionHandler$ui();
                Handler handler = jeVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sr2.b();
                } else {
                    Handler handler2 = jeVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new vd(1, sr2));
                    }
                }
                return vs7;
            case 2:
                return new mh(jeVar, jeVar.getTextInputService(), (o81) obj);
            case 3:
                qy0 qy0 = (qy0) obj;
                return jeVar.getInputModeManager();
            case 4:
                qy0 qy02 = (qy0) obj;
                return jeVar.getTextInputService();
            case 5:
                qy0 qy03 = (qy0) obj;
                return jeVar.getSoftwareKeyboardController();
            case 6:
                qy0 qy04 = (qy0) obj;
                return jeVar.getTextToolbar();
            default:
                qy0 qy05 = (qy0) obj;
                return jeVar.getPointerIconService();
        }
    }
}

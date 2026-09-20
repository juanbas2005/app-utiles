package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: rh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ pl5 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh(pl5 pl5, int i) {
        super(1);
        this.x = i;
        this.y = pl5;
    }

    public final Object y(Object obj) {
        Looper looper;
        int i = this.x;
        vs7 vs7 = vs7.a;
        pl5 pl5 = this.y;
        switch (i) {
            case b85.b:
                dy3 D = ((dy3) obj).D();
                D.getClass();
                pl5.r(D);
                return vs7;
            case 1:
                pl5.m71setPopupContentSizefhxjrPA(new we3(((we3) obj).a));
                pl5.s();
                return vs7;
            case 2:
                pl5.W = (p45) obj;
                return vs7;
            default:
                sr2 sr2 = (sr2) obj;
                Handler handler = pl5.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sr2.b();
                } else {
                    Handler handler2 = pl5.getHandler();
                    if (handler2 != null) {
                        handler2.post(new vd(3, sr2));
                    }
                }
                return vs7;
        }
    }
}

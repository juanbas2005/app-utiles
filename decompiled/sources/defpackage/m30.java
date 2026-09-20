package defpackage;

import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: m30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m30 implements jw1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void b() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case b85.b:
                ((h30) obj2).b((ax0) obj);
                return;
            case 1:
                ((zs4) obj2).D.j.M0((qu1) obj);
                return;
            case 2:
                ((lb3) obj2).a.k((jb3) obj);
                return;
            case 3:
                ((x34) obj2).y.k(obj);
                return;
            case 4:
                for (zs4 c2 : (List) ((a37) obj2).getValue()) {
                    ((hx0) obj).b().c(c2);
                }
                return;
            case 5:
                ((fx0) obj2).h();
                ((bw4) obj).e = null;
                return;
            case 6:
                ((h30) obj2).b((mx0) obj);
                return;
            case 7:
                aq4 aq4 = (aq4) obj2;
                eo5 eo5 = (eo5) aq4.getValue();
                if (eo5 != null) {
                    do5 do5 = new do5(eo5);
                    ap4 ap4 = (ap4) obj;
                    if (ap4 != null) {
                        ap4.c(do5);
                    }
                    aq4.setValue((Object) null);
                    return;
                }
                return;
            case 8:
                ((fg7) obj2).c.remove((Object) (vr2) obj);
                return;
            case 9:
                ((mm7) obj2).k.remove((Object) (mm7) obj);
                return;
            case 10:
                mm7 mm7 = (mm7) obj2;
                mm7.getClass();
                am7 am7 = (am7) ((bm7) obj).b.getValue();
                if (am7 != null) {
                    mm7.j.remove((Object) am7.w);
                    return;
                }
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((mm7) obj2).j.remove((Object) (im7) obj);
                return;
            default:
                ib8 ib8 = (ib8) obj2;
                View view = (View) obj;
                int i2 = ib8.u - 1;
                ib8.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = e58.a;
                    w48.c(view, (l45) null);
                    e58.o(view, (us0) null);
                    view.removeOnAttachStateChangeListener(ib8.v);
                    return;
                }
                return;
        }
    }
}

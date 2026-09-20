package defpackage;

import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* renamed from: h89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h89 implements dt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h89(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final ListenableFuture apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case b85.b:
                w89 w89 = (w89) obj2;
                int i2 = ((zzmk) obj).w;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !w89.h.g()) {
                    w89.b();
                }
                return f93.x;
            case 1:
                fm8 fm8 = (fm8) obj2;
                fm8.getClass();
                a29 a29 = new a29(fm8, (t99) obj);
                jm4 a2 = ((x49) fm8.x).a();
                ho7 ho7 = new ho7(a29);
                a2.execute(ho7);
                return ho7;
            case 2:
                Void voidR = (Void) obj;
                return pt2.e((ListenableFuture) ((ca9) obj2).e.get());
            case 3:
                return pt2.d(((n89) obj2).apply(obj));
            case 4:
                ib9 ib9 = (ib9) obj;
                return ((eb9) obj2).e.O0();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}

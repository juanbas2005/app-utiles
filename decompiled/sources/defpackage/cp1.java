package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: cp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cp1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cp1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case b85.b:
                return ((dp1) obj3).w.submit(new ga(20, (Object) (Callable) obj2, (Object) (ji8) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((lp5) obj3).e;
                he8 x = workDatabase.x();
                x.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) sg3.O(x.a, true, false, new sd8(str, 12)));
                return workDatabase.w().e(str);
        }
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: hb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hb9 implements dt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hb9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case b85.b:
                o00 o00 = (o00) this.b;
                h3 h3Var = (h3) this.d;
                if (pt2.b((h3) this.c).equals(pt2.b(h3Var))) {
                    return pt2.d(obj);
                }
                l99 l99 = new l99(2, o00, h3Var);
                int i = mc9.a;
                h3 g = pt2.g(h3Var, new l99(4, vb9.a(), l99), (jl6) o00.e);
                synchronized (o00.i) {
                }
                return g;
            default:
                return ((eb9) this.b).c.k((l99) this.c, (Executor) this.d);
        }
    }
}

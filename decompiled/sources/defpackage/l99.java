package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l99 implements dt {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ l99(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, os2] */
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case b85.b:
                n99 n99 = (n99) this.b;
                Void voidR = (Void) obj;
                return ((a69) n99.d.get()).a(new k68(n99, (q99) this.c));
            case 1:
                List list = (List) this.b;
                ib9 ib9 = (ib9) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    db9 db9 = new db9(this, arrayList, size);
                    int i = mc9.a;
                    l99 l99 = new l99(4, vb9.a(), db9);
                    fv1 fv1 = fv1.w;
                    return pt2.g(pt2.f(pt2.g(pt2.e(ib9.a.e.O0()), new l99(4, vb9.a(), new l99(3, ib9, l99)), fv1), new Object(), fv1), new l99(4, vb9.a(), new db9(this, size, arrayList)), fv1);
                }
                throw pb4.g(it);
            case 2:
                o00 o00 = (o00) this.b;
                h3 h3Var = (h3) this.c;
                o00.m((Uri) pt2.b((ListenableFuture) o00.c), obj);
                synchronized (o00.i) {
                    o00.k = h3Var;
                }
                return pt2.d(obj);
            case 3:
                Void voidR2 = (Void) obj;
                return ((ib9) this.b).a.c.k((l99) this.c, fv1.w);
            default:
                ic9 c2 = vb9.c();
                jc9 b2 = vb9.b(c2, (jc9) this.b);
                try {
                    ListenableFuture apply = ((dt) this.c).apply(obj);
                    if (apply != null) {
                        vb9.b(c2, b2);
                        return apply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } catch (Throwable th) {
                    vb9.b(c2, b2);
                    throw th;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                dt dtVar = (dt) this.c;
                StringBuilder sb = new StringBuilder(dtVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(dtVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}

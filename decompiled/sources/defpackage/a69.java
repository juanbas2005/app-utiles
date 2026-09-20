package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.ApiException;
import java.io.Serializable;

/* renamed from: a69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a69 {
    public final b49 a;

    public a69(b49 b49) {
        this.a = b49;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, i49] */
    public static f0 b(yb9 yb9) {
        ? obj = new Object();
        obj.D = yb9;
        n49 n49 = new n49(0, obj);
        fv1 fv1 = fv1.w;
        yb9.c(fv1, n49);
        return pt2.a(obj, ApiException.class, y59.b, fv1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [uw2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [ge2, java.lang.Object] */
    public final f0 a(k68 k68) {
        String str;
        b49 b49 = this.a;
        Class<f49> cls = f49.class;
        String simpleName = cls.getSimpleName();
        Looper looper = b49.g;
        z65.l("Looper must not be null", looper);
        ? obj = new Object();
        obj.a = new iy2(looper);
        z65.h(simpleName);
        obj.b = new x84(k68, simpleName);
        String q = i95.q();
        if (q == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int identityHashCode = System.identityHashCode(cls);
            StringBuilder sb = new StringBuilder(q.length() + 1 + String.valueOf(identityHashCode).length());
            sb.append(q);
            sb.append("|");
            sb.append(identityHashCode);
            str = sb.toString();
        }
        fm8 fm8 = new fm8((Object) b49, (Serializable) str, (Object) obj, 5);
        fx8 fx8 = fx8.A;
        ? obj2 = new Object();
        obj2.d = obj;
        obj2.b = fm8;
        obj2.c = fx8;
        obj2.e = new cc2[]{mp7.F};
        obj2.a = false;
        x84 x84 = (x84) ((uw2) obj2.d).b;
        z65.l("Key must not be null", x84);
        uw2 uw2 = (uw2) obj2.d;
        l90 l90 = new l90(obj2, uw2, (cc2[]) obj2.e, obj2.a);
        rg4 rg4 = new rg4((ge2) obj2, x84);
        z65.l("Listener has already been released.", (x84) uw2.b);
        pw2 pw2 = b49.k;
        pw2.getClass();
        xb7 xb7 = new xb7();
        pw2.c(xb7, 0, b49);
        ug8 ug8 = new ug8(new eh8(new vg8(l90, rg4), xb7), pw2.E.get(), b49);
        ph8 ph8 = pw2.I;
        ph8.sendMessage(ph8.obtainMessage(8, ug8));
        return b(xb7.a);
    }
}

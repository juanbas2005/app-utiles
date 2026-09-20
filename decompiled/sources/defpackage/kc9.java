package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.TreeMap;

/* renamed from: kc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kc9 implements ct, g61 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public kc9() {
        this.w = 1;
        this.x = new TreeMap();
        this.y = new TreeMap();
    }

    public void a(no7 no7, cf4 cf4) {
        int i;
        k49 k49 = new k49(cf4);
        TreeMap treeMap = (TreeMap) this.x;
        for (Integer num : treeMap.keySet()) {
            wi8 a = ((wi8) cf4.y).clone();
            bq8 a2 = ((aq8) treeMap.get(num)).a(no7, Collections.singletonList(k49));
            if (a2 instanceof wn8) {
                i = ya5.D(((wn8) a2).w.doubleValue());
            } else {
                i = -1;
            }
            if (i == 2 || i == -1) {
                cf4.y = a;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.y;
        for (Integer num2 : treeMap2.keySet()) {
            bq8 a3 = ((aq8) treeMap2.get(num2)).a(no7, Collections.singletonList(k49));
            if (a3 instanceof wn8) {
                ya5.D(((wn8) a3).w.doubleValue());
            }
        }
    }

    public Object c(yb9 yb9) {
        Bundle bundle;
        ha6 ha6 = (ha6) this.x;
        Bundle bundle2 = (Bundle) this.y;
        ha6.getClass();
        if (yb9.k() && (bundle = (Bundle) yb9.i()) != null && bundle.containsKey("google.messenger")) {
            return ha6.b(bundle2).l(gv1.y, hr2.y);
        }
        return yb9;
    }

    public ListenableFuture call() {
        ic9 c = vb9.c();
        jc9 b = vb9.b(c, (jc9) this.x);
        try {
            ListenableFuture call = ((ct) this.y).call();
            vb9.b(c, b);
            call.getClass();
            return call;
        } catch (Throwable th) {
            vb9.b(c, b);
            throw th;
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                ct ctVar = (ct) this.y;
                StringBuilder sb = new StringBuilder(ctVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(ctVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kc9(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}

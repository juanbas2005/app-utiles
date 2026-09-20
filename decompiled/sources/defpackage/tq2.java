package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: tq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tq2 extends r58 {
    public static final jo1 h = new jo1(1);
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    public tq2(boolean z) {
        this.e = z;
    }

    public final void d() {
        if (rq2.L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(bq2 bq2, boolean z) {
        if (rq2.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + bq2);
        }
        g(bq2.A, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tq2.class == obj.getClass()) {
            tq2 tq2 = (tq2) obj;
            if (!this.b.equals(tq2.b) || !this.c.equals(tq2.c) || !this.d.equals(tq2.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f(String str, boolean z) {
        if (rq2.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z);
    }

    public final void g(String str, boolean z) {
        HashMap hashMap = this.c;
        tq2 tq2 = (tq2) hashMap.get(str);
        if (tq2 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(tq2.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tq2.f((String) it.next(), true);
                }
            }
            tq2.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        z58 z58 = (z58) hashMap2.get(str);
        if (z58 != null) {
            z58.a();
            hashMap2.remove(str);
        }
    }

    public final void h(bq2 bq2) {
        if (this.g) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(bq2.A) != null && rq2.L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + bq2);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

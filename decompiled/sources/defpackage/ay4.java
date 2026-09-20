package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Region;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Callable;

/* renamed from: ay4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ay4 implements ov3, q48, va6, lr, g8, pl, z98, v50, y36, ct {
    public final /* synthetic */ int w;
    public final Object x;

    public ay4(int i) {
        this.w = i;
        switch (i) {
            case 8:
                this.x = new Region();
                return;
            case 20:
                this.x = new HashMap();
                return;
            default:
                this.x = new Stack();
                return;
        }
    }

    public void a(int i) {
        ((nw2) this.x).a(i);
    }

    public void accept(Object obj, Object obj2) {
        vh8 vh8 = new vh8((xb7) obj2);
        ni8 ni8 = (ni8) ((xh8) obj).l();
        String str = ((wh8) this.x).l;
        Parcel a = ni8.a();
        int i = bi8.a;
        a.writeStrongBinder(vh8);
        a.writeString(str);
        ni8.b(a, 2);
    }

    public int b(View view) {
        return (view.getTop() - ((yy5) view.getLayoutParams()).b.top) - ((yy5) view.getLayoutParams()).topMargin;
    }

    public ListenableFuture call() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 21:
                ho7 ho7 = new ho7((Callable) obj);
                fv1.w.execute(ho7);
                return ho7;
            default:
                o00 o00 = (o00) obj;
                gb9 gb9 = new gb9(o00, 3);
                int i2 = mc9.a;
                return pt2.e(pt2.g((ListenableFuture) o00.c, new l99(4, vb9.a(), gb9), (jl6) o00.e));
        }
    }

    public Object d(eh6 eh6, Float f, Float f2, vr2 vr2, zw6 zw6) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        eh6 eh62 = eh6;
        Object e = t35.e(eh62, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, gr8.a(0.0f, floatValue2, 28), (hl) this.x, vr2, zw6);
        if (e == p81.w) {
            return e;
        }
        return (el) e;
    }

    public void e() {
        ((nw2) this.x).e();
    }

    public void f(bg0 bg0) {
        if (bg0.n()) {
            int size = bg0.size();
            int[] iArr = j96.D;
            int binarySearch = Arrays.binarySearch(iArr, size);
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i = iArr[binarySearch + 1];
            Stack stack = (Stack) this.x;
            if (stack.isEmpty() || ((bg0) stack.peek()).size() >= i) {
                stack.push(bg0);
                return;
            }
            int i2 = iArr[binarySearch];
            bg0 bg02 = (bg0) stack.pop();
            while (!stack.isEmpty() && ((bg0) stack.peek()).size() < i2) {
                bg02 = new j96((bg0) stack.pop(), bg02);
            }
            j96 j96 = new j96(bg02, bg0);
            while (!stack.isEmpty()) {
                int[] iArr2 = j96.D;
                int binarySearch2 = Arrays.binarySearch(iArr2, j96.x);
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (((bg0) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                    break;
                }
                j96 = new j96((bg0) stack.pop(), j96);
            }
            stack.push(j96);
        } else if (bg0 instanceof j96) {
            j96 j962 = (j96) bg0;
            f(j962.y);
            f(j962.z);
        } else {
            String valueOf = String.valueOf(bg0.getClass());
            h.q(f21.l(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
        }
    }

    public String g(String str) {
        str.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.x;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, "");
        }
        return null;
    }

    public ih2 get(int i) {
        return (ih2) this.x;
    }

    public int h() {
        return ((xy5) this.x).G();
    }

    public void i(uq4 uq4, Object obj) {
        ow5 ow5 = (ow5) this.x;
        String b = uq4.b();
        if ("k".equals(b)) {
            if (obj instanceof Integer) {
                gv3.x.getClass();
                gv3 gv3 = (gv3) gv3.y.get((Integer) obj);
                if (gv3 == null) {
                    gv3 = gv3.z;
                }
                ow5.C = gv3;
            }
        } else if ("mv".equals(b)) {
            if (obj instanceof int[]) {
                ow5.w = (int[]) obj;
            }
        } else if ("xs".equals(b)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.isEmpty()) {
                    ow5.x = str;
                }
            }
        } else if (!"xi".equals(b)) {
            "pn".equals(b);
        } else if (obj instanceof Integer) {
            ow5.y = ((Integer) obj).intValue();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.net.Network} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.net.Network} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.net.Network} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.net.Network} */
    /* JADX WARNING: Multi-variable type inference failed */
    public Network j() {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.x;
        Network network = null;
        if (connectivityManager == null) {
            return null;
        }
        try {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            allNetworks.getClass();
            obj = qs.p1(allNetworks);
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (obj instanceof m66) {
            obj = a42.w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Network network2 = (Network) next;
            network2.getClass();
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    z2 = true;
                }
                obj3 = Boolean.valueOf(z2);
            } catch (Throwable th2) {
                obj3 = new m66(th2);
            }
            Object obj4 = Boolean.FALSE;
            if (obj3 instanceof m66) {
                obj3 = obj4;
            }
            if (((Boolean) obj3).booleanValue()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Network network3 = next2;
            network3.getClass();
            try {
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network3);
                if (networkCapabilities2 == null || !networkCapabilities2.hasCapability(16)) {
                    z = false;
                } else {
                    z = true;
                }
                obj2 = Boolean.valueOf(z);
            } catch (Throwable th3) {
                obj2 = new m66(th3);
            }
            Object obj5 = Boolean.FALSE;
            if (obj2 instanceof m66) {
                obj2 = obj5;
            }
            if (!((Boolean) obj2).booleanValue()) {
                network = next2;
                break;
            }
        }
        Network network4 = network;
        if (network4 == null) {
            return (Network) dt0.y0(arrayList);
        }
        return network4;
    }

    public int k() {
        xy5 xy5 = (xy5) this.x;
        return xy5.o - xy5.D();
    }

    public pv3 m(uq4 uq4) {
        String b = uq4.b();
        if ("d1".equals(b)) {
            return new mw5(this, 0);
        }
        if ("d2".equals(b)) {
            return new mw5(this, 1);
        }
        return null;
    }

    public ua6 n(String str) {
        str.getClass();
        j87 j87 = (j87) this.x;
        String databaseName = j87.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                h.j(f21.h("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !d57.d1('/', databaseName, databaseName).equals(d57.d1('/', str, str))) {
            ku4.m("This driver is configured to open a database named '", j87.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new h87(j87.P());
    }

    public ov3 p(gq0 gq0, uq4 uq4) {
        return null;
    }

    public View q(int i) {
        return ((xy5) this.x).u(i);
    }

    public int r(View view) {
        return view.getBottom() + ((yy5) view.getLayoutParams()).b.bottom + ((yy5) view.getLayoutParams()).bottomMargin;
    }

    public boolean s() {
        return true;
    }

    public void t(String str, String str2) {
        str.getClass();
        SharedPreferences.Editor putString = ((SharedPreferences) this.x).edit().putString(str, str2);
        putString.getClass();
        putString.apply();
    }

    public void u(String str) {
        str.getClass();
        SharedPreferences.Editor remove = ((SharedPreferences) this.x).edit().remove(str);
        remove.getClass();
        remove.apply();
    }

    public void v(int i) {
        RecyclerView recyclerView = (RecyclerView) this.x;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void w(se3 se3) {
        ((Region) this.x).set(se3.a, se3.b, se3.c, se3.d);
    }

    public void x(int i, String str, List list, boolean z, boolean z2) {
        mz8 mz8;
        j19 j19 = (j19) this.x;
        int i2 = i - 1;
        if (i2 == 0) {
            pz8 pz8 = ((y19) j19.w).B;
            y19.g(pz8);
            mz8 = pz8.I;
        } else if (i2 != 1) {
            if (i2 == 3) {
                pz8 pz82 = ((y19) j19.w).B;
                y19.g(pz82);
                mz8 = pz82.J;
            } else if (i2 != 4) {
                pz8 pz83 = ((y19) j19.w).B;
                y19.g(pz83);
                mz8 = pz83.H;
            } else if (z) {
                pz8 pz84 = ((y19) j19.w).B;
                y19.g(pz84);
                mz8 = pz84.F;
            } else if (!z2) {
                pz8 pz85 = ((y19) j19.w).B;
                y19.g(pz85);
                mz8 = pz85.G;
            } else {
                pz8 pz86 = ((y19) j19.w).B;
                y19.g(pz86);
                mz8 = pz86.E;
            }
        } else if (z) {
            pz8 pz87 = ((y19) j19.w).B;
            y19.g(pz87);
            mz8 = pz87.C;
        } else if (!z2) {
            pz8 pz88 = ((y19) j19.w).B;
            y19.g(pz88);
            mz8 = pz88.D;
        } else {
            pz8 pz89 = ((y19) j19.w).B;
            y19.g(pz89);
            mz8 = pz89.B;
        }
        int size = list.size();
        if (size == 1) {
            mz8.b(str, list.get(0));
        } else if (size == 2) {
            mz8.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            mz8.a(str);
        } else {
            mz8.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void c() {
    }

    public ay4(j87 j87) {
        this.w = 11;
        j87.getClass();
        this.x = j87;
    }

    public ay4(ub8 ub8, n98 n98, s63 s63) {
        this.w = 16;
        this.x = n98;
    }

    public ay4(Context context) {
        this.w = 2;
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        this.x = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [jy6, java.lang.Object, rg4] */
    public ay4(View view) {
        this.w = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            ? rg4 = new rg4(9, (Object) view);
            rg4.y = view;
            this.x = rg4;
            return;
        }
        this.x = new rg4(9, (Object) view);
    }

    public void l(uq4 uq4, jq0 jq0) {
    }

    public /* synthetic */ ay4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public void o(uq4 uq4, gq0 gq0, uq4 uq42) {
    }
}

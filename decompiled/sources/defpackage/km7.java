package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: km7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class km7 implements Cloneable {
    public static final Animator[] U = new Animator[0];
    public static final int[] V = {2, 1, 3, 4};
    public static final z53 W = new z53(12);
    public static final ThreadLocal X = new ThreadLocal();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public am6 C = new am6(28);
    public am6 D = new am6(28);
    public vy E = null;
    public final int[] F = V;
    public ArrayList G;
    public ArrayList H;
    public jm7[] I;
    public final ArrayList J = new ArrayList();
    public Animator[] K = U;
    public int L = 0;
    public boolean M = false;
    public boolean N = false;
    public km7 O = null;
    public ArrayList P = null;
    public ArrayList Q = new ArrayList();
    public z53 R = W;
    public long S;
    public long T;
    public final String w = getClass().getName();
    public long x = -1;
    public long y = -1;
    public TimeInterpolator z = null;

    public static void b(am6 am6, View view, xm7 xm7) {
        js jsVar = (js) am6.A;
        SparseArray sparseArray = (SparseArray) am6.y;
        vc4 vc4 = (vc4) am6.z;
        ((js) am6.x).put(view, xm7);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = e58.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (jsVar.containsKey(transitionName)) {
                jsVar.put(transitionName, (Object) null);
            } else {
                jsVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (vc4.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) vc4.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        vc4.e(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                vc4.e(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [js, java.lang.Object, zt6] */
    public static js p() {
        ThreadLocal threadLocal = X;
        js jsVar = (js) threadLocal.get();
        if (jsVar != null) {
            return jsVar;
        }
        ? zt6 = new zt6(0);
        threadLocal.set(zt6);
        return zt6;
    }

    public static boolean v(xm7 xm7, xm7 xm72, String str) {
        Object obj = xm7.a.get(str);
        Object obj2 = xm72.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.M) {
            if (!this.N) {
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.K);
                this.K = U;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.K = animatorArr;
                w(this, kj6.B, false);
            }
            this.M = false;
        }
    }

    public void B() {
        J();
        js p = p();
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new yl7(this, p));
                    long j = this.y;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.x;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.z;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new s7(5, (Object) this));
                    animator.start();
                }
            }
        }
        this.Q.clear();
        m();
    }

    public void C(long j, long j2) {
        boolean z2;
        long j3 = j;
        long j4 = this.S;
        int i = 0;
        if (j3 < j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if ((i2 < 0 && j3 >= 0) || (j2 > j4 && j3 <= j4)) {
            this.N = false;
            w(this, kj6.x, z2);
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.K);
        this.K = U;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            dm7.b(animator, Math.min(Math.max(0, j3), dm7.a(animator)));
            i++;
            j4 = j4;
        }
        long j5 = j4;
        this.K = animatorArr;
        int i3 = (j3 > j5 ? 1 : (j3 == j5 ? 0 : -1));
        if ((i3 > 0 && j2 <= j5) || (j3 < 0 && i2 >= 0)) {
            if (i3 > 0) {
                this.N = true;
            }
            w(this, kj6.y, z2);
        }
    }

    public void D(long j) {
        this.y = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.z = timeInterpolator;
    }

    public void G(z53 z53) {
        if (z53 == null) {
            this.R = W;
        } else {
            this.R = z53;
        }
    }

    public void I(long j) {
        this.x = j;
    }

    public final void J() {
        if (this.L == 0) {
            w(this, kj6.x, false);
            this.N = false;
        }
        this.L++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.y != -1) {
            sb.append("dur(");
            sb.append(this.y);
            sb.append(") ");
        }
        if (this.x != -1) {
            sb.append("dly(");
            sb.append(this.x);
            sb.append(") ");
        }
        if (this.z != null) {
            sb.append("interp(");
            sb.append(this.z);
            sb.append(") ");
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.B;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(jm7 jm7) {
        if (this.P == null) {
            this.P = new ArrayList();
        }
        this.P.add(jm7);
    }

    public void c() {
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.K);
        this.K = U;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.K = animatorArr;
        w(this, kj6.z, false);
    }

    public abstract void d(xm7 xm7);

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                xm7 xm7 = new xm7(view);
                if (z2) {
                    g(xm7);
                } else {
                    d(xm7);
                }
                xm7.c.add(this);
                f(xm7);
                if (z2) {
                    b(this.C, view, xm7);
                } else {
                    b(this.D, view, xm7);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z2);
                }
            }
        }
    }

    public abstract void g(xm7 xm7);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.B;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    xm7 xm7 = new xm7(findViewById);
                    if (z2) {
                        g(xm7);
                    } else {
                        d(xm7);
                    }
                    xm7.c.add(this);
                    f(xm7);
                    if (z2) {
                        b(this.C, findViewById, xm7);
                    } else {
                        b(this.D, findViewById, xm7);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                xm7 xm72 = new xm7(view);
                if (z2) {
                    g(xm72);
                } else {
                    d(xm72);
                }
                xm72.c.add(this);
                f(xm72);
                if (z2) {
                    b(this.C, view, xm72);
                } else {
                    b(this.D, view, xm72);
                }
            }
            return;
        }
        e(viewGroup, z2);
    }

    public final void i(boolean z2) {
        if (z2) {
            ((js) this.C.x).clear();
            ((SparseArray) this.C.y).clear();
            ((vc4) this.C.z).a();
            return;
        }
        ((js) this.D.x).clear();
        ((SparseArray) this.D.y).clear();
        ((vc4) this.D.z).a();
    }

    /* renamed from: j */
    public km7 clone() {
        try {
            km7 km7 = (km7) super.clone();
            km7.Q = new ArrayList();
            km7.C = new am6(28);
            km7.D = new am6(28);
            km7.G = null;
            km7.H = null;
            km7.O = this;
            km7.P = null;
            return km7;
        } catch (CloneNotSupportedException e) {
            rf2.o(e);
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, xm7 xm7, xm7 xm72) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [zl7, java.lang.Object] */
    public void l(ViewGroup viewGroup, am6 am6, am6 am62, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        xm7 xm7;
        View view;
        xm7 xm72;
        Animator animator;
        js p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            xm7 xm73 = (xm7) arrayList.get(i3);
            xm7 xm74 = (xm7) arrayList2.get(i3);
            if (xm73 != null && !xm73.c.contains(this)) {
                xm73 = null;
            }
            if (xm74 != null && !xm74.c.contains(this)) {
                xm74 = null;
            }
            if (!(xm73 == null && xm74 == null) && (xm73 == null || xm74 == null || t(xm73, xm74))) {
                ViewGroup viewGroup2 = viewGroup;
                Animator k = k(viewGroup2, xm73, xm74);
                if (k != null) {
                    String str = this.w;
                    if (xm74 != null) {
                        view = xm74.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            xm72 = new xm7(view);
                            xm7 xm75 = (xm7) ((js) am62.x).get(view);
                            i2 = size;
                            if (xm75 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    String str2 = q[i4];
                                    int i5 = i3;
                                    xm72.a.put(str2, xm75.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    xm75 = xm75;
                                }
                            }
                            i = i3;
                            int i6 = p.y;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = k;
                                    break;
                                }
                                zl7 zl7 = (zl7) p.get((Animator) p.g(i7));
                                if (zl7.c != null && zl7.a == view && zl7.b.equals(str) && zl7.c.equals(xm72)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            am6 am63 = am62;
                            i2 = size;
                            i = i3;
                            animator = k;
                            xm72 = null;
                        }
                        k = animator;
                        xm7 = xm72;
                    } else {
                        am6 am64 = am62;
                        i2 = size;
                        i = i3;
                        view = xm73.b;
                        xm7 = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup2.getWindowId();
                        ? obj = new Object();
                        obj.a = view;
                        obj.b = str;
                        obj.c = xm7;
                        obj.d = windowId;
                        obj.e = this;
                        obj.f = k;
                        p.put(k, obj);
                        this.Q.add(k);
                    }
                    i3 = i + 1;
                    size = i2;
                }
            } else {
                ViewGroup viewGroup3 = viewGroup;
            }
            am6 am65 = am62;
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                zl7 zl72 = (zl7) p.get((Animator) this.Q.get(sparseIntArray.keyAt(i8)));
                long startDelay = zl72.f.getStartDelay();
                zl72.f.setStartDelay(startDelay + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.L - 1;
        this.L = i;
        if (i == 0) {
            w(this, kj6.y, false);
            for (int i2 = 0; i2 < ((vc4) this.C.z).g(); i2++) {
                View view = (View) ((vc4) this.C.z).h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((vc4) this.D.z).g(); i3++) {
                View view2 = (View) ((vc4) this.D.z).h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.N = true;
        }
    }

    public final xm7 n(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        vy vyVar = this.E;
        if (vyVar != null) {
            return vyVar.n(view, z2);
        }
        if (z2) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            xm7 xm7 = (xm7) arrayList.get(i);
            if (xm7 == null) {
                return null;
            }
            if (xm7.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z2) {
            arrayList2 = this.H;
        } else {
            arrayList2 = this.G;
        }
        return (xm7) arrayList2.get(i);
    }

    public final km7 o() {
        vy vyVar = this.E;
        if (vyVar != null) {
            return vyVar.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final xm7 r(View view, boolean z2) {
        am6 am6;
        vy vyVar = this.E;
        if (vyVar != null) {
            return vyVar.r(view, z2);
        }
        if (z2) {
            am6 = this.C;
        } else {
            am6 = this.D;
        }
        return (xm7) ((js) am6.x).get(view);
    }

    public boolean s() {
        return !this.J.isEmpty();
    }

    public boolean t(xm7 xm7, xm7 xm72) {
        if (!(xm7 == null || xm72 == null)) {
            String[] q = q();
            if (q != null) {
                for (String v : q) {
                    if (v(xm7, xm72, v)) {
                        return true;
                    }
                }
            } else {
                for (String v2 : xm7.a.keySet()) {
                    if (v(xm7, xm72, v2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.B;
        if ((size != 0 || arrayList2.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !arrayList2.contains(view)) {
            return false;
        }
        return true;
    }

    public final void w(km7 km7, kj6 kj6, boolean z2) {
        km7 km72 = this.O;
        if (km72 != null) {
            km72.w(km7, kj6, z2);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.P.size();
            jm7[] jm7Arr = this.I;
            if (jm7Arr == null) {
                jm7Arr = new jm7[size];
            }
            this.I = null;
            jm7[] jm7Arr2 = (jm7[]) this.P.toArray(jm7Arr);
            for (int i = 0; i < size; i++) {
                jm7 jm7 = jm7Arr2[i];
                switch (kj6.w) {
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        jm7.d(km7);
                        break;
                    case 12:
                        jm7.a(km7);
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        jm7.f(km7);
                        break;
                    case 14:
                        jm7.b();
                        break;
                    default:
                        jm7.e();
                        break;
                }
                jm7Arr2[i] = null;
            }
            this.I = jm7Arr2;
        }
    }

    public void x(View view) {
        if (!this.N) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.K);
            this.K = U;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.K = animatorArr;
            w(this, kj6.A, false);
            this.M = true;
        }
    }

    public void y() {
        js p = p();
        this.S = 0;
        int i = 0;
        while (true) {
            int size = this.Q.size();
            ArrayList arrayList = this.Q;
            if (i < size) {
                Animator animator = (Animator) arrayList.get(i);
                zl7 zl7 = (zl7) p.get(animator);
                if (!(animator == null || zl7 == null)) {
                    Animator animator2 = zl7.f;
                    long j = this.y;
                    if (j >= 0) {
                        animator2.setDuration(j);
                    }
                    long j2 = this.x;
                    if (j2 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.z;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    this.J.add(animator);
                    this.S = Math.max(this.S, dm7.a(animator));
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public km7 z(jm7 jm7) {
        km7 km7;
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            if (!arrayList.remove(jm7) && (km7 = this.O) != null) {
                km7.z(jm7);
            }
            if (this.P.size() == 0) {
                this.P = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(u55 u55) {
    }

    public void f(xm7 xm7) {
    }
}

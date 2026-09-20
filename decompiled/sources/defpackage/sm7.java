package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sm7 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public km7 w;
    public ViewGroup x;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: xm7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01e1 A[EDGE_INSN: B:131:0x01e1->B:88:0x01e1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0209  */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        js jsVar;
        js jsVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        zl7 zl7;
        boolean z;
        xm7 xm7;
        View view;
        View view2;
        boolean z2;
        km7 km7 = this.w;
        ViewGroup viewGroup = this.x;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!tm7.c.remove(viewGroup)) {
            return true;
        }
        js b = tm7.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(km7);
            km7.a(new rm7(this, b));
            i = 0;
            km7.h(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((km7) it.next()).A(viewGroup);
                }
            }
            km7.G = new ArrayList();
            km7.H = new ArrayList();
            am6 am6 = km7.C;
            am6 am62 = km7.D;
            jsVar = new js((js) am6.x);
            jsVar2 = new js((js) am62.x);
            i2 = 0;
            while (true) {
                iArr = km7.F;
                if (i2 < iArr.length) {
                    break;
                }
                int i6 = iArr[i2];
                if (i6 == z3) {
                    z = z3;
                    for (int i7 = jsVar.y - 1; i7 >= 0; i7--) {
                        View view3 = (View) jsVar.g(i7);
                        if (view3 != null && km7.u(view3) && (xm7 = (xm7) jsVar2.remove(view3)) != null && km7.u(xm7.b)) {
                            km7.G.add((xm7) jsVar.h(i7));
                            km7.H.add(xm7);
                        }
                    }
                } else if (i6 == 2) {
                    z = z3;
                    js jsVar3 = (js) am6.A;
                    js jsVar4 = (js) am62.A;
                    int i8 = jsVar3.y;
                    for (int i9 = 0; i9 < i8; i9++) {
                        View view4 = (View) jsVar3.j(i9);
                        if (view4 != null && km7.u(view4) && (view = (View) jsVar4.get(jsVar3.g(i9))) != null && km7.u(view)) {
                            xm7 xm72 = (xm7) jsVar.get(view4);
                            xm7 xm73 = (xm7) jsVar2.get(view);
                            if (!(xm72 == null || xm73 == null)) {
                                km7.G.add(xm72);
                                km7.H.add(xm73);
                                jsVar.remove(view4);
                                jsVar2.remove(view);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        vc4 vc4 = (vc4) am6.z;
                        vc4 vc42 = (vc4) am62.z;
                        int g = vc4.g();
                        int i10 = i;
                        while (i10 < g) {
                            View view5 = (View) vc4.h(i10);
                            if (view5 == null || !km7.u(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) vc42.b(vc4.d(i10));
                                if (view6 != null && km7.u(view6)) {
                                    xm7 xm74 = (xm7) jsVar.get(view5);
                                    xm7 xm75 = (xm7) jsVar2.get(view6);
                                    if (!(xm74 == null || xm75 == null)) {
                                        z2 = z4;
                                        km7.G.add(xm74);
                                        km7.H.add(xm75);
                                        jsVar.remove(view5);
                                        jsVar2.remove(view6);
                                    }
                                }
                                z2 = z4;
                            }
                            i10++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) am6.y;
                    SparseArray sparseArray2 = (SparseArray) am62.y;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view7 = (View) sparseArray.valueAt(i11);
                        if (view7 != null && km7.u(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && km7.u(view2)) {
                            xm7 xm76 = (xm7) jsVar.get(view7);
                            xm7 xm77 = (xm7) jsVar2.get(view2);
                            if (!(xm76 == null || xm77 == null)) {
                                km7.G.add(xm76);
                                km7.H.add(xm77);
                                jsVar.remove(view7);
                                jsVar2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < jsVar.y; i3++) {
                xm7 xm78 = (xm7) jsVar.j(i3);
                if (km7.u(xm78.b)) {
                    km7.G.add(xm78);
                    km7.H.add((Object) null);
                }
            }
            for (i4 = 0; i4 < jsVar2.y; i4++) {
                xm7 xm79 = (xm7) jsVar2.j(i4);
                if (km7.u(xm79.b)) {
                    km7.H.add(xm79);
                    km7.G.add((Object) null);
                }
            }
            js p = km7.p();
            int i12 = p.y;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) p.g(i5);
                if (!(animator == null || (zl7 = (zl7) p.get(animator)) == null)) {
                    km7 km72 = zl7.e;
                    View view8 = zl7.a;
                    if (view8 != null && windowId.equals(zl7.d)) {
                        xm7 xm710 = zl7.c;
                        boolean z6 = z5;
                        xm7 r = km7.r(view8, z6);
                        xm7 n = km7.n(view8, z6);
                        if (r == null && n == null) {
                            n = ((js) km7.D.x).get(view8);
                        }
                        if (!(r == null && n == null) && km72.t(xm710, n)) {
                            km72.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            ViewGroup viewGroup2 = viewGroup;
            am6 am63 = km7.C;
            km7 km73 = km7;
            km73.l(viewGroup2, am63, km7.D, km7.G, km7.H);
            km73.B();
            return true;
        }
        arrayList = null;
        arrayList2.add(km7);
        km7.a(new rm7(this, b));
        i = 0;
        km7.h(viewGroup, false);
        if (arrayList != null) {
        }
        km7.G = new ArrayList();
        km7.H = new ArrayList();
        am6 am64 = km7.C;
        am6 am622 = km7.D;
        jsVar = new js((js) am64.x);
        jsVar2 = new js((js) am622.x);
        i2 = 0;
        while (true) {
            iArr = km7.F;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < jsVar.y) {
        }
        while (i4 < jsVar2.y) {
        }
        js p2 = km7.p();
        int i122 = p2.y;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i122 - 1;
        while (i5 >= 0) {
        }
        ViewGroup viewGroup22 = viewGroup;
        am6 am632 = km7.C;
        km7 km732 = km7;
        km732.l(viewGroup22, am632, km7.D, km7.G, km7.H);
        km732.B();
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.x;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        tm7.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) tm7.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((km7) it.next()).A(viewGroup);
            }
        }
        this.w.i(true);
    }

    public final void onViewAttachedToWindow(View view) {
    }
}

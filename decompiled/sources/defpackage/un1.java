package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: un1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class un1 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public un1(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
    }

    public static final un1 i(ViewGroup viewGroup, rq2 rq2) {
        viewGroup.getClass();
        rq2.getClass();
        rq2.J().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof un1) {
            return (un1) tag;
        }
        un1 un1 = new un1(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, un1);
        return un1;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0:
        while (true) {
            z = true;
            while (it.hasNext()) {
                gz6 gz6 = (gz6) it.next();
                if (!gz6.k.isEmpty()) {
                    ArrayList arrayList2 = gz6.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            fz6 fz6 = (fz6) it2.next();
                            fz6.getClass();
                            if (!(fz6 instanceof qn1)) {
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it0.h0(arrayList3, ((gz6) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(gz6 gz6) {
        gz6.getClass();
        if (gz6.i) {
            hl6.a(gz6.a, gz6.c.M(), this.a);
            gz6.i = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: gz6} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void b(ArrayList arrayList, boolean z) {
        gz6 gz6;
        Object obj;
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            gz6 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gz6 gz62 = (gz6) obj;
            View view = gz62.c.c0;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (!(visibility == 4 || visibility == 8)) {
                        h.q(hl6.k(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (gz62.a != 2) {
                    break;
                }
            }
        }
        gz6 gz63 = (gz6) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            gz6 gz64 = previous;
            View view2 = gz64.c.c0;
            view2.getClass();
            if (!(view2.getAlpha() == 0.0f && view2.getVisibility() == 0)) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (!(visibility2 == 4 || visibility2 == 8)) {
                    h.q(hl6.k(visibility2, "Unknown visibility "));
                    return;
                }
            }
            if (gz64.a == 2) {
                gz6 = previous;
                break;
            }
        }
        gz6 gz65 = gz6;
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Executing operations from " + gz63 + " to " + gz65);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        bq2 bq2 = ((gz6) dt0.G0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aq2 aq2 = ((gz6) it2.next()).c.f0;
            aq2 aq22 = bq2.f0;
            aq2.b = aq22.b;
            aq2.c = aq22.c;
            aq2.d = aq22.d;
            aq2.e = aq22.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = true;
            if (!it3.hasNext()) {
                break;
            }
            gz6 gz66 = (gz6) it3.next();
            arrayList2.add(new on1(gz66, z));
            if (!z ? gz66 != gz65 : gz66 != gz63) {
                z2 = false;
            }
            bq2 bq22 = gz66.c;
            in8 in8 = new in8(gz66);
            if (gz66.a == 2) {
                if (z) {
                    aq2 aq23 = bq22.f0;
                } else {
                    bq22.getClass();
                }
            } else if (z) {
                aq2 aq24 = bq22.f0;
            } else {
                bq22.getClass();
            }
            if (gz66.a == 2) {
                if (z) {
                    aq2 aq25 = bq22.f0;
                } else {
                    aq2 aq26 = bq22.f0;
                }
            }
            if (z2) {
                if (z) {
                    aq2 aq27 = bq22.f0;
                } else {
                    bq22.getClass();
                }
            }
            arrayList3.add(in8);
            gz66.d.add(new ln1(this, gz66, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((tn1) next).K0()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((tn1) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((tn1) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            it0.h0(arrayList7, ((gz6) ((on1) it7.next()).w).k);
        }
        boolean isEmpty = arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z3 = false;
        while (it8.hasNext()) {
            on1 on1 = (on1) it8.next();
            Context context = this.a.getContext();
            gz6 gz67 = (gz6) on1.w;
            context.getClass();
            jz0 d1 = on1.d1(context);
            if (d1 != null) {
                if (((AnimatorSet) d1.y) == null) {
                    arrayList6.add(on1);
                } else {
                    bq2 bq23 = gz67.c;
                    if (gz67.k.isEmpty()) {
                        if (gz67.a == 3) {
                            gz67.i = false;
                        }
                        gz67.j.add(new qn1(on1));
                        z3 = true;
                    } else if (rq2.L(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + bq23 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            on1 on12 = (on1) it9.next();
            gz6 gz68 = (gz6) on12.w;
            bq2 bq24 = gz68.c;
            if (!isEmpty) {
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + bq24 + " as Animations cannot run alongside Transitions.");
                }
            } else if (!z3) {
                gz68.j.add(new nn1(on12));
            } else if (rq2.L(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + bq24 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    public final void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it0.h0(arrayList, ((gz6) it.next()).k);
        }
        List b1 = dt0.b1(dt0.g1(arrayList));
        int size = b1.size();
        for (int i = 0; i < size; i++) {
            ((fz6) b1.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((gz6) list.get(i2));
        }
        List b12 = dt0.b1(list);
        int size3 = b12.size();
        for (int i3 = 0; i3 < size3; i3++) {
            gz6 gz6 = (gz6) b12.get(i3);
            if (gz6.k.isEmpty()) {
                gz6.b();
            }
        }
    }

    public final void d(int i, int i2, wq2 wq2) {
        synchronized (this.b) {
            try {
                bq2 bq2 = wq2.c;
                bq2.getClass();
                gz6 f2 = f(bq2);
                if (f2 == null) {
                    bq2 bq22 = wq2.c;
                    if (!bq22.I) {
                        if (!bq22.H) {
                            f2 = null;
                        }
                    }
                    f2 = g(bq22);
                }
                if (f2 != null) {
                    f2.d(i, i2);
                    return;
                }
                gz6 gz6 = new gz6(i, i2, wq2);
                this.b.add(gz6);
                gz6.d.add(new ln1(this, gz6, 1));
                gz6.d.add(new ln1(this, gz6, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015a, code lost:
        return;
     */
    public final void e() {
        boolean z;
        if (!this.f) {
            if (!this.a.isAttachedToWindow()) {
                h();
                this.e = false;
                return;
            }
            synchronized (this.b) {
                try {
                    ArrayList d1 = dt0.d1(this.c);
                    this.c.clear();
                    Iterator it = d1.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        gz6 gz6 = (gz6) it.next();
                        if (this.b.isEmpty() || !gz6.c.I) {
                            z = false;
                        }
                        gz6.g = z;
                    }
                    Iterator it2 = d1.iterator();
                    while (it2.hasNext()) {
                        gz6 gz62 = (gz6) it2.next();
                        if (this.d) {
                            if (rq2.L(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + gz62);
                            }
                            gz62.b();
                        } else {
                            if (rq2.L(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + gz62);
                            }
                            gz62.a(this.a);
                        }
                        this.d = false;
                        if (!gz62.f) {
                            this.c.add(gz62);
                        }
                    }
                    if (!this.b.isEmpty()) {
                        l();
                        ArrayList d12 = dt0.d1(this.b);
                        if (!d12.isEmpty()) {
                            this.b.clear();
                            this.c.addAll(d12);
                            if (rq2.L(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                            }
                            b(d12, this.e);
                            boolean j = j(d12);
                            Iterator it3 = d12.iterator();
                            boolean z2 = true;
                            while (it3.hasNext()) {
                                if (!((gz6) it3.next()).c.I) {
                                    z2 = false;
                                }
                            }
                            if (!z2 || j) {
                                z = false;
                            }
                            this.d = z;
                            if (rq2.L(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + j + " \ntransition = " + z2);
                            }
                            if (!z2) {
                                k(d12);
                                c(d12);
                            } else if (j) {
                                k(d12);
                                int size = d12.size();
                                for (int i = 0; i < size; i++) {
                                    a((gz6) d12.get(i));
                                }
                            }
                            this.e = false;
                            if (rq2.L(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final gz6 f(bq2 bq2) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gz6 gz6 = (gz6) obj;
            if (sg3.e(gz6.c, bq2) && !gz6.e) {
                break;
            }
        }
        return (gz6) obj;
    }

    public final gz6 g(bq2 bq2) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gz6 gz6 = (gz6) obj;
            if (sg3.e(gz6.c, bq2) && !gz6.e) {
                break;
            }
        }
        return (gz6) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (rq2.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                ArrayList d1 = dt0.d1(this.c);
                Iterator it = d1.iterator();
                while (it.hasNext()) {
                    ((gz6) it.next()).g = false;
                }
                Iterator it2 = d1.iterator();
                while (it2.hasNext()) {
                    gz6 gz6 = (gz6) it2.next();
                    if (rq2.L(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + gz6);
                    }
                    gz6.a(this.a);
                }
                ArrayList d12 = dt0.d1(this.b);
                Iterator it3 = d12.iterator();
                while (it3.hasNext()) {
                    ((gz6) it3.next()).g = false;
                }
                Iterator it4 = d12.iterator();
                while (it4.hasNext()) {
                    gz6 gz62 = (gz6) it4.next();
                    if (rq2.L(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + gz62);
                    }
                    gz62.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List list) {
        float f2;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gz6 gz6 = (gz6) list.get(i);
            wq2 wq2 = gz6.l;
            if (!gz6.h) {
                gz6.h = true;
                int i2 = gz6.b;
                if (i2 == 2) {
                    bq2 bq2 = wq2.c;
                    bq2.getClass();
                    View findFocus = bq2.c0.findFocus();
                    if (findFocus != null) {
                        bq2.j().k = findFocus;
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + bq2);
                        }
                    }
                    View M = gz6.c.M();
                    if (M.getParent() == null) {
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "Adding fragment " + bq2 + " view " + M + " to container in onStart");
                        }
                        wq2.b();
                        M.setAlpha(0.0f);
                    }
                    if (M.getAlpha() == 0.0f && M.getVisibility() == 0) {
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "Making view " + M + " INVISIBLE in onStart");
                        }
                        M.setVisibility(4);
                    }
                    aq2 aq2 = bq2.f0;
                    float f3 = 1.0f;
                    if (aq2 == null) {
                        f2 = 1.0f;
                    } else {
                        f2 = aq2.j;
                    }
                    M.setAlpha(f2);
                    if (rq2.L(2)) {
                        StringBuilder sb = new StringBuilder("Setting view alpha to ");
                        aq2 aq22 = bq2.f0;
                        if (aq22 != null) {
                            f3 = aq22.j;
                        }
                        sb.append(f3);
                        sb.append(" in onStart");
                        Log.v("FragmentManager", sb.toString());
                    }
                } else if (i2 == 3) {
                    bq2 bq22 = wq2.c;
                    bq22.getClass();
                    View M2 = bq22.M();
                    if (rq2.L(2)) {
                        Log.v("FragmentManager", "Clearing focus " + M2.findFocus() + " on view " + M2 + " for Fragment " + bq22);
                    }
                    M2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it0.h0(arrayList, ((gz6) it.next()).k);
        }
        List b1 = dt0.b1(dt0.g1(arrayList));
        int size2 = b1.size();
        for (int i3 = 0; i3 < size2; i3++) {
            fz6 fz6 = (fz6) b1.get(i3);
            fz6.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!fz6.a) {
                fz6.d(viewGroup);
            }
            fz6.a = true;
        }
    }

    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gz6 gz6 = (gz6) it.next();
            int i = 2;
            if (gz6.b == 2) {
                int visibility = gz6.c.M().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i = 3;
                        } else {
                            h.q(hl6.k(visibility, "Unknown visibility "));
                            return;
                        }
                    }
                }
                gz6.d(i, 1);
            }
        }
    }
}

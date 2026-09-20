package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: jm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jm1 extends ty5 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((lz5) arrayList.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.Object, hm1] */
    public final boolean a(lz5 lz5, lz5 lz52, dv5 dv5, dv5 dv52) {
        int i2;
        int i3;
        int i4 = dv5.b;
        int i5 = dv5.c;
        if (lz52.o()) {
            int i6 = dv5.b;
            i2 = dv5.c;
            i3 = i6;
        } else {
            i3 = dv52.b;
            i2 = dv52.c;
        }
        if (lz5 == lz52) {
            return g(lz5, i4, i5, i3, i2);
        }
        lz5 lz53 = lz5;
        View view = lz53.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(lz53);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = lz52.a;
        l(lz52);
        view2.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ? obj = new Object();
        obj.a = lz53;
        obj.b = lz52;
        obj.c = i4;
        obj.d = i5;
        obj.e = i3;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(lz5 lz5) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = lz5.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((im1) arrayList4.get(size)).a == lz5) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(lz5);
                arrayList4.remove(size);
            }
        }
        j(this.k, lz5);
        if (this.h.remove(lz5)) {
            view.setAlpha(1.0f);
            c(lz5);
        }
        if (this.i.remove(lz5)) {
            view.setAlpha(1.0f);
            c(lz5);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, lz5);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((im1) arrayList6.get(size4)).a == lz5) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(lz5);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(lz5)) {
                view.setAlpha(1.0f);
                c(lz5);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(lz5);
        this.o.remove(lz5);
        this.r.remove(lz5);
        this.p.remove(lz5);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            im1 im1 = (im1) arrayList7.get(size);
            View view = im1.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(im1.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((lz5) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            lz5 lz5 = (lz5) arrayList5.get(size3);
            lz5.a.setAlpha(1.0f);
            c(lz5);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            hm1 hm1 = (hm1) arrayList.get(size4);
            lz5 lz52 = hm1.a;
            if (lz52 != null) {
                k(hm1, lz52);
            }
            lz5 lz53 = hm1.b;
            if (lz53 != null) {
                k(hm1, lz53);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    im1 im12 = (im1) arrayList8.get(size6);
                    View view2 = im12.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(im12.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    lz5 lz54 = (lz5) arrayList9.get(size8);
                    lz54.a.setAlpha(1.0f);
                    c(lz54);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    hm1 hm12 = (hm1) arrayList10.get(size10);
                    lz5 lz55 = hm12.a;
                    if (lz55 != null) {
                        k(hm12, lz55);
                    }
                    lz5 lz56 = hm12.b;
                    if (lz56 != null) {
                        k(hm12, lz56);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
                return;
            }
            arrayList11.get(0).getClass();
            ku4.a();
        }
    }

    public final boolean f() {
        if (!this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, im1] */
    public final boolean g(lz5 lz5, int i2, int i3, int i4, int i5) {
        View view = lz5.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) lz5.a.getTranslationY());
        l(lz5);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(lz5);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.j;
        ? obj = new Object();
        obj.a = lz5;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
                return;
            }
            arrayList.get(0).getClass();
            ku4.a();
        }
    }

    public final void j(ArrayList arrayList, lz5 lz5) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hm1 hm1 = (hm1) arrayList.get(size);
            if (k(hm1, lz5) && hm1.a == null && hm1.b == null) {
                arrayList.remove(hm1);
            }
        }
    }

    public final boolean k(hm1 hm1, lz5 lz5) {
        if (hm1.b == lz5) {
            hm1.b = null;
        } else if (hm1.a != lz5) {
            return false;
        } else {
            hm1.a = null;
        }
        View view = lz5.a;
        View view2 = lz5.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(lz5);
        return true;
    }

    public final void l(lz5 lz5) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        lz5.a.animate().setInterpolator(s);
        d(lz5);
    }
}

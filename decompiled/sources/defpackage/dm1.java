package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ jm1 y;

    public /* synthetic */ dm1(jm1 jm1, ArrayList arrayList, int i) {
        this.w = i;
        this.y = jm1;
        this.x = arrayList;
    }

    public final void run() {
        View view;
        int i = this.w;
        ArrayList arrayList = this.x;
        switch (i) {
            case b85.b:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    jm1 jm1 = this.y;
                    if (hasNext) {
                        im1 im1 = (im1) it.next();
                        lz5 lz5 = im1.a;
                        int i2 = im1.b;
                        int i3 = im1.c;
                        int i4 = im1.d;
                        int i5 = im1.e;
                        jm1.getClass();
                        int i6 = i4;
                        View view2 = lz5.a;
                        int i7 = i6 - i2;
                        int i8 = i5 - i3;
                        if (i7 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        jm1.p.add(lz5);
                        animate.setDuration(jm1.e).setListener(new fm1(jm1, lz5, i7, view2, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        jm1.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    jm1 jm12 = this.y;
                    if (hasNext2) {
                        hm1 hm1 = (hm1) it2.next();
                        ArrayList arrayList2 = jm12.r;
                        long j = jm12.f;
                        lz5 lz52 = hm1.a;
                        View view3 = null;
                        if (lz52 == null) {
                            view = null;
                        } else {
                            view = lz52.a;
                        }
                        lz5 lz53 = hm1.b;
                        if (lz53 != null) {
                            view3 = lz53.a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList2.add(hm1.a);
                            duration.translationX((float) (hm1.e - hm1.c));
                            duration.translationY((float) (hm1.f - hm1.d));
                            duration.alpha(0.0f).setListener(new gm1(jm12, hm1, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList2.add(hm1.b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new gm1(jm12, hm1, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList.clear();
                        jm12.n.remove(arrayList);
                        return;
                    }
                }
            default:
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    jm1 jm13 = this.y;
                    if (hasNext3) {
                        lz5 lz54 = (lz5) it3.next();
                        jm13.getClass();
                        View view5 = lz54.a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        jm13.o.add(lz54);
                        animate3.alpha(1.0f).setDuration(jm13.c).setListener(new em1(jm13, lz54, view5, animate3)).start();
                    } else {
                        arrayList.clear();
                        jm13.l.remove(arrayList);
                        return;
                    }
                }
        }
    }
}

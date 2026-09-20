package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: ea8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ea8 extends WindowInsetsAnimation$Callback {
    public final us0 a;
    public List b;
    public ArrayList c;
    public final HashMap d = new HashMap();

    public ea8(us0 us0) {
        super(us0.w);
        this.a = us0;
    }

    public final ha8 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ha8 ha8 = (ha8) hashMap.get(windowInsetsAnimation);
        if (ha8 != null) {
            return ha8;
        }
        ha8 ha82 = new ha8(0, (Interpolator) null, 0);
        ha82.a = new fa8(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, ha82);
        return ha82;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k = bn6.k(list.get(size));
            ha8 a2 = a(k);
            a2.a.d(k.getFraction());
            this.c.add(a2);
        }
        return this.a.f(db8.g((View) null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        k68 g = this.a.g(a(windowInsetsAnimation), new k68(bounds));
        g.getClass();
        bn6.m();
        return bn6.i(((ad3) g.x).d(), ((ad3) g.y).d());
    }
}

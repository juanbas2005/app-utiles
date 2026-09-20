package defpackage;

import android.widget.FrameLayout;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tm7 {
    public static final vy a;
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [vy, km7] */
    static {
        ? km7 = new km7();
        km7.Y = new ArrayList();
        km7.b0 = false;
        km7.c0 = 0;
        km7.Z = false;
        km7.L(new fb2(2));
        km7.L(new km7());
        km7.L(new fb2(1));
        a = km7;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, sm7] */
    public static void a(FrameLayout frameLayout, km7 km7) {
        ArrayList arrayList = c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (km7 == null) {
                km7 = a;
            }
            km7 j = km7.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((km7) it.next()).x(frameLayout);
                }
            }
            j.h(frameLayout, true);
            if (frameLayout.getTag(R.id.transition_current_scene) == null) {
                frameLayout.setTag(R.id.transition_current_scene, (Object) null);
                ? obj = new Object();
                obj.w = j;
                obj.x = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj);
                return;
            }
            ku4.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [js, java.lang.Object, zt6] */
    public static js b() {
        js jsVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (jsVar = (js) weakReference.get()) != null) {
            return jsVar;
        }
        ? zt6 = new zt6(0);
        threadLocal.set(new WeakReference(zt6));
        return zt6;
    }
}

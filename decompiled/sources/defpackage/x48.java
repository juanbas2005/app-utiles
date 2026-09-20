package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: x48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x48 {
    public static db8 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        db8 g = db8.g((View) null, rootWindowInsets);
        za8 za8 = g.a;
        za8.w(g);
        View rootView = view.getRootView();
        za8.d(rootView);
        za8.o(rootView);
        za8.p();
        return g;
    }
}

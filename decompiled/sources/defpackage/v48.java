package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: v48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v48 implements View.OnApplyWindowInsetsListener {
    public db8 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ l45 c;

    public v48(View view, l45 l45) {
        this.b = view;
        this.c = l45;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        db8 g = db8.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        l45 l45 = this.c;
        if (i < 30) {
            w48.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return l45.i(view, g).f();
            }
        }
        this.a = g;
        db8 i2 = l45.i(view, g);
        if (i >= 30) {
            return i2.f();
        }
        WeakHashMap weakHashMap = e58.a;
        view.requestApplyInsets();
        return i2.f();
    }
}

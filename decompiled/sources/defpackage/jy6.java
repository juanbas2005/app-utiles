package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy6 extends rg4 {
    public View y;

    public final void m() {
        WindowInsetsController windowInsetsController;
        View view = this.y;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            iy6 iy6 = new iy6(atomicBoolean);
            windowInsetsController.addOnControllableInsetsChangedListener(iy6);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(iy6);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.m();
    }

    public final void s() {
        WindowInsetsController windowInsetsController;
        View view = this.y;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.s();
    }
}

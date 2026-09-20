package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: mj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj4 extends h84 implements xi4 {
    public static final Method Z;
    public f96 Y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final e02 a(Context context, boolean z) {
        lj4 lj4 = new lj4(context, z);
        lj4.setHoverListener(this);
        return lj4;
    }

    public final void d(ti4 ti4, MenuItem menuItem) {
        f96 f96 = this.Y;
        if (f96 != null) {
            f96.d(ti4, menuItem);
        }
    }

    public final void l(ti4 ti4, yi4 yi4) {
        f96 f96 = this.Y;
        if (f96 != null) {
            f96.l(ti4, yi4);
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import cu.lestebang.utiletecsa.R;

/* renamed from: ij4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ij4 {
    public final Context a;
    public final ti4 b;
    public final boolean c;
    public final int d;
    public View e;
    public int f = 8388611;
    public boolean g;
    public qj4 h;
    public gj4 i;
    public PopupWindow.OnDismissListener j;
    public final hj4 k = new hj4(this);

    public ij4(Context context, ti4 ti4, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = ti4;
        this.e = view;
        this.c = z;
        this.d = i2;
    }

    public final gj4 a() {
        gj4 gj4;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                gj4 = new am0(context2, this.e, this.d, this.c);
            } else {
                gj4 = new l27(context2, this.b, this.e, this.d, this.c);
            }
            gj4.l(this.b);
            gj4.r(this.k);
            gj4.n(this.e);
            gj4.f(this.h);
            gj4.o(this.g);
            gj4.p(this.f);
            this.i = gj4;
        }
        return this.i;
    }

    public final boolean b() {
        gj4 gj4 = this.i;
        if (gj4 == null || !gj4.b()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z, boolean z2) {
        gj4 a2 = a();
        a2.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.w = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.g();
    }
}

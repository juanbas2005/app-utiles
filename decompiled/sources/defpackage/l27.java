package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* renamed from: l27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l27 extends gj4 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final boolean A;
    public final int B;
    public final int C;
    public final mj4 D;
    public final mp E = new mp(3, this);
    public final fg F = new fg(7, this);
    public PopupWindow.OnDismissListener G;
    public View H;
    public View I;
    public qj4 J;
    public ViewTreeObserver K;
    public boolean L;
    public boolean M;
    public int N;
    public int O = 0;
    public boolean P;
    public final Context x;
    public final ti4 y;
    public final qi4 z;

    /* JADX WARNING: type inference failed for: r7v1, types: [h84, mj4] */
    public l27(Context context, ti4 ti4, View view, int i, boolean z2) {
        this.x = context;
        this.y = ti4;
        this.A = z2;
        this.z = new qi4(ti4, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.C = i;
        Resources resources = context.getResources();
        this.B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.H = view;
        this.D = new h84(context, (AttributeSet) null, i, 0);
        ti4.b(this, context);
    }

    public final void a(ti4 ti4, boolean z2) {
        if (ti4 == this.y) {
            dismiss();
            qj4 qj4 = this.J;
            if (qj4 != null) {
                qj4.a(ti4, z2);
            }
        }
    }

    public final boolean b() {
        if (this.L || !this.D.V.isShowing()) {
            return false;
        }
        return true;
    }

    public final boolean c(i67 i67) {
        boolean z2;
        if (i67.hasVisibleItems()) {
            i67 i672 = i67;
            ij4 ij4 = new ij4(this.x, i672, this.I, this.A, this.C, 0);
            qj4 qj4 = this.J;
            ij4.h = qj4;
            gj4 gj4 = ij4.i;
            if (gj4 != null) {
                gj4.f(qj4);
            }
            int size = i672.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = i672.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i++;
            }
            ij4.g = z2;
            gj4 gj42 = ij4.i;
            if (gj42 != null) {
                gj42.o(z2);
            }
            ij4.j = this.G;
            this.G = null;
            this.y.c(false);
            mj4 mj4 = this.D;
            int i2 = mj4.B;
            int p = mj4.p();
            if ((Gravity.getAbsoluteGravity(this.O, this.H.getLayoutDirection()) & 7) == 5) {
                i2 += this.H.getWidth();
            }
            if (!ij4.b()) {
                if (ij4.e != null) {
                    ij4.d(i2, p, true, true);
                }
            }
            qj4 qj42 = this.J;
            if (qj42 != null) {
                qj42.m(i672);
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        if (b()) {
            this.D.dismiss();
        }
    }

    public final void f(qj4 qj4) {
        this.J = qj4;
    }

    public final void g() {
        View view;
        boolean z2;
        Rect rect;
        if (!b()) {
            if (this.L || (view = this.H) == null) {
                h.s("StandardMenuPopup cannot be used without an anchor");
                return;
            }
            this.I = view;
            mj4 mj4 = this.D;
            fp fpVar = mj4.V;
            fp fpVar2 = mj4.V;
            fpVar.setOnDismissListener(this);
            mj4.L = this;
            mj4.U = true;
            fpVar2.setFocusable(true);
            View view2 = this.I;
            if (this.K == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.K = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.E);
            }
            view2.addOnAttachStateChangeListener(this.F);
            mj4.K = view2;
            mj4.H = this.O;
            boolean z3 = this.M;
            Context context = this.x;
            qi4 qi4 = this.z;
            if (!z3) {
                this.N = gj4.m(qi4, context, this.B);
                this.M = true;
            }
            mj4.r(this.N);
            fpVar2.setInputMethodMode(2);
            Rect rect2 = this.w;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            mj4.T = rect;
            mj4.g();
            e02 e02 = mj4.y;
            e02.setOnKeyListener(this);
            if (this.P) {
                ti4 ti4 = this.y;
                if (ti4.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, e02, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(ti4.m);
                    }
                    frameLayout.setEnabled(false);
                    e02.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            mj4.q(qi4);
            mj4.g();
        }
    }

    public final void i() {
        this.M = false;
        qi4 qi4 = this.z;
        if (qi4 != null) {
            qi4.notifyDataSetChanged();
        }
    }

    public final e02 j() {
        return this.D.y;
    }

    public final void n(View view) {
        this.H = view;
    }

    public final void o(boolean z2) {
        this.z.c = z2;
    }

    public final void onDismiss() {
        this.L = true;
        this.y.c(true);
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.K = this.I.getViewTreeObserver();
            }
            this.K.removeGlobalOnLayoutListener(this.E);
            this.K = null;
        }
        this.I.removeOnAttachStateChangeListener(this.F);
        PopupWindow.OnDismissListener onDismissListener = this.G;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        this.O = i;
    }

    public final void q(int i) {
        this.D.B = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    public final void s(boolean z2) {
        this.P = z2;
    }

    public final void t(int i) {
        this.D.m(i);
    }

    public final void l(ti4 ti4) {
    }
}

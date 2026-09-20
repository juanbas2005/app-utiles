package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.R;
import java.util.UUID;

/* renamed from: yu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu1 extends vv0 {
    public sr2 A;
    public wu1 B;
    public final View C;
    public final tu1 D;
    public boolean E;

    /* JADX WARNING: type inference failed for: r6v2, types: [android.view.View] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public yu1(sr2 sr2, wu1 wu1, View view, ey3 ey3, tp1 tp1, UUID uuid) {
        super(new ContextThemeWrapper(r1, r2), 0);
        int i;
        Context context = view.getContext();
        if (wu1.e) {
            i = R.style.DialogWindowTheme;
        } else {
            i = R.style.FloatingDialogWindowTheme;
        }
        this.A = sr2;
        this.B = wu1;
        this.C = view;
        Window window = getWindow();
        ViewGroup viewGroup = null;
        if (window != null) {
            wu1 wu12 = this.B;
            Window window2 = getWindow();
            if (window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.type = wu12.g;
                window2.setAttributes(attributes);
            }
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            o55.s(window, this.B.e);
            window.setGravity(17);
            if (!this.B.e) {
                window.addFlags(65792);
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    cn.a.a(attributes2);
                }
                if (i2 >= 30) {
                    en enVar = en.a;
                    enVar.b(attributes2, 0);
                    enVar.c(attributes2, 0);
                }
                window.setAttributes(attributes2);
            }
            tu1 tu1 = new tu1(getContext(), window);
            setTitle(this.B.f);
            tu1.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            tu1.setClipChildren(false);
            tu1.setElevation(tp1.e0(8.0f));
            tu1.setOutlineProvider(new xu1(0));
            this.D = tu1;
            ? decorView = window.getDecorView();
            viewGroup = decorView instanceof ViewGroup ? decorView : viewGroup;
            if (viewGroup != null) {
                e(viewGroup);
            }
            setContentView((View) tu1);
            tu1.setTag(R.id.view_tree_lifecycle_owner, i95.o(view));
            tu1.setTag(R.id.view_tree_view_model_store_owner, aa5.g(view));
            tu1.setTag(R.id.view_tree_saved_state_registry_owner, w95.g(view));
            f(this.A, this.B, ey3);
            v45 b = b();
            lf lfVar = new lf(this, 1);
            b.getClass();
            b.a(new g30(lfVar), this);
            return;
        }
        h.s("Dialog has no window");
        throw null;
    }

    public static final void e(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof tu1)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    e(viewGroup2);
                }
            }
        }
    }

    public final void f(sr2 sr2, wu1 wu1, ey3 ey3) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.A = sr2;
        this.B = wu1;
        fi6 fi6 = wu1.c;
        boolean b = vh.b(this.C);
        int ordinal = fi6.ordinal();
        int i4 = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                b = true;
            } else if (ordinal == 2) {
                b = false;
            } else {
                h.c();
                return;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (b) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int ordinal2 = ey3.ordinal();
        if (ordinal2 == 0) {
            i2 = 0;
        } else if (ordinal2 == 1) {
            i2 = 1;
        } else {
            h.c();
            return;
        }
        tu1 tu1 = this.D;
        tu1.setLayoutDirection(i2);
        boolean z2 = wu1.e;
        boolean z3 = wu1.d;
        Window window2 = tu1.F;
        if (tu1.J && z3 == tu1.H && z2 == tu1.I) {
            z = false;
        } else {
            z = true;
        }
        tu1.H = z3;
        tu1.I = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !tu1.J) {
                window2.setLayout(i3, -2);
                tu1.J = true;
            }
        }
        setCanceledOnTouchOutside(wu1.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i4 = 16;
                } else {
                    i4 = 48;
                }
            }
            window3.setSoftInputMode(i4);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.B.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.A.b();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (r5 <= r1) goto L_0x0086;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.B.b) {
            tu1 tu1 = this.D;
            tu1.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = tu1.getChildAt(0)) != null) {
                int left = childAt.getLeft() + tu1.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + tu1.getTop();
                int height = childAt.getHeight() + top;
                int C2 = dh4.C(motionEvent.getX());
                if (left <= C2) {
                    if (C2 <= width) {
                        int C3 = dh4.C(motionEvent.getY());
                        if (top <= C3) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.E = false;
                        return onTouchEvent;
                    }
                } else if (this.E) {
                    this.A.b();
                    this.E = false;
                    return true;
                }
                return onTouchEvent;
            }
            this.E = true;
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.E = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    public final void cancel() {
    }
}

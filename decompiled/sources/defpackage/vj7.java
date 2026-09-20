package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: vj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vj7 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static vj7 G;
    public static vj7 H;
    public final uj7 A = new uj7(this, 1);
    public int B;
    public int C;
    public bk7 D;
    public boolean E;
    public boolean F;
    public final View w;
    public final CharSequence x;
    public final int y;
    public final uj7 z = new uj7(this, 0);

    public vj7(View view, CharSequence charSequence) {
        int i;
        this.w = view;
        this.x = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = h58.a;
        if (Build.VERSION.SDK_INT >= 28) {
            i = bn.o(viewConfiguration);
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.y = i;
        this.F = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(vj7 vj7) {
        vj7 vj72 = G;
        if (vj72 != null) {
            vj72.w.removeCallbacks(vj72.z);
        }
        G = vj7;
        if (vj7 != null) {
            vj7.w.postDelayed(vj7.z, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        vj7 vj7 = H;
        View view = this.w;
        if (vj7 == this) {
            H = null;
            bk7 bk7 = this.D;
            if (bk7 != null) {
                View view2 = (View) bk7.c;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) bk7.b).getSystemService("window")).removeView(view2);
                }
                this.D = null;
                this.F = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (G == this) {
            b((vj7) null);
        }
        view.removeCallbacks(this.A);
    }

    public final void c(boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long longPressTimeout;
        long j2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        View view = this.w;
        if (view.isAttachedToWindow()) {
            b((vj7) null);
            vj7 vj7 = H;
            if (vj7 != null) {
                vj7.a();
            }
            H = this;
            this.E = z2;
            bk7 bk7 = new bk7(view.getContext());
            View view2 = (View) bk7.c;
            Context context = (Context) bk7.b;
            this.D = bk7;
            int i8 = this.B;
            int i9 = this.C;
            boolean z4 = this.E;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) bk7.e;
            if (!(view2.getParent() == null || view2.getParent() == null)) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) bk7.d).setText(this.x);
            int[] iArr = (int[]) bk7.h;
            int[] iArr2 = (int[]) bk7.g;
            Rect rect = (Rect) bk7.f;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i9 + dimensionPixelOffset2;
                i2 = i9 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            if (z4) {
                i3 = R.dimen.tooltip_y_offset_touch;
            } else {
                i3 = R.dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i3);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i10 = i8;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i5 = i2;
                    z3 = z4;
                    i6 = 0;
                    i4 = 1;
                } else {
                    Resources resources2 = context.getResources();
                    i4 = 1;
                    i5 = i2;
                    z3 = z4;
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i7 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i7 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, i7, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i11;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i11 + i10) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[i4];
                int i13 = ((i12 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + i + dimensionPixelOffset3;
                if (z3) {
                    if (i13 >= 0) {
                        layoutParams.y = i13;
                    } else {
                        layoutParams.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams.y = i14;
                } else {
                    layoutParams.y = i13;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.E) {
                j = 2500;
            } else {
                WeakHashMap weakHashMap = e58.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j = j2 - longPressTimeout;
            }
            uj7 uj7 = this.A;
            view.removeCallbacks(uj7);
            view.postDelayed(uj7, j);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        if (this.D == null || !this.E) {
            View view2 = this.w;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.F = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.D == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (this.F || Math.abs(x2 - this.B) > (i = this.y) || Math.abs(y2 - this.C) > i) {
                        this.B = x2;
                        this.C = y2;
                        this.F = false;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.B = view.getWidth() / 2;
        this.C = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void onViewAttachedToWindow(View view) {
    }
}

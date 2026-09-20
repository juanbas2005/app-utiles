package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class BottomSheetBehavior<V extends View> extends w61 {
    public final za0 A = new za0(this);
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F = 0.5f;
    public int G;
    public final float H = -1.0f;
    public boolean I;
    public boolean J;
    public final boolean K = true;
    public final boolean L = true;
    public boolean M;
    public int N = 4;
    public i58 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S = 0.1f;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y = new ArrayList();
    public VelocityTracker Z;
    public final int a = 0;
    public int a0;
    public boolean b = true;
    public int b0 = -1;
    public final float c;
    public boolean c0;
    public final int d;
    public HashMap d0;
    public int e;
    public final SparseIntArray e0 = new SparseIntArray();
    public boolean f;
    public final xa0 f0 = new xa0(this, 0);
    public int g;
    public final int h;
    public final ug4 i;
    public final ColorStateList j;
    public final int k = -1;
    public final int l = -1;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final rq6 y;
    public boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.a);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = t49.L(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.y = rq6.b(context, attributeSet, R.attr.bottomSheetStyle, 2131886993).a();
        }
        rq6 rq6 = this.y;
        if (rq6 != null) {
            ug4 ug4 = new ug4(rq6);
            this.i = ug4;
            ug4.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.B = ofFloat;
        ofFloat.setDuration(500);
        this.B.addUpdateListener(new wa0(0, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            A(i2);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.n = obtainStyledAttributes.getBoolean(14, false);
        boolean z3 = obtainStyledAttributes.getBoolean(7, true);
        if (this.b != z3) {
            this.b = z3;
            if (this.W != null) {
                r();
            }
            C((!this.b || this.N != 6) ? this.N : i3);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f2 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            h.q("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.F = f2;
        if (this.W != null) {
            this.E = (int) ((1.0f - f2) * ((float) this.V));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset >= 0) {
                this.C = dimensionPixelOffset;
                G(this.N, true);
            } else {
                h.q("offset must be greater than or equal to 0");
                throw null;
            }
        } else {
            int i4 = peekValue2.data;
            if (i4 >= 0) {
                this.C = i4;
                G(this.N, true);
            } else {
                h.q("offset must be greater than or equal to 0");
                throw null;
            }
        }
        this.d = obtainStyledAttributes.getInt(12, 500);
        this.o = obtainStyledAttributes.getBoolean(18, false);
        this.p = obtainStyledAttributes.getBoolean(19, false);
        this.q = obtainStyledAttributes.getBoolean(20, false);
        this.r = obtainStyledAttributes.getBoolean(21, true);
        this.s = obtainStyledAttributes.getBoolean(15, false);
        this.t = obtainStyledAttributes.getBoolean(16, false);
        this.u = obtainStyledAttributes.getBoolean(17, false);
        this.x = obtainStyledAttributes.getBoolean(24, true);
        obtainStyledAttributes.recycle();
        this.c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View v2 = v(viewGroup.getChildAt(i2));
            if (v2 != null) {
                return v2;
            }
        }
        return null;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final void A(int i2) {
        boolean z2 = this.f;
        if (i2 == -1) {
            if (!z2) {
                this.f = true;
            } else {
                return;
            }
        } else if (z2 || this.e != i2) {
            this.f = false;
            this.e = Math.max(0, i2);
        } else {
            return;
        }
        I();
    }

    public final void B(int i2) {
        String str;
        int i3;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(f21.l(sb, str, " should not be set externally."));
        } else if (this.I || i2 != 5) {
            if (i2 != 6 || !this.b || y(i2) > this.D) {
                i3 = i2;
            } else {
                i3 = 3;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                C(i2);
                return;
            }
            View view = (View) this.W.get();
            yp ypVar = new yp(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow()) {
                ypVar.run();
            } else {
                view.post(ypVar);
            }
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
        }
    }

    public final void C(int i2) {
        if (this.N != i2) {
            this.N = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z2 = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i2 == 3) {
                    H(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    H(false);
                }
                G(i2, true);
                ArrayList arrayList = this.Y;
                if (arrayList.size() <= 0) {
                    F();
                    return;
                }
                arrayList.get(0).getClass();
                ku4.a();
            }
        }
    }

    public final boolean D(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        int t2 = t();
        if (Math.abs(((f2 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t2) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L_0x0032;
     */
    public final void E(View view, int i2, boolean z2) {
        int y2 = y(i2);
        i58 i58 = this.O;
        if (i58 != null) {
            if (!z2) {
                int left = view.getLeft();
                i58.r = view;
                i58.c = -1;
                boolean h2 = i58.h(left, y2, 0, 0);
                if (!h2 && i58.a == 0 && i58.r != null) {
                    i58.r = null;
                }
            }
            C(2);
            G(i2, true);
            this.A.b(i2);
            return;
        }
        C(i2);
    }

    public final void F() {
        View view;
        int i2;
        boolean z2;
        k4 k4Var;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            e58.j(view, 524288);
            e58.h(view, 0);
            e58.j(view, 262144);
            e58.h(view, 0);
            e58.j(view, 1048576);
            e58.h(view, 0);
            SparseIntArray sparseIntArray = this.e0;
            int i3 = sparseIntArray.get(0, -1);
            if (i3 != -1) {
                e58.j(view, i3);
                e58.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i4 = 6;
            if (!this.b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                qa qaVar = new qa(6, 1, this);
                ArrayList f2 = e58.f(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= f2.size()) {
                        int i6 = 0;
                        int i7 = -1;
                        while (true) {
                            int[] iArr = e58.d;
                            if (i6 >= 32 || i7 != -1) {
                                i2 = i7;
                            } else {
                                int i8 = iArr[i6];
                                boolean z3 = true;
                                for (int i9 = 0; i9 < f2.size(); i9++) {
                                    if (((w4) f2.get(i9)).a() != i8) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    z3 &= z2;
                                }
                                if (z3) {
                                    i7 = i8;
                                }
                                i6++;
                            }
                        }
                        i2 = i7;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((w4) f2.get(i5)).a).getLabel())) {
                        i2 = ((w4) f2.get(i5)).a();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    w4 w4Var = new w4((Object) null, i2, string, qaVar, (Class) null);
                    View.AccessibilityDelegate d2 = e58.d(view);
                    if (d2 == null) {
                        k4Var = null;
                    } else if (d2 instanceof j4) {
                        k4Var = ((j4) d2).a;
                    } else {
                        k4Var = new k4(d2);
                    }
                    if (k4Var == null) {
                        k4Var = new k4();
                    }
                    e58.m(view, k4Var);
                    e58.j(view, w4Var.a());
                    e58.f(view).add(w4Var);
                    e58.h(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.I && this.N != 5) {
                e58.k(view, w4.l, new qa(5, 1, this));
            }
            int i10 = this.N;
            if (i10 == 3) {
                if (this.b) {
                    i4 = 4;
                }
                e58.k(view, w4.k, new qa(i4, 1, this));
            } else if (i10 == 4) {
                if (this.b) {
                    i4 = 3;
                }
                e58.k(view, w4.j, new qa(i4, 1, this));
            } else if (i10 == 6) {
                e58.k(view, w4.k, new qa(4, 1, this));
                e58.k(view, w4.j, new qa(3, 1, this));
            }
        }
    }

    public final void G(int i2, boolean z2) {
        boolean z3;
        ug4 ug4;
        if (i2 != 2) {
            if (this.N != 3 || (!this.x && !z())) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.z != z3 && (ug4 = this.i) != null) {
                this.z = z3;
                ValueAnimator valueAnimator = this.B;
                float f2 = 1.0f;
                if (!z2 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.z) {
                        f2 = s();
                    }
                    sg4 sg4 = ug4.x;
                    if (sg4.j != f2) {
                        sg4.j = f2;
                        ug4.B = true;
                        ug4.C = true;
                        ug4.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f3 = ug4.x.j;
                    if (z3) {
                        f2 = s();
                    }
                    valueAnimator.setFloatValues(new float[]{f3, f2});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.d0 == null) {
                        this.d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.W.get() && z2) {
                        this.d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.d0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(z61 z61) {
        this.W = null;
        this.O = null;
    }

    public final void e() {
        this.W = null;
        this.O = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        i58 i58;
        boolean z2;
        View view2;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view3 = null;
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.b0 = y2;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && coordinatorLayout.o(view2, x2, y2)) {
                    this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.c0 = true;
                }
            }
            if (this.a0 != -1 || coordinatorLayout.o(view, x2, this.b0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.P = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c0 = false;
            this.a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (i58 = this.O) == null || !i58.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            if (weakReference2 != null) {
                view3 = weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i2 = this.b0) == -1 || Math.abs(((float) i2) - motionEvent.getY()) <= ((float) this.O.b)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [d12, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z2;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT < 29 || this.n || this.f) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.o || this.p || this.q || this.s || this.t || this.u || z2) {
                v70 v70 = new v70(2, this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.a = paddingStart;
                obj.b = paddingEnd;
                obj.c = paddingBottom;
                k68 k68 = new k68(0, v70, obj);
                WeakHashMap weakHashMap = e58.a;
                w48.c(view, k68);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            e58.o(view, new bd3(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            kl8.F(context, R.attr.motionDurationMedium2, 300);
            kl8.F(context, R.attr.motionDurationShort3, 150);
            kl8.F(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            ug4 ug4 = this.i;
            if (ug4 != null) {
                view.setBackground(ug4);
                float f2 = this.H;
                if (f2 == -1.0f) {
                    f2 = view.getElevation();
                }
                ug4.m(f2);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new i58(coordinatorLayout.getContext(), coordinatorLayout, this.f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i3 = this.V;
        int i4 = i3 - height;
        int i5 = this.w;
        if (i4 < i5) {
            boolean z3 = this.r;
            int i6 = this.l;
            if (z3) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.T = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.T = i7;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * ((float) this.V));
        r();
        int i8 = this.N;
        if (i8 == 3) {
            int x2 = x();
            WeakHashMap weakHashMap2 = e58.a;
            view.offsetTopAndBottom(x2);
        } else if (i8 == 6) {
            int i9 = this.E;
            WeakHashMap weakHashMap3 = e58.a;
            view.offsetTopAndBottom(i9);
        } else if (this.I && i8 == 5) {
            int i10 = this.V;
            WeakHashMap weakHashMap4 = e58.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.G;
            WeakHashMap weakHashMap5 = e58.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = e58.a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        ku4.a();
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.k, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        if (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) {
            return false;
        }
        return true;
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        View view3;
        if (i4 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i5 = top - i3;
                boolean z2 = this.K;
                boolean z3 = this.L;
                if (i3 > 0) {
                    if (!this.R && !z3 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    } else if (i5 < x()) {
                        int x2 = top - x();
                        iArr[1] = x2;
                        WeakHashMap weakHashMap = e58.a;
                        view.offsetTopAndBottom(-x2);
                        C(3);
                    } else if (z2) {
                        iArr[1] = i3;
                        WeakHashMap weakHashMap2 = e58.a;
                        view.offsetTopAndBottom(-i3);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !z3 && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    } else if (!canScrollVertically) {
                        int i6 = this.G;
                        if (i5 > i6 && !this.I) {
                            int i7 = top - i6;
                            iArr[1] = i7;
                            WeakHashMap weakHashMap3 = e58.a;
                            view.offsetTopAndBottom(-i7);
                            C(4);
                        } else if (z2) {
                            iArr[1] = i3;
                            WeakHashMap weakHashMap4 = e58.a;
                            view.offsetTopAndBottom(-i3);
                            C(1);
                        } else {
                            return;
                        }
                    }
                }
                u(view.getTop());
                this.Q = i3;
                this.R = true;
                this.M = false;
            }
        }
    }

    public final void m(View view, Parcelable parcelable) {
        ya0 ya0 = (ya0) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = ya0.z;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = ya0.A;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = ya0.B;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.J = ya0.C;
            }
        }
        int i3 = ya0.y;
        if (i3 == 1 || i3 == 2) {
            this.N = 4;
        } else {
            this.N = i3;
        }
    }

    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new ya0(this);
    }

    public final boolean o(View view, int i2, int i3) {
        this.Q = 0;
        this.R = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r3.E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L_0x00ae;
     */
    public final void p(View view, View view2, int i2) {
        float f2;
        int i3 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.b) {
                }
                E(view, i3, false);
                this.R = false;
            }
            if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    f2 = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    f2 = this.Z.getYVelocity(this.a0);
                }
                if (D(view, f2)) {
                    i3 = 5;
                    E(view, i3, false);
                    this.R = false;
                }
            }
            if (this.Q == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i4 = this.E;
                    if (top < i4) {
                    }
                }
            } else if (!this.b) {
                int top2 = view.getTop();
            }
            i3 = 4;
            E(view, i3, false);
            this.R = false;
            i3 = 6;
            E(view, i3, false);
            this.R = false;
        }
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.N;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        i58 i58 = this.O;
        boolean z2 = this.K;
        if (i58 != null && (z2 || i2 == 1)) {
            i58.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((z2 || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(((float) this.b0) - motionEvent.getY());
            i58 i582 = this.O;
            if (abs > ((float) i582.b)) {
                i582.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t2 = t();
        boolean z2 = this.b;
        int i2 = this.V;
        if (z2) {
            this.G = Math.max(i2 - t2, this.D);
        } else {
            this.G = i2 - t2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f2;
        float f3;
        float[] fArr;
        float f4;
        RoundedCorner C2;
        float f5 = 0.0f;
        ug4 ug4 = this.i;
        if (!(ug4 == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31)) {
            View view = (View) this.W.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float[] fArr2 = ug4.X;
                if (fArr2 != null) {
                    f2 = fArr2[3];
                } else {
                    f2 = ug4.x.a.e.a(ug4.g());
                }
                RoundedCorner g2 = rootWindowInsets.getRoundedCorner(0);
                if (g2 != null) {
                    float b2 = (float) g2.getRadius();
                    if (b2 > 0.0f && f2 > 0.0f) {
                        f3 = b2 / f2;
                        fArr = ug4.X;
                        if (fArr == null) {
                            f4 = fArr[0];
                        } else {
                            f4 = ug4.x.a.f.a(ug4.g());
                        }
                        C2 = rootWindowInsets.getRoundedCorner(1);
                        if (C2 != null) {
                            float b3 = (float) C2.getRadius();
                            if (b3 > 0.0f && f4 > 0.0f) {
                                f5 = b3 / f4;
                            }
                        }
                        return Math.max(f3, f5);
                    }
                }
                f3 = 0.0f;
                fArr = ug4.X;
                if (fArr == null) {
                }
                C2 = rootWindowInsets.getRoundedCorner(1);
                if (C2 != null) {
                }
                return Math.max(f3, f5);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i2;
        int i3;
        int i4;
        if (this.f) {
            i2 = Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T);
            i3 = this.v;
        } else if (!this.n && !this.o && (i4 = this.m) > 0) {
            return Math.max(this.e, i4 + this.h);
        } else {
            i2 = this.e;
            i3 = this.v;
        }
        return i2 + i3;
    }

    public final void u(int i2) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i3 = this.G;
                if (i2 <= i3 && i3 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    ku4.a();
                }
            }
        }
    }

    public final int x() {
        int i2;
        if (this.b) {
            return this.D;
        }
        if (this.r) {
            i2 = 0;
        } else {
            i2 = this.w;
        }
        return Math.max(this.C, i2);
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.G;
        }
        if (i2 == 5) {
            return this.V;
        }
        if (i2 == 6) {
            return this.E;
        }
        h.q(hl6.k(i2, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (!(weakReference == null || weakReference.get() == null)) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior() {
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}

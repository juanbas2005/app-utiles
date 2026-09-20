package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;

/* renamed from: a1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a1 extends ViewGroup {
    public yx0 A;
    public ad4 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public WeakReference w;
    public IBinder x;
    public ve8 y;
    public ky0 z;

    public a1(Context context) {
        super(context, (AttributeSet) null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        fg fgVar = new fg(8, this);
        addOnAttachStateChangeListener(fgVar);
        kj6 kj6 = new kj6(23);
        i35.g(this).a.add(kj6);
        this.B = new ad4(this, fgVar, kj6, 1);
    }

    private final void setParentContext(ky0 ky0) {
        if (this.z != ky0) {
            this.z = ky0;
            if (ky0 != null) {
                this.w = null;
            }
            ve8 ve8 = this.y;
            if (ve8 != null) {
                ve8.b();
                this.y = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.x != iBinder) {
            this.x = iBinder;
            this.w = null;
        }
    }

    public abstract void a(int i, yt2 yt2);

    public final void addView(View view) {
        c();
        super.addView(view);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.A == null) {
                je jeVar = null;
                if (getChildCount() != 0) {
                    ? childAt = getChildAt(0);
                    if (childAt instanceof je) {
                        jeVar = childAt;
                    }
                }
                if (jeVar != null) {
                    jeVar.setComposeViewContext(l(pv8.E(this), jeVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (!this.D) {
            kj6.n(f21.h("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    public final void d() {
        yx0 yx0;
        View view;
        if (this.z == null && !isAttachedToWindow() && ((yx0 = this.A) == null || (view = yx0.a) == null || !view.isAttachedToWindow())) {
            h.s("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        je jeVar;
        View childAt = getChildAt(0);
        if (childAt instanceof je) {
            jeVar = (je) childAt;
        } else {
            jeVar = null;
        }
        if (jeVar != null && jeVar.W0) {
            jeVar.w.b();
            jeVar.W0 = false;
        }
        ve8 ve8 = this.y;
        if (ve8 != null) {
            ve8.b();
        }
        this.y = null;
        requestLayout();
    }

    public final void f() {
        if (this.y == null) {
            try {
                this.D = true;
                Trace.beginSection("Compose:initializeView");
                yx0 yx0 = this.A;
                if (yx0 == null) {
                    yx0 = j();
                }
                this.y = bf8.a(this, yx0, new fw0(1003123809, new z0(0, this), true));
                Trace.endSection();
                this.D = false;
            } catch (Throwable th) {
                this.D = false;
                throw th;
            }
        }
    }

    public void g(boolean z2, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4  reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        ww wwVar;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof ww) {
            wwVar = (ww) tag;
        } else {
            wwVar = null;
        }
        if (wwVar != null) {
            return wwVar.a;
        }
        return 1;
    }

    public final yx0 getComposeViewContext$ui() {
        return this.A;
    }

    public final boolean getHasComposition() {
        if (this.y != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.C;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean isTransitionGroup() {
        if (!this.E || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    public final yx0 j() {
        yx0 yx0;
        yx0 H;
        a68 a68;
        je jeVar;
        a68 a682 = null;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof je) {
                jeVar = (je) childAt;
            } else {
                jeVar = null;
            }
            if (jeVar != null) {
                yx0 = jeVar.getComposeViewContext();
                View E2 = pv8.E(this);
                H = pv8.H(E2);
                if (H == null) {
                    return l(E2, H);
                }
                ky0 k = k();
                t54 o = i95.o(E2);
                if (o == null) {
                    if (yx0 != null) {
                        o = yx0.c();
                    } else {
                        o = null;
                    }
                    if (o == null) {
                        h.s("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                t54 t54 = o;
                if6 g = w95.g(E2);
                if (g == null) {
                    if (yx0 != null) {
                        yx0.f();
                        g = yx0.e;
                        g.getClass();
                    } else {
                        g = null;
                    }
                    if (g == null) {
                        h.s("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                if6 if6 = g;
                a68 g2 = aa5.g(E2);
                if (g2 == null) {
                    if (yx0 != null) {
                        yx0.f();
                        a682 = yx0.f;
                    }
                    a68 = a682;
                } else {
                    a68 = g2;
                }
                yx0 yx02 = new yx0(pv8.H(pv8.E(E2)), E2, k, t54, if6, a68);
                E2.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(yx02));
                return yx02;
            }
        }
        yx0 = null;
        View E22 = pv8.E(this);
        H = pv8.H(E22);
        if (H == null) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ky0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ky0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: gy5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: gy5} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r3 > 0) goto L_0x006e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    public final ky0 k() {
        ky0 ky0;
        Object obj;
        ky0 ky02 = this.z;
        gy5 gy5 = ky02;
        if (ky02 == null) {
            Object a = ac8.a(this);
            if (a == null) {
                ViewParent parent = getParent();
                while (a == null && (parent instanceof View)) {
                    View view = (View) parent;
                    a = ac8.a(view);
                    parent = z85.k(view);
                }
            }
            dy5 dy5 = dy5.x;
            Object obj2 = null;
            if (a != null) {
                if (!(a instanceof gy5) || ((dy5) ((gy5) a).u.getValue()).compareTo(dy5) > 0) {
                    obj = a;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    this.w = new WeakReference(obj);
                }
            } else {
                a = 0;
            }
            if (gy5 == 0) {
                WeakReference weakReference = this.w;
                if (!(weakReference == null || (ky0 = (ky0) weakReference.get()) == null)) {
                    boolean z2 = ky0 instanceof gy5;
                    gy5 = ky0;
                    if (z2) {
                        int compareTo = ((dy5) ((gy5) ky0).u.getValue()).compareTo(dy5);
                        gy5 = ky0;
                    }
                    if (gy5 == 0) {
                        gy5 = ac8.b(this);
                        if (((dy5) gy5.u.getValue()).compareTo(dy5) > 0) {
                            obj2 = gy5;
                        }
                        if (obj2 != null) {
                            this.w = new WeakReference(obj2);
                        }
                    }
                }
                gy5 = 0;
                if (gy5 == 0) {
                }
            }
        }
        return gy5;
    }

    public final yx0 l(View view, yx0 yx0) {
        ky0 k = k();
        t54 o = i95.o(view);
        a68 g = aa5.g(view);
        if6 g2 = w95.g(view);
        yx0.f();
        ky0 ky0 = yx0.c;
        ky0.getClass();
        if (k == ky0 && o == yx0.c()) {
            yx0.f();
            if (g == yx0.f) {
                yx0.f();
                if6 if6 = yx0.e;
                if6.getClass();
                if (g2 == if6) {
                    return yx0;
                }
            }
        }
        e81 k2 = k.k();
        yx0.f();
        ky0 ky02 = yx0.c;
        ky02.getClass();
        if (k2 != ky02.k()) {
            e();
        }
        if (o == null) {
            o = yx0.c();
        }
        t54 t54 = o;
        if (g2 == null) {
            yx0.f();
            g2 = yx0.e;
            g2.getClass();
        }
        View view2 = view;
        yx0 yx02 = new yx0(yx0, view2, k, t54, g2, g);
        view2.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(yx02));
        return yx02;
    }

    public final void m(yx0 yx0) {
        boolean z2;
        je jeVar;
        ve8 ve8 = this.y;
        if (ve8 == null || ve8.x.x()) {
            z2 = false;
        } else {
            z2 = true;
        }
        e();
        View childAt = getChildAt(0);
        if (childAt instanceof je) {
            jeVar = (je) childAt;
        } else {
            jeVar = null;
        }
        if (yx0 != null) {
            if (jeVar != null) {
                jeVar.setComposeViewContext(yx0);
            }
            if (z2) {
                f();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tp4 tp4 = ac8.a;
        ViewParent k = z85.k(this);
        View view = this;
        while (k instanceof View) {
            View view2 = (View) k;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            k = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new y0(0, this));
        } else {
            b();
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        g(z2, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM  reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new ww(i));
    }

    public final void setComposeViewContext$ui(yx0 yx0) {
        if (this.A != yx0) {
            this.A = yx0;
            m(yx0);
        }
    }

    public final void setParentCompositionContext(ky0 ky0) {
        setParentContext(ky0);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.C = z2;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((je) ((p95) childAt)).setShowLayoutBounds(z2);
        }
    }

    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.E = true;
    }

    public final void setViewCompositionStrategy(f58 f58) {
        ad4 ad4 = this.B;
        if (ad4 != null) {
            ad4.b();
        }
        ((k75) f58).getClass();
        fg fgVar = new fg(8, this);
        addOnAttachStateChangeListener(fgVar);
        kj6 kj6 = new kj6(23);
        i35.g(this).a.add(kj6);
        this.B = new ad4(this, fgVar, kj6, 1);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z2);
    }

    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}

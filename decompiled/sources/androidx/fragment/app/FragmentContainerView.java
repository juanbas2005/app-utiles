package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lvs7;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Lbq2;", "F", "getFragment", "()Lbq2;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public View.OnApplyWindowInsetsListener y;
    public boolean z = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, rq2 rq2) {
        super(context, attributeSet);
        View view;
        eq2 eq2;
        String str;
        context.getClass();
        attributeSet.getClass();
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mv5.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        bq2 D = rq2.D(id);
        if (classAttribute != null && D == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                h.s(f21.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            lq2 I = rq2.I();
            context.getClassLoader();
            bq2 a = I.a(classAttribute);
            a.getClass();
            a.T = id;
            a.U = id;
            a.V = string;
            a.P = rq2;
            dq2 dq2 = rq2.w;
            a.Q = dq2;
            a.a0 = true;
            if (dq2 == null) {
                eq2 = null;
            } else {
                eq2 = dq2.L;
            }
            if (eq2 != null) {
                a.a0 = true;
            }
            q30 q30 = new q30(rq2);
            q30.o = true;
            a.b0 = this;
            a.L = true;
            q30.f(getId(), a, string, 1);
            if (!q30.g) {
                q30.q.B(q30, true);
            } else {
                h.s("This transaction is already being added to the back stack");
                throw null;
            }
        }
        Iterator it = rq2.c.C().iterator();
        while (it.hasNext()) {
            wq2 wq2 = (wq2) it.next();
            bq2 bq2 = wq2.c;
            if (bq2.U == getId() && (view = bq2.c0) != null && view.getParent() == null) {
                bq2.b0 = this;
                wq2.b();
                wq2.k();
            }
        }
    }

    public final void a(View view) {
        if (this.x.contains(view)) {
            this.w.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        bq2 bq2;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof bq2) {
            bq2 = (bq2) tag;
        } else {
            bq2 = null;
        }
        if (bq2 != null) {
            super.addView(view, i, layoutParams);
        } else {
            h.p(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        db8 db8;
        windowInsets.getClass();
        db8 g = db8.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.y;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            db8 = db8.g((View) null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = e58.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = db8.g(this, f);
            }
            db8 = g;
        }
        if (!db8.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                e58.b(getChildAt(i), db8);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.z) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.z) {
            ArrayList arrayList = this.w;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void endViewTransition(View view) {
        view.getClass();
        this.x.remove(view);
        if (this.w.remove(view)) {
            this.z = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends bq2> F getFragment() {
        bq2 bq2;
        rq2 rq2;
        eq2 eq2;
        View view = this;
        while (true) {
            if (view == null) {
                bq2 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof bq2) {
                bq2 = (bq2) tag;
            } else {
                bq2 = null;
            }
            if (bq2 != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (bq2 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    eq2 = null;
                    break;
                } else if (context instanceof eq2) {
                    eq2 = (eq2) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (eq2 != null) {
                rq2 = eq2.p();
            } else {
                rf2.h(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        } else if (bq2.t()) {
            rq2 = bq2.m();
        } else {
            throw new IllegalStateException("The Fragment " + bq2 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return rq2.D(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.z = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.y = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.x.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mv5.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }
}

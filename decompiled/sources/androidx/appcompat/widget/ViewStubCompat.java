package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ViewStubCompat extends View {
    public int w = 0;
    public int x;
    public WeakReference y;
    public LayoutInflater z;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.z, 0, 0);
        this.x = obtainStyledAttributes.getResourceId(2, -1);
        this.w = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            h.s("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        } else if (this.w != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.z;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.w, viewGroup, false);
            int i = this.x;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.y = new WeakReference(inflate);
            return inflate;
        } else {
            h.q("ViewStub must have a valid layoutResource");
            return null;
        }
    }

    public int getInflatedId() {
        return this.x;
    }

    public LayoutInflater getLayoutInflater() {
        return this.z;
    }

    public int getLayoutResource() {
        return this.w;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.x = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.z = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.w = i;
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.y;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
            } else {
                h.s("setVisibility called on un-referenced view");
            }
        } else {
            super.setVisibility(i);
            if (i == 0 || i == 4) {
                a();
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(h68 h68) {
    }
}

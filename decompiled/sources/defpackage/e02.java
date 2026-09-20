package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: e02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class e02 extends ListView {
    public int A = 0;
    public int B;
    public c02 C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public n84 G;
    public ge H;
    public final Rect w = new Rect();
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public e02(Context context, boolean z2) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.E = z2;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int i3;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            if (i7 > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i3);
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return i2;
            }
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017a  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z2;
        View childAt;
        int findPointerIndex;
        boolean z3;
        boolean z4;
        boolean z5;
        View childAt2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        boolean z6 = true;
        if (actionMasked == 1) {
            z2 = false;
            findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex >= 0) {
            }
        } else if (actionMasked == 2) {
            z2 = true;
            findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex >= 0) {
                int x2 = (int) motionEvent2.getX(findPointerIndex);
                int y2 = (int) motionEvent2.getY(findPointerIndex);
                int pointToPosition = pointToPosition(x2, y2);
                if (pointToPosition != -1) {
                    View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                    float f = (float) x2;
                    float f2 = (float) y2;
                    this.F = true;
                    zz1.a(this, f, f2);
                    if (!isPressed()) {
                        setPressed(true);
                    }
                    layoutChildren();
                    int i2 = this.B;
                    if (!(i2 == -1 || (childAt2 = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt2 == childAt3 || !childAt2.isPressed())) {
                        childAt2.setPressed(false);
                    }
                    this.B = pointToPosition;
                    zz1.a(childAt3, f - ((float) childAt3.getLeft()), f2 - ((float) childAt3.getTop()));
                    if (!childAt3.isPressed()) {
                        childAt3.setPressed(true);
                    }
                    Drawable selector = getSelector();
                    if (selector == null || pointToPosition == -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        selector.setVisible(false, false);
                    }
                    int left = childAt3.getLeft();
                    int top = childAt3.getTop();
                    int right = childAt3.getRight();
                    int bottom = childAt3.getBottom();
                    Rect rect = this.w;
                    rect.set(left, top, right, bottom);
                    rect.left -= this.x;
                    rect.top -= this.y;
                    rect.right += this.z;
                    rect.bottom += this.A;
                    if (Build.VERSION.SDK_INT >= 33) {
                        z4 = b02.a(this);
                    } else {
                        Field field = d02.a;
                        if (field != null) {
                            try {
                                z4 = field.getBoolean(this);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                        z4 = false;
                    }
                    if (childAt3.isEnabled() != z4) {
                        boolean z7 = !z4;
                        if (Build.VERSION.SDK_INT >= 33) {
                            b02.b(this, z7);
                        } else {
                            Field field2 = d02.a;
                            if (field2 != null) {
                                try {
                                    field2.set(this, Boolean.valueOf(z7));
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                    if (z3) {
                        float exactCenterX = rect.exactCenterX();
                        float exactCenterY = rect.exactCenterY();
                        if (getVisibility() == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        selector.setVisible(z5, false);
                        selector.setHotspot(exactCenterX, exactCenterY);
                    }
                    Drawable selector2 = getSelector();
                    if (!(selector2 == null || pointToPosition == -1)) {
                        selector2.setHotspot(f, f2);
                    }
                    c02 c02 = this.C;
                    if (c02 != null) {
                        c02.x = false;
                    }
                    refreshDrawableState();
                    if (actionMasked == 1) {
                        performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                    }
                    z6 = false;
                    z2 = true;
                }
                this.F = false;
                setPressed(false);
                drawableStateChanged();
                childAt = getChildAt(this.B - getFirstVisiblePosition());
                if (childAt != null) {
                }
                n84 n84 = this.G;
                if (z2) {
                }
                return z2;
            }
        } else if (actionMasked != 3) {
            z2 = true;
            z6 = false;
            if (!z2 || z6) {
                this.F = false;
                setPressed(false);
                drawableStateChanged();
                childAt = getChildAt(this.B - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setPressed(false);
                }
            }
            n84 n842 = this.G;
            if (z2) {
                if (n842 == null) {
                    this.G = new n84(this);
                }
                n84 n843 = this.G;
                boolean z8 = n843.L;
                n843.L = true;
                n843.onTouch(this, motionEvent2);
            } else if (n842 != null) {
                if (n842.L) {
                    n842.d();
                }
                n842.L = false;
            }
            return z2;
        }
        z2 = false;
        z6 = false;
        this.F = false;
        setPressed(false);
        drawableStateChanged();
        childAt = getChildAt(this.B - getFirstVisiblePosition());
        if (childAt != null) {
        }
        n84 n8422 = this.G;
        if (z2) {
        }
        return z2;
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.w;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.H == null) {
            super.drawableStateChanged();
            c02 c02 = this.C;
            if (c02 != null) {
                c02.x = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.F && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.E || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.E || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.E || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.E || !this.D) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.H = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.H == null) {
            ge geVar = new ge(6, (Object) this);
            this.H = geVar;
            post(geVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !a02.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            a02.a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            a02.b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            a02.c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.F && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.B = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ge geVar = this.H;
        if (geVar != null) {
            e02 e02 = (e02) geVar.x;
            e02.H = null;
            e02.removeCallbacks(geVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.D = z2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [c02, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        c02 c02 = null;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.w;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.w = drawable;
            drawable.setCallback(drawable2);
            drawable2.x = true;
            c02 = drawable2;
        }
        this.C = c02;
        super.setSelector(c02);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.x = rect.left;
        this.y = rect.top;
        this.z = rect.right;
        this.A = rect.bottom;
    }
}

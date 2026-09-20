package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import cu.lestebang.utiletecsa.R;
import java.util.List;
import java.util.Locale;

/* renamed from: zf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf4 extends zn {
    public final h84 A;
    public final AccessibilityManager B;
    public final Rect C = new Rect();
    public final int D;
    public final float E;
    public ColorStateList F;
    public int G;
    public ColorStateList H;

    public zf4(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        Context context2 = getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F2 = gw8.F(context2, attributeSet2, ov5.i, R.attr.autoCompleteTextViewStyle, 2131886926, new int[0]);
        if (F2.hasValue(0) && F2.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.D = F2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.E = (float) F2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (F2.hasValue(2)) {
            this.F = ColorStateList.valueOf(F2.getColor(2, 0));
        }
        this.G = F2.getColor(4, 0);
        this.H = t49.L(context2, F2, 5);
        this.B = (AccessibilityManager) context2.getSystemService("accessibility");
        h84 h84 = new h84(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.A = h84;
        h84.U = true;
        fp fpVar = h84.V;
        fpVar.setFocusable(true);
        h84.K = this;
        fpVar.setInputMethodMode(2);
        h84.q(getAdapter());
        h84.L = new qp(1, this);
        if (F2.hasValue(6)) {
            setSimpleItems(F2.getResourceId(6, 0));
        }
        F2.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.B;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
            if (next.getSettingsActivityName() != null && next.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.A.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.F;
    }

    public CharSequence getHint() {
        TextInputLayout b = b();
        if (b == null || !b.e0) {
            return super.getHint();
        }
        return b.getHint();
    }

    public float getPopupElevation() {
        return this.E;
    }

    public int getSimpleItemSelectedColor() {
        return this.G;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.H;
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.e0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.dismiss();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i4 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                h84 h84 = this.A;
                if (!h84.V.isShowing()) {
                    i3 = -1;
                } else {
                    i3 = h84.y.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i3) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = h84.V.getBackground();
                if (background != null) {
                    Rect rect = this.C;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i4 = b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (!c()) {
            super.onWindowFocusChanged(z);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.A.q(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        h84 h84 = this.A;
        if (h84 != null) {
            h84.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ug4) {
            ((ug4) dropDownBackground).n(this.F);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.A.M = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.G = i;
        if (getAdapter() instanceof yf4) {
            ((yf4) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        if (getAdapter() instanceof yf4) {
            ((yf4) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new yf4(this, getContext(), this.D, strArr));
    }

    public final void showDropDown() {
        if (c()) {
            this.A.g();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}

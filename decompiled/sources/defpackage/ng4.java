package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: ng4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng4 extends eo {
    public static final int[] U = {R.attr.state_indeterminate};
    public static final int[] V = {R.attr.state_error};
    public static final int[][] W = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int a0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet A = new LinkedHashSet();
    public final LinkedHashSet B = new LinkedHashSet();
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public CharSequence G;
    public Drawable H;
    public Drawable I;
    public boolean J;
    public ColorStateList K;
    public ColorStateList L;
    public PorterDuff.Mode M;
    public int N;
    public int[] O;
    public boolean P;
    public CharSequence Q;
    public CompoundButton.OnCheckedChangeListener R;
    public final tk S;
    public final lg4 T;

    public ng4(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.checkboxStyle, 2131887247), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        tk tkVar = new tk(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = x56.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        tkVar.w = drawable;
        drawable.setCallback(tkVar.B);
        new sk(tkVar.w.getConstantState());
        this.S = tkVar;
        this.T = new lg4(this);
        Context context3 = getContext();
        this.H = getButtonDrawable();
        this.K = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        gw8.l(context3, attributeSet, R.attr.checkboxStyle, 2131887247);
        int[] iArr = ov5.o;
        AttributeSet attributeSet2 = attributeSet;
        gw8.m(context3, attributeSet2, iArr, R.attr.checkboxStyle, 2131887247, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet2, iArr, R.attr.checkboxStyle, 2131887247);
        cf4 cf4 = new cf4(context3, obtainStyledAttributes);
        this.I = cf4.i(2);
        if (this.H != null && gw8.J(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == a0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.H = rc9.N(context3, R.drawable.mtrl_checkbox_button);
                this.J = true;
                if (this.I == null) {
                    this.I = rc9.N(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.L = t49.K(context3, cf4, 3);
        this.M = ya5.n(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.D = obtainStyledAttributes.getBoolean(10, false);
        this.E = obtainStyledAttributes.getBoolean(6, true);
        this.F = obtainStyledAttributes.getBoolean(9, false);
        this.G = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        cf4.A();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.N;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.C == null) {
            int z = h49.z(this, R.attr.colorControlActivated);
            int z2 = h49.z(this, R.attr.colorError);
            int z3 = h49.z(this, R.attr.colorSurface);
            int z4 = h49.z(this, R.attr.colorOnSurface);
            this.C = new ColorStateList(W, new int[]{h49.G(1.0f, z3, z2), h49.G(1.0f, z3, z), h49.G(0.54f, z3, z4), h49.G(0.38f, z3, z4), h49.G(0.38f, z3, z4)});
        }
        return this.C;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.K;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s7 s7Var;
        Drawable drawable = this.H;
        ColorStateList colorStateList3 = this.K;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.H = drawable;
        Drawable drawable2 = this.I;
        ColorStateList colorStateList4 = this.L;
        PorterDuff.Mode mode = this.M;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.I = drawable2;
        if (this.J) {
            tk tkVar = this.S;
            if (tkVar != null) {
                rk rkVar = tkVar.x;
                Drawable drawable3 = tkVar.w;
                lg4 lg4 = this.T;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (lg4.a == null) {
                        lg4.a = new tj(lg4);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(lg4.a);
                }
                ArrayList arrayList = tkVar.A;
                if (!(arrayList == null || lg4 == null)) {
                    arrayList.remove(lg4);
                    if (tkVar.A.size() == 0 && (s7Var = tkVar.z) != null) {
                        rkVar.b.removeListener(s7Var);
                        tkVar.z = null;
                    }
                }
                Drawable drawable4 = tkVar.w;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (lg4.a == null) {
                        lg4.a = new tj(lg4);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(lg4.a);
                } else if (lg4 != null) {
                    if (tkVar.A == null) {
                        tkVar.A = new ArrayList();
                    }
                    if (!tkVar.A.contains(lg4)) {
                        tkVar.A.add(lg4);
                        if (tkVar.z == null) {
                            tkVar.z = new s7(1, (Object) tkVar);
                        }
                        rkVar.b.addListener(tkVar.z);
                    }
                }
            }
            Drawable drawable5 = this.H;
            if ((drawable5 instanceof AnimatedStateListDrawable) && tkVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, tkVar, false);
                ((AnimatedStateListDrawable) this.H).addTransition(R.id.indeterminate, R.id.unchecked, tkVar, false);
            }
        }
        Drawable drawable6 = this.H;
        if (!(drawable6 == null || (colorStateList2 = this.K) == null)) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.I;
        if (!(drawable7 == null || (colorStateList = this.L) == null)) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.H;
        Drawable drawable9 = this.I;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.H;
    }

    public Drawable getButtonIconDrawable() {
        return this.I;
    }

    public ColorStateList getButtonIconTintList() {
        return this.L;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.M;
    }

    public ColorStateList getButtonTintList() {
        return this.K;
    }

    public int getCheckedState() {
        return this.N;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.G;
    }

    public final boolean isChecked() {
        if (this.N == 1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && this.K == null && this.L == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        if (this.F) {
            View.mergeDrawableStates(onCreateDrawableState, V);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.O = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.E || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (getLayoutDirection() == 1) {
            i = -1;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.F) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.G);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mg4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mg4 mg4 = (mg4) parcelable;
        super.onRestoreInstanceState(mg4.getSuperState());
        setCheckedState(mg4.w);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, mg4] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.w = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(rc9.N(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.I = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(rc9.N(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.M != mode) {
            this.M = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            a();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.E = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.N != i) {
            this.N = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.Q == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.P) {
                this.P = true;
                LinkedHashSet linkedHashSet = this.B;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw pb4.g(it);
                    }
                }
                if (!(this.N == 2 || (onCheckedChangeListener = this.R) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.P = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.G = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.F != z) {
            this.F = z;
            refreshDrawableState();
            Iterator it = this.A.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.R = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.Q = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.D = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.H = drawable;
        this.J = false;
        a();
    }
}

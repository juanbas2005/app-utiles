package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: p42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p42 extends LinearLayout {
    public PorterDuff.Mode A;
    public View.OnLongClickListener B;
    public final CheckableImageButton C;
    public final xs0 D;
    public int E = 0;
    public final LinkedHashSet F = new LinkedHashSet();
    public ColorStateList G;
    public PorterDuff.Mode H;
    public int I;
    public ImageView.ScaleType J;
    public View.OnLongClickListener K;
    public CharSequence L;
    public final gq M;
    public boolean N;
    public EditText O;
    public final AccessibilityManager P;
    public AccessibilityManager.TouchExplorationStateChangeListener Q;
    public final n42 R = new n42(this);
    public final TextInputLayout w;
    public final FrameLayout x;
    public final CheckableImageButton y;
    public ColorStateList z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public p42(TextInputLayout textInputLayout, cf4 cf4) {
        super(r1.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        cf4 cf42 = cf4;
        o42 o42 = new o42(this);
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.w = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.y = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.C = a2;
        this.D = new xs0(this, cf42);
        CharSequence charSequence = null;
        gq gqVar = new gq(getContext(), (AttributeSet) null);
        this.M = gqVar;
        TypedArray typedArray = (TypedArray) cf42.y;
        if (typedArray.hasValue(38)) {
            this.z = t49.K(getContext(), cf42, 38);
        }
        if (typedArray.hasValue(39)) {
            this.A = ya5.n(typedArray.getInt(39, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(37)) {
            i(cf42.i(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.G = t49.K(getContext(), cf42, 32);
            }
            if (typedArray.hasValue(33)) {
                this.H = ya5.n(typedArray.getInt(33, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a2.getContentDescription() != (text = typedArray.getText(27))) {
                a2.setContentDescription(text);
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.G = t49.K(getContext(), cf42, 55);
            }
            if (typedArray.hasValue(56)) {
                this.H = ya5.n(typedArray.getInt(56, -1), (PorterDuff.Mode) null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.I) {
                this.I = dimensionPixelSize;
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
                a.setMinimumWidth(dimensionPixelSize);
                a.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType A2 = t49.A(typedArray.getInt(31, -1));
                this.J = A2;
                a2.setScaleType(A2);
                a.setScaleType(A2);
            }
            gqVar.setVisibility(8);
            gqVar.setId(R.id.textinput_suffix_text);
            gqVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            gqVar.setAccessibilityLiveRegion(1);
            gqVar.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                gqVar.setTextColor(cf42.g(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.L = !TextUtils.isEmpty(text3) ? text3 : charSequence;
            gqVar.setText(text3);
            n();
            frameLayout.addView(a2);
            addView(gqVar);
            addView(frameLayout);
            addView(a);
            textInputLayout2.B0.add(o42);
            if (textInputLayout2.A != null) {
                o42.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new fg(2, this));
            return;
        }
        h.q("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (t49.R(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q42 b() {
        q42 q42;
        int i = this.E;
        xs0 xs0 = this.D;
        SparseArray sparseArray = (SparseArray) xs0.d;
        q42 q422 = (q42) sparseArray.get(i);
        if (q422 != null) {
            return q422;
        }
        p42 p42 = (p42) xs0.e;
        if (i == -1) {
            q42 = new yc1(p42, 0);
        } else if (i == 0) {
            q42 = new yc1(p42, 1);
        } else if (i == 1) {
            q42 = new yd5(p42, xs0.c);
        } else if (i == 2) {
            q42 = new jr0(p42);
        } else if (i == 3) {
            q42 = new n02(p42);
        } else {
            h.q(hl6.k(i, "Invalid end icon mode: "));
            return null;
        }
        sparseArray.append(i, q42);
        return q42;
    }

    public final int c() {
        int i;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.C;
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.M.getPaddingEnd() + getPaddingEnd() + i;
    }

    public final boolean d() {
        if (this.x.getVisibility() == 0 && this.C.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.y.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q42 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.C;
        boolean z5 = true;
        if (!j || (z4 = checkableImageButton.z) == b.k()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b instanceof n02) || (isActivated = checkableImageButton.isActivated()) == ((n02) b).l) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            t49.X(this.w, checkableImageButton, this.G);
        }
    }

    public final void g(int i) {
        boolean z2;
        Drawable drawable;
        if (this.E != i) {
            q42 b = b();
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.Q;
            AccessibilityManager accessibilityManager = this.P;
            if (!(touchExplorationStateChangeListener == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            }
            CharSequence charSequence = null;
            this.Q = null;
            b.r();
            this.E = i;
            Iterator it = this.F.iterator();
            if (!it.hasNext()) {
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                h(z2);
                q42 b2 = b();
                int i2 = this.D.b;
                if (i2 == 0) {
                    i2 = b2.d();
                }
                if (i2 != 0) {
                    drawable = rc9.N(getContext(), i2);
                } else {
                    drawable = null;
                }
                CheckableImageButton checkableImageButton = this.C;
                checkableImageButton.setImageDrawable(drawable);
                TextInputLayout textInputLayout = this.w;
                if (drawable != null) {
                    t49.p(textInputLayout, checkableImageButton, this.G, this.H);
                    t49.X(textInputLayout, checkableImageButton, this.G);
                }
                int c = b2.c();
                if (c != 0) {
                    charSequence = getResources().getText(c);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b2.j());
                if (b2.i(textInputLayout.getBoxBackgroundMode())) {
                    b2.q();
                    AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
                    this.Q = h;
                    if (!(h == null || accessibilityManager == null || !isAttachedToWindow())) {
                        accessibilityManager.addTouchExplorationStateChangeListener(this.Q);
                    }
                    View.OnClickListener f = b2.f();
                    View.OnLongClickListener onLongClickListener = this.K;
                    checkableImageButton.setOnClickListener(f);
                    t49.a0(checkableImageButton, onLongClickListener);
                    EditText editText = this.O;
                    if (editText != null) {
                        b2.l(editText);
                        j(b2);
                    }
                    t49.p(textInputLayout, checkableImageButton, this.G, this.H);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
            }
            throw pb4.g(it);
        }
    }

    public final void h(boolean z2) {
        int i;
        if (d() != z2) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            this.C.setVisibility(i);
            k();
            m();
            this.w.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.y;
        checkableImageButton.setImageDrawable(drawable);
        l();
        t49.p(this.w, checkableImageButton, this.z, this.A);
    }

    public final void j(q42 q42) {
        if (this.O != null) {
            if (q42.e() != null) {
                this.O.setOnFocusChangeListener(q42.e());
            }
            if (q42.g() != null) {
                this.C.setOnFocusChangeListener(q42.g());
            }
        }
    }

    public final void k() {
        int i;
        boolean z2;
        int i2 = 8;
        if (this.C.getVisibility() != 0 || e()) {
            i = 8;
        } else {
            i = 0;
        }
        this.x.setVisibility(i);
        if (this.L == null || this.N) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d() || e() || !z2) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void l() {
        int i;
        CheckableImageButton checkableImageButton = this.y;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.w;
        if (drawable == null || !textInputLayout.G.q || !textInputLayout.o()) {
            i = 8;
        } else {
            i = 0;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.E == 0) {
            textInputLayout.s();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.w;
        if (textInputLayout.A != null) {
            if (d() || e()) {
                i = 0;
            } else {
                i = textInputLayout.A.getPaddingEnd();
            }
            this.M.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.A.getPaddingTop(), i, textInputLayout.A.getPaddingBottom());
        }
    }

    public final void n() {
        int i;
        gq gqVar = this.M;
        int visibility = gqVar.getVisibility();
        boolean z2 = false;
        if (this.L == null || this.N) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            q42 b = b();
            if (i == 0) {
                z2 = true;
            }
            b.o(z2);
        }
        k();
        gqVar.setVisibility(i);
        this.w.s();
    }
}

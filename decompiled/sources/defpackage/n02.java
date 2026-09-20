package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import cu.lestebang.utiletecsa.R;

/* renamed from: n02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n02 extends q42 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final fr0 i = new fr0(1, this);
    public final gr0 j = new gr0(this, 1);
    public final m02 k = new m02(this);
    public boolean l;
    public boolean m;
    public boolean n;
    public long o = Long.MAX_VALUE;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public n02(p42 p42) {
        super(p42);
        this.f = kl8.F(p42.getContext(), R.attr.motionDurationShort3, 67);
        this.e = kl8.F(p42.getContext(), R.attr.motionDurationShort3, 50);
        this.g = kl8.G(p42.getContext(), R.attr.motionEasingLinearInterpolator, jl.a);
    }

    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new y0(13, this));
    }

    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    public final boolean i(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return this.n;
    }

    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new k02(this));
            this.h.setOnDismissListener(new l02(this));
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        rf2.r("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void m(c5 c5Var) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        if (this.h.getInputType() == 0) {
            c5Var.i(Spinner.class.getName());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            z = accessibilityNodeInfo.isShowingHintText();
        } else {
            z = c5Var.e(4);
        }
        if (!z) {
            return;
        }
        if (i2 >= 26) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", (CharSequence) null);
        }
    }

    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = SystemClock.uptimeMillis();
            }
        }
    }

    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new j02(this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new j02(this));
        this.q = ofFloat2;
        ofFloat2.addListener(new s7(2, (Object) this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.o;
            if (uptimeMillis < 0 || uptimeMillis > 300) {
                this.m = false;
            }
            if (!this.m) {
                s(!this.n);
                boolean z = this.n;
                AutoCompleteTextView autoCompleteTextView = this.h;
                if (z) {
                    autoCompleteTextView.requestFocus();
                    this.h.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.m = false;
        }
    }
}

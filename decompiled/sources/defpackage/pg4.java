package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import cu.lestebang.utiletecsa.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: pg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pg4<S> extends ou1 {
    public final LinkedHashSet J0 = new LinkedHashSet();
    public final LinkedHashSet K0 = new LinkedHashSet();
    public int L0;
    public tg5 M0;
    public sh0 N0;
    public kg4 O0;
    public int P0;
    public CharSequence Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public CharSequence U0;
    public int V0;
    public CharSequence W0;
    public int X0;
    public CharSequence Y0;
    public int Z0;
    public CharSequence a1;
    public TextView b1;
    public CheckableImageButton c1;
    public ug4 d1;
    public boolean e1;
    public CharSequence f1;
    public CharSequence g1;

    public pg4() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = a08.b();
        b.set(5, 1);
        Calendar a = a08.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean T(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(gw8.K(context, kg4.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        String str;
        if (this.R0) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.R0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(S(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(S(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.c1 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.b1 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.c1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.c1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, rc9.N(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], rc9.N(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.c1;
        if (this.S0 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        e58.m(this.c1, (k4) null);
        CheckableImageButton checkableImageButton3 = this.c1;
        if (this.S0 == 1) {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.c1.setContentDescription(str);
        this.c1.setOnClickListener(new fr0(2, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        R();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, rh0] */
    public final void F(Bundle bundle) {
        zl4 zl4;
        zl4 zl42;
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.L0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        sh0 sh0 = this.N0;
        ? obj = new Object();
        long j = sh0.w.B;
        long j2 = sh0.x.B;
        obj.a = Long.valueOf(sh0.z.B);
        int i = sh0.A;
        bj1 bj1 = sh0.y;
        kg4 kg4 = this.O0;
        if (kg4 == null) {
            zl4 = null;
        } else {
            zl4 = kg4.w0;
        }
        if (zl4 != null) {
            obj.a = Long.valueOf(zl4.B);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bj1);
        zl4 b = zl4.b(j);
        zl4 b2 = zl4.b(j2);
        bj1 bj12 = (bj1) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        if (l == null) {
            zl42 = null;
        } else {
            zl42 = zl4.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new sh0(b, b2, bj12, zl42, i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.Q0);
        bundle.putInt("INPUT_MODE_KEY", this.S0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.T0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.U0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.V0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.W0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.X0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Y0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.a1);
    }

    public final void G() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        g75 g75;
        g75 g752;
        super.G();
        Dialog dialog = this.E0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.R0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.d1);
                if (!this.e1) {
                    View findViewById = M().findViewById(R.id.fullscreen_header);
                    ColorStateList q = we.q(findViewById.getBackground());
                    if (q != null) {
                        num = Integer.valueOf(q.getDefaultColor());
                    } else {
                        num = null;
                    }
                    boolean z3 = false;
                    if (num == null || num.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int y = h49.y(window.getContext(), 16842801, -16777216);
                    if (z) {
                        num = Integer.valueOf(y);
                    }
                    o55.s(window, false);
                    window.getContext();
                    Context context = window.getContext();
                    if (Build.VERSION.SDK_INT < 27) {
                        i = yt0.d(h49.y(context, 16843858, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i);
                    boolean E = h49.E(num.intValue());
                    if (h49.E(0) || E) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ay4 ay4 = new ay4(window.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        g75 = new gb8(window, ay4);
                    } else if (i2 >= 30) {
                        g75 = new gb8(window, ay4);
                    } else if (i2 >= 26) {
                        g75 = new eb8(window, ay4);
                    } else {
                        g75 = new eb8(window, ay4);
                    }
                    g75.S(z2);
                    boolean E2 = h49.E(y);
                    if (h49.E(i) || (i == 0 && E2)) {
                        z3 = true;
                    }
                    ay4 ay42 = new ay4(window.getDecorView());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 35) {
                        g752 = new gb8(window, ay42);
                    } else if (i3 >= 30) {
                        g752 = new gb8(window, ay42);
                    } else if (i3 >= 26) {
                        g752 = new eb8(window, ay42);
                    } else {
                        g752 = new eb8(window, ay42);
                    }
                    g752.R(z3);
                    i22 i22 = new i22(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                    WeakHashMap weakHashMap = e58.a;
                    w48.c(findViewById, i22);
                    this.e1 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = L().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable(this.d1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView = window.getDecorView();
                Dialog dialog2 = this.E0;
                if (dialog2 != null) {
                    decorView.setOnTouchListener(new zc3(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            L();
            int i4 = this.L0;
            if (i4 != 0) {
                R();
                sh0 sh0 = this.N0;
                kg4 kg4 = new kg4();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", sh0);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
                bundle.putParcelable("CURRENT_MONTH_KEY", sh0.z);
                kg4.O(bundle);
                this.O0 = kg4;
                tg5 tg5 = kg4;
                if (this.S0 == 1) {
                    R();
                    sh0 sh02 = this.N0;
                    tg5 xg4 = new xg4();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i4);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", sh02);
                    xg4.O(bundle2);
                    tg5 = xg4;
                }
                this.M0 = tg5;
                TextView textView = this.b1;
                if (this.S0 == 1 && L().getResources().getConfiguration().orientation == 2) {
                    charSequence = this.g1;
                } else {
                    charSequence = this.f1;
                }
                textView.setText(charSequence);
                R();
                throw null;
            }
            R();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void H() {
        this.M0.t0.clear();
        super.H();
    }

    public final Dialog Q() {
        Context L = L();
        L();
        int i = this.L0;
        if (i != 0) {
            Dialog dialog = new Dialog(L, i);
            Context context = dialog.getContext();
            this.R0 = T(context, 16843277);
            this.d1 = new ug4(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131887256);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, ov5.m, R.attr.materialCalendarStyle, 2131887256);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.d1.k(context);
            this.d1.n(ColorStateList.valueOf(color));
            this.d1.m(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        R();
        throw null;
    }

    public final void R() {
        if (this.B.getParcelable("DATE_SELECTOR_KEY") != null) {
            ku4.a();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.c0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.L0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.N0 = (sh0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.S0 = bundle.getInt("INPUT_MODE_KEY");
                this.T0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.U0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.V0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.W0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.X0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.Y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.Z0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.a1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.Q0;
                if (charSequence == null) {
                    charSequence = L().getResources().getText(this.P0);
                }
                this.f1 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.g1 = charSequence;
                return;
            }
            ku4.a();
            return;
        }
        ku4.a();
    }
}

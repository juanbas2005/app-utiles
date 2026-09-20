package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* renamed from: ra  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ra extends vv0 implements DialogInterface, co {
    public wo A;
    public final xo B;
    public final pa C;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ra(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int g = g(contextThemeWrapper, i);
        if (g == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = g;
        }
        this.B = new xo(this);
        ko e = e();
        if (g == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            g = typedValue2.resourceId;
        }
        ((wo) e).p0 = g;
        e.e();
        this.C = new pa(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        wo woVar = (wo) e();
        woVar.y();
        ((ViewGroup) woVar.W.findViewById(16908290)).addView(view, layoutParams);
        woVar.I.a(woVar.H.getCallback());
    }

    public final void dismiss() {
        super.dismiss();
        e().f();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return h03.i(this.B, getWindow().getDecorView(), this, keyEvent);
    }

    public final ko e() {
        if (this.A == null) {
            ol6 ol6 = ko.w;
            this.A = new wo(getContext(), getWindow(), this, this);
        }
        return this.A;
    }

    public final void f(Bundle bundle) {
        e().c();
        super.onCreate(bundle);
        e().e();
    }

    public final View findViewById(int i) {
        wo woVar = (wo) e();
        woVar.y();
        return woVar.H.findViewById(i);
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().m(charSequence);
    }

    public final void invalidateOptionsMenu() {
        wo woVar = (wo) e();
        if (woVar.J != null) {
            woVar.C();
            woVar.J.getClass();
            woVar.D(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        CharSequence charSequence;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        ListAdapter listAdapter;
        int i2;
        int i3;
        View view;
        View findViewById;
        f(bundle);
        pa paVar = this.C;
        paVar.b.setContentView(paVar.u);
        Context context = paVar.a;
        Window window = paVar.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = paVar.f;
        if (view2 == null) {
            view2 = null;
        }
        int i4 = 0;
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !pa.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            charSequence = null;
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (paVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (paVar.e != null) {
                ((q64) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            charSequence = null;
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = pa.b(findViewById6, findViewById3);
        ViewGroup b2 = pa.b(findViewById7, findViewById4);
        ViewGroup b3 = pa.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        paVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        paVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        paVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            paVar.m.removeView(paVar.q);
            if (paVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) paVar.m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(paVar.m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(paVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b2.setVisibility(8);
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        paVar.h = button;
        r7 r7Var = paVar.A;
        button.setOnClickListener(r7Var);
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        Button button2 = paVar.h;
        if (isEmpty) {
            button2.setVisibility(8);
            z2 = false;
        } else {
            button2.setText(charSequence);
            paVar.h.setVisibility(0);
            z2 = true;
        }
        Button button3 = (Button) b3.findViewById(16908314);
        paVar.i = button3;
        button3.setOnClickListener(r7Var);
        boolean isEmpty2 = TextUtils.isEmpty(paVar.j);
        Button button4 = paVar.i;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(paVar.j);
            paVar.i.setVisibility(0);
            z2 |= true;
        }
        Button button5 = (Button) b3.findViewById(16908315);
        paVar.l = button5;
        button5.setOnClickListener(r7Var);
        boolean isEmpty3 = TextUtils.isEmpty((CharSequence) null);
        Button button6 = paVar.l;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            paVar.l.setVisibility(0);
            z2 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                Button button7 = paVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (z2) {
                Button button8 = paVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (z2) {
                Button button9 = paVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (!z2) {
            b3.setVisibility(8);
        }
        if (paVar.r != null) {
            b.addView(paVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            paVar.o = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(paVar.d) || !paVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                paVar.o.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                paVar.p = textView2;
                textView2.setText(paVar.d);
                Drawable drawable = paVar.n;
                if (drawable != null) {
                    paVar.o.setImageDrawable(drawable);
                } else {
                    paVar.p.setPadding(paVar.o.getPaddingLeft(), paVar.o.getPaddingTop(), paVar.o.getPaddingRight(), paVar.o.getPaddingBottom());
                    paVar.o.setVisibility(8);
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b == null || b.getVisibility() == 8) {
            i = 0;
        } else {
            i = 1;
        }
        if (b3.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = paVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (paVar.e != null) {
                view = b.findViewById(R.id.titleDividerNoCustom);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = paVar.e;
        if (alertController$RecycleListView != null && (!z4 || i == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i != 0) {
                i2 = alertController$RecycleListView.getPaddingTop();
            } else {
                i2 = alertController$RecycleListView.w;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z4) {
                i3 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i3 = alertController$RecycleListView.x;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i2, paddingRight, i3);
        }
        if (!z3) {
            View view3 = paVar.e;
            if (view3 == null) {
                view3 = paVar.m;
            }
            if (view3 != null) {
                if (z4) {
                    i4 = 2;
                }
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = e58.a;
                view3.setScrollIndicators(i | i4, 3);
                if (findViewById10 != null) {
                    b2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = paVar.e;
        if (alertController$RecycleListView2 != null && (listAdapter = paVar.s) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i5 = paVar.t;
            if (i5 > -1) {
                alertController$RecycleListView2.setItemChecked(i5, true);
                alertController$RecycleListView2.setSelection(i5);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.C.m;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.C.m;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void onStop() {
        super.onStop();
        wo woVar = (wo) e();
        woVar.C();
        u98 u98 = woVar.J;
        if (u98 != null) {
            u98.u = false;
            d68 d68 = u98.t;
            if (d68 != null) {
                d68.a();
            }
        }
    }

    public final void setContentView(int i) {
        d();
        e().j(i);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        e().m(getContext().getString(i));
    }

    public final void setContentView(View view) {
        d();
        e().k(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().l(view, layoutParams);
    }

    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        pa paVar = this.C;
        paVar.d = charSequence;
        TextView textView = paVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

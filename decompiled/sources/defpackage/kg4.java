package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: kg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kg4<S> extends tg5 {
    public RecyclerView A0;
    public View B0;
    public View C0;
    public View D0;
    public View E0;
    public MaterialButton F0;
    public AccessibilityManager G0;
    public int u0;
    public sh0 v0;
    public zl4 w0;
    public int x0;
    public qc3 y0;
    public RecyclerView z0;

    /* JADX WARNING: type inference failed for: r6v11, types: [vy5, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x01b8, code lost:
        r13 = new defpackage.ib5();
     */
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        mj1 mj1;
        ib5 ib5;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.u0);
        this.y0 = new qc3((Context) contextThemeWrapper, 22);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.G0 = (AccessibilityManager) L().getSystemService("accessibility");
        zl4 zl4 = this.v0.w;
        if (pg4.T(contextThemeWrapper, 16843277)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = L().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = am4.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        e58.m(gridView, new gg4(0));
        int i4 = this.v0.A;
        if (i4 <= 0) {
            mj1 = new mj1();
        }
        gridView.setAdapter(mj1);
        gridView.setNumColumns(zl4.z);
        gridView.setEnabled(false);
        this.A0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.A0.setLayoutManager(new hg4(this, i, i));
        this.A0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.v0, new wv2(24, this));
        this.A0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.z0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.z0.setLayoutManager(new GridLayoutManager(integer));
            this.z0.setAdapter(new kf8(this));
            RecyclerView recyclerView4 = this.z0;
            ? obj = new Object();
            a08.c((Calendar) null);
            a08.c((Calendar) null);
            recyclerView4.g(obj);
        }
        View findViewById = inflate.findViewById(R.id.month_navigation_fragment_toggle);
        sh0 sh0 = cVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.F0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            e58.m(this.F0, new qo0(2, this));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_previous);
            this.B0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(R.id.month_navigation_next);
            this.C0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.D0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.E0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            Q(1);
            this.F0.setText(this.w0.c());
            this.A0.h(new jg4(this, cVar));
            this.F0.setOnClickListener(new r7(2, this));
            this.C0.setOnClickListener(new fg4(this, cVar, 1));
            this.B0.setOnClickListener(new fg4(this, cVar, 0));
            R(sh0.w.d(this.w0));
        }
        if (!pg4.T(contextThemeWrapper, 16843277) && (recyclerView2 = ib5.a) != (recyclerView = this.A0)) {
            ex6 ex6 = ib5.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.B0;
                if (arrayList != null) {
                    arrayList.remove(ex6);
                }
                ib5.a.setOnFlingListener((zy5) null);
            }
            ib5.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    ib5.a.h(ex6);
                    ib5.a.setOnFlingListener(ib5);
                    new Scroller(ib5.a.getContext(), new DecelerateInterpolator());
                    ib5.f();
                } else {
                    h.s("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.A0.Y(sh0.w.d(this.w0));
        e58.m(this.A0, new gg4(1));
        return inflate;
    }

    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.u0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.v0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.w0);
    }

    public final void P(zl4 zl4) {
        boolean z;
        c cVar = (c) this.A0.getAdapter();
        int d = cVar.d.w.d(zl4);
        AccessibilityManager accessibilityManager = this.G0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int d2 = d - cVar.d.w.d(this.w0);
            boolean z2 = false;
            if (Math.abs(d2) > 3) {
                z = true;
            } else {
                z = false;
            }
            if (d2 > 0) {
                z2 = true;
            }
            this.w0 = zl4;
            if (!z || !z2) {
                RecyclerView recyclerView = this.A0;
                if (z) {
                    recyclerView.Y(d + 3);
                    this.A0.post(new cj0(d, 2, (Object) this));
                } else {
                    recyclerView.post(new cj0(d, 2, (Object) this));
                }
            } else {
                this.A0.Y(d - 3);
                this.A0.post(new cj0(d, 2, (Object) this));
            }
        } else {
            this.w0 = zl4;
            this.A0.Y(d);
        }
        R(d);
    }

    public final void Q(int i) {
        this.x0 = i;
        if (i == 2) {
            this.z0.getLayoutManager().o0(this.w0.y - ((kf8) this.z0.getAdapter()).d.v0.w.y);
            this.D0.setVisibility(0);
            this.E0.setVisibility(8);
            this.B0.setVisibility(8);
            this.C0.setVisibility(8);
        } else if (i == 1) {
            this.D0.setVisibility(8);
            this.E0.setVisibility(0);
            this.B0.setVisibility(0);
            this.C0.setVisibility(0);
            P(this.w0);
        }
    }

    public final void R(int i) {
        boolean z;
        View view = this.C0;
        boolean z2 = false;
        if (i + 1 < this.A0.getAdapter().a()) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        View view2 = this.B0;
        if (i - 1 >= 0) {
            z2 = true;
        }
        view2.setEnabled(z2);
    }

    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.v0 = (sh0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.w0 = (zl4) bundle.getParcelable("CURRENT_MONTH_KEY");
            } else {
                ku4.a();
            }
        } else {
            ku4.a();
        }
    }
}

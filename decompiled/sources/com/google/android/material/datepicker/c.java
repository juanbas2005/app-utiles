package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cu.lestebang.utiletecsa.R;
import java.util.Calendar;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c extends py5 {
    public final sh0 d;
    public final wv2 e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, sh0 sh0, wv2 wv2) {
        int i;
        zl4 zl4 = sh0.w;
        zl4 zl42 = sh0.x;
        zl4 zl43 = sh0.z;
        if (zl4.w.compareTo(zl43.w) > 0) {
            h.q("firstPage cannot be after currentPage");
            throw null;
        } else if (zl43.w.compareTo(zl42.w) <= 0) {
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * am4.d;
            if (pg4.T(contextThemeWrapper, 16843277)) {
                i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            } else {
                i = 0;
            }
            this.f = dimensionPixelSize + i;
            this.d = sh0;
            this.e = wv2;
            if (!this.a.a()) {
                this.b = true;
            } else {
                h.s("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                throw null;
            }
        } else {
            h.q("currentPage cannot be after lastPage");
            throw null;
        }
    }

    public final int a() {
        return this.d.C;
    }

    public final long b(int i) {
        Calendar a = a08.a(this.d.w.w);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = a08.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    public final void c(lz5 lz5, int i) {
        b bVar = (b) lz5;
        sh0 sh0 = this.d;
        Calendar a = a08.a(sh0.w.w);
        a.add(2, i);
        zl4 zl4 = new zl4(a);
        bVar.u.setText(zl4.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !zl4.equals(materialCalendarGridView.a().a)) {
            new am4(zl4, sh0);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final lz5 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!pg4.T(viewGroup.getContext(), 16843277)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new yy5(-1, this.f));
        return new b(linearLayout, true);
    }
}

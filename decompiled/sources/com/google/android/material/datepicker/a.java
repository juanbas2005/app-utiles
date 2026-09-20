package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView w;
    public final /* synthetic */ c x;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.x = cVar;
        this.w = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.w;
        am4 a = materialCalendarGridView.a();
        if (i >= a.a() && i <= a.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() >= ((kg4) this.x.e.x).v0.y.w) {
                throw null;
            }
        }
    }
}

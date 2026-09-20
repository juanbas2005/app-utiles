package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b extends lz5 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = e58.a;
        new s48(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}

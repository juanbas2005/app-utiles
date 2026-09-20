package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: a84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a84 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ h84 w;

    public a84(h84 h84) {
        this.w = h84;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        e02 e02;
        if (i != -1 && (e02 = this.w.y) != null) {
            e02.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

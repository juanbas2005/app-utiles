package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ExpandedMenuView extends ListView implements si4, tj4, AdapterView.OnItemClickListener {
    public static final int[] x = {16842964, 16843049};
    public ti4 w;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        cf4 w2 = cf4.w(context, attributeSet, x, 16842868);
        TypedArray typedArray = (TypedArray) w2.y;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w2.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w2.i(1));
        }
        w2.A();
    }

    public final boolean a(yi4 yi4) {
        return this.w.q(yi4, (rj4) null, 0);
    }

    public final void b(ti4 ti4) {
        this.w = ti4;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((yi4) getAdapter().getItem(i));
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: z76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z76 extends ViewGroup {
    public int A;
    public final int w = 5;
    public final ArrayList x;
    public final ArrayList y;
    public final r52 z;

    public z76(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.y = arrayList2;
        this.z = new r52(1);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.A = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void requestLayout() {
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}

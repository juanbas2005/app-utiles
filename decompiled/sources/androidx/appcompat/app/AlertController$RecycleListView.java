package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AlertController$RecycleListView extends ListView {
    public final int w;
    public final int x;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.t);
        this.x = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.w = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}

package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: aj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj4 extends FrameLayout implements ys0 {
    public final CollapsibleActionView w;

    public aj4(View view) {
        super(view.getContext());
        this.w = (CollapsibleActionView) view;
        addView(view);
    }
}

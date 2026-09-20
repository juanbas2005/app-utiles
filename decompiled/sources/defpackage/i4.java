package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: i4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i4 extends ClickableSpan {
    public final int w;
    public final c5 x;
    public final int y;

    public i4(int i, c5 c5Var, int i2) {
        this.w = i;
        this.x = c5Var;
        this.y = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.w);
        this.x.a.performAction(this.y, bundle);
    }
}

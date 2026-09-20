package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: ip0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ip0 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public ip0(Chip chip) {
        this.a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        lp0 lp0 = this.a.A;
        if (lp0 != null) {
            lp0.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

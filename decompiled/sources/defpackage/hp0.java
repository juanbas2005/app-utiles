package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: hp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hp0 extends t35 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hp0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public final void y(int i) {
        switch (this.c) {
            case b85.b:
                return;
            default:
                xd7 xd7 = (xd7) this.d;
                xd7.d = true;
                lp0 lp0 = (lp0) xd7.e.get();
                if (lp0 != null) {
                    lp0.A();
                    lp0.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public final void z(Typeface typeface, boolean z) {
        CharSequence charSequence;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                Chip chip = (Chip) obj;
                lp0 lp0 = chip.A;
                if (lp0.h1) {
                    charSequence = lp0.j0;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    xd7 xd7 = (xd7) obj;
                    xd7.d = true;
                    lp0 lp02 = (lp0) xd7.e.get();
                    if (lp02 != null) {
                        lp02.A();
                        lp02.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void I(int i) {
    }
}

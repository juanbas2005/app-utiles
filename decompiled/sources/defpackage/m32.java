package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: m32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m32 extends dh4 {
    public final l32 F;

    public m32(TextView textView) {
        this.F = new l32(textView);
    }

    public final void E(boolean z) {
        if (w22.d()) {
            this.F.E(z);
        }
    }

    public final void F(boolean z) {
        boolean d = w22.d();
        l32 l32 = this.F;
        if (!d) {
            l32.H = z;
        } else {
            l32.F(z);
        }
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!w22.d()) {
            return inputFilterArr;
        }
        return this.F.p(inputFilterArr);
    }
}

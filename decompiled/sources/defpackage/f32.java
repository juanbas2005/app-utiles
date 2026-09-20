package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: f32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f32 implements InputFilter {
    public final TextView a;
    public e32 b;

    public f32(TextView textView) {
        this.a = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 != 3) goto L_0x0048;
     */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int c = w22.a().c();
            if (c != 0) {
                if (c == 1) {
                    if (!((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null)) {
                        if (!(i == 0 && i2 == charSequence.length())) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return w22.a().g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            w22 a2 = w22.a();
            if (this.b == null) {
                this.b = new e32(textView, this);
            }
            a2.h(this.b);
            return charSequence;
        }
        return charSequence;
    }
}

package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* renamed from: uc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uc7 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public uc7(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc7)) {
            return false;
        }
        uc7 uc7 = (uc7) obj;
        if (sg3.e(this.a, uc7.a) && lg7.b(this.b, uc7.b) && sg3.e(this.c, uc7.c) && this.d.equals(uc7.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = lg7.c;
        int b2 = pb4.b(this.a.hashCode() * 31, 31, this.b);
        return this.d.hashCode() + ((this.c.hashCode() + b2) * 31);
    }

    public final String toString() {
        String h = lg7.h(this.b);
        TextClassification textClassification = this.c;
        return "TextClassificationResult(text=" + this.a + ", selection=" + h + ", textClassification=" + textClassification + ", icons=" + this.d + ")";
    }
}

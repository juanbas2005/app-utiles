package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* renamed from: nd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nd7 extends xc7 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public nd7(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        TextClassification textClassification = this.b;
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + textClassification + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}

package defpackage;

import java.text.BreakIterator;

/* renamed from: ax2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ax2 extends h49 {
    public final BreakIterator C;

    public ax2(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.C = characterInstance;
    }

    public final int H(int i) {
        return this.C.following(i);
    }

    public final int J(int i) {
        return this.C.preceding(i);
    }
}

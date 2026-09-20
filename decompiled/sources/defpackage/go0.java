package defpackage;

import java.text.CharacterIterator;

/* renamed from: go0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class go0 implements CharacterIterator {
    public final CharSequence w;
    public final int x;
    public int y = 0;

    public go0(int i, CharSequence charSequence) {
        this.w = charSequence;
        this.x = i;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final char current() {
        int i = this.y;
        if (i == this.x) {
            return 65535;
        }
        return this.w.charAt(i);
    }

    public final char first() {
        this.y = 0;
        return current();
    }

    public final int getBeginIndex() {
        return 0;
    }

    public final int getEndIndex() {
        return this.x;
    }

    public final int getIndex() {
        return this.y;
    }

    public final char last() {
        int i = this.x;
        if (i == 0) {
            this.y = i;
            return 65535;
        }
        int i2 = i - 1;
        this.y = i2;
        return this.w.charAt(i2);
    }

    public final char next() {
        int i = this.y + 1;
        this.y = i;
        int i2 = this.x;
        if (i < i2) {
            return this.w.charAt(i);
        }
        this.y = i2;
        return 65535;
    }

    public final char previous() {
        int i = this.y;
        if (i <= 0) {
            return 65535;
        }
        int i2 = i - 1;
        this.y = i2;
        return this.w.charAt(i2);
    }

    public final char setIndex(int i) {
        if (i > this.x || i < 0) {
            h.q("invalid position");
            return 0;
        }
        this.y = i;
        return current();
    }
}

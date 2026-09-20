package defpackage;

import java.util.Iterator;

/* renamed from: fo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fo0 implements Iterable, ar3 {
    public final char w;
    public final char x;
    public final int y = 1;

    static {
        new fo0(1, 0);
    }

    public fo0(char c, char c2) {
        this.w = c;
        this.x = (char) wn6.m(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fo0)) {
            return false;
        }
        char c = this.w;
        char c2 = this.x;
        if (c > c2) {
            fo0 fo0 = (fo0) obj;
            if (fo0.w > fo0.x) {
                return true;
            }
        }
        fo0 fo02 = (fo0) obj;
        if (c == fo02.w && c2 == fo02.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c = this.w;
        char c2 = this.x;
        if (c > c2) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final Iterator iterator() {
        return new eo0(this.w, this.x, this.y);
    }

    public final String toString() {
        return this.w + ".." + this.x;
    }
}

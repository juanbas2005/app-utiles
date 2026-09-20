package defpackage;

import java.util.Iterator;

/* renamed from: y64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y64 implements Iterator, ar3 {
    public int A;
    public final String w;
    public int x;
    public int y;
    public int z;

    public y64(String str) {
        this.w = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r1 = r4;
     */
    public final boolean hasNext() {
        int i;
        int i2 = this.x;
        if (i2 == 0) {
            int i3 = 2;
            if (this.A < 0) {
                this.x = 2;
                return false;
            }
            String str = this.w;
            int length = str.length();
            int i4 = this.y;
            int length2 = str.length();
            while (true) {
                if (i4 >= length2) {
                    i3 = -1;
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt != 10 && charAt != 13) {
                    i4++;
                } else if (!(charAt == 13 && (i = i4 + 1) < str.length() && str.charAt(i) == 10)) {
                    i3 = 1;
                }
            }
            this.x = 1;
            this.A = i3;
            this.z = length;
            return true;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.x = 0;
            int i = this.z;
            int i2 = this.y;
            this.y = this.A + i;
            return this.w.subSequence(i2, i).toString();
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

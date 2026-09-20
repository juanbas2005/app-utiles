package defpackage;

import java.util.Iterator;
import java.util.Stack;

/* renamed from: h96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h96 implements Iterator {
    public final Stack w = new Stack();
    public b94 x;

    public h96(bg0 bg0) {
        while (bg0 instanceof j96) {
            j96 j96 = (j96) bg0;
            this.w.push(j96);
            bg0 = j96.y;
        }
        this.x = (b94) bg0;
    }

    /* renamed from: a */
    public final b94 next() {
        b94 b94 = this.x;
        b94 b942 = null;
        if (b94 != null) {
            while (true) {
                Stack stack = this.w;
                if (!stack.isEmpty()) {
                    bg0 bg0 = ((j96) stack.pop()).z;
                    while (bg0 instanceof j96) {
                        j96 j96 = (j96) bg0;
                        stack.push(j96);
                        bg0 = j96.y;
                    }
                    b94 b943 = (b94) bg0;
                    if (b943.x.length != 0) {
                        b942 = b943;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.x = b942;
            return b94;
        }
        rf2.c();
        return null;
    }

    public final boolean hasNext() {
        if (this.x != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

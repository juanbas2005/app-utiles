package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: ip4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ip4 implements ListIterator, ar3 {
    public final /* synthetic */ int w;
    public final List x;
    public int y;

    public ip4(List list, int i, int i2) {
        this.w = i2;
        switch (i2) {
            case 1:
                this.x = list;
                this.y = i;
                return;
            default:
                this.x = list;
                this.y = i - 1;
                return;
        }
    }

    public final void add(Object obj) {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                int i2 = this.y + 1;
                this.y = i2;
                list.add(i2, obj);
                return;
            default:
                list.add(this.y, obj);
                this.y++;
                return;
        }
    }

    public final boolean hasNext() {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                if (this.y < list.size() - 1) {
                    return true;
                }
                return false;
            default:
                if (this.y < list.size()) {
                    return true;
                }
                return false;
        }
    }

    public final boolean hasPrevious() {
        switch (this.w) {
            case b85.b:
                if (this.y >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.y > 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                int i2 = this.y + 1;
                this.y = i2;
                return list.get(i2);
            default:
                int i3 = this.y;
                this.y = i3 + 1;
                return list.get(i3);
        }
    }

    public final int nextIndex() {
        switch (this.w) {
            case b85.b:
                return this.y + 1;
            default:
                return this.y;
        }
    }

    public final Object previous() {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                int i2 = this.y;
                this.y = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.y - 1;
                this.y = i3;
                return list.get(i3);
        }
    }

    public final int previousIndex() {
        switch (this.w) {
            case b85.b:
                return this.y;
            default:
                return this.y - 1;
        }
    }

    public final void remove() {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                list.remove(this.y);
                this.y--;
                return;
            default:
                int i2 = this.y - 1;
                this.y = i2;
                list.remove(i2);
                return;
        }
    }

    public final void set(Object obj) {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                list.set(this.y, obj);
                return;
            default:
                list.set(this.y, obj);
                return;
        }
    }
}

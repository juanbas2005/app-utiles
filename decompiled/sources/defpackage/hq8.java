package defpackage;

import java.util.Iterator;

/* renamed from: hq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hq8 implements Iterator {
    public final /* synthetic */ int w;
    public int x = 0;
    public final /* synthetic */ Object y;

    public /* synthetic */ hq8(int i, Object obj) {
        this.w = i;
        this.y = obj;
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                if (this.x < ((mq8) this.y).w.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.x < ((mq8) this.y).w.length()) {
                    return true;
                }
                return false;
            default:
                if (this.x < ((rl8) this.y).y()) {
                    return true;
                }
                return false;
        }
    }

    public final /* synthetic */ Object next() {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                String str = ((mq8) obj).w;
                int i2 = this.x;
                if (i2 < str.length()) {
                    this.x = i2 + 1;
                    return new mq8(String.valueOf(i2));
                }
                rf2.c();
                return null;
            case 1:
                mq8 mq8 = (mq8) obj;
                String str2 = mq8.w;
                int i3 = this.x;
                if (i3 < str2.length()) {
                    this.x = i3 + 1;
                    return new mq8(String.valueOf(mq8.w.charAt(i3)));
                }
                rf2.c();
                return null;
            default:
                rl8 rl8 = (rl8) obj;
                int i4 = this.x;
                int y2 = rl8.y();
                int i5 = this.x;
                if (i4 < y2) {
                    this.x = i5 + 1;
                    return rl8.z(i5);
                }
                kj6.i(hl6.p(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
                return null;
        }
    }
}

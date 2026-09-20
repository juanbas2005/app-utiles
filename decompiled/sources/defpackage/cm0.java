package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: cm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cm0 extends m2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fm0 x;

    public /* synthetic */ cm0(fm0 fm0, int i) {
        this.w = i;
        this.x = fm0;
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                ((String) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    public final boolean contains(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!mp7.b0(obj)) {
                    return false;
                }
                return super.contains((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.x.containsKey((String) obj);
        }
    }

    public final int f() {
        int i = this.w;
        fm0 fm0 = this.x;
        switch (i) {
            case b85.b:
                return fm0.y;
            default:
                return fm0.y;
        }
    }

    public final Iterator iterator() {
        int i = this.w;
        fm0 fm0 = this.x;
        switch (i) {
            case b85.b:
                return new bm0(fm0, 0);
            default:
                return new bm0(fm0, 1);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!mp7.b0(obj)) {
                    return false;
                }
                return super.remove((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                if (this.x.remove((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}

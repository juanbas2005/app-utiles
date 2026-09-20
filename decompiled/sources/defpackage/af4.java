package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: af4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class af4 extends m2 {
    public final /* synthetic */ int w;
    public final ze4 x;

    public /* synthetic */ af4(ze4 ze4, int i) {
        this.w = i;
        this.x = ze4;
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b /*0*/:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        int i = this.w;
        collection.getClass();
        switch (i) {
            case b85.b /*0*/:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.w) {
            case b85.b /*0*/:
                this.x.clear();
                return;
            default:
                this.x.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i = this.w;
        ze4 ze4 = this.x;
        switch (i) {
            case b85.b /*0*/:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ze4.getClass();
                int h = ze4.h(entry.getKey());
                if (h < 0) {
                    return false;
                }
                Object[] objArr = ze4.x;
                objArr.getClass();
                return sg3.e(objArr[h], entry.getValue());
            default:
                return ze4.containsKey(obj);
        }
    }

    public boolean containsAll(Collection collection) {
        switch (this.w) {
            case b85.b /*0*/:
                collection.getClass();
                return this.x.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public final int f() {
        switch (this.w) {
            case b85.b /*0*/:
                return this.x.E;
            default:
                return this.x.E;
        }
    }

    public final boolean isEmpty() {
        switch (this.w) {
            case b85.b /*0*/:
                return this.x.isEmpty();
            default:
                return this.x.isEmpty();
        }
    }

    public final Iterator iterator() {
        int i = this.w;
        ze4 ze4 = this.x;
        switch (i) {
            case b85.b /*0*/:
                ze4.getClass();
                return new we4(ze4, 0);
            default:
                ze4.getClass();
                return new we4(ze4, 1);
        }
    }

    public final boolean remove(Object obj) {
        int i = this.w;
        ze4 ze4 = this.x;
        switch (i) {
            case b85.b /*0*/:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ze4.getClass();
                    ze4.c();
                    int h = ze4.h(entry.getKey());
                    if (h >= 0) {
                        Object[] objArr = ze4.x;
                        objArr.getClass();
                        if (sg3.e(objArr[h], entry.getValue())) {
                            ze4.n(h);
                            return true;
                        }
                    }
                }
                return false;
            default:
                ze4.c();
                int h2 = ze4.h(obj);
                if (h2 < 0) {
                    return false;
                }
                ze4.n(h2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        int i = this.w;
        ze4 ze4 = this.x;
        collection.getClass();
        switch (i) {
            case b85.b /*0*/:
                ze4.c();
                return super.removeAll(collection);
            default:
                ze4.c();
                return super.removeAll(collection);
        }
    }

    public final boolean retainAll(Collection collection) {
        int i = this.w;
        ze4 ze4 = this.x;
        collection.getClass();
        switch (i) {
            case b85.b /*0*/:
                ze4.c();
                return super.retainAll(collection);
            default:
                ze4.c();
                return super.retainAll(collection);
        }
    }
}

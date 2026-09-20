package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: em0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class em0 extends AbstractCollection implements Collection, br3 {
    public final /* synthetic */ int w;
    public final Object x;

    public em0(fm0 fm0) {
        this.w = 0;
        this.x = fm0;
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b:
                obj.getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean addAll(Collection collection) {
        switch (this.w) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    public void clear() {
        switch (this.w) {
            case 1:
                ((ze4) this.x).clear();
                return;
            case 2:
                ((yf5) this.x).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    public boolean contains(Object obj) {
        switch (this.w) {
            case 1:
                return ((ze4) this.x).containsValue(obj);
            case 2:
                return ((yf5) this.x).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    public boolean isEmpty() {
        switch (this.w) {
            case 1:
                return ((ze4) this.x).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    public final Iterator iterator() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return new bm0((fm0) obj, 2);
            case 1:
                ze4 ze4 = (ze4) obj;
                ze4.getClass();
                return new we4(ze4, 2);
            default:
                yf5 yf5 = (yf5) obj;
                sn7[] sn7Arr = new sn7[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    sn7Arr[i2] = new tn7(2);
                }
                return new zf5(yf5, sn7Arr);
        }
    }

    public boolean remove(Object obj) {
        switch (this.w) {
            case 1:
                ze4 ze4 = (ze4) this.x;
                ze4.c();
                int j = ze4.j(obj);
                if (j < 0) {
                    return false;
                }
                ze4.n(j);
                return true;
            default:
                return super.remove(obj);
        }
    }

    public boolean removeAll(Collection collection) {
        switch (this.w) {
            case 1:
                collection.getClass();
                ((ze4) this.x).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    public boolean retainAll(Collection collection) {
        switch (this.w) {
            case 1:
                collection.getClass();
                ((ze4) this.x).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    public final int size() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((fm0) obj).y;
            case 1:
                return ((ze4) obj).E;
            default:
                return ((yf5) obj).c();
        }
    }

    public /* synthetic */ em0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}

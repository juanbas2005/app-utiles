package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: kp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp4 implements List, cr3 {
    public final /* synthetic */ int w;
    public final List x;
    public final int y;
    public int z;

    public /* synthetic */ kp4(List list, int i, int i2, int i3) {
        this.w = i3;
        this.x = list;
        this.y = i;
        this.z = i2;
    }

    public final void add(int i, Object obj) {
        int i2 = this.w;
        int i3 = this.y;
        List list = this.x;
        switch (i2) {
            case b85.b:
                list.add(i + i3, obj);
                this.z++;
                return;
            default:
                list.add(i + i3, obj);
                this.z++;
                return;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        int i2 = this.w;
        int i3 = this.y;
        List list = this.x;
        switch (i2) {
            case b85.b:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.z = collection.size() + this.z;
                if (collection.size() > 0) {
                    return true;
                }
                return false;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.z += size;
                if (size > 0) {
                    return true;
                }
                return false;
        }
    }

    public final void clear() {
        int i = this.w;
        List list = this.x;
        int i2 = this.y;
        switch (i) {
            case b85.b:
                int i3 = this.z - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.z = i2;
                return;
            default:
                int i4 = this.z - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.z = i2;
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i = this.w;
        List list = this.x;
        int i2 = this.y;
        switch (i) {
            case b85.b:
                int i3 = this.z;
                while (i2 < i3) {
                    if (sg3.e(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.z;
                while (i2 < i4) {
                    if (sg3.e(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                collection.getClass();
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                for (Object contains2 : collection) {
                    if (!contains(contains2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final Object get(int i) {
        int i2 = this.w;
        int i3 = this.y;
        List list = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                return list.get(i + i3);
            default:
                fq4.a(i, this);
                return list.get(i + i3);
        }
    }

    public final int indexOf(Object obj) {
        int i = this.w;
        List list = this.x;
        int i2 = this.y;
        switch (i) {
            case b85.b:
                int i3 = this.z;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (sg3.e(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.z;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (sg3.e(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    public final boolean isEmpty() {
        switch (this.w) {
            case b85.b:
                if (this.z == this.y) {
                    return true;
                }
                return false;
            default:
                if (this.z == this.y) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b:
                return new ip4(this, 0, 0);
            default:
                return new ip4(this, 0, 1);
        }
    }

    public final int lastIndexOf(Object obj) {
        int i = this.w;
        List list = this.x;
        int i2 = this.y;
        switch (i) {
            case b85.b:
                int i3 = this.z - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!sg3.e(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.z - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!sg3.e(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    public final ListIterator listIterator() {
        switch (this.w) {
            case b85.b:
                return new ip4(this, 0, 0);
            default:
                return new ip4(this, 0, 1);
        }
    }

    public final boolean remove(Object obj) {
        int i = this.w;
        int i2 = this.y;
        List list = this.x;
        switch (i) {
            case b85.b:
                int i3 = this.z;
                while (i2 < i3) {
                    if (sg3.e(list.get(i2), obj)) {
                        list.remove(i2);
                        this.z--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.z;
                while (i2 < i4) {
                    if (sg3.e(list.get(i2), obj)) {
                        list.remove(i2);
                        this.z--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                collection.getClass();
                int i = this.z;
                for (Object remove : collection) {
                    remove(remove);
                }
                if (i != this.z) {
                    return true;
                }
                return false;
            default:
                int i2 = this.z;
                for (Object remove2 : collection) {
                    remove(remove2);
                }
                if (i2 != this.z) {
                    return true;
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        int i = this.w;
        int i2 = this.y;
        List list = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                int i3 = this.z;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.z--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.z) {
                    return true;
                }
                return false;
            default:
                int i5 = this.z;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.z--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.z) {
                    return true;
                }
                return false;
        }
    }

    public final Object set(int i, Object obj) {
        int i2 = this.w;
        int i3 = this.y;
        List list = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                return list.set(i + i3, obj);
            default:
                fq4.a(i, this);
                return list.set(i + i3, obj);
        }
    }

    public final int size() {
        int i;
        int i2;
        switch (this.w) {
            case b85.b:
                i = this.z;
                i2 = this.y;
                break;
            default:
                i = this.z;
                i2 = this.y;
                break;
        }
        return i - i2;
    }

    public final List subList(int i, int i2) {
        switch (this.w) {
            case b85.b:
                w25.b(this, i, i2);
                return new kp4(this, i, i2, 0);
            default:
                fq4.b(this, i, i2);
                return new kp4(this, i, i2, 1);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.w) {
            case b85.b:
                objArr.getClass();
                return rc9.X0(this, objArr);
            default:
                return rc9.X0(this, objArr);
        }
    }

    public final Object[] toArray() {
        switch (this.w) {
            case b85.b:
                return rc9.W0(this);
            default:
                return rc9.W0(this);
        }
    }

    public final ListIterator listIterator(int i) {
        switch (this.w) {
            case b85.b:
                return new ip4(this, i, 0);
            default:
                return new ip4(this, i, 1);
        }
    }

    public final boolean add(Object obj) {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                int i2 = this.z;
                this.z = i2 + 1;
                list.add(i2, obj);
                return true;
            default:
                int i3 = this.z;
                this.z = i3 + 1;
                list.add(i3, obj);
                return true;
        }
    }

    public final boolean addAll(Collection collection) {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                list.addAll(this.z, collection);
                this.z = collection.size() + this.z;
                if (collection.size() > 0) {
                    return true;
                }
                return false;
            default:
                list.addAll(this.z, collection);
                int size = collection.size();
                this.z += size;
                if (size > 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object remove(int i) {
        int i2 = this.w;
        int i3 = this.y;
        List list = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                this.z--;
                return list.remove(i + i3);
            default:
                fq4.a(i, this);
                this.z--;
                return list.remove(i + i3);
        }
    }
}

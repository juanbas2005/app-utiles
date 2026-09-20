package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: op4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op4 implements lr3, Set, ar3 {
    public final mp4 w;
    public final mp4 x;

    public op4(mp4 mp4) {
        mp4.getClass();
        this.w = mp4;
        this.x = mp4;
    }

    public final boolean add(Object obj) {
        return this.x.a(obj);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        mp4 mp4 = this.x;
        mp4.getClass();
        int i = mp4.g;
        for (Object g : collection) {
            mp4.g(g);
        }
        if (i != mp4.g) {
            return true;
        }
        return false;
    }

    public final void clear() {
        this.x.b();
    }

    public final boolean contains(Object obj) {
        return this.w.c(obj);
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object c : collection) {
            if (!this.w.c(c)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || op4.class != obj.getClass()) {
            return false;
        }
        return sg3.e(this.w, ((op4) obj).w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final boolean isEmpty() {
        if (this.w.g == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new bv2(this);
    }

    public final boolean remove(Object obj) {
        return this.x.h(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
        if (((r9 & ((~r9) << 6)) & -9187201950435737472L) == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        r15 = -1;
     */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        int i3;
        collection.getClass();
        mp4 mp4 = this.x;
        mp4.getClass();
        int i4 = mp4.g;
        Iterator it = collection.iterator();
        while (true) {
            int i5 = 1;
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            int i7 = i * -862048943;
            int i8 = i7 ^ (i7 << 16);
            int i9 = i8 & 127;
            int i10 = mp4.f;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = mp4.a;
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                long j = ((jArr[i12 + i5] << (64 - i13)) & ((-((long) i13)) >> 63)) | (jArr[i12] >>> i13);
                long j2 = (((long) i9) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i3 = ((Long.numberOfTrailingZeros(j3) >> 3) + i11) & i10;
                    int i14 = i5;
                    if (sg3.e(mp4.b[i3], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i5 = i14;
                }
                i6 += 8;
                i11 = (i11 + i6) & i10;
                i5 = i2;
            }
            if (i3 >= 0) {
                mp4.i(i3);
            }
        }
        if (i4 != mp4.g) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.x.j(collection);
    }

    public final int size() {
        return this.w.g;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }

    public final String toString() {
        return this.w.toString();
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }
}

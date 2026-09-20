package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.g;

/* renamed from: w94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w94 implements Collection, ar3 {
    public final qc4 w;
    public final LocalDate x;
    public final LocalDate y;

    public w94(LocalDate localDate, LocalDate localDate2) {
        long epochDays = localDate.toEpochDays();
        qc4 qc4 = new qc4(epochDays, localDate2.toEpochDays());
        this.w = qc4;
        LocalDate.Companion.getClass();
        this.x = r94.a(epochDays);
        this.y = r94.a(qc4.x);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof LocalDate)) {
            return false;
        }
        LocalDate localDate = (LocalDate) obj;
        g gVar = (g) this;
        if (gVar.x.compareTo(localDate) > 0 || localDate.compareTo(gVar.y) > 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (!(next instanceof LocalDate) || !contains(next)) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w94)) {
            return false;
        }
        if (sg3.e(this.w, ((w94) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final Iterator iterator() {
        qc4 qc4 = this.w;
        return new x94(new rc4(qc4.w, qc4.x, qc4.y), 0);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return sg3.z(this.w);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }
}

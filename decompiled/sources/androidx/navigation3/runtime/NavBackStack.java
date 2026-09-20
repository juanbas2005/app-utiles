package androidx.navigation3.runtime;

import defpackage.vu4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010+\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 F*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00060\u0005j\u0002`\u0006:\u0001GB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bB\u001d\b\u0016\u0012\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001e\u0010\u0019\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001e\u0010\u000bJ \u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0003¢\u0006\u0004\b+\u0010\u0012J\u001e\u0010,\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0001¢\u0006\u0004\b,\u0010\u001aJ\u0018\u0010-\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b-\u0010\"J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0010H\u0001¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b5\u0010/J\u0018\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109J*\u0010=\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u000206H\u0001¢\u0006\u0004\b=\u0010>R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u0002068\u0016X\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u000b\u0010E\u001a\u00020\u00138\u0016X\u0005¨\u0006H"}, d2 = {"Landroidx/navigation3/runtime/NavBackStack;", "Lvu4;", "T", "", "Ln37;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lyx6;", "base", "<init>", "(Lyx6;)V", "()V", "", "elements", "([Lvu4;)V", "element", "", "add", "(Lvu4;)Z", "", "index", "Lvs7;", "(ILvu4;)V", "remove", "", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "removeAll", "retainAll", "clear", "set", "(ILvu4;)Lvu4;", "removeAt", "(I)Lvu4;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "contains", "containsAll", "get", "indexOf", "(Lvu4;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "Lp37;", "value", "prependStateRecord", "(Lp37;)V", "previous", "current", "applied", "mergeRecords", "(Lp37;Lp37;Lp37;)Lp37;", "Lyx6;", "getBase$navigation3_runtime", "()Lyx6;", "getFirstStateRecord", "()Lp37;", "firstStateRecord", "size", "Companion", "ys4", "navigation3-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = dt4.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class NavBackStack<T extends vu4> implements List<T>, n37, RandomAccess, cr3 {
    public static final int $stable = 0;
    public static final ys4 Companion = new Object();
    private final yx6 base;

    /* JADX WARNING: Illegal instructions before constructor call */
    public NavBackStack(T... tArr) {
        this(r0);
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        yx6 yx6 = new yx6();
        yx6.addAll(qs.p1(copyOf));
    }

    public boolean add(T t) {
        return this.base.add(t);
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        return this.base.addAll(i, collection);
    }

    public void clear() {
        this.base.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof vu4)) {
            return false;
        }
        return contains((vu4) obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.base.containsAll(collection);
    }

    public T get(int i) {
        return (vu4) this.base.get(i);
    }

    public final yx6 getBase$navigation3_runtime() {
        return this.base;
    }

    public p37 getFirstStateRecord() {
        return this.base.w;
    }

    public int getSize() {
        return this.base.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof vu4)) {
            return -1;
        }
        return indexOf((vu4) obj);
    }

    public boolean isEmpty() {
        return this.base.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.base.listIterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof vu4)) {
            return -1;
        }
        return lastIndexOf((vu4) obj);
    }

    public ListIterator<T> listIterator(int i) {
        yx6 yx6 = this.base;
        yx6.getClass();
        return new d03(yx6, i);
    }

    public p37 mergeRecords(p37 p37, p37 p372, p37 p373) {
        this.base.getClass();
        return null;
    }

    public void prependStateRecord(p37 p37) {
        this.base.prependStateRecord(p37);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof vu4)) {
            return false;
        }
        return remove((vu4) obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.base.removeAll(collection);
    }

    public T removeAt(int i) {
        return (vu4) this.base.remove(i);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.base.retainAll(collection);
    }

    public T set(int i, T t) {
        return (vu4) this.base.set(i, t);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public List<T> subList(int i, int i2) {
        return this.base.subList(i, i2);
    }

    public Object[] toArray() {
        return rc9.W0(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return rc9.X0(this, tArr);
    }

    public void add(int i, T t) {
        this.base.add(i, t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        return this.base.addAll(collection);
    }

    public ListIterator<T> listIterator() {
        return this.base.listIterator();
    }

    public boolean contains(T t) {
        return this.base.contains(t);
    }

    public int indexOf(T t) {
        return this.base.indexOf(t);
    }

    public int lastIndexOf(T t) {
        return this.base.lastIndexOf(t);
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public boolean remove(T t) {
        return this.base.remove((Object) t);
    }

    public NavBackStack(yx6 yx6) {
        this.base = yx6;
    }

    public NavBackStack() {
        this(new yx6());
    }
}

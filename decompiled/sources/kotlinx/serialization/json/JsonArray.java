package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010*\n\u0002\b\r\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001/B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\"\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010-\u001a\u00020\u000b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\r¨\u00060"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "contains", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Lkotlinx/serialization/json/JsonElement;", "indexOf", "(Lkotlinx/serialization/json/JsonElement;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "getSize", "size", "Companion", "ql3", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = sl3.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class JsonArray extends JsonElement implements List<JsonElement>, ar3 {
    public static final ql3 Companion = new Object();
    private final List<JsonElement> content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonArray(List<? extends JsonElement> list) {
        super((hl1) null);
        list.getClass();
        this.content = list;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return contains((JsonElement) obj);
    }

    public boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.content.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return sg3.e(this.content, obj);
    }

    public JsonElement get(int i) {
        return this.content.get(i);
    }

    public int getSize() {
        return this.content.size();
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return indexOf((JsonElement) obj);
    }

    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    public Iterator<JsonElement> iterator() {
        return this.content.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return lastIndexOf((JsonElement) obj);
    }

    public ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<JsonElement> subList(int i, int i2) {
        return this.content.subList(i, i2);
    }

    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return rc9.X0(this, tArr);
    }

    public String toString() {
        return dt0.E0(this.content, ",", "[", "]", (vr2) null, 56);
    }

    public ListIterator<JsonElement> listIterator(int i) {
        return this.content.listIterator(i);
    }

    public void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return rc9.W0(this);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(JsonElement jsonElement) {
        jsonElement.getClass();
        return this.content.contains(jsonElement);
    }

    public int indexOf(JsonElement jsonElement) {
        jsonElement.getClass();
        return this.content.indexOf(jsonElement);
    }

    public int lastIndexOf(JsonElement jsonElement) {
        jsonElement.getClass();
        return this.content.lastIndexOf(jsonElement);
    }
}

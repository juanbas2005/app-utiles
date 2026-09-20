package androidx.savedstate.serialization.serializers;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001d*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001e\u001fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0018\u001a\u00020\u0015\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate", "T", "", "", "", "keys", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lrl6;)V", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lzr3;", "typeSerial0", "Lvs7;", "write$Self$savedstate", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lhy0;Lll6;Lzr3;)V", "write$Self", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getValues", "Companion", "androidx/savedstate/serialization/serializers/b", "ez6", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class SparseArraySerializer$SparseArraySurrogate<T> {
    private static final ll6 $cachedDescriptor;
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new Object()), null};
    public static final ez6 Companion = new Object();
    private final List<Integer> keys;
    private final List<T> values;

    /* JADX WARNING: type inference failed for: r0v0, types: [ez6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [sr2, java.lang.Object] */
    static {
        ik5 ik5 = new ik5("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", (av2) null, 2);
        ik5.k("keys", false);
        ik5.k("values", false);
        $cachedDescriptor = ik5;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i, List list, List list2, rl6 rl6) {
        if (3 == (i & 3)) {
            this.keys = list;
            this.values = list2;
            return;
        }
        wn6.x(i, 3, $cachedDescriptor);
        throw null;
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(ue3.a, 0);
    }

    public static final /* synthetic */ void write$Self$savedstate(SparseArraySerializer$SparseArraySurrogate sparseArraySerializer$SparseArraySurrogate, hy0 hy0, ll6 ll6, zr3 zr3) {
        hy0.o(ll6, 0, (zr3) $childSerializers[0].getValue(), sparseArraySerializer$SparseArraySurrogate.keys);
        hy0.o(ll6, 1, new cs(zr3, 0), sparseArraySerializer$SparseArraySurrogate.values);
    }

    public final List<Integer> getKeys() {
        return this.keys;
    }

    public final List<T> getValues() {
        return this.values;
    }

    public SparseArraySerializer$SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
        list.getClass();
        list2.getClass();
        this.keys = list;
        this.values = list2;
    }
}

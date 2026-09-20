package io.github.jan.supabase.storage.vectors.data;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;", "", "", "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;", "vectors", "Lqw1;", "distanceMetric", "<init>", "(Ljava/util/List;Lqw1;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Lqw1;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;Lhy0;Lll6;)V", "write$Self", "Ljava/util/List;", "getVectors", "()Ljava/util/List;", "Lqw1;", "getDistanceMetric", "()Lqw1;", "Companion", "bv5", "cv5", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class QueryVectorsResponse {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final cv5 Companion = new Object();
    private final qw1 distanceMetric;
    private final List<VectorMatch> vectors;

    /* JADX WARNING: type inference failed for: r0v0, types: [cv5, java.lang.Object] */
    static {
        pp5 pp5 = new pp5(2);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{rg3.y(i44, pp5), rg3.y(i44, new pp5(3))};
    }

    public /* synthetic */ QueryVectorsResponse(int i, List list, qw1 qw1, rl6 rl6) {
        if (1 == (i & 1)) {
            this.vectors = list;
            if ((i & 2) == 0) {
                this.distanceMetric = null;
            } else {
                this.distanceMetric = qw1;
            }
        } else {
            wn6.x(i, 1, bv5.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(f38.a, 0);
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_$0() {
        qw1[] values = qw1.values();
        values.getClass();
        return new a62("io.github.jan.supabase.storage.vectors.DistanceMetric", (Enum[]) values);
    }

    public static final /* synthetic */ void write$Self$storage_kt(QueryVectorsResponse queryVectorsResponse, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.o(ll6, 0, (zr3) nz3Arr[0].getValue(), queryVectorsResponse.vectors);
        if (hy0.f(ll6) || queryVectorsResponse.distanceMetric != null) {
            hy0.A(ll6, 1, (zr3) nz3Arr[1].getValue(), queryVectorsResponse.distanceMetric);
        }
    }

    public final qw1 getDistanceMetric() {
        return this.distanceMetric;
    }

    public final List<VectorMatch> getVectors() {
        return this.vectors;
    }

    public QueryVectorsResponse(List<VectorMatch> list, qw1 qw1) {
        list.getClass();
        this.vectors = list;
        this.distanceMetric = qw1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryVectorsResponse(List list, qw1 qw1, int i, hl1 hl1) {
        this(list, (i & 2) != 0 ? null : qw1);
    }
}

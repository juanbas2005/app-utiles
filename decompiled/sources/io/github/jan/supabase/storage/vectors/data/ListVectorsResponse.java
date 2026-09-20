package io.github.jan.supabase.storage.vectors.data;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lio/github/jan/supabase/storage/vectors/data/ListVectorsResponse;", "", "", "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;", "vectors", "", "nextToken", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/data/ListVectorsResponse;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lio/github/jan/supabase/storage/vectors/data/ListVectorsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getVectors", "Ljava/lang/String;", "getNextToken", "Companion", "l84", "m84", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ListVectorsResponse {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new q83(17)), null};
    public static final m84 Companion = new Object();
    private final String nextToken;
    private final List<VectorMatch> vectors;

    public /* synthetic */ ListVectorsResponse(int i, List list, String str, rl6 rl6) {
        if (1 == (i & 1)) {
            this.vectors = list;
            if ((i & 2) == 0) {
                this.nextToken = null;
            } else {
                this.nextToken = str;
            }
        } else {
            wn6.x(i, 1, l84.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(f38.a, 0);
    }

    public static /* synthetic */ ListVectorsResponse copy$default(ListVectorsResponse listVectorsResponse, List<VectorMatch> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listVectorsResponse.vectors;
        }
        if ((i & 2) != 0) {
            str = listVectorsResponse.nextToken;
        }
        return listVectorsResponse.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$storage_kt(ListVectorsResponse listVectorsResponse, hy0 hy0, ll6 ll6) {
        hy0.o(ll6, 0, (zr3) $childSerializers[0].getValue(), listVectorsResponse.vectors);
        if (hy0.f(ll6) || listVectorsResponse.nextToken != null) {
            hy0.A(ll6, 1, t47.a, listVectorsResponse.nextToken);
        }
    }

    public final List<VectorMatch> component1() {
        return this.vectors;
    }

    public final String component2() {
        return this.nextToken;
    }

    public final ListVectorsResponse copy(List<VectorMatch> list, String str) {
        list.getClass();
        return new ListVectorsResponse(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListVectorsResponse)) {
            return false;
        }
        ListVectorsResponse listVectorsResponse = (ListVectorsResponse) obj;
        if (sg3.e(this.vectors, listVectorsResponse.vectors) && sg3.e(this.nextToken, listVectorsResponse.nextToken)) {
            return true;
        }
        return false;
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public final List<VectorMatch> getVectors() {
        return this.vectors;
    }

    public int hashCode() {
        int i;
        int hashCode = this.vectors.hashCode() * 31;
        String str = this.nextToken;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListVectorsResponse(vectors=");
        sb.append(this.vectors);
        sb.append(", nextToken=");
        return hl6.o(sb, this.nextToken, ')');
    }

    public ListVectorsResponse(List<VectorMatch> list, String str) {
        list.getClass();
        this.vectors = list;
        this.nextToken = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListVectorsResponse(List list, String str, int i, hl1 hl1) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

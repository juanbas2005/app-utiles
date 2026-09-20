package io.github.jan.supabase.storage.vectors.index;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u0012\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040(8FX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lio/github/jan/supabase/storage/vectors/index/ListIndexesResponse;", "", "Lkotlinx/serialization/json/JsonArray;", "indexesRaw", "", "nextToken", "<init>", "(Lkotlinx/serialization/json/JsonArray;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonArray;Ljava/lang/String;Lrl6;)V", "component1", "()Lkotlinx/serialization/json/JsonArray;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/index/ListIndexesResponse;Lhy0;Lll6;)V", "write$Self", "component2", "()Ljava/lang/String;", "copy", "(Lkotlinx/serialization/json/JsonArray;Ljava/lang/String;)Lio/github/jan/supabase/storage/vectors/index/ListIndexesResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonArray;", "getIndexesRaw$annotations", "()V", "Ljava/lang/String;", "getNextToken", "", "indexes$delegate", "Lnz3;", "getIndexes", "()Ljava/util/List;", "indexes", "Companion", "v74", "w74", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ListIndexesResponse {
    public static final w74 Companion = new Object();
    private final nz3 indexes$delegate;
    private final JsonArray indexesRaw;
    private final String nextToken;

    public ListIndexesResponse(int i, JsonArray jsonArray, String str, rl6 rl6) {
        if (1 == (i & 1)) {
            this.indexesRaw = jsonArray;
            if ((i & 2) == 0) {
                this.nextToken = null;
            } else {
                this.nextToken = str;
            }
            this.indexes$delegate = new z97(new u74(this, 0));
            return;
        }
        wn6.x(i, 1, v74.a.getDescriptor());
        throw null;
    }

    /* access modifiers changed from: private */
    public static final List _init_$lambda$0(ListIndexesResponse listIndexesResponse) {
        return o85.o(listIndexesResponse.indexesRaw);
    }

    private final JsonArray component1() {
        return this.indexesRaw;
    }

    public static /* synthetic */ ListIndexesResponse copy$default(ListIndexesResponse listIndexesResponse, JsonArray jsonArray, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonArray = listIndexesResponse.indexesRaw;
        }
        if ((i & 2) != 0) {
            str = listIndexesResponse.nextToken;
        }
        return listIndexesResponse.copy(jsonArray, str);
    }

    /* access modifiers changed from: private */
    public static final List indexes_delegate$lambda$0(ListIndexesResponse listIndexesResponse) {
        return o85.o(listIndexesResponse.indexesRaw);
    }

    public static final /* synthetic */ void write$Self$storage_kt(ListIndexesResponse listIndexesResponse, hy0 hy0, ll6 ll6) {
        hy0.o(ll6, 0, sl3.a, listIndexesResponse.indexesRaw);
        if (hy0.f(ll6) || listIndexesResponse.nextToken != null) {
            hy0.A(ll6, 1, t47.a, listIndexesResponse.nextToken);
        }
    }

    public final String component2() {
        return this.nextToken;
    }

    public final ListIndexesResponse copy(JsonArray jsonArray, String str) {
        jsonArray.getClass();
        return new ListIndexesResponse(jsonArray, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListIndexesResponse)) {
            return false;
        }
        ListIndexesResponse listIndexesResponse = (ListIndexesResponse) obj;
        if (sg3.e(this.indexesRaw, listIndexesResponse.indexesRaw) && sg3.e(this.nextToken, listIndexesResponse.nextToken)) {
            return true;
        }
        return false;
    }

    public final List<String> getIndexes() {
        return (List) this.indexes$delegate.getValue();
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int hashCode = this.indexesRaw.hashCode() * 31;
        String str = this.nextToken;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListIndexesResponse(indexesRaw=");
        sb.append(this.indexesRaw);
        sb.append(", nextToken=");
        return hl6.o(sb, this.nextToken, ')');
    }

    private static /* synthetic */ void getIndexesRaw$annotations() {
    }

    public ListIndexesResponse(JsonArray jsonArray, String str) {
        jsonArray.getClass();
        this.indexesRaw = jsonArray;
        this.nextToken = str;
        this.indexes$delegate = new z97(new u74(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListIndexesResponse(JsonArray jsonArray, String str, int i, hl1 hl1) {
        this(jsonArray, (i & 2) != 0 ? null : str);
    }
}

package io.github.jan.supabase.storage.vectors.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006BS\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lio/github/jan/supabase/storage/vectors/data/GetVectorOptions;", "", "", "vectorBucketName", "indexName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "", "keys", "", "returnData", "returnMetadata", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/data/GetVectorOptions;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getVectorBucketName", "()Ljava/lang/String;", "getIndexName", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getReturnData", "()Ljava/lang/Boolean;", "setReturnData", "(Ljava/lang/Boolean;)V", "getReturnMetadata", "setReturnMetadata", "Companion", "sv2", "tv2", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GetVectorOptions {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {null, null, rg3.y(i44.w, new nf1(17)), null, null};
    public static final tv2 Companion = new Object();
    private final String indexName;
    private final List<String> keys;
    private Boolean returnData;
    private Boolean returnMetadata;
    private final String vectorBucketName;

    public /* synthetic */ GetVectorOptions(int i, String str, String str2, List list, Boolean bool, Boolean bool2, rl6 rl6) {
        if (3 == (i & 3)) {
            this.vectorBucketName = str;
            this.indexName = str2;
            if ((i & 4) == 0) {
                this.keys = new ArrayList();
            } else {
                this.keys = list;
            }
            if ((i & 8) == 0) {
                this.returnData = null;
            } else {
                this.returnData = bool;
            }
            if ((i & 16) == 0) {
                this.returnMetadata = null;
            } else {
                this.returnMetadata = bool2;
            }
        } else {
            wn6.x(i, 3, sv2.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ void write$Self$storage_kt(GetVectorOptions getVectorOptions, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.x(ll6, 0, getVectorOptions.vectorBucketName);
        hy0.x(ll6, 1, getVectorOptions.indexName);
        if (hy0.f(ll6) || !sg3.e(getVectorOptions.keys, new ArrayList())) {
            hy0.o(ll6, 2, (zr3) nz3Arr[2].getValue(), getVectorOptions.keys);
        }
        if (hy0.f(ll6) || getVectorOptions.returnData != null) {
            hy0.A(ll6, 3, ja0.a, getVectorOptions.returnData);
        }
        if (hy0.f(ll6) || getVectorOptions.returnMetadata != null) {
            hy0.A(ll6, 4, ja0.a, getVectorOptions.returnMetadata);
        }
    }

    public final String getIndexName() {
        return this.indexName;
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public final Boolean getReturnData() {
        return this.returnData;
    }

    public final Boolean getReturnMetadata() {
        return this.returnMetadata;
    }

    public final String getVectorBucketName() {
        return this.vectorBucketName;
    }

    public final void setReturnData(Boolean bool) {
        this.returnData = bool;
    }

    public final void setReturnMetadata(Boolean bool) {
        this.returnMetadata = bool;
    }

    public GetVectorOptions(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.vectorBucketName = str;
        this.indexName = str2;
        this.keys = new ArrayList();
    }
}

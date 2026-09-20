package io.github.jan.supabase.storage.vectors.index;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;", "", "", "", "nonFilterableMetadataKeys", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;Lhy0;Lll6;)V", "write$Self", "Ljava/util/List;", "getNonFilterableMetadataKeys", "()Ljava/util/List;", "Companion", "kk4", "lk4", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class MetadataConfiguration {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new jk4(0))};
    public static final lk4 Companion = new Object();
    private final List<String> nonFilterableMetadataKeys;

    public /* synthetic */ MetadataConfiguration(int i, List list, rl6 rl6) {
        if ((i & 1) == 0) {
            this.nonFilterableMetadataKeys = null;
        } else {
            this.nonFilterableMetadataKeys = list;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ void write$Self$storage_kt(MetadataConfiguration metadataConfiguration, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        if (hy0.f(ll6) || metadataConfiguration.nonFilterableMetadataKeys != null) {
            hy0.A(ll6, 0, (zr3) nz3Arr[0].getValue(), metadataConfiguration.nonFilterableMetadataKeys);
        }
    }

    public final List<String> getNonFilterableMetadataKeys() {
        return this.nonFilterableMetadataKeys;
    }

    public MetadataConfiguration() {
        this((List) null, 1, (hl1) null);
    }

    public MetadataConfiguration(List<String> list) {
        this.nonFilterableMetadataKeys = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetadataConfiguration(List list, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : list);
    }
}

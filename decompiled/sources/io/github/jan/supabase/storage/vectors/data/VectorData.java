package io.github.jan.supabase.storage.vectors.data;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/storage/vectors/data/VectorData;", "", "", "float32", "<init>", "([F)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(I[FLrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/data/VectorData;Lhy0;Lll6;)V", "write$Self", "[F", "getFloat32", "()[F", "Companion", "n28", "o28", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class VectorData {
    public static final o28 Companion = new Object();
    private final float[] float32;

    public /* synthetic */ VectorData(int i, float[] fArr, rl6 rl6) {
        if (1 == (i & 1)) {
            this.float32 = fArr;
        } else {
            wn6.x(i, 1, n28.a.getDescriptor());
            throw null;
        }
    }

    public final float[] getFloat32() {
        return this.float32;
    }

    public VectorData(float[] fArr) {
        fArr.getClass();
        this.float32 = fArr;
    }
}

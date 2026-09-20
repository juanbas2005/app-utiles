package io.github.jan.supabase.storage.vectors.index;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 A2\u00020\u0001:\u0002BCBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*JZ\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010&J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u0012\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lio/github/jan/supabase/storage/vectors/index/VectorIndex;", "", "", "indexName", "vectorBucketName", "Lp28;", "dataType", "", "dimension", "Lqw1;", "distanceMetric", "Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;", "metadataConfiguration", "Lqd3;", "creationTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lp28;ILqw1;Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;Lqd3;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp28;ILqw1;Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;Lqd3;Lrl6;)V", "component7", "()Lqd3;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/vectors/index/VectorIndex;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lp28;", "component4", "()I", "component5", "()Lqw1;", "component6", "()Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lp28;ILqw1;Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;Lqd3;)Lio/github/jan/supabase/storage/vectors/index/VectorIndex;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIndexName", "getVectorBucketName", "Lp28;", "getDataType", "I", "getDimension", "Lqw1;", "getDistanceMetric", "Lio/github/jan/supabase/storage/vectors/index/MetadataConfiguration;", "getMetadataConfiguration", "Lqd3;", "getCreationTime$annotations", "()V", "Companion", "c38", "d38", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class VectorIndex {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final d38 Companion = new Object();
    private final qd3 creationTime;
    private final p28 dataType;
    private final int dimension;
    private final qw1 distanceMetric;
    private final String indexName;
    private final MetadataConfiguration metadataConfiguration;
    private final String vectorBucketName;

    /* JADX WARNING: type inference failed for: r0v0, types: [d38, java.lang.Object] */
    static {
        wi7 wi7 = new wi7(21);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, rg3.y(i44, wi7), null, rg3.y(i44, new wi7(22)), null, null};
    }

    public /* synthetic */ VectorIndex(int i, String str, String str2, p28 p28, int i2, qw1 qw1, MetadataConfiguration metadataConfiguration2, qd3 qd3, rl6 rl6) {
        if (31 == (i & 31)) {
            this.indexName = str;
            this.vectorBucketName = str2;
            this.dataType = p28;
            this.dimension = i2;
            this.distanceMetric = qw1;
            if ((i & 32) == 0) {
                this.metadataConfiguration = null;
            } else {
                this.metadataConfiguration = metadataConfiguration2;
            }
            if ((i & 64) == 0) {
                this.creationTime = null;
            } else {
                this.creationTime = qd3;
            }
        } else {
            wn6.x(i, 31, c38.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        p28[] values = p28.values();
        values.getClass();
        return new a62("io.github.jan.supabase.storage.vectors.index.VectorDataType", (Enum[]) values);
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_$0() {
        qw1[] values = qw1.values();
        values.getClass();
        return new a62("io.github.jan.supabase.storage.vectors.DistanceMetric", (Enum[]) values);
    }

    private final qd3 component7() {
        return this.creationTime;
    }

    public static /* synthetic */ VectorIndex copy$default(VectorIndex vectorIndex, String str, String str2, p28 p28, int i, qw1 qw1, MetadataConfiguration metadataConfiguration2, qd3 qd3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vectorIndex.indexName;
        }
        if ((i2 & 2) != 0) {
            str2 = vectorIndex.vectorBucketName;
        }
        if ((i2 & 4) != 0) {
            p28 = vectorIndex.dataType;
        }
        if ((i2 & 8) != 0) {
            i = vectorIndex.dimension;
        }
        if ((i2 & 16) != 0) {
            qw1 = vectorIndex.distanceMetric;
        }
        if ((i2 & 32) != 0) {
            metadataConfiguration2 = vectorIndex.metadataConfiguration;
        }
        if ((i2 & 64) != 0) {
            qd3 = vectorIndex.creationTime;
        }
        MetadataConfiguration metadataConfiguration3 = metadataConfiguration2;
        qd3 qd32 = qd3;
        int i3 = i;
        qw1 qw12 = qw1;
        return vectorIndex.copy(str, str2, p28, i3, qw12, metadataConfiguration3, qd32);
    }

    public static final /* synthetic */ void write$Self$storage_kt(VectorIndex vectorIndex, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.x(ll6, 0, vectorIndex.indexName);
        hy0.x(ll6, 1, vectorIndex.vectorBucketName);
        hy0.o(ll6, 2, (zr3) nz3Arr[2].getValue(), vectorIndex.dataType);
        hy0.w(3, vectorIndex.dimension, ll6);
        hy0.o(ll6, 4, (zr3) nz3Arr[4].getValue(), vectorIndex.distanceMetric);
        if (hy0.f(ll6) || vectorIndex.metadataConfiguration != null) {
            hy0.A(ll6, 5, kk4.a, vectorIndex.metadataConfiguration);
        }
        if (hy0.f(ll6) || vectorIndex.creationTime != null) {
            hy0.A(ll6, 6, xs7.a, vectorIndex.creationTime);
        }
    }

    public final String component1() {
        return this.indexName;
    }

    public final String component2() {
        return this.vectorBucketName;
    }

    public final p28 component3() {
        return this.dataType;
    }

    public final int component4() {
        return this.dimension;
    }

    public final qw1 component5() {
        return this.distanceMetric;
    }

    public final MetadataConfiguration component6() {
        return this.metadataConfiguration;
    }

    public final VectorIndex copy(String str, String str2, p28 p28, int i, qw1 qw1, MetadataConfiguration metadataConfiguration2, qd3 qd3) {
        str.getClass();
        str2.getClass();
        p28.getClass();
        qw1.getClass();
        return new VectorIndex(str, str2, p28, i, qw1, metadataConfiguration2, qd3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorIndex)) {
            return false;
        }
        VectorIndex vectorIndex = (VectorIndex) obj;
        if (sg3.e(this.indexName, vectorIndex.indexName) && sg3.e(this.vectorBucketName, vectorIndex.vectorBucketName) && this.dataType == vectorIndex.dataType && this.dimension == vectorIndex.dimension && this.distanceMetric == vectorIndex.distanceMetric && sg3.e(this.metadataConfiguration, vectorIndex.metadataConfiguration) && sg3.e(this.creationTime, vectorIndex.creationTime)) {
            return true;
        }
        return false;
    }

    public final p28 getDataType() {
        return this.dataType;
    }

    public final int getDimension() {
        return this.dimension;
    }

    public final qw1 getDistanceMetric() {
        return this.distanceMetric;
    }

    public final String getIndexName() {
        return this.indexName;
    }

    public final MetadataConfiguration getMetadataConfiguration() {
        return this.metadataConfiguration;
    }

    public final String getVectorBucketName() {
        return this.vectorBucketName;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.distanceMetric.hashCode() + f21.e(this.dimension, (this.dataType.hashCode() + hl6.h(this.indexName.hashCode() * 31, 31, this.vectorBucketName)) * 31, 31)) * 31;
        MetadataConfiguration metadataConfiguration2 = this.metadataConfiguration;
        int i2 = 0;
        if (metadataConfiguration2 == null) {
            i = 0;
        } else {
            i = metadataConfiguration2.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        qd3 qd3 = this.creationTime;
        if (qd3 != null) {
            i2 = qd3.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "VectorIndex(indexName=" + this.indexName + ", vectorBucketName=" + this.vectorBucketName + ", dataType=" + this.dataType + ", dimension=" + this.dimension + ", distanceMetric=" + this.distanceMetric + ", metadataConfiguration=" + this.metadataConfiguration + ", creationTime=" + this.creationTime + ')';
    }

    @Serializable(with = xs7.class)
    private static /* synthetic */ void getCreationTime$annotations() {
    }

    public VectorIndex(String str, String str2, p28 p28, int i, qw1 qw1, MetadataConfiguration metadataConfiguration2, qd3 qd3) {
        str.getClass();
        str2.getClass();
        p28.getClass();
        qw1.getClass();
        this.indexName = str;
        this.vectorBucketName = str2;
        this.dataType = p28;
        this.dimension = i;
        this.distanceMetric = qw1;
        this.metadataConfiguration = metadataConfiguration2;
        this.creationTime = qd3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorIndex(String str, String str2, p28 p28, int i, qw1 qw1, MetadataConfiguration metadataConfiguration2, qd3 qd3, int i2, hl1 hl1) {
        this(str, str2, p28, i, qw1, (i2 & 32) != 0 ? null : metadataConfiguration2, (i2 & 64) != 0 ? null : qd3);
    }
}

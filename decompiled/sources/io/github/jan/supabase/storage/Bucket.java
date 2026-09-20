package io.github.jan.supabase.storage;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u0000 O2\u00020\u0001:\u0002PQBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012By\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010 R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010G\u0012\u0004\bI\u0010;\u001a\u0004\bH\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010J\u0012\u0004\bL\u0010;\u001a\u0004\bK\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010&¨\u0006R"}, d2 = {"Lio/github/jan/supabase/storage/Bucket;", "", "Lqd3;", "createdAt", "", "id", "name", "owner", "updatedAt", "", "public", "", "allowedMimeTypes", "", "fileSizeLimit", "Lrc0;", "type", "<init>", "(Lqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/util/List;Ljava/lang/Long;Lrc0;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/util/List;Ljava/lang/Long;Lrc0;Lrl6;)V", "component1", "()Lqd3;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/Long;", "component9", "()Lrc0;", "copy", "(Lqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/util/List;Ljava/lang/Long;Lrc0;)Lio/github/jan/supabase/storage/Bucket;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/Bucket;Lhy0;Lll6;)V", "write$Self", "Lqd3;", "getCreatedAt", "getCreatedAt$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "getName", "getName$annotations", "getOwner", "getOwner$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Z", "getPublic", "Ljava/util/List;", "getAllowedMimeTypes", "getAllowedMimeTypes$annotations", "Ljava/lang/Long;", "getFileSizeLimit", "getFileSizeLimit$annotations", "Lrc0;", "getType", "Companion", "nc0", "oc0", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Bucket {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final oc0 Companion = new Object();
    private final List<String> allowedMimeTypes;
    private final qd3 createdAt;
    private final Long fileSizeLimit;
    private final String id;
    private final String name;
    private final String owner;

    /* renamed from: public  reason: not valid java name */
    private final boolean f0public;
    private final rc0 type;
    private final qd3 updatedAt;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, oc0] */
    static {
        o oVar = new o(16);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, null, null, null, null, rg3.y(i44, oVar), null, rg3.y(i44, new o(17))};
    }

    public /* synthetic */ Bucket(int i, qd3 qd3, String str, String str2, String str3, qd3 qd32, boolean z, List list, Long l, rc0 rc0, rl6 rl6) {
        if (63 == (i & 63)) {
            this.createdAt = qd3;
            this.id = str;
            this.name = str2;
            this.owner = str3;
            this.updatedAt = qd32;
            this.f0public = z;
            if ((i & 64) == 0) {
                this.allowedMimeTypes = null;
            } else {
                this.allowedMimeTypes = list;
            }
            if ((i & 128) == 0) {
                this.fileSizeLimit = null;
            } else {
                this.fileSizeLimit = l;
            }
            if ((i & 256) == 0) {
                this.type = null;
            } else {
                this.type = rc0;
            }
        } else {
            wn6.x(i, 63, nc0.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(t47.a, 0);
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_$0() {
        rc0[] values = rc0.values();
        values.getClass();
        return new a62("io.github.jan.supabase.storage.BucketType", (Enum[]) values);
    }

    public static /* synthetic */ Bucket copy$default(Bucket bucket, qd3 qd3, String str, String str2, String str3, qd3 qd32, boolean z, List<String> list, Long l, rc0 rc0, int i, Object obj) {
        if ((i & 1) != 0) {
            qd3 = bucket.createdAt;
        }
        if ((i & 2) != 0) {
            str = bucket.id;
        }
        if ((i & 4) != 0) {
            str2 = bucket.name;
        }
        if ((i & 8) != 0) {
            str3 = bucket.owner;
        }
        if ((i & 16) != 0) {
            qd32 = bucket.updatedAt;
        }
        if ((i & 32) != 0) {
            z = bucket.f0public;
        }
        if ((i & 64) != 0) {
            list = bucket.allowedMimeTypes;
        }
        if ((i & 128) != 0) {
            l = bucket.fileSizeLimit;
        }
        if ((i & 256) != 0) {
            rc0 = bucket.type;
        }
        Long l2 = l;
        rc0 rc02 = rc0;
        boolean z2 = z;
        List<String> list2 = list;
        String str4 = str3;
        qd3 qd33 = qd32;
        return bucket.copy(qd3, str, str2, str4, qd33, z2, list2, l2, rc02);
    }

    public static final /* synthetic */ void write$Self$storage_kt(Bucket bucket, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        wd3 wd3 = wd3.a;
        hy0.o(ll6, 0, wd3, bucket.createdAt);
        hy0.x(ll6, 1, bucket.id);
        hy0.x(ll6, 2, bucket.name);
        hy0.x(ll6, 3, bucket.owner);
        hy0.o(ll6, 4, wd3, bucket.updatedAt);
        hy0.n(ll6, 5, bucket.f0public);
        if (hy0.f(ll6) || bucket.allowedMimeTypes != null) {
            hy0.A(ll6, 6, (zr3) nz3Arr[6].getValue(), bucket.allowedMimeTypes);
        }
        if (hy0.f(ll6) || bucket.fileSizeLimit != null) {
            hy0.A(ll6, 7, tc4.a, bucket.fileSizeLimit);
        }
        if (hy0.f(ll6) || bucket.type != null) {
            hy0.A(ll6, 8, (zr3) nz3Arr[8].getValue(), bucket.type);
        }
    }

    public final qd3 component1() {
        return this.createdAt;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.owner;
    }

    public final qd3 component5() {
        return this.updatedAt;
    }

    public final boolean component6() {
        return this.f0public;
    }

    public final List<String> component7() {
        return this.allowedMimeTypes;
    }

    public final Long component8() {
        return this.fileSizeLimit;
    }

    public final rc0 component9() {
        return this.type;
    }

    public final Bucket copy(qd3 qd3, String str, String str2, String str3, qd3 qd32, boolean z, List<String> list, Long l, rc0 rc0) {
        qd3.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd32.getClass();
        return new Bucket(qd3, str, str2, str3, qd32, z, list, l, rc0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) obj;
        if (sg3.e(this.createdAt, bucket.createdAt) && sg3.e(this.id, bucket.id) && sg3.e(this.name, bucket.name) && sg3.e(this.owner, bucket.owner) && sg3.e(this.updatedAt, bucket.updatedAt) && this.f0public == bucket.f0public && sg3.e(this.allowedMimeTypes, bucket.allowedMimeTypes) && sg3.e(this.fileSizeLimit, bucket.fileSizeLimit) && this.type == bucket.type) {
            return true;
        }
        return false;
    }

    public final List<String> getAllowedMimeTypes() {
        return this.allowedMimeTypes;
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final Long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final boolean getPublic() {
        return this.f0public;
    }

    public final rc0 getType() {
        return this.type;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = hl6.i((this.updatedAt.hashCode() + hl6.h(hl6.h(hl6.h(this.createdAt.hashCode() * 31, 31, this.id), 31, this.name), 31, this.owner)) * 31, 31, this.f0public);
        List<String> list = this.allowedMimeTypes;
        int i4 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i5 = (i3 + i) * 31;
        Long l = this.fileSizeLimit;
        if (l == null) {
            i2 = 0;
        } else {
            i2 = l.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        rc0 rc0 = this.type;
        if (rc0 != null) {
            i4 = rc0.hashCode();
        }
        return i6 + i4;
    }

    public String toString() {
        return "Bucket(createdAt=" + this.createdAt + ", id=" + this.id + ", name=" + this.name + ", owner=" + this.owner + ", updatedAt=" + this.updatedAt + ", public=" + this.f0public + ", allowedMimeTypes=" + this.allowedMimeTypes + ", fileSizeLimit=" + this.fileSizeLimit + ", type=" + this.type + ')';
    }

    public static /* synthetic */ void getAllowedMimeTypes$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getFileSizeLimit$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOwner$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public Bucket(qd3 qd3, String str, String str2, String str3, qd3 qd32, boolean z, List<String> list, Long l, rc0 rc0) {
        qd3.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd32.getClass();
        this.createdAt = qd3;
        this.id = str;
        this.name = str2;
        this.owner = str3;
        this.updatedAt = qd32;
        this.f0public = z;
        this.allowedMimeTypes = list;
        this.fileSizeLimit = l;
        this.type = rc0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bucket(qd3 qd3, String str, String str2, String str3, qd3 qd32, boolean z, List list, Long l, rc0 rc0, int i, hl1 hl1) {
        this(qd3, str, str2, str3, qd32, z, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : rc0);
    }
}

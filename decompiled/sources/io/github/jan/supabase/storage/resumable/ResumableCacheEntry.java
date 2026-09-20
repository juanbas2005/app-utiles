package io.github.jan.supabase.storage.resumable;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u0000 52\u00020\u0001:\u000267B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001c¨\u00068"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "", "", "url", "path", "bucketId", "Lqd3;", "expiresAt", "", "upsert", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lqd3;", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;ZLjava/lang/String;)Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getPath", "getBucketId", "Lqd3;", "getExpiresAt", "Z", "getUpsert", "getContentType", "Companion", "t66", "u66", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ResumableCacheEntry {
    public static final u66 Companion = new Object();
    private final String bucketId;
    private final String contentType;
    private final qd3 expiresAt;
    private final String path;
    private final boolean upsert;
    private final String url;

    public /* synthetic */ ResumableCacheEntry(int i, String str, String str2, String str3, qd3 qd3, boolean z, String str4, rl6 rl6) {
        if (15 == (i & 15)) {
            this.url = str;
            this.path = str2;
            this.bucketId = str3;
            this.expiresAt = qd3;
            if ((i & 16) == 0) {
                this.upsert = false;
            } else {
                this.upsert = z;
            }
            if ((i & 32) == 0) {
                this.contentType = "application/octet-stream";
            } else {
                this.contentType = str4;
            }
        } else {
            wn6.x(i, 15, t66.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ResumableCacheEntry copy$default(ResumableCacheEntry resumableCacheEntry, String str, String str2, String str3, qd3 qd3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resumableCacheEntry.url;
        }
        if ((i & 2) != 0) {
            str2 = resumableCacheEntry.path;
        }
        if ((i & 4) != 0) {
            str3 = resumableCacheEntry.bucketId;
        }
        if ((i & 8) != 0) {
            qd3 = resumableCacheEntry.expiresAt;
        }
        if ((i & 16) != 0) {
            z = resumableCacheEntry.upsert;
        }
        if ((i & 32) != 0) {
            str4 = resumableCacheEntry.contentType;
        }
        boolean z2 = z;
        String str5 = str4;
        qd3 qd32 = qd3;
        String str6 = str2;
        return resumableCacheEntry.copy(str, str6, str3, qd32, z2, str5);
    }

    public static final /* synthetic */ void write$Self$storage_kt(ResumableCacheEntry resumableCacheEntry, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, resumableCacheEntry.url);
        hy0.x(ll6, 1, resumableCacheEntry.path);
        hy0.x(ll6, 2, resumableCacheEntry.bucketId);
        hy0.o(ll6, 3, wd3.a, resumableCacheEntry.expiresAt);
        if (hy0.f(ll6) || resumableCacheEntry.upsert) {
            hy0.n(ll6, 4, resumableCacheEntry.upsert);
        }
        if (hy0.f(ll6) || !sg3.e(resumableCacheEntry.contentType, "application/octet-stream")) {
            hy0.x(ll6, 5, resumableCacheEntry.contentType);
        }
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.bucketId;
    }

    public final qd3 component4() {
        return this.expiresAt;
    }

    public final boolean component5() {
        return this.upsert;
    }

    public final String component6() {
        return this.contentType;
    }

    public final ResumableCacheEntry copy(String str, String str2, String str3, qd3 qd3, boolean z, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd3.getClass();
        str4.getClass();
        return new ResumableCacheEntry(str, str2, str3, qd3, z, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResumableCacheEntry)) {
            return false;
        }
        ResumableCacheEntry resumableCacheEntry = (ResumableCacheEntry) obj;
        if (sg3.e(this.url, resumableCacheEntry.url) && sg3.e(this.path, resumableCacheEntry.path) && sg3.e(this.bucketId, resumableCacheEntry.bucketId) && sg3.e(this.expiresAt, resumableCacheEntry.expiresAt) && this.upsert == resumableCacheEntry.upsert && sg3.e(this.contentType, resumableCacheEntry.contentType)) {
            return true;
        }
        return false;
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final qd3 getExpiresAt() {
        return this.expiresAt;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.contentType.hashCode() + hl6.i((this.expiresAt.hashCode() + hl6.h(hl6.h(this.url.hashCode() * 31, 31, this.path), 31, this.bucketId)) * 31, 31, this.upsert);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResumableCacheEntry(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", bucketId=");
        sb.append(this.bucketId);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", upsert=");
        sb.append(this.upsert);
        sb.append(", contentType=");
        return hl6.o(sb, this.contentType, ')');
    }

    public ResumableCacheEntry(String str, String str2, String str3, qd3 qd3, boolean z, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd3.getClass();
        str4.getClass();
        this.url = str;
        this.path = str2;
        this.bucketId = str3;
        this.expiresAt = qd3;
        this.upsert = z;
        this.contentType = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResumableCacheEntry(String str, String str2, String str3, qd3 qd3, boolean z, String str4, int i, hl1 hl1) {
        this(str, str2, str3, qd3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "application/octet-stream" : str4);
    }
}

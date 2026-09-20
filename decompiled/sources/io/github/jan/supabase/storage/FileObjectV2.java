package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 g2\u00020\u0001:\u0002hiB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u0001H\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0010\u00102\u001a\u00020\u0013HÀ\u0003¢\u0006\u0004\b0\u00101J¬\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bH\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010E\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010L\u0012\u0004\bN\u0010K\u001a\u0004\bM\u0010%R \u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010L\u0012\u0004\bP\u0010K\u001a\u0004\bO\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010L\u0012\u0004\bR\u0010K\u001a\u0004\bQ\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\bV\u0010+R \u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bX\u0010K\u001a\u0004\bW\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bY\u0010 R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\b[\u0010K\u001a\u0004\bZ\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\b]\u0010K\u001a\u0004\b\\\u0010 R \u0010\u0014\u001a\u00020\u00138\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010^\u0012\u0004\b`\u0010K\u001a\u0004\b_\u00101R\u001b\u0010f\u001a\u00020a8FX\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006j"}, d2 = {"Lio/github/jan/supabase/storage/FileObjectV2;", "", "", "name", "id", "version", "bucketId", "Lqd3;", "updatedAt", "createdAt", "lastAccessedAt", "Lkotlinx/serialization/json/JsonObject;", "metadata", "", "size", "rawContentType", "etag", "lastModified", "cacheControl", "Lt77;", "serializer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lqd3;Ljava/lang/String;Lt77;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lqd3;Ljava/lang/String;Lrl6;)V", "T", "decodeMetadata", "()Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lqd3;", "component6", "component7", "component8", "()Lkotlinx/serialization/json/JsonObject;", "component9", "()J", "component10", "component11", "component12", "component13", "component14$storage_kt", "()Lt77;", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lqd3;Ljava/lang/String;Lt77;)Lio/github/jan/supabase/storage/FileObjectV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/FileObjectV2;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getName", "getId", "getVersion", "getBucketId", "getBucketId$annotations", "()V", "Lqd3;", "getUpdatedAt", "getUpdatedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getLastAccessedAt", "getLastAccessedAt$annotations", "Lkotlinx/serialization/json/JsonObject;", "getMetadata", "J", "getSize", "getRawContentType", "getRawContentType$annotations", "getEtag", "getLastModified", "getLastModified$annotations", "getCacheControl", "getCacheControl$annotations", "Lt77;", "getSerializer", "getSerializer$annotations", "Lq51;", "contentType$delegate", "Lnz3;", "getContentType", "()Lq51;", "contentType", "Companion", "dd2", "ed2", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FileObjectV2 {
    public static final ed2 Companion = new Object();
    private final String bucketId;
    private final String cacheControl;
    private final nz3 contentType$delegate;
    private final qd3 createdAt;
    private final String etag;
    private final String id;
    private final qd3 lastAccessedAt;
    private final qd3 lastModified;
    private final JsonObject metadata;
    private final String name;
    private final String rawContentType;
    private final t77 serializer;
    private final long size;
    private final qd3 updatedAt;
    private final String version;

    public FileObjectV2(int i, String str, String str2, String str3, String str4, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, long j, String str5, String str6, qd3 qd34, String str7, rl6 rl6) {
        if (807 == (i & 807)) {
            this.name = str;
            this.id = str2;
            this.version = str3;
            if ((i & 8) == 0) {
                this.bucketId = null;
            } else {
                this.bucketId = str4;
            }
            if ((i & 16) == 0) {
                this.updatedAt = null;
            } else {
                this.updatedAt = qd3;
            }
            this.createdAt = qd32;
            if ((i & 64) == 0) {
                this.lastAccessedAt = null;
            } else {
                this.lastAccessedAt = qd33;
            }
            if ((i & 128) == 0) {
                this.metadata = null;
            } else {
                this.metadata = jsonObject;
            }
            this.size = j;
            this.rawContentType = str5;
            if ((i & 1024) == 0) {
                this.etag = null;
            } else {
                this.etag = str6;
            }
            if ((i & 2048) == 0) {
                this.lastModified = null;
            } else {
                this.lastModified = qd34;
            }
            if ((i & 4096) == 0) {
                this.cacheControl = null;
            } else {
                this.cacheControl = str7;
            }
            this.serializer = new f96(26);
            this.contentType$delegate = new z97(new cd2(this, 0));
            return;
        }
        wn6.x(i, 807, dd2.a.getDescriptor());
        throw null;
    }

    /* access modifiers changed from: private */
    public static final q51 _init_$lambda$0(FileObjectV2 fileObjectV2) {
        q51 q51 = q51.e;
        return kw5.m(fileObjectV2.rawContentType);
    }

    /* access modifiers changed from: private */
    public static final q51 contentType_delegate$lambda$0(FileObjectV2 fileObjectV2) {
        q51 q51 = q51.e;
        return kw5.m(fileObjectV2.rawContentType);
    }

    public static /* synthetic */ FileObjectV2 copy$default(FileObjectV2 fileObjectV2, String str, String str2, String str3, String str4, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, long j, String str5, String str6, qd3 qd34, String str7, t77 t77, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        qd3 qd35;
        qd3 qd36;
        qd3 qd37;
        JsonObject jsonObject2;
        long j2;
        String str12;
        String str13;
        qd3 qd38;
        String str14;
        t77 t772;
        FileObjectV2 fileObjectV22 = fileObjectV2;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str8 = fileObjectV22.name;
        } else {
            str8 = str;
        }
        if ((i2 & 2) != 0) {
            str9 = fileObjectV22.id;
        } else {
            str9 = str2;
        }
        if ((i2 & 4) != 0) {
            str10 = fileObjectV22.version;
        } else {
            str10 = str3;
        }
        if ((i2 & 8) != 0) {
            str11 = fileObjectV22.bucketId;
        } else {
            str11 = str4;
        }
        if ((i2 & 16) != 0) {
            qd35 = fileObjectV22.updatedAt;
        } else {
            qd35 = qd3;
        }
        if ((i2 & 32) != 0) {
            qd36 = fileObjectV22.createdAt;
        } else {
            qd36 = qd32;
        }
        if ((i2 & 64) != 0) {
            qd37 = fileObjectV22.lastAccessedAt;
        } else {
            qd37 = qd33;
        }
        if ((i2 & 128) != 0) {
            jsonObject2 = fileObjectV22.metadata;
        } else {
            jsonObject2 = jsonObject;
        }
        if ((i2 & 256) != 0) {
            j2 = fileObjectV22.size;
        } else {
            j2 = j;
        }
        if ((i2 & 512) != 0) {
            str12 = fileObjectV22.rawContentType;
        } else {
            str12 = str5;
        }
        if ((i2 & 1024) != 0) {
            str13 = fileObjectV22.etag;
        } else {
            str13 = str6;
        }
        if ((i2 & 2048) != 0) {
            qd38 = fileObjectV22.lastModified;
        } else {
            qd38 = qd34;
        }
        if ((i2 & 4096) != 0) {
            str14 = fileObjectV22.cacheControl;
        } else {
            str14 = str7;
        }
        if ((i2 & 8192) != 0) {
            t772 = fileObjectV22.serializer;
        } else {
            t772 = t77;
        }
        return fileObjectV22.copy(str8, str9, str10, str11, qd35, qd36, qd37, jsonObject2, j2, str12, str13, qd38, str14, t772);
    }

    public static final /* synthetic */ void write$Self$storage_kt(FileObjectV2 fileObjectV2, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, fileObjectV2.name);
        t47 t47 = t47.a;
        hy0.A(ll6, 1, t47, fileObjectV2.id);
        hy0.x(ll6, 2, fileObjectV2.version);
        if (hy0.f(ll6) || fileObjectV2.bucketId != null) {
            hy0.A(ll6, 3, t47, fileObjectV2.bucketId);
        }
        if (hy0.f(ll6) || fileObjectV2.updatedAt != null) {
            hy0.A(ll6, 4, wd3.a, fileObjectV2.updatedAt);
        }
        wd3 wd3 = wd3.a;
        hy0.o(ll6, 5, wd3, fileObjectV2.createdAt);
        if (hy0.f(ll6) || fileObjectV2.lastAccessedAt != null) {
            hy0.A(ll6, 6, wd3, fileObjectV2.lastAccessedAt);
        }
        if (hy0.f(ll6) || fileObjectV2.metadata != null) {
            hy0.A(ll6, 7, xm3.a, fileObjectV2.metadata);
        }
        hy0.j(ll6, 8, fileObjectV2.size);
        hy0.x(ll6, 9, fileObjectV2.rawContentType);
        if (hy0.f(ll6) || fileObjectV2.etag != null) {
            hy0.A(ll6, 10, t47, fileObjectV2.etag);
        }
        if (hy0.f(ll6) || fileObjectV2.lastModified != null) {
            hy0.A(ll6, 11, wd3, fileObjectV2.lastModified);
        }
        if (hy0.f(ll6) || fileObjectV2.cacheControl != null) {
            hy0.A(ll6, 12, t47, fileObjectV2.cacheControl);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.rawContentType;
    }

    public final String component11() {
        return this.etag;
    }

    public final qd3 component12() {
        return this.lastModified;
    }

    public final String component13() {
        return this.cacheControl;
    }

    public final t77 component14$storage_kt() {
        return this.serializer;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.bucketId;
    }

    public final qd3 component5() {
        return this.updatedAt;
    }

    public final qd3 component6() {
        return this.createdAt;
    }

    public final qd3 component7() {
        return this.lastAccessedAt;
    }

    public final JsonObject component8() {
        return this.metadata;
    }

    public final long component9() {
        return this.size;
    }

    public final FileObjectV2 copy(String str, String str2, String str3, String str4, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, long j, String str5, String str6, qd3 qd34, String str7, t77 t77) {
        str.getClass();
        str3.getClass();
        qd32.getClass();
        str5.getClass();
        t77.getClass();
        return new FileObjectV2(str, str2, str3, str4, qd3, qd32, qd33, jsonObject, j, str5, str6, qd34, str7, t77);
    }

    public final <T> T decodeMetadata() {
        JsonObject metadata2 = getMetadata();
        if (metadata2 == null) {
            return null;
        }
        getSerializer();
        metadata2.toString();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileObjectV2)) {
            return false;
        }
        FileObjectV2 fileObjectV2 = (FileObjectV2) obj;
        if (sg3.e(this.name, fileObjectV2.name) && sg3.e(this.id, fileObjectV2.id) && sg3.e(this.version, fileObjectV2.version) && sg3.e(this.bucketId, fileObjectV2.bucketId) && sg3.e(this.updatedAt, fileObjectV2.updatedAt) && sg3.e(this.createdAt, fileObjectV2.createdAt) && sg3.e(this.lastAccessedAt, fileObjectV2.lastAccessedAt) && sg3.e(this.metadata, fileObjectV2.metadata) && this.size == fileObjectV2.size && sg3.e(this.rawContentType, fileObjectV2.rawContentType) && sg3.e(this.etag, fileObjectV2.etag) && sg3.e(this.lastModified, fileObjectV2.lastModified) && sg3.e(this.cacheControl, fileObjectV2.cacheControl) && sg3.e(this.serializer, fileObjectV2.serializer)) {
            return true;
        }
        return false;
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getCacheControl() {
        return this.cacheControl;
    }

    public final q51 getContentType() {
        return (q51) this.contentType$delegate.getValue();
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final String getEtag() {
        return this.etag;
    }

    public final String getId() {
        return this.id;
    }

    public final qd3 getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    public final qd3 getLastModified() {
        return this.lastModified;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRawContentType() {
        return this.rawContentType;
    }

    public final t77 getSerializer() {
        return this.serializer;
    }

    public final long getSize() {
        return this.size;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = this.name.hashCode() * 31;
        String str = this.id;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int h = hl6.h((hashCode + i) * 31, 31, this.version);
        String str2 = this.bucketId;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i9 = (h + i2) * 31;
        qd3 qd3 = this.updatedAt;
        if (qd3 == null) {
            i3 = 0;
        } else {
            i3 = qd3.hashCode();
        }
        int hashCode2 = (this.createdAt.hashCode() + ((i9 + i3) * 31)) * 31;
        qd3 qd32 = this.lastAccessedAt;
        if (qd32 == null) {
            i4 = 0;
        } else {
            i4 = qd32.hashCode();
        }
        int i10 = (hashCode2 + i4) * 31;
        JsonObject jsonObject = this.metadata;
        if (jsonObject == null) {
            i5 = 0;
        } else {
            i5 = jsonObject.hashCode();
        }
        int h2 = hl6.h(pb4.b((i10 + i5) * 31, 31, this.size), 31, this.rawContentType);
        String str3 = this.etag;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        int i11 = (h2 + i6) * 31;
        qd3 qd33 = this.lastModified;
        if (qd33 == null) {
            i7 = 0;
        } else {
            i7 = qd33.hashCode();
        }
        int i12 = (i11 + i7) * 31;
        String str4 = this.cacheControl;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return this.serializer.hashCode() + ((i12 + i8) * 31);
    }

    public String toString() {
        return "FileObjectV2(name=" + this.name + ", id=" + this.id + ", version=" + this.version + ", bucketId=" + this.bucketId + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", lastAccessedAt=" + this.lastAccessedAt + ", metadata=" + this.metadata + ", size=" + this.size + ", rawContentType=" + this.rawContentType + ", etag=" + this.etag + ", lastModified=" + this.lastModified + ", cacheControl=" + this.cacheControl + ", serializer=" + this.serializer + ')';
    }

    public static /* synthetic */ void getBucketId$annotations() {
    }

    public static /* synthetic */ void getCacheControl$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getLastAccessedAt$annotations() {
    }

    public static /* synthetic */ void getLastModified$annotations() {
    }

    public static /* synthetic */ void getRawContentType$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public FileObjectV2(String str, String str2, String str3, String str4, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, long j, String str5, String str6, qd3 qd34, String str7, t77 t77) {
        str.getClass();
        str3.getClass();
        qd32.getClass();
        str5.getClass();
        t77.getClass();
        this.name = str;
        this.id = str2;
        this.version = str3;
        this.bucketId = str4;
        this.updatedAt = qd3;
        this.createdAt = qd32;
        this.lastAccessedAt = qd33;
        this.metadata = jsonObject;
        this.size = j;
        this.rawContentType = str5;
        this.etag = str6;
        this.lastModified = qd34;
        this.cacheControl = str7;
        this.serializer = t77;
        this.contentType$delegate = new z97(new cd2(this, 1));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ FileObjectV2(String str, String str2, String str3, String str4, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, long j, String str5, String str6, qd3 qd34, String str7, t77 t77, int i, hl1 hl1) {
        this(str, str2, str3, (r0 & 8) != 0 ? null : str4, (r0 & 16) != 0 ? null : qd3, qd32, (r0 & 64) != 0 ? null : qd33, (r0 & 128) != 0 ? null : jsonObject, j, str5, (r0 & 1024) != 0 ? null : str6, (r0 & 2048) != 0 ? null : qd34, (r0 & 4096) != 0 ? null : str7, (r0 & 8192) != 0 ? new f96(26) : t77);
        int i2 = i;
    }
}

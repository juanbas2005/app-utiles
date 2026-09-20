package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 :2\u00020\u0001:\u0002;<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010#¨\u0006="}, d2 = {"Lio/github/jan/supabase/storage/FileObject;", "", "", "name", "id", "Lqd3;", "updatedAt", "createdAt", "lastAccessedAt", "Lkotlinx/serialization/json/JsonObject;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/FileObject;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lqd3;", "component4", "component5", "component6", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;)Lio/github/jan/supabase/storage/FileObject;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getId", "Lqd3;", "getUpdatedAt", "getUpdatedAt$annotations", "()V", "getCreatedAt", "getCreatedAt$annotations", "getLastAccessedAt", "getLastAccessedAt$annotations", "Lkotlinx/serialization/json/JsonObject;", "getMetadata", "Companion", "ad2", "bd2", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FileObject {
    public static final bd2 Companion = new Object();
    private final qd3 createdAt;
    private final String id;
    private final qd3 lastAccessedAt;
    private final JsonObject metadata;
    private final String name;
    private final qd3 updatedAt;

    public /* synthetic */ FileObject(int i, String str, String str2, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, rl6 rl6) {
        if (63 == (i & 63)) {
            this.name = str;
            this.id = str2;
            this.updatedAt = qd3;
            this.createdAt = qd32;
            this.lastAccessedAt = qd33;
            this.metadata = jsonObject;
            return;
        }
        wn6.x(i, 63, ad2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ FileObject copy$default(FileObject fileObject, String str, String str2, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileObject.name;
        }
        if ((i & 2) != 0) {
            str2 = fileObject.id;
        }
        if ((i & 4) != 0) {
            qd3 = fileObject.updatedAt;
        }
        if ((i & 8) != 0) {
            qd32 = fileObject.createdAt;
        }
        if ((i & 16) != 0) {
            qd33 = fileObject.lastAccessedAt;
        }
        if ((i & 32) != 0) {
            jsonObject = fileObject.metadata;
        }
        qd3 qd34 = qd33;
        JsonObject jsonObject2 = jsonObject;
        qd3 qd35 = qd32;
        String str3 = str2;
        return fileObject.copy(str, str3, qd3, qd35, qd34, jsonObject2);
    }

    public static final /* synthetic */ void write$Self$storage_kt(FileObject fileObject, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, fileObject.name);
        hy0.A(ll6, 1, t47.a, fileObject.id);
        wd3 wd3 = wd3.a;
        hy0.A(ll6, 2, wd3, fileObject.updatedAt);
        hy0.A(ll6, 3, wd3, fileObject.createdAt);
        hy0.A(ll6, 4, wd3, fileObject.lastAccessedAt);
        hy0.A(ll6, 5, xm3.a, fileObject.metadata);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final qd3 component3() {
        return this.updatedAt;
    }

    public final qd3 component4() {
        return this.createdAt;
    }

    public final qd3 component5() {
        return this.lastAccessedAt;
    }

    public final JsonObject component6() {
        return this.metadata;
    }

    public final FileObject copy(String str, String str2, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject) {
        str.getClass();
        return new FileObject(str, str2, qd3, qd32, qd33, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileObject)) {
            return false;
        }
        FileObject fileObject = (FileObject) obj;
        if (sg3.e(this.name, fileObject.name) && sg3.e(this.id, fileObject.id) && sg3.e(this.updatedAt, fileObject.updatedAt) && sg3.e(this.createdAt, fileObject.createdAt) && sg3.e(this.lastAccessedAt, fileObject.lastAccessedAt) && sg3.e(this.metadata, fileObject.metadata)) {
            return true;
        }
        return false;
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final qd3 getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = this.name.hashCode() * 31;
        String str = this.id;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode + i) * 31;
        qd3 qd3 = this.updatedAt;
        if (qd3 == null) {
            i2 = 0;
        } else {
            i2 = qd3.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        qd3 qd32 = this.createdAt;
        if (qd32 == null) {
            i3 = 0;
        } else {
            i3 = qd32.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        qd3 qd33 = this.lastAccessedAt;
        if (qd33 == null) {
            i4 = 0;
        } else {
            i4 = qd33.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        JsonObject jsonObject = this.metadata;
        if (jsonObject != null) {
            i5 = jsonObject.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "FileObject(name=" + this.name + ", id=" + this.id + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", lastAccessedAt=" + this.lastAccessedAt + ", metadata=" + this.metadata + ')';
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getLastAccessedAt$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public FileObject(String str, String str2, qd3 qd3, qd3 qd32, qd3 qd33, JsonObject jsonObject) {
        str.getClass();
        this.name = str;
        this.id = str2;
        this.updatedAt = qd3;
        this.createdAt = qd32;
        this.lastAccessedAt = qd33;
        this.metadata = jsonObject;
    }
}

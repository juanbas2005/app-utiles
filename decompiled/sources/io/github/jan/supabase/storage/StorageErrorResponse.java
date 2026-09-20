package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lio/github/jan/supabase/storage/StorageErrorResponse;", "", "", "statusCode", "", "error", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/StorageErrorResponse;Lhy0;Lll6;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/storage/StorageErrorResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusCode", "Ljava/lang/String;", "getError", "getMessage", "Companion", "e47", "f47", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class StorageErrorResponse {
    public static final f47 Companion = new Object();
    private final String error;
    private final String message;
    private final int statusCode;

    public /* synthetic */ StorageErrorResponse(int i, int i2, String str, String str2, rl6 rl6) {
        if (7 == (i & 7)) {
            this.statusCode = i2;
            this.error = str;
            this.message = str2;
            return;
        }
        wn6.x(i, 7, e47.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ StorageErrorResponse copy$default(StorageErrorResponse storageErrorResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storageErrorResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = storageErrorResponse.error;
        }
        if ((i2 & 4) != 0) {
            str2 = storageErrorResponse.message;
        }
        return storageErrorResponse.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$storage_kt(StorageErrorResponse storageErrorResponse, hy0 hy0, ll6 ll6) {
        hy0.w(0, storageErrorResponse.statusCode, ll6);
        hy0.x(ll6, 1, storageErrorResponse.error);
        hy0.x(ll6, 2, storageErrorResponse.message);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.error;
    }

    public final String component3() {
        return this.message;
    }

    public final StorageErrorResponse copy(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new StorageErrorResponse(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageErrorResponse)) {
            return false;
        }
        StorageErrorResponse storageErrorResponse = (StorageErrorResponse) obj;
        if (this.statusCode == storageErrorResponse.statusCode && sg3.e(this.error, storageErrorResponse.error) && sg3.e(this.message, storageErrorResponse.message)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.message.hashCode() + hl6.h(Integer.hashCode(this.statusCode) * 31, 31, this.error);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StorageErrorResponse(statusCode=");
        sb.append(this.statusCode);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", message=");
        return hl6.o(sb, this.message, ')');
    }

    public StorageErrorResponse(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.statusCode = i;
        this.error = str;
        this.message = str2;
    }
}

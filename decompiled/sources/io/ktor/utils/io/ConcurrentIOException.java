package io.ktor.utils.io;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/ConcurrentIOException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-io"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ConcurrentIOException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConcurrentIOException(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        str.getClass();
    }
}

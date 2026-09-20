package io.ktor.http;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/BadContentTypeFormatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-http"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class BadContentTypeFormatException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadContentTypeFormatException(String str) {
        super("Bad Content-Type format: ".concat(str));
        str.getClass();
    }
}

package io.ktor.client.call;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "ktor-client-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class NoTransformationFoundException extends UnsupportedOperationException {
    public final String w;

    public NoTransformationFoundException(yl1 yl1, gq3 gq3, gq3 gq32) {
        gq3.getClass();
        gq32.getClass();
        this.w = e57.f0("\n        Expected response body of the type '" + gq32 + "' but was '" + gq3 + "'\n        In response from `" + yl1.V().c().D() + "`\n        Response status `" + yl1.e() + "`\n        Response header `ContentType: " + yl1.a().x("Content-Type") + "` \n        Request header `Accept: " + yl1.V().c().a().x("Accept") + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    public final String getMessage() {
        return this.w;
    }
}

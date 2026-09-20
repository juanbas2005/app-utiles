package io.ktor.client.plugins;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/ServerResponseException;", "Lio/ktor/client/plugins/ResponseException;", "ktor-client-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ServerResponseException extends ResponseException {
    public final String w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerResponseException(yl1 yl1, String str) {
        super(yl1, str);
        yl1.getClass();
        str.getClass();
        this.w = "Server error(" + yl1.V().c().getMethod().a + ' ' + yl1.V().c().D() + ": " + yl1.e() + ". Text: \"" + str + '\"';
    }

    public final String getMessage() {
        return this.w;
    }
}

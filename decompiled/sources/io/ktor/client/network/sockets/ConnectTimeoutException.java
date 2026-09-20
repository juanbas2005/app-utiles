package io.ktor.client.network.sockets;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/ConnectException;", "ktor-client-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ConnectTimeoutException extends ConnectException {
    public final IOException w;

    public ConnectTimeoutException(String str, IOException iOException) {
        super(str);
        this.w = iOException;
    }

    public final Throwable getCause() {
        return this.w;
    }
}

package io.ktor.client.plugins;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Le71;", "ktor-client-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class HttpRequestTimeoutException extends IOException implements e71 {
    public final String w;
    public final Long x;

    /* JADX WARNING: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(String str, Long l, Throwable th) {
        super(r0.toString(), th);
        Object obj;
        str.getClass();
        StringBuilder sb = new StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        if (l == null) {
            obj = "unknown";
        } else {
            obj = l;
        }
        sb.append(obj);
        sb.append(" ms]");
        this.w = str;
        this.x = l;
    }

    public final Throwable a() {
        return new HttpRequestTimeoutException(this.w, this.x, getCause());
    }
}

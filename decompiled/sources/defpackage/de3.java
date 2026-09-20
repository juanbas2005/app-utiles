package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* renamed from: de3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class de3 implements ResponseHandler {
    public final ResponseHandler a;
    public final ui7 b;
    public final sy4 c;

    public de3(ResponseHandler responseHandler, ui7 ui7, sy4 sy4) {
        this.a = responseHandler;
        this.b = ui7;
        this.c = sy4;
    }

    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.i(this.b.b());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long a2 = ty4.a(httpResponse);
        if (a2 != null) {
            this.c.h(a2.longValue());
        }
        String b2 = ty4.b(httpResponse);
        if (b2 != null) {
            this.c.g(b2);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}

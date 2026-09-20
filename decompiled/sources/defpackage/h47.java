package defpackage;

import io.github.jan.supabase.exceptions.RestException;
import io.github.jan.supabase.exceptions.UnknownRestException;
import io.github.jan.supabase.storage.StorageErrorResponse;
import java.io.Serializable;
import kotlinx.serialization.SerializationException;

/* renamed from: h47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h47 implements qe4 {
    public final j77 b;
    public final c47 c;
    public final t77 d;
    public final aw e;

    public h47(j77 j77, c47 c47) {
        j77.getClass();
        c47.getClass();
        this.b = j77;
        this.c = c47;
        this.d = ((m77) j77).b;
        t75.j(j77, "Supabase-Storage", (ub4) null, (vr2) null);
        aw g = sg3.g(j77, this, new ay5(17, (Object) this), (Integer) null, 12);
        this.e = g;
        g.d("iceberg");
        g.d("vector");
    }

    public final Object d() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Serializable e(yl1 yl1, f61 f61) {
        g47 g47;
        int i;
        w63 w63;
        j77 j77;
        Object obj;
        String str;
        StorageErrorResponse storageErrorResponse;
        w63 w632;
        if (f61 instanceof g47) {
            g47 = (g47) f61;
            int i2 = g47.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g47.E = i2 - Integer.MIN_VALUE;
                Object obj2 = g47.C;
                i = g47.E;
                Object obj3 = null;
                if (i != 0) {
                    o85.q(obj2);
                    w63 = yl1.e();
                    g47.z = yl1;
                    g47.A = w63;
                    j77 = this.b;
                    g47.B = j77;
                    g47.E = 1;
                    obj = h49.q(yl1, mo0.a, g47);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    j77 = g47.B;
                    w63 w633 = g47.A;
                    yl1 yl12 = g47.z;
                    o85.q(obj2);
                    Object obj4 = obj2;
                    w63 = w633;
                    yl1 = yl12;
                    obj = obj4;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) obj;
                km3 km3 = l18.a;
                km3.getClass();
                obj3 = km3.b(StorageErrorResponse.Companion.serializer(), str);
                storageErrorResponse = (StorageErrorResponse) obj3;
                if (storageErrorResponse == null) {
                    storageErrorResponse = new StorageErrorResponse(yl1.e().w, "Unknown error", "");
                }
                w632 = w63.D;
                if (sg3.e(w63, w632)) {
                    return new UnknownRestException(yl1, "Unknown error response " + storageErrorResponse);
                }
                int statusCode = storageErrorResponse.getStatusCode();
                if (statusCode == w63.E.w) {
                    String error = storageErrorResponse.getError();
                    String message = storageErrorResponse.getMessage();
                    error.getClass();
                    yl1.getClass();
                    throw new RestException(error, message, yl1);
                } else if (statusCode == w632.w) {
                    String error2 = storageErrorResponse.getError();
                    String message2 = storageErrorResponse.getMessage();
                    error2.getClass();
                    yl1.getClass();
                    throw new RestException(error2, message2, yl1);
                } else if (statusCode == w63.F.w) {
                    String error3 = storageErrorResponse.getError();
                    String message3 = storageErrorResponse.getMessage();
                    error3.getClass();
                    yl1.getClass();
                    throw new RestException(error3, message3, yl1);
                } else {
                    throw new UnknownRestException(yl1, storageErrorResponse.getMessage());
                }
            }
        }
        g47 = new g47(this, f61);
        Object obj22 = g47.C;
        i = g47.E;
        Object obj32 = null;
        if (i != 0) {
        }
        str = (String) obj;
        try {
            km3 km32 = l18.a;
            km32.getClass();
            obj32 = km32.b(StorageErrorResponse.Companion.serializer(), str);
        } catch (SerializationException e2) {
            cf4 cf4 = ((m77) j77).f;
            ms3 ms3 = (ms3) cf4.z;
            String str2 = (String) cf4.y;
            ub4 ub4 = ub4.x;
            if (ms3.a(ub4)) {
                ms3.b(ub4, str2, e2, "Could not decode " + d57.i1(200, str) + " as " + b26.a.b(StorageErrorResponse.class).A() + '.');
            }
        }
        storageErrorResponse = (StorageErrorResponse) obj32;
        if (storageErrorResponse == null) {
        }
        w632 = w63.D;
        if (sg3.e(w63, w632)) {
        }
    }

    public final String f() {
        return "storage";
    }

    public final j77 h() {
        return this.b;
    }

    public am6 l(String str) {
        aw d2 = this.e.d("object");
        b47 b47 = this.c.v;
        int i = gk5.a;
        ay4 d3 = gw8.d();
        n63 n63 = new n63(9);
        hj8.G(d3);
        return new am6(str, this, d2, n63);
    }
}

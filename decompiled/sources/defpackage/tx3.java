package defpackage;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: tx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tx3 extends n77 {
    public final cf4 a;
    public final String b = "sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9";
    public final m25 c;
    public final long d;
    public final List e;
    public final j43 f;

    /* JADX WARNING: type inference failed for: r2v0, types: [e45, java.lang.Object] */
    public tx3(m77 m77) {
        j43 j43;
        cf4 b2 = m77.f.b(" [Network]");
        this.a = b2;
        l77 l77 = m77.a;
        this.c = l77.g;
        p77 p77 = l77.c;
        long j = p77.d;
        this.d = j;
        q43 q43 = p77.b;
        this.e = p77.c;
        ms3 ms3 = (ms3) b2.z;
        String str = (String) b2.y;
        ub4 ub4 = ub4.w;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str, (Throwable) null, "Creating KtorSupabaseHttpClient with request timeout " + u02.k(j) + ", HttpClientEngine: " + q43);
        }
        if (q43 != null) {
            n43 n43 = new n43();
            b(n43, this.e);
            j43 = new j43(q43, n43, false);
        } else {
            x43.a.getClass();
            n43 n432 = new n43();
            b(n432, this.e);
            vd2 vd2 = (vd2) n432.f;
            vd2.getClass();
            ? obj = new Object();
            obj.a = new ot4(18);
            obj.b = 10;
            vd2.y(obj);
            j43 = new j43(new h45(obj), n432, true);
        }
        this.f = j43;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public final Object a(String str, vr2 vr2, h61 h61) {
        sx3 sx3;
        int i;
        ub4 ub4;
        HttpRequestTimeoutException e2;
        y53 y53;
        String str2;
        ms3 ms3;
        ms3 ms32;
        String message;
        ms3 ms33;
        if (h61 instanceof sx3) {
            sx3 = (sx3) h61;
            int i2 = sx3.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sx3.D = i2 - Integer.MIN_VALUE;
                Object obj = sx3.B;
                i = sx3.D;
                ub4 = ub4.w;
                cf4 cf4 = this.a;
                if (i != 0) {
                    o85.q(obj);
                    y53 y532 = new y53();
                    au auVar = a63.a;
                    str.getClass();
                    yr7 yr7 = y532.a;
                    zr7.b(yr7, str);
                    vr2.y(y532);
                    String t = t35.t(yr7);
                    ms3 ms34 = (ms3) cf4.z;
                    String str3 = (String) cf4.y;
                    if (ms34.a(ub4)) {
                        ms34.b(ub4, str3, (Throwable) null, f21.m(new StringBuilder("Starting "), y532.b.a, " request to endpoint ", t));
                    }
                    try {
                        j43 j43 = this.f;
                        y53 y533 = new y53();
                        zr7.b(y533.a, str);
                        vr2.y(y533);
                        hv2 hv2 = new hv2(y533, j43);
                        sx3.z = y532;
                        sx3.A = t;
                        sx3.D = 1;
                        Object H0 = hv2.H0(sx3);
                        p81 p81 = p81.w;
                        if (H0 == p81) {
                            return p81;
                        }
                        y53 = y532;
                        obj = H0;
                        str2 = t;
                    } catch (HttpRequestTimeoutException e3) {
                        y53 = y532;
                        e2 = e3;
                        str2 = t;
                        ms3 ms35 = (ms3) cf4.z;
                        String str4 = (String) cf4.y;
                        if (ms35.a(ub4)) {
                            StringBuilder sb = new StringBuilder();
                            f21.v(sb, y53.b.a, " request to endpoint ", str2, " timed out after ");
                            sb.append(u02.k(this.d));
                            ms35.b(ub4, str4, e2, sb.toString());
                        }
                        throw e2;
                    } catch (CancellationException e4) {
                        e = e4;
                        y53 = y532;
                        str2 = t;
                        ms3 = (ms3) cf4.z;
                        String str5 = (String) cf4.y;
                        if (ms3.a(ub4)) {
                        }
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        y53 = y532;
                        str2 = t;
                        ms32 = (ms3) cf4.z;
                        String str6 = (String) cf4.y;
                        if (ms32.a(ub4)) {
                        }
                        message = e.getMessage();
                        if (message == null) {
                        }
                        y53.getClass();
                        StringBuilder sb2 = new StringBuilder("HTTP request to ");
                        sb2.append(y53.a.c());
                        sb2.append(" (");
                        throw new IOException(f21.m(sb2, y53.b.a, ") failed with message: ", message));
                    }
                } else if (i == 1) {
                    str2 = sx3.A;
                    y53 = sx3.z;
                    try {
                        o85.q(obj);
                    } catch (HttpRequestTimeoutException e6) {
                        e2 = e6;
                    } catch (CancellationException e7) {
                        e = e7;
                        ms3 = (ms3) cf4.z;
                        String str52 = (String) cf4.y;
                        if (ms3.a(ub4)) {
                            ms3.b(ub4, str52, e, pb4.n(new StringBuilder(), y53.b.a, " request to endpoint ", str2, " was cancelled"));
                        }
                        throw e;
                    } catch (Exception e8) {
                        e = e8;
                        ms32 = (ms3) cf4.z;
                        String str62 = (String) cf4.y;
                        if (ms32.a(ub4)) {
                            StringBuilder sb3 = new StringBuilder();
                            f21.v(sb3, y53.b.a, " request to endpoint ", str2, " failed with exception ");
                            sb3.append(e.getMessage());
                            ms32.b(ub4, str62, e, sb3.toString());
                        }
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        y53.getClass();
                        StringBuilder sb22 = new StringBuilder("HTTP request to ");
                        sb22.append(y53.a.c());
                        sb22.append(" (");
                        throw new IOException(f21.m(sb22, y53.b.a, ") failed with message: ", message));
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yl1 yl1 = (yl1) obj;
                xb4 xb4 = u02.x;
                long f0 = gl0.f0(yl1.d().getTimestamp() - yl1.c().getTimestamp(), y02.MILLISECONDS);
                ms33 = (ms3) cf4.z;
                String str7 = (String) cf4.y;
                if (ms33.a(ub4)) {
                    StringBuilder sb4 = new StringBuilder();
                    f21.v(sb4, y53.b.a, " request to endpoint ", str2, " successfully finished in ");
                    sb4.append(u02.k(f0));
                    ms33.b(ub4, str7, (Throwable) null, sb4.toString());
                }
                return yl1;
            }
        }
        sx3 = new sx3(this, h61);
        Object obj2 = sx3.B;
        i = sx3.D;
        ub4 = ub4.w;
        cf4 cf42 = this.a;
        if (i != 0) {
        }
        yl1 yl12 = (yl1) obj2;
        xb4 xb42 = u02.x;
        long f02 = gl0.f0(yl12.d().getTimestamp() - yl12.c().getTimestamp(), y02.MILLISECONDS);
        ms33 = (ms3) cf42.z;
        String str72 = (String) cf42.y;
        if (ms33.a(ub4)) {
        }
        return yl12;
    }

    public final void b(n43 n43, List list) {
        n43.b(zm1.b, new rx3(this, 0));
        n43.b(f51.d, new tm3(2));
        n43.b(a73.b, new rx3(this, 1));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((vr2) it.next()).y(n43);
        }
    }
}

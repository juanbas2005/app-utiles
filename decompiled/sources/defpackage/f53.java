package defpackage;

import java.nio.charset.Charset;

/* renamed from: f53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f53 implements if3 {
    public volatile e53 a;

    /* JADX WARNING: type inference failed for: r0v21, types: [sc0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v17, types: [ed0, dd0, sc0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v20, types: [sc0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe A[LOOP:0: B:42:0x00fc->B:43:0x00fe, LOOP_END] */
    public final a66 a(lx5 lx5) {
        boolean z;
        ex5 ex5;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        sc0 sc0;
        Throwable th;
        int size;
        int i;
        sc0 sc02;
        Long l2;
        Throwable th2;
        lx5 lx52 = lx5;
        e53 e53 = this.a;
        kd6 kd6 = lx52.e;
        if (e53 == e53.w) {
            return lx52.b(kd6);
        }
        boolean z4 = true;
        if (e53 == e53.y) {
            z = true;
        } else {
            z = false;
        }
        if (!z && e53 != e53.x) {
            z4 = false;
        }
        f56 f56 = (f56) kd6.A;
        u72 u72 = lx52.d;
        if (u72 != null) {
            ex5 = u72.e();
        } else {
            ex5 = null;
        }
        StringBuilder sb = new StringBuilder("--> ");
        sb.append((String) kd6.y);
        sb.append(' ');
        g73 g73 = (g73) kd6.x;
        g73.getClass();
        sb.append(g73.h);
        if (ex5 != null) {
            str = " " + ex5.g;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z4 && f56 != null) {
            sb2 = sb2 + " (" + f56.a() + "-byte body)";
        }
        rf2.b(sb2);
        if (z4) {
            bz2 bz2 = (bz2) kd6.z;
            if (f56 != null) {
                yh4 b = f56.b();
                z3 = z;
                if (b == null || bz2.f("Content-Type") != null) {
                    z2 = z4;
                } else {
                    z2 = z4;
                    rf2.b("Content-Type: " + b);
                }
                if (f56.a() != -1 && bz2.f("Content-Length") == null) {
                    StringBuilder sb3 = new StringBuilder("Content-Length: ");
                    str3 = "";
                    str2 = " ";
                    sb3.append(f56.a());
                    rf2.b(sb3.toString());
                    size = bz2.size();
                    for (i = 0; i < size; i++) {
                        b(bz2, i);
                    }
                    if (z3 || f56 == null) {
                        rf2.b("--> END " + ((String) kd6.y));
                    } else {
                        String f = ((bz2) kd6.z).f("Content-Encoding");
                        if (f != null && !f.equalsIgnoreCase("identity") && !f.equalsIgnoreCase("gzip")) {
                            rf2.b("--> END " + ((String) kd6.y) + " (encoded body omitted)");
                        } else if (f56.c()) {
                            rf2.b("--> END " + ((String) kd6.y) + " (duplex request body omitted)");
                        } else if (f56 instanceof k47) {
                            rf2.b("--> END " + ((String) kd6.y) + " (one-shot body omitted)");
                        } else {
                            ? obj = new Object();
                            f56.d(obj);
                            String str6 = str3;
                            if ("gzip".equalsIgnoreCase(bz2.f("Content-Encoding"))) {
                                l2 = Long.valueOf(obj.x);
                                by2 by2 = new by2(obj);
                                try {
                                    ? obj2 = new Object();
                                    obj2.t(by2);
                                    by2.close();
                                    sc02 = obj2;
                                } catch (Throwable th3) {
                                    ed1.i(by2, th2);
                                    throw th3;
                                }
                            } else {
                                l2 = null;
                                sc02 = obj;
                            }
                            Charset k = gw8.k(f56.b());
                            rf2.b(str6);
                            if (!we.C(sc02)) {
                                rf2.b("--> END " + ((String) kd6.y) + " (binary " + f56.a() + "-byte body omitted)");
                            } else if (l2 != null) {
                                rf2.b("--> END " + ((String) kd6.y) + " (" + sc02.x + "-byte, " + l2.longValue() + "-gzipped-byte body)");
                            } else {
                                rf2.b(sc02.Q(k));
                                StringBuilder sb4 = new StringBuilder("--> END ");
                                sb4.append((String) kd6.y);
                                sb4.append(" (");
                                str3 = str6;
                                sb4.append(f56.a());
                                sb4.append("-byte body)");
                                rf2.b(sb4.toString());
                            }
                            str3 = str6;
                        }
                    }
                }
            } else {
                z3 = z;
                z2 = z4;
            }
            str3 = "";
            str2 = " ";
            size = bz2.size();
            while (i < size) {
            }
            if (z3) {
            }
            rf2.b("--> END " + ((String) kd6.y));
        } else {
            z3 = z;
            z2 = z4;
            str3 = "";
            str2 = " ";
        }
        long nanoTime = System.nanoTime();
        try {
            a66 b2 = lx52.b(kd6);
            long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            d66 d66 = b2.C;
            d66.getClass();
            long a2 = d66.a();
            long j = nanoTime;
            if (a2 != -1) {
                str4 = a2 + "-byte";
            } else {
                str4 = "unknown-length";
            }
            String str7 = str3;
            StringBuilder sb5 = new StringBuilder();
            String str8 = str2;
            long j2 = a2;
            sb5.append("<-- " + b2.z);
            if (b2.y.length() > 0) {
                str5 = str8;
                sb5.append(str5 + b2.y);
            } else {
                str5 = str8;
            }
            StringBuilder sb6 = new StringBuilder(str5);
            g73 g732 = (g73) b2.w.x;
            g732.getClass();
            sb6.append(g732.h);
            sb6.append(" (");
            sb6.append(nanoTime2);
            sb6.append("ms");
            sb5.append(sb6.toString());
            if (!z2) {
                sb5.append(", " + str4 + " body");
            }
            sb5.append(")");
            rf2.b(sb5.toString());
            if (z2) {
                bz2 bz22 = b2.B;
                int size2 = bz22.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(bz22, i2);
                }
                if (!z3 || !a53.a(b2)) {
                    rf2.b("<-- END HTTP");
                } else {
                    String f2 = b2.B.f("Content-Encoding");
                    if (f2 != null && !f2.equalsIgnoreCase("identity") && !f2.equalsIgnoreCase("gzip")) {
                        rf2.b("<-- END HTTP (encoded body omitted)");
                        return b2;
                    }
                    yh4 k2 = b2.C.k();
                    if (k2 != null && k2.b.equals("text") && k2.c.equals("event-stream")) {
                        rf2.b("<-- END HTTP (streaming)");
                        return b2;
                    } else if (d66 instanceof it7) {
                        rf2.b("<-- END HTTP (unreadable body)");
                        return b2;
                    } else {
                        ed0 l3 = d66.l();
                        l3.j(Long.MAX_VALUE);
                        long nanoTime3 = (System.nanoTime() - j) / 1000000;
                        sc0 c = l3.c();
                        if ("gzip".equalsIgnoreCase(bz22.f("Content-Encoding"))) {
                            l = Long.valueOf(c.x);
                            by2 by22 = new by2(c.clone());
                            try {
                                ? obj3 = new Object();
                                obj3.t(by22);
                                by22.close();
                                sc0 = obj3;
                            } catch (Throwable th4) {
                                ed1.i(by22, th);
                                throw th4;
                            }
                        } else {
                            l = null;
                            sc0 = c;
                        }
                        Charset k3 = gw8.k(d66.k());
                        if (!we.C(sc0)) {
                            rf2.b(str7);
                            rf2.b("<-- END HTTP (" + nanoTime3 + "ms, binary " + sc0.x + "-byte body omitted)");
                            return b2;
                        }
                        if (j2 != 0) {
                            rf2.b(str7);
                            rf2.b(sc0.clone().Q(k3));
                        }
                        StringBuilder sb7 = new StringBuilder();
                        StringBuilder q = hl6.q(nanoTime3, "<-- END HTTP (", "ms, ");
                        q.append(sc0.x);
                        q.append("-byte");
                        sb7.append(q.toString());
                        if (l != null) {
                            sb7.append(", " + l.longValue() + "-gzipped-byte");
                        }
                        sb7.append(" body)");
                        rf2.b(sb7.toString());
                        return b2;
                    }
                }
            }
            return b2;
        } catch (Exception e) {
            long nanoTime4 = System.nanoTime();
            StringBuilder sb8 = new StringBuilder(str2);
            g73 g733 = (g73) kd6.x;
            g733.getClass();
            sb8.append(g733.h);
            sb8.append(" (");
            sb8.append((nanoTime4 - nanoTime) / 1000000);
            sb8.append("ms)");
            rf2.b(("<-- HTTP FAILED: " + e + '.').concat(sb8.toString()));
            throw e;
        }
    }

    public final void b(bz2 bz2, int i) {
        bz2.g(i);
        String l = bz2.l(i);
        rf2.b(bz2.g(i) + ": " + l);
    }
}

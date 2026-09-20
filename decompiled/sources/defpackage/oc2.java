package defpackage;

import com.google.protobuf.a;
import com.google.protobuf.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: oc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oc2 {
    public static final /* synthetic */ int c = 0;
    public final lv6 a = new lv6(16);
    public boolean b;

    static {
        new oc2(0);
    }

    public oc2(int i) {
        a();
        a();
    }

    public static void b(vs0 vs0, qc8 qc8, int i, Object obj) {
        if (qc8 == qc8.GROUP) {
            vs0.o(i, 3);
            ((a) obj).i(vs0);
            vs0.o(i, 4);
            return;
        }
        vs0.o(i, qc8.x);
        switch (qc8.ordinal()) {
            case b85.b:
                vs0.l(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                vs0.j(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                vs0.r(((Long) obj).longValue());
                return;
            case 3:
                vs0.r(((Long) obj).longValue());
                return;
            case 4:
                vs0.m(((Integer) obj).intValue());
                return;
            case 5:
                vs0.l(((Long) obj).longValue());
                return;
            case 6:
                vs0.j(((Integer) obj).intValue());
                return;
            case 7:
                vs0.f(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof yf0) {
                    vs0.h((yf0) obj);
                    return;
                } else {
                    vs0.n((String) obj);
                    return;
                }
            case 9:
                ((a) obj).i(vs0);
                return;
            case 10:
                a aVar = (a) obj;
                vs0.p(((b) aVar).h((og6) null));
                aVar.i(vs0);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (obj instanceof yf0) {
                    vs0.h((yf0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                vs0.p(length);
                vs0.g(bArr, 0, length);
                return;
            case 12:
                vs0.p(((Integer) obj).intValue());
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (obj instanceof jr) {
                    vs0.m(((jr) obj).w);
                    return;
                } else {
                    vs0.m(((Integer) obj).intValue());
                    return;
                }
            case 14:
                vs0.j(((Integer) obj).intValue());
                return;
            case h75.g:
                vs0.l(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                vs0.p((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                vs0.r((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        lv6 lv6;
        Map map;
        Map map2;
        if (!this.b) {
            int i = 0;
            while (true) {
                lv6 = this.a;
                if (i >= lv6.x.size()) {
                    break;
                }
                Map.Entry c2 = lv6.c(i);
                if (c2.getValue() instanceof b) {
                    b bVar = (b) c2.getValue();
                    bVar.getClass();
                    au5 au5 = au5.c;
                    au5.getClass();
                    au5.a(bVar.getClass()).b(bVar);
                    bVar.o();
                }
                i++;
            }
            if (!lv6.z) {
                if (lv6.x.size() <= 0) {
                    Iterator it = lv6.e().iterator();
                    if (it.hasNext()) {
                        ((Map.Entry) it.next()).getKey().getClass();
                        ku4.a();
                        return;
                    }
                } else {
                    lv6.c(0).getKey().getClass();
                    ku4.a();
                    return;
                }
            }
            if (!lv6.z) {
                if (lv6.y.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = Collections.unmodifiableMap(lv6.y);
                }
                lv6.y = map;
                if (lv6.B.isEmpty()) {
                    map2 = Collections.EMPTY_MAP;
                } else {
                    map2 = Collections.unmodifiableMap(lv6.B);
                }
                lv6.B = map2;
                lv6.z = true;
            }
            this.b = true;
        }
    }

    public final Object clone() {
        oc2 oc2 = new oc2();
        lv6 lv6 = this.a;
        if (lv6.x.size() <= 0) {
            Iterator it = lv6.e().iterator();
            if (!it.hasNext()) {
                return oc2;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ku4.a();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry c2 = lv6.c(0);
        if (c2.getKey() != null) {
            ku4.a();
            return null;
        }
        c2.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2)) {
            return false;
        }
        return this.a.equals(((oc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public oc2() {
    }
}

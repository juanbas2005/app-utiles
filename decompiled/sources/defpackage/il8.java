package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: il8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il8 {
    public static final /* synthetic */ int c = 0;
    public final ym8 a = new ym8();
    public boolean b;

    static {
        new il8(0);
    }

    public il8(int i) {
        a();
        a();
    }

    public static void b(fl8 fl8, mn8 mn8, int i, Object obj) {
        if (mn8 != mn8.GROUP) {
            fl8.d(i, mn8.x);
            nn8 nn8 = nn8.w;
            switch (mn8.ordinal()) {
                case b85.b:
                    fl8.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    fl8.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    fl8.t(((Long) obj).longValue());
                    return;
                case 3:
                    fl8.t(((Long) obj).longValue());
                    return;
                case 4:
                    fl8.q(((Integer) obj).intValue());
                    return;
                case 5:
                    fl8.u(((Long) obj).longValue());
                    return;
                case 6:
                    fl8.s(((Integer) obj).intValue());
                    return;
                case 7:
                    fl8.p(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                    return;
                case 8:
                    if (obj instanceof vk8) {
                        fl8.m((vk8) obj);
                        return;
                    } else {
                        fl8.v((String) obj);
                        return;
                    }
                case 9:
                    ((nl8) ((pk8) obj)).f(fl8);
                    return;
                case 10:
                    fl8.o((pk8) obj);
                    return;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    if (obj instanceof vk8) {
                        fl8.m((vk8) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    fl8.n(bArr.length, bArr);
                    return;
                case 12:
                    fl8.r(((Integer) obj).intValue());
                    return;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    if (obj instanceof pl8) {
                        fl8.q(((pl8) obj).a());
                        return;
                    } else {
                        fl8.q(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    fl8.s(((Integer) obj).intValue());
                    return;
                case h75.g:
                    fl8.u(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    fl8.r((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    fl8.t((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        } else {
            fl8.d(i, 3);
            ((nl8) ((pk8) obj)).f(fl8);
            fl8.d(i, 4);
        }
    }

    public final void a() {
        Map map;
        Map map2;
        if (!this.b) {
            ym8 ym8 = this.a;
            int i = ym8.x;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = ym8.a(i2).x;
                if (obj instanceof nl8) {
                    nl8 nl8 = (nl8) obj;
                    tm8.c.a(nl8.getClass()).f(nl8);
                    nl8.h();
                }
            }
            for (Map.Entry value : ym8.b()) {
                Object value2 = value.getValue();
                if (value2 instanceof nl8) {
                    nl8 nl82 = (nl8) value2;
                    tm8.c.a(nl82.getClass()).f(nl82);
                    nl82.h();
                }
            }
            if (!ym8.z) {
                if (ym8.x <= 0) {
                    Iterator it = ym8.b().iterator();
                    if (it.hasNext()) {
                        ((Map.Entry) it.next()).getKey().getClass();
                        ku4.a();
                        return;
                    }
                } else {
                    ym8.a(0).w.getClass();
                    ku4.a();
                    return;
                }
            }
            if (!ym8.z) {
                if (ym8.y.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = Collections.unmodifiableMap(ym8.y);
                }
                ym8.y = map;
                if (ym8.B.isEmpty()) {
                    map2 = Collections.EMPTY_MAP;
                } else {
                    map2 = Collections.unmodifiableMap(ym8.B);
                }
                ym8.B = map2;
                ym8.z = true;
            }
            this.b = true;
        }
    }

    public final Object clone() {
        il8 il8 = new il8();
        ym8 ym8 = this.a;
        if (ym8.x <= 0) {
            Iterator it = ym8.b().iterator();
            if (!it.hasNext()) {
                return il8;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ku4.a();
                return null;
            }
            entry.getValue();
            throw null;
        }
        ym8.a(0).w.getClass();
        ku4.a();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il8)) {
            return false;
        }
        return this.a.equals(((il8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public il8() {
    }
}

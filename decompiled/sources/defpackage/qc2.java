package defpackage;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qc2 {
    public static final /* synthetic */ int c = 0;
    public final nv6 a = nv6.g();
    public boolean b;

    static {
        new qc2(0);
    }

    public qc2(int i) {
        a();
        a();
    }

    public static void b(ws0 ws0, sc8 sc8, int i, Object obj) {
        if (sc8 == sc8.GROUP) {
            ws0.B(i, 3);
            ((a) obj).b(ws0);
            ws0.B(i, 4);
            return;
        }
        ws0.B(i, sc8.x);
        switch (sc8.ordinal()) {
            case b85.b:
                ws0.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                ws0.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                ws0.F(((Long) obj).longValue());
                return;
            case 3:
                ws0.F(((Long) obj).longValue());
                return;
            case 4:
                ws0.w(((Integer) obj).intValue());
                return;
            case 5:
                ws0.u(((Long) obj).longValue());
                return;
            case 6:
                ws0.s(((Integer) obj).intValue());
                return;
            case 7:
                ws0.m(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof zf0) {
                    ws0.q((zf0) obj);
                    return;
                } else {
                    ws0.A((String) obj);
                    return;
                }
            case 9:
                ((a) obj).b(ws0);
                return;
            case 10:
                a aVar = (a) obj;
                ws0.D(((e) aVar).a((pg6) null));
                aVar.b(ws0);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (obj instanceof zf0) {
                    ws0.q((zf0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                ws0.D(length);
                ws0.n(bArr, 0, length);
                return;
            case 12:
                ws0.D(((Integer) obj).intValue());
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ws0.w(((Integer) obj).intValue());
                return;
            case 14:
                ws0.s(((Integer) obj).intValue());
                return;
            case h75.g:
                ws0.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                ws0.D((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                ws0.F((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map map;
        Map map2;
        if (!this.b) {
            nv6 nv6 = this.a;
            int size = nv6.w.size();
            for (int i = 0; i < size; i++) {
                Map.Entry c2 = nv6.c(i);
                if (c2.getValue() instanceof e) {
                    e eVar = (e) c2.getValue();
                    eVar.getClass();
                    bu5 bu5 = bu5.c;
                    bu5.getClass();
                    bu5.a(eVar.getClass()).b(eVar);
                    eVar.h();
                }
            }
            if (!nv6.y) {
                if (nv6.w.size() <= 0) {
                    Iterator it = nv6.e().iterator();
                    if (it.hasNext()) {
                        ((Map.Entry) it.next()).getKey().getClass();
                        ku4.a();
                        return;
                    }
                } else {
                    nv6.c(0).getKey().getClass();
                    ku4.a();
                    return;
                }
            }
            if (!nv6.y) {
                if (nv6.x.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = Collections.unmodifiableMap(nv6.x);
                }
                nv6.x = map;
                if (nv6.A.isEmpty()) {
                    map2 = Collections.EMPTY_MAP;
                } else {
                    map2 = Collections.unmodifiableMap(nv6.A);
                }
                nv6.A = map2;
                nv6.y = true;
            }
            this.b = true;
        }
    }

    public final Object clone() {
        qc2 qc2 = new qc2();
        nv6 nv6 = this.a;
        if (nv6.w.size() <= 0) {
            Iterator it = nv6.e().iterator();
            if (!it.hasNext()) {
                return qc2;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ku4.a();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry c2 = nv6.c(0);
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
        if (!(obj instanceof qc2)) {
            return false;
        }
        return this.a.equals(((qc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public qc2() {
    }
}

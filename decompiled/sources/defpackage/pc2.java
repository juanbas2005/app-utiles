package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: pc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pc2 {
    public static final pc2 c = new pc2(0);
    public final mv6 a = new mv6(16);
    public boolean b;

    public pc2(int i) {
        f();
    }

    public static int c(rc8 rc8, Object obj) {
        switch (rc8.ordinal()) {
            case b85.b:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return xs0.q(((Long) obj).longValue());
            case 3:
                return xs0.q(((Long) obj).longValue());
            case 4:
                return xs0.m(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return xs0.p(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    ku4.o("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((k2) obj).c();
            case 10:
                return xs0.o((k2) obj);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (obj instanceof bg0) {
                    bg0 bg0 = (bg0) obj;
                    return bg0.size() + xs0.p(bg0.size());
                }
                byte[] bArr = (byte[]) obj;
                return xs0.p(bArr.length) + bArr.length;
            case 12:
                return xs0.p(((Integer) obj).intValue());
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (obj instanceof mf3) {
                    return xs0.m(((mf3) obj).a());
                }
                return xs0.m(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case h75.g:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return xs0.p((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return xs0.q((longValue >> 63) ^ (longValue << 1));
            default:
                rf2.r("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(xu2 xu2, Object obj) {
        rc8 rc8 = xu2.x;
        int i = xu2.w;
        if (xu2.y) {
            int i2 = 0;
            for (Object next : (List) obj) {
                int r = xs0.r(i);
                if (rc8 == rc8.GROUP) {
                    r *= 2;
                }
                i2 += c(rc8, next) + r;
            }
            return i2;
        }
        int r2 = xs0.r(i);
        if (rc8 == rc8.GROUP) {
            r2 *= 2;
        }
        return c(rc8, obj) + r2;
    }

    public static boolean e(Map.Entry entry) {
        xu2 xu2 = (xu2) entry.getKey();
        if (xu2.x.w != uc8.F) {
            return true;
        }
        if (xu2.y) {
            for (k2 a2 : (List) entry.getValue()) {
                if (!a2.a()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof k2)) {
            h.q("Wrong object type used with protocol message reflection.");
            return false;
        } else if (!((k2) value).a()) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public static Object h(ts0 ts0, rc8 rc8) {
        boolean z = true;
        switch (rc8.ordinal()) {
            case b85.b:
                return Double.valueOf(Double.longBitsToDouble(ts0.k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(ts0.j()));
            case 2:
                return Long.valueOf(ts0.m());
            case 3:
                return Long.valueOf(ts0.m());
            case 4:
                return Integer.valueOf(ts0.l());
            case 5:
                return Long.valueOf(ts0.k());
            case 6:
                return Integer.valueOf(ts0.j());
            case 7:
                if (ts0.m() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                int l = ts0.l();
                int i = ts0.b;
                int i2 = ts0.d;
                if (l <= i - i2 && l > 0) {
                    String str = new String(ts0.a, i2, l, "UTF-8");
                    ts0.d += l;
                    return str;
                } else if (l == 0) {
                    return "";
                } else {
                    return new String(ts0.i(l), "UTF-8");
                }
            case 9:
                h.q("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                h.q("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ts0.f();
            case 12:
                return Integer.valueOf(ts0.l());
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                h.q("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(ts0.j());
            case h75.g:
                return Long.valueOf(ts0.k());
            case 16:
                int l2 = ts0.l();
                return Integer.valueOf((-(l2 & 1)) ^ (l2 >>> 1));
            case 17:
                long m = ts0.m();
                return Long.valueOf((-(m & 1)) ^ (m >>> 1));
            default:
                rf2.r("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r3 instanceof defpackage.mf3) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r0 = false;
     */
    public static void j(rc8 rc8, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (rc8.w.ordinal()) {
            case b85.b:
                z2 = obj instanceof Integer;
                break;
            case 1:
                z2 = obj instanceof Long;
                break;
            case 2:
                z2 = obj instanceof Float;
                break;
            case 3:
                z2 = obj instanceof Double;
                break;
            case 4:
                z2 = obj instanceof Boolean;
                break;
            case 5:
                z2 = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof bg0)) {
                    break;
                }
                break;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 8:
                z2 = obj instanceof k2;
                break;
        }
        z2 = z;
        if (!z2) {
            h.q("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(xs0 xs0, rc8 rc8, Object obj) {
        switch (rc8.ordinal()) {
            case b85.b:
                double doubleValue = ((Double) obj).doubleValue();
                xs0.getClass();
                xs0.e0(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                xs0.getClass();
                xs0.d0(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                xs0.g0(((Long) obj).longValue());
                return;
            case 3:
                xs0.g0(((Long) obj).longValue());
                return;
            case 4:
                xs0.X(((Integer) obj).intValue());
                return;
            case 5:
                xs0.e0(((Long) obj).longValue());
                return;
            case 6:
                xs0.d0(((Integer) obj).intValue());
                return;
            case 7:
                xs0.a0(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                xs0.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                xs0.f0(bytes.length);
                xs0.c0(bytes);
                return;
            case 9:
                xs0.getClass();
                ((k2) obj).f(xs0);
                return;
            case 10:
                xs0.Z((k2) obj);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (obj instanceof bg0) {
                    bg0 bg0 = (bg0) obj;
                    xs0.getClass();
                    xs0.f0(bg0.size());
                    xs0.b0(bg0);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                xs0.getClass();
                xs0.f0(bArr.length);
                xs0.c0(bArr);
                return;
            case 12:
                xs0.f0(((Integer) obj).intValue());
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (obj instanceof mf3) {
                    xs0.X(((mf3) obj).a());
                    return;
                } else {
                    xs0.X(((Integer) obj).intValue());
                    return;
                }
            case 14:
                xs0.d0(((Integer) obj).intValue());
                return;
            case h75.g:
                xs0.e0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                xs0.f0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                xs0.g0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(xu2 xu2, Object obj) {
        List list;
        if (xu2.y) {
            j(xu2.x, obj);
            mv6 mv6 = this.a;
            Object obj2 = mv6.get(xu2);
            if (obj2 == null) {
                list = new ArrayList();
                mv6.put(xu2, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        h.q("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public final pc2 clone() {
        mv6 mv6;
        pc2 pc2 = new pc2();
        int i = 0;
        while (true) {
            mv6 = this.a;
            if (i >= mv6.x.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) mv6.x.get(i);
            pc2.i((xu2) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : mv6.c()) {
            pc2.i((xu2) entry2.getKey(), entry2.getValue());
        }
        return pc2;
    }

    public final void f() {
        Map map;
        if (!this.b) {
            mv6 mv6 = this.a;
            if (!mv6.z) {
                for (int i = 0; i < mv6.x.size(); i++) {
                    Map.Entry entry = (Map.Entry) mv6.x.get(i);
                    if (((xu2) entry.getKey()).y) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : mv6.c()) {
                    if (((xu2) entry2.getKey()).y) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            if (!mv6.z) {
                if (mv6.y.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = Collections.unmodifiableMap(mv6.y);
                }
                mv6.y = map;
                mv6.z = true;
            }
            this.b = true;
        }
    }

    public final void g(Map.Entry entry) {
        xu2 xu2 = (xu2) entry.getKey();
        Object value = entry.getValue();
        boolean z = xu2.y;
        mv6 mv6 = this.a;
        if (z) {
            Object obj = mv6.get(xu2);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object next : (List) value) {
                List list = (List) obj;
                if (next instanceof byte[]) {
                    byte[] bArr = (byte[]) next;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    next = bArr2;
                }
                list.add(next);
            }
            mv6.put(xu2, obj);
        } else if (xu2.x.w == uc8.F) {
            Object obj2 = mv6.get(xu2);
            if (obj2 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                mv6.put(xu2, value);
                return;
            }
            mv6.put(xu2, ((k2) obj2).e().e((zu2) ((k2) value)).c());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            mv6.put(xu2, value);
        }
    }

    public final void i(xu2 xu2, Object obj) {
        boolean z = xu2.y;
        rc8 rc8 = xu2.x;
        if (!z) {
            j(rc8, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(rc8, it.next());
            }
            obj = arrayList;
        } else {
            h.q("Wrong object type used with protocol message reflection.");
            return;
        }
        this.a.put(xu2, obj);
    }

    public pc2() {
    }
}

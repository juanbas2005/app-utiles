package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pp4 {
    public final LinkedHashMap a;
    public final f96 b;

    public pp4(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new f96(z);
    }

    public final Map a() {
        yb5 yb5;
        Iterable<Map.Entry> entrySet = this.a.entrySet();
        int F = tf4.F(et0.e0(entrySet, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                yb5 = new yb5(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                yb5 = new yb5(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(yb5.w, yb5.x);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.x).get()) {
            h.s("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(in5 in5, Object obj) {
        in5.getClass();
        d(in5, obj);
    }

    public final void d(in5 in5, Object obj) {
        in5.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(in5);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(dt0.g1((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(in5, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(in5, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(in5, obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof pp4) {
            LinkedHashMap linkedHashMap = ((pp4) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = sg3.e(value, obj2);
                                    continue;
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                    continue;
                                }
                                if (!z) {
                                }
                            }
                            z = false;
                            continue;
                            if (!z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        for (Map.Entry value : this.a.entrySet()) {
            Object value2 = value.getValue();
            if (value2 instanceof byte[]) {
                i = Arrays.hashCode((byte[]) value2);
            } else {
                i = value2.hashCode();
            }
            i2 += i;
        }
        return i2;
    }

    public final String toString() {
        return dt0.E0(this.a.entrySet(), ",\n", "{\n", "\n}", new tm3(21), 24);
    }

    public /* synthetic */ pp4(boolean z) {
        this(new LinkedHashMap(), z);
    }
}

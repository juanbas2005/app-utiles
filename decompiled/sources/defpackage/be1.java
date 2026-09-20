package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: be1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be1 {
    public final LinkedHashMap a;

    public be1(LinkedHashMap linkedHashMap, cf4 cf4) {
        this.a = linkedHashMap;
        ms3 ms3 = (ms3) cf4.z;
        String str = (String) cf4.y;
        ub4 ub4 = ub4.w;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str, (Throwable) null, "PluginManager initialized with plugins: " + linkedHashMap.keySet());
        }
    }

    public void a(HashMap hashMap) {
        Object[] objArr;
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                Class<?> cls = value.getClass();
                c26 c26 = b26.a;
                gq3 b = c26.b(cls);
                if (!b.equals(c26.b(Boolean.TYPE)) && !b.equals(c26.b(Byte.TYPE)) && !b.equals(c26.b(Integer.TYPE)) && !b.equals(c26.b(Long.TYPE)) && !b.equals(c26.b(Float.TYPE)) && !b.equals(c26.b(Double.TYPE)) && !b.equals(c26.b(String.class)) && !b.equals(c26.b(Boolean[].class)) && !b.equals(c26.b(Byte[].class)) && !b.equals(c26.b(Integer[].class)) && !b.equals(c26.b(Long[].class)) && !b.equals(c26.b(Float[].class)) && !b.equals(c26.b(Double[].class)) && !b.equals(c26.b(String[].class))) {
                    int i = 0;
                    if (b.equals(c26.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = lf1.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (b.equals(c26.b(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = lf1.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (b.equals(c26.b(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = lf1.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (b.equals(c26.b(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = lf1.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (b.equals(c26.b(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = lf1.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else if (b.equals(c26.b(double[].class))) {
                        double[] dArr = (double[]) value;
                        String str7 = lf1.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    } else {
                        ta1.i("Key ", str, " has invalid type ", b);
                        return;
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public be1(vc5 vc5) {
        Map map = vc5.w;
        map.getClass();
        this.a = new LinkedHashMap(map);
    }

    public be1(int i) {
        switch (i) {
            case 3:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }
}

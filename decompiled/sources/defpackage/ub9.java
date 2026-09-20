package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: ub9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ub9 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0  */
    public static void a(Throwable th) {
        Throwable th2;
        boolean z;
        lx8 lx8;
        Object obj;
        int i;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null) {
            WeakHashMap weakHashMap2 = a;
            synchronized (weakHashMap2) {
                Throwable th4 = th;
                while (th4 != null) {
                    try {
                        if (weakHashMap2.containsKey(th4)) {
                            break;
                        }
                        th4 = th4.getCause();
                    } catch (Throwable th5) {
                        while (true) {
                            throw th5;
                        }
                    }
                }
                if (th4 == null) {
                    lx8 = null;
                } else {
                    weakHashMap2.put(th, (rb9) weakHashMap2.get(th4));
                    lx8 = new lx8(4);
                }
            }
            if (lx8 == null && (obj = vb9.c().b) != null) {
                ArrayList arrayList = new ArrayList();
                for (obj = vb9.c().b; obj != null; obj = ((qb9) obj).w) {
                    arrayList.add(obj);
                }
                UUID uuid = ((qb9) ((jc9) arrayList.get(0))).x;
                if (uuid != null) {
                    ((jc9) arrayList.get(0)).getClass();
                    int size = arrayList.size();
                    m93 m93 = q93.x;
                    ie1.z(size, "expectedSize");
                    ie1.z(size, "initialCapacity");
                    Object[] objArr = new Object[size];
                    int size2 = arrayList.size();
                    ie1.z(size2, "expectedSize");
                    ie1.z(size2, "initialCapacity");
                    Object[] objArr2 = new Object[size2];
                    int i2 = 0;
                    boolean z2 = false;
                    int i3 = 0;
                    boolean z3 = false;
                    for (jc9 jc9 : fd1.Z(arrayList)) {
                        String str = ((qb9) jc9).z;
                        int i4 = i3 + 1;
                        if (objArr2.length < i4) {
                            objArr2 = Arrays.copyOf(objArr2, i93.d(objArr2.length, i4));
                        } else {
                            if (z3) {
                                objArr2 = (Object[]) objArr2.clone();
                            }
                            int i5 = i3 + 1;
                            objArr2[i3] = str;
                            fc9 e = jc9.e();
                            e.getClass();
                            i = i2 + 1;
                            if (objArr.length >= i) {
                                objArr = Arrays.copyOf(objArr, i93.d(objArr.length, i));
                            } else if (z2) {
                                objArr = (Object[]) objArr.clone();
                            } else {
                                objArr[i2] = e;
                                i2++;
                                i3 = i5;
                            }
                            z2 = false;
                            objArr[i2] = e;
                            i2++;
                            i3 = i5;
                        }
                        z3 = false;
                        int i52 = i3 + 1;
                        objArr2[i3] = str;
                        fc9 e2 = jc9.e();
                        e2.getClass();
                        i = i2 + 1;
                        if (objArr.length >= i) {
                        }
                        z2 = false;
                        objArr[i2] = e2;
                        i2++;
                        i3 = i52;
                    }
                    WeakHashMap weakHashMap3 = a;
                    synchronized (weakHashMap3) {
                        try {
                            i36 p = q93.p(i3, objArr2);
                            if (p != null) {
                                i36 p2 = q93.p(i2, objArr);
                                if (p2 != null) {
                                    weakHashMap3.put(th, new rb9(p, p2, uuid));
                                } else {
                                    throw new NullPointerException("Null extras");
                                }
                            } else {
                                throw new NullPointerException("Null spansNames");
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    return;
                }
                ku4.j("Null rootTraceId");
            }
        }
    }
}

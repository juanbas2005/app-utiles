package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: pk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pk8 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        int i = 0;
        if (iterable instanceof bm8) {
            List a = ((bm8) iterable).a();
            if (list == null) {
                list.size();
                Iterator it = a.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (next instanceof vk8) {
                        throw null;
                    } else if (next instanceof byte[]) {
                        byte[] bArr = (byte[]) next;
                        vk8.p(bArr, 0, bArr.length);
                        throw null;
                    } else {
                        String str = (String) next;
                        throw null;
                    }
                }
            } else {
                ku4.a();
            }
        } else if (!(iterable instanceof sm8)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof um8) {
                    um8 um8 = (um8) list;
                    int i2 = um8.y + size;
                    int length = um8.x.length;
                    if (i2 > length) {
                        if (length != 0) {
                            while (length < i2) {
                                length = Math.max(((length * 3) / 2) + 1, 10);
                            }
                            um8.x = Arrays.copyOf(um8.x, length);
                        } else {
                            um8.x = new Object[Math.max(i2, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object next2 : iterable) {
                    if (next2 != null) {
                        list.add(next2);
                    } else {
                        ll8.a(size2, list);
                        throw null;
                    }
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            while (i < size3) {
                Object obj = list2.get(i);
                if (obj != null) {
                    list.add(obj);
                    i++;
                } else {
                    ll8.a(size2, list);
                    throw null;
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public final byte[] a() {
        try {
            nl8 nl8 = (nl8) this;
            int m = nl8.m();
            byte[] bArr = new byte[m];
            boolean z = fl8.b;
            zk8 zk8 = new zk8(bArr, m);
            nl8.f(zk8);
            if (zk8.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            } else if (zk8.x() >= 0) {
                return bArr;
            } else {
                throw new IllegalStateException("Wrote more data than expected.");
            }
        } catch (IOException e) {
            String name = getClass().getName();
            ku4.o(f21.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void b(OutputStream outputStream) {
        nl8 nl8 = (nl8) this;
        int m = nl8.m();
        boolean z = fl8.b;
        if (m > 4096) {
            m = 4096;
        }
        al8 al8 = new al8(outputStream, m);
        nl8.f(al8);
        if (al8.e > 0) {
            al8.B();
        }
    }

    public abstract int c(wm8 wm8);
}

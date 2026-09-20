package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: x79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x79 implements Comparable {
    public static final AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ long z;
    public final String w;
    public volatile Object x;

    static {
        Class<x79> cls = x79.class;
        y = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "x");
        z = y79.a.objectFieldOffset(cls.getDeclaredField("x"));
    }

    public /* synthetic */ x79(String str, byte[] bArr) {
        this.w = str;
        this.x = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        x79 x79;
        int i = 0;
        while (true) {
            Object obj = this.x;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (!Arrays.equals(bArr, bArr3[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (!Arrays.equals(bArr, bArr4)) {
                    i = 1;
                    bArr2 = new byte[][]{bArr4, bArr};
                } else {
                    return;
                }
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = y79.a;
                long j = z;
                x79 = this;
                if (!unsafe.compareAndSwapObject(x79, j, obj, bArr5)) {
                    if (unsafe.getObjectVolatile(x79, j) != obj) {
                        break;
                    }
                    this = x79;
                } else {
                    return;
                }
            }
            this = x79;
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.w.compareTo((String) obj);
    }
}

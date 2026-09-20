package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: d19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d19 implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static d19 e(byte... bArr) {
        bArr.getClass();
        i19 i19 = new i19(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return fb5.y(i19);
        } finally {
            try {
                i19.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final d19 c(Class cls) {
        if (cls.isInstance(this)) {
            return (d19) cls.cast(this);
        }
        String name = cls.getName();
        String name2 = getClass().getName();
        throw new Exception("Expected a " + name + " value, but got " + name2);
    }
}

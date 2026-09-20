package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: vk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vk8 implements Iterable, Serializable {
    public static final uk8 x = new uk8(xl8.a);
    public int w;

    static {
        int i = rk8.a;
    }

    public static uk8 p(byte[] bArr, int i, int i2) {
        try {
            return s(bArr, i, i2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static uk8 s(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return x;
        }
        w(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new uk8(bArr2);
    }

    public static int w(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static /* synthetic */ boolean x(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        w(i, i4, bArr.length);
        w(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte d(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vk8)) {
            return false;
        }
        vk8 vk8 = (vk8) obj;
        int f = f();
        if (f != vk8.f()) {
            return false;
        }
        if (f == 0) {
            return true;
        }
        int i = this.w;
        int i2 = vk8.w;
        if (i == 0 || i2 == 0 || i == i2) {
            return n(vk8);
        }
        return false;
    }

    public abstract int f();

    public abstract tk8 g(int i, int i2);

    public final int hashCode() {
        int i = this.w;
        if (i == 0) {
            int f = f();
            i = o(f, f);
            if (i == 0) {
                i = 1;
            }
            this.w = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new uf0(this);
    }

    public abstract void k(int i, byte[] bArr);

    public abstract void l(fl8 fl8);

    public abstract boolean n(vk8 vk8);

    public abstract int o(int i, int i2);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f = f();
        if (f() <= 50) {
            str = a35.p(v());
        } else {
            str = a35.p(g(0, 47).v()).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(f);
        sb.append(" contents=\"");
        return f21.l(sb, str, "\">");
    }

    public final byte[] v() {
        int f = f();
        if (f == 0) {
            return xl8.a;
        }
        byte[] bArr = new byte[f];
        k(f, bArr);
        return bArr;
    }
}

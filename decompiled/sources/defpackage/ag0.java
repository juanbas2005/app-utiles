package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ag0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ag0 extends OutputStream {
    public static final byte[] B = new byte[0];
    public int A;
    public final int w = 128;
    public final ArrayList x = new ArrayList();
    public int y;
    public byte[] z = new byte[128];

    public final void a(int i) {
        this.x.add(new b94(this.z));
        int length = this.y + this.z.length;
        this.y = length;
        this.z = new byte[Math.max(this.w, Math.max(i, length >>> 1))];
        this.A = 0;
    }

    public final void k() {
        int i = this.A;
        byte[] bArr = this.z;
        int length = bArr.length;
        ArrayList arrayList = this.x;
        if (i >= length) {
            arrayList.add(new b94(this.z));
            this.z = B;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new b94(bArr2));
        }
        this.y += this.A;
        this.A = 0;
    }

    public final synchronized bg0 l() {
        bg0 bg0;
        k();
        ArrayList arrayList = this.x;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((bg0) it.next());
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            bg0 = bg0.w;
        } else {
            bg0 = bg0.d(arrayList.iterator(), arrayList.size());
        }
        return bg0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.y + this.A;
        }
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{hexString, Integer.valueOf(i)});
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.z;
            int length = bArr2.length;
            int i3 = this.A;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.A += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                a(i4);
                System.arraycopy(bArr, i + length2, this.z, 0, i4);
                this.A = i4;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void write(int i) {
        try {
            if (this.A == this.z.length) {
                a(1);
            }
            byte[] bArr = this.z;
            int i2 = this.A;
            this.A = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}

package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ha9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ha9 extends va9 {
    public static final /* synthetic */ int x = 0;
    public final ArrayList w;

    public ha9(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.w = arrayList;
    }

    public final void close() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ku4.a();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        Iterator it = this.w.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ku4.a();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    public final void write(int i) {
        this.out.write(i);
        Iterator it = this.w.iterator();
        if (it.hasNext()) {
            throw pb4.g(it);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        Iterator it = this.w.iterator();
        if (it.hasNext()) {
            throw pb4.g(it);
        }
    }
}

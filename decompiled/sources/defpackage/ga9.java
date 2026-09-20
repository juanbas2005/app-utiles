package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ga9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ga9 extends ua9 {
    public static final /* synthetic */ int x = 0;
    public final ArrayList w;

    public ga9(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
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

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            Iterator it = this.w.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            Iterator it = this.w.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.w.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
        }
        return read;
    }
}

package defpackage;

import android.util.Log;
import java.io.Writer;

/* renamed from: zb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zb4 extends Writer {
    public final String w = "FragmentManager";
    public final StringBuilder x = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.x;
        if (sb.length() > 0) {
            Log.d(this.w, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.x.append(c);
            }
        }
    }
}

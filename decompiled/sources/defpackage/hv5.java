package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: hv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hv5 implements zc2 {
    public static final Charset y = Charset.forName("UTF-8");
    public final File w;
    public gv5 x;

    public hv5(File file) {
        this.w = file;
    }

    public final void a() {
        File file = this.w;
        if (this.x == null) {
            try {
                this.x = new gv5(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    public final void b() {
        su0.h(this.x, "There was a problem closing the Crashlytics log file.");
        this.x = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    public final String c() {
        ee1 ee1;
        byte[] bArr;
        if (this.w.exists()) {
            a();
            gv5 gv5 = this.x;
            if (gv5 != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[gv5.G()];
                try {
                    this.x.l(new kg5(4, bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                ee1 = new ee1(bArr2, iArr[0]);
                if (ee1 != null) {
                    bArr = null;
                } else {
                    int i = ee1.a;
                    bArr = new byte[i];
                    System.arraycopy(ee1.b, 0, bArr, 0, i);
                }
                if (bArr == null) {
                    return new String(bArr, y);
                }
                return null;
            }
        }
        ee1 = null;
        if (ee1 != null) {
        }
        if (bArr == null) {
        }
    }

    public final void g(long j, String str) {
        a();
        if (this.x != null) {
            try {
                if (str.length() > 16384) {
                    str = "...".concat(str.substring(str.length() - 16384));
                }
                this.x.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(y));
                while (!this.x.o() && this.x.G() > 65536) {
                    this.x.B();
                }
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}

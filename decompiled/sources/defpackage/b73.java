package defpackage;

import android.net.Uri;

/* renamed from: b73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b73 implements ic2 {
    public final nz3 a;
    public final z97 b;
    public final boolean c;

    public b73(nz3 nz3, z97 z97, boolean z) {
        this.a = nz3;
        this.b = z97;
        this.c = z;
    }

    public final jc2 a(Object obj, v75 v75) {
        Uri uri = (Uri) obj;
        if (!sg3.e(uri.getScheme(), "http") && !sg3.e(uri.getScheme(), "https")) {
            return null;
        }
        return new e73(uri.toString(), v75, this.a, this.b, this.c);
    }
}

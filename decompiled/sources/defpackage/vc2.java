package defpackage;

import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.File;

/* renamed from: vc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc2 implements jc2 {
    public final File a;

    public vc2(File file) {
        this.a = file;
    }

    public final Object a(f61 f61) {
        String str = ae5.x;
        File file = this.a;
        xc2 xc2 = new xc2(tz2.l(file), nd2.w, (String) null, (Closeable) null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        name.getClass();
        return new xy6(xc2, singleton.getMimeTypeFromExtension(d57.d1('.', name, "")), pe1.y);
    }
}

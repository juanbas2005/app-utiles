package defpackage;

import java.io.File;

/* renamed from: yc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yc2 implements dt3 {
    public final boolean a;

    public yc2(boolean z) {
        this.a = z;
    }

    public final String a(Object obj, v75 v75) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}

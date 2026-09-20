package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: sa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sa9 extends ua9 implements ra9 {
    public final File w;

    public sa9(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.w = file;
    }

    public final File a() {
        return this.w;
    }
}

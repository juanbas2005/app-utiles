package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* renamed from: ta9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ta9 extends va9 implements ra9 {
    public final FileOutputStream w;
    public final File x;

    public ta9(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.w = fileOutputStream;
        this.x = file;
    }

    public final File a() {
        return this.x;
    }
}

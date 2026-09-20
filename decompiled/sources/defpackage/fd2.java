package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class fd2 implements ks0 {
    public final File a;
    public final tl6 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public fd2(File file, tl6 tl6) {
        tl6.getClass();
        this.a = file;
        this.b = tl6;
    }

    public final void close() {
        this.c.set(true);
    }
}

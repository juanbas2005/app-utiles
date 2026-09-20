package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ld2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ld2 implements FilenameFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ ld2(String str) {
        this.a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}

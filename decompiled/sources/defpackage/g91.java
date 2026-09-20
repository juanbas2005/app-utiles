package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: g91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g91 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ g91(int i) {
        this.a = i;
    }

    public final boolean accept(File file, String str) {
        switch (this.a) {
            case b85.b:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                if (!str.startsWith("event") || str.endsWith("_")) {
                    return false;
                }
                return true;
        }
    }
}

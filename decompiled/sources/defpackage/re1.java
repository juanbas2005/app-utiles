package defpackage;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: re1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class re1 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ jf1 x;

    public /* synthetic */ re1(jf1 jf1, int i) {
        this.w = i;
        this.x = jf1;
    }

    public final Object b() {
        int i = this.w;
        jf1 jf1 = this.x;
        switch (i) {
            case b85.b:
                gd2 gd2 = jf1.a;
                File canonicalFile = ((File) gd2.c.b()).getCanonicalFile();
                synchronized (gd2.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = gd2.d;
                    if (!linkedHashSet.contains(absolutePath)) {
                        absolutePath.getClass();
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new jd2(canonicalFile, gd2.a, (cf3) gd2.b.y(canonicalFile), new zh(15, (Object) canonicalFile));
            default:
                return ((jd2) jf1.j.getValue()).c;
        }
    }
}

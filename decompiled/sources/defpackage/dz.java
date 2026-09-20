package defpackage;

import java.io.File;

/* renamed from: dz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz {
    public final cz a;
    public final String b;
    public final File c;

    public dz(cz czVar, String str, File file) {
        this.a = czVar;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        ku4.j("Null sessionId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        if (!this.a.equals(dzVar.a) || !this.b.equals(dzVar.b) || !this.c.equals(dzVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}

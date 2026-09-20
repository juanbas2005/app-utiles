package defpackage;

import android.content.Context;

/* renamed from: nr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr2 implements j87 {
    public final boolean A;
    public final z97 B = new z97(new zh(17, (Object) this));
    public boolean C;
    public final Context w;
    public final String x;
    public final qa y;
    public final boolean z;

    public nr2(Context context, String str, qa qaVar, boolean z2, boolean z3) {
        context.getClass();
        qaVar.getClass();
        this.w = context;
        this.x = str;
        this.y = qaVar;
        this.z = z2;
        this.A = z3;
    }

    public final ir2 P() {
        return ((mr2) this.B.getValue()).a(true);
    }

    public final void close() {
        z97 z97 = this.B;
        if (z97.a()) {
            ((mr2) z97.getValue()).close();
        }
    }

    public final String getDatabaseName() {
        return this.x;
    }

    public final void setWriteAheadLoggingEnabled(boolean z2) {
        z97 z97 = this.B;
        if (z97.a()) {
            ((mr2) z97.getValue()).setWriteAheadLoggingEnabled(z2);
        }
        this.C = z2;
    }
}

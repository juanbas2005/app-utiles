package defpackage;

import android.content.Context;
import java.util.Iterator;

/* renamed from: et4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class et4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ iu4 x;

    public /* synthetic */ et4(iu4 iu4, int i) {
        this.w = i;
        this.x = iu4;
    }

    public final Object b() {
        int i;
        int i2 = this.w;
        iu4 iu4 = this.x;
        switch (i2) {
            case b85.b:
                g30 g30 = iu4.f;
                boolean z = false;
                if (iu4.g) {
                    as asVar = iu4.b.f;
                    if (asVar == null || !asVar.isEmpty()) {
                        Iterator it = asVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((zs4) it.next()).x instanceof eu4) && (i = i + 1) < 0) {
                                sg3.Y();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                g30.e(z);
                return vs7.a;
            default:
                Context context = iu4.a;
                ox4 ox4 = iu4.b.s;
                context.getClass();
                ox4.getClass();
                return new Object();
        }
    }
}

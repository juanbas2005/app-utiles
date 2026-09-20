package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: p30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p30 extends r58 {
    public final String b;
    public uy5 c;

    public p30(ye6 ye6) {
        String str = (String) ye6.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            ye6.b("SaveableStateHolder_BackStackEntryKey", str);
        }
        this.b = str;
    }

    public final void d() {
        uy5 uy5 = this.c;
        if (uy5 != null) {
            oe6 oe6 = (oe6) ((WeakReference) uy5.x).get();
            if (oe6 != null) {
                oe6.f(this.b);
            }
            uy5 uy52 = this.c;
            if (uy52 != null) {
                ((WeakReference) uy52.x).clear();
            } else {
                sg3.a0("saveableStateHolderRef");
                throw null;
            }
        } else {
            sg3.a0("saveableStateHolderRef");
            throw null;
        }
    }
}

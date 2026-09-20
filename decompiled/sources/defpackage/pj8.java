package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: pj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pj8 extends f76 {
    public final Level b;
    public final Set c = qj8.f;
    public final zd9 d = qj8.g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj8(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = qj8.f;
        this.b = level;
    }

    public final boolean a(Level level) {
        return true;
    }

    public final void b(uc9 uc9) {
        String str = (String) uc9.d().A(qd9.b);
        if (str == null) {
            str = this.a;
        }
        if (str == null) {
            fd9 fd9 = uc9.d;
            if (fd9 != null) {
                str = fd9.a();
                int indexOf = str.indexOf(36, str.lastIndexOf(46));
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
            } else {
                h.s("cannot request log site information prior to postProcess()");
                return;
            }
        }
        qj8.d(uc9, fb5.w(str), this.b, this.c, this.d);
    }
}

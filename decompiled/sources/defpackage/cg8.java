package defpackage;

import java.util.logging.Logger;

/* renamed from: cg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cg8 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        boolean z;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z = d57.x0(message, "getsockname failed", false);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}

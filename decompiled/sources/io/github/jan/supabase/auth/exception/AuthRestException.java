package io.github.jan.supabase.auth.exception;

import io.github.jan.supabase.exceptions.RestException;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AuthRestException extends RestException {
    public final yu x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthRestException(String str, String str2, yl1 yl1) {
        super(str, str2 + ": " + str, yl1);
        Object obj;
        str2.getClass();
        yl1.getClass();
        yu.x.getClass();
        Iterator it = yu.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((yu) obj).w.equals(str)) {
                break;
            }
        }
        this.x = (yu) obj;
    }
}

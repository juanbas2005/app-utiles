package defpackage;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* renamed from: ty4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ty4 {
    public static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            rg.d().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(sy4 sy4) {
        if (!((ry4) sy4.z.x).S()) {
            py4 py4 = sy4.z;
            py4.h();
            ry4.t((ry4) py4.x);
        }
        sy4.b();
    }
}

package defpackage;

import io.ktor.http.InvalidCookieDateException;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.InvalidDateStringException;
import java.util.List;

/* renamed from: aj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class aj1 {
    public static final List a = sg3.E("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    public static final GMTDate a(String str) {
        String obj = d57.k1(str).toString();
        try {
            return gr8.S(obj);
        } catch (InvalidCookieDateException unused) {
            obj.getClass();
            String obj2 = d57.k1(obj).toString();
            for (String zk2 : a) {
                try {
                    return new zk2(zk2).b(obj);
                } catch (InvalidDateStringException unused2) {
                }
            }
            ta1.l("Failed to parse date: ", obj2);
            return null;
        }
    }
}

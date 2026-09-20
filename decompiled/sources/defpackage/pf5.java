package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: pf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pf5 {
    public static final Pattern a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public static void b(String str, String str2) {
        if (str == null || str.length() == 0) {
            h.q("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            h.q("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            Locale locale = Locale.US;
            h.q("Attribute key length must not exceed 40 characters");
        } else if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            h.q("Attribute value length must not exceed 100 characters");
        } else if (!a.matcher(str).matches()) {
            h.q("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String c(String str) {
        String str2;
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (str.startsWith("_")) {
            int[] F = b81.F(6);
            int length = F.length;
            int i = 0;
            while (i < length) {
                switch (F[i]) {
                    case 1:
                        str2 = "_fstec";
                        break;
                    case 2:
                        str2 = "_fsntc";
                        break;
                    case 3:
                        str2 = "_tsns";
                        break;
                    case 4:
                        str2 = "_fr_tot";
                        break;
                    case 5:
                        str2 = "_fr_slo";
                        break;
                    case 6:
                        str2 = "_fr_fzn";
                        break;
                    default:
                        throw null;
                }
                if (!str2.equals(str)) {
                    i++;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public abstract boolean a();
}

package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: hg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg0 {
    public static final String c;
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new m42[]{new m42("proto"), new m42("json")})));
    public static final hg0 e;
    public static final hg0 f;
    public final String a;
    public final String b;

    static {
        String q = f55.q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = q;
        String q2 = f55.q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String q3 = f55.q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = new hg0(q, (String) null);
        f = new hg0(q2, q3);
    }

    public hg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static hg0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new hg0(str3, str2);
                }
                h.q("Missing endpoint in CCTDestination extras");
                return null;
            }
            h.q("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        h.q("Version marker missing from extras");
        return null;
    }
}

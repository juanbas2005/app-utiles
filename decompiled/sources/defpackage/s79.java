package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: s79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s79 {
    public static final i36 a;

    static {
        m93 m93 = q93.x;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        p25.d(24, objArr);
        a = q93.p(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(ik8 ik8, n36 n36, n36 n362, su6 su6, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        char c;
        r79 r79;
        int c2 = c(ik8);
        if (c2 > 0 && !(i2 == 1 && i == 1)) {
            cArr[c2] = '2';
        }
        if (g(ik8, n362) == jk8.x) {
            c = '3';
        } else if (ik8 == ik8.x && i3 == 1 && su6.z.equals(str)) {
            if (c2 > 0 && cArr[c2] != '2') {
                cArr[c2] = '1';
            }
            return true;
        } else {
            if (n36.containsKey(ik8) && (r79 = (r79) n36.get(ik8)) != null) {
                int ordinal = r79.ordinal();
                jk8 jk8 = jk8.z;
                if (ordinal != 0) {
                    jk8 jk82 = jk8.y;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (g(ik8, n362) == jk82) {
                                    return e(ik8, cArr, str2, z);
                                }
                                return f(ik8, cArr, str3, z2);
                            }
                        } else if (g(ik8, n362) == jk8) {
                            return f(ik8, cArr, str3, z2);
                        } else {
                            return e(ik8, cArr, str2, z);
                        }
                    } else if (g(ik8, n362) != jk82) {
                        return f(ik8, cArr, str3, z2);
                    }
                } else if (g(ik8, n362) != jk8) {
                    return e(ik8, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(ik8 ik8) {
        if (ik8 == ik8.x) {
            return 1;
        }
        if (ik8 == ik8.z) {
            return 2;
        }
        if (ik8 == ik8.A) {
            return 3;
        }
        if (ik8 == ik8.B) {
            return 4;
        }
        return -1;
    }

    public static final String d(ik8 ik8, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < ik8.a()) {
            str3 = str4;
        } else {
            str3 = String.valueOf(str.charAt(ik8.a() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= ik8.a()) {
            str4 = String.valueOf(str2.charAt(ik8.a() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean e(ik8 ik8, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(ik8);
        boolean z2 = false;
        if (!z) {
            c = '4';
        } else if (str.length() < ik8.a()) {
            c = '0';
        } else {
            char charAt = str.charAt(ik8.a() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '6';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(ik8 ik8, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(ik8);
        boolean z2 = false;
        if (!z) {
            c = '5';
        } else if (str.length() < ik8.a()) {
            c = '0';
        } else {
            char charAt = str.charAt(ik8.a() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '7';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final jk8 g(ik8 ik8, n36 n36) {
        Object obj = n36.get(ik8);
        if (obj == null) {
            obj = jk8.A;
        }
        return (jk8) obj;
    }
}

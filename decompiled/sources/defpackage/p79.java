package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: p79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p79 {
    public final HashMap a;

    public p79(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        i36 i36 = s79.a;
        int i = i36.z;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) i36.get(i2);
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle b() {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap hashMap = this.a;
        if ("1".equals(hashMap.get("gdprApplies")) && "1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str5 = "denied";
            if (hashMap.get("Version") == null) {
                if (!"1".equals(hashMap.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int c = c();
                if (c < 0) {
                    return Bundle.EMPTY;
                }
                String str6 = (String) hashMap.get("PurposeConsents");
                if (TextUtils.isEmpty(str6)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str6.length() > 0) {
                    if (str6.charAt(0) == '1') {
                        str4 = "granted";
                    } else {
                        str4 = str5;
                    }
                    bundle.putString("ad_storage", str4);
                }
                if (str6.length() > 3) {
                    if (str6.charAt(2) == '1' && str6.charAt(3) == '1') {
                        str3 = "granted";
                    } else {
                        str3 = str5;
                    }
                    bundle.putString("ad_personalization", str3);
                }
                if (str6.length() > 6 && c >= 4) {
                    if (str6.charAt(0) == '1' && str6.charAt(6) == '1') {
                        str5 = "granted";
                    }
                    bundle.putString("ad_user_data", str5);
                }
                return bundle;
            } else if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                if (true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1")) {
                    str = str5;
                } else {
                    str = "granted";
                }
                bundle2.putString("ad_storage", str);
                if (!Objects.equals(hashMap.get("AuthorizePurpose3"), "1") || !Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) {
                    str2 = str5;
                } else {
                    str2 = "granted";
                }
                bundle2.putString("ad_personalization", str2);
                if (c() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str5 = "granted";
                    }
                    bundle2.putString("ad_user_data", str5);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p79)) {
            return false;
        }
        return a().equalsIgnoreCase(((p79) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}

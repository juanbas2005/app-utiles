package defpackage;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: h39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h39 {
    public static final h39 c = new h39(100);
    public final EnumMap a;
    public final int b;

    public h39(int i) {
        EnumMap enumMap = new EnumMap(f39.class);
        this.a = enumMap;
        f39 f39 = f39.AD_STORAGE;
        c39 c39 = c39.UNINITIALIZED;
        enumMap.put(f39, c39);
        enumMap.put(f39.ANALYTICS_STORAGE, c39);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }

    public static h39 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new h39(i);
        }
        EnumMap enumMap = new EnumMap(f39.class);
        for (f39 f39 : d39.STORAGE.w) {
            enumMap.put(f39, d(bundle.getString(f39.w)));
        }
        return new h39(enumMap, i);
    }

    public static h39 c(int i, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(f39.class);
        f39[] f39Arr = d39.STORAGE.w;
        for (int i2 = 0; i2 < f39Arr.length; i2++) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            f39 f39 = f39Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(f39, e(str2.charAt(i3)));
            } else {
                enumMap.put(f39, c39.UNINITIALIZED);
            }
        }
        return new h39(enumMap, i);
    }

    public static c39 d(String str) {
        c39 c39 = c39.UNINITIALIZED;
        if (str == null) {
            return c39;
        }
        if (str.equals("granted")) {
            return c39.GRANTED;
        }
        if (str.equals("denied")) {
            return c39.DENIED;
        }
        return c39;
    }

    public static c39 e(char c2) {
        if (c2 == '+') {
            return c39.POLICY;
        }
        if (c2 == '0') {
            return c39.DENIED;
        }
        if (c2 != '1') {
            return c39.UNINITIALIZED;
        }
        return c39.GRANTED;
    }

    public static char h(c39 c39) {
        if (c39 == null) {
            return '-';
        }
        int ordinal = c39.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal == 2) {
            return '0';
        }
        if (ordinal != 3) {
            return '-';
        }
        return '1';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        if (i3 != i2 && i >= i2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h39) {
            h39 h39 = (h39) obj;
            f39[] f39Arr = d39.STORAGE.w;
            int length = f39Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    f39 f39 = f39Arr[i];
                    if (this.a.get(f39) != h39.a.get(f39)) {
                        break;
                    }
                    i++;
                } else if (this.b == h39.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (f39 f39 : d39.STORAGE.w) {
            c39 c39 = (c39) this.a.get(f39);
            char c2 = '-';
            if (!(c39 == null || (ordinal = c39.ordinal()) == 0)) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (f39 f39 : d39.STORAGE.w) {
            sb.append(h((c39) this.a.get(f39)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.b * 17;
        for (c39 hashCode : this.a.values()) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public final boolean i(f39 f39) {
        if (((c39) this.a.get(f39)) == c39.DENIED) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045 A[SYNTHETIC] */
    public final h39 j(h39 h39) {
        EnumMap enumMap = new EnumMap(f39.class);
        for (f39 f39 : d39.STORAGE.w) {
            c39 c39 = (c39) this.a.get(f39);
            c39 c392 = (c39) h39.a.get(f39);
            if (c39 != null) {
                if (c392 != null) {
                    c39 c393 = c39.UNINITIALIZED;
                    if (c39 != c393) {
                        if (c392 != c393) {
                            c39 c394 = c39.POLICY;
                            if (c39 != c394) {
                                if (c392 != c394) {
                                    c39 c395 = c39.DENIED;
                                    c39 = (c39 == c395 || c392 == c395) ? c395 : c39.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (c39 == null) {
                    enumMap.put(f39, c39);
                }
            }
            c39 = c392;
            if (c39 == null) {
            }
        }
        return new h39(enumMap, 100);
    }

    public final h39 k(h39 h39) {
        EnumMap enumMap = new EnumMap(f39.class);
        for (f39 f39 : d39.STORAGE.w) {
            c39 c39 = (c39) this.a.get(f39);
            if (c39 == c39.UNINITIALIZED) {
                c39 = (c39) h39.a.get(f39);
            }
            if (c39 != null) {
                enumMap.put(f39, c39);
            }
        }
        return new h39(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (f39 f39 : d39.STORAGE.w) {
            sb.append(",");
            sb.append(f39.w);
            sb.append("=");
            c39 c39 = (c39) this.a.get(f39);
            if (c39 == null) {
                c39 = c39.UNINITIALIZED;
            }
            sb.append(c39);
        }
        return sb.toString();
    }

    public h39(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(f39.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}

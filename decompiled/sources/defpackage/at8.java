package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: at8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class at8 {
    public static final s93 a;
    public static final i36 b;
    public static final i36 c;
    public static final i36 d;
    public static final i36 e;
    public static final i36 f;

    static {
        int i = s93.y;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        a = s93.s(15, objArr);
        m93 m93 = q93.x;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        p25.d(7, objArr2);
        b = q93.p(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        p25.d(3, objArr3);
        c = q93.p(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        p25.d(2, objArr4);
        d = q93.p(2, objArr4);
        ie1.z(4, "initialCapacity");
        Object[] objArr5 = new Object[4];
        String[] strArr = ar7.y0;
        p25.d(15, strArr);
        int i2 = 0 + 15;
        if (objArr5.length < i2) {
            objArr5 = Arrays.copyOf(objArr5, i93.d(objArr5.length, i2));
        }
        System.arraycopy(strArr, 0, objArr5, 0, 15);
        int i3 = 0 + 15;
        String[] strArr2 = ar7.z0;
        p25.d(15, strArr2);
        int i4 = i3 + 15;
        if (objArr5.length < i4) {
            objArr5 = Arrays.copyOf(objArr5, i93.d(objArr5.length, i4));
        }
        System.arraycopy(strArr2, 0, objArr5, i3, 15);
        e = q93.p(i3 + 15, objArr5);
        Object[] objArr6 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        p25.d(2, objArr6);
        f = q93.p(2, objArr6);
    }

    public static boolean a(String str) {
        if (!c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean b(String str, Bundle bundle) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            i36 i36 = d;
            int i = i36.z;
            int i2 = 0;
            while (i2 < i) {
                boolean containsKey = bundle.containsKey((String) i36.get(i2));
                i2++;
                if (containsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            i36 i36 = f;
            int i = i36.z;
            int i2 = 0;
            while (i2 < i) {
                boolean matches = str2.matches((String) i36.get(i2));
                i2++;
                if (matches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            i36 i36 = d;
            int i = i36.z;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    boolean containsKey = bundle.containsKey((String) i36.get(i2));
                    i2++;
                    if (containsKey) {
                        break;
                    }
                } else {
                    int hashCode = str.hashCode();
                    if (hashCode != 101200) {
                        if (hashCode != 101230) {
                            if (hashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

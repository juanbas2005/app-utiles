package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: pz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pz8 extends y29 {
    public String A;
    public final mz8 B = new mz8(this, 6, false, false);
    public final mz8 C = new mz8(this, 6, true, false);
    public final mz8 D = new mz8(this, 6, false, true);
    public final mz8 E = new mz8(this, 5, false, false);
    public final mz8 F = new mz8(this, 5, true, false);
    public final mz8 G = new mz8(this, 5, false, true);
    public final mz8 H = new mz8(this, 4, false, false);
    public final mz8 I = new mz8(this, 3, false, false);
    public final mz8 J = new mz8(this, 2, false, false);
    public char y = 0;
    public long z = -1;

    public pz8(y19 y19) {
        super(y19);
    }

    public static nz8 k1(String str) {
        if (str == null) {
            return null;
        }
        return new nz8(str);
    }

    public static String n1(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String o1 = o1(obj, z2);
        String o12 = o1(obj2, z2);
        String o13 = o1(obj3, z2);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(o1)) {
            sb.append(str2);
            sb.append(o1);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(o12)) {
            sb.append(str2);
            sb.append(o12);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(o13)) {
            sb.append(str3);
            sb.append(o13);
        }
        return sb.toString();
    }

    public static String o1(Object obj, boolean z2) {
        String str;
        String str2;
        String className;
        String str3;
        int lastIndexOf;
        int lastIndexOf2;
        String str4 = "";
        if (obj == null) {
            return str4;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z2) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str4 = "-";
            }
            StringBuilder sb = new StringBuilder(str4.length() + str4.length() + length + 3 + String.valueOf(round2).length());
            sb.append(str4);
            sb.append(round);
            sb.append("...");
            sb.append(str4);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z2) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String canonicalName = y19.class.getCanonicalName();
                if (!TextUtils.isEmpty(canonicalName) && (lastIndexOf2 = canonicalName.lastIndexOf(46)) != -1) {
                    str2 = canonicalName.substring(0, lastIndexOf2);
                } else {
                    str2 = str4;
                }
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length2 = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                        if (!TextUtils.isEmpty(className) && (lastIndexOf = className.lastIndexOf(46)) != -1) {
                            str3 = className.substring(0, lastIndexOf);
                        } else {
                            str3 = str4;
                        }
                        if (str3.equals(str2)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof nz8) {
                return ((nz8) obj).a;
            } else {
                if (z2) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    public final boolean d1() {
        return false;
    }

    public final mz8 g1() {
        return this.B;
    }

    public final mz8 h1() {
        return this.E;
    }

    public final mz8 i1() {
        return this.I;
    }

    public final mz8 j1() {
        return this.J;
    }

    public final void l1(int i, boolean z2, boolean z3, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && Log.isLoggable(m1(), i)) {
            Log.println(i, m1(), n1(false, str, obj, obj2, obj3));
        }
        if (!z3 && i >= 5) {
            z65.k(str);
            r19 r19 = ((y19) this.w).C;
            if (r19 == null) {
                Log.println(6, m1(), "Scheduler not set. Not logging error/warn");
            } else if (!r19.x) {
                Log.println(6, m1(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                r19.l1(new kz8(this, i, str, obj, obj2, obj3));
            }
        }
    }

    public final String m1() {
        String str;
        synchronized (this) {
            try {
                if (this.A == null) {
                    ((y19) ((y19) this.w).z.w).getClass();
                    this.A = "FA";
                }
                z65.k(this.A);
                str = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

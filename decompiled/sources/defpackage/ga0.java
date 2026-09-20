package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: ga0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ga0 extends bv4 {
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga0(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case b85.b:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                i95.x(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                i95.x(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(z85.j(str, bundle));
            case 3:
                bundle.getClass();
                str.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                i95.x(str);
                throw null;
            default:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                return z85.o(str, bundle);
        }
    }

    public final String b() {
        switch (this.q) {
            case b85.b:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    public final Object c(String str) {
        int i;
        String str2;
        long j;
        boolean z = true;
        switch (this.q) {
            case b85.b:
                if (!str.equals("true")) {
                    if (str.equals("false")) {
                        z = false;
                    } else {
                        h.q("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (k57.u0(str, "0x", false)) {
                    String substring = str.substring(2);
                    rd3.i(16);
                    i = Integer.parseInt(substring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                if (k57.m0(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (k57.u0(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    rd3.i(16);
                    j = Long.parseLong(substring2, 16);
                } else {
                    j = Long.parseLong(str2);
                }
                return Long.valueOf(j);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case b85.b:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                return;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 != null) {
                    bundle.putString(str, str2);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
        }
    }

    public String f(Object obj) {
        switch (this.q) {
            case 4:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, (String) null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}

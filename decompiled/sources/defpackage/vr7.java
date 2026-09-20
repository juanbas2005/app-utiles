package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: vr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vr7 extends bv4 {
    public static final vr7 r = new vr7(false, 0);
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr7(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case b85.b:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                i95.x(str);
                throw null;
            case 2:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d);
                }
                i95.x(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d2);
                }
                i95.x(str);
                throw null;
            case 4:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                i95.x(str);
                throw null;
            case 5:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                return Integer.valueOf(z85.j(str, bundle));
            case 6:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                i95.x(str);
                throw null;
            default:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return "null";
                }
                return z85.o(str, bundle);
        }
    }

    public final String b() {
        switch (this.q) {
            case b85.b:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    public final Object c(String str) {
        switch (this.q) {
            case b85.b:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) bv4.k.c(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) bv4.b.c(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) bv4.e.c(str);
            default:
                return str;
        }
    }

    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case b85.b:
                str.getClass();
                ((String) obj).getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bv4.k.e(bundle, str, bool);
                    return;
                }
            case 2:
                Double d = (Double) obj;
                str.getClass();
                if (d == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bundle.putDouble(str, d.doubleValue());
                    return;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                return;
            case 4:
                Float f = (Float) obj;
                str.getClass();
                if (f == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bv4.h.e(bundle, str, f);
                    return;
                }
            case 5:
                Integer num = (Integer) obj;
                str.getClass();
                if (num == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bv4.b.e(bundle, str, num);
                    return;
                }
            case 6:
                Long l = (Long) obj;
                str.getClass();
                if (l == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bv4.e.e(bundle, str, l);
                    return;
                }
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                return;
        }
    }

    public String f(Object obj) {
        switch (this.q) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String encode = Uri.encode(str, (String) null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}

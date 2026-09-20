package defpackage;

/* renamed from: xk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xk3 {
    public final a96 a;
    public final jz0 b = new jz0(21, new vk3(this), new wk3(this));

    public xk3(a96 a96) {
        this.a = a96;
    }

    public static q97 a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1785066193) {
            if (hashCode != 2402104) {
                if (hashCode == 2012838315 && str.equals("DELETE")) {
                    return q97.y;
                }
            } else if (str.equals("NONE")) {
                return q97.w;
            }
        } else if (str.equals("UPSERT")) {
            return q97.x;
        }
        h.q("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    public static final String b(xk3 xk3, q97 q97) {
        int ordinal = q97.ordinal();
        if (ordinal == 0) {
            return "NONE";
        }
        if (ordinal == 1) {
            return "UPSERT";
        }
        if (ordinal == 2) {
            return "DELETE";
        }
        h.c();
        return null;
    }
}

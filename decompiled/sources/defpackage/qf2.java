package defpackage;

/* renamed from: qf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qf2 implements pf2 {
    public final String a;
    public final int b;

    public qf2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b != 0) {
            String trim = d().trim();
            if (xz0.e.matcher(trim).matches()) {
                return true;
            }
            if (!xz0.f.matcher(trim).matches()) {
                h.q(f21.h("[Value: ", trim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(f21.h("[Value: ", trim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(f21.h("[Value: ", trim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        if (this.b == 0) {
            return "";
        }
        return this.a;
    }
}

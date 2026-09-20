package defpackage;

/* renamed from: q41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q41 {
    public final ac0 a;
    public final kk0 b;

    public q41(ac0 ac0, kk0 kk0) {
        this.a = ac0;
        this.b = kk0;
    }

    public final String toString() {
        String str;
        String str2;
        kk0 kk0 = this.b;
        k81 k81 = (k81) kk0.A.a0(k81.y);
        if (k81 != null) {
            str = k81.x;
        } else {
            str = null;
        }
        int hashCode = hashCode();
        rd3.i(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        if (str != null) {
            str2 = f21.h("[", str, "](");
        } else {
            str2 = "(";
        }
        Object b2 = this.a.b();
        return "Request@" + num + str2 + "currentBounds()=" + b2 + ", continuation=" + kk0 + ")";
    }
}

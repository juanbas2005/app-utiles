package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* renamed from: yr1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yr1 extends vq1 implements u16 {
    public static final hz2 I = new hz2(26);
    public static final /* synthetic */ yr3[] J = {new gr5(yr1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final Object K = new Object();
    public final yq3 C;
    public final String D;
    public final String E;
    public final Object F;
    public final nz3 G;
    public final y16 H;

    public yr1(yq3 yq3, String str, String str2, cr5 cr5, Object obj, fq3 fq3) {
        super(fq3);
        this.C = yq3;
        this.D = str;
        this.E = str2;
        this.F = obj;
        this.G = rg3.y(i44.w, new jr1(this, 0));
        this.H = p25.u(cr5, new jr1(this, 1));
    }

    public final yq3 B() {
        return this.C;
    }

    public final Object G() {
        return this.F;
    }

    public final ds1 Q() {
        jr1 jr1;
        vw3 k = R().k();
        k.getClass();
        if (jb5.v(this)) {
            jr1 = null;
        } else {
            jr1 = new jr1(this, 2);
        }
        return new ds1(k, jr1, false);
    }

    public final Member S() {
        if (!R().K()) {
            return null;
        }
        gq0 gq0 = ta6.a;
        t49 b = ta6.b(R());
        if (b instanceof dp3) {
            dp3 dp3 = (dp3) b;
            vq4 vq4 = dp3.i;
            kp3 kp3 = dp3.h;
            if ((kp3.x & 16) == 16) {
                ip3 ip3 = kp3.C;
                int i = ip3.x;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.C.N(vq4.getString(ip3.y), vq4.getString(ip3.z));
            }
        }
        return t();
    }

    /* renamed from: T */
    public final cr5 R() {
        yr3 yr3 = J[0];
        Object b = this.H.b();
        b.getClass();
        return (cr5) b;
    }

    public abstract mr1 U();

    public final boolean equals(Object obj) {
        u16 c = g18.c(obj);
        if (c != null && sg3.e(this.C, c.B()) && sg3.e(this.D, c.getName()) && sg3.e(this.E, c.h()) && sg3.e(this.F, c.G())) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.D;
    }

    public final String h() {
        return this.E;
    }

    public final int hashCode() {
        return this.E.hashCode() + hl6.h(this.C.hashCode() * 31, 31, this.D);
    }

    public final boolean i() {
        return false;
    }

    public final dj0 n() {
        return U().n();
    }

    public final GenericDeclaration s() {
        return pd8.p(this.C, this.E);
    }

    public final Field t() {
        return (Field) this.G.getValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        d63.k(sb, this);
        if (this instanceof kr3) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        d63.m(sb, this);
        d63.l(this.D, sb);
        sb.append(": ");
        sb.append(d63.v(k(), false));
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yr1(yq3 yq3, String str, String str2, Object obj) {
        this(yq3, str, str2, (cr5) null, obj, fq3.j);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public yr1(yq3 yq3, cr5 cr5, fq3 fq3) {
        this(yq3, r3, ta6.b(cr5).s(), cr5, si0.w, fq3);
        yq3.getClass();
        cr5.getClass();
        fq3.getClass();
        String b = cr5.getName().b();
        b.getClass();
    }
}

package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.util.List;

/* renamed from: ll8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ll8 implements Cloneable {
    public final nl8 w;
    public nl8 x;

    public ll8(nl8 nl8) {
        this.w = nl8;
        if (!nl8.g()) {
            this.x = nl8.i();
        } else {
            h.q("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb2);
            }
        }
    }

    public final void b() {
        if (!this.x.g()) {
            nl8 i = this.w.i();
            tm8.c.a(i.getClass()).b(i, this.x);
            this.x = i;
        }
    }

    /* renamed from: c */
    public final ll8 clone() {
        ll8 ll8 = (ll8) this.w.s(5);
        boolean g = this.x.g();
        nl8 nl8 = this.x;
        if (g) {
            nl8.getClass();
            tm8.c.a(nl8.getClass()).f(nl8);
            nl8.h();
            nl8 = this.x;
        }
        ll8.x = nl8;
        return ll8;
    }

    public final nl8 d() {
        boolean g = this.x.g();
        nl8 nl8 = this.x;
        if (g) {
            nl8.getClass();
            tm8.c.a(nl8.getClass()).f(nl8);
            nl8.h();
            nl8 = this.x;
        }
        nl8.getClass();
        if (nl8.q(nl8, true)) {
            return nl8;
        }
        throw new zzafy();
    }

    public final void e(nl8 nl8) {
        nl8 nl82 = this.w;
        if (!nl82.equals(nl8)) {
            if (!this.x.g()) {
                nl8 i = nl82.i();
                tm8.c.a(i.getClass()).b(i, this.x);
                this.x = i;
            }
            nl8 nl83 = this.x;
            tm8.c.a(nl83.getClass()).b(nl83, nl8);
        }
    }

    public final void f(byte[] bArr, int i, gl8 gl8) {
        if (!this.x.g()) {
            nl8 i2 = this.w.i();
            tm8.c.a(i2.getClass()).b(i2, this.x);
            this.x = i2;
        }
        try {
            tm8.c.a(this.x.getClass()).i(this.x, bArr, 0, i, new mj2(gl8));
        } catch (zzaeh e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (IOException e2) {
            ku4.o("Reading from byte array should not throw IOException.", e2);
        }
    }
}

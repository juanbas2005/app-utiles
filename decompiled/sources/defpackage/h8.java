package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* renamed from: h8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h8 {
    public final /* synthetic */ int w = 0;
    public boolean x;
    public Object y;

    public h8(String str, boolean z) {
        this.y = str;
        this.x = z;
    }

    public Integer a(h8 h8Var) {
        h8Var.getClass();
        ze4 ze4 = g78.a;
        if (this == h8Var) {
            return 0;
        }
        ze4 ze42 = g78.a;
        Integer num = (Integer) ze42.get(this);
        Integer num2 = (Integer) ze42.get(h8Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.y;
    }

    public abstract ti4 e();

    public abstract MenuInflater f();

    public abstract CharSequence h();

    public abstract CharSequence i();

    public abstract void j();

    public abstract boolean k();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z);

    public String toString() {
        switch (this.w) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h8() {
    }

    public h8 l() {
        return this;
    }
}

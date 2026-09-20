package defpackage;

import android.view.View;

/* renamed from: dv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv5 {
    public static final dv5 d = new dv5(0, 0, 0);
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public dv5(int i) {
        this.a = 11;
        this.b = 2;
        this.c = i;
    }

    public void a(lz5 lz5) {
        View view = lz5.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public r66 b() {
        return new r66((float) this.b, (float) this.c);
    }

    public String toString() {
        switch (this.a) {
            case b85.b:
                StringBuilder sb = new StringBuilder();
                sb.append(dv5.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return hl6.n(sb, this.c, "]");
            case 3:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.b);
                sb2.append(' ');
                return f21.j(sb2, this.c, '>');
            case 5:
                StringBuilder sb3 = new StringBuilder("MutableRange(start=");
                sb3.append(this.b);
                sb3.append(", end=");
                return f21.j(sb3, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dv5(int i, byte b2) {
        this.a = i;
    }

    public /* synthetic */ dv5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}

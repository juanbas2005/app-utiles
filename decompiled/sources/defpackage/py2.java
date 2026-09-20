package defpackage;

import android.os.Parcel;

/* renamed from: py2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class py2 implements y15, y36 {
    public static final py2 y = new py2("FOLD", 0);
    public static final py2 z = new py2("HINGE", 0);
    public final /* synthetic */ int w;
    public String x;

    public py2(String str) {
        this.w = 2;
        str.getClass();
        this.x = str;
    }

    public void accept(Object obj, Object obj2) {
        int i = b49.l;
        t39 t39 = new t39((xb7) obj2);
        d49 d49 = (d49) ((f49) obj).l();
        String str = this.x;
        Parcel I = d49.I();
        ds8.c(I, t39);
        I.writeString(str);
        I.writeString("");
        I.writeString((String) null);
        d49.J(I, 11);
    }

    public String c() {
        return hl6.o(new StringBuilder("expected '"), this.x, '\'');
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                return this.x;
            case 1:
                return this.x;
            case 4:
                return hl6.o(new StringBuilder("<"), this.x, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ py2(String str, int i) {
        this.w = i;
        this.x = str;
    }

    public /* synthetic */ py2() {
        this.w = 3;
    }
}

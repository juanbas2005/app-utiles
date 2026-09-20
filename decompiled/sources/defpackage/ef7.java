package defpackage;

/* renamed from: ef7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ef7 {
    public ey3 a;
    public tp1 b;
    public dl2 c;
    public tg7 d;
    public Object e;
    public final ed5 f = u55.p(Boolean.TRUE);
    public long g = 0;

    public ef7(ey3 ey3, tp1 tp1, dl2 dl2, tg7 tg7, Object obj) {
        this.a = ey3;
        this.b = tp1;
        this.c = dl2;
        this.d = tg7;
        this.e = obj;
    }

    public static void a(ef7 ef7, ey3 ey3, tp1 tp1, tg7 tg7, int i) {
        if ((i & 1) != 0) {
            ey3 = ef7.a;
        }
        if ((i & 2) != 0) {
            tp1 = ef7.b;
        }
        dl2 dl2 = ef7.c;
        if ((i & 8) != 0) {
            tg7 = ef7.d;
        }
        Object obj = ef7.e;
        ey3 ey32 = ef7.a;
        ed5 ed5 = ef7.f;
        if (ey3 != ey32 || !sg3.e(tp1, ef7.b) || !sg3.e(dl2, ef7.c) || !sg3.e(tg7, ef7.d)) {
            ef7.a = ey3;
            ef7.b = tp1;
            ef7.c = dl2;
            ef7.d = tg7;
            ed5.setValue(Boolean.TRUE);
        } else if (!sg3.e(obj, ef7.e)) {
            ef7.e = obj;
            ed5.setValue(Boolean.TRUE);
        }
    }
}

package defpackage;

/* renamed from: rc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum rc8 {
    INT32(r11, 0),
    BOOL(uc8.B, 0),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    ENUM(uc8.E, 0);
    
    public final uc8 w;
    public final int x;

    /* access modifiers changed from: public */
    rc8(uc8 uc8, int i) {
        this.w = uc8;
        this.x = i;
    }

    public boolean a() {
        return !(this instanceof fc8);
    }
}

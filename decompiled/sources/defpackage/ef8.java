package defpackage;

/* renamed from: ef8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum ef8 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    
    public final char w;
    public final char x;

    static {
        ef8[] ef8Arr;
        D = new w52(ef8Arr);
    }

    /* access modifiers changed from: public */
    ef8(char c, char c2) {
        this.w = c;
        this.x = c2;
    }
}

package defpackage;

/* renamed from: lb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lb8 implements kb8 {
    public final String b;
    public final ic3 c;
    public final ic3 d;

    public lb8(String str) {
        this.b = str;
        this.c = new ic3(str);
        this.d = new ic3(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}

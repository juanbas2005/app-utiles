package defpackage;

/* renamed from: fu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fu5 implements b28 {
    public boolean a = false;
    public boolean b = false;
    public kc2 c;
    public final eu5 d;

    public fu5(eu5 eu5) {
        this.d = eu5;
    }

    public final b28 b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.i(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final b28 c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}

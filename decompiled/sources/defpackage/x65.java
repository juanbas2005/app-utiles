package defpackage;

/* renamed from: x65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x65 extends z65 {
    public final Throwable c;

    public x65(Throwable th) {
        this.c = th;
    }

    public final String toString() {
        return "FAILURE (" + this.c.getMessage() + ")";
    }
}

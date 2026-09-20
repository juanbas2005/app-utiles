package defpackage;

/* renamed from: ej7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ej7 {
    public final int a;
    public final x83 b;

    public ej7(int i, x83 x83) {
        this.a = i;
        this.b = x83;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej7)) {
            return false;
        }
        ej7 ej7 = (ej7) obj;
        if (this.a == ej7.a && this.b.equals(ej7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ToggleOption(text=" + this.a + ", icon=" + this.b + ")";
    }
}

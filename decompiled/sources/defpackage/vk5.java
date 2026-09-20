package defpackage;

/* renamed from: vk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vk5 {
    public final int a;

    public /* synthetic */ vk5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vk5) && this.a == ((vk5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pb4.i(this.a, "PointerKeyboardModifiers(packedValue=", ")");
    }
}

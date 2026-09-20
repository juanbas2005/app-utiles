package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: il2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il2 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il2)) {
            return false;
        }
        il2 il2 = (il2) obj;
        if (!Objects.equals(this.a, il2.a) || !Objects.equals(this.b, il2.b) || !Objects.equals(this.c, il2.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

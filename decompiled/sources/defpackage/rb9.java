package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: rb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rb9 {
    public final i36 a;
    public final i36 b;
    public final UUID c;

    public rb9(i36 i36, i36 i362, UUID uuid) {
        this.a = i36;
        this.b = i362;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb9)) {
            return false;
        }
        rb9 rb9 = (rb9) obj;
        if (!this.a.equals(rb9.a) || !this.b.equals(rb9.b) || !this.c.equals(rb9.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}

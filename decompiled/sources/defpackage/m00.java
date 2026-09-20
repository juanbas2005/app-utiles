package defpackage;

import android.content.Context;

/* renamed from: m00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m00 extends eb1 {
    public final Context a;
    public final es0 b;
    public final es0 c;
    public final String d;

    public m00(Context context, es0 es0, es0 es02, String str) {
        if (context != null) {
            this.a = context;
            if (es0 != null) {
                this.b = es0;
                if (es02 != null) {
                    this.c = es02;
                    if (str != null) {
                        this.d = str;
                    } else {
                        ku4.j("Null backendName");
                        throw null;
                    }
                } else {
                    ku4.j("Null monotonicClock");
                    throw null;
                }
            } else {
                ku4.j("Null wallClock");
                throw null;
            }
        } else {
            ku4.j("Null applicationContext");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb1) {
            m00 m00 = (m00) ((eb1) obj);
            if (!this.a.equals(m00.a) || !this.b.equals(m00.b) || !this.c.equals(m00.c) || !this.d.equals(m00.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return f21.l(sb, this.d, "}");
    }
}

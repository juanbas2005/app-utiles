package defpackage;

import java.util.Map;

/* renamed from: l77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l77 {
    public final String a;
    public final o77 b;
    public final p77 c;
    public final t77 d;
    public final h81 e;
    public final Map f;
    public final m25 g;

    public l77(String str, o77 o77, p77 p77, t77 t77, h81 h81, Map map, m25 m25) {
        str.getClass();
        t77.getClass();
        h81.getClass();
        map.getClass();
        this.a = str;
        this.b = o77;
        this.c = p77;
        this.d = t77;
        this.e = h81;
        this.f = map;
        this.g = m25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l77)) {
            return false;
        }
        l77 l77 = (l77) obj;
        if (sg3.e(this.a, l77.a) && this.b.equals(l77.b) && this.c.equals(l77.c) && sg3.e(this.d, l77.d) && sg3.e(this.e, l77.e) && sg3.e(this.f, l77.f) && sg3.e(this.g, l77.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (((this.a.hashCode() * 31) - 252733482) * 31)) * 31)) * 31)) * 31)) * 961)) * 31;
        m25 m25 = this.g;
        if (m25 == null) {
            i = 0;
        } else {
            i = m25.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "SupabaseClientConfig(supabaseUrl=" + this.a + ", supabaseKey=sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9, loggingConfig=" + this.b + ", networkConfig=" + this.c + ", defaultSerializer=" + this.d + ", coroutineDispatcher=" + this.e + ", accessToken=null, plugins=" + this.f + ", osInformation=" + this.g + ')';
    }
}

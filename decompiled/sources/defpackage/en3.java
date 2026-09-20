package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonException;
import kotlinx.serialization.json.JsonObject;

/* renamed from: en3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class en3 extends a2 {
    public final JsonObject f;
    public final ll6 g;
    public int h;
    public boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public en3(pl3 pl3, JsonObject jsonObject, String str, ll6 ll6) {
        super(pl3, str);
        pl3.getClass();
        jsonObject.getClass();
        this.f = jsonObject;
        this.g = ll6;
    }

    public JsonElement F(String str) {
        str.getClass();
        return (JsonElement) sf4.U(str, T());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public String R(ll6 ll6, int i2) {
        Object obj;
        ll6.getClass();
        pl3 pl3 = this.c;
        rm3.d(pl3, ll6);
        String f2 = ll6.f(i2);
        if (this.e.i && !T().keySet().contains(f2)) {
            f96 f96 = pl3.c;
            qm3 qm3 = new qm3(0, (Object) ll6, (Object) pl3);
            f96.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f96.x;
            Map map = (Map) concurrentHashMap.get(ll6);
            String str = null;
            xb4 xb4 = rm3.a;
            if (map != null) {
                obj = map.get(xb4);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = qm3.b();
                Object obj2 = concurrentHashMap.get(ll6);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(ll6, obj2);
                }
                ((Map) obj2).put(xb4, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = T().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get(next);
                if (num != null && num.intValue() == i2) {
                    str = next;
                    break;
                }
            }
            String str2 = str;
            if (str2 != null) {
                return str2;
            }
        }
        return f2;
    }

    /* renamed from: Y */
    public JsonObject T() {
        return this.f;
    }

    public void b(ll6 ll6) {
        Set set;
        Object obj;
        Iterable iterable;
        ll6.getClass();
        pl3 pl3 = this.c;
        if (!rm3.c(pl3, ll6) && !(ll6.u() instanceof yk5)) {
            rm3.d(pl3, ll6);
            String str = null;
            if (!this.e.i) {
                set = uq3.k(ll6);
            } else {
                Set k = uq3.k(ll6);
                f96 f96 = pl3.c;
                f96.getClass();
                Map map = (Map) ((ConcurrentHashMap) f96.x).get(ll6);
                if (map != null) {
                    obj = map.get(rm3.a);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    iterable = map2.keySet();
                } else {
                    iterable = null;
                }
                if (iterable == null) {
                    iterable = g42.w;
                }
                set = wn6.o(k, iterable);
            }
            for (String next : T().keySet()) {
                if (!set.contains(next) && !sg3.e(next, this.d)) {
                    String h2 = pb4.h('\'', "Encountered an unknown key '", next);
                    String V = V();
                    if (pl3.a.k) {
                        str = ar7.J(-1, T().toString()).toString();
                    }
                    throw new JsonException(ar7.t(-1, h2, V, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", str));
                }
            }
        }
    }

    public final gy0 c(ll6 ll6) {
        String str;
        ll6.getClass();
        ll6 ll62 = this.g;
        if (ll6 != ll62) {
            return super.c(ll6);
        }
        JsonElement G = G();
        String a = ll62.a();
        boolean z = G instanceof JsonObject;
        pl3 pl3 = this.c;
        if (z) {
            return new en3(pl3, (JsonObject) G, this.d, ll62);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        c26 c26 = b26.a;
        sb.append(c26.b(JsonObject.class).A());
        sb.append(", but had ");
        sb.append(c26.b(G.getClass()).A());
        String l = f21.l(sb, " as the serialized body of ", a);
        String V = V();
        if (pl3.a.k) {
            str = ar7.J(-1, G.toString()).toString();
        } else {
            str = null;
        }
        throw new JsonException(ar7.t(-1, l, V, (String) null, str));
    }

    public int h(ll6 ll6) {
        ll6.getClass();
        while (this.h < ll6.e()) {
            int i2 = this.h;
            this.h = i2 + 1;
            String S = S(ll6, i2);
            boolean z = true;
            int i3 = this.h - 1;
            this.i = false;
            if (!T().containsKey(S)) {
                if (this.c.a.e || ll6.i(i3) || !ll6.h(i3).c()) {
                    z = false;
                }
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i3;
        }
        return -1;
    }

    public final boolean w() {
        if (this.i || !super.w()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en3(pl3 pl3, JsonObject jsonObject, String str, int i2) {
        this(pl3, jsonObject, (i2 & 4) != 0 ? null : str, (ll6) null);
    }
}

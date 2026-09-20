package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kn3 implements r25, b28 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final q25 e;
    public final boolean f;

    public kn3(Writer writer, HashMap hashMap, HashMap hashMap2, xl3 xl3, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = xl3;
        this.f = z;
    }

    public final r25 a(kc2 kc2, Object obj) {
        i(kc2.a, obj);
        return this;
    }

    public final b28 b(String str) {
        j();
        this.b.value(str);
        return this;
    }

    public final b28 c(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    public final r25 d(kc2 kc2, boolean z) {
        String str = kc2.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    public final r25 e(kc2 kc2, int i) {
        String str = kc2.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value((long) i);
        return this;
    }

    public final r25 f(kc2 kc2, double d2) {
        String str = kc2.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d2);
        return this;
    }

    public final r25 g(kc2 kc2, long j) {
        String str = kc2.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final kn3 h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    h(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    h(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object h : (Collection) obj) {
                h(h);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            q25 q25 = (q25) this.c.get(obj.getClass());
            if (q25 != null) {
                jsonWriter.beginObject();
                q25.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            a28 a28 = (a28) this.d.get(obj.getClass());
            if (a28 != null) {
                a28.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            } else if (obj instanceof a25) {
                int a2 = ((a25) obj).a();
                j();
                jsonWriter.value((long) a2);
                return this;
            } else {
                String name = ((Enum) obj).name();
                j();
                jsonWriter.value(name);
                return this;
            }
        }
    }

    public final kn3 i(String str, Object obj) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (!z) {
            j();
            jsonWriter.name(str);
            if (obj == null) {
                jsonWriter.nullValue();
                return this;
            }
            h(obj);
            return this;
        } else if (obj == null) {
            return this;
        } else {
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
    }

    public final void j() {
        if (!this.a) {
            h.s("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}

package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: sz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz0 {
    public static final Date h = new Date(0);
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;

    public sz0(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }

    public static sz0 a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new sz0(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rz0, java.lang.Object] */
    public static rz0 d() {
        ? obj = new Object();
        obj.a = new JSONObject();
        obj.b = h;
        obj.c = new JSONArray();
        obj.d = new JSONObject();
        obj.e = 0;
        obj.f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.d;
            if (i >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    hashMap.put(jSONArray2.getString(i2), jSONObject);
                }
            }
            i++;
        }
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        return this.a.toString().equals(((sz0) obj).a.toString());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

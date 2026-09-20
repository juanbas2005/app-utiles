package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: s18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s18 extends a3 {
    public static final Parcelable.Creator<s18> CREATOR = new ki8(14);
    public final List w;

    public s18(ArrayList arrayList) {
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s18)) {
            return false;
        }
        List list = ((s18) obj).w;
        List list2 = this.w;
        if (list2 == null && list == null) {
            return true;
        }
        if (list2 == null || list == null || !list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final JSONArray f() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.w;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    t18 t18 = (t18) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(t18.y);
                    jSONArray2.put(t18.x);
                    jSONArray2.put(t18.y);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            ku4.o("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final int hashCode() {
        HashSet hashSet;
        List list = this.w;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.I(parcel, 1, this.w);
        h75.O(parcel, M);
    }
}

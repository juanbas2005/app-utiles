package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fw extends a3 {
    public static final Parcelable.Creator<fw> CREATOR = new ki8(19);
    public final String A;
    public final s18 w;
    public final ax8 x;
    public final gw y;
    public final b09 z;

    public fw(s18 s18, ax8 ax8, gw gwVar, b09 b09, String str) {
        this.w = s18;
        this.x = ax8;
        this.y = gwVar;
        this.z = b09;
        this.A = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fw)) {
            return false;
        }
        fw fwVar = (fw) obj;
        if (!b35.j(this.w, fwVar.w) || !b35.j(this.x, fwVar.x) || !b35.j(this.y, fwVar.y) || !b35.j(this.z, fwVar.z) || !b35.j(this.A, fwVar.A)) {
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        try {
            JSONObject jSONObject = new JSONObject();
            gw gwVar = this.y;
            if (gwVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rk", gwVar.w);
                jSONObject.put("credProps", jSONObject2);
            }
            s18 s18 = this.w;
            if (s18 != null) {
                jSONObject.put("uvm", s18.f());
            }
            b09 b09 = this.z;
            if (b09 != null) {
                jSONObject.put("prf", b09.f());
            }
            String str = this.A;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
        } catch (JSONException e2) {
            ku4.o("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.y, this.z, this.A});
    }

    public final String toString() {
        return f21.h("AuthenticationExtensionsClientOutputs{", f().toString(), "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.E(parcel, 2, this.x, i);
        h75.E(parcel, 3, this.y, i);
        h75.E(parcel, 4, this.z, i);
        h75.F(parcel, 5, this.A);
        h75.O(parcel, M);
    }
}

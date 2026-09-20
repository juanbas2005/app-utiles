package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b09 extends a3 {
    public static final Parcelable.Creator<b09> CREATOR = new ki8(26);
    public final boolean w;
    public final qz8 x;

    public b09(boolean z, qz8 qz8) {
        this.w = z;
        this.x = qz8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b09)) {
            return false;
        }
        b09 b09 = (b09) obj;
        if (this.w != b09.w || !b35.j(this.x, b09.x)) {
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        byte[] bArr;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.w) {
                jSONObject.put("enabled", true);
            }
            qz8 qz8 = this.x;
            if (qz8 == null) {
                bArr = null;
            } else {
                bArr = qz8.s();
            }
            if (bArr != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArr, 32), 11));
                if (bArr.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            ku4.o("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.w), this.x});
    }

    public final String toString() {
        return f21.h("AuthenticationExtensionsPrfOutputs{", f().toString(), "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        qz8 qz8 = this.x;
        if (qz8 == null) {
            bArr = null;
        } else {
            bArr = qz8.s();
        }
        h75.A(parcel, 2, bArr);
        h75.O(parcel, M);
    }
}

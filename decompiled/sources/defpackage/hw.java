package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw extends lw {
    public static final Parcelable.Creator<hw> CREATOR = new ki8(27);
    public final qz8 A;
    public final qz8 w;
    public final qz8 x;
    public final qz8 y;
    public final qz8 z;

    public hw(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        qz8 qz8;
        z65.k(bArr);
        qz8 p = qz8.p(bArr.length, bArr);
        z65.k(bArr2);
        qz8 p2 = qz8.p(bArr2.length, bArr2);
        z65.k(bArr3);
        qz8 p3 = qz8.p(bArr3.length, bArr3);
        z65.k(bArr4);
        qz8 p4 = qz8.p(bArr4.length, bArr4);
        if (bArr5 == null) {
            qz8 = null;
        } else {
            qz8 = qz8.p(bArr5.length, bArr5);
        }
        this.w = p;
        this.x = p2;
        this.y = p3;
        this.z = p4;
        this.A = qz8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        if (!b35.j(this.w, hwVar.w) || !b35.j(this.x, hwVar.x) || !b35.j(this.y, hwVar.y) || !b35.j(this.z, hwVar.z) || !b35.j(this.A, hwVar.A)) {
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        byte[] bArr;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", pv8.B(this.x.s()));
            jSONObject.put("authenticatorData", pv8.B(this.y.s()));
            jSONObject.put("signature", pv8.B(this.z.s()));
            qz8 qz8 = this.A;
            if (qz8 == null) {
                return jSONObject;
            }
            if (qz8 == null) {
                bArr = null;
            } else {
                bArr = qz8.s();
            }
            jSONObject.put("userHandle", pv8.B(bArr));
            return jSONObject;
        } catch (JSONException e) {
            ku4.o("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.w})), Integer.valueOf(Arrays.hashCode(new Object[]{this.x})), Integer.valueOf(Arrays.hashCode(new Object[]{this.y})), Integer.valueOf(Arrays.hashCode(new Object[]{this.z})), Integer.valueOf(Arrays.hashCode(new Object[]{this.A}))});
    }

    public final String toString() {
        byte[] bArr;
        fm8 fm8 = new fm8(getClass().getSimpleName());
        my8 my8 = py8.d;
        byte[] s = this.w.s();
        fm8.f("keyHandle", my8.c(s.length, s));
        byte[] s2 = this.x.s();
        fm8.f("clientDataJSON", my8.c(s2.length, s2));
        byte[] s3 = this.y.s();
        fm8.f("authenticatorData", my8.c(s3.length, s3));
        byte[] s4 = this.z.s();
        fm8.f("signature", my8.c(s4.length, s4));
        qz8 qz8 = this.A;
        if (qz8 == null) {
            bArr = null;
        } else {
            bArr = qz8.s();
        }
        if (bArr != null) {
            fm8.f("userHandle", my8.c(bArr.length, bArr));
        }
        return fm8.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int M = h75.M(parcel, 20293);
        h75.A(parcel, 2, this.w.s());
        h75.A(parcel, 3, this.x.s());
        h75.A(parcel, 4, this.y.s());
        h75.A(parcel, 5, this.z.s());
        qz8 qz8 = this.A;
        if (qz8 == null) {
            bArr = null;
        } else {
            bArr = qz8.s();
        }
        h75.A(parcel, 6, bArr);
        h75.O(parcel, M);
    }
}

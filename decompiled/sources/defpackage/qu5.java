package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qu5 extends a3 {
    public static final Parcelable.Creator<qu5> CREATOR = new ki8(10);
    public final hw A;
    public final kw B;
    public final fw C;
    public final String D;
    public final String w;
    public final String x;
    public final qz8 y;
    public final jw z;

    public qu5(String str, String str2, byte[] bArr, jw jwVar, hw hwVar, kw kwVar, fw fwVar, String str3) {
        qz8 qz8;
        boolean z2;
        if (bArr == null) {
            qz8 = null;
        } else {
            qz8 = qz8.p(bArr.length, bArr);
        }
        boolean z3 = false;
        if ((jwVar != null && hwVar == null && kwVar == null) || ((jwVar == null && hwVar != null && kwVar == null) || (jwVar == null && hwVar == null && kwVar != null))) {
            z2 = true;
        } else {
            z2 = false;
        }
        z65.e("Must provide a response object.", z2);
        if (!(kwVar == null && (str == null || qz8 == null))) {
            z3 = true;
        }
        z65.e("Must provide id and rawId if not an error response.", z3);
        this.w = str;
        this.x = str2;
        this.y = qz8;
        this.z = jwVar;
        this.A = hwVar;
        this.B = kwVar;
        this.C = fwVar;
        this.D = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu5)) {
            return false;
        }
        qu5 qu5 = (qu5) obj;
        if (!b35.j(this.w, qu5.w) || !b35.j(this.x, qu5.x) || !b35.j(this.y, qu5.y) || !b35.j(this.z, qu5.z) || !b35.j(this.A, qu5.A) || !b35.j(this.B, qu5.B) || !b35.j(this.C, qu5.C) || !b35.j(this.D, qu5.D)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.y, this.A, this.z, this.B, this.C, this.D});
    }

    public final String toString() {
        byte[] bArr;
        qz8 qz8 = this.y;
        if (qz8 == null) {
            bArr = null;
        } else {
            bArr = qz8.s();
        }
        String B2 = pv8.B(bArr);
        String valueOf = String.valueOf(this.z);
        String valueOf2 = String.valueOf(this.A);
        String valueOf3 = String.valueOf(this.B);
        String valueOf4 = String.valueOf(this.C);
        StringBuilder o = f21.o("PublicKeyCredential{\n id='", this.w, "', \n type='", this.x, "', \n rawId=");
        f21.v(o, B2, ", \n registerResponse=", valueOf, ", \n signResponse=");
        f21.v(o, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return pb4.n(o, valueOf4, ", \n authenticatorAttachment='", this.D, "'}");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [bn8, java.lang.Exception] */
    public final void writeToParcel(Parcel parcel, int i) {
        z19 z19 = (z19) v19.b.a.w;
        z19.a.getClass();
        if (sg3.l == null) {
            sg3.l = new Exception();
        }
        synchronized (sg3.k) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}

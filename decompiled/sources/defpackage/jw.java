package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jw extends lw {
    public static final Parcelable.Creator<jw> CREATOR = new g39(7);
    public final qz8 w;
    public final qz8 x;
    public final qz8 y;
    public final String[] z;

    public jw(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        z65.k(bArr);
        qz8 p = qz8.p(bArr.length, bArr);
        z65.k(bArr2);
        qz8 p2 = qz8.p(bArr2.length, bArr2);
        z65.k(bArr3);
        qz8 p3 = qz8.p(bArr3.length, bArr3);
        this.w = p;
        this.x = p2;
        this.y = p3;
        z65.k(strArr);
        this.z = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        if (!b35.j(this.w, jwVar.w) || !b35.j(this.x, jwVar.x) || !b35.j(this.y, jwVar.y)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x024c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021c A[Catch:{ JSONException -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024a A[ExcHandler: zzhj | zzho (e java.lang.Throwable), Splitter:B:117:0x0246] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0253 A[ExcHandler: zzho (e com.google.android.gms.internal.fido.zzho), Splitter:B:33:0x00c3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x0232=Splitter:B:110:0x0232, B:145:0x0283=Splitter:B:145:0x0283, B:125:0x0255=Splitter:B:125:0x0255, B:135:0x026c=Splitter:B:135:0x026c} */
    public final JSONObject f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        qz8 qz8;
        JSONObject jSONObject5;
        byte[] bArr;
        Class<y09> cls = y09.class;
        Class<w09> cls2 = w09.class;
        Class<s09> cls3 = s09.class;
        String[] strArr = this.z;
        try {
            JSONObject jSONObject6 = new JSONObject();
            qz8 qz82 = this.x;
            if (qz82 != null) {
                jSONObject6.put("clientDataJSON", pv8.B(qz82.s()));
            }
            qz8 qz83 = this.y;
            if (qz83 != null) {
                jSONObject6.put("attestationObject", pv8.B(qz83.s()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            jSONObject6.put("transports", jSONArray);
            try {
                try {
                    d19 d19 = (d19) ((y09) d19.e(qz83.s()).c(cls)).x.get(new z09("authData"));
                    if (d19 != null) {
                        qz8 qz84 = ((s09) d19.c(cls3)).w;
                        byte[] bArr2 = qz84.x;
                        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, qz84.k()).asReadOnlyBuffer();
                        try {
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                            if ((asReadOnlyBuffer.get() & 64) != 0) {
                                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                                try {
                                    int position = asReadOnlyBuffer.position();
                                    int o = qz8.o(position, bArr2.length, qz84.k());
                                    if (o == 0) {
                                        qz8 = qz8.y;
                                    } else {
                                        qz8 = new lz8(bArr2, position, o);
                                    }
                                    i19 i19 = new i19(qz8.n());
                                    try {
                                        d19 y2 = fb5.y(i19);
                                        i19.close();
                                        ut8 ut8 = ((y09) y2.c(cls)).x;
                                        d19 d192 = (d19) ut8.get(new w09(3));
                                        d19 d193 = (d19) ut8.get(new w09(1));
                                        if (d192 != null || d193 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        try {
                                            long j = ((w09) d192.c(cls2)).w;
                                            long j2 = ((w09) d193.c(cls2)).w;
                                            if (j2 != 1) {
                                                if (j2 == 2) {
                                                    j2 = 2;
                                                } else {
                                                    jSONObject5 = jSONObject6;
                                                    bArr = null;
                                                    jSONObject = null;
                                                    try {
                                                        JSONObject jSONObject7 = jSONObject5;
                                                        jSONObject7.put("authenticatorData", pv8.B(qz84.s()));
                                                        jSONObject7.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                            jSONObject7.put("publicKey", Base64.encodeToString(bArr, 11));
                                                        }
                                                        return jSONObject7;
                                                    } catch (JSONException e) {
                                                        e = e;
                                                        ku4.o("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                                                        return jSONObject;
                                                    }
                                                }
                                            }
                                            jSONObject5 = jSONObject6;
                                            jSONObject = null;
                                            try {
                                                d19 d194 = (d19) ut8.get(new w09(-1));
                                                if (d194 != null) {
                                                    long j3 = ((w09) d194.c(cls2)).w;
                                                    String str = "COSE key missing required fields";
                                                    if (j2 == 2 && j3 == 1) {
                                                        d19 d195 = (d19) ut8.get(new w09(-2));
                                                        d19 d196 = (d19) ut8.get(new w09(-3));
                                                        if (d195 == null || d196 == null) {
                                                            throw new IllegalArgumentException(str);
                                                        }
                                                        qz8 qz85 = ((s09) d195.c(cls3)).w;
                                                        qz8 qz86 = ((s09) d196.c(cls3)).w;
                                                        if (qz85.x.length == 32 && qz86.x.length == 32) {
                                                            bArr = aa5.n(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), qz85.s(), qz86.s());
                                                            JSONObject jSONObject72 = jSONObject5;
                                                            jSONObject72.put("authenticatorData", pv8.B(qz84.s()));
                                                            jSONObject72.put("publicKeyAlgorithm", j);
                                                            if (bArr != null) {
                                                            }
                                                            return jSONObject72;
                                                        }
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    } else if (j2 == 1 && j3 == 6) {
                                                        d19 d197 = (d19) ut8.get(new w09(-2));
                                                        if (d197 != null) {
                                                            qz8 qz87 = ((s09) d197.c(cls3)).w;
                                                            if (qz87.x.length == 32) {
                                                                bArr = aa5.n(Base64.decode("MCowBQYDK2VwAyEA", 0), qz87.s());
                                                                JSONObject jSONObject722 = jSONObject5;
                                                                jSONObject722.put("authenticatorData", pv8.B(qz84.s()));
                                                                jSONObject722.put("publicKeyAlgorithm", j);
                                                                if (bArr != null) {
                                                                }
                                                                return jSONObject722;
                                                            }
                                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                        }
                                                        throw new IllegalArgumentException(str);
                                                    } else {
                                                        bArr = null;
                                                        JSONObject jSONObject7222 = jSONObject5;
                                                        jSONObject7222.put("authenticatorData", pv8.B(qz84.s()));
                                                        jSONObject7222.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                        }
                                                        return jSONObject7222;
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                            } catch (zzho e2) {
                                                e = e2;
                                                throw new IllegalArgumentException("COSE key ill-formed", e);
                                            }
                                        } catch (zzho e3) {
                                            e = e3;
                                            jSONObject = null;
                                            throw new IllegalArgumentException("COSE key ill-formed", e);
                                        }
                                    } catch (zzhj | zzho e4) {
                                    } catch (Throwable th) {
                                        jSONObject4 = null;
                                        try {
                                            i19.close();
                                        } catch (IOException ) {
                                            throw th;
                                        } catch (zzhj | zzho e42) {
                                        }
                                        throw th;
                                    }
                                } catch (zzho e5) {
                                } catch (zzhj e6) {
                                    e = e6;
                                    jSONObject4 = null;
                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                }
                            } else {
                                jSONObject3 = null;
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                    throw new IllegalArgumentException("ill-formed authenticator data", e);
                                }
                            }
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            jSONObject3 = null;
                            throw new IllegalArgumentException("ill-formed authenticator data", e);
                        }
                    } else {
                        jSONObject2 = null;
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (zzho e9) {
                            e = e9;
                            throw new IllegalArgumentException("authData value has wrong type", e);
                        }
                    }
                } catch (zzho e10) {
                    e = e10;
                    jSONObject2 = null;
                    throw new IllegalArgumentException("authData value has wrong type", e);
                }
            } catch (zzho e11) {
                e = e11;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzhj e12) {
                e = e12;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e13) {
            e = e13;
            jSONObject = null;
            ku4.o("Error encoding AuthenticatorAttestationResponse to JSON object", e);
            return jSONObject;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.w})), Integer.valueOf(Arrays.hashCode(new Object[]{this.x})), Integer.valueOf(Arrays.hashCode(new Object[]{this.y}))});
    }

    public final String toString() {
        fm8 fm8 = new fm8(getClass().getSimpleName());
        my8 my8 = py8.d;
        byte[] s = this.w.s();
        fm8.f("keyHandle", my8.c(s.length, s));
        byte[] s2 = this.x.s();
        fm8.f("clientDataJSON", my8.c(s2.length, s2));
        byte[] s3 = this.y.s();
        fm8.f("attestationObject", my8.c(s3.length, s3));
        fm8.f("transports", Arrays.toString(this.z));
        return fm8.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.A(parcel, 2, this.w.s());
        h75.A(parcel, 3, this.x.s());
        h75.A(parcel, 4, this.y.s());
        String[] strArr = this.z;
        if (strArr != null) {
            int M2 = h75.M(parcel, 5);
            parcel.writeStringArray(strArr);
            h75.O(parcel, M2);
        }
        h75.O(parcel, M);
    }
}

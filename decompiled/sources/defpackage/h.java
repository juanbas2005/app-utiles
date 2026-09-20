package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.abt.component.AbtRegistrar;
import java.util.List;

/* renamed from: h  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h implements xv0, mk0, ex1, ua1 {
    public final /* synthetic */ int w;

    public /* synthetic */ h(int i) {
        this.w = i;
    }

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    public static void e(int i) {
        throw new IllegalArgumentException(hl6.k(i, "An unknown field for index "));
    }

    public static /* synthetic */ void f(int i, int i2) {
        throw new IllegalArgumentException("Callable expects " + i + " arguments, but " + i2 + " were provided.");
    }

    public static /* synthetic */ void g(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void h(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void i(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void j(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void l(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new Error(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new Error(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void s(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [f00, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public Object a(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.w) {
            case 25:
                JsonReader jsonReader2 = jsonReader;
                jsonReader2.beginObject();
                String str = null;
                String str2 = null;
                String str3 = null;
                while (jsonReader2.hasNext()) {
                    String nextName = jsonReader2.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                z = false;
                                break;
                            }
                        case 3002454:
                            if (nextName.equals("arch")) {
                                z = true;
                                break;
                            }
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                z = true;
                                break;
                            }
                        default:
                            z = true;
                            break;
                    }
                    switch (z) {
                        case b85.b:
                            str2 = jsonReader2.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                ku4.j("Null libraryName");
                                return null;
                            }
                        case true:
                            str = jsonReader2.nextString();
                            if (str != null) {
                                break;
                            } else {
                                ku4.j("Null arch");
                                return null;
                            }
                        case true:
                            str3 = jsonReader2.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                ku4.j("Null buildId");
                                return null;
                            }
                        default:
                            jsonReader2.skipValue();
                            break;
                    }
                }
                jsonReader2.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new gz(str, str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" arch");
                }
                if (str2 == null) {
                    sb.append(" libraryName");
                }
                if (str3 == null) {
                    sb.append(" buildId");
                }
                s(f21.i("Missing required properties:", sb));
                return null;
            case 26:
                JsonReader jsonReader3 = jsonReader;
                jsonReader3.beginObject();
                String str4 = null;
                byte[] bArr = null;
                while (jsonReader3.hasNext()) {
                    String nextName2 = jsonReader3.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        str4 = jsonReader3.nextString();
                        if (str4 == null) {
                            ku4.j("Null filename");
                            return null;
                        }
                    } else if (!nextName2.equals("contents")) {
                        jsonReader3.skipValue();
                    } else {
                        bArr = Base64.decode(jsonReader3.nextString(), 2);
                        if (bArr == null) {
                            ku4.j("Null contents");
                            return null;
                        }
                    }
                }
                jsonReader3.endObject();
                if (str4 != null && bArr != null) {
                    return new jz(str4, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str4 == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                s(f21.i("Missing required properties:", sb2));
                return null;
            case 27:
                JsonReader jsonReader4 = jsonReader;
                ? obj = new Object();
                jsonReader4.beginObject();
                while (jsonReader4.hasNext()) {
                    String nextName3 = jsonReader4.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                z2 = false;
                                break;
                            }
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                z2 = true;
                                break;
                            }
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                z2 = true;
                                break;
                            }
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                z2 = true;
                                break;
                            }
                        default:
                            z2 = true;
                            break;
                    }
                    switch (z2) {
                        case b85.b:
                            String nextString = jsonReader4.nextString();
                            if (nextString != null) {
                                obj.b = nextString;
                                break;
                            } else {
                                ku4.j("Null parameterKey");
                                return null;
                            }
                        case true:
                            obj.d = jsonReader4.nextLong();
                            obj.e = (byte) (obj.e | 1);
                            break;
                        case true:
                            jsonReader4.beginObject();
                            String str5 = null;
                            String str6 = null;
                            while (jsonReader4.hasNext()) {
                                String nextName4 = jsonReader4.nextName();
                                nextName4.getClass();
                                if (nextName4.equals("variantId")) {
                                    str6 = jsonReader4.nextString();
                                    if (str6 == null) {
                                        ku4.j("Null variantId");
                                        return null;
                                    }
                                } else if (!nextName4.equals("rolloutId")) {
                                    jsonReader4.skipValue();
                                } else {
                                    str5 = jsonReader4.nextString();
                                    if (str5 == null) {
                                        ku4.j("Null rolloutId");
                                        return null;
                                    }
                                }
                            }
                            jsonReader4.endObject();
                            if (str5 != null && str6 != null) {
                                obj.a = new h00(str5, str6);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str5 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (str6 == null) {
                                    sb3.append(" variantId");
                                }
                                s(f21.i("Missing required properties:", sb3));
                                return null;
                            }
                            break;
                        case true:
                            String nextString2 = jsonReader4.nextString();
                            if (nextString2 != null) {
                                obj.c = nextString2;
                                break;
                            } else {
                                ku4.j("Null parameterValue");
                                return null;
                            }
                        default:
                            jsonReader4.skipValue();
                            break;
                    }
                }
                jsonReader4.endObject();
                return obj.a();
            case 28:
                jsonReader.beginObject();
                byte b = 0;
                int i = 0;
                String str7 = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals("frames")) {
                                z3 = false;
                                break;
                            }
                        case 3373707:
                            if (nextName5.equals("name")) {
                                z3 = true;
                                break;
                            }
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                z3 = true;
                                break;
                            }
                        default:
                            z3 = true;
                            break;
                    }
                    switch (z3) {
                        case b85.b:
                            list = va1.d(jsonReader, new ta1(0));
                            if (list != null) {
                                continue;
                            } else {
                                ku4.j("Null frames");
                                return null;
                            }
                        case true:
                            str7 = jsonReader.nextString();
                            if (str7 == null) {
                                ku4.j("Null name");
                                return null;
                            }
                            break;
                        case true:
                            i = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                    JsonReader jsonReader5 = jsonReader;
                }
                jsonReader.endObject();
                if (b == 1 && str7 != null && list != null) {
                    return new xz(str7, i, list);
                }
                StringBuilder sb4 = new StringBuilder();
                if (str7 == null) {
                    sb4.append(" name");
                }
                if ((b & 1) == 0) {
                    sb4.append(" importance");
                }
                if (list == null) {
                    sb4.append(" frames");
                }
                s(f21.i("Missing required properties:", sb4));
                return null;
            default:
                jsonReader.beginObject();
                byte b2 = 0;
                String str8 = null;
                String str9 = null;
                long j = 0;
                long j2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                z4 = false;
                                break;
                            }
                        case 3530753:
                            if (nextName6.equals("size")) {
                                z4 = true;
                                break;
                            }
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                z4 = true;
                                break;
                            }
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                z4 = true;
                                break;
                            }
                        default:
                            z4 = true;
                            break;
                    }
                    switch (z4) {
                        case b85.b:
                            str8 = jsonReader.nextString();
                            if (str8 != null) {
                                break;
                            } else {
                                ku4.j("Null name");
                                return null;
                            }
                        case true:
                            b2 = (byte) (b2 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case true:
                            str9 = new String(Base64.decode(jsonReader.nextString(), 2), ra1.a);
                            break;
                        case true:
                            b2 = (byte) (b2 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && str8 != null) {
                    return new uz(j, j2, str8, str9);
                }
                StringBuilder sb5 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb5.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb5.append(" size");
                }
                if (str8 == null) {
                    sb5.append(" name");
                }
                s(f21.i("Missing required properties:", sb5));
                return null;
        }
    }

    public double b(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.w) {
            case h75.g /*15*/:
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d3 = (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            case 16:
                if (d < 0.0d) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
            case 17:
                float[] fArr = vt0.a;
                return vt0.b(vt0.c, d);
            case 18:
                float[] fArr2 = vt0.a;
                return vt0.a(vt0.c, d);
            case 19:
                float[] fArr3 = vt0.a;
                return vt0.d(vt0.d, d);
            default:
                float[] fArr4 = vt0.a;
                return vt0.c(vt0.d, d);
        }
    }

    public Object d(kd6 kd6) {
        return AbtRegistrar.lambda$getComponents$0(kd6);
    }

    public void cancel() {
    }
}

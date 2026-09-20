package defpackage;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: km1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km1 implements Externalizable {
    public t61 w;
    public Object x;

    /* JADX WARNING: type inference failed for: r2v25, types: [m66] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0370, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        r61 r61;
        Map map;
        Map.Entry entry;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        Integer num;
        GMTDate gMTDate;
        GMTDate gMTDate2;
        byte[] bArr;
        int i;
        int i2;
        int[] iArr;
        int i3;
        byte[] bArr2;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        int i7;
        objectInput.getClass();
        Object readObject = objectInput.readObject();
        readObject.getClass();
        t61 t61 = (t61) readObject;
        this.w = t61;
        Object readObject2 = objectInput.readObject();
        readObject2.getClass();
        byte[] bArr3 = (byte[]) readObject2;
        switch (t61.w) {
            case b85.b:
                ae2<yb5> ae2 = new ae2(new wl7(k26.b(u61.b, k57.k0(bArr3)), new j5(28)), true, new j5(29));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (yb5 yb5 : ae2) {
                    yb5.getClass();
                    String str = (String) yb5.x;
                    if (k57.u0(str, "\"", false) && k57.m0(str, "\"", false)) {
                        yb5 = new yb5(yb5.w, d57.T0(str));
                    }
                    linkedHashMap.put(yb5.w, yb5.x);
                }
                Map W = sf4.W(linkedHashMap);
                Iterator it = W.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kj6.i("Collection contains no element matching the predicate.");
                        break;
                    } else {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (!k57.u0((String) entry2.getKey(), "$", false)) {
                            String str2 = (String) W.get("$x-enc");
                            if (str2 == null || (r61 = r61.valueOf(str2)) == null) {
                                r61 = r61.w;
                            }
                            r61 r612 = r61;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(W.size()));
                            for (Map.Entry entry3 : W.entrySet()) {
                                linkedHashMap2.put(o85.v((String) entry3.getKey()), entry3.getValue());
                            }
                            String str3 = (String) entry2.getKey();
                            String str4 = (String) entry2.getValue();
                            str4.getClass();
                            int ordinal = r612.ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                map = W;
                                entry = entry2;
                                int length = str4.length();
                                int i8 = 0;
                                while (true) {
                                    charSequence = "";
                                    if (i8 >= length) {
                                        charSequence2 = charSequence;
                                    } else if (!rd3.C(str4.charAt(i8))) {
                                        charSequence2 = str4.subSequence(i8, str4.length());
                                    } else {
                                        i8++;
                                    }
                                }
                                if (k57.u0(charSequence2.toString(), "\"", false)) {
                                    int length2 = str4.length() - 1;
                                    if (length2 >= 0) {
                                        while (true) {
                                            int i9 = length2 - 1;
                                            if (!rd3.C(str4.charAt(length2))) {
                                                z = false;
                                                charSequence = str4.subSequence(0, length2 + 1);
                                            } else {
                                                z = false;
                                                if (i9 >= 0) {
                                                    length2 = i9;
                                                }
                                            }
                                        }
                                    } else {
                                        z = false;
                                    }
                                    if (k57.m0(charSequence.toString(), "\"", z)) {
                                        str4 = d57.T0(d57.k1(str4).toString());
                                    }
                                }
                            } else if (ordinal != 2) {
                                if (ordinal != 3) {
                                    h.c();
                                    break;
                                } else {
                                    k50 k50 = m50.f;
                                    int length3 = str4.length();
                                    k50.getClass();
                                    l50 l50 = k50.d;
                                    str4.getClass();
                                    ie1.x(0, length3, str4.length());
                                    byte[] bytes = str4.substring(0, length3).getBytes(mo0.e);
                                    bytes.getClass();
                                    int length4 = bytes.length;
                                    boolean z2 = k50.b;
                                    ie1.x(0, length4, bytes.length);
                                    if (length4 == 0) {
                                        i = 1;
                                        i2 = 0;
                                    } else if (length4 != 1) {
                                        if (z2) {
                                            i = 1;
                                            int i10 = 0;
                                            i7 = length4;
                                            while (true) {
                                                if (i10 < length4) {
                                                    int i11 = n50.b[bytes[i10] & 255];
                                                    if (i11 < 0) {
                                                        if (i11 == -2) {
                                                            i7 -= length4 - i10;
                                                        } else {
                                                            i7--;
                                                        }
                                                    }
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            i = 1;
                                            if (bytes[length4 - 1] == 61) {
                                                i7 = length4 - 1;
                                                if (bytes[length4 - 2] == 61) {
                                                    i7 = length4 - 2;
                                                }
                                            } else {
                                                i6 = length4;
                                                i2 = (int) ((((long) i6) * 6) / 8);
                                            }
                                        }
                                        i6 = i7;
                                        i2 = (int) ((((long) i6) * 6) / 8);
                                    } else {
                                        map = W;
                                        entry = entry2;
                                        h.q(hl6.k(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                                        bArr = null;
                                        str4 = k57.k0(bArr);
                                    }
                                    byte[] bArr4 = new byte[i2];
                                    if (k50.a) {
                                        iArr = n50.d;
                                    } else {
                                        iArr = n50.b;
                                    }
                                    byte[] bArr5 = bytes;
                                    int i12 = -8;
                                    int i13 = 0;
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        map = W;
                                        entry = entry2;
                                        if (i3 < length4) {
                                            if (i12 == -8 && (i5 = i3 + 3) < length4) {
                                                int i16 = i3 + 4;
                                                int i17 = (iArr[bArr5[i3] & 255] << 18) | (iArr[bArr5[i3 + 1] & 255] << 12) | (iArr[bArr5[i3 + 2] & 255] << 6) | iArr[bArr5[i5] & 255];
                                                if (i17 >= 0) {
                                                    bArr4[i13] = (byte) (i17 >> 16);
                                                    int i18 = i13 + 2;
                                                    bArr4[i13 + 1] = (byte) (i17 >> 8);
                                                    i13 += 3;
                                                    bArr4[i18] = (byte) i17;
                                                    W = map;
                                                    entry2 = entry;
                                                    i14 = i16;
                                                }
                                            }
                                            byte b = bArr5[i3] & 255;
                                            bArr2 = bArr4;
                                            int i19 = iArr[b];
                                            if (i19 < 0) {
                                                iArr2 = iArr;
                                                if (i19 == -2) {
                                                    if (i12 != -8) {
                                                        l50 l502 = l50.x;
                                                        if (i12 != -6) {
                                                            if (i12 != -4) {
                                                                if (i12 != -2) {
                                                                    h.s("Unreachable");
                                                                }
                                                            } else if (l50 != l502) {
                                                                int i20 = i3 + 1;
                                                                if (z2) {
                                                                    while (i20 < length4) {
                                                                        if (n50.b[bArr5[i20] & 255] == -1) {
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                                if (i20 == length4 || bArr5[i20] != 61) {
                                                                    h.q(hl6.k(i20, "Missing one pad character at index "));
                                                                } else {
                                                                    i3 = i20 + 1;
                                                                    i4 = i;
                                                                }
                                                            } else {
                                                                h.q(hl6.k(i3, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                                            }
                                                        } else if (l50 == l502) {
                                                            h.q(hl6.k(i3, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                                        }
                                                        i3++;
                                                        i4 = i;
                                                    } else {
                                                        h.q(hl6.k(i3, "Redundant pad character at index "));
                                                    }
                                                } else if (z2) {
                                                    i14 = i3 + 1;
                                                } else {
                                                    char c = (char) b;
                                                    rd3.i(8);
                                                    String num2 = Integer.toString(b, 8);
                                                    num2.getClass();
                                                    throw new IllegalArgumentException("Invalid symbol '" + c + "'(" + num2 + ") at index " + i3);
                                                }
                                            } else {
                                                iArr2 = iArr;
                                                i14 = i3 + 1;
                                                i15 = (i15 << 6) | i19;
                                                int i21 = i12 + 6;
                                                if (i21 >= 0) {
                                                    bArr2[i13] = (byte) (i15 >>> i21);
                                                    i15 &= (i << i21) - 1;
                                                    i12 -= 2;
                                                    i13++;
                                                } else {
                                                    i12 = i21;
                                                }
                                            }
                                            W = map;
                                            entry2 = entry;
                                            bArr4 = bArr2;
                                            iArr = iArr2;
                                        } else {
                                            bArr2 = bArr4;
                                            i4 = 0;
                                        }
                                    }
                                    if (i12 == -2) {
                                        h.q("The last unit of input does not have enough bits");
                                    } else if (i12 != -8 && i4 == 0 && l50 == l50.w) {
                                        h.q("The padding option is set to PRESENT, but the input is not properly padded");
                                    } else if (i15 == 0) {
                                        if (z2) {
                                            while (i3 < length4) {
                                                if (n50.b[bArr5[i3] & 255] == -1) {
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (i3 < length4) {
                                            byte b2 = bArr5[i3] & 255;
                                            StringBuilder sb = new StringBuilder("Symbol '");
                                            sb.append((char) b2);
                                            sb.append("'(");
                                            rd3.i(8);
                                            String num3 = Integer.toString(b2, 8);
                                            num3.getClass();
                                            sb.append(num3);
                                            sb.append(") at index ");
                                            h.q(hl6.n(sb, i3 - 1, " is prohibited after the pad character"));
                                        } else if (i13 == i2) {
                                            bArr = bArr2;
                                            str4 = k57.k0(bArr);
                                        } else {
                                            h.s("Check failed.");
                                        }
                                    } else {
                                        h.q("The pad bits must be zeros");
                                    }
                                    bArr = null;
                                    str4 = k57.k0(bArr);
                                }
                            } else {
                                map = W;
                                entry = entry2;
                                str4 = ss0.d(0, 0, 11, str4);
                            }
                            String str5 = str4;
                            String str6 = (String) linkedHashMap2.get("max-age");
                            if (str6 != null) {
                                num = Integer.valueOf((int) z65.q(Long.parseLong(str6), 0, 2147483647L));
                            } else {
                                num = null;
                            }
                            try {
                                String str7 = (String) linkedHashMap2.get("expires");
                                if (str7 != null) {
                                    gMTDate = aj1.a(str7);
                                } else {
                                    gMTDate = null;
                                }
                            } catch (Throwable th) {
                                gMTDate = new m66(th);
                            }
                            if (gMTDate instanceof m66) {
                                gMTDate2 = null;
                            } else {
                                gMTDate2 = gMTDate;
                            }
                            GMTDate gMTDate3 = gMTDate2;
                            String str8 = (String) linkedHashMap2.get("domain");
                            String str9 = (String) linkedHashMap2.get("path");
                            boolean containsKey = linkedHashMap2.containsKey("secure");
                            boolean containsKey2 = linkedHashMap2.containsKey("httponly");
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry4 : map.entrySet()) {
                                String str10 = (String) entry4.getKey();
                                if (!u61.a.contains(o85.v(str10)) && !str10.equals(entry.getKey())) {
                                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                                }
                            }
                            obj = new Cookie(str3, str5, r612, num, gMTDate3, str8, str9, containsKey, containsKey2, linkedHashMap3);
                            break;
                        }
                    }
                }
                break;
            default:
                obj = j45.e(k57.k0(bArr3)).b();
                break;
        }
        this.x = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte[] bArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ObjectOutput objectOutput2 = objectOutput;
        objectOutput2.getClass();
        objectOutput2.writeObject(this.w);
        t61 t61 = this.w;
        Object obj = this.x;
        obj.getClass();
        switch (t61.w) {
            case b85.b:
                Cookie cookie = (Cookie) obj;
                cookie.getClass();
                Set set = u61.a;
                String name = cookie.getName();
                String value = cookie.getValue();
                r61 encoding = cookie.getEncoding();
                Integer maxAgeInt = cookie.getMaxAgeInt();
                GMTDate expires = cookie.getExpires();
                String domain = cookie.getDomain();
                String path = cookie.getPath();
                boolean secure = cookie.getSecure();
                boolean httpOnly = cookie.getHttpOnly();
                Map<String, String> extensions = cookie.getExtensions();
                name.getClass();
                value.getClass();
                encoding.getClass();
                extensions.getClass();
                u61.a(name);
                String str9 = name + '=' + u61.b(value.toString(), encoding);
                String str10 = "";
                if (maxAgeInt != null) {
                    str = "Max-Age=" + maxAgeInt;
                } else {
                    str = str10;
                }
                if (expires != null) {
                    List list = aj1.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(expires.getDayOfWeek().w.concat(", "));
                    sb.append(d57.O0(2, String.valueOf(expires.getDayOfMonth())) + ' ');
                    sb.append(expires.getMonth().w.concat(" "));
                    sb.append(d57.O0(4, String.valueOf(expires.getYear())));
                    str2 = f21.l(sb, " " + d57.O0(2, String.valueOf(expires.getHours())) + ':' + d57.O0(2, String.valueOf(expires.getMinutes())) + ':' + d57.O0(2, String.valueOf(expires.getSeconds())) + ' ', "GMT");
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = "Expires=" + str2;
                } else {
                    str3 = str10;
                }
                r61 r61 = r61.w;
                if (domain != null) {
                    str4 = "Domain=".concat(u61.b(domain.toString(), r61));
                } else {
                    str4 = str10;
                }
                if (path != null) {
                    str5 = "Path=".concat(u61.b(path.toString(), r61));
                } else {
                    str5 = str10;
                }
                if (secure) {
                    str6 = "Secure";
                } else {
                    str6 = str10;
                }
                if (httpOnly) {
                    str10 = "HttpOnly";
                }
                List E = sg3.E(str9, str, str3, str4, str5, str6, str10);
                ArrayList arrayList = new ArrayList(extensions.size());
                for (Map.Entry next : extensions.entrySet()) {
                    String str11 = (String) next.getKey();
                    u61.a(str11);
                    String str12 = (String) next.getValue();
                    if (str12 == null) {
                        str8 = str11;
                    } else {
                        str8 = str11 + '=' + u61.b(str12.toString(), r61);
                    }
                    arrayList.add(str8);
                }
                ArrayList M0 = dt0.M0(E, arrayList);
                String name2 = encoding.name();
                if (name2 == null) {
                    str7 = "$x-enc";
                } else {
                    str7 = "$x-enc=".concat(u61.b(name2.toString(), r61));
                }
                ArrayList N0 = dt0.N0(M0, str7);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = N0.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((String) next2).length() > 0) {
                        arrayList2.add(next2);
                    }
                }
                bArr = k57.l0(dt0.E0(arrayList2, "; ", (String) null, (String) null, (vr2) null, 62));
                break;
            default:
                Url url = (Url) obj;
                url.getClass();
                bArr = k57.l0(url.toString());
                break;
        }
        objectOutput2.writeObject(bArr);
    }
}

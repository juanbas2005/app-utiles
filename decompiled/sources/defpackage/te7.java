package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: te7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class te7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ze7 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te7(ze7 ze7, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ze7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                long j = ((l35) obj).a;
                return new te7(this.C, (f61) obj2, 0).s(vs7);
            case 1:
                return ((te7) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((te7) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ze7 ze7 = this.C;
        switch (i) {
            case b85.b:
                l35 l35 = (l35) obj;
                return new te7(ze7, f61, 0);
            case 1:
                return new te7(ze7, f61, 1);
            default:
                return new te7(ze7, f61, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:215:0x04a4  */
    public final Object s(Object obj) {
        yb5 a;
        vs7 vs7;
        vl vlVar;
        int i;
        bs0 bs0;
        ey2 ey2;
        vl vlVar2;
        vl vlVar3;
        as0 as0;
        CharSequence text;
        ArrayList arrayList;
        ey2 ey22;
        int i2;
        int i3;
        Spanned spanned;
        Parcel parcel;
        int i4;
        int i5;
        long j;
        long m;
        int i6;
        int i7;
        long j2;
        long m2;
        int i8 = this.A;
        ey2 ey23 = ey2.w;
        p81 p81 = p81.w;
        ze7 ze7 = this.C;
        vs7 vs72 = vs7.a;
        switch (i8) {
            case b85.b:
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (ze7.s(this) == p81) {
                        return p81;
                    }
                    a = ze7.a(ze7);
                    if (a != null) {
                    }
                } else if (i9 == 1) {
                    o85.q(obj);
                    a = ze7.a(ze7);
                    if (a != null) {
                        String str = (String) a.w;
                        long j3 = ((lg7) a.x).a;
                        wj5 wj5 = ze7.j;
                        if (wj5 != null) {
                            this.B = 2;
                            if (str.length() != 0 && !lg7.c(j3)) {
                                vs7 = ar7.e0(wj5.a, new ng((Object) wj5, (Object) new q0(j3, (f61) null, wj5, str), (f61) null, 13), this);
                            } else {
                                vs7 = vs72;
                            }
                            if (vs7 != p81) {
                                vs7 = vs72;
                            }
                            if (vs7 == p81) {
                                return p81;
                            }
                        }
                    }
                } else if (i9 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs72;
            case 1:
                ey2 ey24 = ey23;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    if (lg7.c(ze7.n().b) || !ze7.j() || (ze7.f instanceof zd5)) {
                        i = 1;
                        vlVar = null;
                    } else {
                        vlVar = t75.q(ze7.n());
                        vl s = t75.s(ze7.n(), ze7.n().a.x.length());
                        vl r = t75.r(ze7.n(), ze7.n().a.x.length());
                        tl tlVar = new tl(s);
                        tlVar.a(r);
                        vl e = tlVar.e();
                        int f = lg7.f(ze7.n().b);
                        ze7.c.y(ze7.e(e, i95.a(f, f)));
                        ze7.q(ey24);
                        i = 1;
                        ze7.a.e = true;
                    }
                    if (!(vlVar == null || (bs0 = ze7.h) == null)) {
                        as0 B0 = bb0.B0(vlVar);
                        this.B = i;
                        ((sd) bs0).a(B0);
                        if (vs72 == p81) {
                            return p81;
                        }
                    }
                } else if (i10 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs72;
            default:
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    bs0 bs02 = ze7.h;
                    if (bs02 != null) {
                        this.B = 1;
                        ClipData primaryClip = ((sd) bs02).a.a().getPrimaryClip();
                        if (primaryClip != null) {
                            as0 = new as0(primaryClip);
                        } else {
                            as0 = null;
                        }
                        if (as0 == p81) {
                            return p81;
                        }
                    }
                    return vs72;
                } else if (i11 == 1) {
                    o85.q(obj);
                    as0 = obj;
                } else if (i11 == 2) {
                    o85.q(obj);
                    vlVar2 = obj;
                    ey2 = ey23;
                    vlVar3 = vlVar2;
                    if (vlVar3 != null && ze7.j()) {
                        tl tlVar2 = new tl(t75.s(ze7.n(), ze7.n().a.x.length()));
                        tlVar2.a(vlVar3);
                        vl e2 = tlVar2.e();
                        vl r2 = t75.r(ze7.n(), ze7.n().a.x.length());
                        tl tlVar3 = new tl(e2);
                        tlVar3.a(r2);
                        vl e3 = tlVar3.e();
                        int length = vlVar3.x.length() + lg7.f(ze7.n().b);
                        ze7.c.y(ze7.e(e3, i95.a(length, length)));
                        ze7.q(ey2);
                        ze7.a.e = true;
                    }
                    return vs72;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                as0 as02 = as0;
                if (as02 != null) {
                    this.B = 2;
                    int i12 = 0;
                    ClipData.Item itemAt = as02.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        ey2 = ey23;
                        vlVar2 = null;
                    } else if (!(text instanceof Spanned)) {
                        vlVar2 = new vl(text.toString());
                        ey2 = ey23;
                    } else {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList2 = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i13 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i13];
                                if (!sg3.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    i3 = i2;
                                    ey2 = ey22;
                                    spanned = spanned2;
                                } else {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i2);
                                    obtain.unmarshall(decode, i2, decode.length);
                                    obtain.setDataPosition(i2);
                                    long j4 = jt0.g;
                                    long j5 = j4;
                                    long j6 = wg7.c;
                                    long j7 = j6;
                                    am2 am2 = null;
                                    yl2 yl2 = null;
                                    zl2 zl2 = null;
                                    String str2 = null;
                                    h60 h60 = null;
                                    lf7 lf7 = null;
                                    rd7 rd7 = null;
                                    lq6 lq6 = null;
                                    while (true) {
                                        if (obtain.dataAvail() > 1) {
                                            byte readByte = obtain.readByte();
                                            i3 = i2;
                                            if (readByte != 1) {
                                                ey2 = ey22;
                                                if (readByte != 2) {
                                                    parcel = obtain;
                                                    spanned = spanned2;
                                                    if (readByte == 3) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            am2 = new am2(parcel.readInt());
                                                        }
                                                    } else if (readByte == 4) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte readByte2 = parcel.readByte();
                                                            if (readByte2 != 0 && readByte2 == 1) {
                                                                i7 = 1;
                                                            } else {
                                                                i7 = i3;
                                                            }
                                                            yl2 yl22 = new yl2(i7);
                                                            i2 = i3;
                                                            yl2 = yl22;
                                                            ey22 = ey2;
                                                            obtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (readByte == 5) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte readByte3 = parcel.readByte();
                                                            if (readByte3 != 0) {
                                                                if (readByte3 == 1) {
                                                                    i6 = 65535;
                                                                } else if (readByte3 == 3) {
                                                                    i6 = 2;
                                                                } else if (readByte3 == 2) {
                                                                    i6 = 1;
                                                                }
                                                                zl2 zl22 = new zl2(i6);
                                                                i2 = i3;
                                                                zl2 = zl22;
                                                                ey22 = ey2;
                                                                obtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                            i6 = i3;
                                                            zl2 zl222 = new zl2(i6);
                                                            i2 = i3;
                                                            zl2 = zl222;
                                                            ey22 = ey2;
                                                            obtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (readByte == 6) {
                                                        str2 = parcel.readString();
                                                    } else if (readByte == 7) {
                                                        if (parcel.dataAvail() >= 5) {
                                                            byte readByte4 = parcel.readByte();
                                                            if (readByte4 == 1) {
                                                                j = 4294967296L;
                                                            } else if (readByte4 == 2) {
                                                                j = 8589934592L;
                                                            } else {
                                                                j = 0;
                                                            }
                                                            if (xg7.a(j, 0)) {
                                                                m = wg7.c;
                                                            } else {
                                                                m = ya5.m(parcel.readFloat(), j);
                                                            }
                                                            j7 = m;
                                                        }
                                                    } else if (readByte == 8) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            i2 = i3;
                                                            h60 = new h60(parcel.readFloat());
                                                            ey22 = ey2;
                                                            obtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (parcel.dataAvail() >= 8) {
                                                            lf7 = new lf7(parcel.readFloat(), parcel.readFloat());
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (parcel.dataAvail() >= 8) {
                                                            int i14 = jt0.h;
                                                            long readLong = parcel.readLong();
                                                            long j8 = readLong & 63;
                                                            if (j8 >= 16) {
                                                                readLong = (readLong & -64) | (j8 + 1);
                                                            }
                                                            j5 = readLong;
                                                        }
                                                    } else if (readByte == 11) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            int readInt = parcel.readInt();
                                                            if ((readInt & 2) != 0) {
                                                                i4 = 1;
                                                            } else {
                                                                i4 = i3;
                                                            }
                                                            if ((readInt & 1) != 0) {
                                                                i5 = 1;
                                                            } else {
                                                                i5 = i3;
                                                            }
                                                            rd7 rd72 = rd7.d;
                                                            rd7 rd73 = rd7.c;
                                                            if (i4 != 0 && i5 != 0) {
                                                                List E = sg3.E(rd72, rd73);
                                                                Integer valueOf = Integer.valueOf(i3);
                                                                int size = E.size();
                                                                for (int i15 = i3; i15 < size; i15++) {
                                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((rd7) E.get(i15)).a);
                                                                }
                                                                rd7 = new rd7(valueOf.intValue());
                                                            } else if (i4 != 0) {
                                                                rd7 = rd72;
                                                            } else if (i5 != 0) {
                                                                rd7 = rd73;
                                                            } else {
                                                                rd7 = rd7.b;
                                                            }
                                                        }
                                                    } else if (readByte == 12) {
                                                        if (parcel.dataAvail() >= 20) {
                                                            int i16 = jt0.h;
                                                            long readLong2 = parcel.readLong();
                                                            long j9 = readLong2 & 63;
                                                            if (j9 >= 16) {
                                                                readLong2 = (readLong2 & -64) | (j9 + 1);
                                                            }
                                                            long j10 = readLong2;
                                                            float readFloat = parcel.readFloat();
                                                            float readFloat2 = parcel.readFloat();
                                                            long floatToRawIntBits = (long) Float.floatToRawIntBits(readFloat);
                                                            i2 = i3;
                                                            ey22 = ey2;
                                                            obtain = parcel;
                                                            lq6 = new lq6(j10, (floatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(readFloat2)) & 4294967295L), parcel.readFloat());
                                                            spanned2 = spanned;
                                                        }
                                                    }
                                                    ey22 = ey2;
                                                    obtain = parcel;
                                                    spanned2 = spanned;
                                                } else if (obtain.dataAvail() >= 5) {
                                                    byte readByte5 = obtain.readByte();
                                                    if (readByte5 == 1) {
                                                        parcel = obtain;
                                                        spanned = spanned2;
                                                        j2 = 4294967296L;
                                                    } else if (readByte5 == 2) {
                                                        parcel = obtain;
                                                        spanned = spanned2;
                                                        j2 = 8589934592L;
                                                    } else {
                                                        parcel = obtain;
                                                        spanned = spanned2;
                                                        j2 = 0;
                                                    }
                                                    if (xg7.a(j2, 0)) {
                                                        m2 = wg7.c;
                                                    } else {
                                                        m2 = ya5.m(parcel.readFloat(), j2);
                                                    }
                                                    j6 = m2;
                                                }
                                                i2 = i3;
                                                ey22 = ey2;
                                                obtain = parcel;
                                                spanned2 = spanned;
                                            } else if (obtain.dataAvail() >= 8) {
                                                int i17 = jt0.h;
                                                long readLong3 = obtain.readLong();
                                                long j11 = readLong3 & 63;
                                                if (j11 < 16) {
                                                    j4 = readLong3;
                                                } else {
                                                    j4 = (readLong3 & -64) | (j11 + 1);
                                                }
                                            }
                                            i2 = i3;
                                        } else {
                                            i3 = i2;
                                        }
                                    }
                                    ey2 = ey22;
                                    spanned = spanned2;
                                    arrayList2.add(new ul(spanStart, spanEnd, new yy6(j4, j6, am2, yl2, zl2, (ea7) null, str2, j7, h60, lf7, (ya4) null, j5, rd7, lq6, 49152)));
                                }
                                if (i13 != length2) {
                                    i13++;
                                    i12 = i3;
                                    ey23 = ey2;
                                    spanned2 = spanned;
                                }
                            }
                        } else {
                            ey2 = ey23;
                        }
                        String obj2 = text.toString();
                        vl vlVar4 = wl.a;
                        if (arrayList2.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = arrayList2;
                        }
                        vlVar2 = new vl((List) arrayList, obj2);
                    }
                    if (vlVar2 == p81) {
                        return p81;
                    }
                    vlVar3 = vlVar2;
                    tl tlVar22 = new tl(t75.s(ze7.n(), ze7.n().a.x.length()));
                    tlVar22.a(vlVar3);
                    vl e22 = tlVar22.e();
                    vl r22 = t75.r(ze7.n(), ze7.n().a.x.length());
                    tl tlVar32 = new tl(e22);
                    tlVar32.a(r22);
                    vl e32 = tlVar32.e();
                    int length3 = vlVar3.x.length() + lg7.f(ze7.n().b);
                    ze7.c.y(ze7.e(e32, i95.a(length3, length3)));
                    ze7.q(ey2);
                    ze7.a.e = true;
                }
                return vs72;
        }
    }
}

package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* renamed from: td  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td implements cs0 {
    public final Context a;
    public ClipboardManager b;

    public td(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }

    public final void b(vl vlVar) {
        List list;
        long j;
        byte b2;
        vl vlVar2 = vlVar;
        ClipboardManager a2 = a();
        List list2 = vlVar2.y;
        List list3 = a42.w;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = vlVar2.x;
        if (!list.isEmpty()) {
            SpannableString spannableString = new SpannableString(str);
            ns8 ns8 = new ns8(21, false);
            ns8.x = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i = 0;
            while (i < size) {
                ul ulVar = (ul) list2.get(i);
                yy6 yy6 = (yy6) ulVar.a;
                int i2 = ulVar.b;
                int i3 = ulVar.c;
                ((Parcel) ns8.x).recycle();
                ns8.x = Parcel.obtain();
                kf7 kf7 = yy6.a;
                long j2 = yy6.l;
                long j3 = yy6.h;
                int i4 = i3;
                long j4 = yy6.b;
                List list4 = list2;
                int i5 = size;
                long b3 = kf7.b();
                SpannableString spannableString2 = spannableString;
                int i6 = i;
                long j5 = jt0.g;
                if (!jt0.c(b3, j5)) {
                    ns8.R((byte) 1);
                    j = j5;
                    ((Parcel) ns8.x).writeLong(gl0.d0(yy6.a.b()));
                } else {
                    j = j5;
                }
                long j6 = wg7.c;
                byte b4 = 2;
                if (!wg7.a(j4, j6)) {
                    ns8.R((byte) 2);
                    ns8.T(j4);
                }
                am2 am2 = yy6.c;
                if (am2 != null) {
                    ns8.R((byte) 3);
                    ((Parcel) ns8.x).writeInt(am2.w);
                }
                yl2 yl2 = yy6.d;
                if (yl2 != null) {
                    int i7 = yl2.a;
                    ns8.R((byte) 4);
                    if (i7 != 0 && i7 == 1) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    ns8.R(b2);
                }
                zl2 zl2 = yy6.e;
                if (zl2 != null) {
                    int i8 = zl2.a;
                    ns8.R((byte) 5);
                    if (i8 != 0) {
                        if (i8 == 65535) {
                            b4 = 1;
                        } else if (i8 != 1) {
                            if (i8 == 2) {
                                b4 = 3;
                            }
                        }
                        ns8.R(b4);
                    }
                    b4 = 0;
                    ns8.R(b4);
                }
                String str2 = yy6.g;
                if (str2 != null) {
                    ns8.R((byte) 6);
                    ((Parcel) ns8.x).writeString(str2);
                }
                if (!wg7.a(j3, j6)) {
                    ns8.R((byte) 7);
                    ns8.T(j3);
                }
                h60 h60 = yy6.i;
                if (h60 != null) {
                    float f = h60.a;
                    ns8.R((byte) 8);
                    ns8.S(f);
                }
                lf7 lf7 = yy6.j;
                if (lf7 != null) {
                    ns8.R((byte) 9);
                    ns8.S(lf7.a);
                    ns8.S(lf7.b);
                }
                if (!jt0.c(j2, j)) {
                    ns8.R((byte) 10);
                    ((Parcel) ns8.x).writeLong(gl0.d0(j2));
                }
                rd7 rd7 = yy6.m;
                if (rd7 != null) {
                    ns8.R((byte) 11);
                    ((Parcel) ns8.x).writeInt(rd7.a);
                }
                lq6 lq6 = yy6.n;
                if (lq6 != null) {
                    ns8.R((byte) 12);
                    ((Parcel) ns8.x).writeLong(gl0.d0(lq6.a));
                    long j7 = lq6.b;
                    ns8.S(Float.intBitsToFloat((int) (j7 >> 32)));
                    ns8.S(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    ns8.S(lq6.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) ns8.x).marshall(), 0)), i2, i4, 33);
                i = i6 + 1;
                spannableString = spannableString2;
                list2 = list4;
                size = i5;
            }
            str = spannableString;
        }
        a2.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}

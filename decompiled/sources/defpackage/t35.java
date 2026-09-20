package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;

/* renamed from: t35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t35 {
    public static x83 a;
    public static x83 b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: ij7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: s86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: vl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v10, resolved type: r51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: cf} */
    /* JADX WARNING: type inference failed for: r24v3, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x037e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x044e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final void A(ViewStructure viewStructure, uy3 uy3, AutofillId autofillId, String str, ny5 ny5) {
        boolean z;
        long j;
        int i;
        char c;
        Object obj;
        Integer num;
        boolean z2;
        boolean z3;
        Boolean bool;
        r51 r51;
        boolean z4;
        long j2;
        long j3;
        s86 s86;
        ij7 ij7;
        ag agVar;
        vl vlVar;
        cf cfVar;
        List list;
        Integer valueOf;
        int i2;
        Integer num2;
        uy3 uy32;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String p;
        String[] t;
        boolean z10;
        String[] t2;
        tp4 tp4;
        int i3;
        int i4;
        tp4 tp42;
        s86 s862;
        ag agVar2;
        vl vlVar2;
        ij7 ij72;
        cf cfVar2;
        boolean z11;
        ViewStructure viewStructure2 = viewStructure;
        uy3 uy33 = uy3;
        ny5 ny52 = ny5;
        nk6 nk6 = jk6.a;
        nk6 nk62 = zj6.a;
        ak6 x = uy33.x();
        boolean z12 = true;
        if (x == null || (tp42 = x.w) == null) {
            i = 2;
            z = true;
            j3 = 128;
            j2 = 255;
            c = 7;
            j = -9187201950435737472L;
            z2 = true;
            cfVar = null;
            vlVar = null;
            agVar = null;
            ij7 = null;
            s86 = null;
            z4 = false;
            r51 = null;
            bool = null;
            z3 = false;
            num = null;
            obj = null;
        } else {
            j3 = 128;
            Object[] objArr = tp42.b;
            Object[] objArr2 = tp42.c;
            long[] jArr = tp42.a;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                z2 = true;
                int i5 = 0;
                cfVar2 = null;
                z4 = false;
                ij72 = null;
                vlVar2 = null;
                agVar2 = null;
                r51 = null;
                bool = null;
                s862 = null;
                z3 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr[i8];
                                Object obj3 = objArr2[i8];
                                nk6 nk63 = (nk6) obj2;
                                if (sg3.e(nk63, jk6.s)) {
                                    obj3.getClass();
                                    cfVar2 = (cf) obj3;
                                } else if (sg3.e(nk63, jk6.a)) {
                                    obj3.getClass();
                                    String str2 = (String) dt0.y0((List) obj3);
                                    if (str2 != null) {
                                        viewStructure2.setContentDescription(str2);
                                    }
                                } else if (sg3.e(nk63, jk6.r)) {
                                    obj3.getClass();
                                    r51 = (r51) obj3;
                                } else if (sg3.e(nk63, jk6.t)) {
                                    obj3.getClass();
                                    agVar2 = (ag) obj3;
                                } else if (sg3.e(nk63, jk6.G)) {
                                    obj3.getClass();
                                    vlVar2 = (vl) obj3;
                                } else if (sg3.e(nk63, jk6.l)) {
                                    obj3.getClass();
                                    viewStructure2.setFocused(((Boolean) obj3).booleanValue());
                                } else if (sg3.e(nk63, jk6.P)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (sg3.e(nk63, jk6.L)) {
                                    z3 = z12;
                                } else if (sg3.e(nk63, jk6.o)) {
                                    obj3.getClass();
                                    z2 = ((Boolean) obj3).booleanValue();
                                } else if (sg3.e(nk63, jk6.z)) {
                                    obj3.getClass();
                                    s862 = (s86) obj3;
                                } else if (sg3.e(nk63, jk6.J)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (sg3.e(nk63, jk6.K)) {
                                    obj3.getClass();
                                    ij72 = (ij7) obj3;
                                } else if (sg3.e(nk63, zj6.b)) {
                                    viewStructure2.setClickable(z12);
                                } else if (sg3.e(nk63, zj6.c)) {
                                    viewStructure2.setLongClickable(z12);
                                } else if (sg3.e(nk63, zj6.w)) {
                                    viewStructure2.setFocusable(z12);
                                } else if (sg3.e(nk63, zj6.k)) {
                                    z4 = z12;
                                }
                                z11 = z12;
                                if (Build.VERSION.SDK_INT >= 34 && sg3.e(nk63, kk6.c)) {
                                    obj = obj3;
                                }
                            } else {
                                z11 = z12;
                            }
                            j4 >>= 8;
                            i7++;
                            z12 = z11;
                        }
                        z = z12;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        z = z12;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z12 = z;
                }
            } else {
                z = true;
                c = 7;
                j = -9187201950435737472L;
                z2 = true;
                cfVar2 = null;
                z4 = false;
                ij72 = null;
                vlVar2 = null;
                agVar2 = null;
                r51 = null;
                bool = null;
                s862 = null;
                z3 = false;
                num = null;
                obj = null;
            }
            cfVar = cfVar2;
            ij7 = ij72;
            vlVar = vlVar2;
            agVar = agVar2;
            s86 = s862;
        }
        ak6 x2 = uy33.x();
        if (x2 != null && x2.y && !x2.z) {
            x2 = x2.g();
            lp4 lp4 = new lp4(((eq4) ((jp4) uy33.n()).x).y);
            lp4.c(uy33.n());
            while (lp4.i()) {
                uy3 uy34 = (uy3) lp4.k(lp4.b - 1);
                ak6 x3 = uy34.x();
                if (x3 != null && !x3.y) {
                    x2.l(x3);
                    if (!x3.z) {
                        lp4.c(uy34.n());
                    }
                }
            }
        }
        if (!(x2 == null || (tp4 = x2.w) == null)) {
            Object[] objArr3 = tp4.b;
            Object[] objArr4 = tp4.c;
            long[] jArr2 = tp4.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 8;
                list = null;
                int i10 = 0;
                while (true) {
                    long j5 = jArr2[i10];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j3) {
                                int i13 = (i10 << 3) + i12;
                                Object obj4 = objArr5[i13];
                                ? r24 = objArr4[i13];
                                i3 = i9;
                                nk6 nk64 = (nk6) obj4;
                                i4 = i12;
                                if (sg3.e(nk64, jk6.j)) {
                                    viewStructure2.setEnabled(false);
                                } else if (sg3.e(nk64, jk6.C)) {
                                    r24.getClass();
                                    list = r24;
                                }
                            } else {
                                i4 = i12;
                                i3 = i9;
                            }
                            j5 >>= i3;
                            i12 = i4 + 1;
                            i9 = i3;
                        }
                        if (i11 != i9) {
                            break;
                        }
                    }
                    int i14 = i10;
                    if (i14 == length2) {
                        break;
                    }
                    i10 = i14 + 1;
                    objArr3 = objArr5;
                    jArr2 = jArr3;
                }
                valueOf = Integer.valueOf(uy33.x);
                if (uy33.v() == null) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    i2 = valueOf.intValue();
                } else {
                    i2 = -1;
                }
                viewStructure2.setAutofillId(autofillId, i2);
                viewStructure2.setId(i2, str, (String) null, (String) null);
                if (cfVar == null) {
                    num2 = Integer.valueOf(cfVar.a);
                } else if (z4) {
                    num2 = Integer.valueOf(z);
                } else if (ij7 != null) {
                    num2 = Integer.valueOf(i);
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    viewStructure2.setAutofillType(num2.intValue());
                }
                if (vlVar != null) {
                    viewStructure2.setAutofillValue(AutofillValue.forText(r16.i0(vlVar.x)));
                }
                if (agVar != null) {
                    viewStructure2.setAutofillValue(agVar.a);
                }
                if (!(r51 == null || (t2 = rd3.t(r51)) == null)) {
                    viewStructure2.setAutofillHints(t2);
                }
                uy32 = (uy3) ny52.a.b(uy33.x);
                if (uy32 == null || uy32.C == -4) {
                    z5 = false;
                } else {
                    ig igVar = ny52.c;
                    int e = ny52.e(uy32);
                    long[] jArr4 = (long[]) igVar.c;
                    long j6 = jArr4[e];
                    long j7 = jArr4[e + 1];
                    int i15 = (int) (j6 >> 32);
                    int i16 = (int) j6;
                    int i17 = ((int) (j7 >> 32)) - i15;
                    int i18 = i15;
                    int i19 = ((int) j7) - i16;
                    int i20 = i18;
                    z5 = false;
                    viewStructure2.setDimens(i20, i16, 0, 0, i17, i19);
                }
                if (bool != null) {
                    viewStructure2.setSelected(bool.booleanValue());
                }
                int i21 = 4;
                if (ij7 == null) {
                    viewStructure2.setCheckable(z);
                    if (ij7 == ij7.w) {
                        z10 = true;
                    } else {
                        z10 = z5;
                    }
                    viewStructure2.setChecked(z10);
                } else if (bool != null && (s86 == null || s86.a != 4)) {
                    viewStructure2.setCheckable(true);
                    viewStructure2.setChecked(bool.booleanValue());
                }
                r51.a.getClass();
                String str3 = (String) qs.W0(rd3.t(m51.b));
                if (r51 == null || (t = rd3.t(r51)) == null) {
                    z6 = true;
                } else {
                    boolean F0 = qs.F0(str3, t);
                    z6 = true;
                    if (F0) {
                        z7 = true;
                        if (!z3 || z7) {
                            z8 = z6;
                        } else {
                            z8 = z5;
                        }
                        if (!z8 || z2) {
                            z9 = z6;
                        } else {
                            z9 = z5;
                        }
                        viewStructure2.setDataIsSensitive(z9);
                        if (!((xz4) uy33.a0.e).k1()) {
                            i21 = z5;
                        }
                        viewStructure2.setVisibility(i21);
                        if (list != null) {
                            int size = list.size();
                            String str4 = "";
                            for (int i22 = z5; i22 < size; i22++) {
                                str4 = str4 + ((vl) list.get(i22)).x + "\n";
                            }
                            viewStructure2.setText(str4);
                            viewStructure2.setClassName("android.widget.TextView");
                        }
                        if (!(!((jp4) uy33.n()).isEmpty() || s86 == null || (p = i75.p(s86.a)) == null)) {
                            viewStructure2.setClassName(p);
                        }
                        if (z4) {
                            viewStructure2.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                viewStructure2.setMaxTextLength(num.intValue());
                            }
                            if (z8) {
                                viewStructure2.setInputType(129);
                            }
                        }
                        if (Build.VERSION.SDK_INT < 35 && obj != null) {
                            ku4.a();
                            return;
                        }
                        return;
                    }
                }
                z7 = z5;
                if (!z3) {
                }
                z8 = z6;
                if (!z8) {
                }
                z9 = z6;
                viewStructure2.setDataIsSensitive(z9);
                if (!((xz4) uy33.a0.e).k1()) {
                }
                viewStructure2.setVisibility(i21);
                if (list != null) {
                }
                viewStructure2.setClassName(p);
                if (z4) {
                }
                if (Build.VERSION.SDK_INT < 35) {
                    return;
                }
                return;
            }
        }
        list = null;
        valueOf = Integer.valueOf(uy33.x);
        if (uy33.v() == null) {
        }
        if (valueOf == null) {
        }
        viewStructure2.setAutofillId(autofillId, i2);
        viewStructure2.setId(i2, str, (String) null, (String) null);
        if (cfVar == null) {
        }
        if (num2 != null) {
        }
        if (vlVar != null) {
        }
        if (agVar != null) {
        }
        viewStructure2.setAutofillHints(t2);
        uy32 = (uy3) ny52.a.b(uy33.x);
        if (uy32 == null || uy32.C == -4) {
        }
        if (bool != null) {
        }
        int i212 = 4;
        if (ij7 == null) {
        }
        r51.a.getClass();
        String str32 = (String) qs.W0(rd3.t(m51.b));
        if (r51 == null || (t = rd3.t(r51)) == null) {
        }
        z7 = z5;
        if (!z3) {
        }
        z8 = z6;
        if (!z8) {
        }
        z9 = z6;
        viewStructure2.setDataIsSensitive(z9);
        if (!((xz4) uy33.a0.e).k1()) {
        }
        viewStructure2.setVisibility(i212);
        if (list != null) {
        }
        viewStructure2.setClassName(p);
        if (z4) {
        }
        if (Build.VERSION.SDK_INT < 35) {
        }
    }

    public static final void B(yr7 yr7, String str) {
        List list;
        yr7.getClass();
        str.getClass();
        if (d57.I0(str)) {
            list = a42.w;
        } else if (str.equals("/")) {
            list = zr7.a;
        } else {
            list = new ArrayList(d57.X0(str, new char[]{'/'}));
        }
        list.getClass();
        yr7.h = list;
    }

    public static void C(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            tj7.a(view, charSequence);
            return;
        }
        vj7 vj7 = vj7.G;
        if (vj7 != null && vj7.w == view) {
            vj7.b((vj7) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            vj7 vj72 = vj7.H;
            if (vj72 != null && vj72.w == view) {
                vj72.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new vj7(view, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r0 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[ExcHandler: all (r0v15 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[Catch:{ all -> 0x00e5, SQLiteException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc A[Catch:{ all -> 0x00e5, SQLiteException -> 0x00b7 }, LOOP:1: B:42:0x00bc->B:47:0x00ce, LOOP_START, PHI: r1 
      PHI: (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:41:0x00ba, B:47:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7 A[Catch:{ all -> 0x00e5, SQLiteException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[Catch:{  }, RETURN, SYNTHETIC] */
    public static void D(pz8 pz8, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        HashSet hashSet;
        Cursor rawQuery;
        int length;
        int i;
        Cursor cursor;
        if (pz8 != null) {
            Cursor cursor2 = null;
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        pz8.E.c(str, e, "Error querying for table");
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL(str2);
                        try {
                            hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder(str.length() + 22);
                            sb.append("SELECT * FROM ");
                            sb.append(str);
                            sb.append(" LIMIT 0");
                            rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), (String[]) null);
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            String[] split = str3.split(",");
                            length = split.length;
                            i = 0;
                            while (i < length) {
                                String str4 = split[i];
                                if (hashSet.remove(str4)) {
                                    i++;
                                } else {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                                    if (!hashSet.remove(strArr[i2])) {
                                        sQLiteDatabase2.execSQL(strArr[i2 + 1]);
                                    }
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                pz8.E.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                            }
                        } catch (SQLiteException e2) {
                            SQLiteException sQLiteException = e2;
                            pz8.B.b("Failed to verify columns on table that was just created", str);
                            throw sQLiteException;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            rawQuery.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th4;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase2 = sQLiteDatabase;
                SQLiteException sQLiteException2 = e;
                cursor = null;
                pz8.E.c(str, e, "Error querying for table");
                if (cursor != null) {
                }
                sQLiteDatabase2.execSQL(str2);
                hashSet = new HashSet();
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("SELECT * FROM ");
                sb3.append(str);
                sb3.append(" LIMIT 0");
                rawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), (String[]) null);
                Collections.addAll(hashSet, rawQuery.getColumnNames());
                rawQuery.close();
                String[] split2 = str3.split(",");
                length = split2.length;
                i = 0;
                while (i < length) {
                }
                if (strArr != null) {
                }
                if (!hashSet.isEmpty()) {
                }
            } catch (Throwable th5) {
            }
        } else {
            h.q("Monitor must not be null");
        }
    }

    public static void E(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = h75.L("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                h.q(hl6.p(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                return;
            } else {
                str = h75.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void F(pz8 pz8, SQLiteDatabase sQLiteDatabase) {
        if (pz8 != null) {
            mz8 mz8 = pz8.E;
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                mz8.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                mz8.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                mz8.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                mz8.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        h.q("Monitor must not be null");
    }

    public static void G(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = H(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = H(i2, i3, "end index");
            } else {
                str = h75.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String H(int i, int i2, String str) {
        if (i < 0) {
            return h75.L("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h75.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        h.q(hl6.p(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    public static final void a(lu6 lu6, boolean z, sr2 sr2, pq6 pq6, ml4 ml4, boolean z2, vi6 vi6, ua0 ua0, la5 la5, gs2 gs2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z3;
        gs2 gs22;
        la5 la52;
        ua0 ua02;
        vi6 vi62;
        boolean z4;
        ml4 ml42;
        int i3;
        ua0 ua03;
        gs2 gs23;
        la5 la53;
        boolean z5;
        vi6 vi63;
        jl4 jl4;
        long j;
        boolean z6;
        long j2;
        vi6 vi64;
        long j3;
        int i4;
        long j4;
        int i5;
        int i6;
        int i7;
        int i8;
        lu6 lu62 = lu6;
        boolean z7 = z;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(1532041126);
        if ((i9 & 6) == 0) {
            if (yt22.g(lu62)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt22.h(z7)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 384) == 0) {
            if (yt22.i(sr2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        } else {
            sr2 sr22 = sr2;
        }
        if ((i9 & 3072) == 0) {
            if (yt22.g(pq6)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            pq6 pq62 = pq6;
        }
        int i10 = 221184 | i2;
        if ((1572864 & i9) == 0) {
            i10 = 745472 | i2;
        }
        if ((12582912 & i9) == 0) {
            i10 |= 4194304;
        }
        int i11 = 905969664 | i10;
        if ((306783379 & i11) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (yt22.V(i11 & 1, z3)) {
            yt22.a0();
            if ((i9 & 1) == 0 || yt22.C()) {
                xi6 xi6 = xi6.a;
                qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
                vi6 vi65 = qt0.m0;
                if (vi65 == null) {
                    rt0 rt0 = we.p;
                    long d = st0.d(qt0, rt0);
                    long d2 = st0.d(qt0, we.q);
                    rt0 rt02 = we.n;
                    long d3 = st0.d(qt0, rt02);
                    long j5 = jt0.f;
                    long d4 = st0.d(qt0, we.s);
                    long d5 = st0.d(qt0, rt02);
                    long d6 = st0.d(qt0, rt0);
                    rt0 rt03 = we.j;
                    long d7 = st0.d(qt0, rt03);
                    i4 = -33030145;
                    float f = we.k;
                    long b2 = jt0.b(f, d7);
                    long d8 = st0.d(qt0, rt02);
                    float f2 = we.l;
                    vi63 = new vi6(d, d2, d3, j5, d4, d5, d6, b2, jt0.b(f2, d8), j5, jt0.b(f, st0.d(qt0, rt03)), jt0.b(f2, st0.d(qt0, rt02)));
                    qt0.m0 = vi63;
                } else {
                    i4 = -33030145;
                    vi63 = vi65;
                }
                if (z7) {
                    j4 = vi63.c;
                } else if (!z7) {
                    j4 = vi63.f;
                } else {
                    j4 = vi63.l;
                }
                ua0 a2 = uq3.a(xi6.b, j4);
                la53 = xi6.d;
                gs23 = su0.J(-643804033, new os4(z7, 3), yt22);
                i3 = i11 & i4;
                jl4 = jl4.w;
                ua03 = a2;
                z5 = true;
            } else {
                yt22.Y();
                z5 = z2;
                vi63 = vi6;
                ua03 = ua0;
                la53 = la5;
                gs23 = gs2;
                i3 = i11 & -33030145;
                jl4 = ml4;
            }
            yt22.s();
            yt22.e0(-1579573323);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = b81.e(yt22);
            }
            ap4 ap4 = (ap4) Q;
            yt22.r(false);
            vi63.getClass();
            if (z5 && z7) {
                j = vi63.a;
            } else if (z5 && !z7) {
                j = vi63.d;
            } else if (z5 || !z7) {
                j = vi63.j;
            } else {
                j = vi63.g;
            }
            if (!z5 || !z7) {
                z6 = z5;
                if (z6 && !z7) {
                    j2 = vi63.e;
                } else if (z6 || !z7) {
                    j2 = vi63.k;
                } else {
                    j2 = vi63.h;
                }
            } else {
                z6 = z5;
                j2 = vi63.b;
            }
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                vi64 = vi63;
                Q2 = new bd5(0);
                yt22.o0(Q2);
            } else {
                vi64 = vi63;
            }
            bd5 bd5 = (bd5) Q2;
            boolean g = yt22.g(ap4);
            Object Q3 = yt22.Q();
            if (g || Q3 == d63) {
                j3 = j2;
                Q3 = new k05(ap4, bd5, (f61) null, 14);
                yt22.o0(Q3);
            } else {
                j3 = j2;
            }
            t49.h((gs2) Q3, yt22, ap4);
            ml4 a3 = yu6.a(we.D(lu62.b(jl4, 1.0f, true), new ji(2, bd5, z7)), yd0.d, yd0.e());
            Object Q4 = yt22.Q();
            if (Q4 == d63) {
                Q4 = new nf6(12);
                yt22.o0(Q4);
            }
            boolean z8 = z6;
            la5 la54 = la53;
            gs2 gs24 = gs23;
            ml4 ml43 = jl4;
            sr2 sr23 = sr2;
            s87.b(z7, sr23, ck6.a(a3, false, (vr2) Q4), z8, pq6, j, j3, 0.0f, ua03, ap4, su0.J(-1208080836, new zi6(gs23, fw0, la53), yt22), yt22, ((i3 >> 3) & 126) | ((i3 >> 6) & 7168) | (57344 & (i3 << 3)), 384);
            z4 = z8;
            ua02 = ua03;
            vi62 = vi64;
            gs22 = gs24;
            la52 = la54;
            ml42 = ml43;
        } else {
            yt2.Y();
            ml42 = ml4;
            z4 = z2;
            vi62 = vi6;
            ua02 = ua0;
            la52 = la5;
            gs22 = gs2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new h71(lu62, z, sr2, pq6, ml42, z4, vi62, ua02, la52, gs22, fw0, i);
        }
    }

    public static final void b(gs2 gs2, fw0 fw0, la5 la5, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yt2.g0(-1069265073);
        if (yt2.i(gs2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (yt2.i(fw0)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt2.g(la5)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i7 & 1, z)) {
            i80 i80 = xb4.C;
            ml4 J = x91.J(jl4.w, la5);
            lh4 d = mb0.d(i80, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, J);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            yf7.a(dr7.a(we.m, yt2), su0.J(-1372614088, new ou4((Object) gs2, (Object) fw0, (Object) hj8.H(vm4.x, yt2), 9), yt2), yt2, 48);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new zi6(gs2, fw0, la5, i);
        }
    }

    public static final void c(ml4 ml4, float f, fw0 fw0, yt2 yt2, int i) {
        boolean z;
        yt2.g0(2041406825);
        int i2 = i | 48;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            f = xi6.b;
            ml4 P = gw8.P(yu6.b(j45.o(ml4), 0.0f, 40.0f, 1), mg3.w);
            ea6 a2 = ca6.a(new ur(-f, true, new h(2)), xb4.I, yt2, 48);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, P);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, a2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new Object();
                yt2.o0(Q);
            }
            fw0.u((lu6) Q, yt2, 54);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yi6(ml4, f, fw0, i);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object d(eh6 eh6, float f, il ilVar, tj1 tj1, vr2 vr2, h61 h61) {
        cx6 cx6;
        int i;
        float f2;
        e06 e06;
        boolean z;
        if (h61 instanceof cx6) {
            cx6 cx62 = (cx6) h61;
            int i2 = cx62.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cx62.D = i2 - Integer.MIN_VALUE;
                cx6 = cx62;
                Object obj = cx6.C;
                i = cx6.D;
                if (i != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    if (((Number) ilVar.b()).floatValue() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f3 = f;
                    bx6 bx6 = new bx6(f3, obj2, eh6, vr2, 0);
                    cx6.A = ilVar;
                    cx6.B = obj2;
                    cx6.z = f3;
                    cx6.D = 1;
                    Object f4 = i95.f(ilVar, tj1, !z, bx6, cx6);
                    p81 p81 = p81.w;
                    if (f4 == p81) {
                        return p81;
                    }
                    f2 = f3;
                    e06 = obj2;
                } else if (i == 1) {
                    f2 = cx6.z;
                    e06 = cx6.B;
                    ilVar = cx6.A;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new el(new Float(f2 - e06.w), ilVar);
            }
        }
        cx6 = new h61(h61);
        Object obj3 = cx6.C;
        i = cx6.D;
        if (i != 0) {
        }
        return new el(new Float(f2 - e06.w), ilVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: dx6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: dx6} */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, e06] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    public static final Object e(eh6 eh6, float f, float f2, il ilVar, hl hlVar, vr2 vr2, h61 h61) {
        dx6 dx6;
        int i;
        il ilVar2;
        e06 e06;
        float f3;
        boolean z;
        float f4 = f;
        h61 h612 = h61;
        if (h612 instanceof dx6) {
            dx6 dx62 = (dx6) h612;
            int i2 = dx62.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dx62.E = i2 - Integer.MIN_VALUE;
                dx6 = dx62;
                dx6 dx63 = dx6;
                Object obj = dx63.D;
                i = dx63.E;
                if (i != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    f3 = ((Number) ilVar.b()).floatValue();
                    Float f5 = new Float(f4);
                    if (((Number) ilVar.b()).floatValue() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = !z;
                    bx6 bx6 = new bx6(f2, obj2, eh6, vr2, 1);
                    il ilVar3 = ilVar;
                    dx63.B = ilVar3;
                    dx63.C = obj2;
                    dx63.z = f4;
                    dx63.A = f3;
                    dx63.E = 1;
                    Object g = i95.g(ilVar3, f5, hlVar, z2, bx6, dx63);
                    p81 p81 = p81.w;
                    if (g == p81) {
                        return p81;
                    }
                    ilVar2 = ilVar;
                    e06 = obj2;
                } else if (i == 1) {
                    float f6 = dx63.A;
                    float f7 = dx63.z;
                    e06 = dx63.C;
                    ilVar2 = dx63.B;
                    o85.q(obj);
                    f3 = f6;
                    f4 = f7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new el(new Float(f4 - e06.w), gr8.D(ilVar2, 0.0f, k(((Number) ilVar2.b()).floatValue(), f3), 29));
            }
        }
        dx6 = new h61(h612);
        dx6 dx632 = dx6;
        Object obj3 = dx632.D;
        i = dx632.E;
        if (i != 0) {
        }
        return new el(new Float(f4 - e06.w), gr8.D(ilVar2, 0.0f, k(((Number) ilVar2.b()).floatValue(), f3), 29));
    }

    public static final void f(yr7 yr7, StringBuilder sb) {
        List list;
        sb.append(yr7.d().w);
        String str = yr7.d().w;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = sb;
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = yr7.e;
                    String str3 = yr7.f;
                    if (str2 != null) {
                        sb3.append(str2);
                        if (str3 != null) {
                            sb3.append(':');
                            sb3.append(str3);
                        }
                        sb3.append("@");
                    }
                    String sb4 = sb3.toString();
                    String str4 = yr7.a;
                    sb2.append(":");
                    sb2.append(sb4);
                    sb2.append(str4);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    String str5 = yr7.a;
                    sb.append(":");
                    sb.append(str5);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    String str6 = yr7.a;
                    sb.append(":");
                    sb.append(str6);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    String str7 = yr7.a;
                    String t = t(yr7);
                    sb.append("://");
                    sb.append(str7);
                    if (!d57.a1(t, '/')) {
                        sb.append('/');
                    }
                    sb.append(t);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    String str8 = yr7.a;
                    sb.append(":");
                    sb.append(str8);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(r(yr7));
        String t2 = t(yr7);
        wc5 wc5 = yr7.i;
        boolean z = yr7.b;
        t2.getClass();
        wc5.getClass();
        if (!d57.I0(t2) && !k57.u0(t2, "/", false)) {
            sb.append('/');
        }
        sb.append(t2);
        if (!wc5.isEmpty() || z) {
            sb.append("?");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : wc5.l()) {
            String str9 = (String) entry.getKey();
            List<String> list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = sg3.D(new yb5(str9, (Object) null));
            } else {
                ArrayList arrayList2 = new ArrayList(et0.e0(list2, 10));
                for (String yb5 : list2) {
                    arrayList2.add(new yb5(str9, yb5));
                }
                list = arrayList2;
            }
            it0.h0(arrayList, list);
        }
        StringBuilder sb5 = sb;
        dt0.D0(arrayList, sb5, "&", (String) null, (String) null, new ha7(18), 60);
        if (yr7.g.length() > 0) {
            sb5.append('#');
            sb5.append(yr7.g);
        }
    }

    public static final xf4 g(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new xf4(matcher, charSequence);
    }

    public static final float h(dh5 dh5, boolean z, k23[] k23Arr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (k23 c : k23Arr) {
            float c2 = dh5.c(c, Float.NaN);
            if (!Float.isNaN(f2)) {
                if (c2 > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = c2;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }

    public static final void i(gl glVar, eh6 eh6, vr2 vr2, float f) {
        float f2;
        try {
            f2 = eh6.a(f);
        } catch (CancellationException unused) {
            glVar.a();
            f2 = 0.0f;
        }
        vr2.y(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            glVar.a();
        }
    }

    public static final void j(yr7 yr7, String... strArr) {
        boolean z;
        ArrayList arrayList;
        List p1 = qs.p1(strArr);
        boolean z2 = false;
        if (yr7.h.size() <= 1 || ((CharSequence) dt0.G0(yr7.h)).length() != 0 || p1.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (p1.size() > 1 && ((CharSequence) dt0.w0(p1)).length() == 0 && !yr7.h.isEmpty()) {
            z2 = true;
        }
        if (!z || !z2) {
            List list = yr7.h;
            if (z) {
                arrayList = dt0.M0(dt0.t0(1, list), p1);
            } else if (z2) {
                arrayList = dt0.M0(list, dt0.s0(1, p1));
            } else {
                arrayList = dt0.M0(list, p1);
            }
        } else {
            arrayList = dt0.M0(dt0.t0(1, yr7.h), dt0.s0(1, p1));
        }
        yr7.h = arrayList;
    }

    public static final float k(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 <= 0.0f ? f >= f2 : f <= f2) {
            return f;
        }
        return f2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public static final qd5 l(List list) {
        ? obj = new Object();
        a42 a42 = a42.w;
        obj.w = new qd5(a42, a42);
        ArrayList arrayList = new ArrayList();
        Iterator it = new vf4(list).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((n76) it).x;
            if (listIterator.hasPrevious()) {
                qd5 qd5 = (qd5) listIterator.previous();
                if (qd5.b.isEmpty()) {
                    arrayList.add(qd5.a);
                } else {
                    m(arrayList, obj);
                    obj.w = o(qd5, (qd5) obj.w);
                }
            } else {
                m(arrayList, obj);
                return (qd5) obj.w;
            }
        }
    }

    public static final void m(ArrayList arrayList, h06 h06) {
        if (!arrayList.isEmpty()) {
            n74 m = sg3.m();
            Iterator it = new o76(arrayList).iterator();
            while (true) {
                ListIterator listIterator = (ListIterator) ((n76) it).x;
                if (listIterator.hasPrevious()) {
                    m.addAll((List) listIterator.previous());
                } else {
                    h06.w = o(new qd5(sg3.i(m), a42.w), (qd5) h06.w);
                    arrayList.clear();
                    return;
                }
            }
        }
    }

    public static final qd5 n(List list, ArrayList arrayList, ArrayList arrayList2, qd5 qd5) {
        List list2 = qd5.a;
        pd5 pd5 = (pd5) dt0.y0(list2);
        n74 m = sg3.m();
        m.addAll(list);
        if (arrayList == null) {
            m.addAll(list2);
        } else if (pd5 instanceof z15) {
            m.add(new z15(dt0.M0(arrayList, ((z15) pd5).a)));
            int i = 1;
            int size = list2.size() - 1;
            if (1 <= size) {
                while (true) {
                    m.add(list2.get(i));
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            m.add(new z15(arrayList));
            m.addAll(list2);
        }
        m.addAll(arrayList2);
        return new qd5(sg3.i(m), qd5.b);
    }

    public static final qd5 o(qd5 qd5, qd5 qd52) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        for (pd5 pd5 : qd5.a) {
            if (pd5 instanceof z15) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((z15) pd5).a);
                } else {
                    arrayList3 = dt0.d1(((z15) pd5).a);
                }
            } else if (pd5 instanceof ms7) {
                arrayList2.add(pd5);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new z15(arrayList3));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayList3 = null;
                }
                arrayList.add(pd5);
            }
        }
        List<qd5> list2 = qd5.b;
        ArrayList arrayList4 = new ArrayList();
        for (qd5 o : list2) {
            qd5 o2 = o(o, qd52);
            if (o2.a.isEmpty()) {
                list = o2.b;
                if (list.isEmpty()) {
                    list = sg3.D(o2);
                }
            } else {
                list = sg3.D(o2);
            }
            it0.h0(arrayList4, list);
        }
        boolean isEmpty = arrayList4.isEmpty();
        List<qd5> list3 = arrayList4;
        if (isEmpty) {
            if (!qd52.a.isEmpty()) {
                return n(arrayList, arrayList3, arrayList2, qd52);
            }
            list3 = qd52.b;
        }
        if ((arrayList3 != null || arrayList.isEmpty()) && (list3 == null || !list3.isEmpty())) {
            for (qd5 qd53 : list3) {
                if (dt0.y0(qd53.a) instanceof z15) {
                    ArrayList arrayList5 = new ArrayList(et0.e0(list3, 10));
                    for (qd5 n : list3) {
                        arrayList5.add(n(a42.w, arrayList3, arrayList2, n));
                    }
                    return new qd5(arrayList, arrayList5);
                }
            }
        }
        if (arrayList3 != null) {
            arrayList.add(new z15(arrayList3));
        }
        arrayList.addAll(arrayList2);
        return new qd5(arrayList, list3);
    }

    public static final int p(int i, String str) {
        String str2;
        int i2;
        w22 s = s();
        Integer num = null;
        if (s != null) {
            boolean z = true;
            if (s.c() != 1) {
                z = false;
            }
            if (z) {
                k75.i("charSequence cannot be null", str);
                wr0 wr0 = (wr0) s.e.b;
                wr0.getClass();
                if (i < 0 || i >= str.length()) {
                    str2 = str;
                    i2 = -1;
                } else {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        uq7[] uq7Arr = (uq7[]) spanned.getSpans(i, i + 1, uq7.class);
                        if (uq7Arr.length > 0) {
                            i2 = spanned.getSpanEnd(uq7Arr[0]);
                            str2 = str;
                        }
                    }
                    str2 = str;
                    i2 = ((i32) wr0.W(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new i32(i))).y;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (i2 != -1) {
                    num = valueOf;
                }
            } else {
                h.s("Not initialized yet");
                return 0;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int q(int i, String str) {
        w22 s = s();
        Integer num = null;
        if (s != null) {
            Integer valueOf = Integer.valueOf(s.b(Math.max(0, i - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final String r(yr7 yr7) {
        yr7.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = yr7.e;
        String str2 = yr7.f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(yr7.a);
        int i = yr7.c;
        if (!(i == 0 || i == yr7.d().x)) {
            sb.append(":");
            sb.append(String.valueOf(yr7.c));
        }
        return sb.toString();
    }

    public static final w22 s() {
        if (!w22.d()) {
            return null;
        }
        w22 a2 = w22.a();
        if (a2.c() == 1) {
            return a2;
        }
        return null;
    }

    public static final String t(yr7 yr7) {
        yr7.getClass();
        List list = yr7.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() != 1) {
            return dt0.E0(list, "/", (String) null, (String) null, (vr2) null, 62);
        }
        if (((CharSequence) dt0.w0(list)).length() == 0) {
            return "/";
        }
        return (String) dt0.w0(list);
    }

    public static final int u(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean v(float f, float f2, eh ehVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        eh a2 = gh.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            gh.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a2.b == null) {
            a2.b = new RectF();
        }
        RectF rectF = a2.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        eh a3 = gh.a();
        a3.f(ehVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.g();
        a2.g();
        return !isEmpty;
    }

    public static final boolean w(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final long x(long j, long j2, float f) {
        return (((long) Float.floatToRawIntBits(we.E(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f))) << 32) | (((long) Float.floatToRawIntBits(we.E(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f))) & 4294967295L);
    }

    public abstract void y(int i);

    public abstract void z(Typeface typeface, boolean z);
}

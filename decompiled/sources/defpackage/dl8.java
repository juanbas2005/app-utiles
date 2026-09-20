package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dl8 extends g89 {
    public HashSet A;
    public js B;
    public Long C;
    public Long D;
    public String z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v12, resolved type: yi8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v19, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: m22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v36, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v57, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v19, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v6, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v8, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v9, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v10, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v11, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v12, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v36, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v52, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v60, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v65, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v66, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v34, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v35, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v50, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v38, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v42, resolved type: y19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v37, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r41v8 */
    /* JADX WARNING: type inference failed for: r41v9 */
    /* JADX WARNING: type inference failed for: r41v10 */
    /* JADX WARNING: type inference failed for: r41v11 */
    /* JADX WARNING: type inference failed for: r41v30 */
    /* JADX WARNING: type inference failed for: r7v48 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r42v13, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r42v15, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r42v16 */
    /* JADX WARNING: type inference failed for: r0v159, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r41v47 */
    /* JADX WARNING: type inference failed for: r41v48 */
    /* JADX WARNING: type inference failed for: r41v49 */
    /* JADX WARNING: type inference failed for: r41v51 */
    /* JADX WARNING: type inference failed for: r42v47 */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0300, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x031e, code lost:
        if (r2 == null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0451, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06d5, code lost:
        r42 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06d8, code lost:
        r0 = e;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x087e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0880, code lost:
        r0 = e;
        r41 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x088e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x08b8, code lost:
        r0 = e;
        r41 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x08c6, code lost:
        r7 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0a0c, code lost:
        if (r12.t() == false) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0a0e, code lost:
        r7 = java.lang.Integer.valueOf(r12.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a17, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a18, code lost:
        r0.c(r2, java.lang.String.valueOf(r7), "Invalid property filter ID. appId, id");
        r41 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        r18 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:131:0x02b4] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06d4 A[Catch:{ SQLiteException -> 0x06ca, all -> 0x06c8 }, ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v32 ?) = (r4v30 android.database.Cursor), (r4v33 android.database.Cursor), (r4v33 android.database.Cursor), (r4v33 android.database.Cursor) binds: [B:274:0x068f, B:279:0x0698, B:284:0x06ad, B:285:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:274:0x068f] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x087e A[Catch:{ SQLiteException -> 0x0880, all -> 0x087e }, ExcHandler: all (th java.lang.Throwable), Splitter:B:363:0x0845] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x08ee  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x090c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137 A[Catch:{ SQLiteException -> 0x012d, all -> 0x012b }, ExcHandler: all (th java.lang.Throwable), PHI: r7 
      PHI: (r7v71 android.database.Cursor) = (r7v67 android.database.Cursor), (r7v72 android.database.Cursor), (r7v72 android.database.Cursor) binds: [B:20:0x00e9, B:25:0x00f2, B:29:0x0106] A[DONT_GENERATE, DONT_INLINE], Splitter:B:20:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0ae1  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0929 A[EDGE_INSN: B:526:0x0929->B:426:0x0929 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d1 A[Catch:{ SQLiteException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01eb A[SYNTHETIC, Splitter:B:88:0x01eb] */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final ArrayList g1(String str, List list, List list2, Long l, Long l2, boolean z2) {
        boolean z3;
        boolean z4;
        Map map;
        y19 y19;
        String str2;
        Cursor cursor;
        String str3;
        String str4;
        y19 y192;
        js jsVar;
        HashSet hashSet;
        y19 y193;
        String str5;
        js jsVar2;
        Iterator it;
        String str6;
        List<ox8> list3;
        boolean z5;
        Long l3;
        Map map2;
        Map map3;
        y19 y194;
        Iterator it2;
        String str7;
        Map map4;
        Cursor cursor2;
        Map map5;
        String str8;
        String str9;
        Iterator it3;
        String str10;
        Map map6;
        js jsVar3;
        Iterator it4;
        boolean z6;
        Integer num;
        Cursor cursor3;
        y19 y195;
        String str11;
        List list4;
        List list5;
        String str12;
        String str13;
        List list6;
        y19 y196;
        qr8 qr8;
        long j;
        Iterator it5;
        String str14;
        Map map7;
        String str15;
        Integer num2;
        boolean z7;
        Cursor cursor4;
        List list7;
        List list8;
        String str16;
        Cursor cursor5;
        List list9;
        ? r42;
        List list10;
        List list11;
        String str17;
        String str18;
        y19 y197;
        y19 y198;
        y19 y199;
        Cursor cursor6;
        Cursor cursor7;
        Cursor cursor8;
        Cursor cursor9;
        List list12;
        y19 y1910 = (y19) this.w;
        z65.h(str);
        z65.k(list);
        z65.k(list2);
        this.z = str;
        this.A = new HashSet();
        this.B = new js();
        this.C = l;
        this.D = l2;
        Iterator it6 = list.iterator();
        while (true) {
            if (it6.hasNext()) {
                if ("_s".equals(((h19) it6.next()).y())) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        io8.a();
        boolean n1 = y1910.z.n1(this.z, by8.F0);
        io8.a();
        boolean n12 = y1910.z.n1(this.z, by8.E0);
        v89 v89 = this.x;
        if (z3) {
            uq8 e0 = v89.e0();
            String str19 = this.z;
            e0.d1();
            e0.b1();
            z65.h(str19);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", 0);
            try {
                e0.T1().update("events", contentValues, "app_id = ?", new String[]{str19});
            } catch (SQLiteException e) {
                ((y19) e0.w).G().g1().c(pz8.k1(str19), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map8 = Collections.EMPTY_MAP;
        String str20 = "Failed to merge filter. appId";
        String str21 = "Database error querying filters. appId";
        String str22 = "audience_id";
        if (!n12 || !n1) {
            z4 = z3;
            l2 = "data";
        } else {
            uq8 e02 = v89.e0();
            y19 y1911 = (y19) e02.w;
            String str23 = this.z;
            z65.h(str23);
            z4 = z3;
            js jsVar4 = new js();
            try {
                Cursor query = e02.T1().query("event_filters", new String[]{str22, "data"}, "app_id=?", new String[]{str23}, (String) null, (String) null, (String) null);
                try {
                    Cursor cursor10 = "event_filters";
                    Cursor cursor11 = "event_filters";
                    if (query.moveToFirst()) {
                        l2 = "data";
                        Cursor cursor12 = "event_filters";
                        while (true) {
                            cursor10 = cursor12;
                            cursor11 = cursor12;
                            try {
                                cursor10 = cursor12;
                                cursor11 = cursor12;
                                ox8 ox8 = (ox8) ((mx8) y89.N1(ox8.F(), query.getBlob(1))).d();
                                if (!ox8.z()) {
                                    cursor8 = query;
                                } else {
                                    Integer valueOf = Integer.valueOf(query.getInt(0));
                                    List list13 = (List) jsVar4.get(valueOf);
                                    if (list13 == null) {
                                        Cursor cursor13 = query;
                                        try {
                                            cursor10 = cursor13;
                                            cursor11 = cursor13;
                                            list12 = new ArrayList();
                                            jsVar4.put(valueOf, list12);
                                            cursor9 = cursor13;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            cursor7 = cursor10;
                                            cursor6 = cursor7;
                                            try {
                                                y1911.G().g1().c(pz8.k1(str23), e, str21);
                                                map8 = Collections.EMPTY_MAP;
                                                if (cursor6 != null) {
                                                    cursor6.close();
                                                }
                                                map = map8;
                                                uq8 e03 = v89.e0();
                                                y19 = (y19) e03.w;
                                                str2 = this.z;
                                                e03.d1();
                                                e03.b1();
                                                z65.h(str2);
                                                SQLiteDatabase T1 = e03.T1();
                                                cursor = T1.query("audience_filter_values", new String[]{str22, "current_results"}, "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
                                                if (cursor.moveToFirst()) {
                                                }
                                                if (jsVar.isEmpty()) {
                                                }
                                                String str24 = l2;
                                                String str25 = str8;
                                                String str26 = str3;
                                                String str27 = str;
                                                if (!list.isEmpty()) {
                                                }
                                                if (z2) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                if (cursor6 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Cursor cursor14 = cursor11;
                                            cursor6 = cursor14;
                                            if (cursor6 != null) {
                                                cursor6.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        cursor9 = query;
                                        list12 = list13;
                                    }
                                    list12.add(ox8);
                                    cursor8 = cursor9;
                                }
                            } catch (IOException e3) {
                                cursor8 = query;
                                y1911.G().g1().c(pz8.k1(str23), e3, str20);
                            }
                            if (!cursor8.moveToNext()) {
                                break;
                            }
                            query = cursor8;
                            cursor12 = cursor8;
                        }
                        cursor8.close();
                        map = jsVar4;
                        uq8 e032 = v89.e0();
                        y19 = (y19) e032.w;
                        str2 = this.z;
                        e032.d1();
                        e032.b1();
                        z65.h(str2);
                        SQLiteDatabase T12 = e032.T1();
                        cursor = T12.query("audience_filter_values", new String[]{str22, "current_results"}, "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
                        if (cursor.moveToFirst()) {
                            Map map9 = Collections.EMPTY_MAP;
                            cursor.close();
                            jsVar = map9;
                            str4 = str20;
                            str3 = str21;
                            y192 = T12;
                        } else {
                            jsVar = new js();
                            y19 y1912 = y19;
                            while (true) {
                                try {
                                    int i = cursor.getInt(0);
                                    try {
                                        jsVar.put(Integer.valueOf(i), (f29) ((e29) y89.N1(f29.B(), cursor.getBlob(1))).d());
                                        str18 = str20;
                                        str3 = str21;
                                        str17 = str2;
                                    } catch (IOException e4) {
                                        str18 = str20;
                                        str3 = str21;
                                        try {
                                            str17 = str2;
                                            try {
                                                y1912.G().g1().d("Failed to merge filter results. appId, audienceId, error", pz8.k1(str2), Integer.valueOf(i), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                y197 = y1912;
                                                try {
                                                    y197.G().g1().c(pz8.k1(str17), e, "Database error querying filter results. appId");
                                                    ? r0 = Collections.EMPTY_MAP;
                                                    if (cursor != null) {
                                                    }
                                                    jsVar = r0;
                                                    str4 = str18;
                                                    y192 = y197;
                                                    if (jsVar.isEmpty()) {
                                                    }
                                                    String str242 = l2;
                                                    String str252 = str8;
                                                    String str262 = str3;
                                                    String str272 = str;
                                                    if (!list.isEmpty()) {
                                                    }
                                                    if (z2) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    if (cursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            y198 = y1912;
                                            str17 = str2;
                                            str18 = str18;
                                            y197 = y198;
                                            y197.G().g1().c(pz8.k1(str17), e, "Database error querying filter results. appId");
                                            ? r02 = Collections.EMPTY_MAP;
                                            if (cursor != null) {
                                            }
                                            jsVar = r02;
                                            str4 = str18;
                                            y192 = y197;
                                            if (jsVar.isEmpty()) {
                                            }
                                            String str2422 = l2;
                                            String str2522 = str8;
                                            String str2622 = str3;
                                            String str2722 = str;
                                            if (!list.isEmpty()) {
                                            }
                                            if (z2) {
                                            }
                                        }
                                    }
                                    if (!cursor.moveToNext()) {
                                        break;
                                    }
                                    str20 = str18;
                                    str21 = str3;
                                    str2 = str17;
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    y199 = y1912;
                                    str18 = str20;
                                    str3 = str21;
                                    y198 = y199;
                                    str17 = str2;
                                    str18 = str18;
                                    y197 = y198;
                                    y197.G().g1().c(pz8.k1(str17), e, "Database error querying filter results. appId");
                                    ? r022 = Collections.EMPTY_MAP;
                                    if (cursor != null) {
                                    }
                                    jsVar = r022;
                                    str4 = str18;
                                    y192 = y197;
                                    if (jsVar.isEmpty()) {
                                    }
                                    String str24222 = l2;
                                    String str25222 = str8;
                                    String str26222 = str3;
                                    String str27222 = str;
                                    if (!list.isEmpty()) {
                                    }
                                    if (z2) {
                                    }
                                }
                            }
                            cursor.close();
                            y192 = y1912;
                            str4 = str18;
                        }
                        if (jsVar.isEmpty()) {
                            str6 = str22;
                            y193 = y1910;
                            str8 = str4;
                            it = y192;
                        } else {
                            HashSet hashSet2 = new HashSet(jsVar.keySet());
                            if (z4) {
                                String str28 = this.z;
                                uq8 e04 = v89.e0();
                                String str29 = this.z;
                                e04.d1();
                                e04.b1();
                                z65.h(str29);
                                js jsVar5 = new js();
                                hashSet = hashSet2;
                                String str30 = str28;
                                try {
                                    cursor2 = e04.T1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str29, str29});
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor2.getInt(0));
                                                List list14 = (List) jsVar5.get(valueOf2);
                                                if (list14 == null) {
                                                    list14 = new ArrayList();
                                                    jsVar5.put(valueOf2, list14);
                                                }
                                                list14.add(Integer.valueOf(cursor2.getInt(1)));
                                            } while (cursor2.moveToNext());
                                            map5 = jsVar5;
                                        } else {
                                            map5 = Collections.EMPTY_MAP;
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                    }
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    cursor2 = null;
                                    try {
                                        ((y19) e04.w).G().g1().c(pz8.k1(str29), e, "Database error querying scoped filters. appId");
                                        Map map10 = Collections.EMPTY_MAP;
                                        map2 = map10;
                                        map5 = map10;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        Cursor cursor15 = cursor2;
                                        if (cursor15 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                }
                                cursor2.close();
                                map2 = map5;
                                z65.h(str30);
                                js jsVar6 = new js();
                                if (!jsVar.isEmpty()) {
                                    Iterator it7 = jsVar.keySet().iterator();
                                    Map map11 = map2;
                                    while (it7.hasNext()) {
                                        Integer num3 = (Integer) it7.next();
                                        num3.getClass();
                                        f29 f29 = (f29) jsVar.get(num3);
                                        List list15 = (List) map11.get(num3);
                                        if (list15 == null || list15.isEmpty()) {
                                            map4 = map11;
                                            it2 = it7;
                                            str7 = str22;
                                            y194 = y1910;
                                            jsVar6.put(num3, f29);
                                        } else {
                                            map4 = map11;
                                            it2 = it7;
                                            List J1 = v89.h0().J1((yl8) f29.v(), list15);
                                            if (!J1.isEmpty()) {
                                                e29 e29 = (e29) f29.k();
                                                e29.h();
                                                e29.b();
                                                str7 = str22;
                                                ((f29) e29.x).F(J1);
                                                List J12 = v89.h0().J1((yl8) f29.t(), list15);
                                                e29.g();
                                                e29.b();
                                                ((f29) e29.x).D(J12);
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it8 = f29.x().iterator();
                                                while (it8.hasNext()) {
                                                    Iterator it9 = it8;
                                                    e19 e19 = (e19) it8.next();
                                                    y19 y1913 = y1910;
                                                    if (!list15.contains(Integer.valueOf(e19.u()))) {
                                                        arrayList.add(e19);
                                                    }
                                                    it8 = it9;
                                                    y1910 = y1913;
                                                }
                                                y194 = y1910;
                                                e29.i();
                                                e29.b();
                                                ((f29) e29.x).H(arrayList);
                                                ArrayList arrayList2 = new ArrayList();
                                                for (i29 i29 : f29.z()) {
                                                    if (!list15.contains(Integer.valueOf(i29.u()))) {
                                                        arrayList2.add(i29);
                                                    }
                                                }
                                                e29.j();
                                                e29.b();
                                                ((f29) e29.x).J(arrayList2);
                                                jsVar6.put(num3, (f29) e29.d());
                                            } else {
                                                map3 = map4;
                                                it7 = it2;
                                                map11 = map3;
                                            }
                                        }
                                        map3 = map4;
                                        str22 = str7;
                                        it7 = it2;
                                        y1910 = y194;
                                        map11 = map3;
                                    }
                                }
                                str5 = str22;
                                y193 = y1910;
                                jsVar2 = jsVar6;
                            } else {
                                hashSet = hashSet2;
                                str5 = str22;
                                y193 = y1910;
                                jsVar2 = jsVar;
                            }
                            it = hashSet.iterator();
                            String str31 = str4;
                            while (it.hasNext()) {
                                Integer num4 = (Integer) it.next();
                                num4.getClass();
                                f29 f292 = (f29) jsVar2.get(num4);
                                BitSet bitSet = new BitSet();
                                BitSet bitSet2 = new BitSet();
                                js jsVar7 = new js();
                                if (!(f292 == null || f292.y() == 0)) {
                                    for (e19 e192 : f292.x()) {
                                        if (e192.t()) {
                                            f29 f293 = f292;
                                            Integer valueOf3 = Integer.valueOf(e192.u());
                                            if (e192.v()) {
                                                l3 = Long.valueOf(e192.w());
                                            } else {
                                                l3 = null;
                                            }
                                            jsVar7.put(valueOf3, l3);
                                            f292 = f293;
                                        }
                                    }
                                }
                                f29 f294 = f292;
                                js jsVar8 = new js();
                                if (!(f294 == null || f294.A() == 0)) {
                                    Iterator it10 = f294.z().iterator();
                                    while (it10.hasNext()) {
                                        i29 i292 = (i29) it10.next();
                                        if (i292.t() && i292.w() > 0) {
                                            jsVar8.put(Integer.valueOf(i292.u()), Long.valueOf(i292.x(i292.w() - 1)));
                                            it10 = it10;
                                            jsVar2 = jsVar2;
                                        }
                                    }
                                }
                                js jsVar9 = jsVar2;
                                if (f294 != null) {
                                    int i2 = 0;
                                    while (i2 < f294.u() * 64) {
                                        if (y89.H1((yl8) f294.t(), i2)) {
                                            z5 = n1;
                                            y193.G().j1().c(num4, Integer.valueOf(i2), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i2);
                                            if (y89.H1((yl8) f294.v(), i2)) {
                                                bitSet.set(i2);
                                                i2++;
                                                n1 = z5;
                                            }
                                        } else {
                                            z5 = n1;
                                        }
                                        jsVar7.remove(Integer.valueOf(i2));
                                        i2++;
                                        n1 = z5;
                                    }
                                }
                                boolean z8 = n1;
                                f29 f295 = (f29) jsVar.get(num4);
                                if (!(!n12 || !z8 || (list3 = (List) map.get(num4)) == null || this.D == null || this.C == null)) {
                                    for (ox8 ox82 : list3) {
                                        int u = ox82.u();
                                        Integer num5 = num4;
                                        long longValue = this.D.longValue() / 1000;
                                        if (ox82.C()) {
                                            longValue = this.C.longValue() / 1000;
                                        }
                                        Integer valueOf4 = Integer.valueOf(u);
                                        if (jsVar7.containsKey(valueOf4)) {
                                            jsVar7.put(valueOf4, Long.valueOf(longValue));
                                        }
                                        if (jsVar8.containsKey(valueOf4)) {
                                            jsVar8.put(valueOf4, Long.valueOf(longValue));
                                        }
                                        num4 = num5;
                                    }
                                }
                                js jsVar10 = jsVar;
                                boolean z9 = n12;
                                String str32 = str5;
                                String str33 = str31;
                                Long l4 = l2;
                                Map map12 = map;
                                String str34 = str3;
                                this.B.put(num4, new bd9(this, this.z, f295, bitSet, bitSet2, jsVar7, jsVar8));
                                map = map12;
                                n1 = z8;
                                jsVar = jsVar10;
                                n12 = z9;
                                str31 = str33;
                                jsVar2 = jsVar9;
                                str = jsVar10;
                            }
                            str6 = str5;
                            str = str;
                            str8 = str31;
                        }
                        String str242222 = l2;
                        String str252222 = str8;
                        String str262222 = str3;
                        String str272222 = str;
                        if (!list.isEmpty()) {
                            m22 m22 = new m22(this);
                            js jsVar11 = new js();
                            it = list.iterator();
                            List list16 = list;
                            String str35 = str;
                            while (it.hasNext()) {
                                h19 h19 = (h19) it.next();
                                h19 b = m22.b(this.z, h19);
                                if (b != null) {
                                    qr8 M1 = v89.e0().M1(this.z, h19, b.y());
                                    v89.e0().D1("events", M1);
                                    if (!z2) {
                                        long j2 = M1.c;
                                        String y = b.y();
                                        Map map13 = (Map) jsVar11.get(y);
                                        if (map13 == null) {
                                            uq8 e05 = v89.e0();
                                            qr8 = M1;
                                            y196 = (y19) e05.w;
                                            String str36 = this.z;
                                            e05.d1();
                                            e05.b1();
                                            z65.h(str36);
                                            z65.h(y);
                                            j = j2;
                                            js jsVar12 = new js();
                                            try {
                                                Cursor query2 = e05.T1().query("event_filters", new String[]{str6, str242222}, "app_id=? AND event_name=?", new String[]{str36, y}, (String) null, (String) null, (String) null);
                                                try {
                                                    List list17 = list16;
                                                    List list18 = list16;
                                                    String str37 = str8;
                                                    if (query2.moveToFirst()) {
                                                        String str38 = str36;
                                                        List list19 = list16;
                                                        while (true) {
                                                            str37 = str38;
                                                            list17 = list19;
                                                            list18 = list19;
                                                            try {
                                                                str37 = str38;
                                                                list17 = list19;
                                                                list18 = list19;
                                                                ox8 ox83 = (ox8) ((mx8) y89.N1(ox8.F(), query2.getBlob(1))).d();
                                                                Integer valueOf5 = Integer.valueOf(query2.getInt(0));
                                                                List list20 = (List) jsVar12.get(valueOf5);
                                                                if (list20 == null) {
                                                                    List list21 = query2;
                                                                    try {
                                                                        str37 = str38;
                                                                        list17 = list21;
                                                                        list18 = list21;
                                                                        list11 = new ArrayList();
                                                                        jsVar12.put(valueOf5, list11);
                                                                        list10 = list21;
                                                                    } catch (SQLiteException e10) {
                                                                        e = e10;
                                                                        list9 = list17;
                                                                        str16 = str37;
                                                                        cursor5 = list9;
                                                                        list8 = list9;
                                                                        try {
                                                                            y196.G().g1().c(pz8.k1(str16), e, str262222);
                                                                            map13 = Collections.EMPTY_MAP;
                                                                            list7 = list8;
                                                                            if (cursor5 != null) {
                                                                            }
                                                                            jsVar11.put(y, map13);
                                                                            list6 = list7;
                                                                            it5 = map13.keySet().iterator();
                                                                            String str39 = y196;
                                                                            while (it5.hasNext()) {
                                                                            }
                                                                            list5 = list6;
                                                                            str13 = it5;
                                                                            str12 = str39;
                                                                            list16 = list5;
                                                                            str35 = str12;
                                                                            str8 = str13;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            cursor4 = cursor5;
                                                                            if (cursor4 != null) {
                                                                                cursor4.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        List list22 = list18;
                                                                        cursor4 = list22;
                                                                        if (cursor4 != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    list10 = query2;
                                                                    list11 = list20;
                                                                }
                                                                list11.add(ox83);
                                                                r42 = list10;
                                                            } catch (IOException e11) {
                                                                r42 = query2;
                                                                y196.G().g1().c(pz8.k1(str38), e11, str252222);
                                                            }
                                                            if (!r42.moveToNext()) {
                                                                break;
                                                            }
                                                            query2 = r42;
                                                            list19 = r42;
                                                        }
                                                        r42.close();
                                                        map13 = jsVar12;
                                                        list7 = r42;
                                                        jsVar11.put(y, map13);
                                                        list6 = list7;
                                                    } else {
                                                        String str40 = str36;
                                                        ? r422 = query2;
                                                        str37 = str40;
                                                        list17 = r422;
                                                        list18 = r422;
                                                        map13 = Collections.EMPTY_MAP;
                                                        str37 = str40;
                                                        list17 = r422;
                                                        list18 = r422;
                                                        r422.close();
                                                        list7 = r422;
                                                        jsVar11.put(y, map13);
                                                        list6 = list7;
                                                    }
                                                } catch (SQLiteException e12) {
                                                    e = e12;
                                                    str16 = str36;
                                                    list9 = query2;
                                                    cursor5 = list9;
                                                    list8 = list9;
                                                    y196.G().g1().c(pz8.k1(str16), e, str262222);
                                                    map13 = Collections.EMPTY_MAP;
                                                    list7 = list8;
                                                    if (cursor5 != null) {
                                                    }
                                                    jsVar11.put(y, map13);
                                                    list6 = list7;
                                                    it5 = map13.keySet().iterator();
                                                    String str392 = y196;
                                                    while (it5.hasNext()) {
                                                    }
                                                    list5 = list6;
                                                    str13 = it5;
                                                    str12 = str392;
                                                    list16 = list5;
                                                    str35 = str12;
                                                    str8 = str13;
                                                } catch (Throwable th8) {
                                                }
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                str16 = str36;
                                                cursor5 = null;
                                                list8 = list16;
                                                y196.G().g1().c(pz8.k1(str16), e, str262222);
                                                map13 = Collections.EMPTY_MAP;
                                                list7 = list8;
                                                if (cursor5 != null) {
                                                    cursor5.close();
                                                    list7 = list8;
                                                }
                                                jsVar11.put(y, map13);
                                                list6 = list7;
                                                it5 = map13.keySet().iterator();
                                                String str3922 = y196;
                                                while (it5.hasNext()) {
                                                }
                                                list5 = list6;
                                                str13 = it5;
                                                str12 = str3922;
                                                list16 = list5;
                                                str35 = str12;
                                                str8 = str13;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                cursor4 = null;
                                                if (cursor4 != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            qr8 = M1;
                                            j = j2;
                                            list6 = list16;
                                            y196 = str35;
                                        }
                                        it5 = map13.keySet().iterator();
                                        String str39222 = y196;
                                        while (it5.hasNext()) {
                                            Integer num6 = (Integer) it5.next();
                                            int intValue = num6.intValue();
                                            if (this.A.contains(num6)) {
                                                y193.G().j1().b("Skipping failed audience ID", num6);
                                                str14 = str39222;
                                            } else {
                                                Iterator it11 = ((List) map13.get(num6)).iterator();
                                                boolean z10 = true;
                                                while (true) {
                                                    if (!it11.hasNext()) {
                                                        map7 = map13;
                                                        str15 = m22;
                                                        num2 = num6;
                                                        break;
                                                    }
                                                    ox8 ox84 = (ox8) it11.next();
                                                    String str41 = m22;
                                                    num2 = num6;
                                                    map7 = map13;
                                                    yi8 yi8 = new yi8(this, this.z, intValue, ox84, 0);
                                                    Long l5 = this.C;
                                                    Long l6 = this.D;
                                                    int u2 = ox84.u();
                                                    bd9 bd9 = (bd9) this.B.get(num2);
                                                    if (bd9 == null) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = bd9.d.get(u2);
                                                    }
                                                    z10 = yi8.i(l5, l6, b, j, qr8, z7);
                                                    yi8 yi82 = yi8;
                                                    if (!z10) {
                                                        this.A.add(num2);
                                                        str15 = str41;
                                                        break;
                                                    }
                                                    h1(num2).a(yi82);
                                                    num6 = num2;
                                                    map13 = map7;
                                                    m22 = str41;
                                                }
                                                if (!z10) {
                                                    this.A.add(num2);
                                                }
                                                m22 = str15;
                                                map13 = map7;
                                                str14 = str15;
                                            }
                                            str39222 = str14;
                                        }
                                        list5 = list6;
                                        str13 = it5;
                                        str12 = str39222;
                                    } else {
                                        list5 = list16;
                                        str12 = str35;
                                        str13 = str8;
                                    }
                                } else {
                                    list5 = list16;
                                    str12 = str35;
                                    str13 = str8;
                                }
                                list16 = list5;
                                str35 = str12;
                                str8 = str13;
                            }
                            str272222 = str35;
                        }
                        if (z2) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            js jsVar13 = new js();
                            Iterator it12 = list2.iterator();
                            String str42 = str272222;
                            while (it12.hasNext()) {
                                m29 m29 = (m29) it12.next();
                                String v = m29.v();
                                Map map14 = (Map) jsVar13.get(v);
                                if (map14 == null) {
                                    uq8 e06 = v89.e0();
                                    y19 y1914 = (y19) e06.w;
                                    String str43 = this.z;
                                    e06.d1();
                                    e06.b1();
                                    z65.h(str43);
                                    z65.h(v);
                                    js jsVar14 = new js();
                                    try {
                                        Cursor query3 = e06.T1().query("property_filters", new String[]{str6, str242222}, "app_id=? AND property_name=?", new String[]{str43, v}, (String) null, (String) null, (String) null);
                                        try {
                                            String str44 = str42;
                                            if (query3.moveToFirst()) {
                                                it = it12;
                                                String str45 = str42;
                                                while (true) {
                                                    str44 = str45;
                                                    try {
                                                        str44 = str45;
                                                        wx8 wx8 = (wx8) ((vx8) y89.N1(wx8.B(), query3.getBlob(1))).d();
                                                        Integer valueOf6 = Integer.valueOf(query3.getInt(0));
                                                        List list23 = (List) jsVar14.get(valueOf6);
                                                        if (list23 == null) {
                                                            str44 = y1914;
                                                            list4 = new ArrayList();
                                                            jsVar14.put(valueOf6, list4);
                                                        } else {
                                                            str44 = y1914;
                                                            list4 = list23;
                                                        }
                                                        list4.add(wx8);
                                                        str11 = str43;
                                                        y195 = str44;
                                                    } catch (IOException e14) {
                                                        y195 = y1914;
                                                        str11 = str43;
                                                        y195.G().g1().c(pz8.k1(str11), e14, "Failed to merge filter");
                                                    }
                                                    if (!query3.moveToNext()) {
                                                        break;
                                                    }
                                                    y1914 = y195;
                                                    str43 = str11;
                                                    str45 = y195;
                                                }
                                                query3.close();
                                                map14 = jsVar14;
                                                y195 = y195;
                                                jsVar13.put(v, map14);
                                                str9 = y195;
                                            } else {
                                                it = it12;
                                                y195 = y1914;
                                                str11 = str43;
                                                map14 = Collections.EMPTY_MAP;
                                                query3.close();
                                                jsVar13.put(v, map14);
                                                str9 = y195;
                                            }
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            it = it12;
                                            y19 y1915 = y1914;
                                            str11 = str43;
                                            y19 y1916 = y1915;
                                            cursor3 = query3;
                                            y195 = y1916;
                                            try {
                                                y195.G().g1().c(pz8.k1(str11), e, str262222);
                                                map14 = Collections.EMPTY_MAP;
                                                if (cursor3 != null) {
                                                }
                                                jsVar13.put(v, map14);
                                                str9 = y195;
                                                it3 = map14.keySet().iterator();
                                                str10 = str9;
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                    }
                                                    map14 = map6;
                                                    jsVar13 = jsVar3;
                                                    it3 = it4;
                                                    str10 = r41;
                                                }
                                                it12 = it;
                                                str42 = str10;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th11) {
                                        }
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        it = it12;
                                        y195 = y1914;
                                        str11 = str43;
                                        cursor3 = null;
                                        y195.G().g1().c(pz8.k1(str11), e, str262222);
                                        map14 = Collections.EMPTY_MAP;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        jsVar13.put(v, map14);
                                        str9 = y195;
                                        it3 = map14.keySet().iterator();
                                        str10 = str9;
                                        while (true) {
                                            if (it3.hasNext()) {
                                            }
                                            map14 = map6;
                                            jsVar13 = jsVar3;
                                            it3 = it4;
                                            str10 = r41;
                                        }
                                        it12 = it;
                                        str42 = str10;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        cursor3 = null;
                                        if (cursor3 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    it = it12;
                                    str9 = str42;
                                }
                                it3 = map14.keySet().iterator();
                                str10 = str9;
                                while (true) {
                                    if (it3.hasNext()) {
                                        break;
                                    }
                                    Integer num7 = (Integer) it3.next();
                                    int intValue2 = num7.intValue();
                                    if (this.A.contains(num7)) {
                                        y193.G().j1().b("Skipping failed audience ID", num7);
                                        break;
                                    }
                                    Iterator it13 = ((List) map14.get(num7)).iterator();
                                    boolean z11 = true;
                                    yi8 yi83 = str10;
                                    while (true) {
                                        if (!it13.hasNext()) {
                                            map6 = map14;
                                            jsVar3 = jsVar13;
                                            it4 = it3;
                                            yi83 = yi83;
                                            break;
                                        }
                                        wx8 wx82 = (wx8) it13.next();
                                        map6 = map14;
                                        if (Log.isLoggable(y193.G().m1(), 2)) {
                                            mz8 j1 = y193.G().j1();
                                            if (wx82.t()) {
                                                num = Integer.valueOf(wx82.u());
                                            } else {
                                                num = null;
                                            }
                                            jsVar3 = jsVar13;
                                            it4 = it3;
                                            j1.d("Evaluating filter. audience, filter, property", num7, num, y193.h().c(wx82.v()));
                                            y193.G().j1().b("Filter definition", v89.h0().E1(wx82));
                                        } else {
                                            jsVar3 = jsVar13;
                                            it4 = it3;
                                        }
                                        if (wx82.t() && wx82.u() <= 256) {
                                            int i3 = intValue2;
                                            yi83 = new yi8(this, this.z, i3, wx82, 1);
                                            yi8 yi84 = yi83;
                                            int i4 = i3;
                                            Long l7 = this.C;
                                            Long l8 = this.D;
                                            int u3 = wx82.u();
                                            bd9 bd92 = (bd9) this.B.get(num7);
                                            if (bd92 == null) {
                                                z6 = false;
                                            } else {
                                                z6 = bd92.d.get(u3);
                                            }
                                            z11 = yi84.j(l7, l8, m29, z6);
                                            if (!z11) {
                                                this.A.add(num7);
                                                break;
                                            }
                                            h1(num7).a(yi84);
                                            intValue2 = i4;
                                            map14 = map6;
                                            jsVar13 = jsVar3;
                                            it3 = it4;
                                        } else {
                                            mz8 h1 = y193.G().h1();
                                            nz8 k1 = pz8.k1(this.z);
                                        }
                                    }
                                    if (z11) {
                                        map14 = map6;
                                        jsVar13 = jsVar3;
                                        it3 = it4;
                                        str10 = yi83;
                                    }
                                    this.A.add(num7);
                                    yi83 = yi83;
                                    map14 = map6;
                                    jsVar13 = jsVar3;
                                    it3 = it4;
                                    str10 = yi83;
                                }
                                it12 = it;
                                str42 = str10;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        fs fsVar = (fs) this.B.keySet();
                        fsVar.removeAll(this.A);
                        Iterator it14 = fsVar.iterator();
                        while (it14.hasNext()) {
                            Integer num8 = (Integer) it14.next();
                            int intValue3 = num8.intValue();
                            bd9 bd93 = (bd9) this.B.get(num8);
                            z65.k(bd93);
                            n09 b2 = bd93.b(intValue3);
                            arrayList3.add(b2);
                            uq8 e07 = v89.e0();
                            y19 y1917 = (y19) e07.w;
                            String str46 = this.z;
                            f29 v2 = b2.v();
                            e07.d1();
                            e07.b1();
                            z65.h(str46);
                            z65.k(v2);
                            byte[] a = v2.a();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", str46);
                            contentValues2.put(str6, num8);
                            contentValues2.put("current_results", a);
                            try {
                                try {
                                    if (e07.T1().insertWithOnConflict("audience_filter_values", (String) null, contentValues2, 5) == -1) {
                                        y1917.G().g1().b("Failed to insert filter results (got -1). appId", pz8.k1(str46));
                                    }
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    y1917.G().g1().c(pz8.k1(str46), e, "Error storing filter results. appId");
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                y1917.G().g1().c(pz8.k1(str46), e, "Error storing filter results. appId");
                            }
                        }
                        return arrayList3;
                    }
                    l2 = "data";
                    query.close();
                } catch (SQLiteException e20) {
                    e = e20;
                    l2 = "data";
                    cursor7 = query;
                    cursor6 = cursor7;
                    y1911.G().g1().c(pz8.k1(str23), e, str21);
                    map8 = Collections.EMPTY_MAP;
                    if (cursor6 != null) {
                    }
                    map = map8;
                    uq8 e0322 = v89.e0();
                    y19 = (y19) e0322.w;
                    str2 = this.z;
                    e0322.d1();
                    e0322.b1();
                    z65.h(str2);
                    SQLiteDatabase T122 = e0322.T1();
                    cursor = T122.query("audience_filter_values", new String[]{str22, "current_results"}, "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
                    if (cursor.moveToFirst()) {
                    }
                    if (jsVar.isEmpty()) {
                    }
                    String str2422222 = l2;
                    String str2522222 = str8;
                    String str2622222 = str3;
                    String str2722222 = str;
                    if (!list.isEmpty()) {
                    }
                    if (z2) {
                    }
                } catch (Throwable th13) {
                }
            } catch (SQLiteException e21) {
                e = e21;
                l2 = "data";
                cursor6 = null;
                y1911.G().g1().c(pz8.k1(str23), e, str21);
                map8 = Collections.EMPTY_MAP;
                if (cursor6 != null) {
                }
                map = map8;
                uq8 e03222 = v89.e0();
                y19 = (y19) e03222.w;
                str2 = this.z;
                e03222.d1();
                e03222.b1();
                z65.h(str2);
                SQLiteDatabase T1222 = e03222.T1();
                cursor = T1222.query("audience_filter_values", new String[]{str22, "current_results"}, "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                }
                if (jsVar.isEmpty()) {
                }
                String str24222222 = l2;
                String str25222222 = str8;
                String str26222222 = str3;
                String str27222222 = str;
                if (!list.isEmpty()) {
                }
                if (z2) {
                }
            } catch (Throwable th14) {
                th = th14;
                cursor6 = null;
                if (cursor6 != null) {
                }
                throw th;
            }
        }
        map = map8;
        uq8 e032222 = v89.e0();
        y19 = (y19) e032222.w;
        str2 = this.z;
        e032222.d1();
        e032222.b1();
        z65.h(str2);
        SQLiteDatabase T12222 = e032222.T1();
        try {
            cursor = T12222.query("audience_filter_values", new String[]{str22, "current_results"}, "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
            try {
                if (cursor.moveToFirst()) {
                }
            } catch (SQLiteException e22) {
                e = e22;
                y199 = y19;
                str18 = str20;
                str3 = str21;
                y198 = y199;
                str17 = str2;
                str18 = str18;
                y197 = y198;
                y197.G().g1().c(pz8.k1(str17), e, "Database error querying filter results. appId");
                ? r0222 = Collections.EMPTY_MAP;
                if (cursor != null) {
                }
                jsVar = r0222;
                str4 = str18;
                y192 = y197;
                if (jsVar.isEmpty()) {
                }
                String str242222222 = l2;
                String str252222222 = str8;
                String str262222222 = str3;
                String str272222222 = str;
                if (!list.isEmpty()) {
                }
                if (z2) {
                }
            }
        } catch (SQLiteException e23) {
            e = e23;
            y197 = y19;
            str18 = str20;
            str3 = str21;
            str17 = str2;
            cursor = null;
            y197.G().g1().c(pz8.k1(str17), e, "Database error querying filter results. appId");
            ? r02222 = Collections.EMPTY_MAP;
            if (cursor != null) {
                cursor.close();
            }
            jsVar = r02222;
            str4 = str18;
            y192 = y197;
            if (jsVar.isEmpty()) {
            }
            String str2422222222 = l2;
            String str2522222222 = str8;
            String str2622222222 = str3;
            String str2722222222 = str;
            if (!list.isEmpty()) {
            }
            if (z2) {
            }
        } catch (Throwable th15) {
            th = th15;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (jsVar.isEmpty()) {
        }
        String str24222222222 = l2;
        String str25222222222 = str8;
        String str26222222222 = str3;
        String str27222222222 = str;
        if (!list.isEmpty()) {
        }
        if (z2) {
        }
    }

    public final bd9 h1(Integer num) {
        if (this.B.containsKey(num)) {
            return (bd9) this.B.get(num);
        }
        bd9 bd9 = new bd9(this, this.z);
        this.B.put(num, bd9);
        return bd9;
    }

    public final void f1() {
    }
}

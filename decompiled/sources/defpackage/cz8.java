package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* renamed from: cz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz8 extends fy8 {
    public static final String[] A = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final tq8 y = new tq8(this, ((y19) this.w).w);
    public boolean z;

    public cz8(y19 y19) {
        super(y19);
    }

    public final boolean f1() {
        return false;
    }

    public final void g1() {
        int delete;
        y19 y19 = (y19) this.w;
        b1();
        try {
            SQLiteDatabase i1 = i1();
            if (i1 != null && (delete = i1.delete("messages", (String) null, (String[]) null)) > 0) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.J.b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Error resetting local analytics data. error", e);
        }
    }

    public final void h1() {
        y19 y19 = (y19) this.w;
        b1();
        if (!this.z && y19.w.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase i1 = i1();
                    if (i1 == null) {
                        this.z = true;
                        return;
                    }
                    i1.beginTransaction();
                    i1.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    i1.setTransactionSuccessful();
                    i1.endTransaction();
                    i1.close();
                    return;
                } catch (SQLiteFullException e) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.b("Error deleting app launch break from local database", e);
                    this.z = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.b("Error deleting app launch break from local database", e2);
                    this.z = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.E.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase i1() {
        if (this.z) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.z = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v15, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v21, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v22, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v23, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v25, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016a, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010a, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0124, code lost:
        if (r10.inTransaction() != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0126, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0139, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014b, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0154, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0170 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0170 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0120 A[SYNTHETIC, Splitter:B:77:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), PHI: r20 
      PHI: (r20v10 byte[]) = (r20v1 byte[]), (r20v23 byte[]) binds: [B:49:0x00d8, B:52:0x00de] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:49:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x014b  */
    public final boolean j1(int i, byte[] bArr) {
        z99 z99;
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        Cursor cursor;
        boolean z3;
        y19 y19 = (y19) this.w;
        b1();
        boolean z4 = false;
        if (!this.z) {
            tp8 tp8 = y19.z;
            pz8 pz8 = y19.B;
            ay8 ay8 = by8.W0;
            Cursor cursor2 = null;
            if (tp8.n1((String) null, ay8)) {
                z99 = y19.l().g1((String) null);
            } else {
                z99 = null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (y19.z.n1((String) null, ay8) && z99 != null) {
                contentValues.put("app_version", z99.y);
                contentValues.put("app_version_int", Long.valueOf(z99.F));
            }
            int i2 = 5;
            int i3 = 5;
            int i4 = 0;
            while (i4 < i2) {
                try {
                    sQLiteDatabase = i1();
                    if (sQLiteDatabase == null) {
                        try {
                            this.z = true;
                        } catch (SQLiteFullException e) {
                            e = e;
                            z2 = z4;
                            bArr = 1;
                            cursor = null;
                            y19.g(pz8);
                            pz8.B.b("Error writing entry; local database full", e);
                            this.z = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i4++;
                            z4 = z2;
                            i2 = 5;
                            bArr = r20;
                        } catch (SQLiteDatabaseLockedException unused) {
                            z2 = z4;
                            cursor = null;
                            SystemClock.sleep((long) i3);
                            i3 += 20;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i4++;
                            z4 = z2;
                            i2 = 5;
                            bArr = r20;
                        } catch (SQLiteException e2) {
                            e = e2;
                            z2 = z4;
                            r20 = 1;
                            cursor = null;
                            if (sQLiteDatabase != null) {
                            }
                            y19.g(pz8);
                            pz8.B.b("Error writing entry to local database", e);
                            this.z = r20;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i4++;
                            z4 = z2;
                            i2 = 5;
                            bArr = r20;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    } else {
                        sQLiteDatabase.beginTransaction();
                        cursor = sQLiteDatabase.rawQuery("select count(1) from messages", (String[]) null);
                        long j = 0;
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    j = cursor.getLong(z4);
                                }
                            } catch (SQLiteFullException e3) {
                                e = e3;
                                z2 = z4;
                                bArr = 1;
                                y19.g(pz8);
                                pz8.B.b("Error writing entry; local database full", e);
                                this.z = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i4++;
                                z4 = z2;
                                i2 = 5;
                                bArr = r20;
                            } catch (SQLiteDatabaseLockedException unused2) {
                                z2 = z4;
                                SystemClock.sleep((long) i3);
                                i3 += 20;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i4++;
                                z4 = z2;
                                i2 = 5;
                                bArr = r20;
                            } catch (SQLiteException e4) {
                                e = e4;
                                z2 = z4;
                                r20 = 1;
                                if (sQLiteDatabase != null) {
                                }
                                y19.g(pz8);
                                pz8.B.b("Error writing entry to local database", e);
                                this.z = r20;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i4++;
                                z4 = z2;
                                i2 = 5;
                                bArr = r20;
                            }
                        }
                        if (j >= 100000) {
                            y19.g(pz8);
                            pz8.B.a("Data loss, local db full");
                            long j2 = 100001 - j;
                            long delete = (long) sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                            if (delete != j2) {
                                y19.g(pz8);
                                z2 = z4;
                                try {
                                    byte[] bArr2 = 1;
                                    bArr = bArr2;
                                    bArr = bArr2;
                                    bArr = bArr2;
                                    pz8.B.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                    z3 = bArr2;
                                    sQLiteDatabase.insertOrThrow("messages", (String) null, contentValues);
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    sQLiteDatabase.close();
                                    return z3;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    bArr = bArr;
                                    y19.g(pz8);
                                    pz8.B.b("Error writing entry; local database full", e);
                                    this.z = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i4++;
                                    z4 = z2;
                                    i2 = 5;
                                    bArr = r20;
                                } catch (SQLiteDatabaseLockedException unused3) {
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    r20 = bArr;
                                    if (sQLiteDatabase != null) {
                                    }
                                    y19.g(pz8);
                                    pz8.B.b("Error writing entry to local database", e);
                                    this.z = r20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i4++;
                                    z4 = z2;
                                    i2 = 5;
                                    bArr = r20;
                                }
                            }
                        }
                        boolean z5 = z4;
                        z3 = 1;
                        sQLiteDatabase.insertOrThrow("messages", (String) null, contentValues);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor != null) {
                        }
                        sQLiteDatabase.close();
                        return z3;
                    }
                } catch (SQLiteFullException e7) {
                    e = e7;
                    z2 = z4;
                    sQLiteDatabase = null;
                    cursor = null;
                    y19.g(pz8);
                    pz8.B.b("Error writing entry; local database full", e);
                    this.z = true;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i4++;
                    z4 = z2;
                    i2 = 5;
                    bArr = r20;
                } catch (SQLiteDatabaseLockedException unused4) {
                    z2 = z4;
                    sQLiteDatabase = null;
                    cursor = null;
                    SystemClock.sleep((long) i3);
                    i3 += 20;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i4++;
                    z4 = z2;
                    i2 = 5;
                    bArr = r20;
                } catch (SQLiteException e8) {
                    e = e8;
                    z2 = z4;
                    r20 = 1;
                    sQLiteDatabase = null;
                    cursor = null;
                    if (sQLiteDatabase != null) {
                    }
                    y19.g(pz8);
                    pz8.B.b("Error writing entry to local database", e);
                    this.z = r20;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i4++;
                    z4 = z2;
                    i2 = 5;
                    bArr = r20;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = null;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            }
            boolean z6 = z4;
            y19.g(pz8);
            pz8.J.a("Failed to write entry to local database");
            return z6;
        }
        return z4;
    }
}

package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: jl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jl2 {
    public static final kd4 a = new kd4(2);
    public static final wh b = new wh(4);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r3 = r2.e;
     */
    public static cm2 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(f55.v("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                kl2 kl2 = (kl2) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = mq7.c(str)) == null || mq7.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), kl2, context.getResources());
                    if (b2 == null) {
                        return new cm2();
                    }
                    arrayList.add(c(context, kl2, b2.authority));
                } else {
                    arrayList.add(new dm2[]{new dm2(str, kl2.f)});
                }
            }
            cm2 cm2 = new cm2(arrayList);
            Trace.endSection();
            return cm2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, il2] */
    public static ProviderInfo b(PackageManager packageManager, kl2 kl2, Resources resources) {
        wh whVar = b;
        kd4 kd4 = a;
        Trace.beginSection(f55.v("FontProvider.getProvider"));
        try {
            List list = kl2.d;
            String str = kl2.a;
            String str2 = kl2.b;
            if (list == null) {
                list = ed1.z(resources, 0);
            }
            ? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) kd4.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(str2)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                Collections.sort(arrayList, whVar);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, whVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                i2++;
                            }
                        }
                        kd4.l(obj, resolveContentProvider);
                        Trace.endSection();
                        return resolveContentProvider;
                    }
                }
                Trace.endSection();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static dm2[] c(Context context, kl2 kl2, String str) {
        ContentProviderClient acquireUnstableContentProviderClient;
        Cursor cursor;
        String[] strArr;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        kl2 kl22 = kl2;
        String str2 = str;
        Trace.beginSection(f55.v("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            cursor = null;
            String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(f55.v("ContentQueryWrapper.query"));
            try {
                String str3 = kl22.f;
                String str4 = kl22.c;
                if (str3 != null) {
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int codePointAt = str3.codePointAt(i4);
                        if (!Character.isWhitespace(codePointAt)) {
                            strArr = new String[]{str4, "VF"};
                            break;
                        }
                        i4 += Character.charCount(codePointAt);
                    }
                }
                strArr = new String[]{str4};
                String[] strArr3 = strArr;
                if (acquireUnstableContentProviderClient != null) {
                    cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, (String) null, (CancellationSignal) null);
                }
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i3 = cursor.getInt(columnIndex5);
                    } else {
                        i3 = 400;
                    }
                    int i5 = i3;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList.add(new dm2(uri, i2, i5, z, kl22.f, i));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            dm2[] dm2Arr = (dm2[]) arrayList.toArray(new dm2[0]);
            Trace.endSection();
            return dm2Arr;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}

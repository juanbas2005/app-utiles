package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.ContactsContract;
import android.util.Log;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: s8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s8 extends hj8 {
    public final /* synthetic */ int u;

    public /* synthetic */ s8(int i) {
        this.u = i;
    }

    public ns8 A(Context context, Object obj) {
        switch (this.u) {
            case b85.b:
                ((String[]) obj).getClass();
                return null;
            case 1:
                ((sg5) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new ns8(2, (Object) b42.w);
                }
                for (String k : strArr) {
                    if (ag8.k(context, k) != 0) {
                        return null;
                    }
                }
                int F = tf4.F(strArr.length);
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (String put : strArr) {
                    linkedHashMap.put(put, Boolean.TRUE);
                }
                return new ns8(2, (Object) linkedHashMap);
            case 3:
                String str = (String) obj;
                str.getClass();
                if (ag8.k(context, str) == 0) {
                    return new ns8(2, (Object) Boolean.TRUE);
                }
                return null;
            default:
                return super.A(context, obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object D(Intent intent, int i) {
        Intent intent2;
        Intent intent3;
        List list;
        boolean z;
        ? r1 = 0;
        Integer num = null;
        switch (this.u) {
            case b85.b:
                Intent intent4 = intent;
                if (i == -1) {
                    intent2 = intent4;
                } else {
                    intent2 = null;
                }
                if (intent2 != null) {
                    return intent2.getData();
                }
                return null;
            case 1:
                Intent intent5 = intent;
                if (i == -1) {
                    intent3 = intent5;
                } else {
                    intent3 = null;
                }
                if (intent3 == null) {
                    return null;
                }
                Uri data = intent3.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent3.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent3.getClipData();
                if (clipData != null || !linkedHashSet.isEmpty()) {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        while (r1 < itemCount) {
                            Uri uri = clipData.getItemAt(r1).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                            r1++;
                        }
                    }
                    list = new ArrayList(linkedHashSet);
                } else {
                    list = a42.w;
                }
                return (Uri) dt0.y0(list);
            case 2:
                Intent intent6 = intent;
                if (i == -1 && intent6 != null) {
                    String[] stringArrayExtra = intent6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent6.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (!(intArrayExtra == null || stringArrayExtra == null)) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            if (i2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        return sf4.a0(dt0.i1(qs.V0(stringArrayExtra), arrayList));
                    }
                }
                return b42.w;
            case 3:
                Intent intent7 = intent;
                if (intent7 == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent7.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (intArrayExtra2[i3] == 0) {
                                r1 = 1;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(r1);
            case 4:
                return new q8(intent, i);
            case 5:
                return new q8(intent, i);
            case 6:
                Intent intent8 = intent;
                if (i != -1 || intent8 == null) {
                    return null;
                }
                return intent8.getData();
            default:
                if (i != -1) {
                    return new zf6((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
                }
                String stringExtra = intent.getStringExtra("SCAN_RESULT");
                String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
                byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
                int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
                if (intExtra != Integer.MIN_VALUE) {
                    num = Integer.valueOf(intExtra);
                }
                return new zf6(stringExtra, stringExtra2, byteArrayExtra, num, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
        }
    }

    public final Intent s(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.u) {
            case b85.b:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                sg5 sg5 = (sg5) obj;
                sg5.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(kl8.y(sg5.a));
                    sg5.b.getClass();
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                } else if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                    ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                    if (resolveActivity != null) {
                        ActivityInfo activityInfo = resolveActivity.activityInfo;
                        Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                        intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        intent2.setType(kl8.y(sg5.a));
                        sg5.b.getClass();
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        return intent2;
                    }
                    h.s("Required value was null.");
                    return null;
                } else {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(kl8.y(sg5.a));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
            case 2:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                putExtra.getClass();
                return putExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
            case 4:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            case 5:
                bf3 bf3 = (bf3) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = bf3.x;
                if (!(intent6 == null || (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        bf3 = new bf3(bf3.w, (Intent) null, bf3.y, bf3.z);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", bf3);
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
            case 6:
                ((vs7) obj).getClass();
                return new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
            default:
                ag6 ag6 = (ag6) obj;
                ag6.getClass();
                if (ag6.c == null) {
                    ag6.c = CaptureActivity.class;
                }
                Intent intent7 = new Intent(context, ag6.c);
                intent7.setAction("com.google.zxing.client.android.SCAN");
                if (ag6.b != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : ag6.b) {
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append(str2);
                    }
                    intent7.putExtra("SCAN_FORMATS", sb.toString());
                }
                intent7.addFlags(67108864);
                intent7.addFlags(524288);
                for (Map.Entry entry : ag6.a.entrySet()) {
                    String str3 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        intent7.putExtra(str3, (Integer) value);
                    } else if (value instanceof Long) {
                        intent7.putExtra(str3, (Long) value);
                    } else if (value instanceof Boolean) {
                        intent7.putExtra(str3, (Boolean) value);
                    } else if (value instanceof Double) {
                        intent7.putExtra(str3, (Double) value);
                    } else if (value instanceof Float) {
                        intent7.putExtra(str3, (Float) value);
                    } else if (value instanceof Bundle) {
                        intent7.putExtra(str3, (Bundle) value);
                    } else if (value instanceof int[]) {
                        intent7.putExtra(str3, (int[]) value);
                    } else if (value instanceof long[]) {
                        intent7.putExtra(str3, (long[]) value);
                    } else if (value instanceof boolean[]) {
                        intent7.putExtra(str3, (boolean[]) value);
                    } else if (value instanceof double[]) {
                        intent7.putExtra(str3, (double[]) value);
                    } else if (value instanceof float[]) {
                        intent7.putExtra(str3, (float[]) value);
                    } else if (value instanceof String[]) {
                        intent7.putExtra(str3, (String[]) value);
                    } else {
                        intent7.putExtra(str3, value.toString());
                    }
                }
                return intent7;
        }
    }

    public /* synthetic */ s8(boolean z, int i) {
        this.u = i;
    }
}

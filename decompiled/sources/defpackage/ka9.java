package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* renamed from: ka9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ka9 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public ka9(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            za9 za9 = (za9) it.next();
            if (TextUtils.isEmpty(za9.g())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                za9 za92 = (za9) this.a.put(za9.g(), za9);
                if (za92 != null) {
                    String canonicalName = za92.getClass().getCanonicalName();
                    String canonicalName2 = za9.getClass().getCanonicalName();
                    h.q(pb4.n(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            this.c.addAll(list);
            return;
        }
        throw pb4.g(it2);
    }

    public final Object a(Uri uri, ja9 ja9) {
        return ja9.d(b(uri));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [ia9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v7, types: [ia9, java.lang.Object] */
    public final ia9 b(Uri uri) {
        List list;
        m93 m93 = q93.x;
        ie1.z(4, "initialCapacity");
        Object[] objArr = new Object[4];
        ie1.z(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            list = i36.A;
        } else {
            list = q93.s(new l07(new za0(new uy5(4, (Object) new co0("+".charAt(0))), true), encodedFragment.substring(10)));
        }
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            String str = (String) list.get(i);
            Matcher matcher = wa9.a.matcher(str);
            if (matcher.matches()) {
                Object group = matcher.group(1);
                group.getClass();
                int i3 = i2 + 1;
                if (objArr2.length < i3) {
                    objArr2 = Arrays.copyOf(objArr2, i93.d(objArr2.length, i3));
                }
                objArr2[i2] = group;
                i++;
                i2++;
            } else {
                h.q("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
        }
        i36 p = q93.p(i2, objArr2);
        if (p.z <= 0) {
            q93 x = q93.p(0, objArr).x();
            ? obj = new Object();
            String scheme = uri.getScheme();
            za9 za9 = (za9) this.a.get(scheme);
            if (za9 != null) {
                obj.a = za9;
                obj.c = this.c;
                obj.b = x;
                if (!x.isEmpty()) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                        String str2 = (String) arrayList.get(arrayList.size() - 1);
                        ListIterator listIterator = x.listIterator(x.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous() != null) {
                                ku4.a();
                                return null;
                            }
                        }
                        arrayList.set(arrayList.size() - 1, str2);
                        uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment((String) null).build();
                    }
                }
                obj.d = uri;
                ? obj2 = new Object();
                obj2.a = obj.a;
                obj2.b = obj.b;
                obj2.c = obj.c;
                obj2.d = obj.d;
                return obj2;
            }
            throw new IOException(b81.y("Requested backend isn't registered: ", scheme));
        }
        String str3 = (String) p.get(0);
        if (this.b.get(str3) != null) {
            ku4.a();
            return null;
        }
        String valueOf = String.valueOf(uri);
        throw new IOException(pb4.n(new StringBuilder(str3.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str3, ": ", valueOf));
    }
}

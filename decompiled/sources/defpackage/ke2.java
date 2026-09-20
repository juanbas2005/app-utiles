package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ke2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ke2 {
    public final nu5 a;
    public Integer b = null;

    public ke2(nu5 nu5) {
        this.a = nu5;
    }

    public static boolean a(ArrayList arrayList, a4 a4Var) {
        String str = a4Var.a;
        String str2 = a4Var.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a4 a4Var2 = (a4) it.next();
            if (a4Var2.a.equals(str) && a4Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [zb, java.lang.Object] */
    public final ArrayList b() {
        bc bcVar = (bc) ((ac) this.a.get());
        bcVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bcVar.a.a.f("frc", "")) {
            s93 s93 = at8.a;
            z65.k(bundle);
            ? obj = new Object();
            Class<String> cls = String.class;
            String str = (String) p25.I(bundle, "origin", cls, (Object) null);
            z65.k(str);
            obj.a = str;
            String str2 = (String) p25.I(bundle, "name", cls, (Object) null);
            z65.k(str2);
            obj.b = str2;
            obj.c = p25.I(bundle, "value", Object.class, (Object) null);
            obj.d = (String) p25.I(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            obj.e = ((Long) p25.I(bundle, "trigger_timeout", cls2, 0L)).longValue();
            obj.f = (String) p25.I(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            obj.g = (Bundle) p25.I(bundle, "timed_out_event_params", cls3, (Object) null);
            obj.h = (String) p25.I(bundle, "triggered_event_name", cls, (Object) null);
            obj.i = (Bundle) p25.I(bundle, "triggered_event_params", cls3, (Object) null);
            obj.j = ((Long) p25.I(bundle, "time_to_live", cls2, 0L)).longValue();
            obj.k = (String) p25.I(bundle, "expired_event_name", cls, (Object) null);
            obj.l = (Bundle) p25.I(bundle, "expired_event_params", cls3, (Object) null);
            obj.n = ((Boolean) p25.I(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.m = ((Long) p25.I(bundle, "creation_timestamp", cls2, 0L)).longValue();
            obj.o = ((Long) p25.I(bundle, "triggered_timestamp", cls2, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0268 A[Catch:{ IOException | ClassNotFoundException -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026d A[Catch:{ IOException | ClassNotFoundException -> 0x0271 }] */
    public final void c(ArrayList arrayList) {
        String str;
        String str2;
        String str3;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream2;
        String str4;
        Object obj;
        nu5 nu5 = this.a;
        if (nu5.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str5 = "";
                if (it.hasNext()) {
                    Map map = (Map) it.next();
                    String[] strArr = a4.g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = a4.g;
                    for (int i = 0; i < 5; i++) {
                        String str6 = strArr2[i];
                        if (!map.containsKey(str6)) {
                            arrayList3.add(str6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = a4.h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str7 = (String) map.get("experimentId");
                            String str8 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str5 = map.get("triggerEvent");
                            }
                            arrayList2.add(new a4(str7, str8, str5, parse, parseLong, parseLong2));
                        } catch (ParseException e) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e);
                        } catch (NumberFormatException e2) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e2);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList3}));
                    }
                } else {
                    String str9 = null;
                    if (arrayList2.isEmpty()) {
                        if (nu5.get() != null) {
                            Iterator it2 = b().iterator();
                            while (it2.hasNext()) {
                                String str10 = ((zb) it2.next()).b;
                                yw8 yw8 = ((bc) ((ac) nu5.get())).a.a;
                                yw8.c(new mv8(yw8, str10, (String) null, (Bundle) null, 0));
                            }
                            return;
                        }
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    } else if (nu5.get() != null) {
                        ArrayList b2 = b();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = b2.iterator();
                        while (it3.hasNext()) {
                            zb zbVar = (zb) it3.next();
                            String[] strArr3 = a4.g;
                            String str11 = zbVar.d;
                            if (str11 != null) {
                                str4 = str11;
                            } else {
                                str4 = str5;
                            }
                            new a4(zbVar.b, String.valueOf(zbVar.c), str4, new Date(zbVar.m), zbVar.e, zbVar.j);
                            arrayList4.add(obj);
                            str9 = str9;
                        }
                        String str12 = str9;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            a4 a4Var = (a4) it4.next();
                            if (!a(arrayList2, a4Var)) {
                                arrayList5.add(a4Var.a());
                            }
                        }
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            String str13 = ((zb) it5.next()).b;
                            yw8 yw82 = ((bc) ((ac) nu5.get())).a.a;
                            yw82.c(new mv8(yw82, str13, str12, str12, 0));
                        }
                        String str14 = str12;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            a4 a4Var2 = (a4) it6.next();
                            if (!a(arrayList4, a4Var2)) {
                                arrayList6.add(a4Var2);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(b());
                        if (this.b == null) {
                            this.b = Integer.valueOf(((bc) ((ac) nu5.get())).a.a.b("frc"));
                        }
                        int intValue = this.b.intValue();
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            a4 a4Var3 = (a4) it7.next();
                            while (arrayDeque.size() >= intValue) {
                                String str15 = ((zb) arrayDeque.pollFirst()).b;
                                yw8 yw83 = ((bc) ((ac) nu5.get())).a.a;
                                yw83.c(new mv8(yw83, str15, str14, str14, 0));
                            }
                            zb a2 = a4Var3.a();
                            bc bcVar = (bc) ((ac) nu5.get());
                            bcVar.getClass();
                            s93 s93 = at8.a;
                            String str16 = a2.a;
                            if (!str16.isEmpty()) {
                                Object obj2 = a2.c;
                                if (obj2 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                        try {
                                            objectOutputStream2.writeObject(obj2);
                                            objectOutputStream2.flush();
                                            objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                        } catch (Throwable th) {
                                            th = th;
                                            objectInputStream = str14;
                                            objectOutputStream = objectOutputStream2;
                                            if (objectOutputStream != 0) {
                                                objectOutputStream.close();
                                            }
                                            if (objectInputStream != 0) {
                                                objectInputStream.close();
                                            }
                                            throw th;
                                        }
                                        try {
                                            Object obj3 = objectInputStream2.readObject();
                                            try {
                                                objectOutputStream2.close();
                                                objectInputStream2.close();
                                            } catch (IOException | ClassNotFoundException unused) {
                                                obj3 = str14;
                                            }
                                            if (obj3 == null) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            objectOutputStream = objectOutputStream2;
                                            objectInputStream = objectInputStream2;
                                            if (objectOutputStream != 0) {
                                            }
                                            if (objectInputStream != 0) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        String str17 = str14;
                                        objectInputStream = str17;
                                        objectOutputStream = str17;
                                        if (objectOutputStream != 0) {
                                        }
                                        if (objectInputStream != 0) {
                                        }
                                        throw th;
                                    }
                                }
                                if (at8.a(str16) && at8.c(str16, a2.b) && (((str = a2.k) == null || (at8.b(str, a2.l) && at8.d(str16, a2.k, a2.l))) && (((str2 = a2.h) == null || (at8.b(str2, a2.i) && at8.d(str16, a2.h, a2.i))) && ((str3 = a2.f) == null || (at8.b(str3, a2.g) && at8.d(str16, a2.f, a2.g)))))) {
                                    AppMeasurementSdk appMeasurementSdk = bcVar.a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("origin", a2.a);
                                    String str18 = a2.b;
                                    if (str18 != null) {
                                        bundle.putString("name", str18);
                                    }
                                    Object obj4 = a2.c;
                                    if (obj4 != null) {
                                        p25.H(bundle, obj4);
                                    }
                                    String str19 = a2.d;
                                    if (str19 != null) {
                                        bundle.putString("trigger_event_name", str19);
                                    }
                                    bundle.putLong("trigger_timeout", a2.e);
                                    String str20 = a2.f;
                                    if (str20 != null) {
                                        bundle.putString("timed_out_event_name", str20);
                                    }
                                    Bundle bundle2 = a2.g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    String str21 = a2.h;
                                    if (str21 != null) {
                                        bundle.putString("triggered_event_name", str21);
                                    }
                                    Bundle bundle3 = a2.i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", a2.j);
                                    String str22 = a2.k;
                                    if (str22 != null) {
                                        bundle.putString("expired_event_name", str22);
                                    }
                                    Bundle bundle4 = a2.l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", a2.m);
                                    bundle.putBoolean("active", a2.n);
                                    bundle.putLong("triggered_timestamp", a2.o);
                                    yw8 yw84 = appMeasurementSdk.a;
                                    yw84.c(new kv8(yw84, bundle));
                                }
                            }
                            arrayDeque.offer(a2);
                        }
                        return;
                    } else {
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}

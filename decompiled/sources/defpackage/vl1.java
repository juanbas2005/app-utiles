package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vl1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl1 b;

    public /* synthetic */ vl1(wl1 wl1, int i) {
        this.a = i;
        this.b = wl1;
    }

    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.a) {
            case b85.b:
                wl1 wl1 = this.b;
                synchronized (wl1) {
                    try {
                        kz2 kz2 = (kz2) wl1.a.get();
                        ArrayList a2 = kz2.a();
                        synchronized (kz2) {
                            kz2.a.a(new vd2(kz2));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < a2.size(); i++) {
                            u00 u00 = (u00) a2.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", u00.a);
                            jSONObject.put("dates", new JSONArray(u00.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                wl1 wl12 = this.b;
                synchronized (wl12) {
                    kz2 kz22 = (kz2) wl12.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a3 = ((ho1) wl12.c.get()).a();
                    synchronized (kz22) {
                        String b2 = kz2.b(currentTimeMillis);
                        a3.getClass();
                        kz22.a.a(new g5(kz22, b2, a3, new in5(a3)));
                    }
                }
                return null;
        }
        throw th;
        throw th;
    }
}

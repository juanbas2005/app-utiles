package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l07 implements Iterable {
    public final /* synthetic */ int w;
    public final Serializable x;
    public final Object y;

    public l07(Context context) {
        this.w = 1;
        this.x = new ArrayList();
        this.y = context;
    }

    public void d(ComponentName componentName) {
        Context context = (Context) this.y;
        ArrayList arrayList = (ArrayList) this.x;
        int size = arrayList.size();
        try {
            for (Intent B = b96.B(context, componentName); B != null; B = b96.B(context, B.getComponent())) {
                arrayList.add(size, B);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void f() {
        ArrayList arrayList = (ArrayList) this.x;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            ((Context) this.y).startActivities(intentArr, (Bundle) null);
            return;
        }
        h.s("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public final Iterator iterator() {
        int i = this.w;
        Serializable serializable = this.x;
        switch (i) {
            case b85.b:
                za0 za0 = (za0) this.y;
                uy5 uy5 = (uy5) za0.e;
                uy5.getClass();
                return new k07(uy5, za0, (String) serializable);
            default:
                return ((ArrayList) serializable).iterator();
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                bl2 bl2 = new bl2(", ", 3);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                bl2.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public l07(za0 za0, String str) {
        this.w = 0;
        this.y = za0;
        this.x = str;
    }
}

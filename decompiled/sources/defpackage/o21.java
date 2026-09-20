package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o21 implements kr, v35, o38 {
    public int w;
    public int x;
    public final Object y;

    public o21(Context context, XmlResourceParser xmlResourceParser) {
        this.y = new ArrayList();
        this.x = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), jv5.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.w = obtainStyledAttributes.getResourceId(index, this.w);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.x);
                this.x = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new w21().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void b(int i, Object obj) {
        int i2;
        kr krVar = (kr) this.y;
        if (this.x == 0) {
            i2 = this.w;
        } else {
            i2 = 0;
        }
        krVar.b(i + i2, obj);
    }

    public void c(Object obj) {
        this.x++;
        ((kr) this.y).c(obj);
    }

    public void e() {
        ((kr) this.y).e();
    }

    public void f(int i, int i2, int i3) {
        int i4;
        if (this.x == 0) {
            i4 = this.w;
        } else {
            i4 = 0;
        }
        ((kr) this.y).f(i + i4, i2 + i4, i3);
    }

    public void g(int i, int i2) {
        int i3;
        kr krVar = (kr) this.y;
        if (this.x == 0) {
            i3 = this.w;
        } else {
            i3 = 0;
        }
        krVar.g(i + i3, i2);
    }

    public int h(int i) {
        int h = ((v35) this.y).h(i);
        if (i >= 0 && i <= this.x) {
            w18.c(h, this.w, i);
        }
        return h;
    }

    public void i() {
        if (this.x <= 0) {
            ey0.a("OffsetApplier up called with no corresponding down");
        }
        this.x--;
        ((kr) this.y).i();
    }

    public ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.y).j(j, olVar, olVar2, olVar3);
    }

    public void k(int i, Object obj) {
        int i2;
        kr krVar = (kr) this.y;
        if (this.x == 0) {
            i2 = this.w;
        } else {
            i2 = 0;
        }
        krVar.k(i + i2, obj);
    }

    public Object m() {
        return ((kr) this.y).m();
    }

    public int n() {
        return this.x;
    }

    public void o(gs2 gs2, Object obj) {
        ((kr) this.y).o(gs2, obj);
    }

    public int p(int i) {
        int p = ((v35) this.y).p(i);
        if (i >= 0 && i <= this.w) {
            w18.b(p, this.x, i);
        }
        return p;
    }

    public synchronized int q() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.y;
        PackageManager packageManager = context.getPackageManager();
        if (cf8.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!za5.w()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.x = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == za5.w()) {
                i2 = 2;
            }
            this.x = i2;
            return i2;
        }
        i2 = 2;
        this.x = i2;
        return i2;
    }

    public int r() {
        return this.w;
    }

    public synchronized int s() {
        PackageInfo packageInfo;
        if (this.w == 0) {
            try {
                packageInfo = cf8.a((Context) this.y).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.w = packageInfo.versionCode;
            }
        }
        return this.w;
    }

    public ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.y).t(j, olVar, olVar2, olVar3);
    }

    public o21(View view) {
        this.y = view;
    }

    public o21(v35 v35, int i, int i2) {
        this.y = v35;
        this.w = i;
        this.x = i2;
    }

    public o21(Context context) {
        this.x = 0;
        this.y = context;
    }

    public o21(kr krVar, int i) {
        this.y = krVar;
        this.w = i;
    }

    public o21(int i, int i2, sr2 sr2) {
        this.w = i;
        this.x = i2;
        this.y = sr2;
    }

    public o21() {
        this.y = new o21[256];
        this.w = 0;
        this.x = 0;
    }

    public o21(int i, int i2) {
        this.y = null;
        this.w = i;
        int i3 = i2 & 7;
        this.x = i3 == 0 ? 8 : i3;
    }

    public o21(int i, int i2, i12 i12) {
        this.w = i;
        this.x = i2;
        this.y = new no7((ih2) new rh2(i, i2, i12));
    }
}

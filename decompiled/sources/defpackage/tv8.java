package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* renamed from: tv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tv8 extends tw8 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv8(zb2 zb2, Activity activity, xt8 xt8) {
        super((yw8) zb2.x, true);
        this.C = activity;
        this.D = xt8;
        this.B = zb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [cu8] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[SYNTHETIC, Splitter:B:39:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8 A[Catch:{ DynamiteModule$LoadingException -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb A[Catch:{ Exception -> 0x0094 }] */
    public final void a() {
        Boolean bool;
        yw8 yw8;
        boolean z;
        boolean z2;
        boolean z3;
        e12 e12;
        ? r2 = 0;
        switch (this.A) {
            case b85.b:
                try {
                    Context context = (Context) this.C;
                    z65.k(context);
                    String J = jb5.J(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(J)) {
                        J = jb5.J(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", J);
                    if (identifier != 0) {
                        try {
                            bool = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        yw8 = (yw8) this.B;
                        if (bool == null || !bool.booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        yw8.getClass();
                        if (!z) {
                            try {
                                e12 = f12.c;
                            } catch (DynamiteModule$LoadingException e) {
                                yw8.d(e, true, false);
                            }
                        } else {
                            e12 = f12.b;
                        }
                        r2 = bu8.asInterface(f12.c(context, e12, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        yw8.f = r2;
                        if (yw8.f != null) {
                            Log.w("FA", "Failed to connect to measurement client.");
                            return;
                        }
                        int a = f12.a(context, ModuleDescriptor.MODULE_ID);
                        int d = f12.d(context, ModuleDescriptor.MODULE_ID, false);
                        int max = Math.max(a, d);
                        if (Boolean.TRUE.equals(bool) || d < a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        long j = (long) max;
                        yw8.g = j;
                        iv8 iv8 = new iv8(161000, j, z2, (Bundle) this.D, jb5.J(context));
                        if (yw8.g >= 169) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        cu8 cu8 = yw8.f;
                        if (z3) {
                            z65.k(cu8);
                            cu8.initializeWithElapsedTime(new z25(context), iv8, this.w, this.x);
                            return;
                        }
                        z65.k(cu8);
                        cu8.initialize(new z25(context), iv8, this.w);
                        return;
                    }
                    bool = null;
                    yw8 = (yw8) this.B;
                    if (bool == null || !bool.booleanValue()) {
                    }
                    yw8.getClass();
                    if (!z) {
                    }
                    r2 = bu8.asInterface(f12.c(context, e12, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    yw8.f = r2;
                    if (yw8.f != null) {
                    }
                } catch (Exception e2) {
                    ((yw8) this.B).d(e2, true, false);
                    return;
                }
                break;
            case 1:
                cu8 cu82 = ((yw8) this.B).f;
                z65.k(cu82);
                cu82.getMaxUserProperties((String) this.C, (xt8) this.D);
                return;
            case 2:
                Bundle bundle = (Bundle) this.D;
                if (bundle != null) {
                    Bundle bundle2 = new Bundle();
                    r2 = bundle2;
                    if (bundle.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle.get("com.google.app_measurement.screen_service");
                        r2 = bundle2;
                        if (obj instanceof Bundle) {
                            bundle2.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                            r2 = bundle2;
                        }
                    }
                }
                cu8 cu83 = ((yw8) ((zb2) this.B).x).f;
                z65.k(cu83);
                cu83.onActivityCreatedByScionActivityInfo(jv8.f((Activity) this.C), r2, this.x);
                return;
            default:
                cu8 cu84 = ((yw8) ((zb2) this.B).x).f;
                z65.k(cu84);
                cu84.onActivitySaveInstanceStateByScionActivityInfo(jv8.f((Activity) this.C), (xt8) this.D, this.x);
                return;
        }
    }

    public void b() {
        switch (this.A) {
            case 1:
                ((xt8) this.D).z((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv8(zb2 zb2, Bundle bundle, Activity activity) {
        super((yw8) zb2.x, true);
        this.D = bundle;
        this.C = activity;
        this.B = zb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv8(yw8 yw8, Context context, Bundle bundle) {
        super(yw8, true);
        this.C = context;
        this.D = bundle;
        this.B = yw8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv8(yw8 yw8, String str, xt8 xt8) {
        super(yw8, true);
        this.C = str;
        this.D = xt8;
        Objects.requireNonNull(yw8);
        this.B = yw8;
    }
}

package cu.lestebang.utiletecsa;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcu/lestebang/utiletecsa/MainActivity;", "Lyn;", "<init>", "()V", "Ldh7;", "themeSettings", "Lis7;", "Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "uiState", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class MainActivity extends yn implements nu2 {
    public static final /* synthetic */ int g0 = 0;
    public volatile k8 X;
    public final Object Y = new Object();
    public boolean Z = false;
    public final ArrayList a0;
    public az4 b0;
    public f91 c0;
    public final o9 d0;
    public final a9 e0;
    public final ed5 f0;

    public MainActivity() {
        m(new xn(this, 2));
        this.a0 = new ArrayList();
        this.d0 = new o9(b26.a.b(ne4.class), new be4(this, 1), new be4(this, 0), new be4(this, 2));
        this.e0 = o(new td4(this), new s8(false, 2));
        this.f0 = u55.p(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0205, code lost:
        if (r4 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0207, code lost:
        r0.t0.k = true;
        r0.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
        if (r6.getBoolean("has_iris", r7) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(cu.lestebang.utiletecsa.MainActivity r12) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.MainActivity.t(cu.lestebang.utiletecsa.MainActivity):void");
    }

    @Override // defpackage.nu2
    public final Object a() {
        return u().a();
    }

    @Override // defpackage.rv0, defpackage.ry2
    public final w58 c() {
        return h49.x(this, super.c());
    }

    @Override // defpackage.eq2, defpackage.rv0, defpackage.qv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kg5 kg5Var;
        lk7 lk7Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            kg5Var = new h07(this);
        } else {
            kg5Var = new kg5(this);
        }
        kg5Var.z();
        w(bundle);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", false)) {
            lk7Var = lk7.D;
        } else {
            lk7Var = null;
        }
        this.f0.setValue(lk7Var);
        ed5 p = u55.p(new dh7(false, false));
        ar7.H(t49.O(this), null, null, new yd4(this, p, null, 1), 3);
        kg5Var.P(new td4(this));
        sv0.a(this, new fw0(1404224948, new p13(25, this, p), true));
        List E = sg3.E("android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_CONTACTS", "android.permission.SEND_SMS", "android.permission.READ_CALL_LOG", "android.permission.READ_SMS");
        ArrayList arrayList = this.a0;
        arrayList.addAll(E);
        if (i >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        ar7.H(t49.O(this), null, null, new ot(this, null, 16), 3);
    }

    @Override // defpackage.yn, defpackage.eq2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        v70 v70Var = u().A;
        if (v70Var != null) {
            v70Var.y = null;
        }
    }

    @Override // defpackage.rv0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        lk7 lk7Var;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.getBooleanExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", false)) {
            lk7Var = lk7.D;
        } else {
            lk7Var = null;
        }
        if (lk7Var != null) {
            this.f0.setValue(lk7Var);
        }
    }

    public final k8 u() {
        if (this.X == null) {
            synchronized (this.Y) {
                try {
                    if (this.X == null) {
                        this.X = new k8(this);
                    }
                } finally {
                }
            }
        }
        return this.X;
    }

    public final ne4 v() {
        return (ne4) this.d0.getValue();
    }

    public final void w(Bundle bundle) {
        super.onCreate(bundle);
        u().c();
    }
}

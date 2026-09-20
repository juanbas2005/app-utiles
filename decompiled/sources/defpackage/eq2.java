package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: eq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class eq2 extends rv0 {
    public final wv2 R = new wv2(19, new dq2(this));
    public final w54 S = new w54(this, true);
    public boolean T;
    public boolean U;
    public boolean V = true;

    public eq2() {
        ((kg5) this.z.y).K("android:support:lifecycle", new lv0(2, this));
        this.F.add(new cq2(this, 0));
        this.H.add(new cq2(this, 1));
        m(new mv0(this, 1));
    }

    public static boolean q(rq2 rq2) {
        eq2 eq2;
        boolean z = false;
        for (bq2 bq2 : rq2.c.G()) {
            if (bq2 != null) {
                dq2 dq2 = bq2.Q;
                if (dq2 == null) {
                    eq2 = null;
                } else {
                    eq2 = dq2.P;
                }
                if (eq2 != null) {
                    z |= q(bq2.m());
                }
                br2 br2 = bq2.m0;
                k54 k54 = k54.z;
                k54 k542 = k54.y;
                if (br2 != null) {
                    br2.e();
                    if (br2.A.E.compareTo(k54) >= 0) {
                        bq2.m0.A.h1(k542);
                        z = true;
                    }
                }
                if (bq2.l0.E.compareTo(k54) >= 0) {
                    bq2.l0.h1(k542);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0.equals("--list-dumpables") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0.equals("--dump-dumpable") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!(strArr == null || strArr.length == 0)) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.T);
        printWriter.print(" mResumed=");
        printWriter.print(this.U);
        printWriter.print(" mStopped=");
        printWriter.print(this.V);
        if (getApplication() != null) {
            hv2.N0(this).F0(str3, printWriter);
        }
        ((dq2) this.R.x).O.w(str, fileDescriptor, printWriter, strArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.R.n();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S.f1(j54.ON_CREATE);
        rq2 rq2 = ((dq2) this.R.x).O;
        rq2.H = false;
        rq2.I = false;
        rq2.O.g = false;
        rq2.u(1);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((dq2) this.R.x).O.f.onCreateView((View) null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((dq2) this.R.x).O.l();
        this.S.f1(j54.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((dq2) this.R.x).O.j();
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        this.U = false;
        ((dq2) this.R.x).O.u(5);
        this.S.f1(j54.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.S.f1(j54.ON_RESUME);
        rq2 rq2 = ((dq2) this.R.x).O;
        rq2.H = false;
        rq2.I = false;
        rq2.O.g = false;
        rq2.u(7);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.R.n();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public final void onResume() {
        wv2 wv2 = this.R;
        wv2.n();
        super.onResume();
        this.U = true;
        ((dq2) wv2.x).O.A(true);
    }

    public void onStart() {
        wv2 wv2 = this.R;
        wv2.n();
        dq2 dq2 = (dq2) wv2.x;
        super.onStart();
        this.V = false;
        if (!this.T) {
            this.T = true;
            rq2 rq2 = dq2.O;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(4);
        }
        dq2.O.A(true);
        this.S.f1(j54.ON_START);
        rq2 rq22 = dq2.O;
        rq22.H = false;
        rq22.I = false;
        rq22.O.g = false;
        rq22.u(5);
    }

    public final void onStateNotSaved() {
        this.R.n();
    }

    public void onStop() {
        super.onStop();
        this.V = true;
        do {
        } while (q(p()));
        rq2 rq2 = ((dq2) this.R.x).O;
        rq2.I = true;
        rq2.O.g = true;
        rq2.u(4);
        this.S.f1(j54.ON_STOP);
    }

    public final rq2 p() {
        return ((dq2) this.R.x).O;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((dq2) this.R.x).O.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}

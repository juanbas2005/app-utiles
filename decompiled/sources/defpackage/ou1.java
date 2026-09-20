package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import cu.lestebang.utiletecsa.R;

/* renamed from: ou1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ou1 extends bq2 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0 = true;
    public int B0 = -1;
    public boolean C0;
    public final ji8 D0 = new ji8(20, (Object) this);
    public Dialog E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0 = false;
    public Handler t0;
    public final ge u0 = new ge(5, (Object) this);
    public final lu1 v0 = new lu1(this);
    public final mu1 w0 = new mu1(this);
    public int x0 = 0;
    public int y0 = 0;
    public boolean z0 = true;

    public final void C() {
        this.a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.F0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.E0.dismiss();
            if (!this.G0) {
                onDismiss(this.E0);
            }
            this.E0 = null;
            this.I0 = false;
        }
    }

    public final void D() {
        this.a0 = true;
        if (!this.H0 && !this.G0) {
            this.G0 = true;
        }
        this.n0.h(this.D0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[Catch:{ all -> 0x004c }] */
    public final LayoutInflater E(Bundle bundle) {
        Context n;
        LayoutInflater E = super.E(bundle);
        boolean z = this.A0;
        if (z && !this.C0) {
            if (z && !this.I0) {
                try {
                    this.C0 = true;
                    Dialog Q = Q();
                    this.E0 = Q;
                    if (this.A0) {
                        int i = this.x0;
                        if (!(i == 1 || i == 2)) {
                            if (i != 3) {
                                n = n();
                                if (n != null) {
                                    this.E0.setOwnerActivity((Activity) n);
                                }
                                this.E0.setCancelable(this.z0);
                                this.E0.setOnCancelListener(this.v0);
                                this.E0.setOnDismissListener(this.w0);
                                this.I0 = true;
                            } else {
                                Window window = Q.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            }
                        }
                        Q.requestWindowFeature(1);
                        n = n();
                        if (n != null) {
                        }
                        this.E0.setCancelable(this.z0);
                        this.E0.setOnCancelListener(this.v0);
                        this.E0.setOnDismissListener(this.w0);
                        this.I0 = true;
                    } else {
                        this.E0 = null;
                    }
                } finally {
                    this.C0 = false;
                }
            }
            if (rq2.L(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.E0;
            if (dialog != null) {
                return E.cloneInContext(dialog.getContext());
            }
        } else if (rq2.L(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.A0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return E;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return E;
    }

    public void F(Bundle bundle) {
        Dialog dialog = this.E0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.x0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.y0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.z0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.B0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void G() {
        this.a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.F0 = false;
            dialog.show();
            View decorView = this.E0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void H() {
        this.a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.a0 = true;
        if (this.E0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.E0.onRestoreInstanceState(bundle2);
        }
    }

    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.c0 == null && this.E0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.E0.onRestoreInstanceState(bundle2);
        }
    }

    public final void P(boolean z, boolean z2) {
        if (!this.G0) {
            this.G0 = true;
            this.H0 = false;
            Dialog dialog = this.E0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.E0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.t0.getLooper()) {
                        onDismiss(this.E0);
                    } else {
                        this.t0.post(this.u0);
                    }
                }
            }
            this.F0 = true;
            if (this.B0 >= 0) {
                rq2 p = p();
                int i = this.B0;
                if (i >= 0) {
                    p.y(new pq2(p, i), z);
                    this.B0 = -1;
                    return;
                }
                h.q(hl6.k(i, "Bad id: "));
                return;
            }
            q30 q30 = new q30(p());
            q30.o = true;
            q30.h(this);
            if (z) {
                q30.e(true, true);
            } else {
                q30.e(false, true);
            }
        }
    }

    public Dialog Q() {
        if (rq2.L(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new vv0(L(), this.y0);
    }

    public final mp7 a() {
        return new nu1(this, new zp2(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.F0) {
            if (rq2.L(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            P(true, true);
        }
    }

    public final void w() {
        this.a0 = true;
    }

    public final void y(Context context) {
        super.y(context);
        bp4 bp4 = this.n0;
        bp4.getClass();
        bp4.a("observeForever");
        ji8 ji8 = this.D0;
        e94 e94 = new e94(bp4, ji8);
        e94 e942 = (e94) bp4.b.d(ji8, e94);
        if (!(e942 instanceof d94)) {
            if (e942 == null) {
                e94.b(true);
            }
            if (!this.H0) {
                this.G0 = false;
                return;
            }
            return;
        }
        h.q("Cannot add the same observer with different lifecycles");
    }

    public void z(Bundle bundle) {
        boolean z;
        super.z(bundle);
        this.t0 = new Handler();
        if (this.U == 0) {
            z = true;
        } else {
            z = false;
        }
        this.A0 = z;
        if (bundle != null) {
            this.x0 = bundle.getInt("android:style", 0);
            this.y0 = bundle.getInt("android:theme", 0);
            this.z0 = bundle.getBoolean("android:cancelable", true);
            this.A0 = bundle.getBoolean("android:showsDialog", this.A0);
            this.B0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}

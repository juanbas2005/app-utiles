package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import java.util.concurrent.Executor;

/* renamed from: p80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p80 implements g35 {
    public final /* synthetic */ int w;
    public final /* synthetic */ y80 x;

    public /* synthetic */ p80(y80 y80, int i) {
        this.w = i;
        this.x = y80;
    }

    public final void m(Object obj) {
        boolean z;
        int i = this.w;
        int i2 = 0;
        String str = null;
        y80 y80 = this.x;
        switch (i) {
            case b85.b:
                b90 b90 = (b90) obj;
                if (b90 != null) {
                    y80.X(b90);
                    f90 f90 = y80.t0;
                    if (f90.p == null) {
                        f90.p = new bp4();
                    }
                    f90.h(f90.p, (Object) null);
                    return;
                }
                return;
            case 1:
                o80 o80 = (o80) obj;
                if (o80 != null) {
                    int i3 = o80.a;
                    CharSequence charSequence = o80.b;
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        case 12:
                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        case 14:
                        case h75.g:
                            break;
                        default:
                            i3 = 8;
                            break;
                    }
                    Context n = y80.n();
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 29 && ((i3 == 7 || i3 == 9) && n != null)) {
                        KeyguardManager a = ht3.a(n);
                        if (a == null) {
                            z = false;
                        } else {
                            z = ht3.b(a);
                        }
                        if (z && uq3.A(y80.t0.e())) {
                            y80.U();
                            y80.t0.f((o80) null);
                            return;
                        }
                    }
                    if (y80.T()) {
                        if (charSequence == null) {
                            charSequence = gw8.w(y80.n(), i3);
                        }
                        f90 f902 = y80.t0;
                        if (i3 == 5) {
                            int i5 = f902.i;
                            if (i5 == 0 || i5 == 3) {
                                y80.W(i3, charSequence);
                            }
                            y80.Q();
                        } else {
                            if (f902.u) {
                                y80.V(i3, charSequence);
                            } else {
                                y80.Y(charSequence);
                                Handler handler = y80.u0;
                                r80 r80 = new r80(y80, i3, charSequence, 0);
                                Context n2 = y80.n();
                                if (n2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i4 == 28 && str2 != null) {
                                        String[] stringArray = n2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < length) {
                                                if (!str2.startsWith(stringArray[i6])) {
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = 2000;
                                handler.postDelayed(r80, (long) i2);
                            }
                            y80.t0.u = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = y80.q(R.string.default_error_msg) + " " + i3;
                        }
                        y80.V(i3, charSequence);
                    }
                    y80.t0.f((o80) null);
                    return;
                }
                return;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                if (charSequence2 != null) {
                    if (y80.T()) {
                        y80.Y(charSequence2);
                    }
                    y80.t0.f((o80) null);
                    return;
                }
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    if (y80.T()) {
                        y80.Y(y80.q(R.string.fingerprint_not_recognized));
                    }
                    f90 f903 = y80.t0;
                    if (!f903.k) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = f903.b;
                        if (executor == null) {
                            executor = new w80(1);
                        }
                        executor.execute(new q80(y80));
                    }
                    f90 f904 = y80.t0;
                    if (f904.s == null) {
                        f904.s = new bp4();
                    }
                    f90.h(f904.s, Boolean.FALSE);
                    return;
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    if (y80.S()) {
                        y80.U();
                    } else {
                        f90 f905 = y80.t0;
                        String str3 = f905.h;
                        if (str3 != null) {
                            str = str3;
                        } else if (f905.d != null) {
                            str = "";
                        }
                        if (str == null) {
                            str = y80.q(R.string.default_error_msg);
                        }
                        y80.V(13, str);
                        y80.P(2);
                    }
                    y80.t0.g(false);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    y80.P(1);
                    y80.Q();
                    f90 f906 = y80.t0;
                    if (f906.v == null) {
                        f906.v = new bp4();
                    }
                    f90.h(f906.v, Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SignInHubActivity extends eq2 {
    public static boolean b0 = false;
    public boolean W = false;
    public SignInConfiguration X;
    public boolean Y;
    public int Z;
    public Intent a0;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.W) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.x) != null) {
                        ji8 I = ji8.I(this);
                        GoogleSignInOptions googleSignInOptions = this.X.x;
                        synchronized (I) {
                            ((d47) I.x).c(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.Y = true;
                        this.Z = i2;
                        this.a0 = intent;
                        hv2.N0(this).Q0(0, new uy5(13, (Object) this));
                        b0 = false;
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        r(intExtra);
                        return;
                    }
                }
                r(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            r(12500);
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            r(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            if (bundleExtra == null) {
                Log.e("AuthSignInClient", "Activity started with no configuration.");
                setResult(0);
                finish();
                return;
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.X = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.Y = z;
                if (z) {
                    this.Z = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    if (intent2 == null) {
                        Log.e("AuthSignInClient", "Sign in result data cannot be null");
                        setResult(0);
                        finish();
                        return;
                    }
                    this.a0 = intent2;
                    hv2.N0(this).Q0(0, new uy5(13, (Object) this));
                    b0 = false;
                }
            } else if (b0) {
                setResult(0);
                r(12502);
            } else {
                b0 = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.X);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.W = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    r(17);
                }
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        b0 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.Y);
        if (this.Y) {
            bundle.putInt("signInResultCode", this.Z);
            bundle.putParcelable("signInResultData", this.a0);
        }
    }

    public final void r(int i) {
        Status status = new Status(i, (String) null, (PendingIntent) null, (m11) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        b0 = false;
    }
}

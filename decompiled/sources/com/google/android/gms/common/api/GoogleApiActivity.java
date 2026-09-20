package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int x = 0;
    public int w = 0;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.w = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                pw2 e = pw2.e(this);
                if (i2 == -1) {
                    ph8 ph8 = e.I;
                    ph8.sendMessage(ph8.obtainMessage(3));
                } else if (i2 == 0) {
                    e.h(new m11(13, (PendingIntent) null, (String) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.w = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.w = 0;
        setResult(0);
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.w = bundle.getInt("resolution");
        }
        if (this.w != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        googleApiActivity.w = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        ActivityNotFoundException activityNotFoundException = e;
                        if (!extras.getBoolean("notify_manager", true)) {
                        }
                        googleApiActivity.w = 1;
                        googleApiActivity.finish();
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        googleApiActivity.finish();
                    }
                } catch (ActivityNotFoundException e3) {
                    e = e3;
                    googleApiActivity = this;
                    ActivityNotFoundException activityNotFoundException2 = e;
                    if (!extras.getBoolean("notify_manager", true)) {
                        pw2.e(googleApiActivity).h(new m11(22, (PendingIntent) null, (String) null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String obj = pendingIntent.toString();
                        String m = f21.m(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            m = m.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", m, activityNotFoundException2);
                    }
                    googleApiActivity.w = 1;
                    googleApiActivity.finish();
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    googleApiActivity = this;
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    googleApiActivity.finish();
                }
            } else {
                z65.k(num);
                lw2.e.c(this, num.intValue(), this);
                this.w = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.w);
        super.onSaveInstanceState(bundle);
    }
}

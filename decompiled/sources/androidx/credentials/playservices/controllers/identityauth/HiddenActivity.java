package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class HiddenActivity extends Activity {
    public ResultReceiver w;
    public boolean x;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Set set = sb1.a;
        xb4.g(resultReceiver, str, str2);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.w;
        if (resultReceiver != null) {
            Set set = sb1.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.x = false;
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.w = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle2 != null) {
            this.x = bundle2.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.x) {
            if (stringExtra == null) {
                Log.w("HiddenActivity", "Activity handed an unsupported type");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
            if (pendingIntent != null) {
                try {
                    this.x = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException e) {
                    switch (stringExtra.hashCode()) {
                        case -441061071:
                            if (stringExtra.equals("BEGIN_SIGN_IN")) {
                                ResultReceiver resultReceiver2 = this.w;
                                resultReceiver2.getClass();
                                a(resultReceiver2, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        case 15545322:
                            if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                                ResultReceiver resultReceiver3 = this.w;
                                resultReceiver3.getClass();
                                a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e.getMessage());
                                return;
                            }
                            return;
                        case 1246634622:
                            if (stringExtra.equals("CREATE_PASSWORD")) {
                                ResultReceiver resultReceiver4 = this.w;
                                resultReceiver4.getClass();
                                a(resultReceiver4, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        case 1980564212:
                            if (stringExtra.equals("SIGN_IN_INTENT")) {
                                ResultReceiver resultReceiver5 = this.w;
                                resultReceiver5.getClass();
                                a(resultReceiver5, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            } else {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals("BEGIN_SIGN_IN")) {
                            ResultReceiver resultReceiver6 = this.w;
                            resultReceiver6.getClass();
                            a(resultReceiver6, "GET_UNKNOWN", "internal error during the begin sign in operation");
                            return;
                        }
                        return;
                    case 15545322:
                        if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            ResultReceiver resultReceiver7 = this.w;
                            resultReceiver7.getClass();
                            a(resultReceiver7, "CREATE_UNKNOWN", "internal error during public key credential creation");
                            return;
                        }
                        return;
                    case 1246634622:
                        if (stringExtra.equals("CREATE_PASSWORD")) {
                            ResultReceiver resultReceiver8 = this.w;
                            resultReceiver8.getClass();
                            a(resultReceiver8, "CREATE_UNKNOWN", "internal error during password creation");
                            return;
                        }
                        return;
                    case 1980564212:
                        if (stringExtra.equals("SIGN_IN_INTENT")) {
                            ResultReceiver resultReceiver9 = this.w;
                            resultReceiver9.getClass();
                            a(resultReceiver9, "GET_UNKNOWN", "internal error during the sign-in intent operation");
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.x);
        super.onSaveInstanceState(bundle);
    }
}

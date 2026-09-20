package androidx.credentials.playservices.controllers.identitycredentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/IdentityCredentialApiHiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public ResultReceiver w;
    public boolean x;

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
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.w = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.x = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.x) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
            if (pendingIntent != null) {
                this.x = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), sb1.b, (Intent) null, 0, 0, 0, (Bundle) null);
                return;
            }
            ResultReceiver resultReceiver2 = this.w;
            if (resultReceiver2 != null) {
                Set set = sb1.a;
                xb4.g(resultReceiver2, stringExtra, "Internal error");
            }
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.x);
        super.onSaveInstanceState(bundle);
    }
}

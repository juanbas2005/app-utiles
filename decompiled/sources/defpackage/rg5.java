package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.widget.Toast;
import java.util.List;

/* renamed from: rg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rg5 {
    public static void a(Context context, String str, int i) {
        context.getClass();
        str.getClass();
        Object systemService = context.getSystemService("telecom");
        systemService.getClass();
        TelecomManager telecomManager = (TelecomManager) systemService;
        Bundle bundle = new Bundle();
        PhoneAccountHandle f = f(context, i);
        if (f != null) {
            bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", f);
        }
        telecomManager.placeCall(Uri.parse("tel:".concat(str)), bundle);
    }

    public static void b(Context context, String str, int i) {
        context.getClass();
        str.getClass();
        String s0 = k57.s0(str, "#", "%23");
        Object systemService = context.getSystemService("telecom");
        systemService.getClass();
        TelecomManager telecomManager = (TelecomManager) systemService;
        Bundle bundle = new Bundle();
        PhoneAccountHandle f = f(context, i);
        if (f != null) {
            bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", f);
        }
        telecomManager.placeCall(Uri.parse("tel:".concat(s0)), bundle);
    }

    public static void c(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(str))).putExtra("sms_body", str2).addFlags(268435456));
    }

    public static void d(Context context, String str) {
        context.getClass();
        str.getClass();
        context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str))).addFlags(268435456));
    }

    public static void e(Context context, String str) {
        context.getClass();
        str.getClass();
        String s0 = k57.s0(str, "#", "%23");
        Intent intent = new Intent("android.intent.action.DIAL");
        Uri parse = Uri.parse("tel:".concat(s0));
        parse.getClass();
        intent.setData(parse);
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, "No se encuentra la aplicación de llamadas.", 1).show();
        }
    }

    public static PhoneAccountHandle f(Context context, int i) {
        Object obj;
        Object obj2 = null;
        if (i < 0) {
            return null;
        }
        try {
            Object systemService = context.getSystemService("telecom");
            systemService.getClass();
            List<PhoneAccountHandle> callCapablePhoneAccounts = ((TelecomManager) systemService).getCallCapablePhoneAccounts();
            callCapablePhoneAccounts.getClass();
            obj = (PhoneAccountHandle) dt0.z0(i, callCapablePhoneAccounts);
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        return (PhoneAccountHandle) obj2;
    }
}

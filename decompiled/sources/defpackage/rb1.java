package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rb1 extends sb1 {
    public final Context c;
    public lb1 d;
    public Executor e;
    public CancellationSignal f;
    public final qb1 g = new qb1(this, new Handler(Looper.getMainLooper()), 0);

    public rb1(Context context) {
        context.getClass();
        this.c = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: jw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: kw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: kw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: kw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: av1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: av1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ov2 b(gt6 gt6) {
        av1 av1;
        kw kwVar;
        String str;
        Object obj;
        Throwable th;
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        qu5 qu5 = gt6.E;
        String str6 = gt6.C;
        String str7 = gt6.w;
        String str8 = gt6.B;
        boolean z = true;
        if (str8 != null) {
            str7.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str7);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str8);
            av1 = new av1(str8, bundle, 1);
        } else {
            Object obj2 = null;
            if (str6 != null) {
                str7.getClass();
                String str9 = gt6.x;
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = null;
                }
                String str10 = gt6.y;
                if (str10 != null) {
                    str3 = str10;
                } else {
                    str3 = null;
                }
                String str11 = gt6.z;
                if (str11 != null) {
                    str4 = str11;
                } else {
                    str4 = null;
                }
                String str12 = gt6.D;
                if (str12 != null) {
                    str5 = str12;
                } else {
                    str5 = null;
                }
                Uri uri2 = gt6.A;
                if (uri2 != null) {
                    uri = uri2;
                } else {
                    uri = null;
                }
                obj2 = new qw2(str7, str6, str2, str4, str3, uri, str5);
            } else if (qu5 != null) {
                kw kwVar2 = qu5.B;
                hw hwVar = qu5.A;
                jw jwVar = qu5.z;
                LinkedHashMap linkedHashMap = ru5.a;
                JSONObject jSONObject = new JSONObject();
                if (jwVar != 0) {
                    kwVar = jwVar;
                } else if (hwVar != 0) {
                    kwVar = hwVar;
                } else if (kwVar2 != null) {
                    kwVar = kwVar2;
                } else {
                    h.s("No response set.");
                    return null;
                }
                if (kwVar instanceof kw) {
                    kw kwVar3 = kwVar;
                    l62 l62 = kwVar3.w;
                    l62.getClass();
                    String str13 = kwVar3.x;
                    u uVar = (u) ru5.a.get(l62);
                    if (uVar == null) {
                        th = new GetPublicKeyCredentialDomException(new u(26), b81.y("unknown fido gms exception - ", str13));
                    } else if (l62 == l62.H && str13 != null && d57.x0(str13, "Unable to get sync account", false)) {
                        th = new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
                    } else {
                        th = new GetPublicKeyCredentialDomException(uVar, str13);
                    }
                    throw th;
                }
                if (kwVar instanceof hw) {
                    try {
                        qz8 qz8 = qu5.y;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (qz8 != null && qz8.s().length > 0) {
                                jSONObject2.put("rawId", pv8.B(qz8.s()));
                            }
                            String str14 = qu5.D;
                            if (str14 != null) {
                                jSONObject2.put("authenticatorAttachment", str14);
                            }
                            String str15 = qu5.x;
                            if (str15 != null && kwVar2 == null) {
                                jSONObject2.put("type", str15);
                            }
                            String str16 = qu5.w;
                            if (str16 != null) {
                                jSONObject2.put("id", str16);
                            }
                            String str17 = "response";
                            if (hwVar != 0) {
                                obj = hwVar.f();
                            } else if (jwVar != 0) {
                                obj = jwVar.f();
                            } else {
                                if (kwVar2 != null) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("code", kwVar2.w.w);
                                    String str18 = kwVar2.x;
                                    if (str18 != null) {
                                        jSONObject3.put("message", str18);
                                    }
                                    str17 = "error";
                                    obj2 = jSONObject3;
                                }
                                z = false;
                                obj = obj2;
                            }
                            if (obj != null) {
                                jSONObject2.put(str17, obj);
                            }
                            fw fwVar = qu5.C;
                            if (fwVar != null) {
                                jSONObject2.put("clientExtensionResults", fwVar.f());
                            } else if (z) {
                                jSONObject2.put("clientExtensionResults", new JSONObject());
                            }
                            str = jSONObject2.toString();
                            str.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e2);
                        } catch (JSONException e3) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e3);
                        }
                    } catch (Throwable th2) {
                        throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(kwVar.getClass().getName()));
                    str = jSONObject.toString();
                    str.getClass();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", str);
                av1 = new av1(str, bundle2, 2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            av1 = obj2;
        }
        if (av1 != null) {
            return new ov2(av1);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final lb1 c() {
        lb1 lb1 = this.d;
        if (lb1 != null) {
            return lb1;
        }
        sg3.a0("callback");
        throw null;
    }

    public final Executor d() {
        Executor executor = this.e;
        if (executor != null) {
            return executor;
        }
        sg3.a0("executor");
        throw null;
    }

    public final void e(nv2 nv2, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        nv2.getClass();
        lb1.getClass();
        executor.getClass();
        this.f = cancellationSignal;
        this.d = lb1;
        this.e = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            Context context = this.c;
            context.getClass();
            a80 a80 = new a80(false);
            w70 f2 = x70.f();
            f2.a = false;
            x70 a = f2.a();
            z70 z70 = new z70(false, (byte[]) null, (String) null);
            y70 y70 = new y70((String) null, false);
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            int i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            x70 x70 = a;
            for (pv2 pv2 : nv2.a) {
                if (pv2 instanceof pv2) {
                    w70 f3 = x70.f();
                    f3.b = false;
                    f3.d = pv2.e;
                    String str = pv2.d;
                    z65.h(str);
                    f3.c = str;
                    f3.a = true;
                    x70 = f3.a();
                }
            }
            wh8 v = we.v(context);
            w70 f4 = x70.f();
            f4.a = false;
            f4.a();
            b80 b80 = new b80(a80, x70, v.l, false, 0, z70, y70, false);
            za0 b = i93.b();
            b.e = new cc2[]{new cc2(8, "auth_api_credentials_begin_sign_in")};
            b.d = new br4(23, (Object) v, (Object) b80);
            b.c = false;
            b.b = 1553;
            yb9 b2 = v.b(0, b.a());
            c9 c9Var = new c9(7, new m0(14, cancellationSignal, this));
            b2.getClass();
            iy2 iy2 = yb7.a;
            b2.e(iy2, c9Var);
            b2.d(iy2, new yv0(5, (Object) this, (Object) cancellationSignal));
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* renamed from: gf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gf2 extends pf5 {
    public static final rg d = rg.d();
    public final ry4 b;
    public final Context c;

    public gf2(ry4 ry4, Context context) {
        this.c = context;
        this.b = ry4;
    }

    public final boolean a() {
        boolean z;
        int i;
        String str;
        ry4 ry4 = this.b;
        String P = ry4.P();
        if (P == null) {
            z = true;
        } else {
            z = P.trim().isEmpty();
        }
        rg rgVar = d;
        if (z) {
            rgVar.f("URL is missing:" + ry4.P());
            return false;
        }
        String P2 = ry4.P();
        URI uri = null;
        if (P2 != null) {
            try {
                uri = URI.create(P2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                rgVar.g("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uri == null) {
            rgVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            rg.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (i35.c == null) {
                i35.c = resources.getStringArray(identifier);
            }
            String host = uri.getHost();
            if (host != null) {
                String[] strArr = i35.c;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (!host.contains(strArr[i2])) {
                        i2++;
                    }
                }
                rgVar.f("URL fails allowlist rule: " + uri);
                return false;
            }
        }
        String host2 = uri.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            rgVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            rgVar.f("URL scheme is null or invalid");
            return false;
        } else if (uri.getUserInfo() == null) {
            int port = uri.getPort();
            if (port == -1 || port > 0) {
                if (ry4.R()) {
                    i = ry4.H();
                } else {
                    i = 0;
                }
                if (i == 0 || i == 1) {
                    switch (ry4.H()) {
                        case 1:
                            str = "HTTP_METHOD_UNKNOWN";
                            break;
                        case 2:
                            str = "GET";
                            break;
                        case 3:
                            str = "PUT";
                            break;
                        case 4:
                            str = "POST";
                            break;
                        case 5:
                            str = "DELETE";
                            break;
                        case 6:
                            str = "HEAD";
                            break;
                        case 7:
                            str = "PATCH";
                            break;
                        case 8:
                            str = "OPTIONS";
                            break;
                        case 9:
                            str = "TRACE";
                            break;
                        case 10:
                            str = "CONNECT";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    rgVar.f("HTTP Method is null or invalid: ".concat(str));
                    return false;
                } else if (ry4.S() && ry4.I() <= 0) {
                    rgVar.f("HTTP ResponseCode is a negative value:" + ry4.I());
                    return false;
                } else if (ry4.T() && ry4.K() < 0) {
                    rgVar.f("Request Payload is a negative value:" + ry4.K());
                    return false;
                } else if (ry4.U() && ry4.L() < 0) {
                    rgVar.f("Response Payload is a negative value:" + ry4.L());
                    return false;
                } else if (!ry4.Q() || ry4.F() <= 0) {
                    rgVar.f("Start time of the request is null, or zero, or a negative value:" + ry4.F());
                    return false;
                } else if (ry4.V() && ry4.M() < 0) {
                    rgVar.f("Time to complete the request is a negative value:" + ry4.M());
                    return false;
                } else if (ry4.X() && ry4.O() < 0) {
                    rgVar.f("Time from the start of the request to the start of the response is null or a negative value:" + ry4.O());
                    return false;
                } else if (!ry4.W() || ry4.N() <= 0) {
                    rgVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + ry4.N());
                    return false;
                } else if (ry4.S()) {
                    return true;
                } else {
                    rgVar.f("Did not receive a HTTP Response Code");
                    return false;
                }
            } else {
                rgVar.f("URL port is less than or equal to 0");
                return false;
            }
        } else {
            rgVar.f("URL user info is null");
            return false;
        }
    }
}

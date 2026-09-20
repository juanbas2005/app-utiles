package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b;\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001QBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u001b\u0010>\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u0016R\u001b\u0010A\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0016R\u001b\u0010D\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010\u0016R\u001d\u0010G\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0016R\u001d\u0010J\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0016R\u001b\u0010M\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u0010\u0016R\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006R"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Las7;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Luc5;", "parameters", "fragment", "user", "password", "", "trailingQuery", "urlString", "<init>", "(Las7;Ljava/lang/String;ILjava/util/List;Luc5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Luc5;", "getParameters", "()Luc5;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "Lnz3;", "getSegments", "segments", "protocolOrNull", "Las7;", "getProtocolOrNull", "()Las7;", "getProtocol", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", "getPort", "port", "Companion", "tu7", "ktor-http"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = wu7.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Url implements java.io.Serializable {
    public static final tu7 Companion = new Object();
    private final nz3 encodedFragment$delegate;
    private final nz3 encodedPassword$delegate;
    private final nz3 encodedPath$delegate;
    private final nz3 encodedPathAndQuery$delegate;
    private final nz3 encodedQuery$delegate;
    private final nz3 encodedUser$delegate;
    private final String fragment;
    private final String host;
    private final uc5 parameters;
    private final String password;
    private final List<String> pathSegments;
    private final as7 protocol;
    private final as7 protocolOrNull;
    private final List<String> rawSegments;
    private final nz3 segments$delegate;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final String urlString;
    private final String user;

    public Url(as7 as7, String str, int i, List<String> list, uc5 uc5, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        list.getClass();
        uc5.getClass();
        str2.getClass();
        str5.getClass();
        this.host = str;
        this.specifiedPort = i;
        this.parameters = uc5;
        this.fragment = str2;
        this.user = str3;
        this.password = str4;
        this.trailingQuery = z;
        this.urlString = str5;
        if (i < 0 || i >= 65536) {
            h.j(hl6.k(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.pathSegments = list;
        this.rawSegments = list;
        this.segments$delegate = new z97(new tm1(6, list));
        this.protocolOrNull = as7;
        this.protocol = as7 == null ? as7.y : as7;
        this.encodedPath$delegate = new z97(new n17(5, (Object) list, (Object) this));
        this.encodedQuery$delegate = new z97(new su7(this, 0));
        this.encodedPathAndQuery$delegate = new z97(new su7(this, 1));
        this.encodedUser$delegate = new z97(new su7(this, 2));
        this.encodedPassword$delegate = new z97(new su7(this, 3));
        this.encodedFragment$delegate = new z97(new su7(this, 4));
    }

    /* access modifiers changed from: private */
    public static final String encodedFragment_delegate$lambda$0(Url url) {
        int F0 = d57.F0(url.urlString, '#', 0, 6) + 1;
        if (F0 == 0) {
            return "";
        }
        return url.urlString.substring(F0);
    }

    /* access modifiers changed from: private */
    public static final String encodedPassword_delegate$lambda$0(Url url) {
        String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int F0 = d57.F0(url.urlString, '@', 0, 6);
        return url.urlString.substring(d57.F0(url.urlString, ':', url.protocol.w.length() + 3, 4) + 1, F0);
    }

    /* access modifiers changed from: private */
    public static final String encodedPathAndQuery_delegate$lambda$0(Url url) {
        int F0 = d57.F0(url.urlString, '/', url.protocol.w.length() + 3, 4);
        if (F0 == -1) {
            return "";
        }
        int F02 = d57.F0(url.urlString, '#', F0, 4);
        String str = url.urlString;
        if (F02 == -1) {
            return str.substring(F0);
        }
        return str.substring(F0, F02);
    }

    /* access modifiers changed from: private */
    public static final String encodedPath_delegate$lambda$0(List list, Url url) {
        int F0;
        if (list.isEmpty() || (F0 = d57.F0(url.urlString, '/', url.protocol.w.length() + 3, 4)) == -1) {
            return "";
        }
        int H0 = d57.H0(url.urlString, new char[]{'?', '#'}, F0, false);
        String str = url.urlString;
        if (H0 == -1) {
            return str.substring(F0);
        }
        return str.substring(F0, H0);
    }

    /* access modifiers changed from: private */
    public static final String encodedQuery_delegate$lambda$0(Url url) {
        int F0 = d57.F0(url.urlString, '?', 0, 6) + 1;
        if (F0 == 0) {
            return "";
        }
        int F02 = d57.F0(url.urlString, '#', F0, 4);
        String str = url.urlString;
        if (F02 == -1) {
            return str.substring(F0);
        }
        return str.substring(F0, F02);
    }

    /* access modifiers changed from: private */
    public static final String encodedUser_delegate$lambda$0(Url url) {
        String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.w.length() + 3;
        return url.urlString.substring(length, d57.H0(url.urlString, new char[]{':', '@'}, length, false));
    }

    /* access modifiers changed from: private */
    public static final List segments_delegate$lambda$0(List list) {
        int i;
        int i2;
        if (list.isEmpty()) {
            return a42.w;
        }
        if (((CharSequence) dt0.w0(list)).length() != 0 || list.size() <= 1) {
            i = 0;
        } else {
            i = 1;
        }
        if (((CharSequence) dt0.G0(list)).length() == 0) {
            i2 = list.size() - 1;
        } else {
            i2 = list.size();
        }
        return list.subList(i, i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, km1] */
    private final Object writeReplace() {
        t61 t61 = t61.y;
        ? obj = new Object();
        obj.w = t61;
        obj.x = this;
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Url.class != obj.getClass()) {
            return false;
        }
        return sg3.e(this.urlString, ((Url) obj).urlString);
    }

    public final String getEncodedFragment() {
        return (String) this.encodedFragment$delegate.getValue();
    }

    public final String getEncodedPassword() {
        return (String) this.encodedPassword$delegate.getValue();
    }

    public final String getEncodedPath() {
        return (String) this.encodedPath$delegate.getValue();
    }

    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery$delegate.getValue();
    }

    public final String getEncodedQuery() {
        return (String) this.encodedQuery$delegate.getValue();
    }

    public final String getEncodedUser() {
        return (String) this.encodedUser$delegate.getValue();
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getHost() {
        return this.host;
    }

    public final uc5 getParameters() {
        return this.parameters;
    }

    public final String getPassword() {
        return this.password;
    }

    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        int i = this.specifiedPort;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return this.protocol.x;
    }

    public final as7 getProtocol() {
        return this.protocol;
    }

    public final as7 getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final List<String> getRawSegments() {
        return this.rawSegments;
    }

    public final List<String> getSegments() {
        return (List) this.segments$delegate.getValue();
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    public String toString() {
        return this.urlString;
    }

    @fq1
    public static /* synthetic */ void getPathSegments$annotations() {
    }
}

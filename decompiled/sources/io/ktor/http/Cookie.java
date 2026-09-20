package io.ktor.http;

import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\b\u0018\u0000 M2\u00060\u0001j\u0002`\u0002:\u0002NOB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bF\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010%R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bJ\u0010%R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010(¨\u0006P"}, d2 = {"Lio/ktor/http/Cookie;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "", "name", "value", "Lr61;", "encoding", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lr61;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr61;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lr61;", "component4", "()Ljava/lang/Integer;", "component5", "()Lio/ktor/util/date/GMTDate;", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lr61;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lio/ktor/http/Cookie;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "writeReplace", "()Ljava/lang/Object;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$ktor_http", "(Lio/ktor/http/Cookie;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getName", "getValue", "Lr61;", "getEncoding", "Ljava/lang/Integer;", "getMaxAgeInt", "Lio/ktor/util/date/GMTDate;", "getExpires", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "Ljava/util/Map;", "getExtensions", "Companion", "o61", "p61", "ktor-http"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Cookie implements java.io.Serializable {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final p61 Companion = new Object();
    private final String domain;
    private final r61 encoding;
    private final GMTDate expires;
    private final Map<String, String> extensions;
    private final boolean httpOnly;
    private final Integer maxAge;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, p61] */
    static {
        o oVar = new o(23);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, rg3.y(i44, oVar), null, null, null, null, null, null, rg3.y(i44, new o(24))};
    }

    public /* synthetic */ Cookie(int i, String str, String str2, r61 r61, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, rl6 rl6) {
        if (3 == (i & 3)) {
            this.name = str;
            this.value = str2;
            if ((i & 4) == 0) {
                this.encoding = r61.x;
            } else {
                this.encoding = r61;
            }
            if ((i & 8) == 0) {
                this.maxAge = null;
            } else {
                this.maxAge = num;
            }
            if ((i & 16) == 0) {
                this.expires = null;
            } else {
                this.expires = gMTDate;
            }
            if ((i & 32) == 0) {
                this.domain = null;
            } else {
                this.domain = str3;
            }
            if ((i & 64) == 0) {
                this.path = null;
            } else {
                this.path = str4;
            }
            if ((i & 128) == 0) {
                this.secure = false;
            } else {
                this.secure = z;
            }
            if ((i & 256) == 0) {
                this.httpOnly = false;
            } else {
                this.httpOnly = z2;
            }
            if ((i & 512) == 0) {
                this.extensions = b42.w;
            } else {
                this.extensions = map;
            }
        } else {
            wn6.x(i, 3, o61.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        r61[] values = r61.values();
        values.getClass();
        return new a62("io.ktor.http.CookieEncoding", (Enum[]) values);
    }

    public static /* synthetic */ Cookie copy$default(Cookie cookie, String str, String str2, r61 r61, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cookie.name;
        }
        if ((i & 2) != 0) {
            str2 = cookie.value;
        }
        if ((i & 4) != 0) {
            r61 = cookie.encoding;
        }
        if ((i & 8) != 0) {
            num = cookie.maxAge;
        }
        if ((i & 16) != 0) {
            gMTDate = cookie.expires;
        }
        if ((i & 32) != 0) {
            str3 = cookie.domain;
        }
        if ((i & 64) != 0) {
            str4 = cookie.path;
        }
        if ((i & 128) != 0) {
            z = cookie.secure;
        }
        if ((i & 256) != 0) {
            z2 = cookie.httpOnly;
        }
        if ((i & 512) != 0) {
            map = cookie.extensions;
        }
        boolean z3 = z2;
        Map<String, String> map2 = map;
        String str5 = str4;
        boolean z4 = z;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        Integer num2 = num;
        String str7 = str2;
        return cookie.copy(str, str7, r61, num2, gMTDate2, str6, str5, z4, z3, map2);
    }

    public static final /* synthetic */ void write$Self$ktor_http(Cookie cookie, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.x(ll6, 0, cookie.name);
        hy0.x(ll6, 1, cookie.value);
        if (hy0.f(ll6) || cookie.encoding != r61.x) {
            hy0.o(ll6, 2, (zr3) nz3Arr[2].getValue(), cookie.encoding);
        }
        if (hy0.f(ll6) || cookie.maxAge != null) {
            hy0.A(ll6, 3, ue3.a, cookie.maxAge);
        }
        if (hy0.f(ll6) || cookie.expires != null) {
            hy0.A(ll6, 4, qt2.a, cookie.expires);
        }
        if (hy0.f(ll6) || cookie.domain != null) {
            hy0.A(ll6, 5, t47.a, cookie.domain);
        }
        if (hy0.f(ll6) || cookie.path != null) {
            hy0.A(ll6, 6, t47.a, cookie.path);
        }
        if (hy0.f(ll6) || cookie.secure) {
            hy0.n(ll6, 7, cookie.secure);
        }
        if (hy0.f(ll6) || cookie.httpOnly) {
            hy0.n(ll6, 8, cookie.httpOnly);
        }
        if (hy0.f(ll6) || !sg3.e(cookie.extensions, b42.w)) {
            hy0.o(ll6, 9, (zr3) nz3Arr[9].getValue(), cookie.extensions);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, km1] */
    private final Object writeReplace() {
        t61 t61 = t61.x;
        ? obj = new Object();
        obj.w = t61;
        obj.x = this;
        return obj;
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, String> component10() {
        return this.extensions;
    }

    public final String component2() {
        return this.value;
    }

    public final r61 component3() {
        return this.encoding;
    }

    public final Integer component4() {
        return this.maxAge;
    }

    public final GMTDate component5() {
        return this.expires;
    }

    public final String component6() {
        return this.domain;
    }

    public final String component7() {
        return this.path;
    }

    public final boolean component8() {
        return this.secure;
    }

    public final boolean component9() {
        return this.httpOnly;
    }

    public final Cookie copy(String str, String str2, r61 r61, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        r61.getClass();
        map.getClass();
        return new Cookie(str, str2, r61, num, gMTDate, str3, str4, z, z2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (sg3.e(this.name, cookie.name) && sg3.e(this.value, cookie.value) && this.encoding == cookie.encoding && sg3.e(this.maxAge, cookie.maxAge) && sg3.e(this.expires, cookie.expires) && sg3.e(this.domain, cookie.domain) && sg3.e(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && sg3.e(this.extensions, cookie.extensions)) {
            return true;
        }
        return false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final r61 getEncoding() {
        return this.encoding;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final Integer getMaxAgeInt() {
        return this.maxAge;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.encoding.hashCode() + hl6.h(this.name.hashCode() * 31, 31, this.value)) * 31;
        Integer num = this.maxAge;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i5 = (hashCode + i) * 31;
        GMTDate gMTDate = this.expires;
        if (gMTDate == null) {
            i2 = 0;
        } else {
            i2 = gMTDate.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str = this.domain;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.path;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return this.extensions.hashCode() + hl6.i(hl6.i((i7 + i4) * 31, 31, this.secure), 31, this.httpOnly);
    }

    public String toString() {
        return "Cookie(name=" + this.name + ", value=" + this.value + ", encoding=" + this.encoding + ", maxAge=" + this.maxAge + ", expires=" + this.expires + ", domain=" + this.domain + ", path=" + this.path + ", secure=" + this.secure + ", httpOnly=" + this.httpOnly + ", extensions=" + this.extensions + ')';
    }

    public Cookie(String str, String str2, r61 r61, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        r61.getClass();
        map.getClass();
        this.name = str;
        this.value = str2;
        this.encoding = r61;
        this.maxAge = num;
        this.expires = gMTDate;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.extensions = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ Cookie(String str, String str2, r61 r61, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, int i, hl1 hl1) {
        this(str, str2, (r0 & 4) != 0 ? r61.x : r61, (r0 & 8) != 0 ? null : num, (r0 & 16) != 0 ? null : gMTDate, (r0 & 32) != 0 ? null : str3, (r0 & 64) != 0 ? null : str4, (r0 & 128) != 0 ? false : z, (r0 & 256) != 0 ? false : z2, (r0 & 512) != 0 ? b42.w : map);
        int i2 = i;
    }
}

package io.github.jan.supabase.auth.admin.oauth;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\b\u0018\u0000 d2\u00020\u0001:\u0002efB³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018B¹\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJÀ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001fJ\u0010\u00104\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010C\u0012\u0004\bH\u0010F\u001a\u0004\bG\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010C\u0012\u0004\bJ\u0010F\u001a\u0004\bI\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010C\u0012\u0004\bO\u0010F\u001a\u0004\bN\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bQ\u0010F\u001a\u0004\bP\u0010\u001fR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010R\u0012\u0004\bT\u0010F\u001a\u0004\bS\u0010'R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010R\u0012\u0004\bV\u0010F\u001a\u0004\bU\u0010'R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010R\u0012\u0004\bX\u0010F\u001a\u0004\bW\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bY\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Z\u0012\u0004\b\\\u0010F\u001a\u0004\b[\u0010,R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010]\u0012\u0004\b_\u0010F\u001a\u0004\b^\u0010.R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010C\u0012\u0004\ba\u0010F\u001a\u0004\b`\u0010\u001fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010C\u0012\u0004\bc\u0010F\u001a\u0004\bb\u0010\u001f¨\u0006g"}, d2 = {"Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;", "", "", "clientId", "clientSecret", "clientName", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;", "clientType", "clientUri", "logoUri", "", "redirectUris", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;", "grantTypes", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;", "responseTypes", "scope", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "tokenEndpointAuthMethod", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;", "registrationType", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "component12", "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getClientId", "getClientId$annotations", "()V", "getClientSecret", "getClientSecret$annotations", "getClientName", "getClientName$annotations", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;", "getClientType", "getClientType$annotations", "getClientUri", "getClientUri$annotations", "getLogoUri", "getLogoUri$annotations", "Ljava/util/List;", "getRedirectUris", "getRedirectUris$annotations", "getGrantTypes", "getGrantTypes$annotations", "getResponseTypes", "getResponseTypes$annotations", "getScope", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "getTokenEndpointAuthMethod", "getTokenEndpointAuthMethod$annotations", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;", "getRegistrationType", "getRegistrationType$annotations", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Companion", "b25", "c25", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class OAuthClient {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final c25 Companion = new Object();
    private final String clientId;
    private final String clientName;
    private final String clientSecret;
    private final OAuthClientType clientType;
    private final String clientUri;
    private final String createdAt;
    private final List<OAuthClientGrantType> grantTypes;
    private final String logoUri;
    private final List<String> redirectUris;
    private final OAuthClientRegistrationType registrationType;
    private final List<OAuthClientResponseType> responseTypes;
    private final String scope;
    private final OAuthClientTokenEndpointAuthMethod tokenEndpointAuthMethod;
    private final String updatedAt;

    /* JADX WARNING: type inference failed for: r0v0, types: [c25, java.lang.Object] */
    static {
        jk4 jk4 = new jk4(9);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, null, rg3.y(i44, jk4), null, null, rg3.y(i44, new jk4(10)), rg3.y(i44, new jk4(11)), rg3.y(i44, new jk4(12)), null, rg3.y(i44, new jk4(13)), rg3.y(i44, new jk4(14)), null, null};
    }

    public /* synthetic */ OAuthClient(int i, String str, String str2, String str3, OAuthClientType oAuthClientType, String str4, String str5, List list, List list2, List list3, String str6, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, OAuthClientRegistrationType oAuthClientRegistrationType, String str7, String str8, rl6 rl6) {
        if (5 == (i & 5)) {
            this.clientId = str;
            if ((i & 2) == 0) {
                this.clientSecret = null;
            } else {
                this.clientSecret = str2;
            }
            this.clientName = str3;
            if ((i & 8) == 0) {
                this.clientType = null;
            } else {
                this.clientType = oAuthClientType;
            }
            if ((i & 16) == 0) {
                this.clientUri = null;
            } else {
                this.clientUri = str4;
            }
            if ((i & 32) == 0) {
                this.logoUri = null;
            } else {
                this.logoUri = str5;
            }
            int i2 = i & 64;
            a42 a42 = a42.w;
            if (i2 == 0) {
                this.redirectUris = a42;
            } else {
                this.redirectUris = list;
            }
            if ((i & 128) == 0) {
                this.grantTypes = a42;
            } else {
                this.grantTypes = list2;
            }
            if ((i & 256) == 0) {
                this.responseTypes = a42;
            } else {
                this.responseTypes = list3;
            }
            if ((i & 512) == 0) {
                this.scope = null;
            } else {
                this.scope = str6;
            }
            if ((i & 1024) == 0) {
                this.tokenEndpointAuthMethod = null;
            } else {
                this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
            }
            if ((i & 2048) == 0) {
                this.registrationType = null;
            } else {
                this.registrationType = oAuthClientRegistrationType;
            }
            if ((i & 4096) == 0) {
                this.createdAt = null;
            } else {
                this.createdAt = str7;
            }
            if ((i & 8192) == 0) {
                this.updatedAt = null;
            } else {
                this.updatedAt = str8;
            }
        } else {
            wn6.x(i, 5, b25.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$0() {
        return new cs(t47.a, 0);
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$1() {
        return new cs(OAuthClientGrantType.Companion.serializer(), 0);
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$2() {
        return new cs(OAuthClientResponseType.Companion.serializer(), 0);
    }

    public static /* synthetic */ OAuthClient copy$default(OAuthClient oAuthClient, String str, String str2, String str3, OAuthClientType oAuthClientType, String str4, String str5, List list, List list2, List list3, String str6, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, OAuthClientRegistrationType oAuthClientRegistrationType, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        OAuthClientType oAuthClientType2;
        String str12;
        String str13;
        List list4;
        List list5;
        List list6;
        String str14;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod2;
        OAuthClientRegistrationType oAuthClientRegistrationType2;
        String str15;
        String str16;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str9 = oAuthClient.clientId;
        } else {
            str9 = str;
        }
        if ((i2 & 2) != 0) {
            str10 = oAuthClient.clientSecret;
        } else {
            str10 = str2;
        }
        if ((i2 & 4) != 0) {
            str11 = oAuthClient.clientName;
        } else {
            str11 = str3;
        }
        if ((i2 & 8) != 0) {
            oAuthClientType2 = oAuthClient.clientType;
        } else {
            oAuthClientType2 = oAuthClientType;
        }
        if ((i2 & 16) != 0) {
            str12 = oAuthClient.clientUri;
        } else {
            str12 = str4;
        }
        if ((i2 & 32) != 0) {
            str13 = oAuthClient.logoUri;
        } else {
            str13 = str5;
        }
        if ((i2 & 64) != 0) {
            list4 = oAuthClient.redirectUris;
        } else {
            list4 = list;
        }
        if ((i2 & 128) != 0) {
            list5 = oAuthClient.grantTypes;
        } else {
            list5 = list2;
        }
        if ((i2 & 256) != 0) {
            list6 = oAuthClient.responseTypes;
        } else {
            list6 = list3;
        }
        if ((i2 & 512) != 0) {
            str14 = oAuthClient.scope;
        } else {
            str14 = str6;
        }
        if ((i2 & 1024) != 0) {
            oAuthClientTokenEndpointAuthMethod2 = oAuthClient.tokenEndpointAuthMethod;
        } else {
            oAuthClientTokenEndpointAuthMethod2 = oAuthClientTokenEndpointAuthMethod;
        }
        if ((i2 & 2048) != 0) {
            oAuthClientRegistrationType2 = oAuthClient.registrationType;
        } else {
            oAuthClientRegistrationType2 = oAuthClientRegistrationType;
        }
        if ((i2 & 4096) != 0) {
            str15 = oAuthClient.createdAt;
        } else {
            str15 = str7;
        }
        if ((i2 & 8192) != 0) {
            str16 = oAuthClient.updatedAt;
        } else {
            str16 = str8;
        }
        return oAuthClient.copy(str9, str10, str11, oAuthClientType2, str12, str13, list4, list5, list6, str14, oAuthClientTokenEndpointAuthMethod2, oAuthClientRegistrationType2, str15, str16);
    }

    public static final /* synthetic */ void write$Self$auth_kt(OAuthClient oAuthClient, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.x(ll6, 0, oAuthClient.clientId);
        if (hy0.f(ll6) || oAuthClient.clientSecret != null) {
            hy0.A(ll6, 1, t47.a, oAuthClient.clientSecret);
        }
        hy0.x(ll6, 2, oAuthClient.clientName);
        if (hy0.f(ll6) || oAuthClient.clientType != null) {
            hy0.A(ll6, 3, (zr3) nz3Arr[3].getValue(), oAuthClient.clientType);
        }
        if (hy0.f(ll6) || oAuthClient.clientUri != null) {
            hy0.A(ll6, 4, t47.a, oAuthClient.clientUri);
        }
        if (hy0.f(ll6) || oAuthClient.logoUri != null) {
            hy0.A(ll6, 5, t47.a, oAuthClient.logoUri);
        }
        boolean f = hy0.f(ll6);
        a42 a42 = a42.w;
        if (f || !sg3.e(oAuthClient.redirectUris, a42)) {
            hy0.o(ll6, 6, (zr3) nz3Arr[6].getValue(), oAuthClient.redirectUris);
        }
        if (hy0.f(ll6) || !sg3.e(oAuthClient.grantTypes, a42)) {
            hy0.o(ll6, 7, (zr3) nz3Arr[7].getValue(), oAuthClient.grantTypes);
        }
        if (hy0.f(ll6) || !sg3.e(oAuthClient.responseTypes, a42)) {
            hy0.o(ll6, 8, (zr3) nz3Arr[8].getValue(), oAuthClient.responseTypes);
        }
        if (hy0.f(ll6) || oAuthClient.scope != null) {
            hy0.A(ll6, 9, t47.a, oAuthClient.scope);
        }
        if (hy0.f(ll6) || oAuthClient.tokenEndpointAuthMethod != null) {
            hy0.A(ll6, 10, (zr3) nz3Arr[10].getValue(), oAuthClient.tokenEndpointAuthMethod);
        }
        if (hy0.f(ll6) || oAuthClient.registrationType != null) {
            hy0.A(ll6, 11, (zr3) nz3Arr[11].getValue(), oAuthClient.registrationType);
        }
        if (hy0.f(ll6) || oAuthClient.createdAt != null) {
            hy0.A(ll6, 12, t47.a, oAuthClient.createdAt);
        }
        if (hy0.f(ll6) || oAuthClient.updatedAt != null) {
            hy0.A(ll6, 13, t47.a, oAuthClient.updatedAt);
        }
    }

    public final String component1() {
        return this.clientId;
    }

    public final String component10() {
        return this.scope;
    }

    public final OAuthClientTokenEndpointAuthMethod component11() {
        return this.tokenEndpointAuthMethod;
    }

    public final OAuthClientRegistrationType component12() {
        return this.registrationType;
    }

    public final String component13() {
        return this.createdAt;
    }

    public final String component14() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.clientSecret;
    }

    public final String component3() {
        return this.clientName;
    }

    public final OAuthClientType component4() {
        return this.clientType;
    }

    public final String component5() {
        return this.clientUri;
    }

    public final String component6() {
        return this.logoUri;
    }

    public final List<String> component7() {
        return this.redirectUris;
    }

    public final List<OAuthClientGrantType> component8() {
        return this.grantTypes;
    }

    public final List<OAuthClientResponseType> component9() {
        return this.responseTypes;
    }

    public final OAuthClient copy(String str, String str2, String str3, OAuthClientType oAuthClientType, String str4, String str5, List<String> list, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, String str6, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, OAuthClientRegistrationType oAuthClientRegistrationType, String str7, String str8) {
        str.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new OAuthClient(str, str2, str3, oAuthClientType, str4, str5, list, list2, list3, str6, oAuthClientTokenEndpointAuthMethod, oAuthClientRegistrationType, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthClient)) {
            return false;
        }
        OAuthClient oAuthClient = (OAuthClient) obj;
        if (sg3.e(this.clientId, oAuthClient.clientId) && sg3.e(this.clientSecret, oAuthClient.clientSecret) && sg3.e(this.clientName, oAuthClient.clientName) && this.clientType == oAuthClient.clientType && sg3.e(this.clientUri, oAuthClient.clientUri) && sg3.e(this.logoUri, oAuthClient.logoUri) && sg3.e(this.redirectUris, oAuthClient.redirectUris) && sg3.e(this.grantTypes, oAuthClient.grantTypes) && sg3.e(this.responseTypes, oAuthClient.responseTypes) && sg3.e(this.scope, oAuthClient.scope) && this.tokenEndpointAuthMethod == oAuthClient.tokenEndpointAuthMethod && this.registrationType == oAuthClient.registrationType && sg3.e(this.createdAt, oAuthClient.createdAt) && sg3.e(this.updatedAt, oAuthClient.updatedAt)) {
            return true;
        }
        return false;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final OAuthClientType getClientType() {
        return this.clientType;
    }

    public final String getClientUri() {
        return this.clientUri;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final List<OAuthClientGrantType> getGrantTypes() {
        return this.grantTypes;
    }

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final List<String> getRedirectUris() {
        return this.redirectUris;
    }

    public final OAuthClientRegistrationType getRegistrationType() {
        return this.registrationType;
    }

    public final List<OAuthClientResponseType> getResponseTypes() {
        return this.responseTypes;
    }

    public final String getScope() {
        return this.scope;
    }

    public final OAuthClientTokenEndpointAuthMethod getTokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int hashCode = this.clientId.hashCode() * 31;
        String str = this.clientSecret;
        int i9 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int h = hl6.h((hashCode + i) * 31, 31, this.clientName);
        OAuthClientType oAuthClientType = this.clientType;
        if (oAuthClientType == null) {
            i2 = 0;
        } else {
            i2 = oAuthClientType.hashCode();
        }
        int i10 = (h + i2) * 31;
        String str2 = this.clientUri;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str3 = this.logoUri;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int j = hl6.j(this.responseTypes, hl6.j(this.grantTypes, hl6.j(this.redirectUris, (i11 + i4) * 31, 31), 31), 31);
        String str4 = this.scope;
        if (str4 == null) {
            i5 = 0;
        } else {
            i5 = str4.hashCode();
        }
        int i12 = (j + i5) * 31;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod = this.tokenEndpointAuthMethod;
        if (oAuthClientTokenEndpointAuthMethod == null) {
            i6 = 0;
        } else {
            i6 = oAuthClientTokenEndpointAuthMethod.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        OAuthClientRegistrationType oAuthClientRegistrationType = this.registrationType;
        if (oAuthClientRegistrationType == null) {
            i7 = 0;
        } else {
            i7 = oAuthClientRegistrationType.hashCode();
        }
        int i14 = (i13 + i7) * 31;
        String str5 = this.createdAt;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int i15 = (i14 + i8) * 31;
        String str6 = this.updatedAt;
        if (str6 != null) {
            i9 = str6.hashCode();
        }
        return i15 + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OAuthClient(clientId=");
        sb.append(this.clientId);
        sb.append(", clientSecret=");
        sb.append(this.clientSecret);
        sb.append(", clientName=");
        sb.append(this.clientName);
        sb.append(", clientType=");
        sb.append(this.clientType);
        sb.append(", clientUri=");
        sb.append(this.clientUri);
        sb.append(", logoUri=");
        sb.append(this.logoUri);
        sb.append(", redirectUris=");
        sb.append(this.redirectUris);
        sb.append(", grantTypes=");
        sb.append(this.grantTypes);
        sb.append(", responseTypes=");
        sb.append(this.responseTypes);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", tokenEndpointAuthMethod=");
        sb.append(this.tokenEndpointAuthMethod);
        sb.append(", registrationType=");
        sb.append(this.registrationType);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        return hl6.o(sb, this.updatedAt, ')');
    }

    public static /* synthetic */ void getClientId$annotations() {
    }

    public static /* synthetic */ void getClientName$annotations() {
    }

    public static /* synthetic */ void getClientSecret$annotations() {
    }

    public static /* synthetic */ void getClientType$annotations() {
    }

    public static /* synthetic */ void getClientUri$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getGrantTypes$annotations() {
    }

    public static /* synthetic */ void getLogoUri$annotations() {
    }

    public static /* synthetic */ void getRedirectUris$annotations() {
    }

    public static /* synthetic */ void getRegistrationType$annotations() {
    }

    public static /* synthetic */ void getResponseTypes$annotations() {
    }

    public static /* synthetic */ void getTokenEndpointAuthMethod$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public OAuthClient(String str, String str2, String str3, OAuthClientType oAuthClientType, String str4, String str5, List<String> list, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, String str6, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, OAuthClientRegistrationType oAuthClientRegistrationType, String str7, String str8) {
        str.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.clientId = str;
        this.clientSecret = str2;
        this.clientName = str3;
        this.clientType = oAuthClientType;
        this.clientUri = str4;
        this.logoUri = str5;
        this.redirectUris = list;
        this.grantTypes = list2;
        this.responseTypes = list3;
        this.scope = str6;
        this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
        this.registrationType = oAuthClientRegistrationType;
        this.createdAt = str7;
        this.updatedAt = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ OAuthClient(String str, String str2, String str3, OAuthClientType oAuthClientType, String str4, String str5, List list, List list2, List list3, String str6, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, OAuthClientRegistrationType oAuthClientRegistrationType, String str7, String str8, int i, hl1 hl1) {
        this(str, r5, str3, r7, r8, r9, r10, r11, r12, (r0 & 512) != 0 ? null : str6, (r0 & 1024) != 0 ? null : oAuthClientTokenEndpointAuthMethod, (r0 & 2048) != 0 ? null : oAuthClientRegistrationType, (r0 & 4096) != 0 ? null : str7, (r0 & 8192) != 0 ? null : str8);
        int i2 = i;
        String str9 = (i2 & 2) != 0 ? null : str2;
        OAuthClientType oAuthClientType2 = (i2 & 8) != 0 ? null : oAuthClientType;
        String str10 = (i2 & 16) != 0 ? null : str4;
        String str11 = (i2 & 32) != 0 ? null : str5;
        int i3 = i2 & 64;
        a42 a42 = a42.w;
        a42 a422 = i3 != 0 ? a42 : list;
        a42 a423 = (i2 & 128) != 0 ? a42 : list2;
        a42 a424 = (i2 & 256) != 0 ? a42 : list3;
    }
}

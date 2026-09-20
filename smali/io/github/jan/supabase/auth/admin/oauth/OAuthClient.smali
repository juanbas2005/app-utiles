.class public final Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 d2\u00020\u0001:\u0002efB\u00b3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u00b9\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010\u001fJ\u00c0\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010\u001fJ\u0010\u00104\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00108\u001a\u0002072\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109J\'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001\u00a2\u0006\u0004\u0008@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010C\u0012\u0004\u0008E\u0010F\u001a\u0004\u0008D\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010C\u0012\u0004\u0008H\u0010F\u001a\u0004\u0008G\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010C\u0012\u0004\u0008J\u0010F\u001a\u0004\u0008I\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010K\u0012\u0004\u0008M\u0010F\u001a\u0004\u0008L\u0010#R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010C\u0012\u0004\u0008O\u0010F\u001a\u0004\u0008N\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010C\u0012\u0004\u0008Q\u0010F\u001a\u0004\u0008P\u0010\u001fR&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010R\u0012\u0004\u0008T\u0010F\u001a\u0004\u0008S\u0010\'R&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010R\u0012\u0004\u0008V\u0010F\u001a\u0004\u0008U\u0010\'R&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010R\u0012\u0004\u0008X\u0010F\u001a\u0004\u0008W\u0010\'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010C\u001a\u0004\u0008Y\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010Z\u0012\u0004\u0008\\\u0010F\u001a\u0004\u0008[\u0010,R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010]\u0012\u0004\u0008_\u0010F\u001a\u0004\u0008^\u0010.R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010C\u0012\u0004\u0008a\u0010F\u001a\u0004\u0008`\u0010\u001fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010C\u0012\u0004\u0008c\u0010F\u001a\u0004\u0008b\u0010\u001f\u00a8\u0006g"
    }
    d2 = {
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;",
        "",
        "",
        "clientId",
        "clientSecret",
        "clientName",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;",
        "clientType",
        "clientUri",
        "logoUri",
        "",
        "redirectUris",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
        "grantTypes",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
        "responseTypes",
        "scope",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
        "tokenEndpointAuthMethod",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;",
        "registrationType",
        "createdAt",
        "updatedAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lrl6;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;Lrl6;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
        "component12",
        "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;",
        "component13",
        "component14",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lhy0;",
        "output",
        "Lll6;",
        "serialDesc",
        "Lvs7;",
        "write$Self$auth_kt",
        "(Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;Lhy0;Lll6;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getClientId",
        "getClientId$annotations",
        "()V",
        "getClientSecret",
        "getClientSecret$annotations",
        "getClientName",
        "getClientName$annotations",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;",
        "getClientType",
        "getClientType$annotations",
        "getClientUri",
        "getClientUri$annotations",
        "getLogoUri",
        "getLogoUri$annotations",
        "Ljava/util/List;",
        "getRedirectUris",
        "getRedirectUris$annotations",
        "getGrantTypes",
        "getGrantTypes$annotations",
        "getResponseTypes",
        "getResponseTypes$annotations",
        "getScope",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
        "getTokenEndpointAuthMethod",
        "getTokenEndpointAuthMethod$annotations",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;",
        "getRegistrationType",
        "getRegistrationType$annotations",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "Companion",
        "b25",
        "c25",
        "auth-kt"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final $childSerializers:[Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final Companion:Lc25;


# instance fields
.field private final clientId:Ljava/lang/String;

.field private final clientName:Ljava/lang/String;

.field private final clientSecret:Ljava/lang/String;

.field private final clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

.field private final clientUri:Ljava/lang/String;

.field private final createdAt:Ljava/lang/String;

.field private final grantTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
            ">;"
        }
    .end annotation
.end field

.field private final logoUri:Ljava/lang/String;

.field private final redirectUris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

.field private final responseTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
            ">;"
        }
    .end annotation
.end field

.field private final scope:Ljava/lang/String;

.field private final tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

.field private final updatedAt:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lc25;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->Companion:Lc25;

    .line 7
    .line 8
    new-instance v0, Ljk4;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljk4;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Li44;->w:Li44;

    .line 16
    .line 17
    invoke-static {v2, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v3, Ljk4;

    .line 22
    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljk4;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, Ljk4;

    .line 33
    .line 34
    const/16 v6, 0xb

    .line 35
    .line 36
    invoke-direct {v5, v6}, Ljk4;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v5}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v7, Ljk4;

    .line 44
    .line 45
    const/16 v8, 0xc

    .line 46
    .line 47
    invoke-direct {v7, v8}, Ljk4;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v7}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v9, Ljk4;

    .line 55
    .line 56
    const/16 v10, 0xd

    .line 57
    .line 58
    invoke-direct {v9, v10}, Ljk4;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v9}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    new-instance v11, Ljk4;

    .line 66
    .line 67
    const/16 v12, 0xe

    .line 68
    .line 69
    invoke-direct {v11, v12}, Ljk4;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v11}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-array v11, v12, [Lnz3;

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    aput-object v13, v11, v12

    .line 81
    .line 82
    const/4 v12, 0x1

    .line 83
    aput-object v13, v11, v12

    .line 84
    .line 85
    const/4 v12, 0x2

    .line 86
    aput-object v13, v11, v12

    .line 87
    .line 88
    const/4 v12, 0x3

    .line 89
    aput-object v0, v11, v12

    .line 90
    .line 91
    const/4 v0, 0x4

    .line 92
    aput-object v13, v11, v0

    .line 93
    .line 94
    const/4 v0, 0x5

    .line 95
    aput-object v13, v11, v0

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    aput-object v3, v11, v0

    .line 99
    .line 100
    const/4 v0, 0x7

    .line 101
    aput-object v5, v11, v0

    .line 102
    .line 103
    const/16 v0, 0x8

    .line 104
    .line 105
    aput-object v7, v11, v0

    .line 106
    .line 107
    aput-object v13, v11, v1

    .line 108
    .line 109
    aput-object v9, v11, v4

    .line 110
    .line 111
    aput-object v2, v11, v6

    .line 112
    .line 113
    aput-object v13, v11, v8

    .line 114
    .line 115
    aput-object v13, v11, v10

    .line 116
    .line 117
    sput-object v11, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->$childSerializers:[Lnz3;

    .line 118
    .line 119
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;Lrl6;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x5

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x5

    .line 5
    if-ne v2, v0, :cond_c

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object p3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 20
    .line 21
    :goto_0
    iput-object p4, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 22
    .line 23
    and-int/lit8 p2, p1, 0x8

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iput-object p5, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 31
    .line 32
    :goto_1
    and-int/lit8 p2, p1, 0x10

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iput-object p6, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 40
    .line 41
    :goto_2
    and-int/lit8 p2, p1, 0x20

    .line 42
    .line 43
    if-nez p2, :cond_3

    .line 44
    .line 45
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    iput-object p7, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 49
    .line 50
    :goto_3
    and-int/lit8 p2, p1, 0x40

    .line 51
    .line 52
    sget-object p3, La42;->w:La42;

    .line 53
    .line 54
    if-nez p2, :cond_4

    .line 55
    .line 56
    iput-object p3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_4
    iput-object p8, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 60
    .line 61
    :goto_4
    and-int/lit16 p2, p1, 0x80

    .line 62
    .line 63
    if-nez p2, :cond_5

    .line 64
    .line 65
    iput-object p3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_5
    iput-object p9, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 69
    .line 70
    :goto_5
    and-int/lit16 p2, p1, 0x100

    .line 71
    .line 72
    if-nez p2, :cond_6

    .line 73
    .line 74
    iput-object p3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_6

    .line 77
    :cond_6
    iput-object p10, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 78
    .line 79
    :goto_6
    and-int/lit16 p2, p1, 0x200

    .line 80
    .line 81
    if-nez p2, :cond_7

    .line 82
    .line 83
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 84
    .line 85
    goto :goto_7

    .line 86
    :cond_7
    iput-object p11, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 87
    .line 88
    :goto_7
    and-int/lit16 p2, p1, 0x400

    .line 89
    .line 90
    if-nez p2, :cond_8

    .line 91
    .line 92
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 93
    .line 94
    goto :goto_8

    .line 95
    :cond_8
    iput-object p12, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 96
    .line 97
    :goto_8
    and-int/lit16 p2, p1, 0x800

    .line 98
    .line 99
    if-nez p2, :cond_9

    .line 100
    .line 101
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_9
    move-object/from16 p2, p13

    .line 105
    .line 106
    iput-object p2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 107
    .line 108
    :goto_9
    and-int/lit16 p2, p1, 0x1000

    .line 109
    .line 110
    if-nez p2, :cond_a

    .line 111
    .line 112
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 113
    .line 114
    goto :goto_a

    .line 115
    :cond_a
    move-object/from16 p2, p14

    .line 116
    .line 117
    iput-object p2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 118
    .line 119
    :goto_a
    and-int/lit16 p1, p1, 0x2000

    .line 120
    .line 121
    if-nez p1, :cond_b

    .line 122
    .line 123
    iput-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 124
    .line 125
    return-void

    .line 126
    :cond_b
    move-object/from16 p1, p15

    .line 127
    .line 128
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 129
    .line 130
    return-void

    .line 131
    :cond_c
    sget-object p0, Lb25;->a:Lb25;

    .line 132
    .line 133
    invoke-virtual {p0}, Lb25;->getDescriptor()Lll6;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p1, v2, p0}, Lwn6;->x(IILll6;)V

    .line 138
    .line 139
    .line 140
    throw v1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
            ">;",
            "Ljava/lang/String;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 143
    iput-object p2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 144
    iput-object p3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 145
    iput-object p4, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 146
    iput-object p5, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 147
    iput-object p6, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 148
    iput-object p7, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 149
    iput-object p8, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 150
    iput-object p9, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 151
    iput-object p10, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 152
    iput-object p11, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 153
    iput-object p12, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 154
    iput-object p13, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 155
    iput-object p14, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;ILhl1;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 156
    sget-object v3, La42;->w:La42;

    if-eqz v1, :cond_4

    move-object v10, v3

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v3

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v3

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v16, v2

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_b

    move-object/from16 v17, v2

    :goto_b
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    goto :goto_c

    :cond_b
    move-object/from16 v17, p14

    goto :goto_b

    :goto_c
    invoke-direct/range {v3 .. v17}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lzr3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;->Companion:Lj25;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj25;->serializer()Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lzr3;
    .locals 3

    .line 1
    new-instance v0, Lcs;

    .line 2
    .line 3
    sget-object v1, Lt47;->a:Lt47;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcs;-><init>(Lzr3;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lzr3;
    .locals 3

    .line 1
    new-instance v0, Lcs;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;->Companion:Ld25;

    .line 4
    .line 5
    invoke-virtual {v1}, Ld25;->serializer()Lzr3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lcs;-><init>(Lzr3;I)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lzr3;
    .locals 3

    .line 1
    new-instance v0, Lcs;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->Companion:Lh25;

    .line 4
    .line 5
    invoke-virtual {v1}, Lh25;->serializer()Lzr3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lcs;-><init>(Lzr3;I)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lzr3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->Companion:Li25;

    .line 2
    .line 3
    invoke-virtual {v0}, Li25;->serializer()Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lzr3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;->Companion:Lg25;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg25;->serializer()Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_$2()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lnz3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->$childSerializers:[Lnz3;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic b()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_$3()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic c()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_$0()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic copy$default(Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;
    .locals 14

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, p1

    .line 11
    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v2, p2

    .line 19
    .line 20
    :goto_1
    and-int/lit8 v3, v0, 0x4

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v3, p3

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v4, v0, 0x8

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    iget-object v4, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move-object/from16 v4, p4

    .line 37
    .line 38
    :goto_3
    and-int/lit8 v5, v0, 0x10

    .line 39
    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    iget-object v5, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_4
    move-object/from16 v5, p5

    .line 46
    .line 47
    :goto_4
    and-int/lit8 v6, v0, 0x20

    .line 48
    .line 49
    if-eqz v6, :cond_5

    .line 50
    .line 51
    iget-object v6, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_5
    move-object/from16 v6, p6

    .line 55
    .line 56
    :goto_5
    and-int/lit8 v7, v0, 0x40

    .line 57
    .line 58
    if-eqz v7, :cond_6

    .line 59
    .line 60
    iget-object v7, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 61
    .line 62
    goto :goto_6

    .line 63
    :cond_6
    move-object/from16 v7, p7

    .line 64
    .line 65
    :goto_6
    and-int/lit16 v8, v0, 0x80

    .line 66
    .line 67
    if-eqz v8, :cond_7

    .line 68
    .line 69
    iget-object v8, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 70
    .line 71
    goto :goto_7

    .line 72
    :cond_7
    move-object/from16 v8, p8

    .line 73
    .line 74
    :goto_7
    and-int/lit16 v9, v0, 0x100

    .line 75
    .line 76
    if-eqz v9, :cond_8

    .line 77
    .line 78
    iget-object v9, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 79
    .line 80
    goto :goto_8

    .line 81
    :cond_8
    move-object/from16 v9, p9

    .line 82
    .line 83
    :goto_8
    and-int/lit16 v10, v0, 0x200

    .line 84
    .line 85
    if-eqz v10, :cond_9

    .line 86
    .line 87
    iget-object v10, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_9

    .line 90
    :cond_9
    move-object/from16 v10, p10

    .line 91
    .line 92
    :goto_9
    and-int/lit16 v11, v0, 0x400

    .line 93
    .line 94
    if-eqz v11, :cond_a

    .line 95
    .line 96
    iget-object v11, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 97
    .line 98
    goto :goto_a

    .line 99
    :cond_a
    move-object/from16 v11, p11

    .line 100
    .line 101
    :goto_a
    and-int/lit16 v12, v0, 0x800

    .line 102
    .line 103
    if-eqz v12, :cond_b

    .line 104
    .line 105
    iget-object v12, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 106
    .line 107
    goto :goto_b

    .line 108
    :cond_b
    move-object/from16 v12, p12

    .line 109
    .line 110
    :goto_b
    and-int/lit16 v13, v0, 0x1000

    .line 111
    .line 112
    if-eqz v13, :cond_c

    .line 113
    .line 114
    iget-object v13, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 115
    .line 116
    goto :goto_c

    .line 117
    :cond_c
    move-object/from16 v13, p13

    .line 118
    .line 119
    :goto_c
    and-int/lit16 v0, v0, 0x2000

    .line 120
    .line 121
    if-eqz v0, :cond_d

    .line 122
    .line 123
    iget-object v0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 124
    .line 125
    move-object/from16 p15, v0

    .line 126
    .line 127
    :goto_d
    move-object p1, p0

    .line 128
    move-object/from16 p2, v1

    .line 129
    .line 130
    move-object/from16 p3, v2

    .line 131
    .line 132
    move-object/from16 p4, v3

    .line 133
    .line 134
    move-object/from16 p5, v4

    .line 135
    .line 136
    move-object/from16 p6, v5

    .line 137
    .line 138
    move-object/from16 p7, v6

    .line 139
    .line 140
    move-object/from16 p8, v7

    .line 141
    .line 142
    move-object/from16 p9, v8

    .line 143
    .line 144
    move-object/from16 p10, v9

    .line 145
    .line 146
    move-object/from16 p11, v10

    .line 147
    .line 148
    move-object/from16 p12, v11

    .line 149
    .line 150
    move-object/from16 p13, v12

    .line 151
    .line 152
    move-object/from16 p14, v13

    .line 153
    .line 154
    goto :goto_e

    .line 155
    :cond_d
    move-object/from16 p15, p14

    .line 156
    .line 157
    goto :goto_d

    .line 158
    :goto_e
    invoke-virtual/range {p1 .. p15}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0
    .line 163
    .line 164
    .line 165
    .line 166
.end method

.method public static synthetic d()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic e()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_$1()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic f()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->_childSerializers$_anonymous_$4()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getClientId$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getClientName$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getClientSecret$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getClientType$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getClientUri$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getCreatedAt$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getGrantTypes$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getLogoUri$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getRedirectUris$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getRegistrationType$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getResponseTypes$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getTokenEndpointAuthMethod$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic getUpdatedAt$annotations()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic write$Self$auth_kt(Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;Lhy0;Lll6;)V
    .locals 5

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->$childSerializers:[Lnz3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 5
    .line 6
    invoke-interface {p1, p2, v1, v2}, Lhy0;->x(Lll6;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :goto_0
    sget-object v1, Lt47;->a:Lt47;

    .line 21
    .line 22
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-interface {p1, p2, v3, v1, v2}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v1, 0x2

    .line 29
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1, p2, v1, v2}, Lhy0;->x(Lll6;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :goto_1
    const/4 v1, 0x3

    .line 46
    aget-object v2, v0, v1

    .line 47
    .line 48
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lzr3;

    .line 53
    .line 54
    iget-object v3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 55
    .line 56
    invoke-interface {p1, p2, v1, v2, v3}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    :goto_2
    sget-object v1, Lt47;->a:Lt47;

    .line 71
    .line 72
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v3, 0x4

    .line 75
    invoke-interface {p1, p2, v3, v1, v2}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v1, :cond_7

    .line 88
    .line 89
    :goto_3
    sget-object v1, Lt47;->a:Lt47;

    .line 90
    .line 91
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 92
    .line 93
    const/4 v3, 0x5

    .line 94
    invoke-interface {p1, p2, v3, v1, v2}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_7
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    sget-object v2, La42;->w:La42;

    .line 102
    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_8
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_9

    .line 113
    .line 114
    :goto_4
    const/4 v1, 0x6

    .line 115
    aget-object v3, v0, v1

    .line 116
    .line 117
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Lzr3;

    .line 122
    .line 123
    iget-object v4, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {p1, p2, v1, v3, v4}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_9
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_a

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_a
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_b

    .line 142
    .line 143
    :goto_5
    const/4 v1, 0x7

    .line 144
    aget-object v3, v0, v1

    .line 145
    .line 146
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Lzr3;

    .line 151
    .line 152
    iget-object v4, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {p1, p2, v1, v3, v4}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_c

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_c
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 165
    .line 166
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_d

    .line 171
    .line 172
    :goto_6
    const/16 v1, 0x8

    .line 173
    .line 174
    aget-object v2, v0, v1

    .line 175
    .line 176
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Lzr3;

    .line 181
    .line 182
    iget-object v3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {p1, p2, v1, v2, v3}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_d
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_e

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_e
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v1, :cond_f

    .line 197
    .line 198
    :goto_7
    sget-object v1, Lt47;->a:Lt47;

    .line 199
    .line 200
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 201
    .line 202
    const/16 v3, 0x9

    .line 203
    .line 204
    invoke-interface {p1, p2, v3, v1, v2}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_f
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_10

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_10
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 215
    .line 216
    if-eqz v1, :cond_11

    .line 217
    .line 218
    :goto_8
    const/16 v1, 0xa

    .line 219
    .line 220
    aget-object v2, v0, v1

    .line 221
    .line 222
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Lzr3;

    .line 227
    .line 228
    iget-object v3, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 229
    .line 230
    invoke-interface {p1, p2, v1, v2, v3}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_11
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_12

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_12
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 241
    .line 242
    if-eqz v1, :cond_13

    .line 243
    .line 244
    :goto_9
    const/16 v1, 0xb

    .line 245
    .line 246
    aget-object v0, v0, v1

    .line 247
    .line 248
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Lzr3;

    .line 253
    .line 254
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 255
    .line 256
    invoke-interface {p1, p2, v1, v0, v2}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_13
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_14

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_14
    iget-object v0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 267
    .line 268
    if-eqz v0, :cond_15

    .line 269
    .line 270
    :goto_a
    sget-object v0, Lt47;->a:Lt47;

    .line 271
    .line 272
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 273
    .line 274
    const/16 v2, 0xc

    .line 275
    .line 276
    invoke-interface {p1, p2, v2, v0, v1}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_15
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_16

    .line 284
    .line 285
    goto :goto_b

    .line 286
    :cond_16
    iget-object v0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 287
    .line 288
    if-eqz v0, :cond_17

    .line 289
    .line 290
    :goto_b
    sget-object v0, Lt47;->a:Lt47;

    .line 291
    .line 292
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 293
    .line 294
    const/16 v1, 0xd

    .line 295
    .line 296
    invoke-interface {p1, p2, v1, v0, p0}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_17
    return-void
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component10()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component11()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component12()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component13()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component14()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component4()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component7()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component8()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component9()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
            ">;",
            "Ljava/lang/String;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 17
    .line 18
    invoke-direct/range {p0 .. p14}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 12
    .line 13
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 47
    .line 48
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 76
    .line 77
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 87
    .line 88
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 98
    .line 99
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 120
    .line 121
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 122
    .line 123
    if-eq v1, v3, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 127
    .line 128
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 129
    .line 130
    if-eq v1, v3, :cond_d

    .line 131
    .line 132
    return v2

    .line 133
    :cond_d
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v3, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_e

    .line 142
    .line 143
    return v2

    .line 144
    :cond_e
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 145
    .line 146
    iget-object p1, p1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_f

    .line 153
    .line 154
    return v2

    .line 155
    :cond_f
    return v0
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final getClientId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getClientName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getClientType()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getClientUri()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getGrantTypes()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLogoUri()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRedirectUris()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRegistrationType()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getResponseTypes()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getScope()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getTokenEndpointAuthMethod()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    move v2, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    :goto_0
    add-int/2addr v0, v2

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lhl6;->h(IILjava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    move v2, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_1
    add-int/2addr v0, v2

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :goto_2
    add-int/2addr v0, v2

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_3
    add-int/2addr v0, v2

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, Lhl6;->j(Ljava/util/List;II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v2, v0, v1}, Lhl6;->j(Ljava/util/List;II)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v2, v0, v1}, Lhl6;->j(Ljava/util/List;II)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 84
    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    move v2, v3

    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :goto_4
    add-int/2addr v0, v2

    .line 94
    mul-int/2addr v0, v1

    .line 95
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 96
    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    move v2, v3

    .line 100
    goto :goto_5

    .line 101
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :goto_5
    add-int/2addr v0, v2

    .line 106
    mul-int/2addr v0, v1

    .line 107
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 108
    .line 109
    if-nez v2, :cond_6

    .line 110
    .line 111
    move v2, v3

    .line 112
    goto :goto_6

    .line 113
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    :goto_6
    add-int/2addr v0, v2

    .line 118
    mul-int/2addr v0, v1

    .line 119
    iget-object v2, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 120
    .line 121
    if-nez v2, :cond_7

    .line 122
    .line 123
    move v2, v3

    .line 124
    goto :goto_7

    .line 125
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    :goto_7
    add-int/2addr v0, v2

    .line 130
    mul-int/2addr v0, v1

    .line 131
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 132
    .line 133
    if-nez p0, :cond_8

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_8
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    :goto_8
    add-int/2addr v0, v3

    .line 141
    return v0
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OAuthClient(clientId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", clientSecret="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientSecret:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", clientName="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientName:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", clientType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", clientUri="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->clientUri:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", logoUri="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->logoUri:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", redirectUris="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->redirectUris:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", grantTypes="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->grantTypes:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", responseTypes="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->responseTypes:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", scope="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->scope:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", tokenEndpointAuthMethod="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->tokenEndpointAuthMethod:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", registrationType="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->registrationType:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", createdAt="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->createdAt:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", updatedAt="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->updatedAt:Ljava/lang/String;

    .line 139
    .line 140
    const/16 v1, 0x29

    .line 141
    .line 142
    invoke-static {v0, p0, v1}, Lhl6;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

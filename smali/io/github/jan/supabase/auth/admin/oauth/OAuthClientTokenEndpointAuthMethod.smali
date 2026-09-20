.class public final enum Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "i25",
        "NONE",
        "CLIENT_SECRET_BASIC",
        "CLIENT_SECRET_POST",
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
.field private static final synthetic $ENTRIES:Lu52;

.field private static final synthetic $VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

.field private static final $cachedSerializer$delegate:Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final enum CLIENT_SECRET_BASIC:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

.field public static final enum CLIENT_SECRET_POST:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

.field public static final Companion:Li25;

.field public static final enum NONE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;


# direct methods
.method private static final synthetic $values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
    .locals 3

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->NONE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->CLIENT_SECRET_BASIC:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 4
    .line 5
    sget-object v2, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->CLIENT_SECRET_POST:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->NONE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 10
    .line 11
    new-instance v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 12
    .line 13
    const-string v1, "CLIENT_SECRET_BASIC"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->CLIENT_SECRET_BASIC:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 20
    .line 21
    new-instance v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 22
    .line 23
    const-string v1, "CLIENT_SECRET_POST"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->CLIENT_SECRET_POST:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 30
    .line 31
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 36
    .line 37
    invoke-static {v0}, Lhj8;->t([Ljava/lang/Enum;)Lw52;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$ENTRIES:Lu52;

    .line 42
    .line 43
    new-instance v0, Li25;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->Companion:Li25;

    .line 49
    .line 50
    new-instance v0, Ljk4;

    .line 51
    .line 52
    const/16 v1, 0x13

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljk4;-><init>(I)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Li44;->w:Li44;

    .line 58
    .line 59
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$cachedSerializer$delegate:Lnz3;

    .line 64
    .line 65
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method private static final synthetic _init_$_anonymous_()Lzr3;
    .locals 4

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "client_secret_basic"

    .line 6
    .line 7
    const-string v2, "client_secret_post"

    .line 8
    .line 9
    const-string v3, "none"

    .line 10
    .line 11
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    filled-new-array {v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "io.github.jan.supabase.auth.admin.oauth.OAuthClientTokenEndpointAuthMethod"

    .line 21
    .line 22
    invoke-static {v3, v0, v1, v2}, Lkl8;->i(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La62;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
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
.end method

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->_init_$_anonymous_()Lzr3;

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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lnz3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$cachedSerializer$delegate:Lnz3;

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

.method public static getEntries()Lu52;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu52;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$ENTRIES:Lu52;

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

.method public static valueOf(Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
    .locals 1

    .line 1
    const-class v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 8
    .line 9
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;->$VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

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

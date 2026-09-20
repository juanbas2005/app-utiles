.class public final enum Lio/github/jan/supabase/auth/jwt/AMRMethod;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/jan/supabase/auth/jwt/AMRMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/github/jan/supabase/auth/jwt/AMRMethod;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "s",
        "Password",
        "OTP",
        "OAuth",
        "TOTP",
        "MFA_TOTP",
        "MFA_PHONE",
        "MFA_WEBAUTHN",
        "ANONYMOUS",
        "SSO_SAML",
        "MAGIC_LINK",
        "WEB3",
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

.field private static final synthetic $VALUES:[Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field private static final $cachedSerializer$delegate:Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final enum ANONYMOUS:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final Companion:Ls;

.field public static final enum MAGIC_LINK:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum MFA_PHONE:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum MFA_TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum MFA_WEBAUTHN:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum OAuth:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum OTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum Password:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum SSO_SAML:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

.field public static final enum WEB3:Lio/github/jan/supabase/auth/jwt/AMRMethod;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/github/jan/supabase/auth/jwt/AMRMethod;
    .locals 11

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->Password:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/jwt/AMRMethod;->OTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 4
    .line 5
    sget-object v2, Lio/github/jan/supabase/auth/jwt/AMRMethod;->OAuth:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 6
    .line 7
    sget-object v3, Lio/github/jan/supabase/auth/jwt/AMRMethod;->TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 8
    .line 9
    sget-object v4, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 10
    .line 11
    sget-object v5, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_PHONE:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 12
    .line 13
    sget-object v6, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_WEBAUTHN:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 14
    .line 15
    sget-object v7, Lio/github/jan/supabase/auth/jwt/AMRMethod;->ANONYMOUS:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 16
    .line 17
    sget-object v8, Lio/github/jan/supabase/auth/jwt/AMRMethod;->SSO_SAML:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 18
    .line 19
    sget-object v9, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MAGIC_LINK:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 20
    .line 21
    sget-object v10, Lio/github/jan/supabase/auth/jwt/AMRMethod;->WEB3:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 22
    .line 23
    filled-new-array/range {v0 .. v10}, [Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
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

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "password"

    .line 5
    .line 6
    const-string v3, "Password"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->Password:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 12
    .line 13
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 14
    .line 15
    const-string v1, "otp"

    .line 16
    .line 17
    const-string v2, "OTP"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->OTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 24
    .line 25
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "oauth"

    .line 29
    .line 30
    const-string v4, "OAuth"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->OAuth:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 36
    .line 37
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "totp"

    .line 41
    .line 42
    const-string v4, "TOTP"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 48
    .line 49
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "mfa/totp"

    .line 53
    .line 54
    const-string v4, "MFA_TOTP"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_TOTP:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 60
    .line 61
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "mfa/phone"

    .line 65
    .line 66
    const-string v4, "MFA_PHONE"

    .line 67
    .line 68
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_PHONE:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 72
    .line 73
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "mfa/webauthn"

    .line 77
    .line 78
    const-string v4, "MFA_WEBAUTHN"

    .line 79
    .line 80
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MFA_WEBAUTHN:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 84
    .line 85
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-string v2, "anonymous"

    .line 89
    .line 90
    const-string v4, "ANONYMOUS"

    .line 91
    .line 92
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->ANONYMOUS:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 96
    .line 97
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 98
    .line 99
    const/16 v1, 0x8

    .line 100
    .line 101
    const-string v2, "sso/saml"

    .line 102
    .line 103
    const-string v4, "SSO_SAML"

    .line 104
    .line 105
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->SSO_SAML:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 109
    .line 110
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 111
    .line 112
    const/16 v1, 0x9

    .line 113
    .line 114
    const-string v2, "magiclink"

    .line 115
    .line 116
    const-string v4, "MAGIC_LINK"

    .line 117
    .line 118
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->MAGIC_LINK:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 122
    .line 123
    new-instance v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 124
    .line 125
    const/16 v1, 0xa

    .line 126
    .line 127
    const-string v2, "web3"

    .line 128
    .line 129
    const-string v4, "WEB3"

    .line 130
    .line 131
    invoke-direct {v0, v4, v1, v2}, Lio/github/jan/supabase/auth/jwt/AMRMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->WEB3:Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 135
    .line 136
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$values()[Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$VALUES:[Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 141
    .line 142
    invoke-static {v0}, Lhj8;->t([Ljava/lang/Enum;)Lw52;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$ENTRIES:Lu52;

    .line 147
    .line 148
    new-instance v0, Ls;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->Companion:Ls;

    .line 154
    .line 155
    new-instance v0, Lo;

    .line 156
    .line 157
    invoke-direct {v0, v3}, Lo;-><init>(I)V

    .line 158
    .line 159
    .line 160
    sget-object v1, Li44;->w:Li44;

    .line 161
    .line 162
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$cachedSerializer$delegate:Lnz3;

    .line 167
    .line 168
    return-void
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-void
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
.end method

.method private static final synthetic _init_$_anonymous_()Lzr3;
    .locals 13

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/AMRMethod;->values()[Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v10, "magiclink"

    .line 6
    .line 7
    const-string v11, "web3"

    .line 8
    .line 9
    const-string v1, "password"

    .line 10
    .line 11
    const-string v2, "otp"

    .line 12
    .line 13
    const-string v3, "oauth"

    .line 14
    .line 15
    const-string v4, "totp"

    .line 16
    .line 17
    const-string v5, "mfa/totp"

    .line 18
    .line 19
    const-string v6, "mfa/phone"

    .line 20
    .line 21
    const-string v7, "mfa/webauthn"

    .line 22
    .line 23
    const-string v8, "anonymous"

    .line 24
    .line 25
    const-string v9, "sso/saml"

    .line 26
    .line 27
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    filled-new-array/range {v2 .. v12}, [[Ljava/lang/annotation/Annotation;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "io.github.jan.supabase.auth.jwt.AMRMethod"

    .line 47
    .line 48
    invoke-static {v3, v0, v1, v2}, Lkl8;->i(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La62;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
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
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/AMRMethod;->_init_$_anonymous_()Lzr3;

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
    sget-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$cachedSerializer$delegate:Lnz3;

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
    sget-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$ENTRIES:Lu52;

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

.method public static valueOf(Ljava/lang/String;)Lio/github/jan/supabase/auth/jwt/AMRMethod;
    .locals 1

    .line 1
    const-class v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/jan/supabase/auth/jwt/AMRMethod;

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

.method public static values()[Lio/github/jan/supabase/auth/jwt/AMRMethod;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->$VALUES:[Lio/github/jan/supabase/auth/jwt/AMRMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/jan/supabase/auth/jwt/AMRMethod;

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


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/jwt/AMRMethod;->value:Ljava/lang/String;

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

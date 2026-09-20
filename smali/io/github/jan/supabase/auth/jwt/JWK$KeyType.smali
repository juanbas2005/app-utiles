.class public final enum Lio/github/jan/supabase/auth/jwt/JWK$KeyType;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/jan/supabase/auth/jwt/JWK$KeyType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "io/github/jan/supabase/auth/jwt/JWK$KeyType",
        "",
        "Lio/github/jan/supabase/auth/jwt/JWK$KeyType;",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "vh3",
        "RSA",
        "EC",
        "OCT",
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

.field private static final synthetic $VALUES:[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

.field private static final $cachedSerializer$delegate:Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final Companion:Lvh3;

.field public static final enum EC:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

.field public static final enum OCT:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

.field public static final enum RSA:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;
    .locals 3

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->RSA:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->EC:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 4
    .line 5
    sget-object v2, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->OCT:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

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
    .locals 4

    .line 1
    new-instance v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 2
    .line 3
    const-string v1, "RSA"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->RSA:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 10
    .line 11
    new-instance v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 12
    .line 13
    const-string v1, "EC"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->EC:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 20
    .line 21
    new-instance v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const-string v2, "oct"

    .line 25
    .line 26
    const-string v3, "OCT"

    .line 27
    .line 28
    invoke-direct {v0, v3, v1, v2}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->OCT:Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 32
    .line 33
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$values()[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$VALUES:[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 38
    .line 39
    invoke-static {v0}, Lhj8;->t([Ljava/lang/Enum;)Lw52;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$ENTRIES:Lu52;

    .line 44
    .line 45
    new-instance v0, Lvh3;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->Companion:Lvh3;

    .line 51
    .line 52
    new-instance v0, Lq83;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lq83;-><init>(I)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Li44;->w:Li44;

    .line 60
    .line 61
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$cachedSerializer$delegate:Lnz3;

    .line 66
    .line 67
    return-void
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
    iput-object p3, p0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->value:Ljava/lang/String;

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
    .locals 4

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->values()[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "oct"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    filled-new-array {v2, v2, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    filled-new-array {v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "io.github.jan.supabase.auth.jwt.JWK.KeyType"

    .line 17
    .line 18
    invoke-static {v3, v0, v1, v2}, Lkl8;->i(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La62;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
.end method

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->_init_$_anonymous_()Lzr3;

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
    sget-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$cachedSerializer$delegate:Lnz3;

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
    sget-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$ENTRIES:Lu52;

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

.method public static valueOf(Ljava/lang/String;)Lio/github/jan/supabase/auth/jwt/JWK$KeyType;
    .locals 1

    .line 1
    const-class v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

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

.method public static values()[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->$VALUES:[Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/jan/supabase/auth/jwt/JWK$KeyType;

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
    iget-object p0, p0, Lio/github/jan/supabase/auth/jwt/JWK$KeyType;->value:Ljava/lang/String;

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

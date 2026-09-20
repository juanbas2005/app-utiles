.class public abstract Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0015\u0008\u0004\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0003\u0010\u0014\u0012\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0005\u0082\u0001\u0003\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "io/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config",
        "",
        "",
        "captchaToken",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "seen0",
        "Lrl6;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lrl6;)V",
        "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;",
        "self",
        "Lhy0;",
        "output",
        "Lll6;",
        "serialDesc",
        "Lvs7;",
        "write$Self",
        "(Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;Lhy0;Lll6;)V",
        "Ljava/lang/String;",
        "getCaptchaToken",
        "()Ljava/lang/String;",
        "setCaptchaToken",
        "getCaptchaToken$annotations",
        "()V",
        "Companion",
        "cl1",
        "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;",
        "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;",
        "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;",
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
.field private static final $cachedSerializer$delegate:Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final Companion:Lcl1;


# instance fields
.field private captchaToken:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcl1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->Companion:Lcl1;

    .line 7
    .line 8
    new-instance v0, Lnf1;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, v1}, Lnf1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Li44;->w:Li44;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->$cachedSerializer$delegate:Lnz3;

    .line 21
    .line 22
    return-void
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

.method public synthetic constructor <init>(ILjava/lang/String;Lrl6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object p2, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    .line 13
    .line 14
    return-void
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

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILhl1;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p1, p3

    .line 18
    :cond_0
    invoke-direct {p0, p1, p3}, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;-><init>(Ljava/lang/String;Lhl1;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lhl1;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static final _init_$_anonymous_()Lzr3;
    .locals 8

    .line 1
    new-instance v0, Lci6;

    .line 2
    .line 3
    sget-object v1, Lb26;->a:Lc26;

    .line 4
    .line 5
    const-class v2, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-class v3, Lio/github/jan/supabase/auth/providers/builtin/Email$Config;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-class v4, Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-class v5, Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;

    .line 24
    .line 25
    invoke-virtual {v1, v5}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v5, 0x3

    .line 30
    new-array v6, v5, [Lgq3;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    aput-object v3, v6, v7

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    aput-object v4, v6, v3

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    aput-object v1, v6, v4

    .line 40
    .line 41
    new-array v1, v5, [Lzr3;

    .line 42
    .line 43
    sget-object v5, Lp22;->a:Lp22;

    .line 44
    .line 45
    aput-object v5, v1, v7

    .line 46
    .line 47
    sget-object v5, Lk73;->a:Lk73;

    .line 48
    .line 49
    aput-object v5, v1, v3

    .line 50
    .line 51
    sget-object v3, Log5;->a:Log5;

    .line 52
    .line 53
    aput-object v3, v1, v4

    .line 54
    .line 55
    new-array v3, v7, [Ljava/lang/annotation/Annotation;

    .line 56
    .line 57
    const-string v4, "io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider.Config"

    .line 58
    .line 59
    invoke-direct {v0, v4, v2, v6, v1}, Lci6;-><init>(Ljava/lang/String;Lgq3;[Lgq3;[Lzr3;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lci6;->b:Ljava/util/List;

    .line 70
    .line 71
    return-object v0
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

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->_init_$_anonymous_()Lzr3;

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
    sget-object v0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->$cachedSerializer$delegate:Lnz3;

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

.method public static synthetic getCaptchaToken$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lxk0;
    .end annotation

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

.method public static final synthetic write$Self(Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;Lhy0;Lll6;)V
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    sget-object v0, Lxk0;->a:Lxk0;

    .line 13
    .line 14
    iget-object p0, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {p1, p2, v1, v0, p0}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
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


# virtual methods
.method public final getCaptchaToken()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

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

.method public final setCaptchaToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->captchaToken:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

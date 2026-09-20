.class public final enum Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "io/github/jan/supabase/auth/providers/builtin/Phone$Channel",
        "",
        "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "ng5",
        "SMS",
        "WHATSAPP",
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
    with = Lng5;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lu52;

.field private static final synthetic $VALUES:[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

.field public static final Companion:Lng5;

.field public static final enum SMS:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

.field public static final enum WHATSAPP:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

.field private static final descriptor:Lll6;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;
    .locals 2

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->SMS:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 2
    .line 3
    sget-object v1, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->WHATSAPP:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

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

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "sms"

    .line 5
    .line 6
    const-string v3, "SMS"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->SMS:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 12
    .line 13
    new-instance v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "whatsapp"

    .line 17
    .line 18
    const-string v3, "WHATSAPP"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->WHATSAPP:Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 24
    .line 25
    invoke-static {}, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->$values()[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->$VALUES:[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 30
    .line 31
    invoke-static {v0}, Lhj8;->t([Ljava/lang/Enum;)Lw52;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->$ENTRIES:Lu52;

    .line 36
    .line 37
    new-instance v0, Lng5;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->Companion:Lng5;

    .line 43
    .line 44
    const-string v0, "Channel"

    .line 45
    .line 46
    invoke-static {v0}, Lb85;->b(Ljava/lang/String;)Lpo5;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->descriptor:Lll6;

    .line 51
    .line 52
    return-void
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
    iput-object p3, p0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->value:Ljava/lang/String;

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

.method public static final synthetic access$getDescriptor$cp()Lll6;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->descriptor:Lll6;

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
    sget-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->$ENTRIES:Lu52;

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

.method public static valueOf(Ljava/lang/String;)Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;
    .locals 1

    .line 1
    const-class v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

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

.method public static values()[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->$VALUES:[Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;

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
    iget-object p0, p0, Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;->value:Ljava/lang/String;

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

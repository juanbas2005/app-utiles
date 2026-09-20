.class public final Lzm1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Ltd0;

.field public static final c:Lau;


# instance fields
.field public final a:Lvr2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltd0;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltd0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lzm1;->b:Ltd0;

    .line 9
    .line 10
    sget-object v0, Lb26;->a:Lc26;

    .line 11
    .line 12
    const-class v1, Lzm1;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    new-instance v2, Lfp7;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lau;

    .line 30
    .line 31
    const-string v1, "DefaultRequest"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lzm1;->c:Lau;

    .line 37
    .line 38
    return-void
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

.method public constructor <init>(Lvr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzm1;->a:Lvr2;

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
.end method

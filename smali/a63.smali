.class public abstract La63;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lau;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lb26;->a:Lc26;

    .line 2
    .line 3
    const-class v1, Lb66;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, Lfp7;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lau;

    .line 21
    .line 22
    const-string v1, "ResponseAdapterAttributeKey"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La63;->a:Lau;

    .line 28
    .line 29
    return-void
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

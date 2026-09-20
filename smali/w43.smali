.class public abstract Lw43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lk81;

.field public static final b:Lau;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lk81;

    .line 2
    .line 3
    const-string v1, "call-context"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk81;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw43;->a:Lk81;

    .line 9
    .line 10
    sget-object v0, Lb26;->a:Lc26;

    .line 11
    .line 12
    const-class v1, Ln43;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    sget-object v2, Lgs3;->c:Lgs3;

    .line 19
    .line 20
    invoke-static {v1, v2}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    new-instance v2, Lfp7;

    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lau;

    .line 32
    .line 33
    const-string v1, "client-config"

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lw43;->b:Lau;

    .line 39
    .line 40
    return-void
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

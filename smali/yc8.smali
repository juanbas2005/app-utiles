.class public final Lyc8;
.super Landroid/os/Binder;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:Lwv2;


# direct methods
.method public constructor <init>(Lwv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyc8;->d:Lwv2;

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


# virtual methods
.method public final a(Lzc8;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    const-string v1, "FirebaseMessaging"

    .line 13
    .line 14
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string v0, "service received new intent via bind strategy"

    .line 21
    .line 22
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p1, Lzc8;->a:Landroid/content/Intent;

    .line 26
    .line 27
    iget-object p0, p0, Lyc8;->d:Lwv2;

    .line 28
    .line 29
    iget-object p0, p0, Lwv2;->x:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 32
    .line 33
    new-instance v1, Lxb7;

    .line 34
    .line 35
    invoke-direct {v1}, Lxb7;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->w:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    new-instance v3, Lti;

    .line 41
    .line 42
    const/4 v4, 0x6

    .line 43
    invoke-direct {v3, p0, v0, v1, v4}, Lti;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lor;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-direct {p0, v0}, Lor;-><init>(I)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lc9;

    .line 56
    .line 57
    const/16 v2, 0x16

    .line 58
    .line 59
    invoke-direct {v0, v2, p1}, Lc9;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v1, Lxb7;->a:Lyb9;

    .line 63
    .line 64
    invoke-virtual {p1, p0, v0}, Lyb9;->c(Ljava/util/concurrent/Executor;Ly45;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/SecurityException;

    .line 69
    .line 70
    const-string p1, "Binding only allowed within app"

    .line 71
    .line 72
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0
    .line 76
.end method

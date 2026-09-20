.class public final Lmv2;
.super Lsb1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final c:Landroid/content/Context;

.field public d:Llb1;

.field public e:Ljava/util/concurrent/Executor;

.field public f:Landroid/os/CancellationSignal;

.field public final g:Lqb1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmv2;->c:Landroid/content/Context;

    .line 8
    .line 9
    new-instance p1, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lqb1;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p0, p1, v1}, Lqb1;-><init>(Lsb1;Landroid/os/Handler;I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lmv2;->g:Lqb1;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

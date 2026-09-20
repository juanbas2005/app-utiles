.class public final Lgp5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lt54;


# static fields
.field public static final E:Lgp5;


# instance fields
.field public A:Landroid/os/Handler;

.field public final B:Lw54;

.field public final C:Ly0;

.field public final D:Lwv2;

.field public w:I

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lgp5;

    .line 2
    .line 3
    invoke-direct {v0}, Lgp5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgp5;->E:Lgp5;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lgp5;->y:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lgp5;->z:Z

    .line 8
    .line 9
    new-instance v1, Lw54;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lw54;-><init>(Lt54;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lgp5;->B:Lw54;

    .line 15
    .line 16
    new-instance v0, Ly0;

    .line 17
    .line 18
    const/16 v1, 0x13

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Ly0;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lgp5;->C:Ly0;

    .line 24
    .line 25
    new-instance v0, Lwv2;

    .line 26
    .line 27
    const/16 v1, 0x1c

    .line 28
    .line 29
    invoke-direct {v0, v1, p0}, Lwv2;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lgp5;->D:Lwv2;

    .line 33
    .line 34
    return-void
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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Lgp5;->x:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lgp5;->x:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lgp5;->y:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lgp5;->B:Lw54;

    .line 14
    .line 15
    sget-object v1, Lj54;->ON_RESUME:Lj54;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lw54;->f1(Lj54;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lgp5;->y:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lgp5;->A:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lgp5;->C:Ly0;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
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

.method public final k()Lin8;
    .locals 0

    .line 1
    iget-object p0, p0, Lgp5;->B:Lw54;

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

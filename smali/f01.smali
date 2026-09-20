.class public final Lf01;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Ldn1;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lz53;

.field public final e:Ltd0;

.field public final f:Lxb4;

.field public final g:Lns8;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Ltd0;


# direct methods
.method public constructor <init>(Lme6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lbb0;->S(Z)Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lf01;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    sget-object p1, Law1;->a:Ldn1;

    .line 12
    .line 13
    iput-object p1, p0, Lf01;->b:Ldn1;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p1}, Lbb0;->S(Z)Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lf01;->c:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    new-instance v0, Lz53;

    .line 23
    .line 24
    const/16 v1, 0xb

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lz53;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lf01;->d:Lz53;

    .line 30
    .line 31
    sget-object v0, Ltd0;->A:Ltd0;

    .line 32
    .line 33
    iput-object v0, p0, Lf01;->e:Ltd0;

    .line 34
    .line 35
    sget-object v0, Lxb4;->V:Lxb4;

    .line 36
    .line 37
    iput-object v0, p0, Lf01;->f:Lxb4;

    .line 38
    .line 39
    new-instance v0, Lns8;

    .line 40
    .line 41
    const/16 v1, 0x11

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lns8;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lf01;->g:Lns8;

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    iput v0, p0, Lf01;->h:I

    .line 50
    .line 51
    const v0, 0x7fffffff

    .line 52
    .line 53
    .line 54
    iput v0, p0, Lf01;->i:I

    .line 55
    .line 56
    const/16 v0, 0x14

    .line 57
    .line 58
    iput v0, p0, Lf01;->k:I

    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    iput v0, p0, Lf01;->j:I

    .line 63
    .line 64
    iput-boolean p1, p0, Lf01;->l:Z

    .line 65
    .line 66
    new-instance p1, Ltd0;

    .line 67
    .line 68
    const/16 v0, 0x18

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ltd0;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lf01;->m:Ltd0;

    .line 74
    .line 75
    return-void
    .line 76
.end method

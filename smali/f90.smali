.class public Lf90;
.super Lr58;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public b:Ljava/util/concurrent/Executor;

.field public c:Lx91;

.field public d:Lqc3;

.field public e:Lqc3;

.field public f:Lf96;

.field public g:Le90;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Lbp4;

.field public q:Lbp4;

.field public r:Lbp4;

.field public s:Lbp4;

.field public t:Lbp4;

.field public u:Z

.field public v:Lbp4;

.field public w:Lbp4;

.field public x:Lbp4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr58;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lf90;->i:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lf90;->u:Z

    .line 9
    .line 10
    return-void
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

.method public static h(Lbp4;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lbp4;->i(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lbp4;->g(Ljava/lang/Object;)V

    .line 20
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
.end method


# virtual methods
.method public final e()I
    .locals 0

    .line 1
    iget-object p0, p0, Lf90;->d:Lqc3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p0, 0x80ff

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public final f(Lo80;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf90;->q:Lbp4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbp4;

    .line 6
    .line 7
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf90;->q:Lbp4;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lf90;->q:Lbp4;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final g(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf90;->t:Lbp4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbp4;

    .line 6
    .line 7
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf90;->t:Lbp4;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lf90;->t:Lbp4;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

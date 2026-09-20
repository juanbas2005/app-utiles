.class public final Lmk;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgk;


# instance fields
.field public final a:Lmm7;

.field public b:Ljb;

.field public final c:Led5;

.field public final d:Ltp4;


# direct methods
.method public constructor <init>(Lmm7;Ljb;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmk;->a:Lmm7;

    .line 5
    .line 6
    iput-object p2, p0, Lmk;->b:Ljb;

    .line 7
    .line 8
    new-instance p1, Lwe3;

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Lwe3;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lmk;->c:Led5;

    .line 20
    .line 21
    sget-object p1, Lbg6;->a:[J

    .line 22
    .line 23
    new-instance p1, Ltp4;

    .line 24
    .line 25
    invoke-direct {p1}, Ltp4;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lmk;->d:Ltp4;

    .line 29
    .line 30
    return-void
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
.method public final a(Lk51;Lbv6;)Lk51;
    .locals 0

    .line 1
    iput-object p2, p1, Lk51;->d:Lbv6;

    .line 2
    .line 3
    return-object p1
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

.method public final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lmk;->a:Lmm7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmm7;->f()Lgm7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lgm7;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public final d()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lmk;->a:Lmm7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmm7;->f()Lgm7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lgm7;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

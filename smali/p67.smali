.class public final Lp67;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ls67;

.field public b:Liz3;

.field public final c:Lo67;

.field public final d:Lo67;

.field public final e:Lo67;


# direct methods
.method public constructor <init>(Ls67;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp67;->a:Ls67;

    .line 5
    .line 6
    new-instance p1, Lo67;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, p0, v0}, Lo67;-><init>(Lp67;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lp67;->c:Lo67;

    .line 13
    .line 14
    new-instance p1, Lo67;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, p0, v0}, Lo67;-><init>(Lp67;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lp67;->d:Lo67;

    .line 21
    .line 22
    new-instance p1, Lo67;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, Lo67;-><init>(Lp67;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lp67;->e:Lo67;

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
.end method


# virtual methods
.method public final a()Liz3;
    .locals 0

    .line 1
    iget-object p0, p0, Lp67;->b:Liz3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
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

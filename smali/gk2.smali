.class public final Lgk2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Llk2;

.field public final b:Lje;

.field public final c:Lup4;

.field public final d:Lup4;

.field public e:Z


# direct methods
.method public constructor <init>(Llk2;Lje;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgk2;->a:Llk2;

    .line 5
    .line 6
    iput-object p2, p0, Lgk2;->b:Lje;

    .line 7
    .line 8
    sget-object p1, Lcg6;->a:Lup4;

    .line 9
    .line 10
    new-instance p1, Lup4;

    .line 11
    .line 12
    invoke-direct {p1}, Lup4;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lgk2;->c:Lup4;

    .line 16
    .line 17
    new-instance p1, Lup4;

    .line 18
    .line 19
    invoke-direct {p1}, Lup4;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lgk2;->d:Lup4;

    .line 23
    .line 24
    return-void
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
.method public final a()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lgk2;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Lyd;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/16 v9, 0x9

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-class v4, Lgk2;

    .line 12
    .line 13
    const-string v5, "invalidateNodes"

    .line 14
    .line 15
    const-string v6, "invalidateNodes()V"

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v9}, Lyd;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 20
    .line 21
    .line 22
    iget-object p0, v3, Lgk2;->b:Lje;

    .line 23
    .line 24
    iget-object p0, p0, Lje;->J0:Llp4;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Llp4;->g(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0, v1}, Llp4;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x1

    .line 37
    iput-boolean p0, v3, Lgk2;->e:Z

    .line 38
    .line 39
    :cond_1
    return-void
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

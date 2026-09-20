.class public final Lw36;
.super Lc1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Li81;


# instance fields
.field public final synthetic x:Lny0;

.field public final synthetic y:Lx36;


# direct methods
.method public constructor <init>(Lny0;Lx36;)V
    .locals 1

    .line 1
    sget-object v0, Ld63;->z:Ld63;

    .line 2
    .line 3
    iput-object p1, p0, Lw36;->x:Lny0;

    .line 4
    .line 5
    iput-object p2, p0, Lw36;->y:Lx36;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lc1;-><init>(Ld81;)V

    .line 8
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


# virtual methods
.method public final B(Le81;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lf5;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    iget-object v2, p0, Lw36;->x:Lny0;

    .line 6
    .line 7
    iget-object p0, p0, Lw36;->y:Lx36;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Ltf4;->S(Ljava/lang/Throwable;Lsr2;)Z

    .line 13
    .line 14
    .line 15
    sget-object v0, Ld63;->z:Ld63;

    .line 16
    .line 17
    iget-object p0, p0, Lx36;->w:Le81;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Le81;->a0(Ld81;)Lc81;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Li81;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Li81;->B(Le81;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    throw p2
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

.class public final Lek7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lmq4;

.field public final b:Ldq4;

.field public c:Lkk0;


# direct methods
.method public constructor <init>(Lmq4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lek7;->a:Lmq4;

    .line 5
    .line 6
    new-instance p1, Ldq4;

    .line 7
    .line 8
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ldq4;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lek7;->b:Ldq4;

    .line 14
    .line 15
    return-void
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
.method public final a()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object p0, p0, Lek7;->b:Ldq4;

    .line 4
    .line 5
    iget-object p0, p0, Ldq4;->y:Led5;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Led5;->setValue(Ljava/lang/Object;)V

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
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lek7;->b:Ldq4;

    .line 2
    .line 3
    iget-object v0, p0, Ldq4;->x:Led5;

    .line 4
    .line 5
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Ldq4;->y:Led5;

    .line 18
    .line 19
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
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

.method public final c(Lhq4;La97;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v3, Lne1;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v4, 0x0

    .line 5
    invoke-direct {v3, p0, v4, v0}, Lne1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lzc;

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    invoke-direct/range {v0 .. v5}, Lzc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, v1, Lek7;->a:Lmq4;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p1, Lp6;

    .line 22
    .line 23
    invoke-direct {p1, v2, p0, v0, v4}, Lp6;-><init>(Lhq4;Lmq4;Lvr2;Lf61;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Lp81;->w:Lp81;

    .line 31
    .line 32
    if-ne p0, p1, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 36
    .line 37
    return-object p0
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

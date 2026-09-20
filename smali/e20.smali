.class public final Le20;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public K:Lph7;

.field public final synthetic L:Lf20;


# direct methods
.method public constructor <init>(Lf20;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le20;->L:Lf20;

    .line 2
    .line 3
    invoke-direct {p0}, Lll4;-><init>()V

    .line 4
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
.method public final N0()V
    .locals 8

    .line 1
    iget-object v0, p0, Le20;->L:Lf20;

    .line 2
    .line 3
    iput-object p0, v0, Lf20;->w:Le20;

    .line 4
    .line 5
    iget-object v1, v0, Lf20;->x:Lxu0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v7, Lm0;

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    invoke-direct {v7, v1, p0, v0}, Lm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-static/range {v2 .. v7}, Lf55;->r(Lll4;JJLvr2;)Lph7;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iput-object p0, v2, Le20;->K:Lph7;

    .line 25
    .line 26
    :cond_0
    return-void
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

.method public final O0()V
    .locals 3

    .line 1
    iget-object v0, p0, Le20;->L:Lf20;

    .line 2
    .line 3
    iget-object v1, v0, Lf20;->w:Le20;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, Lf20;->w:Le20;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Le20;->K:Lph7;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lph7;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, Le20;->K:Lph7;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

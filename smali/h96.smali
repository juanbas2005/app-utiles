.class public final Lh96;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final w:Ljava/util/Stack;

.field public x:Lb94;


# direct methods
.method public constructor <init>(Lbg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Stack;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh96;->w:Ljava/util/Stack;

    .line 10
    .line 11
    :goto_0
    instance-of v0, p1, Lj96;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lj96;

    .line 16
    .line 17
    iget-object v0, p0, Lh96;->w:Ljava/util/Stack;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lj96;->y:Lbg0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    check-cast p1, Lb94;

    .line 26
    .line 27
    iput-object p1, p0, Lh96;->x:Lb94;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lb94;
    .locals 5

    .line 1
    iget-object v0, p0, Lh96;->x:Lb94;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    :goto_0
    iget-object v2, p0, Lh96;->w:Ljava/util/Stack;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lj96;

    .line 20
    .line 21
    iget-object v3, v3, Lj96;->z:Lbg0;

    .line 22
    .line 23
    :goto_1
    instance-of v4, v3, Lj96;

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    check-cast v3, Lj96;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object v3, v3, Lj96;->y:Lbg0;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    check-cast v3, Lb94;

    .line 36
    .line 37
    iget-object v2, v3, Lb94;->x:[B

    .line 38
    .line 39
    array-length v2, v2

    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v1, v3

    .line 44
    :goto_2
    iput-object v1, p0, Lh96;->x:Lb94;

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-static {}, Lrf2;->c()V

    .line 48
    .line 49
    .line 50
    return-object v1
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

.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lh96;->x:Lb94;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh96;->a()Lb94;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
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

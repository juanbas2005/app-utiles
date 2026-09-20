.class public final Lcom/google/protobuf/e;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Log6;


# instance fields
.field public final a:Lcom/google/protobuf/a;

.field public final b:Lcom/google/protobuf/g;

.field public final c:Laa2;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/g;Laa2;Lcom/google/protobuf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/protobuf/e;->c:Laa2;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/protobuf/e;->a:Lcom/google/protobuf/a;

    .line 12
    .line 13
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/f;->j(Lcom/google/protobuf/g;Ljava/lang/Object;Ljava/lang/Object;)V

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

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 2
    .line 3
    check-cast v0, Lys7;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lcom/google/protobuf/b;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/protobuf/b;->unknownFields:Lcom/google/protobuf/h;

    .line 12
    .line 13
    iget-boolean v1, v0, Lcom/google/protobuf/h;->e:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lcom/google/protobuf/h;->e:Z

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/e;->c:Laa2;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lf21;->u(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->c:Laa2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lf21;->u(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    throw p0
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

.method public final d()Lcom/google/protobuf/b;
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->a:Lcom/google/protobuf/a;

    .line 2
    .line 3
    instance-of v0, p0, Lcom/google/protobuf/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/google/protobuf/b;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-virtual {p0, v0}, Lcom/google/protobuf/b;->k(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/google/protobuf/b;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    check-cast p0, Lcom/google/protobuf/b;

    .line 18
    .line 19
    const/4 v0, 0x5

    .line 20
    invoke-virtual {p0, v0}, Lcom/google/protobuf/b;->k(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lqu2;

    .line 25
    .line 26
    iget-object v0, p0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/protobuf/b;->n()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v0, Lau5;->c:Lau5;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, v2}, Lau5;->a(Ljava/lang/Class;)Log6;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0, v1}, Log6;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/protobuf/b;->o()V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 60
    .line 61
    return-object p0
    .line 62
    .line 63
.end method

.method public final e(Lcom/google/protobuf/b;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 2
    .line 3
    check-cast p0, Lys7;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p1, Lcom/google/protobuf/b;->unknownFields:Lcom/google/protobuf/h;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/h;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
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

.method public final f(Lcom/google/protobuf/b;)I
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 2
    .line 3
    check-cast p0, Lys7;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p1, Lcom/google/protobuf/b;->unknownFields:Lcom/google/protobuf/h;

    .line 9
    .line 10
    iget p1, p0, Lcom/google/protobuf/h;->d:I

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    move v0, p1

    .line 18
    :goto_0
    iget v1, p0, Lcom/google/protobuf/h;->a:I

    .line 19
    .line 20
    if-ge p1, v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/protobuf/h;->b:[I

    .line 23
    .line 24
    aget v1, v1, p1

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    ushr-int/2addr v1, v2

    .line 28
    iget-object v3, p0, Lcom/google/protobuf/h;->c:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v3, v3, p1

    .line 31
    .line 32
    check-cast v3, Lyf0;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-static {v4}, Lvs0;->c(I)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/4 v5, 0x2

    .line 40
    mul-int/2addr v4, v5

    .line 41
    invoke-static {v5}, Lvs0;->c(I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-static {v1}, Lvs0;->d(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v1, v5

    .line 50
    add-int/2addr v1, v4

    .line 51
    invoke-static {v2}, Lvs0;->c(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v3}, Lyf0;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v3}, Lvs0;->d(I)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/2addr v4, v3

    .line 64
    add-int/2addr v4, v2

    .line 65
    add-int/2addr v4, v1

    .line 66
    add-int/2addr v0, v4

    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iput v0, p0, Lcom/google/protobuf/h;->d:I

    .line 71
    .line 72
    return v0
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final g(Lcom/google/protobuf/b;Lcom/google/protobuf/b;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->b:Lcom/google/protobuf/g;

    .line 2
    .line 3
    check-cast p0, Lys7;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/protobuf/b;->unknownFields:Lcom/google/protobuf/h;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p2, Lcom/google/protobuf/b;->unknownFields:Lcom/google/protobuf/h;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lcom/google/protobuf/h;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x1

    .line 24
    return p0
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

.method public final h(Ljava/lang/Object;Lwv2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/e;->c:Laa2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lf21;->u(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    throw p0
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
